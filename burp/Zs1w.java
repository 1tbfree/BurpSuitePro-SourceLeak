package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zs1w implements Zzdz {
  private final Ze34 Zn;
  
  private final Zgpi ZN;
  
  private final Zm31 Zu;
  
  private final Zm31 Zr;
  
  private boolean Zs = true;
  
  private static final String a;
  
  Zs1w(Ze34 paramZe34, Zgpi paramZgpi, Zm31 paramZm311, Zm31 paramZm312) {
    this.Zn = paramZe34;
    this.ZN = paramZgpi;
    this.Zu = paramZm311;
    this.Zr = paramZm312;
  }
  
  public void ZV(Zsqo paramZsqo) {
    Za(paramZsqo::lambda$visitBooleanArray$0);
  }
  
  public void Zz(Zstu paramZstu) {
    Za(paramZstu::lambda$visitByteArray$1);
  }
  
  public void ZR(Zmrq paramZmrq) {
    Za(paramZmrq::lambda$visitGrowableByteArray$2);
  }
  
  public void ZP(Ze4r paramZe4r) {
    Za(paramZe4r::lambda$visitCharArray$3);
  }
  
  public void ZX(Zm5a paramZm5a) {
    Za(paramZm5a::lambda$visitShortLongArray$4);
  }
  
  public void Zq(Ztrj paramZtrj) {
    Za(paramZtrj::lambda$visitIntLongArray$5);
  }
  
  public void Zi(Zg60 paramZg60) {
    Za(paramZg60::lambda$visitDoubleLongArray$6);
  }
  
  public void ZK(Zzxh paramZzxh) {
    Za(paramZzxh::lambda$visitIntLongByteArray$7);
  }
  
  public void ZO(Zmxo paramZmxo) {
    Za(paramZmxo::lambda$visitIntLongShortArray$8);
  }
  
  public void ZD(Zs62 paramZs62) {
    Za(paramZs62::lambda$visitIntLongIntArray$9);
  }
  
  public void Zv(Zmn2 paramZmn2) {
    Za(paramZmn2::lambda$visitIntLongLongArray$10);
  }
  
  public void ZE(Zghu paramZghu) {
    Za(paramZghu::lambda$visitShortArray$11);
  }
  
  public void ZU(Zmyi paramZmyi) {
    Za(paramZmyi::lambda$visitIntArray$12);
  }
  
  public void ZO(Zrap paramZrap) {
    Za(paramZrap::lambda$visitLongArray$13);
  }
  
  public void ZW(Zrte paramZrte) {
    Za(paramZrte::lambda$visitObjectArray$14);
  }
  
  public void ZT(Zb0w paramZb0w) {
    Za(paramZb0w::lambda$visitTripleLongArray$15);
  }
  
  private void Za(Runnable paramRunnable) {
    try {
      paramRunnable.run();
    } catch (Exception exception) {
      Zah.ZU(new Zkfw(exception), ZA(), Zk_.UNEXPECTED);
      this.Zs = false;
    } 
  }
  
  private String ZA() {
    return String.format(a, new Object[] { Zkqg.ZK(this.ZN), Zkqg.ZK(this.Zu), Byte.valueOf(this.Zu.ZH()), Zkqg.ZK(this.Zr), Byte.valueOf(this.Zr.ZH()), Zkqg.ZK(this.Zn) });
  }
  
  private static void lambda$visitTripleLongArray$15(Zb0w paramZb0w) {
    paramZb0w.Zuk(0);
  }
  
  private static void lambda$visitObjectArray$14(Zrte paramZrte) {
    paramZrte.ZdF(0);
  }
  
  private static void lambda$visitLongArray$13(Zrap paramZrap) {
    paramZrap.ZEn(0);
  }
  
  private static void lambda$visitIntArray$12(Zmyi paramZmyi) {
    paramZmyi.ZN(0);
  }
  
  private static void lambda$visitShortArray$11(Zghu paramZghu) {
    paramZghu.ZCO(0);
  }
  
  private static void lambda$visitIntLongLongArray$10(Zmn2 paramZmn2) {
    paramZmn2.ZbN(0);
  }
  
  private static void lambda$visitIntLongIntArray$9(Zs62 paramZs62) {
    paramZs62.ZbE(0);
  }
  
  private static void lambda$visitIntLongShortArray$8(Zmxo paramZmxo) {
    paramZmxo.ZsV(0);
  }
  
  private static void lambda$visitIntLongByteArray$7(Zzxh paramZzxh) {
    paramZzxh.ZlT(0);
  }
  
  private static void lambda$visitDoubleLongArray$6(Zg60 paramZg60) {
    paramZg60.ZW(0);
  }
  
  private static void lambda$visitIntLongArray$5(Ztrj paramZtrj) {
    paramZtrj.ZF(0);
  }
  
  private static void lambda$visitShortLongArray$4(Zm5a paramZm5a) {
    paramZm5a.Zgd(0);
  }
  
  private static void lambda$visitCharArray$3(Ze4r paramZe4r) {
    paramZe4r.ZY(0);
  }
  
  private static void lambda$visitGrowableByteArray$2(Zmrq paramZmrq) {
    paramZmrq.Zp(0);
  }
  
  private static void lambda$visitByteArray$1(Zstu paramZstu) {
    paramZstu.Zp(0);
  }
  
  private static void lambda$visitBooleanArray$0(Zsqo paramZsqo) {
    paramZsqo.ZV(0);
  }
  
  static {
    // Byte code:
    //   0: bipush #126
    //   2: ldc 'O*\c-?Yj\lqX.Y-CcF_f*0\\b[.Y:B0+`Py ]g,yS.*\\t<O. *k,<\\bH./J|'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs1w.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #20
    //   82: goto -> 111
    //   85: bipush #39
    //   87: goto -> 111
    //   90: bipush #24
    //   92: goto -> 111
    //   95: bipush #66
    //   97: goto -> 111
    //   100: bipush #112
    //   102: goto -> 111
    //   105: iconst_2
    //   106: goto -> 111
    //   109: bipush #55
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1w.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */