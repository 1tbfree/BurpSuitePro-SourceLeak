package burp;

public class Zxn0 {
  private final String ZX;
  
  private int ZF;
  
  private StringBuffer Zm;
  
  private static int[] Zx;
  
  private static final String a;
  
  public Zxn0(String paramString) {
    this.ZX = paramString;
  }
  
  public String Zn() {
    int[] arrayOfInt = ZO();
    if (this.ZX == null || this.ZX.isEmpty())
      return null; 
    this.Zm = new StringBuffer();
    this.ZF = 0;
    while (true) {
      while (true)
        break; 
      if (this.ZF < this.ZX.length()) {
        this.Zm.append(ZN());
        this.ZF++;
        if (arrayOfInt != null)
          break; 
      } 
    } 
    return this.Zm.toString();
  }
  
  private void ZJ(char paramChar) {
    this.Zm.append(ZN());
    this.ZF++;
    int[] arrayOfInt = ZO();
    while (this.ZF < this.ZX.length() && (ZN() != paramChar || ZE() == '\\')) {
      this.Zm.append(ZN());
      this.ZF++;
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private char ZN() {
    return this.ZX.charAt(this.ZF);
  }
  
  private char ZE() {
    return this.ZX.charAt(this.ZF - 1);
  }
  
  private char ZX() {
    int[] arrayOfInt = ZO();
    byte b = 1;
    while (this.ZF - b > 0 && Character.isWhitespace(this.ZX.charAt(this.ZF - b))) {
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return this.ZX.charAt(this.ZF - b);
  }
  
  public static void Zt(int[] paramArrayOfint) {
    Zx = paramArrayOfint;
  }
  
  public static int[] ZO() {
    return Zx;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZO : ()[I
    //   3: ifnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic Zt : ([I)V
    //   12: bipush #15
    //   14: ldc '< V3f\\r<GW0<gT Q04L:XqazAW8q\\f9\\rH7fH[!4,P /\\fq__$4\\n#J IvP\\tjAMmivM\\t[~vE@/L:T+6'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zxn0.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #17
    //   94: goto -> 124
    //   97: bipush #43
    //   99: goto -> 124
    //   102: bipush #106
    //   104: goto -> 124
    //   107: bipush #49
    //   109: goto -> 124
    //   112: bipush #89
    //   114: goto -> 124
    //   117: bipush #27
    //   119: goto -> 124
    //   122: bipush #103
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
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
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxn0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */