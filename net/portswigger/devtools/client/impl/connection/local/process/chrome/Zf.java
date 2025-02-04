package net.portswigger.devtools.client.impl.connection.local.process.chrome;

import burp.Zbqc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.browser.Zb;
import net.portswigger.browser.Zc3;
import net.portswigger.browser.Zds;
import net.portswigger.browser.Zjb;
import net.portswigger.browser.Zt5;
import net.portswigger.browser.Ztf;
import net.portswigger.devtools.client.impl.connection.local.process.chrome.binary.Zv;

public class Zf {
  private static final Duration Ze;
  
  private final Zc3 Zs;
  
  private final Thread ZF;
  
  private final Process Zp;
  
  private static int[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zf(Zv paramZv, Zc3 paramZc3) throws Ztf {
    this.Zs = Objects.<Zc3>requireNonNull(paramZc3);
    this.ZF = new Thread(this::lambda$new$0, a(-7123, -2547));
    ZY();
    int[] arrayOfInt = ZC();
    Zjb zjb = Zjb.Zr();
    List<String> list = Zj.Zw(zjb, paramZv, paramZc3);
    ProcessBuilder processBuilder = new ProcessBuilder(list);
    processBuilder.environment().putAll(System.getenv());
    Zb.Zp(Zds.INFO, a(-7127, 11621), new Object[] { String.join(" ", (Iterable)processBuilder.command()) });
    try {
      this.Zp = processBuilder.start();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new Ztf(iOException);
    } 
    try {
      this.Zp.onExit().thenRun(this::lambda$new$2);
      Runtime.getRuntime().addShutdownHook(this.ZF);
      Zb.Zp(Zds.INFO, a(-7131, -31277), new Object[] { paramZc3.Z_(), Long.valueOf(this.Zp.pid()) });
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public Zc3 Zv() {
    return this.Zs;
  }
  
  public InputStream ZB() {
    return this.Zp.getErrorStream();
  }
  
  public void ZS(Runnable paramRunnable) {
    this.Zp.onExit().thenRun(paramRunnable);
  }
  
  public boolean ZM(long paramLong, TimeUnit paramTimeUnit) throws InterruptedException {
    return this.Zp.waitFor(paramLong, paramTimeUnit);
  }
  
  private void ZY() throws Ztf {
    Zt5 zt5 = this.Zs.Z_();
    try {
      if (!zt5.ZA())
        try {
          if (Files.exists(zt5.ZT(), new java.nio.file.LinkOption[0]))
            throw new Ztf(a(-7132, 18491).formatted(new Object[] { zt5.ZT() })); 
        } catch (Ztf ztf) {
          throw a(null);
        }  
    } catch (Ztf ztf) {
      throw a(null);
    } 
  }
  
  public long ZR() {
    return this.Zp.pid();
  }
  
  public boolean Zl() {
    return this.Zp.isAlive();
  }
  
  public synchronized void ZU() {
    int[] arrayOfInt = ZC();
    try {
      if (!Zl()) {
        Zb.Zp(Zds.INFO, a(-7128, 6834), new Object[] { Long.valueOf(this.Zp.pid()) });
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      Runtime.getRuntime().removeShutdownHook(this.ZF);
    } catch (IllegalStateException illegalStateException) {
      Zah.Zl(illegalStateException, Zk_.IGNORED);
    } 
    Zb.Zp(Zds.INFO, a(-7121, 11666), new Object[] { Long.valueOf(this.Zp.pid()) });
    this.Zp.destroy();
    try {
      if (!this.Zp.waitFor(Ze.toMillis(), TimeUnit.MILLISECONDS)) {
        Zb.Zp(Zds.WARNING, a(-7126, -17937), new Object[0]);
        this.Zp.destroyForcibly();
      } 
    } catch (InterruptedException interruptedException) {
      Zah.Zl(interruptedException, Zk_.COMMON_RUNTIME_FAILURE);
      Zb.Zp(Zds.WARNING, a(-7124, -10537), new Object[0]);
      this.Zp.destroyForcibly();
      Thread.currentThread().interrupt();
    } 
    try {
      Zb.Zp(Zds.INFO, a(-7122, 28683), new Object[] { Long.valueOf(this.Zp.pid()) });
      if (Zbqc.Zwu() == null)
        Zs(new int[4]); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  private CompletableFuture<Void> ZP() {
    return CompletableFuture.allOf((CompletableFuture<?>[])this.Zp.descendants().map(ProcessHandle::onExit).toArray(Zf::lambda$waitForAllDescendantProcessesToExit$3));
  }
  
  private static CompletableFuture[] lambda$waitForAllDescendantProcessesToExit$3(int paramInt) {
    return new CompletableFuture[paramInt];
  }
  
  private void lambda$new$2() {
    ZP().thenRun(this::lambda$new$1);
  }
  
  private void lambda$new$1() {
    try {
      this.Zs.Z_().ZS();
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private void lambda$new$0() {
    Zb.Zp(Zds.INFO, a(-7125, -30782), new Object[0]);
    ZU();
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ù¹#rmáp¿Í^ÃÐÏ=³qÞ!',ï|ë,ûíÏPÕî8Í{]DäÇa$=PâXØ%¦%³}GbgvÿãéRÜF6R;Â¥)ý[\\tÿ\\fm|S,º~OâÿrP@&9Úå'ÖÎ=HG²îcÂº<§ä¤¬Â-RàÿuþÏ#¯Kê6åÿiûéRkÃh/ÿ\\teíüÅ?GéÝ%|þD¦_ÌÆö^H£xV!83¯-äUÙ¹?ÌývV_Ëm¿?z\\bÂ;gD¼WYhêìæë!-ñI)-Æ5lw"ö )<>ùW±=ÍÒû4¡Ì²ÏÌB^)Ë½\\b¾´mG6+ësSÁ·»5N{Áx@a<QÕÚÙ7Ïíw<d$\\nìñpêÀMdà_8¤Ï%p% X5E'áóò¶cY² êÀjÀY!\´Ì\\rBà¦´ÅBý[»m+ p}w['
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: bipush #71
    //   21: istore_1
    //   22: invokestatic Zs : ([I)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #87
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 148
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
    //   72: ldc 'èbyd7×KF¬9+³·Ö¬PkØ5'ÿ\\fRM3epL)T'Û­ÏI ß¸ ÓZ\\naÚH!>j O°P¼Öw­JRÔº²f Dï"£þWóxìð©\ßùu\r÷Õ²ñ(½@î`µK8ê=Uègäu3Ú£¸1óì¤eµÊé÷JDwW)æ¸!;jø0zú\©\\fØTðó§ïó³È¬«f¾öl"C'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: sipush #157
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #59
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/Zf.a : [Ljava/lang/String;
    //   137: bipush #10
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/Zf.b : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #14
    //   218: goto -> 248
    //   221: bipush #68
    //   223: goto -> 248
    //   226: bipush #61
    //   228: goto -> 248
    //   231: bipush #18
    //   233: goto -> 248
    //   236: bipush #93
    //   238: goto -> 248
    //   241: bipush #58
    //   243: goto -> 248
    //   246: bipush #12
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 104
    //   304: ldc2_w 3
    //   307: invokestatic ofSeconds : (J)Ljava/time/Duration;
    //   310: putstatic net/portswigger/devtools/client/impl/connection/local/process/chrome/Zf.Ze : Ljava/time/Duration;
    //   313: return
  }
  
  public static void Zs(int[] paramArrayOfint) {
    ZL = paramArrayOfint;
  }
  
  public static int[] ZC() {
    return ZL;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE42C) & 0xFFFF;
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
      char c = 'ö';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\connection\local\process\chrome\Zf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */