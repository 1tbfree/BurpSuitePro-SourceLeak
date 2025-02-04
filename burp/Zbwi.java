package burp;

import com.formdev.flatlaf.extras.components.FlatTriStateCheckBox;
import java.awt.Point;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbwi extends Zbws {
  private final Ztnh Zp;
  
  private final Zzjc Zy;
  
  private static final String b;
  
  Zbwi(Ztnh paramZtnh, Zzjc paramZzjc, Consumer<Zsgq> paramConsumer, Zeq8 paramZeq8) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial <init> : (Lburp/Zztu;)V
    //   5: aload_0
    //   6: aload_1
    //   7: putfield Zp : Lburp/Ztnh;
    //   10: aload_0
    //   11: aload_2
    //   12: putfield Zy : Lburp/Zzjc;
    //   15: aload_0
    //   16: getstatic burp/Zbwi.b : Ljava/lang/String;
    //   19: invokevirtual setName : (Ljava/lang/String;)V
    //   22: aload_0
    //   23: invokevirtual Zy : ()V
    //   26: new burp/Zl21
    //   29: dup
    //   30: aload_0
    //   31: aload #4
    //   33: invokespecial <init> : (Ljava/awt/Component;Lburp/Zeq8;)V
    //   36: astore #5
    //   38: aload_1
    //   39: new burp/Zg32
    //   42: dup
    //   43: aload_1
    //   44: aload_0
    //   45: invokevirtual getTableHeader : ()Ljavax/swing/table/JTableHeader;
    //   48: aload_3
    //   49: invokespecial <init> : (Ljavax/swing/table/TableModel;Ljava/awt/Component;Ljava/util/function/Consumer;)V
    //   52: invokevirtual addTableModelListener : (Ljavax/swing/event/TableModelListener;)V
    //   55: aload_0
    //   56: new burp/Zep9
    //   59: dup
    //   60: aload_0
    //   61: aload #5
    //   63: invokespecial <init> : (Lburp/Zbwi;Lburp/Zl21;)V
    //   66: invokevirtual Zk : (Lburp/Zky2;)V
    //   69: aload_0
    //   70: aload_0
    //   71: aload_3
    //   72: aload_2
    //   73: <illegal opcode> ZK : (Lburp/Zbwi;Ljava/util/function/Consumer;Lburp/Zzjc;)Lburp/Zeq;
    //   78: invokevirtual Zc : (Lburp/Zeq;)V
    //   81: return
  }
  
  private void Zy() {
    Zbg3 zbg3 = Zh(this.Zp);
    TableColumnModel tableColumnModel = getColumnModel();
    setTableHeader(Zw(zbg3, tableColumnModel));
    tableColumnModel.getColumn(Zb2j.ENABLED.Zp()).setHeaderRenderer(zbg3);
  }
  
  private Zmo5 Zw(Zbg3 paramZbg3, TableColumnModel paramTableColumnModel) {
    Zmo5 zmo5 = new Zmo5(paramTableColumnModel);
    zmo5.ZE(0);
    zmo5.ZT(new Zt7_(this, paramZbg3, zmo5));
    return zmo5;
  }
  
  private static Zbg3 Zh(Ztnh paramZtnh) {
    Zbg3 zbg3 = new Zbg3(paramZtnh::lambda$buildEnabledColumnHeaderRenderer$1);
    zbg3.Zt(0);
    return zbg3;
  }
  
  private List<Zkvj> Zb(Point paramPoint) {
    int[] arrayOfInt = getSelectedRows();
    if (arrayOfInt.length > 1 || paramPoint == null)
      return Arrays.stream(arrayOfInt).map(this::convertRowIndexToModel).<Zkvj>mapToObj(this::lambda$getSelectedIndexedTestCases$2).toList(); 
    int i = rowAtPoint(paramPoint);
    int j = convertRowIndexToModel(i);
    return (i == -1) ? Collections.<Zkvj>emptyList() : Collections.<Zkvj>singletonList(new Zkvj(this.Zy.ZK(j), j));
  }
  
  private Zkvj lambda$getSelectedIndexedTestCases$2(int paramInt) {
    return new Zkvj(this.Zy.ZK(paramInt), paramInt);
  }
  
  private static FlatTriStateCheckBox.State lambda$buildEnabledColumnHeaderRenderer$1(Ztnh paramZtnh, Integer paramInteger, TableModel paramTableModel) {
    return (paramZtnh.Zl()).checkboxState;
  }
  
  private void lambda$new$0(Consumer<Zsgq> paramConsumer, Zzjc paramZzjc, int paramInt1, int paramInt2) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    int i = convertRowIndexToModel(paramInt1);
    paramConsumer.accept(paramZzjc.ZK(i));
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: ldc 'W@m\\fIPPq=xFwd '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbwi.b : Ljava/lang/String;
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
    //   80: bipush #47
    //   82: goto -> 112
    //   85: bipush #57
    //   87: goto -> 112
    //   90: bipush #31
    //   92: goto -> 112
    //   95: bipush #100
    //   97: goto -> 112
    //   100: bipush #117
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #7
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */