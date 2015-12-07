/* The following code was generated by JFlex 1.4.3 on 12/7/15 1:26 PM */

package com.neueda4j.intellij.plugin.cypher.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.neueda4j.intellij.plugin.cypher.psi.CypherTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/7/15 1:26 PM from the specification file
 * <tt>/Users/fylmtm/workspace/GraphGeeks/intellij-plugin-cypher/src/main/java/com/neueda4j/intellij/plugin/cypher/lexer/_CypherLexer.flex</tt>
 */
public class _CypherLexer implements FlexLexer {
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
    "\11\0\1\1\1\2\1\0\1\1\1\1\22\0\1\1\1\71\1\47"+
    "\1\0\1\40\1\72\1\0\1\45\1\53\1\54\1\51\1\65\1\66"+
    "\1\43\1\44\1\50\1\35\1\34\1\36\7\41\1\61\1\52\1\63"+
    "\1\62\1\64\1\67\1\0\1\4\1\31\1\6\1\14\1\11\1\23"+
    "\1\27\1\7\1\15\1\30\1\33\1\20\1\3\1\13\1\17\1\26"+
    "\1\24\1\10\1\16\1\5\1\12\1\21\1\22\1\25\1\32\1\37"+
    "\1\57\1\46\1\60\1\73\1\40\1\42\1\4\1\31\1\6\1\14"+
    "\1\11\1\23\1\27\1\7\1\15\1\30\1\33\1\20\1\3\1\13"+
    "\1\17\1\26\1\24\1\10\1\16\1\5\1\12\1\21\1\22\1\25"+
    "\1\32\1\37\1\55\1\70\1\56\1\74\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\6\3\1\4\17\3\2\5\1\6"+
    "\1\7\1\10\2\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\1\1\32\1\33\6\3"+
    "\1\34\40\3\1\35\1\4\1\36\11\3\1\37\1\40"+
    "\17\3\1\41\1\3\2\0\1\42\1\0\1\43\3\0"+
    "\1\44\3\0\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\3\3\1\53\1\54\1\55\1\3\1\56\15\3\1\57"+
    "\15\3\1\60\4\3\1\61\10\3\1\62\15\3\1\63"+
    "\1\3\1\4\11\3\1\4\10\3\1\64\2\3\1\65"+
    "\1\66\5\0\2\3\1\4\3\3\1\67\1\70\4\3"+
    "\1\71\10\3\1\4\11\3\1\72\1\73\7\3\1\74"+
    "\1\75\1\76\1\77\1\3\1\100\6\3\1\101\2\3"+
    "\1\102\5\3\1\103\2\3\1\104\1\105\1\3\1\106"+
    "\5\3\1\107\1\110\1\111\1\0\1\112\1\0\1\113"+
    "\1\114\11\3\1\115\17\3\1\116\2\3\1\117\5\3"+
    "\1\120\1\121\3\3\1\122\2\3\1\123\1\124\1\125"+
    "\5\3\1\126\1\127\1\3\1\130\3\3\1\131\1\132"+
    "\4\3\1\133\1\134\1\135\2\3\1\136\1\137\1\140"+
    "\1\141\1\3\1\142\1\3\1\143\1\4\1\3\1\144"+
    "\2\3\1\145\10\3\1\146\1\3\1\147\5\3\1\150"+
    "\5\3\1\151\3\3\1\152\1\3\1\153\2\3\1\154"+
    "\1\155\10\3\1\156\1\3\1\157\12\3\1\160\1\161"+
    "\10\3\1\162\1\163";

  private static int [] zzUnpackAction() {
    int [] result = new int[463];
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
    "\0\0\0\75\0\172\0\267\0\364\0\u0131\0\u016e\0\u01ab"+
    "\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319\0\u0356\0\u0393"+
    "\0\u03d0\0\u040d\0\u044a\0\u0487\0\u04c4\0\u0501\0\u053e\0\u057b"+
    "\0\u05b8\0\u05f5\0\u0632\0\u066f\0\u06ac\0\u06e9\0\u0726\0\u0763"+
    "\0\u07a0\0\75\0\75\0\u07dd\0\75\0\75\0\75\0\75"+
    "\0\u081a\0\75\0\u0857\0\u0894\0\u08d1\0\u090e\0\75\0\75"+
    "\0\75\0\u094b\0\75\0\75\0\u0988\0\u09c5\0\u0a02\0\u0a3f"+
    "\0\u0a7c\0\u0ab9\0\u0af6\0\u0b33\0\u0b70\0\u0bad\0\u0bea\0\u0c27"+
    "\0\u0c64\0\u0ca1\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f"+
    "\0\u0e4c\0\u0e89\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\u0fba\0\u0ff7"+
    "\0\u1034\0\u1071\0\u10ae\0\u10eb\0\u1128\0\u1165\0\u11a2\0\u11df"+
    "\0\u121c\0\u1259\0\u1296\0\u12d3\0\u040d\0\u040d\0\u1310\0\u134d"+
    "\0\u138a\0\u13c7\0\u1404\0\u1441\0\u147e\0\u14bb\0\u14f8\0\u1535"+
    "\0\u040d\0\u1572\0\u15af\0\u15ec\0\u1629\0\u1666\0\u16a3\0\u16e0"+
    "\0\u171d\0\u175a\0\u1797\0\u17d4\0\u1811\0\u184e\0\u188b\0\u18c8"+
    "\0\u040d\0\u1905\0\u1942\0\u197f\0\75\0\u0726\0\75\0\u19bc"+
    "\0\u0763\0\u19f9\0\u1a36\0\u1a73\0\u1ab0\0\u1aed\0\75\0\75"+
    "\0\75\0\75\0\75\0\75\0\u1b2a\0\u1b67\0\u1ba4\0\u040d"+
    "\0\u040d\0\u1be1\0\u1c1e\0\u1c5b\0\u1c98\0\u1cd5\0\u1d12\0\u1d4f"+
    "\0\u1d8c\0\u1dc9\0\u1e06\0\u1e43\0\u1e80\0\u1ebd\0\u1efa\0\u1f37"+
    "\0\u1f74\0\u040d\0\u1fb1\0\u1fee\0\u202b\0\u2068\0\u20a5\0\u20e2"+
    "\0\u211f\0\u215c\0\u2199\0\u21d6\0\u2213\0\u2250\0\u228d\0\u22ca"+
    "\0\u2307\0\u2344\0\u2381\0\u23be\0\u23fb\0\u2438\0\u2475\0\u24b2"+
    "\0\u24ef\0\u252c\0\u2569\0\u25a6\0\u25e3\0\u040d\0\u2620\0\u265d"+
    "\0\u269a\0\u26d7\0\u2714\0\u2751\0\u278e\0\u27cb\0\u2808\0\u2845"+
    "\0\u2882\0\u28bf\0\u28fc\0\u040d\0\u2939\0\u2976\0\u29b3\0\u29f0"+
    "\0\u2a2d\0\u2a6a\0\u2aa7\0\u2ae4\0\u2b21\0\u2b5e\0\u2b9b\0\u2bd8"+
    "\0\u2c15\0\u2c52\0\u2c8f\0\u2ccc\0\u2d09\0\u2d46\0\u2d83\0\u2dc0"+
    "\0\u040d\0\u2dfd\0\u2e3a\0\u1942\0\75\0\u2e77\0\u2eb4\0\u2ef1"+
    "\0\u2f2e\0\u2f6b\0\u2fa8\0\u2fe5\0\u3022\0\u305f\0\u309c\0\u30d9"+
    "\0\u040d\0\u040d\0\u3116\0\u3153\0\u3190\0\u31cd\0\u040d\0\u320a"+
    "\0\u3247\0\u3284\0\u32c1\0\u32fe\0\u333b\0\u3378\0\u33b5\0\u33f2"+
    "\0\u342f\0\u346c\0\u34a9\0\u34e6\0\u3523\0\u3560\0\u359d\0\u35da"+
    "\0\u3617\0\u040d\0\u040d\0\u3654\0\u3691\0\u36ce\0\u370b\0\u3748"+
    "\0\u3785\0\u37c2\0\u040d\0\u040d\0\u0bad\0\u040d\0\u37ff\0\u383c"+
    "\0\u3879\0\u38b6\0\u38f3\0\u3930\0\u396d\0\u39aa\0\u040d\0\u39e7"+
    "\0\u3a24\0\u040d\0\u3a61\0\u3a9e\0\u3adb\0\u3b18\0\u3b55\0\u040d"+
    "\0\u3b92\0\u3bcf\0\u040d\0\u040d\0\u3c0c\0\u040d\0\u3c49\0\u3c86"+
    "\0\u3cc3\0\u3d00\0\u3d3d\0\u040d\0\u1a73\0\75\0\u3d7a\0\75"+
    "\0\u3db7\0\u040d\0\u040d\0\u3df4\0\u3e31\0\u3e6e\0\u3eab\0\u3ee8"+
    "\0\u3f25\0\u3f62\0\u3f9f\0\u3fdc\0\u040d\0\u4019\0\u4056\0\u4093"+
    "\0\u40d0\0\u410d\0\u414a\0\u4187\0\u41c4\0\u4201\0\u423e\0\u427b"+
    "\0\u42b8\0\u42f5\0\u4332\0\u436f\0\u040d\0\u43ac\0\u43e9\0\u040d"+
    "\0\u4426\0\u4463\0\u44a0\0\u44dd\0\u451a\0\u040d\0\u4557\0\u4594"+
    "\0\u45d1\0\u460e\0\u040d\0\u464b\0\u4688\0\u040d\0\u040d\0\u040d"+
    "\0\u46c5\0\u4702\0\u473f\0\u477c\0\u47b9\0\75\0\75\0\u47f6"+
    "\0\u040d\0\u4833\0\u4870\0\u48ad\0\u040d\0\u040d\0\u48ea\0\u4927"+
    "\0\u4964\0\u49a1\0\u040d\0\u040d\0\u040d\0\u49de\0\u4a1b\0\u040d"+
    "\0\u040d\0\u040d\0\u040d\0\u4a58\0\u040d\0\u4a95\0\u040d\0\u4ad2"+
    "\0\u4b0f\0\u040d\0\u4b4c\0\u4b89\0\u040d\0\u4bc6\0\u4c03\0\u4c40"+
    "\0\u4c7d\0\u4cba\0\u4cf7\0\u4d34\0\u4d71\0\u040d\0\u4dae\0\u040d"+
    "\0\u4deb\0\u4e28\0\u4e65\0\u4ea2\0\u4edf\0\u040d\0\u4f1c\0\u4f59"+
    "\0\u4f96\0\u4fd3\0\u4ad2\0\u040d\0\u5010\0\u504d\0\u508a\0\u040d"+
    "\0\u50c7\0\u040d\0\u5104\0\u5141\0\u040d\0\u040d\0\u517e\0\u51bb"+
    "\0\u51f8\0\u5235\0\u5272\0\u52af\0\u52ec\0\u5329\0\u040d\0\u5366"+
    "\0\u040d\0\u53a3\0\u53e0\0\u541d\0\u545a\0\u5497\0\u54d4\0\u5511"+
    "\0\u554e\0\u558b\0\u55c8\0\u0bad\0\u040d\0\u5605\0\u5642\0\u567f"+
    "\0\u56bc\0\u56f9\0\u5736\0\u5773\0\u57b0\0\u040d\0\u040d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[463];
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
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\22\1\25\1\26\1\22\1\27"+
    "\1\30\1\22\1\31\1\32\1\33\1\32\2\22\1\32"+
    "\1\34\1\35\1\36\1\37\1\2\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\1\63\1\64\1\2\76\0\2\3\75\0\1\22\1\65"+
    "\4\22\1\66\3\22\1\67\24\22\36\0\2\22\1\70"+
    "\1\71\4\22\1\72\2\22\1\73\1\22\1\74\1\75"+
    "\7\22\1\76\10\22\36\0\1\22\1\77\2\22\1\100"+
    "\1\101\4\22\1\102\1\22\1\103\12\22\1\104\7\22"+
    "\36\0\1\22\1\105\3\22\1\106\1\107\4\22\1\110"+
    "\1\111\22\22\36\0\1\22\1\112\4\22\1\113\30\22"+
    "\36\0\1\22\1\114\1\115\3\22\1\116\3\22\1\117"+
    "\1\22\1\120\22\22\36\0\10\22\1\121\4\22\1\122"+
    "\4\22\1\123\14\22\36\0\10\22\1\124\2\22\1\125"+
    "\7\22\1\126\13\22\36\0\7\22\1\127\4\22\1\130"+
    "\22\22\36\0\5\22\1\131\1\132\3\22\1\133\24\22"+
    "\36\0\10\22\1\134\1\135\1\22\1\136\23\22\36\0"+
    "\2\22\1\137\1\140\1\141\1\22\1\142\1\143\2\22"+
    "\1\144\6\22\1\145\1\22\1\146\4\22\1\147\6\22"+
    "\36\0\5\22\1\150\2\22\1\151\12\22\1\152\13\22"+
    "\36\0\1\22\1\153\1\115\3\22\1\154\3\22\1\155"+
    "\1\22\1\156\22\22\36\0\37\22\36\0\4\22\1\157"+
    "\5\22\1\160\24\22\36\0\1\22\1\161\3\22\1\162"+
    "\4\22\1\163\1\22\1\164\1\165\21\22\36\0\14\22"+
    "\1\166\22\22\36\0\6\22\1\167\3\22\1\135\24\22"+
    "\36\0\14\22\1\170\22\22\36\0\27\22\1\171\7\22"+
    "\36\0\6\22\1\172\30\22\67\0\3\32\2\0\1\32"+
    "\2\0\1\173\74\0\1\173\30\0\42\174\1\0\32\174"+
    "\34\0\1\32\1\33\1\32\2\0\1\32\77\0\1\175"+
    "\30\0\45\176\1\177\1\200\26\176\46\201\1\202\1\177"+
    "\25\201\50\0\1\203\1\204\77\0\1\205\63\0\1\206"+
    "\125\0\1\207\62\0\1\210\1\0\1\211\72\0\1\212"+
    "\46\0\1\32\1\33\1\32\2\0\1\32\20\0\1\213"+
    "\74\0\1\214\15\0\2\22\1\215\17\22\1\135\14\22"+
    "\36\0\5\22\1\216\31\22\36\0\10\22\1\135\26\22"+
    "\36\0\1\22\1\217\35\22\36\0\14\22\1\76\22\22"+
    "\36\0\11\22\1\220\15\22\1\221\7\22\36\0\3\22"+
    "\1\222\6\22\1\67\1\223\23\22\36\0\15\22\1\224"+
    "\21\22\36\0\24\22\1\135\12\22\36\0\13\22\1\135"+
    "\23\22\36\0\10\22\1\135\1\22\1\225\24\22\36\0"+
    "\6\22\1\226\30\22\36\0\7\22\1\227\2\22\1\230"+
    "\24\22\36\0\1\231\36\22\36\0\7\22\1\232\2\22"+
    "\1\233\1\234\1\22\1\235\2\22\1\236\16\22\36\0"+
    "\23\22\1\237\13\22\36\0\13\22\1\240\23\22\36\0"+
    "\6\22\1\241\30\22\36\0\12\22\1\225\24\22\36\0"+
    "\16\22\1\242\20\22\36\0\1\243\1\244\1\135\4\22"+
    "\1\245\1\246\2\22\1\135\1\22\1\247\21\22\36\0"+
    "\13\22\1\135\2\22\1\250\20\22\36\0\1\22\1\251"+
    "\35\22\36\0\10\22\1\252\1\253\25\22\36\0\5\22"+
    "\1\254\31\22\36\0\1\255\1\22\1\256\6\22\1\257"+
    "\3\22\1\260\1\261\4\22\1\262\13\22\36\0\24\22"+
    "\1\263\12\22\36\0\7\22\1\264\27\22\36\0\11\22"+
    "\1\265\25\22\36\0\13\22\1\266\23\22\36\0\2\22"+
    "\1\267\7\22\1\270\10\22\1\135\13\22\36\0\12\22"+
    "\1\271\4\22\1\272\17\22\36\0\12\22\1\273\24\22"+
    "\36\0\23\22\1\274\13\22\36\0\15\22\1\275\21\22"+
    "\36\0\2\22\1\276\5\22\1\277\1\300\25\22\36\0"+
    "\14\22\1\301\22\22\36\0\2\22\1\302\10\22\1\303"+
    "\1\22\1\304\6\22\1\305\12\22\36\0\13\22\1\306"+
    "\23\22\36\0\11\22\1\307\25\22\36\0\1\22\1\310"+
    "\3\22\1\135\3\22\1\311\25\22\36\0\1\22\1\312"+
    "\35\22\36\0\14\22\1\313\22\22\36\0\2\22\1\314"+
    "\34\22\36\0\1\135\25\22\1\315\10\22\36\0\10\22"+
    "\1\316\13\22\1\67\7\22\1\237\2\22\36\0\5\22"+
    "\1\317\31\22\36\0\15\22\1\320\21\22\36\0\12\22"+
    "\1\321\24\22\36\0\11\22\1\322\25\22\36\0\2\22"+
    "\1\323\34\22\36\0\13\22\1\317\12\22\1\324\10\22"+
    "\36\0\10\22\1\325\7\22\1\317\16\22\36\0\1\326"+
    "\36\22\36\0\1\22\1\327\15\22\1\274\4\22\1\330"+
    "\12\22\36\0\6\22\1\331\30\22\36\0\2\22\1\332"+
    "\34\22\36\0\15\22\1\333\21\22\36\0\14\22\1\334"+
    "\22\22\36\0\6\22\1\335\6\22\1\336\21\22\36\0"+
    "\5\22\1\337\31\22\36\0\14\22\1\340\22\22\36\0"+
    "\5\22\1\341\31\22\36\0\5\22\1\342\31\22\36\0"+
    "\12\22\1\343\24\22\36\0\27\22\1\76\7\22\67\0"+
    "\3\344\2\0\1\344\33\0\42\174\1\345\32\174\2\176"+
    "\1\0\72\176\2\201\1\0\72\201\2\203\1\0\72\203"+
    "\51\204\1\346\23\204\43\0\1\347\17\0\1\350\64\0"+
    "\1\351\10\0\1\352\13\0\3\22\1\353\33\22\36\0"+
    "\24\22\1\354\12\22\36\0\10\22\1\355\26\22\36\0"+
    "\6\22\1\356\30\22\36\0\6\22\1\357\30\22\36\0"+
    "\13\22\1\360\23\22\36\0\15\22\1\135\21\22\36\0"+
    "\10\22\1\361\26\22\36\0\6\22\1\362\30\22\36\0"+
    "\1\135\36\22\36\0\6\22\1\363\30\22\36\0\23\22"+
    "\1\126\13\22\36\0\10\22\1\317\26\22\36\0\2\22"+
    "\1\364\34\22\36\0\14\22\1\365\22\22\36\0\15\22"+
    "\1\366\21\22\36\0\6\22\1\135\30\22\36\0\6\22"+
    "\1\367\30\22\36\0\1\22\1\370\35\22\36\0\1\371"+
    "\36\22\36\0\15\22\1\372\21\22\36\0\10\22\1\373"+
    "\26\22\36\0\2\22\1\374\10\22\1\375\23\22\36\0"+
    "\15\22\1\376\21\22\36\0\6\22\1\377\30\22\36\0"+
    "\11\22\1\u0100\25\22\36\0\11\22\1\135\12\22\1\237"+
    "\12\22\36\0\12\22\1\u0101\24\22\36\0\12\22\1\230"+
    "\24\22\36\0\14\22\1\u0102\22\22\36\0\7\22\1\u0103"+
    "\27\22\36\0\7\22\1\u0104\27\22\36\0\1\22\1\u0105"+
    "\11\22\1\135\23\22\36\0\6\22\1\u0106\30\22\36\0"+
    "\15\22\1\u0107\21\22\36\0\4\22\1\317\32\22\36\0"+
    "\10\22\1\u0108\26\22\36\0\10\22\1\u0109\2\22\1\u010a"+
    "\23\22\36\0\6\22\1\u010b\30\22\36\0\5\22\1\u010c"+
    "\31\22\36\0\13\22\1\u010d\23\22\36\0\14\22\1\u010e"+
    "\4\22\1\u010f\15\22\36\0\12\22\1\u0110\24\22\36\0"+
    "\10\22\1\u0111\26\22\36\0\6\22\1\u0112\30\22\36\0"+
    "\15\22\1\u0113\21\22\36\0\6\22\1\u0114\30\22\36\0"+
    "\6\22\1\u0115\30\22\36\0\23\22\1\u0116\13\22\36\0"+
    "\1\22\1\u0117\35\22\36\0\3\22\1\u0118\33\22\36\0"+
    "\6\22\1\u0119\30\22\36\0\5\22\1\u011a\31\22\36\0"+
    "\2\22\1\u011b\34\22\36\0\6\22\1\u011c\30\22\36\0"+
    "\5\22\1\u011d\31\22\36\0\11\22\1\u011e\25\22\36\0"+
    "\10\22\1\u011f\26\22\36\0\5\22\1\u0120\31\22\36\0"+
    "\13\22\1\234\23\22\36\0\24\22\1\u0121\12\22\36\0"+
    "\2\22\1\135\34\22\36\0\12\22\1\317\24\22\36\0"+
    "\23\22\1\u0122\13\22\36\0\6\22\1\u0123\30\22\36\0"+
    "\12\22\1\u0124\24\22\36\0\6\22\1\u0125\30\22\36\0"+
    "\24\22\1\u0126\12\22\36\0\12\22\1\u0127\24\22\36\0"+
    "\11\22\1\u0128\25\22\36\0\31\22\1\u0129\5\22\36\0"+
    "\5\22\1\u012a\2\22\1\u012b\26\22\36\0\4\22\1\u012c"+
    "\32\22\36\0\13\22\1\u012d\23\22\36\0\1\u012e\36\22"+
    "\36\0\15\22\1\u012f\21\22\36\0\2\22\1\u0130\34\22"+
    "\36\0\6\22\1\u0131\30\22\36\0\14\22\1\u0112\22\22"+
    "\36\0\3\22\1\u0132\6\22\1\u0133\24\22\36\0\10\22"+
    "\1\u0134\26\22\33\0\50\204\1\u0135\1\346\23\204\57\0"+
    "\1\u0136\60\0\1\u0137\105\0\1\u0138\73\0\1\u0139\24\0"+
    "\4\22\1\u013a\32\22\36\0\6\22\1\u013b\30\22\36\0"+
    "\33\22\1\135\3\22\36\0\10\22\1\u013c\26\22\36\0"+
    "\5\22\1\u013d\31\22\36\0\4\22\1\u013e\32\22\36\0"+
    "\13\22\1\u013f\23\22\36\0\5\22\1\u0140\31\22\36\0"+
    "\17\22\1\274\17\22\36\0\14\22\1\u0141\22\22\36\0"+
    "\2\22\1\u0142\34\22\36\0\12\22\1\u0143\24\22\36\0"+
    "\6\22\1\u0144\30\22\36\0\2\22\1\u0145\34\22\36\0"+
    "\1\22\1\u0146\35\22\36\0\2\22\1\u0147\34\22\36\0"+
    "\6\22\1\u0148\30\22\36\0\5\22\1\u0149\31\22\36\0"+
    "\6\22\1\u014a\30\22\36\0\1\22\1\u014b\35\22\36\0"+
    "\16\22\1\u014c\20\22\36\0\5\22\1\u014d\31\22\36\0"+
    "\3\22\1\u014e\33\22\36\0\2\22\1\u014f\34\22\36\0"+
    "\5\22\1\u0150\31\22\36\0\1\22\1\u0151\35\22\36\0"+
    "\11\22\1\135\25\22\36\0\14\22\1\u0152\22\22\36\0"+
    "\1\22\1\u0153\35\22\36\0\2\22\1\u0154\34\22\36\0"+
    "\10\22\1\u0155\26\22\36\0\7\22\1\u0156\27\22\36\0"+
    "\10\22\1\u0157\26\22\36\0\24\22\1\u0158\12\22\36\0"+
    "\5\22\1\135\31\22\36\0\3\22\1\u0159\33\22\36\0"+
    "\6\22\1\u015a\30\22\36\0\2\22\1\u015b\34\22\36\0"+
    "\6\22\1\u015c\30\22\36\0\12\22\1\u015d\24\22\36\0"+
    "\22\22\1\u015e\14\22\36\0\2\22\1\u015f\34\22\36\0"+
    "\6\22\1\u0160\30\22\36\0\2\22\1\u0161\34\22\36\0"+
    "\15\22\1\u0162\21\22\36\0\5\22\1\u0163\31\22\36\0"+
    "\14\22\1\u0164\22\22\36\0\15\22\1\76\21\22\36\0"+
    "\2\22\1\u0165\34\22\36\0\2\22\1\u0166\34\22\36\0"+
    "\32\22\1\135\4\22\36\0\6\22\1\u0167\30\22\36\0"+
    "\6\22\1\u0168\30\22\36\0\11\22\1\u0169\25\22\36\0"+
    "\6\22\1\u016a\30\22\36\0\1\22\1\u016b\35\22\36\0"+
    "\6\22\1\u016c\30\22\36\0\14\22\1\u016d\22\22\112\0"+
    "\1\u016e\71\0\1\u016f\23\0\11\22\1\u0170\25\22\36\0"+
    "\2\22\1\u0171\34\22\36\0\14\22\1\u0172\22\22\36\0"+
    "\2\22\1\u0173\34\22\36\0\12\22\1\u0174\24\22\36\0"+
    "\1\22\1\317\35\22\36\0\6\22\1\u0175\30\22\36\0"+
    "\2\22\1\u0176\34\22\36\0\13\22\1\u0151\23\22\36\0"+
    "\12\22\1\u0177\24\22\36\0\5\22\1\u0178\31\22\36\0"+
    "\3\22\1\317\33\22\36\0\13\22\1\u0179\23\22\36\0"+
    "\5\22\1\u017a\31\22\36\0\10\22\1\76\26\22\36\0"+
    "\6\22\1\u017b\30\22\36\0\10\22\1\u017c\26\22\36\0"+
    "\6\22\1\u017d\30\22\36\0\12\22\1\u017e\24\22\36\0"+
    "\13\22\1\237\23\22\36\0\3\22\1\237\33\22\36\0"+
    "\11\22\1\237\25\22\36\0\3\22\1\u017f\33\22\36\0"+
    "\13\22\1\u0180\23\22\36\0\6\22\1\u0181\30\22\36\0"+
    "\11\22\1\u0182\25\22\36\0\4\22\1\u0183\32\22\36\0"+
    "\10\22\1\u0184\26\22\36\0\6\22\1\u0185\30\22\36\0"+
    "\6\22\1\76\30\22\36\0\10\22\1\u0186\26\22\36\0"+
    "\10\22\1\u0109\2\22\1\u0187\23\22\36\0\16\22\1\u0188"+
    "\20\22\36\0\6\22\1\u0189\30\22\36\0\6\22\1\u018a"+
    "\30\22\36\0\10\22\1\u018b\26\22\36\0\4\22\1\135"+
    "\32\22\36\0\2\22\1\u018c\34\22\36\0\5\22\1\u018d"+
    "\31\22\36\0\3\22\1\u018e\33\22\36\0\10\22\1\u018f"+
    "\26\22\36\0\11\22\1\u0190\25\22\36\0\12\22\1\u0191"+
    "\24\22\36\0\5\22\1\u0192\31\22\36\0\1\22\1\u0193"+
    "\35\22\36\0\10\22\1\75\26\22\36\0\10\22\1\u0194"+
    "\26\22\36\0\1\22\1\u0195\35\22\36\0\12\22\1\67"+
    "\24\22\36\0\13\22\1\u0196\23\22\36\0\14\22\1\u0197"+
    "\22\22\36\0\2\22\1\u0198\34\22\36\0\11\22\1\u0199"+
    "\25\22\36\0\3\22\1\u019a\33\22\36\0\23\22\1\135"+
    "\13\22\36\0\13\22\1\u019b\23\22\36\0\1\22\1\u019c"+
    "\35\22\36\0\6\22\1\u019d\30\22\36\0\4\22\1\u019e"+
    "\32\22\36\0\2\22\1\u019f\34\22\36\0\12\22\1\u01a0"+
    "\24\22\36\0\10\22\1\u01a1\26\22\36\0\2\22\1\u01a2"+
    "\34\22\36\0\1\u01a3\36\22\36\0\13\22\1\u01a4\23\22"+
    "\36\0\12\22\1\u01a5\24\22\36\0\10\22\1\u01a6\26\22"+
    "\36\0\12\22\1\u01a7\24\22\36\0\2\22\1\u01a8\34\22"+
    "\36\0\2\22\1\u01a9\34\22\36\0\15\22\1\u01aa\21\22"+
    "\36\0\5\22\1\u01ab\31\22\36\0\12\22\1\u01ac\24\22"+
    "\36\0\3\22\1\u01ad\33\22\36\0\24\22\1\u01ae\12\22"+
    "\36\0\6\22\1\u01af\30\22\36\0\10\22\1\u01b0\26\22"+
    "\36\0\13\22\1\u01b1\23\22\36\0\10\22\1\u01b2\26\22"+
    "\36\0\23\22\1\u01b3\13\22\36\0\1\u01b4\36\22\36\0"+
    "\15\22\1\u01b5\21\22\36\0\13\22\1\u01b6\23\22\36\0"+
    "\2\22\1\u01b7\34\22\36\0\4\22\1\u01b8\32\22\36\0"+
    "\24\22\1\u01b9\12\22\36\0\1\22\1\u01ba\35\22\36\0"+
    "\12\22\1\u01bb\24\22\36\0\6\22\1\u01bc\30\22\36\0"+
    "\2\22\1\u01bd\34\22\36\0\12\22\1\u01be\24\22\36\0"+
    "\2\22\1\u01bf\34\22\36\0\10\22\1\u01c0\26\22\36\0"+
    "\3\22\1\u01c1\5\22\1\u01c2\25\22\36\0\23\22\1\u01c3"+
    "\13\22\36\0\23\22\1\u01c4\13\22\36\0\4\22\1\u01c5"+
    "\32\22\36\0\1\22\1\u01c6\35\22\36\0\14\22\1\233"+
    "\22\22\36\0\12\22\1\u01c7\24\22\36\0\1\22\1\u01c8"+
    "\35\22\36\0\2\22\1\u01c9\34\22\36\0\13\22\1\u01ca"+
    "\23\22\36\0\2\22\1\u01cb\34\22\36\0\14\22\1\u01cc"+
    "\22\22\36\0\3\22\1\135\33\22\36\0\4\22\1\u01cd"+
    "\32\22\36\0\5\22\1\u01ce\31\22\36\0\13\22\1\u01cf"+
    "\23\22\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[22509];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

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
    "\1\0\1\11\37\1\2\11\1\1\4\11\1\1\1\11"+
    "\4\1\3\11\1\1\2\11\106\1\2\0\1\11\1\0"+
    "\1\11\3\0\1\1\3\0\6\11\130\1\1\11\5\0"+
    "\113\1\1\11\1\0\1\11\1\0\64\1\2\11\140\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[463];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _CypherLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _CypherLexer(java.io.Reader in) {
    this.zzReader = in;
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
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
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
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
        case 103: 
          { return K_EXTRACT;
          }
        case 116: break;
        case 52: 
          { return K_XOR;
          }
        case 117: break;
        case 20: 
          { return OP_LESSTHEN;
          }
        case 118: break;
        case 21: 
          { return OP_GREATHERTHEN;
          }
        case 119: break;
        case 29: 
          { return K_IN;
          }
        case 120: break;
        case 91: 
          { return K_REMOVE;
          }
        case 121: break;
        case 109: 
          { return K_ASCENDING;
          }
        case 122: break;
        case 85: 
          { return K_FALSE;
          }
        case 123: break;
        case 73: 
          { return OP_STARTRELPATTERN;
          }
        case 124: break;
        case 5: 
          { return L_INTEGER;
          }
        case 125: break;
        case 15: 
          { return BRACKET_CURLYCLOSE;
          }
        case 126: break;
        case 36: 
          { return LINECOMMENT;
          }
        case 127: break;
        case 26: 
          { return OP_MODULO;
          }
        case 128: break;
        case 8: 
          { return OP_DOT;
          }
        case 129: break;
        case 107: 
          { return K_OPTIONAL;
          }
        case 130: break;
        case 68: 
          { return K_WHEN;
          }
        case 131: break;
        case 67: 
          { return K_LOAD;
          }
        case 132: break;
        case 112: 
          { return K_RELATIONSHIP;
          }
        case 133: break;
        case 72: 
          { return BLOCKCOMMENT;
          }
        case 134: break;
        case 48: 
          { return K_REL;
          }
        case 135: break;
        case 114: 
          { return K_FIELDTERMINATOR;
          }
        case 136: break;
        case 61: 
          { return K_NONE;
          }
        case 137: break;
        case 113: 
          { return K_SHORTESTPATH;
          }
        case 138: break;
        case 104: 
          { return K_FOREACH;
          }
        case 139: break;
        case 90: 
          { return K_COMMIT;
          }
        case 140: break;
        case 31: 
          { return K_OR;
          }
        case 141: break;
        case 115: 
          { return K_ALLSHORTESTPATHS;
          }
        case 142: break;
        case 110: 
          { return K_CONSTRAINT;
          }
        case 143: break;
        case 53: 
          { return L_DECIMAL;
          }
        case 144: break;
        case 102: 
          { return K_HEADERS;
          }
        case 145: break;
        case 80: 
          { return K_INDEX;
          }
        case 146: break;
        case 30: 
          { return K_IS;
          }
        case 147: break;
        case 6: 
          { return OP_BACTICK;
          }
        case 148: break;
        case 84: 
          { return K_WHERE;
          }
        case 149: break;
        case 60: 
          { return K_NULL;
          }
        case 150: break;
        case 17: 
          { return BRACKET_SQUARECLOSE;
          }
        case 151: break;
        case 2: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 152: break;
        case 11: 
          { return SEMICOLON;
          }
        case 153: break;
        case 96: 
          { return K_UNWIND;
          }
        case 154: break;
        case 63: 
          { return K_DROP;
          }
        case 155: break;
        case 7: 
          { return OP_MINUS;
          }
        case 156: break;
        case 34: 
          { return OP_RANGE;
          }
        case 157: break;
        case 44: 
          { return K_ANY;
          }
        case 158: break;
        case 22: 
          { return OP_PLUS;
          }
        case 159: break;
        case 39: 
          { return OP_INVALIDNOTEQUALS;
          }
        case 160: break;
        case 75: 
          { return K_MATCH;
          }
        case 161: break;
        case 82: 
          { return K_ORDER;
          }
        case 162: break;
        case 106: 
          { return K_DISTINCT;
          }
        case 163: break;
        case 83: 
          { return K_LIMIT;
          }
        case 164: break;
        case 99: 
          { return K_STARTS;
          }
        case 165: break;
        case 70: 
          { return K_FROM;
          }
        case 166: break;
        case 50: 
          { return K_NOT;
          }
        case 167: break;
        case 10: 
          { return OP_MUL;
          }
        case 168: break;
        case 100: 
          { return K_SINGLE;
          }
        case 169: break;
        case 33: 
          { return K_BY;
          }
        case 170: break;
        case 28: 
          { return K_AS;
          }
        case 171: break;
        case 62: 
          { return K_NODE;
          }
        case 172: break;
        case 93: 
          { return K_REDUCE;
          }
        case 173: break;
        case 46: 
          { return K_ALL;
          }
        case 174: break;
        case 66: 
          { return K_SKIP;
          }
        case 175: break;
        case 42: 
          { return OP_NOTEQUALS;
          }
        case 176: break;
        case 19: 
          { return OP_EQUAL;
          }
        case 177: break;
        case 16: 
          { return BRACKET_SQUAREOPEN;
          }
        case 178: break;
        case 13: 
          { return PARENTHESE_CLOSE;
          }
        case 179: break;
        case 92: 
          { return K_RETURN;
          }
        case 180: break;
        case 78: 
          { return K_UNION;
          }
        case 181: break;
        case 98: 
          { return K_DELETE;
          }
        case 182: break;
        case 101: 
          { return K_FILTER;
          }
        case 183: break;
        case 18: 
          { return OP_COLON;
          }
        case 184: break;
        case 88: 
          { return K_ASSERT;
          }
        case 185: break;
        case 35: 
          { return L_STRING;
          }
        case 186: break;
        case 12: 
          { return PARENTHESE_OPEN;
          }
        case 187: break;
        case 71: 
          { return K_JOIN;
          }
        case 188: break;
        case 24: 
          { return OP_QUESTIONSIGN;
          }
        case 189: break;
        case 54: 
          { return L_IDENTIFIER_TEXT;
          }
        case 190: break;
        case 74: 
          { return OP_ENDRELPATTERN;
          }
        case 191: break;
        case 59: 
          { return K_ELSE;
          }
        case 192: break;
        case 69: 
          { return K_WITH;
          }
        case 193: break;
        case 87: 
          { return OP_ENDRELPATTERNDIRECTED;
          }
        case 194: break;
        case 55: 
          { return K_THEN;
          }
        case 195: break;
        case 47: 
          { return K_CSV;
          }
        case 196: break;
        case 25: 
          { return OP_PIPE;
          }
        case 197: break;
        case 57: 
          { return K_CASE;
          }
        case 198: break;
        case 43: 
          { return K_AND;
          }
        case 199: break;
        case 45: 
          { return K_ASC;
          }
        case 200: break;
        case 41: 
          { return OP_PLUSEQUALS;
          }
        case 201: break;
        case 111: 
          { return K_DESCENDING;
          }
        case 202: break;
        case 23: 
          { return OP_COMMA;
          }
        case 203: break;
        case 79: 
          { return K_USING;
          }
        case 204: break;
        case 95: 
          { return K_UNIQUE;
          }
        case 205: break;
        case 3: 
          { return L_IDENTIFIER;
          }
        case 206: break;
        case 108: 
          { return K_PERIODIC;
          }
        case 207: break;
        case 14: 
          { return BRACKET_CURLYOPEN;
          }
        case 208: break;
        case 81: 
          { return K_START;
          }
        case 209: break;
        case 49: 
          { return K_END;
          }
        case 210: break;
        case 32: 
          { return K_ON;
          }
        case 211: break;
        case 1: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 212: break;
        case 65: 
          { return K_SCAN;
          }
        case 213: break;
        case 40: 
          { return OP_GREATERTHANEQUALS;
          }
        case 214: break;
        case 105: 
          { return K_CONTAINS;
          }
        case 215: break;
        case 58: 
          { return K_ENDS;
          }
        case 216: break;
        case 51: 
          { return K_SET;
          }
        case 217: break;
        case 77: 
          { return K_COUNT;
          }
        case 218: break;
        case 56: 
          { return K_TRUE;
          }
        case 219: break;
        case 38: 
          { return OP_LESSTHANEQUALS;
          }
        case 220: break;
        case 86: 
          { return OP_STARTRELPATTERNDIRECTED;
          }
        case 221: break;
        case 76: 
          { return K_MERGE;
          }
        case 222: break;
        case 27: 
          { return OP_POW;
          }
        case 223: break;
        case 89: 
          { return K_CREATE;
          }
        case 224: break;
        case 94: 
          { return K_EXISTS;
          }
        case 225: break;
        case 4: 
          { return L_FUNCTION;
          }
        case 226: break;
        case 9: 
          { return OP_DIVIDE;
          }
        case 227: break;
        case 37: 
          { return OP_REGEXMATCH;
          }
        case 228: break;
        case 64: 
          { return K_DESC;
          }
        case 229: break;
        case 97: 
          { return K_DETACH;
          }
        case 230: break;
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
