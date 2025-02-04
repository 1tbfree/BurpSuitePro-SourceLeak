package burp;

import java.awt.Component;
import java.awt.Point;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.swing.JTabbedPane;
import net.portswigger.Zm2;

public class Zxr implements Zzrm {
  private final Zlw0 Zl;
  
  private final Supplier<Integer> ZJ;
  
  private static final String a;
  
  public Zxr(Function<Component, Zl5t> paramFunction, Zzyl paramZzyl, Supplier<Zl4w> paramSupplier, Supplier<Integer> paramSupplier1, Function<Point, Zl0q> paramFunction1) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #4
    //   7: putfield ZJ : Ljava/util/function/Supplier;
    //   10: invokestatic Zp : ()Lburp/Zrxv;
    //   13: invokevirtual ZX : ()Lburp/Zrxv;
    //   16: invokevirtual Z_ : ()Lburp/Zrxv;
    //   19: aload_2
    //   20: invokevirtual ZP : (Lburp/Zzyl;)Lburp/Zrxv;
    //   23: getstatic burp/Zlkk.SUITE_TABBED_PANE_BACKGROUND : Lburp/Zlkk;
    //   26: invokevirtual ZD : (Lburp/Zlkk;)Lburp/Zrxv;
    //   29: new burp/Zg88
    //   32: dup
    //   33: aload_0
    //   34: <illegal opcode> run : (Lburp/Zxr;)Ljava/lang/Runnable;
    //   39: aload_3
    //   40: invokespecial <init> : (Ljava/lang/Runnable;Ljava/util/function/Supplier;)V
    //   43: invokevirtual Zl : (Ljava/awt/Component;)Lburp/Zrxv;
    //   46: new burp/Zlis
    //   49: dup
    //   50: new burp/Zs20
    //   53: dup
    //   54: aload_0
    //   55: invokespecial <init> : (Lburp/Zxr;)V
    //   58: invokespecial <init> : (Lburp/Zs20;)V
    //   61: invokevirtual ZD : (Lburp/Ztuc;)Lburp/Zrxv;
    //   64: aload_1
    //   65: aload #5
    //   67: <illegal opcode> accept : (Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Consumer;
    //   72: invokevirtual ZG : (Ljava/util/function/Consumer;)Lburp/Zrxv;
    //   75: getstatic java/awt/dnd/DragSource.DefaultMoveDrop : Ljava/awt/Cursor;
    //   78: invokevirtual Zv : (Ljava/awt/Cursor;)Lburp/Zrxv;
    //   81: astore #6
    //   83: aload_0
    //   84: new burp/Zlw0
    //   87: dup
    //   88: aload #6
    //   90: new burp/Zlhc
    //   93: dup
    //   94: aload_0
    //   95: aload_1
    //   96: aload #4
    //   98: invokespecial <init> : (Lburp/Zxr;Ljava/util/function/Function;Ljava/util/function/Supplier;)V
    //   101: aload_0
    //   102: <illegal opcode> ZE : (Lburp/Zxr;)Lburp/Zzdl;
    //   107: getstatic burp/Zo0.ZM : Lburp/Zo0;
    //   110: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   115: iconst_1
    //   116: invokespecial <init> : (Lburp/Zrxv;Lburp/Zz9w;Lburp/Zzdl;Lburp/Zo0;Ljava/util/function/Predicate;Z)V
    //   119: putfield Zl : Lburp/Zlw0;
    //   122: aload_0
    //   123: invokevirtual Zl : ()Ljavax/swing/JTabbedPane;
    //   126: getstatic burp/Zxr.a : Ljava/lang/String;
    //   129: invokevirtual setName : (Ljava/lang/String;)V
    //   132: return
  }
  
  private void ZV() {
    Zi().forEach(Zxr::lambda$reattachSuiteComponents$1);
  }
  
  private Zl5t Zt(int paramInt) {
    Zl5t zl5t = this.Zl.ZS(paramInt);
    Zm(zl5t);
    return zl5t;
  }
  
  public void Zm(Zl5t paramZl5t) {
    this.Zl.Ze(paramZl5t.ZZ());
  }
  
  public void ZR(Zl5t paramZl5t) {
    this.Zl.Zr(paramZl5t);
  }
  
  public JTabbedPane Zl() {
    return this.Zl.Zc();
  }
  
  public List<Zl5t> Zi() {
    return this.Zl.ZF();
  }
  
  public List<String> ZG() {
    return this.Zl.ZF().stream().map(Zzqk::Zs).toList();
  }
  
  public void ZH(List<String> paramList) {
    List<Zeyb> list = paramList.stream().map(this::lambda$setConfiguredSuiteComponentIds$2).toList();
    this.Zl.Zf(list);
  }
  
  private Zeyb lambda$setConfiguredSuiteComponentIds$2(String paramString) {
    return new Zeyb(paramString, false, this.ZJ.get());
  }
  
  private static void lambda$reattachSuiteComponents$1(Zl5t paramZl5t) {
    paramZl5t.Zk(null);
    Zq9.Z_(paramZl5t).ifPresent(Zm2::ZC);
  }
  
  private static void lambda$new$0(Function<Component, Zl5t> paramFunction1, Function<Point, Zl0q> paramFunction2, Zlfz paramZlfz) {
    JTabbedPane jTabbedPane = paramZlfz.Zs0();
    int i = paramZlfz.Zs();
    Zl5t zl5t = paramFunction1.apply(jTabbedPane.getComponentAt(i));
    if (zl5t != null) {
      Point point = Zgzo.ZO(jTabbedPane, i, paramZlfz.Zs1());
      Zl0q zl0q = paramFunction2.apply(point);
      zl5t.Zk(Integer.valueOf(zl0q.ZQ()));
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #109
    //   2: ldc '=G"+5P/>9p+! '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxr.a : Ljava/lang/String;
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
    //   80: bipush #14
    //   82: goto -> 112
    //   85: bipush #21
    //   87: goto -> 112
    //   90: bipush #31
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #73
    //   102: goto -> 112
    //   105: bipush #39
    //   107: goto -> 112
    //   110: bipush #21
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */