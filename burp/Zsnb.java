package burp;

import java.util.Collections;

public class Zsnb {
  public static final byte[] Zn;
  
  private static String[] ZX;
  
  public static Zsqx<Zrdb> ZQ(Zmzk paramZmzk, Zvow paramZvow) {
    String[] arrayOfString = Za();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zx_5(Zzu2.ROBOTS_TXT_FILE, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(null, paramZvow)), (byte)3, (byte)1, paramZmzk, Zn, null);
  }
  
  static {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_5
    //   7: anewarray java/lang/String
    //   10: invokestatic Z_ : ([Ljava/lang/String;)V
    //   13: bipush #23
    //   15: ldc ', sVd\\r-e'
    //   17: iconst_m1
    //   18: goto -> 25
    //   21: astore_0
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_1
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_1
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_1
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #20
    //   94: goto -> 124
    //   97: bipush #101
    //   99: goto -> 124
    //   102: bipush #107
    //   104: goto -> 124
    //   107: bipush #6
    //   109: goto -> 124
    //   112: bipush #46
    //   114: goto -> 124
    //   117: bipush #7
    //   119: goto -> 124
    //   122: bipush #105
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #1, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_1
    //   144: if_icmpgt -> 43
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
    //   166: aload_0
    //   167: invokestatic Zy : (Ljava/lang/String;)[B
    //   170: putstatic burp/Zsnb.Zn : [B
    //   173: return
  }
  
  public static void Z_(String[] paramArrayOfString) {
    ZX = paramArrayOfString;
  }
  
  public static String[] Za() {
    return ZX;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsnb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */