package burp;

import net.portswigger.Zkb;

public class Ze0p {
  private static String[] Zm;
  
  private static final String a;
  
  static String Zs(Zsp5 paramZsp5) {
    return a + a + paramZsp5.ZmR();
  }
  
  static int Zn(Zlit paramZlit) {
    return (paramZlit.Zd1() + paramZlit.Zd1()).hashCode();
  }
  
  static int Zp(Zlit paramZlit) {
    return (paramZlit.Zds() ? Zkb.ZG(paramZlit.ZdC()) : "").hashCode();
  }
  
  public static int Zw(Zefg<Zzjv> paramZefg) {
    Zeun zeun = new Zeun();
    paramZefg.forEach(zeun::lambda$labelChecksum$0);
    return zeun.ZS();
  }
  
  static int Zs(String paramString) {
    return (paramString == null) ? 0 : paramString.hashCode();
  }
  
  private static void lambda$labelChecksum$0(Zeun paramZeun, Zzjv paramZzjv) {
    paramZeun.Zh((paramZzjv.Zxl()).id);
    paramZeun.Zk(paramZzjv.ZxZ());
  }
  
  public static void ZS(String[] paramArrayOfString) {
    Zm = paramArrayOfString;
  }
  
  public static String[] ZG() {
    return Zm;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_1
    //   7: anewarray java/lang/String
    //   10: invokestatic ZS : ([Ljava/lang/String;)V
    //   13: bipush #81
    //   15: ldc 'Ua\ !'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Ze0p.a : Ljava/lang/String;
    //   24: goto -> 165
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
    //   42: if_icmpgt -> 139
    //   45: dup2
    //   46: swap
    //   47: iload_0
    //   48: dup2_x1
    //   49: caload
    //   50: swap
    //   51: iload_0
    //   52: bipush #7
    //   54: irem
    //   55: tableswitch default -> 121, 0 -> 92, 1 -> 96, 2 -> 101, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: iconst_4
    //   93: goto -> 123
    //   96: bipush #54
    //   98: goto -> 123
    //   101: bipush #99
    //   103: goto -> 123
    //   106: bipush #94
    //   108: goto -> 123
    //   111: bipush #62
    //   113: goto -> 123
    //   116: bipush #98
    //   118: goto -> 123
    //   121: bipush #34
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 48
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 45
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 21
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */