package burp;

import java.io.File;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zs14 {
  private final Zt4u Zr;
  
  private final Zerg Zs;
  
  private final Zkit Zg;
  
  private final Zskh Zj;
  
  private final Zl0 Z_;
  
  private final Zbnt ZX;
  
  private final Ztwv Zw;
  
  private final Ztg4 ZC;
  
  private final Zey9 Zc;
  
  private Zbiw ZP;
  
  private Zbrx ZO;
  
  private Zbrw Zy;
  
  private Zbrn ZE;
  
  private Zr_4 ZR;
  
  private static boolean ZQ;
  
  private static final String a;
  
  public Zs14(Zt4u paramZt4u, Zerg paramZerg, Zkit paramZkit, Zl04 paramZl04, Zskh paramZskh, Zl0 paramZl0, Zbnt paramZbnt, Ztwv paramZtwv, Ztg4 paramZtg4, Zey9 paramZey9) {
    this.Zr = paramZt4u;
    this.Zs = paramZerg;
    this.Zg = paramZkit;
    this.Zj = paramZskh;
    this.Z_ = paramZl0;
    this.ZX = paramZbnt;
    this.Zw = paramZtwv;
    this.ZC = paramZtg4;
    this.Zc = paramZey9;
    this.ZO = new Zbrx(this);
    this.ZP = new Zl0k(this, paramZl04, a, 100, 30, this.ZO);
  }
  
  Zl04 Zs() {
    return this.ZP.Zu();
  }
  
  private void ZT() {
    if (this.ZR != null)
      try {
        this.ZR.close();
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.IGNORED);
      }  
  }
  
  Zsic ZZ(Zsic paramZsic) {
    if (paramZsic == this.Zy) {
      ZT();
      return this.ZO;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic Zt(Zsic paramZsic) {
    if (paramZsic == this.ZO) {
      try {
        this.ZR = ZG(this.ZO.Zy());
      } catch (Zev1 zev1) {
        Zah.Zl(zev1, Zk_.COMMON_RUNTIME_FAILURE);
        this.ZO.ZK(Zrgs.IMPORT_PROJECT_NOT_A_VALID_PROJECT_FILE.ZN(new Object[0]));
        return this.ZO;
      } catch (Zev3 zev3) {
        Zah.Zl(zev3, Zk_.COMMON_RUNTIME_FAILURE);
        this.ZO.ZK(zev3.getMessage());
        return this.ZO;
      } 
      try {
        if (this.Zy == null)
          this.Zy = new Zbrw(this, this.ZP, this.Zs); 
      } catch (Zev1 zev1) {
        throw a(null);
      } 
      return this.Zy;
    } 
    try {
      if (paramZsic == this.Zy) {
        this.ZE = new Zbrn(this, this.ZP, this.Zs, this.Zg, this.Zj, this.ZX, this.Zw, this.Zy, this.ZC, this.Zc);
        return this.ZE;
      } 
    } catch (Zev1 zev1) {
      throw a(null);
    } 
    try {
      if (paramZsic == this.ZE)
        return null; 
    } catch (Zev1 zev1) {
      throw a(null);
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private Zr_4 ZG(String paramString) throws Zev3 {
    return Zkit.Zo(this.Z_.Zg(paramString), 32768, 134217728, 1073741824, Zlrc.Za, Zk9w.ON_CLOSE);
  }
  
  Zr_4 Zi() {
    return this.ZR;
  }
  
  boolean ZM(String paramString) {
    File file = this.Z_.Zg(Zg1o.ZX(paramString));
    return this.Zr.Zh(file).Ze();
  }
  
  public static void Zt(boolean paramBoolean) {
    ZQ = paramBoolean;
  }
  
  public static boolean Zo() {
    return ZQ;
  }
  
  public static boolean ZY() {
    boolean bool = Zo();
    return !bool;
  }
  
  private static Zev1 a(Zev1 paramZev1) {
    return paramZev1;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZY : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic Zt : (Z)V
    //   10: bipush #116
    //   12: ldc 'adf29 X{c%.T'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zs14.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #92
    //   94: goto -> 124
    //   97: bipush #22
    //   99: goto -> 124
    //   102: bipush #96
    //   104: goto -> 124
    //   107: bipush #125
    //   109: goto -> 124
    //   112: bipush #52
    //   114: goto -> 124
    //   117: bipush #57
    //   119: goto -> 124
    //   122: bipush #84
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs14.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */