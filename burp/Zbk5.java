package burp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JToolTip;

public class Zbk5 extends Zbky {
  private final Ztl5 Zx;
  
  private final Zb07 Zk;
  
  private final Zgyi Zq;
  
  private final Zeeu ZA;
  
  private final Ztc7 Zg;
  
  private boolean ZM;
  
  private static final String c;
  
  Zbk5(Ztl5 paramZtl5, Ztun paramZtun, Zgyi paramZgyi, boolean paramBoolean, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Z_z : ()[Lburp/Zbqc;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zx : Lburp/Ztl5;
    //   12: aload_0
    //   13: aload_3
    //   14: putfield Zq : Lburp/Zgyi;
    //   17: aload_0
    //   18: aload_2
    //   19: aload_0
    //   20: invokeinterface Z_ : (Ljava/awt/Component;)Lburp/Zb07;
    //   25: putfield Zk : Lburp/Zb07;
    //   28: aload_0
    //   29: getfield Zk : Lburp/Zb07;
    //   32: aload_1
    //   33: invokeinterface ZG1 : ()Ljava/lang/String;
    //   38: invokeinterface setTitle : (Ljava/lang/String;)V
    //   43: aload_0
    //   44: new burp/Zeeu
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: putfield ZA : Lburp/Zeeu;
    //   54: astore #6
    //   56: aload_0
    //   57: new burp/Zxyj
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: putfield Zg : Lburp/Ztc7;
    //   67: aload_0
    //   68: getfield Zg : Lburp/Ztc7;
    //   71: aload_1
    //   72: invokeinterface ZGo : ()Ljava/lang/String;
    //   77: invokeinterface ZJ : (Ljava/lang/String;)V
    //   82: aload_0
    //   83: getfield Zg : Lburp/Ztc7;
    //   86: aload_1
    //   87: invokeinterface ZGD : ()Ljava/lang/String;
    //   92: invokeinterface ZI : (Ljava/lang/String;)V
    //   97: aload_0
    //   98: aload_0
    //   99: getfield Zg : Lburp/Ztc7;
    //   102: invokevirtual Ze : (Lburp/Ztc7;)V
    //   105: aload_0
    //   106: iload #4
    //   108: invokevirtual ZI : (Z)V
    //   111: aload_0
    //   112: aload_1
    //   113: invokeinterface ZGE : ()Ljava/lang/String;
    //   118: invokevirtual setToolTipText : (Ljava/lang/String;)V
    //   121: aload_0
    //   122: aload_0
    //   123: aload #5
    //   125: <illegal opcode> actionPerformed : (Lburp/Zbk5;Ljava/lang/Runnable;)Ljava/awt/event/ActionListener;
    //   130: invokevirtual Zn : (Ljava/awt/event/ActionListener;)V
    //   133: aload_0
    //   134: new burp/Zrb7
    //   137: dup
    //   138: aload_0
    //   139: aload_0
    //   140: invokestatic getWindowAncestor : (Ljava/awt/Component;)Ljava/awt/Window;
    //   143: invokespecial <init> : (Lburp/Zbk5;Ljava/awt/Window;)V
    //   146: invokevirtual addHierarchyListener : (Ljava/awt/event/HierarchyListener;)V
    //   149: invokestatic Zwu : ()[Lburp/Zbqc;
    //   152: ifnonnull -> 162
    //   155: iconst_3
    //   156: anewarray burp/Zbqc
    //   159: invokestatic ZH : ([Lburp/Zbqc;)V
    //   162: return
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Zk != null)
      this.Zk.Zgx(); 
  }
  
  public void ZR(Zx0b paramZx0b) {
    this.Zx.ZGN();
    Runnable runnable = this::lambda$startFilter$1;
    Zbqc[] arrayOfZbqc = Zr7o.Z_z();
    if (paramZx0b.ZE()) {
      this.Zk.Zm(paramZx0b, runnable);
      if (arrayOfZbqc == null) {
        this.Zk.ZW(runnable);
        return;
      } 
      return;
    } 
    this.Zk.ZW(runnable);
  }
  
  public void Zv() {
    this.Zk.Zgr();
    if (this.Zx.ZGS())
      ZK(); 
  }
  
  public void ZJ() {
    this.Zk.Zgr();
    if (this.Zx.ZGS())
      Za(false); 
  }
  
  public void ZC() {
    if (this.Zx.ZGK())
      ZK(); 
  }
  
  private void ZI() {
    ZR(new Zeo1());
  }
  
  private void ZK() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zeeu;
    //   4: invokevirtual Zo : ()Lburp/Zln7;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield Zg : Lburp/Ztc7;
    //   12: aload_1
    //   13: invokeinterface ZD : (Lburp/Zln7;)V
    //   18: aload_0
    //   19: getfield Zg : Lburp/Ztc7;
    //   22: aload_0
    //   23: getfield Zx : Lburp/Ztl5;
    //   26: invokeinterface ZGo : ()Ljava/lang/String;
    //   31: invokeinterface ZJ : (Ljava/lang/String;)V
    //   36: aload_0
    //   37: getfield Zg : Lburp/Ztc7;
    //   40: ldc ''
    //   42: invokeinterface ZI : (Ljava/lang/String;)V
    //   47: aload_0
    //   48: getfield Zg : Lburp/Ztc7;
    //   51: getstatic burp/Ze6b.FILTERING : Lburp/Ze6b;
    //   54: invokeinterface ZF : (Lburp/Ze6b;)V
    //   59: aload_0
    //   60: getfield Zx : Lburp/Ztl5;
    //   63: invokeinterface ZGN : ()V
    //   68: aload_0
    //   69: getfield Zq : Lburp/Zgyi;
    //   72: aload_1
    //   73: dup
    //   74: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   77: pop
    //   78: <illegal opcode> getAsBoolean : (Lburp/Zln7;)Ljava/util/function/BooleanSupplier;
    //   83: aload_0
    //   84: aload_1
    //   85: <illegal opcode> run : (Lburp/Zbk5;Lburp/Zln7;)Ljava/lang/Runnable;
    //   90: invokeinterface Zc : (Ljava/util/function/BooleanSupplier;Ljava/lang/Runnable;)V
    //   95: goto -> 106
    //   98: astore_2
    //   99: aload_2
    //   100: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   103: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   106: return
    // Exception table:
    //   from	to	target	type
    //   59	95	98	java/lang/Exception
  }
  
  public JToolTip createToolTip() {
    JToolTip jToolTip = super.createToolTip();
    jToolTip.putClientProperty(c, Boolean.FALSE);
    return jToolTip;
  }
  
  private void Za(boolean paramBoolean) {
    this.ZM = paramBoolean;
    System.gc();
    EventQueue.invokeLater(this::lambda$filteringDone$4);
  }
  
  public void Zd() {
    this.Zk.Zgf();
    Zb07 zb07 = this.Zk;
    if (zb07 instanceof Zrh7) {
      Zrh7 zrh7 = (Zrh7)zb07;
      zrh7.dispose();
    } 
  }
  
  private void lambda$filteringDone$4() {
    this.Zg.ZF(Ze6b.FILTERED);
    this.Zg.ZJ(this.Zx.ZGo());
    this.Zg.ZI(this.Zx.ZGD());
    setToolTipText(this.Zx.ZGE());
  }
  
  private void lambda$applyFilter$3(Zln7 paramZln7) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZA : Lburp/Zeeu;
    //   4: aload_1
    //   5: aload_0
    //   6: aload_1
    //   7: <illegal opcode> run : (Lburp/Zbk5;Lburp/Zln7;)Ljava/lang/Runnable;
    //   12: invokevirtual Zs : (Lburp/Zln7;Ljava/lang/Runnable;)V
    //   15: return
  }
  
  private void lambda$applyFilter$2(Zln7 paramZln7) {
    Za(paramZln7.ZI());
  }
  
  private void lambda$startFilter$1() {
    if (this.Zx.ZGS() || this.ZM)
      ZK(); 
  }
  
  private void lambda$new$0(Runnable paramRunnable, ActionEvent paramActionEvent) {
    paramRunnable.run();
    ZI();
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: ldc 'IcK+g\c '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbk5.c : Ljava/lang/String;
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
    //   80: bipush #125
    //   82: goto -> 112
    //   85: bipush #39
    //   87: goto -> 112
    //   90: bipush #111
    //   92: goto -> 112
    //   95: bipush #21
    //   97: goto -> 112
    //   100: bipush #127
    //   102: goto -> 112
    //   105: bipush #85
    //   107: goto -> 112
    //   110: bipush #20
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbk5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */