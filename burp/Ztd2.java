package burp;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;
import net.portswigger.browser.Ztf;

public class Ztd2 {
  private final Zei7 Zb;
  
  private final Zskh Zh;
  
  private final Zldf ZJ;
  
  private final Zlli<Zt13> Za;
  
  private final Zrgd Zg;
  
  private final Zlit ZM;
  
  private final long ZV;
  
  private static int Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztd2(Zrgd paramZrgd, Ztks paramZtks, Zzs1 paramZzs1, Zz5u paramZz5u, String paramString1, String paramString2, Zldf paramZldf, Zefx paramZefx, Zb6q paramZb6q, Zs68 paramZs68, Zskh paramZskh, BiConsumer<Zb09, Throwable> paramBiConsumer, Zl5x paramZl5x, long paramLong, Ztpx paramZtpx, Zbza paramZbza, Zsoh paramZsoh, Zz28 paramZz28, Zlli<Zt13> paramZlli) throws Ztf {
    this.Zg = Objects.<Zrgd>requireNonNull(paramZrgd);
    this.ZM = paramZefx.ZF();
    this.ZV = paramZz5u.ZE6() * 1000L;
    this.Zh = paramZskh;
    int i = ZU();
    try {
      this.ZJ = paramZldf;
      this.Za = paramZlli;
      this.Zb = paramZtks.ZB(paramString1, paramString2, paramZefx.ZF(), paramZb6q.Za(), paramZs68, paramBiConsumer, paramZl5x, paramLong, paramZtpx, paramZbza, paramZsoh, paramZz28, paramZz5u.ZEE(), paramZz5u.ZEI(), paramZzs1);
      if (i != 0)
        Zbqc.Zr(new Zbqc[4]); 
    } catch (Ztf ztf) {
      throw a(null);
    } 
  }
  
  public void Zs() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zb : Lburp/Zei7;
    //   4: invokevirtual ZJ : ()Ljava/util/concurrent/Future;
    //   7: astore_2
    //   8: invokestatic ZJ : ()I
    //   11: aload_0
    //   12: getfield Za : Lburp/Zlli;
    //   15: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   18: aload_2
    //   19: <illegal opcode> accept : (Ljava/util/concurrent/Future;)Ljava/util/function/Consumer;
    //   24: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   29: astore_3
    //   30: istore_1
    //   31: aload_0
    //   32: getfield Zg : Lburp/Zrgd;
    //   35: invokevirtual Zn : ()Ljava/time/Instant;
    //   38: astore #4
    //   40: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   43: sipush #23341
    //   46: sipush #9143
    //   49: invokestatic a : (II)Ljava/lang/String;
    //   52: iconst_0
    //   53: anewarray java/lang/Object
    //   56: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_2
    //   60: aload_0
    //   61: getfield ZV : J
    //   64: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   67: invokeinterface get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   72: checkcast net/portswigger/Zfb
    //   75: astore #5
    //   77: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   80: sipush #23340
    //   83: sipush #-20056
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: iconst_0
    //   90: anewarray java/lang/Object
    //   93: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: getstatic burp/Zv8r.SCANNER_DYNAMIC_ANALYSIS_COMPLETED_DURATION : Lburp/Zv8r;
    //   99: aload #4
    //   101: invokestatic now : ()Ljava/time/Instant;
    //   104: invokestatic between : (Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
    //   107: invokevirtual toMillis : ()J
    //   110: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   113: aload_0
    //   114: getfield ZJ : Lburp/Zldf;
    //   117: aload #5
    //   119: invokevirtual Zm : (Lnet/portswigger/Zfb;)V
    //   122: aload_3
    //   123: invokeinterface ZZ : ()V
    //   128: aload_2
    //   129: iconst_1
    //   130: invokeinterface cancel : (Z)Z
    //   135: pop
    //   136: aload_0
    //   137: getfield Zb : Lburp/Zei7;
    //   140: invokevirtual Zq : ()V
    //   143: goto -> 394
    //   146: astore #5
    //   148: aload #5
    //   150: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   153: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   156: getstatic burp/Zze0.SCANNER_DYNAMIC_ANALYSIS_FAILED : Lburp/Zze0;
    //   159: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   162: invokestatic currentThread : ()Ljava/lang/Thread;
    //   165: invokevirtual interrupt : ()V
    //   168: aload_3
    //   169: invokeinterface ZZ : ()V
    //   174: aload_2
    //   175: iconst_1
    //   176: invokeinterface cancel : (Z)Z
    //   181: pop
    //   182: aload_0
    //   183: getfield Zb : Lburp/Zei7;
    //   186: invokevirtual Zq : ()V
    //   189: goto -> 394
    //   192: astore #5
    //   194: aload #5
    //   196: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   199: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   202: getstatic burp/Zv8r.SCANNER_DYNAMIC_ANALYSIS_TIMEOUT_DURATION : Lburp/Zv8r;
    //   205: aload_0
    //   206: getfield ZV : J
    //   209: invokestatic Zi : (Lnet/portswigger/Zzr;J)V
    //   212: getstatic burp/Zrp6.TRACE : Lburp/Zrp6;
    //   215: sipush #23343
    //   218: sipush #-460
    //   221: invokestatic a : (II)Ljava/lang/String;
    //   224: iconst_0
    //   225: anewarray java/lang/Object
    //   228: invokestatic ZB : (Lburp/Zrp6;Ljava/lang/String;[Ljava/lang/Object;)V
    //   231: getstatic burp/Zmgc.DYNAMIC_CODE_ANALYSIS_TIMEOUT : Lburp/Zmgc;
    //   234: aload_0
    //   235: getfield Zh : Lburp/Zskh;
    //   238: iconst_1
    //   239: anewarray java/lang/Object
    //   242: dup
    //   243: iconst_0
    //   244: aload_0
    //   245: getfield ZM : Lburp/Zlit;
    //   248: invokeinterface Zd4 : ()[B
    //   253: invokestatic ZG : ([B)Ljava/lang/String;
    //   256: aastore
    //   257: invokevirtual Zh : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   260: pop
    //   261: aload_3
    //   262: invokeinterface ZZ : ()V
    //   267: aload_2
    //   268: iconst_1
    //   269: invokeinterface cancel : (Z)Z
    //   274: pop
    //   275: aload_0
    //   276: getfield Zb : Lburp/Zei7;
    //   279: invokevirtual Zq : ()V
    //   282: goto -> 394
    //   285: astore #5
    //   287: aload #5
    //   289: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   292: instanceof net/portswigger/browser/Ztj
    //   295: ifeq -> 320
    //   298: aload #5
    //   300: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   303: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   306: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   309: iload_1
    //   310: ifne -> 344
    //   313: goto -> 320
    //   316: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   319: athrow
    //   320: aload #5
    //   322: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   325: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   328: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   331: getstatic burp/Zze0.SCANNER_DYNAMIC_ANALYSIS_FAILED : Lburp/Zze0;
    //   334: invokestatic Zo : (Lnet/portswigger/Zfp;)V
    //   337: goto -> 344
    //   340: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   343: athrow
    //   344: aload_3
    //   345: invokeinterface ZZ : ()V
    //   350: aload_2
    //   351: iconst_1
    //   352: invokeinterface cancel : (Z)Z
    //   357: pop
    //   358: aload_0
    //   359: getfield Zb : Lburp/Zei7;
    //   362: invokevirtual Zq : ()V
    //   365: goto -> 394
    //   368: astore #6
    //   370: aload_3
    //   371: invokeinterface ZZ : ()V
    //   376: aload_2
    //   377: iconst_1
    //   378: invokeinterface cancel : (Z)Z
    //   383: pop
    //   384: aload_0
    //   385: getfield Zb : Lburp/Zei7;
    //   388: invokevirtual Zq : ()V
    //   391: aload #6
    //   393: athrow
    //   394: invokestatic Zwu : ()[Lburp/Zbqc;
    //   397: ifnonnull -> 414
    //   400: iinc #1, 1
    //   403: iload_1
    //   404: invokestatic ZG : (I)V
    //   407: goto -> 414
    //   410: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   413: athrow
    //   414: return
    // Exception table:
    //   from	to	target	type
    //   40	122	146	java/lang/InterruptedException
    //   40	122	192	java/util/concurrent/TimeoutException
    //   40	122	285	java/util/concurrent/ExecutionException
    //   40	122	368	finally
    //   146	168	368	finally
    //   192	261	368	finally
    //   285	344	368	finally
    //   287	313	316	java/lang/InterruptedException
    //   298	337	340	java/lang/InterruptedException
    //   368	370	368	finally
    //   394	407	410	java/lang/InterruptedException
  }
  
  private static void lambda$performDynamicAnalysis$0(Future paramFuture, Zxr8 paramZxr8) {
    paramFuture.cancel(true);
  }
  
  public static void ZG(int paramInt) {
    Zw = paramInt;
  }
  
  public static int ZJ() {
    return Zw;
  }
  
  public static int ZU() {
    int i = ZJ();
    return (i == 0) ? 60 : 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'êÖL±ïªE¥~hpÔH§#@è@9.pskÅzæ×£Bü3Mñï U-ÁFôiá2æç-E¡ð]ê\\bNÂ9"'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #40
    //   19: bipush #28
    //   21: istore_1
    //   22: invokestatic ZG : (I)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #104
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 87
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: aload #5
    //   74: putstatic burp/Ztd2.a : [Ljava/lang/String;
    //   77: iconst_3
    //   78: anewarray java/lang/String
    //   81: putstatic burp/Ztd2.b : [Ljava/lang/String;
    //   84: goto -> 231
    //   87: dup_x2
    //   88: pop
    //   89: invokevirtual toCharArray : ()[C
    //   92: dup_x1
    //   93: arraylength
    //   94: dup_x2
    //   95: pop
    //   96: iconst_0
    //   97: istore #6
    //   99: dup2_x1
    //   100: pop2
    //   101: dup_x2
    //   102: iconst_1
    //   103: if_icmpgt -> 204
    //   106: dup2
    //   107: swap
    //   108: iload #6
    //   110: dup2_x1
    //   111: caload
    //   112: swap
    //   113: iload #6
    //   115: bipush #7
    //   117: irem
    //   118: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #63
    //   158: goto -> 188
    //   161: bipush #24
    //   163: goto -> 188
    //   166: bipush #113
    //   168: goto -> 188
    //   171: bipush #78
    //   173: goto -> 188
    //   176: bipush #63
    //   178: goto -> 188
    //   181: bipush #40
    //   183: goto -> 188
    //   186: bipush #96
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 110
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 106
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 44
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5B2D) & 0xFFFF;
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
      byte b1 = 61;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztd2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */