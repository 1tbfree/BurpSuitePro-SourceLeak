package burp;

import java.util.Optional;
import net.portswigger.browser.Zd5;
import net.portswigger.browser.Zd_;
import net.portswigger.browser.Zjr;

public final class Zrgv implements Zsd0<Zjr> {
  private boolean Zi;
  
  private boolean Zx;
  
  private boolean Zr;
  
  private String ZA;
  
  private boolean Zo;
  
  private final Zttx ZY;
  
  private static final String a;
  
  public Zrgv() {
    this.ZY = new Zttx();
  }
  
  public Zrgv(Zjr paramZjr) {
    this.Zi = paramZjr.ZT();
    this.Zx = paramZjr.ZE();
    this.Zr = paramZjr.ZL();
    this.ZA = paramZjr.ZG();
    this.Zo = paramZjr.Zy();
    this.ZY = Zttx.Zf(paramZjr.Zq());
  }
  
  public boolean Zh() {
    return this.Zi;
  }
  
  public Zrgv ZW(boolean paramBoolean) {
    this.Zi = paramBoolean;
    return this;
  }
  
  public boolean Zv() {
    return this.Zo;
  }
  
  public Zrgv Zs(boolean paramBoolean) {
    this.Zo = paramBoolean;
    return this;
  }
  
  public boolean Zj() {
    return this.Zr;
  }
  
  public Zrgv ZQ(boolean paramBoolean) {
    this.Zr = paramBoolean;
    return this;
  }
  
  public boolean Zg() {
    return this.Zx;
  }
  
  public Zrgv ZR(boolean paramBoolean) {
    this.Zx = paramBoolean;
    return this;
  }
  
  public String ZG() {
    return this.ZA;
  }
  
  public Zrgv Ze(String paramString) {
    this.ZA = paramString;
    return this;
  }
  
  public Zjr ZQ() {
    return (new Zd5()).Ze(this.Zi).ZZ(this.Zx).ZC(this.Zr).ZZ(this.ZA).Zp(this.Zo).ZB(this.ZY.ZM().ZU()).ZK();
  }
  
  public Optional<String> Zx() {
    return (this.ZA == null || this.ZA.isEmpty()) ? Optional.of(a) : this.ZY.Zk();
  }
  
  public Zttx Z_() {
    return this.ZY;
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc '^tPN =kaUNDR\\ndcO_DS*hM[H'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zrgv.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #62
    //   82: goto -> 111
    //   85: bipush #57
    //   87: goto -> 111
    //   90: bipush #20
    //   92: goto -> 111
    //   95: bipush #31
    //   97: goto -> 111
    //   100: bipush #80
    //   102: goto -> 111
    //   105: iconst_5
    //   106: goto -> 111
    //   109: bipush #95
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrgv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */