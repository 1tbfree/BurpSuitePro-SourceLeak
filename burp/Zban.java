package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;

public class Zban extends Zbv5 implements Zt5e {
  private final Zee9 Za;
  
  private final Zbqc ZL;
  
  private final Zbqc Zn;
  
  private final Zzdy ZI;
  
  private final Zbc9 ZB;
  
  private static final String a;
  
  public Zban(Zee9 paramZee9, Zbqc paramZbqc1, Zbqc paramZbqc2) {
    this.Za = paramZee9;
    this.ZL = paramZbqc1;
    this.Zn = paramZbqc2;
    int i = Zbax.ZM();
    this.ZB = new Zbc9(new Component[] { paramZbqc1, paramZbqc2 });
    setLayout(new GridBagLayout());
    this.ZI = new Zzdy(a);
    this.ZI.addActionListener(this::lambda$new$0);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 20, 0);
    add(this.ZI, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZB, gridBagConstraints);
    Z_();
    if (Zbqc.Zwu() == null)
      Zbax.ZV(++i); 
  }
  
  public void ZC(Zz28 paramZz28) {
    Z_();
    Zbsv.Zb(this::lambda$scopeChanged$1);
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.ZI.setEnabled(paramBoolean);
    this.ZL.setEnabled(paramBoolean);
    this.Zn.setEnabled(paramBoolean);
  }
  
  private void ZW(boolean paramBoolean) {
    this.Za.ZmL(paramBoolean);
    Z_();
  }
  
  private void Z_() {
    boolean bool = this.Za.ZER();
    this.ZB.ZP(bool ? this.ZL : this.Zn);
    this.ZI.setSelected(!bool);
  }
  
  private void lambda$scopeChanged$1() {
    SwingUtilities.updateComponentTreeUI(this.Za.ZER() ? this.ZL : this.Zn);
  }
  
  private void lambda$new$0(ActionEvent paramActionEvent) {
    ZW(!this.ZI.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: ldc 'i.Js\\r( ]3L6\\bl_2_6L/R)]< '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zban.a : Ljava/lang/String;
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
    //   80: bipush #54
    //   82: goto -> 112
    //   85: bipush #87
    //   87: goto -> 112
    //   90: bipush #37
    //   92: goto -> 112
    //   95: bipush #89
    //   97: goto -> 112
    //   100: bipush #102
    //   102: goto -> 112
    //   105: bipush #70
    //   107: goto -> 112
    //   110: bipush #124
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zban.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */