package burp;

import java.awt.EventQueue;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz37 {
  private final Zz1v ZP;
  
  private final Ztha ZG;
  
  private final Zeh1 ZZ;
  
  private static final String a;
  
  public Zz37(Zz1v paramZz1v, Ztha paramZtha) {
    this.ZP = paramZz1v;
    this.ZG = paramZtha;
    this.ZZ = new Zeh1();
  }
  
  public Zm1j ZL(String paramString, Zx8r paramZx8r) throws Zxe9 {
    try {
    
    } catch (Zxe9 zxe9) {
      throw a(null);
    } 
    Zuh.Zb(!EventQueue.isDispatchThread(), Zqf.ZF);
    Zvop zvop = new Zvop(paramString, paramZx8r);
    Ze74<Zvop, Zrh0> ze74 = this.ZZ.Zl(zvop);
    Zgmm<Zrh0> zgmm = ZV(ze74);
    if (zgmm.Zv() == 200) {
      Zrh0 zrh0 = zgmm.ZM();
      return new Zm1j(zrh0.ZiR(), zgmm.Za().ZKF());
    } 
    throw new Zxe9(a);
  }
  
  public boolean ZA(String paramString, boolean paramBoolean) {
    return this.ZG.ZI(new Ztzp(paramString, "", paramBoolean));
  }
  
  private Zgmm<Zrh0> ZV(Ze74<Zvop, Zrh0> paramZe74) throws Zxe9 {
    try {
      return this.ZP.Zp(paramZe74);
    } catch (Zgri zgri) {
      Zah.Zl(zgri, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zxe9(zgri.getMessage(), zgri);
    } 
  }
  
  private static Zxe9 a(Zxe9 paramZxe9) {
    return paramZxe9;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: ldc 'fm0|\\f\\rGf1$\qucZm2$_b;e ]'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zz37.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 98, 5 -> 103
    //   80: bipush #53
    //   82: goto -> 110
    //   85: iconst_5
    //   86: goto -> 110
    //   89: bipush #83
    //   91: goto -> 110
    //   94: iconst_2
    //   95: goto -> 110
    //   98: bipush #121
    //   100: goto -> 110
    //   103: bipush #111
    //   105: goto -> 110
    //   108: bipush #104
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz37.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */