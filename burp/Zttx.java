package burp;

import java.util.Optional;
import net.portswigger.browser.Zdp;
import net.portswigger.browser.Zjp;

public class Zttx {
  private String Zs;
  
  private String ZG;
  
  private String ZA;
  
  private String ZE;
  
  private String Zd;
  
  private String Zr;
  
  private String Zl;
  
  private String Zk;
  
  private String ZL;
  
  private int Zu;
  
  private boolean ZJ;
  
  private Zttx ZT;
  
  private static String Zv;
  
  private static final String b;
  
  public String ZB() {
    return this.ZL;
  }
  
  public Zttx Zh(String paramString) {
    this.ZL = paramString;
    return this;
  }
  
  public Zttx Zx(String paramString) {
    this.Zl = paramString;
    return this;
  }
  
  public Zttx Zi(int paramInt) {
    this.Zu = paramInt;
    return this;
  }
  
  public String Zz() {
    return this.ZE;
  }
  
  public Zttx Z_(String paramString) {
    this.ZE = paramString;
    return this;
  }
  
  public String ZS() {
    return this.Zs;
  }
  
  public Zttx ZJ(String paramString) {
    this.Zs = paramString;
    return this;
  }
  
  public boolean ZE() {
    return this.ZJ;
  }
  
  public Zttx Zn(boolean paramBoolean) {
    this.ZJ = paramBoolean;
    return this;
  }
  
  public String Zn() {
    return this.ZG;
  }
  
  public Zttx ZZ(String paramString) {
    this.ZG = paramString;
    return this;
  }
  
  public Zttx ZD() {
    return this.ZT;
  }
  
  public Zttx ZV(Zttx paramZttx) {
    this.ZT = paramZttx;
    return this;
  }
  
  public Zttx ZY(String paramString) {
    this.Zk = paramString;
    return this;
  }
  
  public String ZJ() {
    return this.Zd;
  }
  
  public Zttx ZR(String paramString) {
    this.Zd = paramString;
    return this;
  }
  
  public Zttx ZW(String paramString) {
    this.Zr = paramString;
    return this;
  }
  
  public String Zf() {
    return this.ZA;
  }
  
  public Zttx ZI(String paramString) {
    this.ZA = paramString;
    return this;
  }
  
  public Zdp ZM() {
    String str = ZQ();
    if (Zbqc.Zwu() == null)
      Zf("lhMVcc"); 
    return (new Zdp()).Zc(this.Zs).ZW(this.ZG).Zw(this.ZA).ZL(this.ZE).ZX(this.Zd).Zv(this.Zr).ZQ(this.Zl).ZU(this.Zk).ZT(this.Zu).ZU(this.ZJ).Zj((this.ZT == null) ? null : this.ZT.ZM().ZU()).ZB(this.ZL);
  }
  
  public Optional<String> Zk() {
    return (Zsw8.ZP(this.Zs) && Zsw8.ZP(this.ZG) && Zsw8.ZP(this.ZA) && Zsw8.ZP(this.ZE) && Zsw8.ZP(this.Zd) && Zsw8.ZP(this.ZL)) ? Optional.of(b) : Optional.empty();
  }
  
  public static Zttx Zf(Zjp paramZjp) {
    String str = ZQ();
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
    return (new Zttx()).ZJ(paramZjp.Zl()).ZZ(paramZjp.Zp()).ZI(paramZjp.Zm()).Z_(paramZjp.ZO()).ZR(paramZjp.ZG()).ZW(paramZjp.Zd()).Zx(paramZjp.Zv()).ZY(paramZjp.Zy()).Zi(paramZjp.Z_()).Zn(paramZjp.Zi()).ZV(!paramZjp.Zi() ? null : Zf(paramZjp.Zu())).Zh(paramZjp.Zn());
  }
  
  public static void Zf(String paramString) {
    Zv = paramString;
  }
  
  public static String ZQ() {
    return Zv;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZQ : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'VEEKib'
    //   8: invokestatic Zf : (Ljava/lang/String;)V
    //   11: bipush #16
    //   13: ldc '6T7Mo7b5\\fs%b=Y\\fr"/wUtL"6wUDn&$X{Id7b4Xy-6T4\\f/#(UB}.'T6 _hc {Ih'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zttx.b : Ljava/lang/String;
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
    //   92: bipush #83
    //   94: goto -> 124
    //   97: bipush #82
    //   99: goto -> 124
    //   102: bipush #100
    //   104: goto -> 124
    //   107: bipush #75
    //   109: goto -> 124
    //   112: bipush #101
    //   114: goto -> 124
    //   117: bipush #60
    //   119: goto -> 124
    //   122: bipush #12
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
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zttx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */