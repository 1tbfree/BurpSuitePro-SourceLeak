package burp;

import java.awt.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrm3 {
  private final Zzr6 ZX;
  
  private final Ztyg ZZ;
  
  private final Zgq7 ZM;
  
  private final Zkl6 ZK;
  
  private Zl0a Zx;
  
  private Zbrm ZG;
  
  private Zbrb Zf;
  
  private static int ZF;
  
  private static final String a;
  
  public Zrm3(Window paramWindow, Zzr6 paramZzr6, List<? extends Zll9> paramList, Zz28 paramZz28, Zbnt paramZbnt, Ztyg paramZtyg, Zgq7 paramZgq7, Zkl6 paramZkl6) {
    this.ZX = paramZzr6;
    this.ZZ = paramZtyg;
    this.ZM = paramZgq7;
    this.ZK = paramZkl6;
    this.ZG = new Zbrm(this, paramList, paramZz28, paramZbnt, paramZkl6);
    this.Zx = new Zl0a(paramWindow, a, 100, 25, this.ZG);
    this.ZG.Z_();
  }
  
  Zsic Zb(Zsic paramZsic) {
    if (paramZsic == this.Zf)
      return this.ZG; 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  Zsic Ze(Zsic paramZsic) {
    if (paramZsic == this.ZG) {
      if (this.Zf == null)
        this.Zf = new Zbrb(this, this.ZG, this.ZZ, this.ZM, this.ZK.ZH()); 
      this.Zf.ZU(this.ZG.Zw());
      return this.Zf;
    } 
    if (paramZsic == this.Zf) {
      this.ZX.ZI(ZY(this.Zf.ZG()));
      return null;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  private List<Zll9> ZY(List<Zkgi> paramList) {
    ArrayList<Zll9> arrayList = new ArrayList(paramList.size());
    Iterator<Zkgi> iterator = paramList.iterator();
    int i = Zy();
    while (iterator.hasNext()) {
      Zkgi zkgi = iterator.next();
      arrayList.add(zkgi.Zj);
      if (i == 0)
        break; 
    } 
    return arrayList;
  }
  
  Zl04 Zc() {
    return this.Zx;
  }
  
  void Zr(int paramInt, boolean paramBoolean) {
    this.Zx.Zx(paramInt, null, paramBoolean);
  }
  
  public static void Zn(int paramInt) {
    ZF = paramInt;
  }
  
  public static int Zy() {
    return ZF;
  }
  
  public static int Z_() {
    int i = Zy();
    return (i == 0) ? 72 : 0;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Z_ : ()I
    //   3: ifeq -> 11
    //   6: bipush #46
    //   8: invokestatic Zn : (I)V
    //   11: bipush #106
    //   13: ldc '@RUBKg\\fHGVf O'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zrm3.a : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #105
    //   94: goto -> 124
    //   97: bipush #7
    //   99: goto -> 124
    //   102: bipush #86
    //   104: goto -> 124
    //   107: bipush #22
    //   109: goto -> 124
    //   112: bipush #80
    //   114: goto -> 124
    //   117: bipush #68
    //   119: goto -> 124
    //   122: bipush #72
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
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
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrm3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */