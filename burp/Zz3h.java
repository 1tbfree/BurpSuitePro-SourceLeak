package burp;

import java.io.IOException;

public class Zz3h {
  private static String[] Zn;
  
  private static final String a;
  
  public static void Zm(Zm_2 paramZm_2, Zs4f paramZs4f) throws IOException {
    Zefg<Zstu> zefg = paramZm_2.ZBu();
    byte b = 0;
    String[] arrayOfString = Ze();
    while (b < zefg.size()) {
      paramZs4f.Ze("l", zefg.get(b));
      b++;
      if (arrayOfString == null)
        break; 
    } 
    try {
      paramZs4f.Zb("n", paramZm_2.ZBI());
      if (Zbqc.Zwu() == null)
        Zm(new String[5]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static int Zo(Zm_2 paramZm_2) {
    return (paramZm_2.ZBu() == null) ? 0 : paramZm_2.ZBu().size();
  }
  
  public static void Zr(Zm_2 paramZm_2) throws Zs7w {
    try {
      if (paramZm_2.ZBu().size() < 1)
        throw new Zs7w(a); 
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
  }
  
  public static void ZT(Zm_2 paramZm_2) {
    paramZm_2.ZOE(0);
  }
  
  public static void Zm(String[] paramArrayOfString) {
    Zn = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return Zn;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Ze : ()[Ljava/lang/String;
    //   3: ifnonnull -> 13
    //   6: iconst_5
    //   7: anewarray java/lang/String
    //   10: invokestatic Zm : ([Ljava/lang/String;)V
    //   13: bipush #85
    //   15: ldc 'p~{b'ENPmg}-P\\n `wb6S,{|2E'
    //   17: iconst_m1
    //   18: goto -> 27
    //   21: putstatic burp/Zz3h.a : Ljava/lang/String;
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
    //   92: bipush #117
    //   94: goto -> 124
    //   97: bipush #89
    //   99: goto -> 124
    //   102: bipush #75
    //   104: goto -> 124
    //   107: bipush #68
    //   109: goto -> 124
    //   112: bipush #23
    //   114: goto -> 124
    //   117: bipush #100
    //   119: goto -> 124
    //   122: bipush #59
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz3h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */