package burp;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Zxdc implements Ztmh, PropertyChangeListener {
  private int Zd;
  
  private boolean Zq;
  
  final Zbdx Zz;
  
  private static final String a;
  
  private Zxdc(Zbdx paramZbdx) {}
  
  void Ze() {
    if (this.Zz.ZF.getWidth() == 0)
      return; 
    this.Zz.ZF.resetToPreferredSizes();
    int i = (this.Zq && this.Zd > this.Zz.Zx.Zv()) ? this.Zd : this.Zz.Zx.Zd();
    int j = this.Zz.Z_(i);
    this.Zz.ZF.setDividerLocation(j);
  }
  
  public void ZU(boolean paramBoolean) {
    this.Zq = paramBoolean;
    this.Zz.ZF.ZF(paramBoolean);
    Ze();
  }
  
  public void Zg(Zrpp paramZrpp) {
    if (this.Zz.ZN != paramZrpp) {
      this.Zz.ZN = paramZrpp;
      this.Zz.ZW();
    } 
  }
  
  public void ZG() {
    this.Zz.Zk();
  }
  
  public void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    if (!a.equals(paramPropertyChangeEvent.getPropertyName()))
      return; 
    int i = this.Zz.ZF.getDividerLocation();
    if (this.Zq && i > 0) {
      int j = (this.Zz.ZN == Zrpp.LEFT) ? i : (this.Zz.ZF.getWidth() - this.Zz.ZF.getDividerSize() - i);
      this.Zd = Math.max(j, this.Zz.Zx.Zd());
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: ldc ' z,Vt&:o$Fx;'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxdc.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #121
    //   82: goto -> 111
    //   85: bipush #102
    //   87: goto -> 111
    //   90: iconst_3
    //   91: goto -> 111
    //   94: bipush #74
    //   96: goto -> 111
    //   99: bipush #61
    //   101: goto -> 111
    //   104: bipush #30
    //   106: goto -> 111
    //   109: bipush #91
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxdc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */