package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zph extends Zni implements Zzi8 {
  @Zzvo(0)
  private final Zmzk Zw;
  
  private final Zbr Zr;
  
  @Zzvo(3)
  private final Zstu ZS;
  
  @Zzvo(1)
  private final Zlit ZC;
  
  @Zzvo(6)
  private final short ZA;
  
  @Zzvo(7)
  private final int ZK;
  
  @Zzvo(8)
  private final long ZB;
  
  @Zzvo(4)
  private final Zefg<Zrrc> ZG;
  
  @Zzvo(5)
  private final Zefg<Zrrc> Zk;
  
  @Zzvo(9)
  private final boolean Zm;
  
  @Zzvo(13)
  private final boolean Ze;
  
  @Zzvo(12)
  private final Zefg<Zl2_> ZU;
  
  private static final String a;
  
  Zph(Zmzk paramZmzk, Zbr paramZbr, Zefg<Zrrc> paramZefg1, Zstu paramZstu, Zefg<Zrrc> paramZefg2, long paramLong, Zlit paramZlit, short paramShort, int paramInt, boolean paramBoolean1, boolean paramBoolean2, Zefg<Zl2_> paramZefg) {
    this.Zw = paramZmzk;
    this.Zr = paramZbr;
    this.ZG = paramZefg1;
    this.ZS = paramZstu;
    this.Zk = paramZefg2;
    this.ZB = paramLong;
    this.ZC = paramZlit;
    this.ZA = paramShort;
    this.ZK = paramInt;
    this.Zm = paramBoolean1;
    this.Ze = paramBoolean2;
    this.ZU = paramZefg;
  }
  
  public boolean ZaY() {
    return this.Zm;
  }
  
  public Zmzk Zod() {
    return this.Zw;
  }
  
  public List<Component> Zof() {
    return null;
  }
  
  public Zepe Zl(Component paramComponent) {
    return Ztx6.Zr(paramComponent);
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public Zeew Ze2() {
    return Zeew.SCANNER;
  }
  
  public Zlit ZlL() {
    return this.ZC;
  }
  
  public short Zl7() {
    return this.ZA;
  }
  
  public int Zlq() {
    return this.ZK;
  }
  
  public Zbr Zo3() {
    return this.Zr;
  }
  
  public Zstu Zos() {
    if (this.Zr == null || this.Zr.Zd())
      return null; 
    Zuh.ZT(this.Zr.Zz(), Zqf.Zr, a);
    return this.Zr.Zr();
  }
  
  public Zstu ZoO() {
    return this.ZS;
  }
  
  public long ZoB() {
    return this.ZB;
  }
  
  public String ZIx() {
    return null;
  }
  
  public Zefg<Zrrc> ZaC() {
    return this.ZG;
  }
  
  public Zefg<Zrrc> Zae() {
    return this.Zk;
  }
  
  public Zstu ZL(Zmzk paramZmzk, Zey9 paramZey9) {
    return Zyf.Zy(ZB(paramZmzk, paramZey9));
  }
  
  public byte[] ZB(Zmzk paramZmzk, Zey9 paramZey9) {
    Zbr zbr = Zo3();
    if (zbr == null)
      return null; 
    Zefx zefx = zbr.ZP(paramZmzk, paramZey9);
    return zefx.Zb().ZD();
  }
  
  public boolean Za3() {
    return this.Ze;
  }
  
  public Zefg<Zl2_> ZaV() {
    return this.ZU;
  }
  
  public Zeu4<Zzi8> ZF() {
    return (Zeu4<Zzi8>)ZP;
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    return Ztx6.Zy(this, paramZkl6.ZH());
  }
  
  public boolean equals(Object paramObject) {
    return Ztx6.ZH(this, paramObject);
  }
  
  public int hashCode() {
    return Ztx6.ZW(this);
  }
  
  public String toString() {
    return Ztx6.Zi(this);
  }
  
  @Zzvo(2)
  private Zstu ZKE() {
    return (this.Zr == null) ? null : this.Zr.Zr();
  }
  
  @Zzvo(10)
  private Zefg<Zk94> ZKT() {
    return (this.Zr == null) ? null : this.Zr.ZO();
  }
  
  @Zzvo(11)
  private byte ZK5() {
    return (this.Zr == null) ? Zkyt.UNKNOWN.persistedId : (this.Zr.Zx()).persistedId;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc '5td}!L\\nGyt{dWupz7^ taZ!NbaL%KGb}g1SGsp(1L1|f7Ku;'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zph.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #117
    //   82: goto -> 111
    //   85: iconst_3
    //   86: goto -> 111
    //   89: bipush #7
    //   91: goto -> 111
    //   94: bipush #26
    //   96: goto -> 111
    //   99: bipush #86
    //   101: goto -> 111
    //   104: bipush #45
    //   106: goto -> 111
    //   109: bipush #108
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zph.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */