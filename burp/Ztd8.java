package burp;

import java.util.Set;
import javax.swing.JComponent;
import net.portswigger.Zm2;
import net.portswigger.javatooling.api.CompilationResult;
import net.portswigger.javatooling.api.Problem;

public class Ztd8 implements Zspz, Zm3g, Zzkg, Zklo {
  private final Zbqr Zk;
  
  private final Zg98 ZT;
  
  private final Zm51 Zw;
  
  private final Zt33 ZS;
  
  private final Zm6v ZH;
  
  private static final String a;
  
  public Ztd8(Zbqr paramZbqr, Zg98 paramZg98, Zm51 paramZm51, Zt33 paramZt33, Zm6v paramZm6v) {
    this.Zk = paramZbqr;
    this.ZT = paramZg98;
    this.Zw = paramZm51;
    this.ZS = paramZt33;
    this.ZH = paramZm6v;
  }
  
  public void Zq(Zb07 paramZb07) {}
  
  public JComponent Zlj() {
    return this.Zk;
  }
  
  public void ZlQ() {
    Za4();
  }
  
  public void Zlt() {
    String str1 = this.Zk.Zs();
    String str2 = Zx8d.ZH(str1);
    Zm2.ZB(this.ZT.Zk(), str2);
    Zm2.Zo(this.ZT.ZG());
    boolean bool = !str1.equals(this.ZS.ZS()) ? true : false;
    if (bool) {
      this.Zk.Zh();
      this.ZS.ZU(str1);
    } 
    this.ZS.Zw(Zzca.BAMBDA);
  }
  
  public boolean ZlN() {
    String str = this.Zk.Zs();
    CompilationResult compilationResult = this.Zw.compile(a, str);
    Set<Problem> set = compilationResult.errors();
    if (!set.isEmpty()) {
      this.Zk.ZU(set);
      return false;
    } 
    this.Zk.ZA();
    return true;
  }
  
  public void Zlm() {
    this.Zk.ZA();
    Zt2();
  }
  
  public void Zn(Zsij paramZsij) {
    boolean bool = !paramZsij.ZMN().equals(this.ZS.ZS()) ? true : false;
    if (bool)
      return; 
    this.Zk.Zx(paramZsij);
  }
  
  public Zr1m Zlr() {
    return this.ZH.ZL(this);
  }
  
  public void Zt2() {
    Za4();
  }
  
  public void updateUI() {
    this.Zk.updateUI();
  }
  
  public void Zd(Zmf_ paramZmf_) {
    String str = paramZmf_.Zm(this.ZT.Zo(), this.Zk.Zs());
    this.Zk.Zl(str);
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Za(this.ZT.Zo(), this.Zk.Zs());
  }
  
  public void Za4() {
    this.Zk.Zl(this.ZS.ZS());
  }
  
  public String Za2() {
    return this.Zk.Zs();
  }
  
  public void Zf(String paramString) {
    this.Zk.Zl(paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'd\\r*OkL\\r1 '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztd8.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #104
    //   82: goto -> 112
    //   85: bipush #34
    //   87: goto -> 112
    //   90: bipush #9
    //   92: goto -> 112
    //   95: bipush #47
    //   97: goto -> 112
    //   100: bipush #101
    //   102: goto -> 112
    //   105: bipush #43
    //   107: goto -> 112
    //   110: bipush #11
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztd8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */