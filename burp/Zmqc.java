package burp;

import java.awt.Component;
import java.util.List;
import javax.swing.JTable;

class Zmqc extends Zm23 {
  final List ZV;
  
  private static final String c;
  
  Zmqc(boolean paramBoolean, List paramList) {
    super(paramBoolean);
  }
  
  protected void Zt(Object paramObject) {
    if (paramObject != null) {
      Zzr7 zzr7 = (Zzr7)paramObject;
      super.Zt(zzr7.Zr5().ZS() + zzr7.Zr5().ZS() + c + (zzr7.ZrR()).displayName);
    } 
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zt3i zt3i = (Zt3i)paramObject;
    Component component = super.getTableCellRendererComponent(paramJTable, zt3i.Zh(), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    component.setEnabled(Zgqj.ZY(zt3i, this.ZV));
    return component;
  }
  
  static {
    // Byte code:
    //   0: bipush #48
    //   2: ldc ' +'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmqc.c : Ljava/lang/String;
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
    //   80: bipush #16
    //   82: goto -> 112
    //   85: bipush #51
    //   87: goto -> 112
    //   90: bipush #49
    //   92: goto -> 112
    //   95: bipush #53
    //   97: goto -> 112
    //   100: bipush #31
    //   102: goto -> 112
    //   105: bipush #122
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */