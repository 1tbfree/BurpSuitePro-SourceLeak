package burp;

import java.awt.Window;
import java.io.File;
import net.portswigger.Zl0;
import net.portswigger.Zm2;

public class Zlbh {
  private final Zt4u Zd;
  
  private final Window Zi;
  
  private final Zl0 Zg;
  
  private final Zskh ZU;
  
  private final Zbnt Zb;
  
  private static final String a;
  
  public Zlbh(Zt4u paramZt4u, Window paramWindow, Zl0 paramZl0, Zskh paramZskh, Zbnt paramZbnt) {
    this.Zd = paramZt4u;
    this.Zi = paramWindow;
    this.Zg = paramZl0;
    this.ZU = paramZskh;
    this.Zb = paramZbnt;
  }
  
  public boolean ZT(Ze3h paramZe3h) {
    Zm2.ZC(Zrrh.TARGET_SITE_MAP_SAVE_ITEMS);
    Zg89 zg89 = new Zg89();
    File file = Zs6n.ZA(Zg1m.DATA, this.Zd, this.Zi, 1, a, zg89);
    if (file != null)
      (new Zzq9((Zll9[])paramZe3h.Zd().ZL().Zz().Zi(), this.Zi, this.ZU, file, zg89.Zi(), this.Zb, this.Zg)).run(); 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #126
    //   2: ldc '`+y~\\tRns o'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlbh.a : Ljava/lang/String;
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
    //   80: bipush #77
    //   82: goto -> 112
    //   85: bipush #48
    //   87: goto -> 112
    //   90: bipush #107
    //   92: goto -> 112
    //   95: bipush #25
    //   97: goto -> 112
    //   100: bipush #18
    //   102: goto -> 112
    //   105: bipush #116
    //   107: goto -> 112
    //   110: bipush #87
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */