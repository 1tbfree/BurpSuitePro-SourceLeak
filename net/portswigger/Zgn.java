package net.portswigger;

import burp.Zbqc;
import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Zgn implements Runnable, Closeable {
  private static final Runnable Zi;
  
  private Zma Zq;
  
  private static final Zu0 Zz;
  
  private static final byte[] Zn;
  
  private final AtomicBoolean Zo = new AtomicBoolean(true);
  
  public final boolean ZU;
  
  private final ServerSocket ZV;
  
  private final Runnable Zk;
  
  private final Consumer<Zgn> ZD;
  
  private final Zow ZP;
  
  private final Zc4 Zv;
  
  private final Zay ZW;
  
  private final boolean Zf;
  
  private final Zvk Za;
  
  private final ExecutorService ZM;
  
  private final Optional<String> ZZ;
  
  private final int Zu;
  
  private final int Zc;
  
  private final int ZX;
  
  private final boolean Zp;
  
  private final Socket[] Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void close() {
    try {
      if (!this.Zo.get())
        return; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.Zo.set(false);
    try {
      this.ZV.close();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
    try {
      ZF();
      if (this.Zq != null)
        this.Zq.ZD(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZM.shutdown();
    try {
      this.ZM.awaitTermination(10L, TimeUnit.SECONDS);
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    this.Za.ZW();
  }
  
  public boolean ZQ() {
    return this.Zo.get();
  }
  
  Zgn(boolean paramBoolean1, Optional<String> paramOptional, ServerSocket paramServerSocket, ExecutorService paramExecutorService, Runnable paramRunnable, Consumer<Zgn> paramConsumer, Zow paramZow, Zc4 paramZc4, Zay paramZay, boolean paramBoolean2, Zvk paramZvk, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean3, int paramInt4) {
    this.ZU = paramBoolean1;
    this.ZZ = paramOptional;
    this.ZV = paramServerSocket;
    this.Zk = paramRunnable;
    this.ZD = paramConsumer;
    this.ZP = paramZow;
    this.Zv = paramZc4;
    this.ZW = paramZay;
    String str = Zu0.ZK();
    try {
      this.Zf = paramBoolean2;
      this.Za = paramZvk;
      this.ZM = paramExecutorService;
      this.Zu = paramInt1;
      this.Zc = paramInt2;
      this.ZX = paramInt3;
      this.Zp = paramBoolean3;
      this.Zt = new Socket[paramInt4];
      if (Zbqc.Zwu() == null)
        Zu0.Zj("jBwdFc"); 
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
  }
  
  public void run() {
    String str = Zu0.ZK();
    try {
      try {
        if (this.Za instanceof Zlk) {
          this.Zq = new Zma();
          this.ZM.execute(this.Zq);
        } 
      } catch (OutOfMemoryError outOfMemoryError) {
        throw a(null);
      } 
      boolean bool = true;
      while (this.Zo.get()) {
        try {
          byte b = -1;
          byte b1 = 0;
          while (b1 < this.Zt.length) {
            try {
              if (this.Zt[b1] != null)
                try {
                  if (this.Zt[b1].isClosed())
                    this.Zt[b1] = null; 
                } catch (OutOfMemoryError outOfMemoryError) {
                  throw a(null);
                }  
            } catch (OutOfMemoryError outOfMemoryError) {
              throw a(null);
            } 
            try {
              if (this.Zt[b1] == null && b == -1)
                b = b1; 
            } catch (OutOfMemoryError outOfMemoryError) {
              throw a(null);
            } 
            b1++;
            if (str != null)
              break; 
          } 
          if (b != -1 || str != null) {
            if (bool) {
              bool = false;
              this.ZM.execute(this::lambda$run$1);
            } 
            this.Zt[b] = this.ZV.accept();
            this.ZM.execute(new Ztd(this, this.Zt[b], this.ZW));
          } 
        } catch (OutOfMemoryError outOfMemoryError) {
          Zah.Zl(outOfMemoryError, Zk_.COMMON_RUNTIME_FAILURE);
          this.Zk.run();
          Thread.sleep(1000L);
          if (str != null)
            break; 
        } 
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } catch (RejectedExecutionException rejectedExecutionException) {
      Zah.Zl(rejectedExecutionException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      Zah.Zl(indexOutOfBoundsException, Zk_.IMPOSSIBLE);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } finally {
      close();
    } 
  }
  
  private void ZF() {
    // Byte code:
    //   0: invokestatic ZK : ()Ljava/lang/String;
    //   3: iconst_0
    //   4: istore_2
    //   5: astore_1
    //   6: iload_2
    //   7: aload_0
    //   8: getfield Zt : [Ljava/net/Socket;
    //   11: arraylength
    //   12: if_icmpge -> 92
    //   15: aload_0
    //   16: getfield Zt : [Ljava/net/Socket;
    //   19: iload_2
    //   20: aaload
    //   21: astore_3
    //   22: aload_3
    //   23: ifnonnull -> 30
    //   26: aload_1
    //   27: ifnull -> 85
    //   30: aload_3
    //   31: invokevirtual isClosed : ()Z
    //   34: ifeq -> 48
    //   37: aload_0
    //   38: getfield Zt : [Ljava/net/Socket;
    //   41: iload_2
    //   42: aconst_null
    //   43: aastore
    //   44: aload_1
    //   45: ifnull -> 85
    //   48: aload_3
    //   49: invokevirtual close : ()V
    //   52: aload_0
    //   53: getfield Zt : [Ljava/net/Socket;
    //   56: iload_2
    //   57: aconst_null
    //   58: aastore
    //   59: goto -> 85
    //   62: astore #4
    //   64: aload #4
    //   66: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   69: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   72: goto -> 85
    //   75: astore #4
    //   77: aload #4
    //   79: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   82: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   85: iinc #2, 1
    //   88: aload_1
    //   89: ifnull -> 6
    //   92: return
    // Exception table:
    //   from	to	target	type
    //   22	26	62	java/io/IOException
    //   22	26	75	java/lang/Throwable
    //   30	44	62	java/io/IOException
    //   30	44	75	java/lang/Throwable
    //   48	59	62	java/io/IOException
    //   48	59	75	java/lang/Throwable
  }
  
  protected void finalize() {
    close();
  }
  
  public String Zx() {
    return this.ZV.getInetAddress().getHostName();
  }
  
  public int Zy() {
    return this.ZV.getLocalPort();
  }
  
  public String Zw() {
    try {
    
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    try {
      (new Object[3])[0] = this.ZU ? "s" : "";
      (new Object[3])[1] = Zx();
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    return String.format(a(593, -20731), new Object[] { null, null, (Zy() == 80) ? "" : String.format(a(603, 365), new Object[] { Integer.valueOf(Zy()) }) });
  }
  
  private boolean ZK(Zvw paramZvw) {
    try {
    
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    return ((Boolean)Zn4.<String, String, Boolean>ZS(this.ZZ, paramZvw.Zk(a(595, -29189)), String::equalsIgnoreCase).orElse(Boolean.valueOf(!this.ZZ.isPresent()))).booleanValue();
  }
  
  private static boolean ZF(String paramString, Zvw paramZvw) {
    try {
      if (paramZvw.Zp(a(598, 19873)))
        try {
          if (paramZvw.Zm(a(602, 15252), a(599, -31797)))
            try {
              if (paramZvw.ZE(a(597, 28090), a(592, -7921)))
                try {
                  if (Zr(paramString));
                } catch (RejectedExecutionException rejectedExecutionException) {
                  throw a(null);
                }  
            } catch (RejectedExecutionException rejectedExecutionException) {
              throw a(null);
            }  
        } catch (RejectedExecutionException rejectedExecutionException) {
          throw a(null);
        }  
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean Zr(String paramString) {
    try {
      if (paramString != null)
        try {
          if ((Zny.ZI(paramString)).length == 24);
        } catch (RejectedExecutionException rejectedExecutionException) {
          throw a(null);
        }  
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    return false;
  }
  
  private static boolean lambda$openSockets$2(Socket paramSocket) {
    try {
    
    } catch (RejectedExecutionException rejectedExecutionException) {
      throw a(null);
    } 
    return !paramSocket.isClosed();
  }
  
  private void lambda$run$1() {
    this.ZD.accept(this);
  }
  
  private static void lambda$static$0() {
    System.err.println(a(596, 23979));
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Çy'C#Z:ùª&&Ï¸~3\\r°vP,GØoPÐïVXúÉ%ç\\tÍ®Õ¬¥Ý-³\\nÙ>Ú¯ÜÐëZóaGümJ[7ÿ#7à¢|&'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #107
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '9(û=E¾`»'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #95
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic net/portswigger/Zgn.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zgn.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #77
    //   214: goto -> 244
    //   217: bipush #85
    //   219: goto -> 244
    //   222: bipush #11
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #38
    //   234: goto -> 244
    //   237: bipush #33
    //   239: goto -> 244
    //   242: bipush #52
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: sipush #594
    //   303: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   308: putstatic net/portswigger/Zgn.Zi : Ljava/lang/Runnable;
    //   311: sipush #-32436
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: invokestatic ZE : (Ljava/lang/String;)Lnet/portswigger/Zu0;
    //   320: invokevirtual Zt : ()Lnet/portswigger/Zu0;
    //   323: putstatic net/portswigger/Zgn.Zz : Lnet/portswigger/Zu0;
    //   326: getstatic net/portswigger/Zgn.Zz : Lnet/portswigger/Zu0;
    //   329: invokevirtual ZW : ()[B
    //   332: putstatic net/portswigger/Zgn.Zn : [B
    //   335: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x253) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'þ';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zgn.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */