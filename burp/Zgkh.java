package burp;

import net.portswigger.Zc5;
import net.portswigger.Zox;
import net.portswigger.Zsi;
import net.portswigger.Zvd;

@Zsi("Reference")
public final class Zgkh {
  @Zvd(Zp = "title")
  public final String Zg;
  
  @Zvd(Zp = "url")
  public final String ZJ;
  
  private static String[] ZR;
  
  private static final String a;
  
  @Zox
  public Zgkh(@Zc5(Ze = "title") String paramString1, @Zc5(Ze = "url") String paramString2) {
    this.Zg = paramString1;
    this.ZJ = paramString2;
  }
  
  String ZG() {
    String[] arrayOfString = Zz();
    if (Zbqc.Zwu() == null)
      ZA(new String[4]); 
    return a.formatted(new Object[] { this.ZJ, this.Zg });
  }
  
  public static void ZA(String[] paramArrayOfString) {
    ZR = paramArrayOfString;
  }
  
  public static String[] Zz() {
    return ZR;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zz : ()[Ljava/lang/String;
    //   3: ifnull -> 13
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: invokestatic ZA : ([Ljava/lang/String;)V
    //   13: bipush #60
    //   15: ldc 'vN~.z"PrNm9 )\\rRsu++M&d'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zgkh.a : Ljava/lang/String;
    //   24: goto -> 166
    //   27: dup_x2
    //   28: pop
    //   29: invokevirtual toCharArray : ()[C
    //   32: dup_x1
    //   33: arraylength
    //   34: dup_x2
    //   35: pop
    //   36: iconst_0
    //   37: istore_0
    //   38: dup2_x1
    //   39: pop2
    //   40: dup_x2
    //   41: iconst_1
    //   42: if_icmpgt -> 140
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #118
    //   94: goto -> 124
    //   97: bipush #30
    //   99: goto -> 124
    //   102: bipush #43
    //   104: goto -> 124
    //   107: bipush #20
    //   109: goto -> 124
    //   112: bipush #29
    //   114: goto -> 124
    //   117: bipush #115
    //   119: goto -> 124
    //   122: bipush #102
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 48
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 45
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 21
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgkh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */