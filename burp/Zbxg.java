package burp;

import net.portswigger.Znn;
import net.portswigger.Zoo;
import net.portswigger.Zrmc;
import net.portswigger.Zt_;
import net.portswigger.Ztj;

public class Zbxg {
  private static final String Zd;
  
  private final Ztj Zh;
  
  private final Zt_ Zf;
  
  private final Zra1 Zm;
  
  private Zoo Zv;
  
  private static String ZW;
  
  private static final String b;
  
  public Zbxg(Zt_ paramZt_, Ztj paramZtj, Zra1 paramZra1) {
    this.Zm = paramZra1;
    if (paramZtj == null)
      throw new IllegalArgumentException(b); 
    this.Zh = paramZtj;
    this.Zf = paramZt_;
  }
  
  public void Zw() {
    String str = Zx();
    Zrmc zrmc = (new Zrmc(this.Zh, this.Zf)).Zk(5000).ZH(2).ZX(10);
    try {
      if (this.Zm == Zra1.EXECUTION_MODE_DESKTOP)
        zrmc.Zs(30); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      this.Zv = zrmc.Zp();
      if (str == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void Zs() {
    try {
      if (this.Zv != null) {
        this.Zv.close();
        this.Zv = null;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public void ZX() {
    this.Zv.Zw();
  }
  
  public void Zj(Zmt2 paramZmt2, String paramString) {
    this.Zv.ZD(new Zlh7(paramZmt2, paramString));
  }
  
  public void Za(Zmt2 paramZmt2, Znn paramZnn) {
    try {
      if (this.Zv == null)
        return; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zv.ZD(new Zlhv(paramZmt2, new Ztaj(this, paramZnn)));
  }
  
  public boolean ZV() {
    try {
      if (this.Zv != null)
        try {
          if (this.Zv.Zm());
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zx : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'daO9Z'
    //   8: invokestatic ZA : (Ljava/lang/String;)V
    //   11: bipush #113
    //   13: ldc 'R[O%\\nbIQG\\n\\nSJ[0O cSJ\\t' 6B[\\t'z'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zbxg.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #81
    //   94: goto -> 124
    //   97: bipush #79
    //   99: goto -> 124
    //   102: bipush #88
    //   104: goto -> 124
    //   107: bipush #56
    //   109: goto -> 124
    //   112: bipush #30
    //   114: goto -> 124
    //   117: bipush #28
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
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
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
    //   163: goto -> 19
    //   166: ldc net/portswigger/Zgu
    //   168: ldc net/portswigger/Zsi
    //   170: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   173: checkcast net/portswigger/Zsi
    //   176: invokeinterface value : ()Ljava/lang/String;
    //   181: putstatic burp/Zbxg.Zd : Ljava/lang/String;
    //   184: return
  }
  
  public static void ZA(String paramString) {
    ZW = paramString;
  }
  
  public static String Zx() {
    return ZW;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */