package burp;

import java.util.concurrent.CountDownLatch;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zemh implements Runnable, Zz7r {
  private final Zmj Zj = this.ZJ.Zz.Ze(this.ZJ.ZI, this.ZJ.ZR, this.ZJ.Zp);
  
  private final CountDownLatch Zu = new CountDownLatch(1);
  
  private volatile boolean Zc;
  
  final Zxx6 ZJ;
  
  private static final String a;
  
  private Zemh(Zxx6 paramZxx6) {}
  
  public void run() {
    // Byte code:
    //   0: invokestatic Zz : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZJ : Lburp/Zxx6;
    //   8: invokevirtual Za : ()Z
    //   11: ifeq -> 354
    //   14: aconst_null
    //   15: astore_2
    //   16: aconst_null
    //   17: astore_3
    //   18: aload_0
    //   19: getfield Zj : Lburp/Zmj;
    //   22: invokevirtual ZJ : ()V
    //   25: aload_0
    //   26: invokevirtual ZR : ()Lburp/Zlu6;
    //   29: astore_2
    //   30: aload_0
    //   31: getfield ZJ : Lburp/Zxx6;
    //   34: getfield ZH : Lburp/Zt4u;
    //   37: aload_2
    //   38: invokevirtual ZD : (Lburp/Zlu6;)V
    //   41: aload_0
    //   42: getfield Zc : Z
    //   45: ifne -> 62
    //   48: aload_0
    //   49: getfield Zj : Lburp/Zmj;
    //   52: invokevirtual Z_ : ()V
    //   55: goto -> 62
    //   58: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   61: athrow
    //   62: aload_2
    //   63: ifnull -> 72
    //   66: aload_2
    //   67: invokevirtual Zn : ()V
    //   70: aconst_null
    //   71: astore_2
    //   72: aload_0
    //   73: getfield Zu : Ljava/util/concurrent/CountDownLatch;
    //   76: invokevirtual countDown : ()V
    //   79: goto -> 282
    //   82: astore #4
    //   84: aload #4
    //   86: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   89: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   92: aload #4
    //   94: invokevirtual getMessage : ()Ljava/lang/String;
    //   97: astore_3
    //   98: aload_2
    //   99: ifnull -> 108
    //   102: aload_2
    //   103: invokevirtual Zn : ()V
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_0
    //   109: getfield Zu : Ljava/util/concurrent/CountDownLatch;
    //   112: invokevirtual countDown : ()V
    //   115: goto -> 282
    //   118: astore #4
    //   120: aload #4
    //   122: aload #4
    //   124: invokevirtual ZN : ()Z
    //   127: ifeq -> 140
    //   130: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   133: goto -> 143
    //   136: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   139: athrow
    //   140: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   143: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   146: aload #4
    //   148: invokevirtual getMessage : ()Ljava/lang/String;
    //   151: astore_3
    //   152: aload_2
    //   153: ifnull -> 162
    //   156: aload_2
    //   157: invokevirtual Zn : ()V
    //   160: aconst_null
    //   161: astore_2
    //   162: aload_0
    //   163: getfield Zu : Ljava/util/concurrent/CountDownLatch;
    //   166: invokevirtual countDown : ()V
    //   169: goto -> 282
    //   172: astore #4
    //   174: aload #4
    //   176: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   179: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   182: getstatic burp/Zemh.a : Ljava/lang/String;
    //   185: astore_3
    //   186: aload_2
    //   187: ifnull -> 196
    //   190: aload_2
    //   191: invokevirtual Zn : ()V
    //   194: aconst_null
    //   195: astore_2
    //   196: aload_0
    //   197: getfield Zu : Ljava/util/concurrent/CountDownLatch;
    //   200: invokevirtual countDown : ()V
    //   203: goto -> 282
    //   206: astore #4
    //   208: aload #4
    //   210: aload #4
    //   212: invokestatic Zm : (Ljava/lang/Throwable;)Z
    //   215: ifeq -> 228
    //   218: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   221: goto -> 231
    //   224: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   227: athrow
    //   228: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   231: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   234: aload #4
    //   236: invokevirtual getMessage : ()Ljava/lang/String;
    //   239: astore_3
    //   240: aload_2
    //   241: ifnull -> 250
    //   244: aload_2
    //   245: invokevirtual Zn : ()V
    //   248: aconst_null
    //   249: astore_2
    //   250: aload_0
    //   251: getfield Zu : Ljava/util/concurrent/CountDownLatch;
    //   254: invokevirtual countDown : ()V
    //   257: goto -> 282
    //   260: astore #5
    //   262: aload_2
    //   263: ifnull -> 272
    //   266: aload_2
    //   267: invokevirtual Zn : ()V
    //   270: aconst_null
    //   271: astore_2
    //   272: aload_0
    //   273: getfield Zu : Ljava/util/concurrent/CountDownLatch;
    //   276: invokevirtual countDown : ()V
    //   279: aload #5
    //   281: athrow
    //   282: aload_3
    //   283: ifnonnull -> 308
    //   286: aload_0
    //   287: getfield Zj : Lburp/Zmj;
    //   290: invokevirtual Zw : ()V
    //   293: aload_0
    //   294: invokevirtual ZB : ()V
    //   297: iload_1
    //   298: ifne -> 351
    //   301: goto -> 308
    //   304: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   307: athrow
    //   308: aload_0
    //   309: getfield Zj : Lburp/Zmj;
    //   312: aload_3
    //   313: aload_0
    //   314: invokevirtual Zy : (Ljava/lang/String;Lburp/Zz7r;)V
    //   317: getstatic burp/Zmgc.BACKUP_FAILURE : Lburp/Zmgc;
    //   320: aload_0
    //   321: getfield ZJ : Lburp/Zxx6;
    //   324: getfield ZX : Lburp/Zskh;
    //   327: invokeinterface Zz : ()Lburp/Zskh;
    //   332: iconst_1
    //   333: anewarray java/lang/Object
    //   336: dup
    //   337: iconst_0
    //   338: aload_3
    //   339: aastore
    //   340: invokevirtual ZV : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   343: pop
    //   344: goto -> 351
    //   347: invokestatic a : (Lburp/Zev3;)Lburp/Zev3;
    //   350: athrow
    //   351: invokestatic gc : ()V
    //   354: return
    // Exception table:
    //   from	to	target	type
    //   18	62	82	burp/Zev3
    //   18	62	82	burp/Zb_f
    //   18	62	82	java/io/IOException
    //   18	62	118	burp/Ztgq
    //   18	62	172	java/lang/OutOfMemoryError
    //   18	62	206	java/lang/Throwable
    //   18	62	260	finally
    //   30	55	58	burp/Zev3
    //   82	98	260	finally
    //   118	152	260	finally
    //   120	136	136	burp/Zev3
    //   172	186	260	finally
    //   206	240	260	finally
    //   208	224	224	burp/Zev3
    //   260	262	260	finally
    //   282	301	304	burp/Zev3
    //   286	344	347	burp/Zev3
  }
  
  private Zlu6 ZR() throws Zev3 {
    return (new Zm6w(this.ZJ.Zc, this.ZJ.Zg, this.ZJ.ZG, this.ZJ.ZQ, this.ZJ.Zl, this.ZJ.Zf)).Zf(this.ZJ.ZR.ZEv()).Zw(new Ztag(this.Zj.ZO())).Zo();
  }
  
  void ZH() {
    this.Zc = true;
    Zlc8 zlc8 = this.Zj.ZO();
    if (zlc8 != null) {
      boolean bool;
      zlc8.Zd(true);
      synchronized (this.ZJ.ZZ) {
        bool = (this.ZJ.Zs == this) ? true : false;
      } 
      if (bool)
        try {
          this.Zu.await();
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.IGNORED);
        }  
    } 
  }
  
  public void ZB() {
    synchronized (this.ZJ.ZZ) {
      this.ZJ.Zs = null;
    } 
  }
  
  private static Zev3 a(Zev3 paramZev3) {
    return paramZev3;
  }
  
  static {
    // Byte code:
    //   0: bipush #56
    //   2: ldc 'so z-cvOe'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zemh.a : Ljava/lang/String;
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
    //   80: bipush #120
    //   82: goto -> 112
    //   85: bipush #62
    //   87: goto -> 112
    //   90: bipush #35
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #86
    //   102: goto -> 112
    //   105: bipush #36
    //   107: goto -> 112
    //   110: bipush #14
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zemh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */