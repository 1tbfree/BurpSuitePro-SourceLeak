package burp;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import net.portswigger.browser.Zjw;

public class Zzza implements Zthl {
  private final Consumer<Zrp0> Ze;
  
  private final Zs5d Zi;
  
  private final AtomicBoolean ZC;
  
  private final Zzb ZU;
  
  private volatile Zjw ZM;
  
  private static final String a;
  
  public Zzza(Consumer<Zrp0> paramConsumer, Zs5d paramZs5d, Zkvp paramZkvp, Zlax paramZlax) {
    this.Ze = paramConsumer;
    this.Zi = paramZs5d;
    this.ZC = new AtomicBoolean();
    this.ZU = paramZlax.Zh(paramZkvp);
  }
  
  public Zzl1 ZS(Zlvj paramZlvj, Zrp0 paramZrp0, Zlru paramZlru, Zlit paramZlit, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    try {
      ZS();
      if (this.ZC.get())
        throw new Zktz(); 
    } catch (Zmnt zmnt) {
      throw a(null);
    } 
    try {
      if (Zg(paramZrp0)) {
        Z_();
        return this.Zi.ZS(paramZlvj, paramZrp0, paramZlru, paramZlit, paramZz3v);
      } 
    } catch (Zmnt zmnt) {
      throw a(null);
    } 
    Zkof zkof = this.ZU.Zu(paramZlvj, paramZrp0, paramZlru, paramZz3v);
    this.ZM = zkof.Zzq();
    this.Ze.accept(paramZrp0);
    return zkof.Zzk();
  }
  
  public Zzl1 ZS(Zm72 paramZm72, Zz3v paramZz3v) throws Zmny, Zmnt, Zmn5 {
    try {
      ZS();
      if (this.ZC.get())
        throw new Zktz(); 
    } catch (Zmny zmny) {
      throw a(null);
    } 
    Zkof zkof = this.ZU.ZM(paramZm72, paramZz3v);
    this.ZM = zkof.Zzq();
    this.Ze.accept(paramZm72);
    return zkof.Zzk();
  }
  
  public Zzl1 ZQ(Zg8y paramZg8y, Zrp0 paramZrp0, Zlru paramZlru, Zlit paramZlit, Zz3v paramZz3v) throws Zmnt, Zmny, Zmn5 {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZC : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   4: invokevirtual get : ()Z
    //   7: ifeq -> 22
    //   10: new burp/Zktz
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: athrow
    //   18: invokestatic a : (Lburp/Zmnk;)Lburp/Zmnk;
    //   21: athrow
    //   22: aload_0
    //   23: aload_2
    //   24: invokevirtual Zg : (Lburp/Zrp0;)Z
    //   27: ifeq -> 53
    //   30: aload_0
    //   31: invokevirtual Z_ : ()V
    //   34: aload_0
    //   35: getfield Zi : Lburp/Zs5d;
    //   38: aload_1
    //   39: aload_2
    //   40: aload_3
    //   41: aload #4
    //   43: aload #5
    //   45: invokevirtual ZQ : (Lburp/Zg8y;Lburp/Zrp0;Lburp/Zlru;Lburp/Zlit;Lburp/Zz3v;)Lburp/Zzl1;
    //   48: areturn
    //   49: invokestatic a : (Lburp/Zmnk;)Lburp/Zmnk;
    //   52: athrow
    //   53: aload_1
    //   54: dup
    //   55: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: pop
    //   59: astore #7
    //   61: iconst_0
    //   62: istore #8
    //   64: aload #7
    //   66: iload #8
    //   68: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   73: lookupswitch default -> 100, 0 -> 114, 1 -> 170
    //   100: new java/lang/MatchException
    //   103: dup
    //   104: aconst_null
    //   105: aconst_null
    //   106: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   109: athrow
    //   110: invokestatic a : (Lburp/Zmnk;)Lburp/Zmnk;
    //   113: athrow
    //   114: aload #7
    //   116: checkcast burp/Ztiv
    //   119: astore #9
    //   121: aload_0
    //   122: getfield ZM : Lnet/portswigger/browser/Zjw;
    //   125: ifnonnull -> 150
    //   128: iconst_0
    //   129: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   132: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   135: new java/lang/IllegalStateException
    //   138: dup
    //   139: getstatic burp/Zzza.a : Ljava/lang/String;
    //   142: invokespecial <init> : (Ljava/lang/String;)V
    //   145: athrow
    //   146: invokestatic a : (Lburp/Zmnk;)Lburp/Zmnk;
    //   149: athrow
    //   150: aload_0
    //   151: getfield ZU : Lburp/Zzb;
    //   154: aload_0
    //   155: getfield ZM : Lnet/portswigger/browser/Zjw;
    //   158: aload #9
    //   160: aload_2
    //   161: aload_3
    //   162: aload #5
    //   164: invokevirtual ZK : (Lnet/portswigger/browser/Zjw;Lburp/Ztiv;Lburp/Zrp0;Lburp/Zlru;Lburp/Zz3v;)Lburp/Zzl1;
    //   167: goto -> 227
    //   170: aload #7
    //   172: checkcast burp/Zlvj
    //   175: astore #10
    //   177: aload_0
    //   178: getfield ZM : Lnet/portswigger/browser/Zjw;
    //   181: ifnull -> 195
    //   184: aload_0
    //   185: invokevirtual Z_ : ()V
    //   188: goto -> 195
    //   191: invokestatic a : (Lburp/Zmnk;)Lburp/Zmnk;
    //   194: athrow
    //   195: aload_0
    //   196: getfield ZU : Lburp/Zzb;
    //   199: aload #10
    //   201: aload_2
    //   202: aload_3
    //   203: aload #5
    //   205: invokevirtual Zu : (Lburp/Zlvj;Lburp/Zrp0;Lburp/Zlru;Lburp/Zz3v;)Lburp/Zkof;
    //   208: astore #11
    //   210: aload_0
    //   211: aload #11
    //   213: invokevirtual Zzq : ()Lnet/portswigger/browser/Zjw;
    //   216: putfield ZM : Lnet/portswigger/browser/Zjw;
    //   219: aload #11
    //   221: invokevirtual Zzk : ()Lburp/Zzl1;
    //   224: goto -> 227
    //   227: astore #6
    //   229: aload_0
    //   230: getfield Ze : Ljava/util/function/Consumer;
    //   233: aload_2
    //   234: invokeinterface accept : (Ljava/lang/Object;)V
    //   239: aload #6
    //   241: areturn
    // Exception table:
    //   from	to	target	type
    //   0	18	18	burp/Zmnt
    //   22	49	49	burp/Zmnt
    //   64	110	110	burp/Zmnt
    //   121	146	146	burp/Zmnt
    //   177	188	191	burp/Zmnt
  }
  
  public Zsxd Zb(Zrp0 paramZrp0, Zefx paramZefx, Zz3v paramZz3v) throws Zmnt, Zmn5 {
    return this.Zi.Zb(paramZrp0, paramZefx, paramZz3v);
  }
  
  public void Zh() {
    this.ZC.set(true);
    this.ZU.Zj();
    this.Zi.Zh();
  }
  
  public void Z_() {
    this.ZU.Zv(this.ZM);
    this.ZM = null;
  }
  
  private void ZS() {
    this.Zi.Zm();
    this.ZU.ZA();
    this.ZM = null;
  }
  
  private boolean Zg(Zrp0 paramZrp0) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: astore_2
    //   7: iconst_0
    //   8: istore_3
    //   9: aload_2
    //   10: iload_3
    //   11: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   16: tableswitch default -> 74, 0 -> 44, 1 -> 54, 2 -> 64
    //   44: aload_2
    //   45: checkcast burp/Zs6o
    //   48: astore #4
    //   50: iconst_1
    //   51: goto -> 75
    //   54: aload_2
    //   55: checkcast burp/Zso5
    //   58: astore #5
    //   60: iconst_1
    //   61: goto -> 75
    //   64: aload_2
    //   65: checkcast burp/Zbio
    //   68: astore #6
    //   70: iconst_1
    //   71: goto -> 75
    //   74: iconst_0
    //   75: ireturn
  }
  
  private static Zmnk a(Zmnk paramZmnk) {
    return paramZmnk;
  }
  
  static {
    // Byte code:
    //   0: bipush #64
    //   2: ldc 'uM2+TAILu O|Z0  \\bOwK</L\\bR{['
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zzza.a : Ljava/lang/String;
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
    //   80: bipush #97
    //   82: goto -> 112
    //   85: bipush #94
    //   87: goto -> 112
    //   90: bipush #127
    //   92: goto -> 112
    //   95: bipush #21
    //   97: goto -> 112
    //   100: bipush #14
    //   102: goto -> 112
    //   105: bipush #96
    //   107: goto -> 112
    //   110: bipush #33
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */