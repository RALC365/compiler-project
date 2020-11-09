/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComprobacionDeTipos;

import java.util.HashMap;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Usuario
 */
public class TypesSubTable {

    private final Object treepart;//actual
    private final DefaultTreeModel model;
    private final String functionName;
    private final String functionType;
    private final HashMap<String, TableRow> ids = new HashMap();//Tabla de sibolos
    private final TypesSubTable parent;
    private final HashMap<String, TypesSubTable> children = new HashMap();//Arbol de Simbolos

    public TypesSubTable(String functionName, String functionType, DefaultTreeModel model, Object treepart, TypesSubTable parent) {
        this.functionName = functionName;
        this.functionType = functionType;
        this.treepart = treepart;
        this.model = model;
        this.parent = parent;
        copyIDs();
        getDeclarations(treepart);
        System.out.println(this.toString());
    }

    //De esta manera al momento de añadir IDs sólo se evalúa una tabla de IDs.
    private void copyIDs() {
        if (parent != null) {
            for (String i : parent.ids.keySet()) {
                ids.put(i, parent.ids.get(i));
            }
        }
    }

    private boolean addIDToSubTable(TableRow t) {//?
        if (ids.containsKey(t.id)) {
            return false;
        }
        ids.put(t.id, t);
        return true;
    }
    //Agregar Declaraciones a las subtabla y creacion de más subtablas
    //Para la creación del ámbito

    private void getDeclarations(Object a) {
        int cc = model.getChildCount(a);

        //Agregan el ID del FOR a su tabla de IDs
        if (a.toString().equals("FOR")) {
            String for_txt[] = model.getChild(a, 0).toString().split(",");
            TableRow row = new TableRow(for_txt[0], "int", Integer.parseInt(for_txt[1]));
            addIDToSubTable(row);
        }

        //Recoree los Hijo del nodo Actual 
        for (int i = 0; i < cc; i++) {
            Object o = model.getChild(a, i);

            //FOR
            if (o.toString().equals("FOR")) {
                TypesSubTable st = new TypesSubTable("FOR", "nll", model, o, this);
                this.children.put("FOR", st);
            }

            //WHILE
            if (o.toString().equals("WHILE")) {
                TypesSubTable st = new TypesSubTable("WHILE", "nll", model, o, this);
                this.children.put("WHILE", st);
            }

            //Al ser estas declaraciones sin valores, no necesita ver si el valor 
            //es del mismo tipo de la variable
            if (o.toString().equals("DECLR NEST/NO_VAL")) {
                TableRow row = new TableRow(model.getChild(o, 1).toString(), model.getChild(o, 0).toString(), "nll");
                addIDToSubTable(row);
                int ccc = model.getChildCount(o);
                if (ccc > 2) {
                    for (int j = 2; j < ccc; j++) {
                        row = new TableRow(model.getChild(o, j).toString(), model.getChild(o, 0).toString(), "nll");
                        addIDToSubTable(row);
                    }
                }
            }

            //Declaraciones con Valor (Y análisis de Tipo)
            if (o.toString().equals("DECLR")) {
                String id = model.getChild(o, 1).toString();
                String type = model.getChild(o, 0).toString();
                String val = model.getChild(o, 2).toString();
                checkDeclr(id, type, val, o);
            }
            
            //Declaraciones de Matrices
            if (o.toString().equals("DECLR MATRIX")) {
                //Asume que aprobó la evaluación sintáctica y el token es: ELEMENTS
                TableRow arrayRow = new TableRow(model.getChild(o, 2).toString(), model.getChild(o, 1).toString(), null);
                buildMatrixArray(
                        arrayRow,
                        model.getChild(o, 3),
                        true);
                addIDToSubTable(arrayRow);
            }
            
            //Declaraciones de Arreglos
            if (o.toString().equals("DECLR ARRAY")) {
                //Asume que aprobó la evaluación sintáctica y el token es: ELEMENTS
                TableRow arrayRow = new TableRow(model.getChild(o, 2).toString(), model.getChild(o, 1).toString(), null);
                buildMatrixArray(
                        arrayRow,
                        model.getChild(o, 3),
                        false);
                addIDToSubTable(arrayRow);
            }

            //Asignaciones
            if (o.toString().equals("ASSIGN")) {
                String id = model.getChild(o, 0).toString();
                String value = model.getChild(o, 1).toString();
                checkAssing(id, value, o);
            }
        }
    }

    //Solo para ver si un String es numérico
    //Dependiendo del signo
    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    //Arreglo: false, Matriz: true
    private String[] buildMatrixArray(TableRow arrayRow, Object elements, boolean level) {
        System.out.println("K");
        int cc = model.getChildCount(elements);
        String[] acumulative = new String[cc];
        String[][] overAcumulative = (level) ? new String[cc][] : null;
        System.out.println("P");
        for (int i = 0; i < cc; i++) {
            System.out.println("T");
            System.out.println(i);
            if (acumulative != null) {
                System.out.println("N");
                Object subElement = model.getChild(elements, i);
                System.out.println(arrayRow.type+ " : "+subElement.toString());
                if (subElement.toString().equals("ELEMENTS")) {
                    if (!level) {
                        System.out.println("Imposible de construir: Tipo esperado 'arr', tipo recibido: 'mtx'.");
                        return null;
                    }
                    acumulative = buildMatrixArray(arrayRow, subElement, false);
                    overAcumulative[i] = acumulative;
                } else {
                    if ((level)||(!checkValue(arrayRow.type, subElement.toString()))) {
                      return null;
                    }
                    System.out.println("JODA");
                    System.out.println(subElement.toString());
                    acumulative[i] = subElement.toString();
                    System.out.println("After JODA");
                    System.out.println(acumulative[i]);
                }
            }
        }
        System.out.println("Evil");
        if (acumulative != null) {
            System.out.println("Culiacan");
            for (int i = 0; i < acumulative.length; i++) {
                System.out.println(acumulative[i]);
            }
            arrayRow.setValue((overAcumulative != null) ? overAcumulative: acumulative);
        }
        return acumulative;
    }

    //Vesmos si la declaración es correcta
    private boolean checkDeclr(String id, String type, String val, Object o) {
        TableRow row;
        //Ver si es bool y su valor es false o true
        if (type.equals("bln") && (val.equals("false") || val.equals("true"))) {
            row = new TableRow(id, type, val);
            addIDToSubTable(row);
            return true;
        } else if (type.equals("chr")) {
            row = new TableRow(id, type, val.charAt(1));
            addIDToSubTable(row);
            return true;
        } else if (type.equals("int")) {
            if (model.getChild(o, 2).toString().equals("+") || model.getChild(o, 2).toString().equals("-")
                    || model.getChild(o, 2).toString().equals("*") || model.getChild(o, 2).toString().equals("/")
                    || model.getChild(o, 2).toString().equals("%")) {

                //analizar el tipo de la expresion
                val += model.getChild(model.getChild(o, 2), 0);
            }
            if (isNumeric(val)) {
                row = new TableRow(id, type, Integer.parseInt(val));
                addIDToSubTable(row);
                return true;
            } else {
                //Error de Tipo
                System.out.println("Error de Tipo. El tipo de la variable: " + id + " y el valor: " + val + "son incompatibles.");
                return false;
            }
        } else {
            //Error de Tipo
            System.out.println("Error de Tipo. El tipo de la variable: " + id + " y el valor: " + val + "son incompatibles.");
            return false;
        }
    }

    //Vemos si la asignación es correcta
    private boolean checkAssing(String id, String value, Object o) {
        //Verificamos el tipo del ID y el tipo del Value
        if (ids.containsKey(id)) {
            TableRow var = ids.get(id);
            String var2Type;

            if (isNumeric(value)) {
                var2Type = "int";
            } else if (value.contains(":fun")) {//x
                //Verificar el tipo de la función
                var2Type = "nll";
            } else if (value.equals("false") || value.equals("true")) {//x
                var2Type = "bln";
            } else if (value.contains("'") || (value.contains("‘") && value.contains("’"))) {
                var2Type = "chr";
            } else if (value.equals("+") || value.equals("-")
                    || value.equals("*") || value.equals("/")
                    || value.equals("%")) {
                //corroborar el tipo de las operaciones
                var2Type = "int";
            } else if (value.equals("nll")) {
                var2Type = "nll";
            } else if (ids.containsKey(value)) {
                var2Type = ids.get(value).type;
            } else {
                System.out.println("No se reconoce el conjunto de simbolos: " + value);
                return false;
            }
            if (var.type.equals(var2Type)) {
                return true;
            } else {
                System.out.println("Error de Tipo. La variable " + id + " y el valor " + var2Type
                        + " no son compatibles");
                return false;
            }
        } else {
            System.out.println("La variable " + id + " no ha sido declarada.");
            return false;
        }
    }
    
    private boolean checkValue(String declaredValue, String currentValue) {
        String typeValue = "";
        if (currentValue.contains("'") || (currentValue.contains("‘") && currentValue.contains("’"))) {
            if (currentValue.length() < 2) {
                typeValue = "chr";
            }
        }
        if (isNumeric(currentValue)) {
            typeValue = "int";
        }
        if (currentValue.equals("false") || currentValue.equals("true")) {
            typeValue = "bln";
        }
        if (declaredValue.equals(typeValue)) {
            return true;
        }
        System.out.println("El valor " + currentValue + " no corresponde al Tipo: "+declaredValue+".");
        return false;
    }

    @Override
    public String toString() {
        String t = "function: " + functionName + "\n";
        for (String i : ids.keySet()) {
            t += ids.get(i).toString() + "\n";
        }
        return t;
    }

}