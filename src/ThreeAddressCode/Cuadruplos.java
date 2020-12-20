/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreeAddressCode;

import ComprobacionDeTipos.TypesSubTable;

/**
 *
 * @author Julio Marin
 */
public class Cuadruplos {
    private Operacion operacion;
    private String parametroA;
    private String parametroB;
    private String resultado;
    private int offset;
    private String type;

    public Cuadruplos(Operacion operacion, String parametroA, String parametroB, String resultado) {
        this.operacion = operacion;
        this.parametroA = parametroA;
        this.parametroB = parametroB;
        this.resultado = resultado;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public String getParametroA() {
        return parametroA;
    }

    public String getParametroB() {
        return parametroB;
    }

    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "("+this.operacion+", "+this.parametroA+", "+this.parametroB+", "+this.resultado+")";
    }
        
}
