package burp;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Ztzl extends MouseAdapter {
  final Zb53 Zw;
  
  private static final String a;
  
  Ztzl(Zb53 paramZb53) {}
  
  public void mouseClicked(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.getClickCount() == 2)
      this.Zw.ZX(this.Zw.ZR, Zrrh.SCANNER_API_SCAN_LAUNCHER_EDIT_AUTHENTICATION_DOUBLE_CLICK); 
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    Point point = paramMouseEvent.getPoint();
    int i = this.Zw.Zv.rowAtPoint(point);
    int j = this.Zw.Zv.columnAtPoint(point);
    int k = this.Zw.Zv.convertRowIndexToModel(i);
    Zgi zgi = this.Zw.ZR.ZW(k);
    if (a.equals(this.Zw.ZR.getColumnName(this.Zw.Zv.convertColumnIndexToModel(j))) && zgi.ZS() && !zgi.Ze() && zgi.ZY())
      this.Zw.Zt(k, zgi, Zrrh.SCANNER_API_SCAN_LAUNCHER_EDIT_AUTHENTICATION_ADD_CREDENTIALS_LINK); 
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc ''{ "k\\rh'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztzl.a : Ljava/lang/String;
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
    //   80: bipush #124
    //   82: goto -> 112
    //   85: bipush #17
    //   87: goto -> 112
    //   90: bipush #99
    //   92: goto -> 112
    //   95: bipush #124
    //   97: goto -> 112
    //   100: bipush #95
    //   102: goto -> 112
    //   105: bipush #116
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztzl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */