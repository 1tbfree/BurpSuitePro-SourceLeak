package burp;

import java.io.IOException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zxkr extends Zxkd {
  private final String Zr;
  
  private static final String a;
  
  Zxkr(Zrgd paramZrgd, Zbw_ paramZbw_, Zgb6 paramZgb6, Zkl6 paramZkl6, String paramString) {
    super(paramZrgd, paramZbw_, paramZgb6, paramZkl6);
    this.Zr = paramString;
  }
  
  void ZL(Zml3 paramZml3) throws Zz8v, Zz8b {
    try {
      ZE(paramZml3);
    } catch (Zz8v zz8v) {
      Zah.Zl(zz8v, Zk_.COMMON_RUNTIME_FAILURE);
      throw zz8v;
    } catch (Zz8b zz8b) {
      Zah.Zl(zz8b, Zk_.IGNORED);
      throw zz8b;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZE(Zml3 paramZml3) throws IOException, Zz8b, Zz8v {
    Zmzk zmzk = Zd(paramZml3);
    String str = zmzk.ZJ1();
    if (str.equals(this.Zr)) {
      Zb49 zb49 = new Zb49(paramZml3.Zu(), this.ZY);
      String str1 = ZZ(paramZml3);
      try {
        if (zb49.Z_(str1))
          throw new Zz8b(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      throw new Zz8v(a, paramZml3.ZC());
    } 
  }
  
  private String ZZ(Zml3 paramZml3) {
    Zz1p zz1p = paramZml3.Zi();
    return Zkb.ZG(zz1p.Zo.ZdH());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: ldc '-hJ2Ne\%\\fThKwdJwnJ:e8_ u mQ$\\n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxkr.a : Ljava/lang/String;
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
    //   80: bipush #115
    //   82: goto -> 112
    //   85: bipush #98
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #13
    //   97: goto -> 112
    //   100: bipush #52
    //   102: goto -> 112
    //   105: bipush #91
    //   107: goto -> 112
    //   110: bipush #122
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxkr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */