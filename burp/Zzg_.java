package burp;

import java.awt.Component;
import javax.swing.JTable;

class Zzg_ extends Zzg8 {
  private final Zmqj ZW = new Zmqj();
  
  private static final String a;
  
  private Zzg_() {
    this.ZW.setDisabledIcon(Zgq8.Zf);
  }
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramObject instanceof Zg7g) {
      Zg7g zg7g = (Zg7g)paramObject;
      if (zg7g.ZK())
        return super.getTableCellRendererComponent(paramJTable, Boolean.valueOf(zg7g.ZB()), paramBoolean1, paramBoolean2, paramInt1, paramInt2); 
    } 
    Zm23 zm23 = (Zm23)this.ZW.getTableCellRendererComponent(paramJTable, Zgq8.Zf, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    zm23.setToolTipText(a);
    return zm23;
  }
  
  static {
    // Byte code:
    //   0: bipush #110
    //   2: ldc '*)W8 [\\t2KjS[\\t28 [\\t2pKH9KhQ(\\tFy (y 2VhW(@8])L}](VH'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzg_.a : Ljava/lang/String;
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
    //   80: bipush #6
    //   82: goto -> 112
    //   85: bipush #50
    //   87: goto -> 112
    //   90: bipush #75
    //   92: goto -> 112
    //   95: bipush #8
    //   97: goto -> 112
    //   100: bipush #118
    //   102: goto -> 112
    //   105: bipush #29
    //   107: goto -> 112
    //   110: bipush #86
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */