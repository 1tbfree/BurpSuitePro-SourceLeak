package burp;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zny;
import net.portswigger.Zo8;
import net.portswigger.Zrx3;
import net.portswigger.Zt_;
import net.portswigger.Zti;
import net.portswigger.Ztj;
import net.portswigger.Zvc;
import net.portswigger.Zzu;

public class Zeuy implements Zrwj {
  private final ScheduledExecutorService Zj;
  
  private final String ZK;
  
  private final Ztj ZQ;
  
  private final Zr18 Z_;
  
  private final Runnable Zf;
  
  private final Zmx0 Zk;
  
  private final Runnable ZJ;
  
  private final Zo8 ZH;
  
  private ScheduledFuture<?> Zi;
  
  private volatile Zrx3 ZF;
  
  private volatile int Zw;
  
  private volatile boolean ZX;
  
  private volatile boolean Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zeuy(Zt_ paramZt_, String paramString1, String paramString2, Zr18 paramZr18, Runnable paramRunnable, Zmx0 paramZmx0, Ztj paramZtj) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: getstatic net/portswigger/Zrx3.NOT_READY : Lnet/portswigger/Zrx3;
    //   8: putfield ZF : Lnet/portswigger/Zrx3;
    //   11: aload_0
    //   12: iconst_0
    //   13: putfield Zw : I
    //   16: aload_0
    //   17: iconst_0
    //   18: putfield ZX : Z
    //   21: aload_0
    //   22: iconst_1
    //   23: putfield Zb : Z
    //   26: aload_0
    //   27: aload_2
    //   28: putfield ZK : Ljava/lang/String;
    //   31: aload_0
    //   32: aload #4
    //   34: putfield Z_ : Lburp/Zr18;
    //   37: aload_0
    //   38: aload #5
    //   40: putfield Zf : Ljava/lang/Runnable;
    //   43: aload_0
    //   44: aload #6
    //   46: putfield Zk : Lburp/Zmx0;
    //   49: aload_0
    //   50: aload #7
    //   52: putfield ZQ : Lnet/portswigger/Ztj;
    //   55: aload_0
    //   56: new burp/Zrsi
    //   59: dup
    //   60: invokespecial <init> : ()V
    //   63: invokestatic newSingleThreadScheduledExecutor : (Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;
    //   66: putfield Zj : Ljava/util/concurrent/ScheduledExecutorService;
    //   69: aload_0
    //   70: aload_1
    //   71: aload_3
    //   72: sipush #-29359
    //   75: sipush #-19334
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   86: invokevirtual Za : (Ljava/lang/String;)Lnet/portswigger/Zo8;
    //   89: putfield ZH : Lnet/portswigger/Zo8;
    //   92: aload_0
    //   93: aload_0
    //   94: aload #6
    //   96: <illegal opcode> run : (Lburp/Zeuy;Lburp/Zmx0;)Ljava/lang/Runnable;
    //   101: putfield ZJ : Ljava/lang/Runnable;
    //   104: return
  }
  
  public void ZP() {
    this.Zi = this.Zj.scheduleWithFixedDelay(this.ZJ, 0L, 10L, TimeUnit.SECONDS);
  }
  
  public synchronized void Zz() {
    this.Zb = false;
    if (this.Zi != null)
      this.Zi.cancel(true); 
    this.Zj.shutdownNow();
  }
  
  public void ZS(Zrx3 paramZrx3) {
    if (this.ZF != paramZrx3) {
      this.ZF = paramZrx3;
      ZV();
    } 
  }
  
  private synchronized void ZV() {
    try {
      if (!this.Zb)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zvc zvc = this.ZH.ZR(a(-29358, -30164), "").ZQ(a(-29354, 31048), a(-29353, -4764)).ZI(Zny.Zv(this.ZQ.ZQ(new Zzu(this.ZF, this.ZK)))).ZC();
    try {
      Zti zti = zvc.ZW(ZA());
      try {
        this.Zw = 0;
        if (zti.ZX == 403) {
          this.Zk.ZH(a(-29360, -1161));
          Zz();
          this.Z_.Z_(Zmg9.HEARTBEAT_FORBIDDEN);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      try {
        this.Zk.ZP(a(-29357, 10079), exception, new Object[] { this.ZF.name(), zvc.Zd });
      } catch (Exception exception1) {
        throw a(null);
      } 
      try {
        Zah.Zl(exception, this.Zb ? Zk_.COMMON_RUNTIME_FAILURE : Zk_.IGNORED);
        if (++this.Zw > 3)
          try {
            if (!this.ZX) {
              this.ZX = true;
              this.Zf.run();
            } 
          } catch (Exception exception1) {
            throw a(null);
          }  
      } catch (Exception exception1) {
        throw a(null);
      } 
    } 
  }
  
  private int ZA() {
    if (this.Zw > 0) {
      this.Zk.ZH(a(-29355, 9712));
      return 3000;
    } 
    return 500;
  }
  
  private void lambda$new$0(Zmx0 paramZmx0) {
    try {
      ZV();
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.COMMON_RUNTIME_FAILURE);
      paramZmx0.Zv(a(-29356, -13863), throwable);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '°­îIQVkâ(a ºØ/jêûérø\\bTòUßÕºÄBpÝªûtÛ2fMCïúüP,­OVÒ0¤a±|âC¼×Ïsì»©êìM>C XÂÊÏíÅFªÔ¦Äük6êÍþa²>NÍ\\tàn®.Ü\\fJ\\b.0\\tb»& ó'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #89
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc '¬àbL¾iò©»2*Fýÿ¾½Ù×;¹¥?âå[£ó³¡(G\\tW:g\\fd>9©nüc'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #35
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #45
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zeuy.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zeuy.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #87
    //   214: goto -> 242
    //   217: bipush #6
    //   219: goto -> 242
    //   222: iconst_3
    //   223: goto -> 242
    //   226: bipush #107
    //   228: goto -> 242
    //   231: bipush #22
    //   233: goto -> 242
    //   236: bipush #81
    //   238: goto -> 242
    //   241: iconst_2
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8D53) & 0xFFFF;
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
      byte b1 = 33;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeuy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */