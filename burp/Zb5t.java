package burp;

import java.awt.AWTEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Zb5t extends Zbqc {
  private final Ze9n ZY;
  
  private final Ze9n ZN;
  
  private final Zbqc Zb;
  
  private final Zm99 Zg;
  
  private final Map<String, Supplier<String>> Zs = new HashMap<>();
  
  private final Zttx Zk;
  
  private final Zmq5 ZT;
  
  private static final String a;
  
  public Zb5t(Zttx paramZttx) {
    this.Zk = paramZttx;
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.rowHeights = new int[] { 0, 20, 0, 10, 0 };
    gridBagLayout.columnWidths = new int[] { 0, 10, 0, 10, 0, 10, 0 };
    setLayout(gridBagLayout);
    this.Zb = Zp(paramZttx);
    this.ZY = (new Ze3m(Zeuf.CHEVRON_DOWN, Zlkk.FOREGROUND)).ZU(Zmcx.LINE_SIZE).Z_();
    this.ZN = (new Ze3m(Zeuf.CHEVRON_UP, Zlkk.FOREGROUND)).ZU(Zmcx.LINE_SIZE).Z_();
    int[] arrayOfInt = Zb5a.Zd();
    this.Zg = new Zm99(paramZttx.ZE() ? this.ZN : this.ZY);
    Zm99 zm99 = new Zm99(a);
    zm99.ZE(Zt00.TITLE_PLAIN_FONT);
    zm99.addMouseListener(new Zb_q(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(zm99, gridBagConstraints);
    this.ZT = new Zmq5("", paramZttx.ZE());
    this.ZT.Zc(this::lambda$new$0);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(this.ZT, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    Zem9 zem9 = new Zem9(0);
    zem9.addMouseListener(new Zkkq(this));
    add(zem9, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    this.Zg.addMouseListener(new Zemr(this));
    add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zb, gridBagConstraints);
    this.Zb.setVisible(paramZttx.ZE());
    if (Zbqc.Zwu() == null)
      Zb5a.Zv(new int[3]); 
  }
  
  private void Zg(AWTEvent paramAWTEvent) {
    if (paramAWTEvent != null && !(paramAWTEvent instanceof java.awt.event.ActionEvent))
      this.ZT.dispatchEvent(paramAWTEvent); 
    boolean bool = this.ZT.ZT();
    this.Zb.setVisible(bool);
    this.Zg.setIcon(bool ? this.ZN : this.ZY);
    Window window = Zt2m.ZF(getParent());
    window.pack();
    Zmse.ZF(window);
  }
  
  private Zbqc Zp(Zttx paramZttx) {
    Zbqc zbqc = new Zbqc();
    GridBagLayout gridBagLayout = new GridBagLayout();
    zbqc.setLayout(gridBagLayout);
    int i = Zb5y.ZG(zbqc, paramZttx.ZD(), this.Zs, false);
    int[] arrayOfInt = new int[i];
    Zb5y.Zk(i, arrayOfInt);
    gridBagLayout.columnWidths = new int[] { 0, 20, 0, 20, 0 };
    gridBagLayout.rowHeights = arrayOfInt;
    return zbqc;
  }
  
  public void ZO() {
    int[] arrayOfInt = Zb5a.Zd();
    if (this.ZT.ZT()) {
      if (this.Zk.ZD() == null)
        this.Zk.Zn(true).ZV(new Zttx()); 
      Ze83.Ze.forEach(this::lambda$save$2);
      if (arrayOfInt == null) {
        this.Zk.Zn(false).ZV(null);
        return;
      } 
      return;
    } 
    this.Zk.Zn(false).ZV(null);
  }
  
  private void lambda$save$2(Ze83 paramZe83) {
    paramZe83.Zks().apply(this.Zk.ZD(), ((Supplier<String>)this.Zs.getOrDefault(paramZe83.Zkd(), Zb5t::lambda$save$1)).get());
  }
  
  private static String lambda$save$1() {
    return "";
  }
  
  private void lambda$new$0() {
    Zg((AWTEvent)null);
  }
  
  static {
    // Byte code:
    //   0: bipush #22
    //   2: ldc 'R<NL [=OO'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb5t.a : Ljava/lang/String;
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
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #44
    //   87: goto -> 112
    //   90: bipush #101
    //   92: goto -> 112
    //   95: bipush #78
    //   97: goto -> 112
    //   100: bipush #55
    //   102: goto -> 112
    //   105: bipush #45
    //   107: goto -> 112
    //   110: bipush #54
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */