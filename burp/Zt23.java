package burp;

import java.util.concurrent.atomic.AtomicReference;

class Zt23 implements Runnable {
  final Zrdb Zd;
  
  final Zrdb ZQ;
  
  final AtomicReference Ze;
  
  final Zlzj Zf;
  
  private static final String a;
  
  Zt23(Zlzj paramZlzj, Zrdb paramZrdb1, Zrdb paramZrdb2, AtomicReference paramAtomicReference) {}
  
  public void run() {
    // Byte code:
    //   0: invokestatic ZZ : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield Zf : Lburp/Zlzj;
    //   8: getfield ZT : Lburp/api/montoya/scanner/ScanCheck;
    //   11: new burp/Zlel
    //   14: dup
    //   15: new burp/Zmu0
    //   18: dup
    //   19: aload_0
    //   20: getfield Zd : Lburp/Zrdb;
    //   23: aload_0
    //   24: getfield Zf : Lburp/Zlzj;
    //   27: getfield ZS : Lburp/Zbnt;
    //   30: aload_0
    //   31: getfield Zf : Lburp/Zlzj;
    //   34: getfield ZF : Lburp/Zkl6;
    //   37: aload_0
    //   38: getfield Zf : Lburp/Zlzj;
    //   41: getfield ZR : Lburp/Ztx8;
    //   44: aload_0
    //   45: getfield Zf : Lburp/Zlzj;
    //   48: getfield ZG : Lburp/Zm6x;
    //   51: invokespecial <init> : (Lburp/Zrdb;Lburp/Zbnt;Lburp/Zkl6;Lburp/Ztx8;Lburp/Zm6x;)V
    //   54: aload_0
    //   55: getfield Zf : Lburp/Zlzj;
    //   58: getfield ZA : Lburp/Zzqf;
    //   61: invokespecial <init> : (Lburp/IScanIssue;Lburp/Zzqf;)V
    //   64: new burp/Zlel
    //   67: dup
    //   68: new burp/Zmu0
    //   71: dup
    //   72: aload_0
    //   73: getfield ZQ : Lburp/Zrdb;
    //   76: aload_0
    //   77: getfield Zf : Lburp/Zlzj;
    //   80: getfield ZS : Lburp/Zbnt;
    //   83: aload_0
    //   84: getfield Zf : Lburp/Zlzj;
    //   87: getfield ZF : Lburp/Zkl6;
    //   90: aload_0
    //   91: getfield Zf : Lburp/Zlzj;
    //   94: getfield ZR : Lburp/Ztx8;
    //   97: aload_0
    //   98: getfield Zf : Lburp/Zlzj;
    //   101: getfield ZG : Lburp/Zm6x;
    //   104: invokespecial <init> : (Lburp/Zrdb;Lburp/Zbnt;Lburp/Zkl6;Lburp/Ztx8;Lburp/Zm6x;)V
    //   107: aload_0
    //   108: getfield Zf : Lburp/Zlzj;
    //   111: getfield ZA : Lburp/Zzqf;
    //   114: invokespecial <init> : (Lburp/IScanIssue;Lburp/Zzqf;)V
    //   117: invokeinterface consolidateIssues : (Lburp/api/montoya/scanner/audit/issues/AuditIssue;Lburp/api/montoya/scanner/audit/issues/AuditIssue;)Lburp/api/montoya/scanner/ConsolidationAction;
    //   122: astore_2
    //   123: getstatic burp/Zg5_.Zq : [I
    //   126: aload_2
    //   127: invokevirtual ordinal : ()I
    //   130: iaload
    //   131: tableswitch default -> 219, 1 -> 156, 2 -> 177, 3 -> 198
    //   156: aload_0
    //   157: getfield Ze : Ljava/util/concurrent/atomic/AtomicReference;
    //   160: getstatic burp/Zl4m.ZX : Lburp/Zl4m;
    //   163: invokevirtual set : (Ljava/lang/Object;)V
    //   166: iload_1
    //   167: ifeq -> 244
    //   170: goto -> 177
    //   173: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   176: athrow
    //   177: aload_0
    //   178: getfield Ze : Ljava/util/concurrent/atomic/AtomicReference;
    //   181: getstatic burp/Zl4m.Zh : Lburp/Zl4m;
    //   184: invokevirtual set : (Ljava/lang/Object;)V
    //   187: iload_1
    //   188: ifeq -> 244
    //   191: goto -> 198
    //   194: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   197: athrow
    //   198: aload_0
    //   199: getfield Ze : Ljava/util/concurrent/atomic/AtomicReference;
    //   202: getstatic burp/Zl4m.Zf : Lburp/Zl4m;
    //   205: invokevirtual set : (Ljava/lang/Object;)V
    //   208: iload_1
    //   209: ifeq -> 244
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   218: athrow
    //   219: new java/lang/Exception
    //   222: dup
    //   223: aload_2
    //   224: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   227: getstatic burp/Zt23.a : Ljava/lang/String;
    //   230: swap
    //   231: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   236: invokespecial <init> : (Ljava/lang/String;)V
    //   239: athrow
    //   240: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   243: athrow
    //   244: goto -> 283
    //   247: astore_2
    //   248: aload_2
    //   249: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   252: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   255: aload_0
    //   256: getfield Zf : Lburp/Zlzj;
    //   259: getfield Zc : Lburp/Zeu1;
    //   262: aload_2
    //   263: aload_0
    //   264: getfield Zf : Lburp/Zlzj;
    //   267: getfield ZV : Lburp/Zskh;
    //   270: invokevirtual ZN : (Ljava/lang/Throwable;Lburp/Zskh;)V
    //   273: aload_0
    //   274: getfield Ze : Ljava/util/concurrent/atomic/AtomicReference;
    //   277: getstatic burp/Zl4m.ZX : Lburp/Zl4m;
    //   280: invokevirtual set : (Ljava/lang/Object;)V
    //   283: aload_0
    //   284: dup
    //   285: astore_2
    //   286: monitorenter
    //   287: aload_0
    //   288: invokevirtual notifyAll : ()V
    //   291: aload_2
    //   292: monitorexit
    //   293: goto -> 301
    //   296: astore_3
    //   297: aload_2
    //   298: monitorexit
    //   299: aload_3
    //   300: athrow
    //   301: return
    // Exception table:
    //   from	to	target	type
    //   4	244	247	java/lang/Throwable
    //   123	170	173	java/lang/Throwable
    //   156	191	194	java/lang/Throwable
    //   177	212	215	java/lang/Throwable
    //   198	240	240	java/lang/Throwable
    //   287	293	296	finally
    //   296	299	296	finally
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #52
    //   2: ldc '=syUNTknrL\\b\\nx{kKO=ilV \\n=NlWO^g{ZramVC|{{}ZtlM\\bcnz{JEN='
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zt23.a : Ljava/lang/String;
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
    //   80: bipush #64
    //   82: goto -> 112
    //   85: bipush #41
    //   87: goto -> 112
    //   90: bipush #59
    //   92: goto -> 112
    //   95: bipush #42
    //   97: goto -> 112
    //   100: bipush #13
    //   102: goto -> 112
    //   105: bipush #89
    //   107: goto -> 112
    //   110: bipush #30
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt23.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */