/* The following code was generated by JFlex 1.4.3 on 12-18-20 05:44 PM */

package CUP;
//Clase numeracion donde incluiremos los numeros de todos los tokens
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12-18-20 05:44 PM from the specification file
 * <tt>./src/CUP/LexerCup.flex</tt>
 */
public class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\25\1\32\1\31\1\0\1\32\1\30\16\25\4\0\1\32\1\0"+
    "\1\23\1\0\1\55\1\47\1\0\1\24\1\4\1\3\1\46\1\45"+
    "\1\6\1\40\1\5\1\46\1\56\11\57\1\2\1\0\1\44\1\43"+
    "\1\41\2\0\32\55\1\7\1\11\1\10\1\0\1\55\1\0\1\21"+
    "\1\51\1\52\1\50\1\17\1\20\1\55\1\36\1\33\2\55\1\12"+
    "\1\42\1\13\1\37\1\34\1\55\1\15\1\22\1\14\1\16\1\54"+
    "\1\35\1\53\2\55\1\0\1\1\2\0\41\25\2\0\4\55\4\0"+
    "\1\55\2\0\1\25\7\0\1\55\4\0\1\55\5\0\27\55\1\0"+
    "\37\55\1\0\u01ca\55\4\0\14\55\16\0\5\55\7\0\1\55\1\0"+
    "\1\55\21\0\160\25\5\55\1\0\2\55\2\0\4\55\10\0\1\55"+
    "\1\0\3\55\1\0\1\55\1\0\24\55\1\0\123\55\1\0\213\55"+
    "\1\0\5\25\2\0\236\55\11\0\46\55\2\0\1\55\7\0\47\55"+
    "\7\0\1\55\1\0\55\25\1\0\1\25\1\0\2\25\1\0\2\25"+
    "\1\0\1\25\10\0\33\55\5\0\3\55\15\0\5\25\6\0\1\55"+
    "\4\0\13\25\5\0\53\55\37\25\4\0\2\55\1\25\143\55\1\0"+
    "\1\55\10\25\1\0\6\25\2\55\2\25\1\0\4\25\2\55\12\25"+
    "\3\55\2\0\1\55\17\0\1\25\1\55\1\25\36\55\33\25\2\0"+
    "\131\55\13\25\1\55\16\0\12\25\41\55\11\25\2\55\4\0\1\55"+
    "\5\0\26\55\4\25\1\55\11\25\1\55\3\25\1\55\5\25\22\0"+
    "\31\55\3\25\104\0\1\55\1\0\13\55\67\0\33\25\1\0\4\25"+
    "\66\55\3\25\1\55\22\25\1\55\7\25\12\55\2\25\2\0\12\25"+
    "\1\0\7\55\1\0\7\55\1\0\3\25\1\0\10\55\2\0\2\55"+
    "\2\0\26\55\1\0\7\55\1\0\1\55\3\0\4\55\2\0\1\25"+
    "\1\55\7\25\2\0\2\25\2\0\3\25\1\55\10\0\1\25\4\0"+
    "\2\55\1\0\3\55\2\25\2\0\12\25\4\55\7\0\1\55\5\0"+
    "\3\25\1\0\6\55\4\0\2\55\2\0\26\55\1\0\7\55\1\0"+
    "\2\55\1\0\2\55\1\0\2\55\2\0\1\25\1\0\5\25\4\0"+
    "\2\25\2\0\3\25\3\0\1\25\7\0\4\55\1\0\1\55\7\0"+
    "\14\25\3\55\1\25\13\0\3\25\1\0\11\55\1\0\3\55\1\0"+
    "\26\55\1\0\7\55\1\0\2\55\1\0\5\55\2\0\1\25\1\55"+
    "\10\25\1\0\3\25\1\0\3\25\2\0\1\55\17\0\2\55\2\25"+
    "\2\0\12\25\1\0\1\55\17\0\3\25\1\0\10\55\2\0\2\55"+
    "\2\0\26\55\1\0\7\55\1\0\2\55\1\0\5\55\2\0\1\25"+
    "\1\55\7\25\2\0\2\25\2\0\3\25\10\0\2\25\4\0\2\55"+
    "\1\0\3\55\2\25\2\0\12\25\1\0\1\55\20\0\1\25\1\55"+
    "\1\0\6\55\3\0\3\55\1\0\4\55\3\0\2\55\1\0\1\55"+
    "\1\0\2\55\3\0\2\55\3\0\3\55\3\0\14\55\4\0\5\25"+
    "\3\0\3\25\1\0\4\25\2\0\1\55\6\0\1\25\16\0\12\25"+
    "\11\0\1\55\7\0\3\25\1\0\10\55\1\0\3\55\1\0\27\55"+
    "\1\0\12\55\1\0\5\55\3\0\1\55\7\25\1\0\3\25\1\0"+
    "\4\25\7\0\2\25\1\0\2\55\6\0\2\55\2\25\2\0\12\25"+
    "\22\0\2\25\1\0\10\55\1\0\3\55\1\0\27\55\1\0\12\55"+
    "\1\0\5\55\2\0\1\25\1\55\7\25\1\0\3\25\1\0\4\25"+
    "\7\0\2\25\7\0\1\55\1\0\2\55\2\25\2\0\12\25\1\0"+
    "\2\55\17\0\2\25\1\0\10\55\1\0\3\55\1\0\51\55\2\0"+
    "\1\55\7\25\1\0\3\25\1\0\4\25\1\55\10\0\1\25\10\0"+
    "\2\55\2\25\2\0\12\25\12\0\6\55\2\0\2\25\1\0\22\55"+
    "\3\0\30\55\1\0\11\55\1\0\1\55\2\0\7\55\3\0\1\25"+
    "\4\0\6\25\1\0\1\25\1\0\10\25\22\0\2\25\15\0\60\55"+
    "\1\25\2\55\7\25\4\0\10\55\10\25\1\0\12\25\47\0\2\55"+
    "\1\0\1\55\2\0\2\55\1\0\1\55\2\0\1\55\6\0\4\55"+
    "\1\0\7\55\1\0\3\55\1\0\1\55\1\0\1\55\2\0\2\55"+
    "\1\0\4\55\1\25\2\55\6\25\1\0\2\25\1\55\2\0\5\55"+
    "\1\0\1\55\1\0\6\25\2\0\12\25\2\0\4\55\40\0\1\55"+
    "\27\0\2\25\6\0\12\25\13\0\1\25\1\0\1\25\1\0\1\25"+
    "\4\0\2\25\10\55\1\0\44\55\4\0\24\25\1\0\2\25\5\55"+
    "\13\25\1\0\44\25\11\0\1\25\71\0\53\55\24\25\1\55\12\25"+
    "\6\0\6\55\4\25\4\55\3\25\1\55\3\25\2\55\7\25\3\55"+
    "\4\25\15\55\14\25\1\55\17\25\2\0\46\55\1\0\1\55\5\0"+
    "\1\55\2\0\53\55\1\0\u014d\55\1\0\4\55\2\0\7\55\1\0"+
    "\1\55\1\0\4\55\2\0\51\55\1\0\4\55\2\0\41\55\1\0"+
    "\4\55\2\0\7\55\1\0\1\55\1\0\4\55\2\0\17\55\1\0"+
    "\71\55\1\0\4\55\2\0\103\55\2\0\3\25\40\0\20\55\20\0"+
    "\125\55\14\0\u026c\55\2\0\21\55\1\0\32\55\5\0\113\55\3\0"+
    "\3\55\17\0\15\55\1\0\4\55\3\25\13\0\22\55\3\25\13\0"+
    "\22\55\2\25\14\0\15\55\1\0\3\55\1\0\2\25\14\0\64\55"+
    "\40\25\3\0\1\55\3\0\2\55\1\25\2\0\12\25\41\0\3\25"+
    "\2\0\12\25\6\0\130\55\10\0\51\55\1\25\1\55\5\0\106\55"+
    "\12\0\35\55\3\0\14\25\4\0\14\25\12\0\12\25\36\55\2\0"+
    "\5\55\13\0\54\55\4\0\21\25\7\55\2\25\6\0\12\25\46\0"+
    "\27\55\5\25\4\0\65\55\12\25\1\0\35\25\2\0\13\25\6\0"+
    "\12\25\15\0\1\55\130\0\5\25\57\55\21\25\7\55\4\0\12\25"+
    "\21\0\11\25\14\0\3\25\36\55\15\25\2\55\12\25\54\55\16\25"+
    "\14\0\44\55\24\25\10\0\12\25\3\0\3\55\12\25\44\55\122\0"+
    "\3\25\1\0\25\25\4\55\1\25\4\55\3\25\2\55\11\0\300\55"+
    "\47\25\25\0\4\25\u0116\55\2\0\6\55\2\0\46\55\2\0\6\55"+
    "\2\0\10\55\1\0\1\55\1\0\1\55\1\0\1\55\1\0\37\55"+
    "\2\0\65\55\1\0\7\55\1\0\1\55\3\0\3\55\1\0\7\55"+
    "\3\0\4\55\2\0\6\55\4\0\15\55\5\0\3\55\1\0\7\55"+
    "\16\0\5\25\10\0\1\26\1\27\20\0\5\25\20\0\2\55\23\0"+
    "\1\55\13\0\5\25\5\0\6\25\1\0\1\55\15\0\1\55\20\0"+
    "\15\55\3\0\33\55\25\0\15\25\4\0\1\25\3\0\14\25\21\0"+
    "\1\55\4\0\1\55\2\0\12\55\1\0\1\55\3\0\5\55\6\0"+
    "\1\55\1\0\1\55\1\0\1\55\1\0\4\55\1\0\13\55\2\0"+
    "\4\55\5\0\5\55\4\0\1\55\21\0\51\55\u0a77\0\57\55\1\0"+
    "\57\55\1\0\205\55\6\0\4\55\3\25\2\55\14\0\46\55\1\0"+
    "\1\55\5\0\1\55\2\0\70\55\7\0\1\55\17\0\1\25\27\55"+
    "\11\0\7\55\1\0\7\55\1\0\7\55\1\0\7\55\1\0\7\55"+
    "\1\0\7\55\1\0\7\55\1\0\7\55\1\0\40\25\57\0\1\55"+
    "\u01d5\0\3\55\31\0\11\55\6\25\1\0\5\55\2\0\5\55\4\0"+
    "\126\55\2\0\2\25\2\0\3\55\1\0\132\55\1\0\4\55\5\0"+
    "\51\55\3\0\136\55\21\0\33\55\65\0\20\55\u0200\0\u19b6\55\112\0"+
    "\u51cd\55\63\0\u048d\55\103\0\56\55\2\0\u010d\55\3\0\20\55\12\25"+
    "\2\55\24\0\57\55\1\25\4\0\12\25\1\0\31\55\7\0\1\25"+
    "\120\55\2\25\45\0\11\55\2\0\147\55\2\0\4\55\1\0\4\55"+
    "\14\0\13\55\115\0\12\55\1\25\3\55\1\25\4\55\1\25\27\55"+
    "\5\25\20\0\1\55\7\0\64\55\14\0\2\25\62\55\21\25\13\0"+
    "\12\25\6\0\22\25\6\55\3\0\1\55\4\0\12\25\34\55\10\25"+
    "\2\0\27\55\15\25\14\0\35\55\3\0\4\25\57\55\16\25\16\0"+
    "\1\55\12\25\46\0\51\55\16\25\11\0\3\55\1\25\10\55\2\25"+
    "\2\0\12\25\6\0\27\55\3\0\1\55\1\25\4\0\60\55\1\25"+
    "\1\55\3\25\2\55\2\25\5\55\2\25\1\55\1\25\1\55\30\0"+
    "\3\55\2\0\13\55\5\25\2\0\3\55\2\25\12\0\6\55\2\0"+
    "\6\55\2\0\6\55\11\0\7\55\1\0\7\55\221\0\43\55\10\25"+
    "\1\0\2\25\2\0\12\25\6\0\u2ba4\55\14\0\27\55\4\0\61\55"+
    "\u2104\0\u016e\55\2\0\152\55\46\0\7\55\14\0\5\55\5\0\1\55"+
    "\1\25\12\55\1\0\15\55\1\0\5\55\1\0\1\55\1\0\2\55"+
    "\1\0\2\55\1\0\154\55\41\0\u016b\55\22\0\100\55\2\0\66\55"+
    "\50\0\15\55\3\0\20\25\20\0\7\25\14\0\2\55\30\0\3\55"+
    "\31\0\1\55\6\0\5\55\1\0\207\55\2\0\1\25\4\0\1\55"+
    "\13\0\12\25\7\0\32\55\4\0\1\55\1\0\32\55\13\0\131\55"+
    "\3\0\6\55\2\0\6\55\2\0\6\55\2\0\3\55\3\0\2\55"+
    "\3\0\2\55\22\0\3\25\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\10\11\3\1\2\12\4\11\1\13\1\14"+
    "\1\11\1\14\1\13\1\15\1\16\3\11\2\17\1\0"+
    "\1\20\1\0\1\21\1\22\2\11\1\23\2\11\1\24"+
    "\4\11\1\0\1\25\2\0\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\23\4\11\1\34\1\35\1\36\1\11"+
    "\1\37\1\40\1\41\1\11\1\42\1\43\1\44\1\45"+
    "\1\46\1\11\1\47\1\50\1\51\1\11\1\52\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\60\0\60\0\300\0\60"+
    "\0\60\0\60\0\60\0\360\0\u0120\0\u0150\0\u0180\0\u01b0"+
    "\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\60"+
    "\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\60"+
    "\0\u0480\0\60\0\60\0\u04b0\0\u04e0\0\u0510\0\60\0\u0540"+
    "\0\140\0\60\0\u0570\0\60\0\u01b0\0\u05a0\0\u05d0\0\u01b0"+
    "\0\u0600\0\u0630\0\u01b0\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0270"+
    "\0\60\0\u0720\0\u0750\0\u0780\0\u01b0\0\u01b0\0\u01b0\0\u01b0"+
    "\0\60\0\60\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u01b0\0\60"+
    "\0\u01b0\0\u0870\0\u01b0\0\u01b0\0\u01b0\0\u08a0\0\u01b0\0\u01b0"+
    "\0\60\0\u01b0\0\u01b0\0\u08d0\0\u01b0\0\u01b0\0\u01b0\0\u0900"+
    "\0\u01b0\0\u01b0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\20\1\24\1\25\1\2\1\26\1\2"+
    "\1\27\2\30\1\31\1\32\1\33\1\20\1\34\1\35"+
    "\1\36\1\37\1\40\1\36\1\41\1\42\1\43\1\20"+
    "\1\44\1\45\1\20\1\46\1\20\1\47\1\50\60\0"+
    "\1\51\1\30\56\51\3\0\1\52\61\0\1\53\1\54"+
    "\63\0\1\20\1\55\7\20\2\0\1\20\5\0\5\20"+
    "\2\0\1\20\5\0\10\20\12\0\1\56\10\20\2\0"+
    "\1\20\5\0\5\20\2\0\1\20\5\0\10\20\12\0"+
    "\3\20\1\57\5\20\2\0\1\20\5\0\4\20\1\60"+
    "\2\0\1\20\5\0\10\20\12\0\5\20\1\61\3\20"+
    "\2\0\1\20\5\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\11\20\2\0\1\20\5\0\5\20\2\0\1\20"+
    "\5\0\10\20\12\0\1\62\10\20\2\0\1\20\5\0"+
    "\5\20\2\0\1\20\5\0\10\20\12\0\3\20\1\63"+
    "\1\64\2\20\1\65\1\20\2\0\1\20\5\0\5\20"+
    "\2\0\1\20\5\0\10\20\12\0\1\20\1\66\1\20"+
    "\1\67\5\20\2\0\1\20\5\0\5\20\2\0\1\20"+
    "\5\0\10\20\23\70\1\71\34\70\12\0\11\72\2\0"+
    "\1\72\5\0\5\72\2\0\1\72\5\0\10\72\12\0"+
    "\11\73\2\0\1\73\5\0\5\73\2\0\1\73\5\0"+
    "\10\73\31\0\1\30\40\0\1\20\1\74\4\20\1\75"+
    "\2\20\2\0\1\20\5\0\5\20\2\0\1\20\5\0"+
    "\10\20\12\0\11\20\2\0\1\20\5\0\1\20\1\76"+
    "\3\20\2\0\1\20\5\0\10\20\12\0\11\20\2\0"+
    "\1\20\5\0\3\20\1\77\1\20\2\0\1\20\5\0"+
    "\10\20\12\0\3\20\1\100\5\20\2\0\1\20\5\0"+
    "\5\20\2\0\1\20\5\0\10\20\40\0\1\101\1\102"+
    "\61\0\1\40\26\0\2\20\1\103\4\20\1\104\1\20"+
    "\2\0\1\20\5\0\5\20\2\0\1\20\5\0\10\20"+
    "\45\0\1\101\24\0\1\105\10\20\2\0\1\20\5\0"+
    "\5\20\2\0\1\20\5\0\10\20\12\0\11\20\2\0"+
    "\1\20\5\0\3\20\1\106\1\20\2\0\1\20\5\0"+
    "\10\20\12\0\11\20\2\0\1\20\5\0\5\20\2\0"+
    "\1\20\5\0\1\20\1\107\6\20\56\0\2\50\5\0"+
    "\1\110\64\0\1\111\10\20\2\0\1\20\5\0\5\20"+
    "\2\0\1\20\5\0\10\20\12\0\4\20\1\112\4\20"+
    "\2\0\1\20\5\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\2\20\1\113\6\20\2\0\1\20\5\0\5\20"+
    "\2\0\1\20\5\0\10\20\12\0\10\20\1\114\2\0"+
    "\1\20\5\0\5\20\2\0\1\20\5\0\10\20\12\0"+
    "\1\20\1\115\7\20\2\0\1\20\5\0\5\20\2\0"+
    "\1\20\5\0\10\20\12\0\1\116\10\20\2\0\1\20"+
    "\5\0\5\20\2\0\1\20\5\0\10\20\12\0\11\20"+
    "\2\0\1\20\5\0\5\20\2\0\1\20\5\0\1\117"+
    "\7\20\12\0\3\20\1\120\5\20\2\0\1\20\5\0"+
    "\5\20\2\0\1\20\5\0\10\20\24\0\1\121\62\0"+
    "\1\121\42\0\2\20\1\122\6\20\2\0\1\20\5\0"+
    "\5\20\2\0\1\20\5\0\10\20\12\0\11\20\2\0"+
    "\1\20\5\0\5\20\2\0\1\20\5\0\3\20\1\123"+
    "\4\20\12\0\11\20\2\0\1\20\5\0\1\124\4\20"+
    "\2\0\1\20\5\0\10\20\12\0\1\20\1\125\7\20"+
    "\2\0\1\20\5\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\3\20\1\126\5\20\2\0\1\20\5\0\5\20"+
    "\2\0\1\20\5\0\10\20\12\0\5\20\1\127\3\20"+
    "\2\0\1\20\5\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\10\20\1\130\2\0\1\20\5\0\5\20\2\0"+
    "\1\20\5\0\10\20\12\0\1\20\1\131\7\20\2\0"+
    "\1\20\5\0\5\20\2\0\1\20\5\0\10\20\12\0"+
    "\5\20\1\132\3\20\2\0\1\20\5\0\5\20\2\0"+
    "\1\20\5\0\10\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2352];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\2\11\1\1\4\11\14\1\1\11"+
    "\7\1\1\11\1\1\2\11\3\1\1\11\1\1\1\0"+
    "\1\11\1\0\1\11\13\1\1\0\1\11\2\0\5\1"+
    "\2\11\5\1\1\11\10\1\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[90];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public Symbol symbol(int type, Object value){
        return new Symbol(type, yycolumn, yyline, value);
    };

    public Symbol symbol(int type){
        return new Symbol(type, yycolumn, yyline);
    };



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2250) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { /* ignore */
          }
        case 44: break;
        case 3: 
          { //System.out.println("<CLOSE_PARENTESIS," + yytext() + ">");
                            return new Symbol(sym.CLOSE_PARENTESIS, yycolumn, yyline, yytext());
          }
        case 45: break;
        case 29: 
          { //System.out.println("<BETWEEN," + yytext() + ">");
                            return new Symbol(sym.BETWEEN, yycolumn, yyline, yytext());
          }
        case 46: break;
        case 27: 
          { //System.out.println("<INCREMENT," + yytext() + ">");
                            return new Symbol(sym.INCREMENT, yycolumn, yyline, yytext());
          }
        case 47: break;
        case 35: 
          { //System.out.println("<ARRAY," + yytext() + ">");
                            return new Symbol(sym.ARRAY, yycolumn, yyline, yytext());
          }
        case 48: break;
        case 5: 
          { //System.out.println("<COMA," + yytext() + ">");
                            return new Symbol(sym.COMA, yycolumn, yyline, yytext());
          }
        case 49: break;
        case 37: 
          { //System.out.println("<INTENGER," + yytext() + ">");
                            return new Symbol(sym.INTENGER, yycolumn, yyline, yytext());
          }
        case 50: break;
        case 31: 
          { //System.out.println("<RETURN," + yytext() + ">");
                            return new Symbol(sym.RETURN, yycolumn, yyline, yytext());
          }
        case 51: break;
        case 1: 
          { //System.out.println("<ERROR," + yytext() + ">");
                        return new Symbol(sym.ERROR, yycolumn, yyline, yytext());
          }
        case 52: break;
        case 2: 
          { //System.out.println("<COLON," + yytext() + ">");
                            return new Symbol(sym.COLON, yycolumn, yyline, yytext());
          }
        case 53: break;
        case 40: 
          { //System.out.println("<CHAR," + yytext() + ">");
                            return new Symbol(sym.CHAR, yycolumn, yyline, yytext());
          }
        case 54: break;
        case 39: 
          { //System.out.println("<BOOLEAN," + yytext() + ">");
                            return new Symbol(sym.BOOLEAN, yycolumn, yyline, yytext());
          }
        case 55: break;
        case 26: 
          { //System.out.println("<CON_OR," + yytext() + ">");
                            return new Symbol(sym.CON_OR, yycolumn, yyline, yytext());
          }
        case 56: break;
        case 22: 
          { //System.out.println("<CIN," + yytext() + ">");
                            return new Symbol(sym.CIN, yycolumn, yyline, yytext());
          }
        case 57: break;
        case 4: 
          { //System.out.println("<OPEN_PARENTESIS," + yytext() + ">");
                            return new Symbol(sym.OPEN_PARENTESIS, yycolumn, yyline, yytext());
          }
        case 58: break;
        case 16: 
          { //System.out.println("<CLOSE_BLOCK," + yytext() + ">");
                            return new Symbol(sym.CLOSE_BLOCK, yycolumn, yyline, yytext());
          }
        case 59: break;
        case 43: 
          { //System.out.println("<FALSE," + yytext() + ">");
                            return new Symbol(sym.FALSE, yycolumn, yyline, yytext());
          }
        case 60: break;
        case 18: 
          { //System.out.println("<NEW_LINE," + yytext() + ">");
                            return new Symbol(sym.NEW_LINE, yycolumn, yyline, yytext());
          }
        case 61: break;
        case 9: 
          { //System.out.println("<ID," + yytext() + ">");
                            return new Symbol(sym.ID, yycolumn, yyline, yytext());
          }
        case 62: break;
        case 6: 
          { //System.out.println("<OPEN_SQR_BRACKET," + yytext() + ">");
                            return new Symbol(sym.OPEN_SQR_BRACKET, yycolumn, yyline, yytext());
          }
        case 63: break;
        case 25: 
          { //System.out.println("<WHILE," + yytext() + ">");
                            return new Symbol(sym.WHILE, yycolumn, yyline, yytext());
          }
        case 64: break;
        case 11: 
          { //System.out.println("<OP_SUM," + yytext() + ">");
                            return new Symbol(sym.OP_SUM, yycolumn, yyline, yytext());
          }
        case 65: break;
        case 30: 
          { //System.out.println("<NULL," + yytext() + ">");
                            return new Symbol(sym.NULL, yycolumn, yyline, yytext());
          }
        case 66: break;
        case 38: 
          { //System.out.println("<MATRIX," + yytext() + ">");
                            return new Symbol(sym.MATRIX, yycolumn, yyline, yytext());
          }
        case 67: break;
        case 14: 
          { //System.out.println("<MOD," + yytext() + ">");
                            return new Symbol(sym.MOD, yycolumn, yyline, yytext());
          }
        case 68: break;
        case 12: 
          { //System.out.println("<OP_REL," + yytext() + ">");
                            return new Symbol(sym.OP_REL, yycolumn, yyline, yytext());
          }
        case 69: break;
        case 19: 
          { //System.out.println("<TO," + yytext() + ">");
                            return new Symbol(sym.TO, yycolumn, yyline, yytext());
          }
        case 70: break;
        case 20: 
          { //System.out.println("<FOR," + yytext() + ">");
                            return new Symbol(sym.FOR, yycolumn, yyline, yytext());
          }
        case 71: break;
        case 21: 
          { //System.out.println("<STRING," + yytext() + ">");
                            return new Symbol(sym.STRING, yycolumn, yyline, yytext());
          }
        case 72: break;
        case 33: 
          { //System.out.println("<FUNCTION," + yytext() + ">");
                            return new Symbol(sym.FUNCTION, yycolumn, yyline, yytext());
          }
        case 73: break;
        case 15: 
          { //System.out.println("<NUMBER," + yytext() + ">");
                            return new Symbol(sym.NUMBER, yycolumn, yyline, new Integer(Integer.parseInt(yytext())));
          }
        case 74: break;
        case 24: 
          { //System.out.println("<PRINT," + yytext() + ">");
                            return new Symbol(sym.PRINT, yycolumn, yyline, yytext());
          }
        case 75: break;
        case 36: 
          { //System.out.println("<CHAR_ELEMENT," + yytext() + ">");
                            return new Symbol(sym.CHAR_ELEMENT, yycolumn, yyline, yytext());
          }
        case 76: break;
        case 7: 
          { //System.out.println("<CLOSE_SQR_BRACKET," + yytext() + ">");
                            return new Symbol(sym.CLOSE_SQR_BRACKET, yycolumn, yyline, yytext());
          }
        case 77: break;
        case 32: 
          { //System.out.println("<ELSE," + yytext() + ">");
                            return new Symbol(sym.ELSE, yycolumn, yyline, yytext());
          }
        case 78: break;
        case 42: 
          { //System.out.println("<MAIN," + yytext() + ">");
                            return new Symbol(sym.MAIN, yycolumn, yyline, yytext());
          }
        case 79: break;
        case 28: 
          { //System.out.println("<VARIABLE," + yytext() + ">");
                            return new Symbol(sym.VARIABLE, yycolumn, yyline, yytext());
          }
        case 80: break;
        case 13: 
          { //System.out.println("<OP_MULTI_DIV," + yytext() + ">");
                            return new Symbol(sym.OP_MULTI_DIV, yycolumn, yyline, yytext());
          }
        case 81: break;
        case 41: 
          { //System.out.println("<TRUE," + yytext() + ">");
                            return new Symbol(sym.TRUE, yycolumn, yyline, yytext());
          }
        case 82: break;
        case 23: 
          { //System.out.println("<IF_SWITCH," + yytext() + ">");
                            return new Symbol(sym.IF_SWITCH, yycolumn, yyline, yytext());
          }
        case 83: break;
        case 8: 
          { //System.out.println("<BACK_SLASH," + yytext() + ">");
                            return new Symbol(sym.BACK_SLASH, yycolumn, yyline, yytext());
          }
        case 84: break;
        case 34: 
          { //System.out.println("<CON_AND," + yytext() + ">");
                            return new Symbol(sym.CON_AND, yycolumn, yyline, yytext());
          }
        case 85: break;
        case 17: 
          { //System.out.println("<PYC," + yytext() + ">");
                            return new Symbol(sym.PYC, yycolumn, yyline, yytext());
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
