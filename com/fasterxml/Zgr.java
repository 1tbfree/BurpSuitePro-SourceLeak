package com.fasterxml;

import java.io.Serializable;

public class Zgr implements Zvs<Zqj>, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Zqh ZT;
  
  protected static final Zgr ZY;
  
  protected static final Zgr Zy;
  
  protected final Zqh ZU;
  
  protected final Zqh ZC;
  
  protected final Zqh ZB;
  
  protected final Zqh Zi;
  
  protected final Zqh Zp;
  
  private static final String a;
  
  private Zgr(Zqh paramZqh1, Zqh paramZqh2, Zqh paramZqh3, Zqh paramZqh4, Zqh paramZqh5) {
    this.ZU = paramZqh1;
    this.ZC = paramZqh2;
    this.ZB = paramZqh3;
    this.Zi = paramZqh4;
    this.Zp = paramZqh5;
  }
  
  public Zqh Zf() {
    return this.ZU;
  }
  
  public Zqh ZP() {
    return this.ZC;
  }
  
  public Zqh Zj() {
    return this.ZB;
  }
  
  public Zqh Zy() {
    return this.Zi;
  }
  
  public Zqh ZB() {
    return this.Zp;
  }
  
  protected Object readResolve() {
    Zgr zgr = Zf(this.ZU, this.ZC, this.ZB, this.Zi, this.Zp);
    return (zgr == null) ? this : zgr;
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.ZU, this.ZC, this.ZB, this.Zi, this.Zp });
  }
  
  public int hashCode() {
    return 1 + this.ZU.ordinal() ^ 3 * this.ZC.ordinal() - 7 * this.ZB.ordinal() + 11 * this.Zi.ordinal() ^ 13 * this.Zp.ordinal();
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject.getClass() == getClass() && ZF(this, (Zgr)paramObject))));
  }
  
  private static Zgr Zf(Zqh paramZqh1, Zqh paramZqh2, Zqh paramZqh3, Zqh paramZqh4, Zqh paramZqh5) {
    if (paramZqh1 == ZT) {
      if (paramZqh2 == ZY.ZC && paramZqh3 == ZY.ZB && paramZqh4 == ZY.Zi && paramZqh5 == ZY.Zp)
        return ZY; 
    } else if (paramZqh1 == Zqh.DEFAULT && paramZqh2 == Zqh.DEFAULT && paramZqh3 == Zqh.DEFAULT && paramZqh4 == Zqh.DEFAULT && paramZqh5 == Zqh.DEFAULT) {
      return Zy;
    } 
    return null;
  }
  
  private static boolean ZF(Zgr paramZgr1, Zgr paramZgr2) {
    return (paramZgr1.ZU == paramZgr2.ZU && paramZgr1.ZC == paramZgr2.ZC && paramZgr1.ZB == paramZgr2.ZB && paramZgr1.Zi == paramZgr2.Zi && paramZgr1.Zp == paramZgr2.Zp);
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc ',@R)\\t4J7D)H&N'Bu J6T`C7S)\HwTqh&S8P!.[ T`C B<]o.O'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zgr.a : Ljava/lang/String;
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
    //   80: bipush #92
    //   82: goto -> 112
    //   85: bipush #74
    //   87: goto -> 112
    //   90: bipush #21
    //   92: goto -> 112
    //   95: bipush #79
    //   97: goto -> 112
    //   100: bipush #104
    //   102: goto -> 112
    //   105: bipush #29
    //   107: goto -> 112
    //   110: bipush #103
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
    //   154: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   157: putstatic com/fasterxml/Zgr.ZT : Lcom/fasterxml/Zqh;
    //   160: new com/fasterxml/Zgr
    //   163: dup
    //   164: getstatic com/fasterxml/Zgr.ZT : Lcom/fasterxml/Zqh;
    //   167: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   170: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   173: getstatic com/fasterxml/Zqh.ANY : Lcom/fasterxml/Zqh;
    //   176: getstatic com/fasterxml/Zqh.PUBLIC_ONLY : Lcom/fasterxml/Zqh;
    //   179: invokespecial <init> : (Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;)V
    //   182: putstatic com/fasterxml/Zgr.ZY : Lcom/fasterxml/Zgr;
    //   185: new com/fasterxml/Zgr
    //   188: dup
    //   189: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   192: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   195: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   198: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   201: getstatic com/fasterxml/Zqh.DEFAULT : Lcom/fasterxml/Zqh;
    //   204: invokespecial <init> : (Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;Lcom/fasterxml/Zqh;)V
    //   207: putstatic com/fasterxml/Zgr.Zy : Lcom/fasterxml/Zgr;
    //   210: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */