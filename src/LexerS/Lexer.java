/* The following code was generated by JFlex 1.4.3 on 09-29-20 06:13 AM */

package LexerS;
//Clase numeracion donde incluiremos los numeros de todos los tokens
import static Main.Tokens.*;
import Main.Tokens;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 09-29-20 06:13 AM from the specification file
 * <tt>./src/LexerS/Lexer.flex</tt>
 */
public class Lexer {

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
    "\11\52\1\26\1\27\1\0\1\26\1\26\16\52\4\0\1\26\1\0"+
    "\1\23\1\0\1\25\1\44\1\0\1\24\1\4\1\3\1\43\1\42"+
    "\1\6\1\35\1\5\1\43\1\53\11\54\1\2\1\0\1\41\1\40"+
    "\1\36\2\0\32\25\1\7\1\11\1\10\1\0\1\25\1\0\1\21"+
    "\1\46\1\47\1\45\1\17\1\20\1\25\1\33\1\30\2\25\1\12"+
    "\1\37\1\13\1\34\1\31\1\25\1\15\1\22\1\14\1\16\1\51"+
    "\1\32\1\50\2\25\1\0\1\1\2\0\41\52\2\0\4\25\4\0"+
    "\1\25\2\0\1\52\7\0\1\25\4\0\1\25\5\0\27\25\1\0"+
    "\37\25\1\0\u01ca\25\4\0\14\25\16\0\5\25\7\0\1\25\1\0"+
    "\1\25\21\0\160\52\5\25\1\0\2\25\2\0\4\25\10\0\1\25"+
    "\1\0\3\25\1\0\1\25\1\0\24\25\1\0\123\25\1\0\213\25"+
    "\1\0\5\52\2\0\236\25\11\0\46\25\2\0\1\25\7\0\47\25"+
    "\7\0\1\25\1\0\55\52\1\0\1\52\1\0\2\52\1\0\2\52"+
    "\1\0\1\52\10\0\33\25\5\0\3\25\15\0\5\52\6\0\1\25"+
    "\4\0\13\52\5\0\53\25\37\52\4\0\2\25\1\52\143\25\1\0"+
    "\1\25\10\52\1\0\6\52\2\25\2\52\1\0\4\52\2\25\12\52"+
    "\3\25\2\0\1\25\17\0\1\52\1\25\1\52\36\25\33\52\2\0"+
    "\131\25\13\52\1\25\16\0\12\52\41\25\11\52\2\25\4\0\1\25"+
    "\5\0\26\25\4\52\1\25\11\52\1\25\3\52\1\25\5\52\22\0"+
    "\31\25\3\52\104\0\1\25\1\0\13\25\67\0\33\52\1\0\4\52"+
    "\66\25\3\52\1\25\22\52\1\25\7\52\12\25\2\52\2\0\12\52"+
    "\1\0\7\25\1\0\7\25\1\0\3\52\1\0\10\25\2\0\2\25"+
    "\2\0\26\25\1\0\7\25\1\0\1\25\3\0\4\25\2\0\1\52"+
    "\1\25\7\52\2\0\2\52\2\0\3\52\1\25\10\0\1\52\4\0"+
    "\2\25\1\0\3\25\2\52\2\0\12\52\4\25\7\0\1\25\5\0"+
    "\3\52\1\0\6\25\4\0\2\25\2\0\26\25\1\0\7\25\1\0"+
    "\2\25\1\0\2\25\1\0\2\25\2\0\1\52\1\0\5\52\4\0"+
    "\2\52\2\0\3\52\3\0\1\52\7\0\4\25\1\0\1\25\7\0"+
    "\14\52\3\25\1\52\13\0\3\52\1\0\11\25\1\0\3\25\1\0"+
    "\26\25\1\0\7\25\1\0\2\25\1\0\5\25\2\0\1\52\1\25"+
    "\10\52\1\0\3\52\1\0\3\52\2\0\1\25\17\0\2\25\2\52"+
    "\2\0\12\52\1\0\1\25\17\0\3\52\1\0\10\25\2\0\2\25"+
    "\2\0\26\25\1\0\7\25\1\0\2\25\1\0\5\25\2\0\1\52"+
    "\1\25\7\52\2\0\2\52\2\0\3\52\10\0\2\52\4\0\2\25"+
    "\1\0\3\25\2\52\2\0\12\52\1\0\1\25\20\0\1\52\1\25"+
    "\1\0\6\25\3\0\3\25\1\0\4\25\3\0\2\25\1\0\1\25"+
    "\1\0\2\25\3\0\2\25\3\0\3\25\3\0\14\25\4\0\5\52"+
    "\3\0\3\52\1\0\4\52\2\0\1\25\6\0\1\52\16\0\12\52"+
    "\11\0\1\25\7\0\3\52\1\0\10\25\1\0\3\25\1\0\27\25"+
    "\1\0\12\25\1\0\5\25\3\0\1\25\7\52\1\0\3\52\1\0"+
    "\4\52\7\0\2\52\1\0\2\25\6\0\2\25\2\52\2\0\12\52"+
    "\22\0\2\52\1\0\10\25\1\0\3\25\1\0\27\25\1\0\12\25"+
    "\1\0\5\25\2\0\1\52\1\25\7\52\1\0\3\52\1\0\4\52"+
    "\7\0\2\52\7\0\1\25\1\0\2\25\2\52\2\0\12\52\1\0"+
    "\2\25\17\0\2\52\1\0\10\25\1\0\3\25\1\0\51\25\2\0"+
    "\1\25\7\52\1\0\3\52\1\0\4\52\1\25\10\0\1\52\10\0"+
    "\2\25\2\52\2\0\12\52\12\0\6\25\2\0\2\52\1\0\22\25"+
    "\3\0\30\25\1\0\11\25\1\0\1\25\2\0\7\25\3\0\1\52"+
    "\4\0\6\52\1\0\1\52\1\0\10\52\22\0\2\52\15\0\60\25"+
    "\1\52\2\25\7\52\4\0\10\25\10\52\1\0\12\52\47\0\2\25"+
    "\1\0\1\25\2\0\2\25\1\0\1\25\2\0\1\25\6\0\4\25"+
    "\1\0\7\25\1\0\3\25\1\0\1\25\1\0\1\25\2\0\2\25"+
    "\1\0\4\25\1\52\2\25\6\52\1\0\2\52\1\25\2\0\5\25"+
    "\1\0\1\25\1\0\6\52\2\0\12\52\2\0\4\25\40\0\1\25"+
    "\27\0\2\52\6\0\12\52\13\0\1\52\1\0\1\52\1\0\1\52"+
    "\4\0\2\52\10\25\1\0\44\25\4\0\24\52\1\0\2\52\5\25"+
    "\13\52\1\0\44\52\11\0\1\52\71\0\53\25\24\52\1\25\12\52"+
    "\6\0\6\25\4\52\4\25\3\52\1\25\3\52\2\25\7\52\3\25"+
    "\4\52\15\25\14\52\1\25\17\52\2\0\46\25\1\0\1\25\5\0"+
    "\1\25\2\0\53\25\1\0\u014d\25\1\0\4\25\2\0\7\25\1\0"+
    "\1\25\1\0\4\25\2\0\51\25\1\0\4\25\2\0\41\25\1\0"+
    "\4\25\2\0\7\25\1\0\1\25\1\0\4\25\2\0\17\25\1\0"+
    "\71\25\1\0\4\25\2\0\103\25\2\0\3\52\40\0\20\25\20\0"+
    "\125\25\14\0\u026c\25\2\0\21\25\1\0\32\25\5\0\113\25\3\0"+
    "\3\25\17\0\15\25\1\0\4\25\3\52\13\0\22\25\3\52\13\0"+
    "\22\25\2\52\14\0\15\25\1\0\3\25\1\0\2\52\14\0\64\25"+
    "\40\52\3\0\1\25\3\0\2\25\1\52\2\0\12\52\41\0\3\52"+
    "\2\0\12\52\6\0\130\25\10\0\51\25\1\52\1\25\5\0\106\25"+
    "\12\0\35\25\3\0\14\52\4\0\14\52\12\0\12\52\36\25\2\0"+
    "\5\25\13\0\54\25\4\0\21\52\7\25\2\52\6\0\12\52\46\0"+
    "\27\25\5\52\4\0\65\25\12\52\1\0\35\52\2\0\13\52\6\0"+
    "\12\52\15\0\1\25\130\0\5\52\57\25\21\52\7\25\4\0\12\52"+
    "\21\0\11\52\14\0\3\52\36\25\15\52\2\25\12\52\54\25\16\52"+
    "\14\0\44\25\24\52\10\0\12\52\3\0\3\25\12\52\44\25\122\0"+
    "\3\52\1\0\25\52\4\25\1\52\4\25\3\52\2\25\11\0\300\25"+
    "\47\52\25\0\4\52\u0116\25\2\0\6\25\2\0\46\25\2\0\6\25"+
    "\2\0\10\25\1\0\1\25\1\0\1\25\1\0\1\25\1\0\37\25"+
    "\2\0\65\25\1\0\7\25\1\0\1\25\3\0\3\25\1\0\7\25"+
    "\3\0\4\25\2\0\6\25\4\0\15\25\5\0\3\25\1\0\7\25"+
    "\16\0\5\52\32\0\5\52\20\0\2\25\23\0\1\25\13\0\5\52"+
    "\5\0\6\52\1\0\1\25\15\0\1\25\20\0\15\25\3\0\33\25"+
    "\25\0\15\52\4\0\1\52\3\0\14\52\21\0\1\25\4\0\1\25"+
    "\2\0\12\25\1\0\1\25\3\0\5\25\6\0\1\25\1\0\1\25"+
    "\1\0\1\25\1\0\4\25\1\0\13\25\2\0\4\25\5\0\5\25"+
    "\4\0\1\25\21\0\51\25\u0a77\0\57\25\1\0\57\25\1\0\205\25"+
    "\6\0\4\25\3\52\2\25\14\0\46\25\1\0\1\25\5\0\1\25"+
    "\2\0\70\25\7\0\1\25\17\0\1\52\27\25\11\0\7\25\1\0"+
    "\7\25\1\0\7\25\1\0\7\25\1\0\7\25\1\0\7\25\1\0"+
    "\7\25\1\0\7\25\1\0\40\52\57\0\1\25\u01d5\0\3\25\31\0"+
    "\11\25\6\52\1\0\5\25\2\0\5\25\4\0\126\25\2\0\2\52"+
    "\2\0\3\25\1\0\132\25\1\0\4\25\5\0\51\25\3\0\136\25"+
    "\21\0\33\25\65\0\20\25\u0200\0\u19b6\25\112\0\u51cd\25\63\0\u048d\25"+
    "\103\0\56\25\2\0\u010d\25\3\0\20\25\12\52\2\25\24\0\57\25"+
    "\1\52\4\0\12\52\1\0\31\25\7\0\1\52\120\25\2\52\45\0"+
    "\11\25\2\0\147\25\2\0\4\25\1\0\4\25\14\0\13\25\115\0"+
    "\12\25\1\52\3\25\1\52\4\25\1\52\27\25\5\52\20\0\1\25"+
    "\7\0\64\25\14\0\2\52\62\25\21\52\13\0\12\52\6\0\22\52"+
    "\6\25\3\0\1\25\4\0\12\52\34\25\10\52\2\0\27\25\15\52"+
    "\14\0\35\25\3\0\4\52\57\25\16\52\16\0\1\25\12\52\46\0"+
    "\51\25\16\52\11\0\3\25\1\52\10\25\2\52\2\0\12\52\6\0"+
    "\27\25\3\0\1\25\1\52\4\0\60\25\1\52\1\25\3\52\2\25"+
    "\2\52\5\25\2\52\1\25\1\52\1\25\30\0\3\25\2\0\13\25"+
    "\5\52\2\0\3\25\2\52\12\0\6\25\2\0\6\25\2\0\6\25"+
    "\11\0\7\25\1\0\7\25\221\0\43\25\10\52\1\0\2\52\2\0"+
    "\12\52\6\0\u2ba4\25\14\0\27\25\4\0\61\25\u2104\0\u016e\25\2\0"+
    "\152\25\46\0\7\25\14\0\5\25\5\0\1\25\1\52\12\25\1\0"+
    "\15\25\1\0\5\25\1\0\1\25\1\0\2\25\1\0\2\25\1\0"+
    "\154\25\41\0\u016b\25\22\0\100\25\2\0\66\25\50\0\15\25\3\0"+
    "\20\52\20\0\7\52\14\0\2\25\30\0\3\25\31\0\1\25\6\0"+
    "\5\25\1\0\207\25\2\0\1\52\4\0\1\25\13\0\12\52\7\0"+
    "\32\25\4\0\1\25\1\0\32\25\13\0\131\25\3\0\6\25\2\0"+
    "\6\25\2\0\6\25\2\0\3\25\3\0\2\25\3\0\2\25\22\0"+
    "\3\52\4\0";

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
    "\1\7\1\10\10\11\2\1\1\12\1\13\4\11\1\14"+
    "\1\15\1\11\1\15\1\14\1\16\1\17\3\11\2\20"+
    "\1\0\1\21\1\0\1\22\1\23\2\11\1\24\2\11"+
    "\1\25\4\11\1\0\1\26\1\0\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\24\4\11\1\35\1\36\1\37"+
    "\1\11\1\40\1\41\1\42\1\11\1\43\1\44\1\45"+
    "\1\46\1\47\1\11\1\50\1\51\1\52\1\11\1\53"+
    "\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[88];
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
    "\0\0\0\55\0\132\0\207\0\55\0\55\0\264\0\55"+
    "\0\55\0\55\0\55\0\341\0\u010e\0\u013b\0\u0168\0\u0195"+
    "\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\55\0\55\0\u02a3"+
    "\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\55\0\u03de"+
    "\0\55\0\55\0\u040b\0\u0438\0\u0465\0\55\0\u0492\0\132"+
    "\0\55\0\u04bf\0\55\0\u0195\0\u04ec\0\u0519\0\u0195\0\u0546"+
    "\0\u0573\0\u0195\0\u05a0\0\u05cd\0\u05fa\0\u0627\0\u0249\0\55"+
    "\0\u0654\0\u0681\0\u0195\0\u0195\0\u0195\0\u0195\0\55\0\55"+
    "\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0195\0\55\0\u0195\0\u0762"+
    "\0\u0195\0\u0195\0\u0195\0\u078f\0\u0195\0\u0195\0\55\0\u0195"+
    "\0\u0195\0\u07bc\0\u0195\0\u0195\0\u0195\0\u07e9\0\u0195\0\u0195";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[88];
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
    "\1\22\1\23\1\20\1\24\1\25\1\20\1\26\1\27"+
    "\1\30\1\31\1\32\1\20\1\33\1\34\1\35\1\36"+
    "\1\37\1\35\1\40\1\41\1\42\1\20\1\43\1\44"+
    "\1\20\1\45\1\2\1\46\1\47\55\0\1\50\1\26"+
    "\53\50\3\0\1\51\56\0\1\52\1\53\60\0\1\20"+
    "\1\54\7\20\2\0\1\20\2\0\5\20\2\0\1\20"+
    "\5\0\10\20\12\0\1\55\10\20\2\0\1\20\2\0"+
    "\5\20\2\0\1\20\5\0\10\20\12\0\3\20\1\56"+
    "\5\20\2\0\1\20\2\0\4\20\1\57\2\0\1\20"+
    "\5\0\10\20\12\0\5\20\1\60\3\20\2\0\1\20"+
    "\2\0\5\20\2\0\1\20\5\0\10\20\12\0\11\20"+
    "\2\0\1\20\2\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\1\61\10\20\2\0\1\20\2\0\5\20\2\0"+
    "\1\20\5\0\10\20\12\0\3\20\1\62\1\63\2\20"+
    "\1\64\1\20\2\0\1\20\2\0\5\20\2\0\1\20"+
    "\5\0\10\20\12\0\1\20\1\65\1\20\1\66\5\20"+
    "\2\0\1\20\2\0\5\20\2\0\1\20\5\0\10\20"+
    "\23\67\1\70\31\67\12\0\11\71\2\0\1\71\2\0"+
    "\5\71\2\0\1\71\5\0\5\71\15\0\1\20\1\72"+
    "\4\20\1\73\2\20\2\0\1\20\2\0\5\20\2\0"+
    "\1\20\5\0\10\20\12\0\11\20\2\0\1\20\2\0"+
    "\1\20\1\74\3\20\2\0\1\20\5\0\10\20\12\0"+
    "\11\20\2\0\1\20\2\0\3\20\1\75\1\20\2\0"+
    "\1\20\5\0\10\20\12\0\3\20\1\76\5\20\2\0"+
    "\1\20\2\0\5\20\2\0\1\20\5\0\10\20\35\0"+
    "\1\77\1\100\56\0\1\37\26\0\2\20\1\101\4\20"+
    "\1\102\1\20\2\0\1\20\2\0\5\20\2\0\1\20"+
    "\5\0\10\20\42\0\1\77\24\0\1\103\10\20\2\0"+
    "\1\20\2\0\5\20\2\0\1\20\5\0\10\20\12\0"+
    "\11\20\2\0\1\20\2\0\3\20\1\104\1\20\2\0"+
    "\1\20\5\0\10\20\12\0\11\20\2\0\1\20\2\0"+
    "\5\20\2\0\1\20\5\0\1\20\1\105\6\20\53\0"+
    "\2\47\5\0\1\106\61\0\1\107\10\20\2\0\1\20"+
    "\2\0\5\20\2\0\1\20\5\0\10\20\12\0\4\20"+
    "\1\110\4\20\2\0\1\20\2\0\5\20\2\0\1\20"+
    "\5\0\10\20\12\0\2\20\1\111\6\20\2\0\1\20"+
    "\2\0\5\20\2\0\1\20\5\0\10\20\12\0\10\20"+
    "\1\112\2\0\1\20\2\0\5\20\2\0\1\20\5\0"+
    "\10\20\12\0\1\20\1\113\7\20\2\0\1\20\2\0"+
    "\5\20\2\0\1\20\5\0\10\20\12\0\1\114\10\20"+
    "\2\0\1\20\2\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\11\20\2\0\1\20\2\0\5\20\2\0\1\20"+
    "\5\0\1\115\7\20\12\0\3\20\1\116\5\20\2\0"+
    "\1\20\2\0\5\20\2\0\1\20\5\0\10\20\24\0"+
    "\1\117\42\0\2\20\1\120\6\20\2\0\1\20\2\0"+
    "\5\20\2\0\1\20\5\0\10\20\12\0\11\20\2\0"+
    "\1\20\2\0\5\20\2\0\1\20\5\0\3\20\1\121"+
    "\4\20\12\0\11\20\2\0\1\20\2\0\1\122\4\20"+
    "\2\0\1\20\5\0\10\20\12\0\1\20\1\123\7\20"+
    "\2\0\1\20\2\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\3\20\1\124\5\20\2\0\1\20\2\0\5\20"+
    "\2\0\1\20\5\0\10\20\12\0\5\20\1\125\3\20"+
    "\2\0\1\20\2\0\5\20\2\0\1\20\5\0\10\20"+
    "\12\0\10\20\1\126\2\0\1\20\2\0\5\20\2\0"+
    "\1\20\5\0\10\20\12\0\1\20\1\127\7\20\2\0"+
    "\1\20\2\0\5\20\2\0\1\20\5\0\10\20\12\0"+
    "\5\20\1\130\3\20\2\0\1\20\2\0\5\20\2\0"+
    "\1\20\5\0\10\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2070];
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
    "\1\0\1\11\2\1\2\11\1\1\4\11\12\1\2\11"+
    "\7\1\1\11\1\1\2\11\3\1\1\11\1\1\1\0"+
    "\1\11\1\0\1\11\13\1\1\0\1\11\1\0\5\1"+
    "\2\11\5\1\1\11\10\1\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[88];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
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
    while (i < 2244) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 45: break;
        case 9: 
          { lexeme=yytext(); return ID;
          }
        case 46: break;
        case 30: 
          { lexeme=yytext(); return BETWEEN;
          }
        case 47: break;
        case 36: 
          { lexeme=yytext(); return ARRAY;
          }
        case 48: break;
        case 33: 
          { lexeme=yytext(); return ELSE;
          }
        case 49: break;
        case 23: 
          { lexeme=yytext(); return CIN;
          }
        case 50: break;
        case 20: 
          { lexeme=yytext(); return TO;
          }
        case 51: break;
        case 12: 
          { lexeme=yytext(); return OP_SUM;
          }
        case 52: break;
        case 25: 
          { lexeme=yytext(); return PRINT;
          }
        case 53: break;
        case 18: 
          { lexeme=yytext(); return PYC;
          }
        case 54: break;
        case 28: 
          { lexeme=yytext(); return INCREMENT;
          }
        case 55: break;
        case 44: 
          { lexeme=yytext(); return FALSE;
          }
        case 56: break;
        case 42: 
          { lexeme=yytext(); return TRUE;
          }
        case 57: break;
        case 19: 
          { lexeme=yytext(); return NEW_LINE;
          }
        case 58: break;
        case 27: 
          { lexeme=yytext(); return CON_OR;
          }
        case 59: break;
        case 4: 
          { lexeme=yytext(); return OPEN_PARENTESIS;
          }
        case 60: break;
        case 8: 
          { lexeme=yytext(); return BACK_SLASH;
          }
        case 61: break;
        case 7: 
          { lexeme=yytext(); return CLOSE_SQR_BRACKET;
          }
        case 62: break;
        case 29: 
          { lexeme=yytext(); return VARIABLE;
          }
        case 63: break;
        case 32: 
          { lexeme=yytext(); return RETURN;
          }
        case 64: break;
        case 14: 
          { lexeme=yytext(); return OP_MULTI_DIV;
          }
        case 65: break;
        case 21: 
          { lexeme=yytext(); return FOR;
          }
        case 66: break;
        case 34: 
          { lexeme=yytext(); return FUNCTION;
          }
        case 67: break;
        case 2: 
          { lexeme=yytext(); return COLON;
          }
        case 68: break;
        case 35: 
          { lexeme=yytext(); return CON_AND;
          }
        case 69: break;
        case 22: 
          { lexeme=yytext(); return STRING;
          }
        case 70: break;
        case 37: 
          { lexeme=yytext(); return CHAR_ELEMENT;
          }
        case 71: break;
        case 43: 
          { lexeme=yytext(); return MAIN;
          }
        case 72: break;
        case 17: 
          { lexeme=yytext(); return CLOSE_BLOCK;
          }
        case 73: break;
        case 3: 
          { lexeme=yytext(); return CLOSE_PARENTESIS;
          }
        case 74: break;
        case 26: 
          { lexeme=yytext(); return WHILE;
          }
        case 75: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 76: break;
        case 24: 
          { lexeme=yytext(); return IF_SWITCH;
          }
        case 77: break;
        case 15: 
          { lexeme=yytext(); return MOD;
          }
        case 78: break;
        case 39: 
          { lexeme=yytext(); return MATRIX;
          }
        case 79: break;
        case 38: 
          { lexeme=yytext(); return INTENGER;
          }
        case 80: break;
        case 6: 
          { lexeme=yytext(); return OPEN_SQR_BRACKET;
          }
        case 81: break;
        case 41: 
          { lexeme=yytext(); return CHAR;
          }
        case 82: break;
        case 31: 
          { lexeme=yytext(); return NULL;
          }
        case 83: break;
        case 11: 
          { lexeme=yytext(); return LINEA;
          }
        case 84: break;
        case 5: 
          { lexeme=yytext(); return COMA;
          }
        case 85: break;
        case 16: 
          { lexeme=yytext(); return NUMBER;
          }
        case 86: break;
        case 40: 
          { lexeme=yytext(); return BOOLEAN;
          }
        case 87: break;
        case 13: 
          { lexeme=yytext(); return OP_REL;
          }
        case 88: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
