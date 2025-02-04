package net.portswigger.devtools.client.impl;

import burp.Zbqc;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import net.portswigger.browser.Ze1;
import net.portswigger.browser.Zev;
import net.portswigger.browser.Ztk;
import net.portswigger.browser.Zw;
import net.portswigger.devtools.client.Zn;
import net.portswigger.devtools.protocol.ChromeDevTools;
import net.portswigger.devtools.protocol.types.browser.Bounds;
import net.portswigger.devtools.protocol.types.browser.WindowForTarget;

public class Zxw implements Zw {
  private final Zev Zk;
  
  private final Zn Zw;
  
  private final Zx3 ZM;
  
  private static final String a;
  
  public Zxw(Zev paramZev, Zn paramZn) {
    this.Zk = paramZev;
    this.Zw = paramZn;
    int i = Zx3.ZG();
    try {
      this.ZM = new Zx3(paramZn);
      if (i == 0)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (Ze1 ze1) {
      throw a(null);
    } 
  }
  
  public void ZW(int paramInt1, int paramInt2) throws Ztk {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZM : Lnet/portswigger/devtools/client/impl/Zx3;
    //   4: iload_1
    //   5: iload_2
    //   6: invokevirtual Zf : (II)Z
    //   9: ifeq -> 238
    //   12: aload_0
    //   13: getfield ZM : Lnet/portswigger/devtools/client/impl/Zx3;
    //   16: iload_1
    //   17: iload_2
    //   18: invokevirtual ZW : (II)V
    //   21: aload_0
    //   22: getfield Zw : Lnet/portswigger/devtools/client/Zn;
    //   25: aload_0
    //   26: <illegal opcode> Zy : (Lnet/portswigger/devtools/client/impl/Zxw;)Lnet/portswigger/devtools/client/Zs;
    //   31: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   34: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   37: aload_0
    //   38: iload_1
    //   39: iload_2
    //   40: <illegal opcode> apply : (Lnet/portswigger/devtools/client/impl/Zxw;II)Ljava/util/function/Function;
    //   45: invokevirtual thenCompose : (Ljava/util/function/Function;)Ljava/util/concurrent/CompletableFuture;
    //   48: aload_0
    //   49: getfield Zw : Lnet/portswigger/devtools/client/Zn;
    //   52: invokevirtual Zf : ()Ljava/time/Duration;
    //   55: invokevirtual toMillis : ()J
    //   58: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   61: invokevirtual get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   64: pop
    //   65: goto -> 238
    //   68: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   71: athrow
    //   72: astore_3
    //   73: aload_3
    //   74: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   77: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   80: aload_3
    //   81: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   84: astore #5
    //   86: aload #5
    //   88: instanceof net/portswigger/devtools/client/Zi
    //   91: ifeq -> 192
    //   94: aload #5
    //   96: checkcast net/portswigger/devtools/client/Zi
    //   99: astore #4
    //   101: aload #4
    //   103: dup
    //   104: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: pop
    //   108: astore #5
    //   110: iconst_0
    //   111: istore #6
    //   113: aload #5
    //   115: iload #6
    //   117: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   122: lookupswitch default -> 182, 0 -> 148, 1 -> 165
    //   148: aload #5
    //   150: checkcast net/portswigger/devtools/client/Z_
    //   153: astore #7
    //   155: new net/portswigger/browser/Ztj
    //   158: dup
    //   159: aload #7
    //   161: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   164: athrow
    //   165: aload #5
    //   167: checkcast net/portswigger/devtools/client/Zp
    //   170: astore #8
    //   172: new net/portswigger/browser/Zti
    //   175: dup
    //   176: aload #8
    //   178: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   181: athrow
    //   182: new net/portswigger/browser/Ztq
    //   185: dup
    //   186: aload #4
    //   188: invokespecial <init> : (Ljava/io/IOException;)V
    //   191: athrow
    //   192: new net/portswigger/browser/Ze1
    //   195: dup
    //   196: aload_3
    //   197: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   200: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   203: athrow
    //   204: astore_3
    //   205: aload_3
    //   206: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   209: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   212: invokestatic currentThread : ()Ljava/lang/Thread;
    //   215: invokevirtual interrupt : ()V
    //   218: goto -> 238
    //   221: astore_3
    //   222: aload_3
    //   223: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   226: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   229: new net/portswigger/browser/Ze1
    //   232: dup
    //   233: aload_3
    //   234: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   237: athrow
    //   238: return
    // Exception table:
    //   from	to	target	type
    //   0	68	68	net/portswigger/browser/Ztk
    //   12	65	72	java/util/concurrent/ExecutionException
    //   12	65	204	java/lang/InterruptedException
    //   12	65	221	java/util/concurrent/TimeoutException
  }
  
  public void Zp() throws Ztk {
    this.ZM.Zp();
  }
  
  public String toString() {
    return a + a;
  }
  
  private CompletionStage lambda$setDimensions$2(int paramInt1, int paramInt2, WindowForTarget paramWindowForTarget) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zw : Lnet/portswigger/devtools/client/Zn;
    //   4: aload_3
    //   5: iload_1
    //   6: iload_2
    //   7: <illegal opcode> Zy : (Lnet/portswigger/devtools/protocol/types/browser/WindowForTarget;II)Lnet/portswigger/devtools/client/Zs;
    //   12: invokestatic ZA : (Lnet/portswigger/devtools/client/Zs;)Lnet/portswigger/devtools/client/Zk;
    //   15: invokevirtual ZL : (Lnet/portswigger/devtools/client/Zk;)Ljava/util/concurrent/CompletableFuture;
    //   18: areturn
  }
  
  private static CompletableFuture lambda$setDimensions$1(WindowForTarget paramWindowForTarget, int paramInt1, int paramInt2, ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getBrowser().setWindowBounds(paramWindowForTarget.windowId, new Bounds(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), null));
  }
  
  private CompletableFuture lambda$setDimensions$0(ChromeDevTools paramChromeDevTools) {
    return paramChromeDevTools.getBrowser().getWindowForTarget(this.Zk.ZB3());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #61
    //   2: ldc 'Rg``67Ybkr1 0VaawFA'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zxw.a : Ljava/lang/String;
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
    //   80: bipush #99
    //   82: goto -> 112
    //   85: bipush #10
    //   87: goto -> 112
    //   90: bipush #59
    //   92: goto -> 112
    //   95: bipush #57
    //   97: goto -> 112
    //   100: bipush #56
    //   102: goto -> 112
    //   105: bipush #65
    //   107: goto -> 112
    //   110: bipush #92
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zxw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */