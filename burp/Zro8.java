package burp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.management.ManagementFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.prefs.Preferences;
import javax.management.MBeanServer;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zzc;
import net.portswigger.browser.Zjb;

public class Zro8 {
  private static final String[] ZV;
  
  private final Map<String, String> ZF = new HashMap<>(ZV.length + 15);
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zro8(String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    ZF();
    ZI();
    Zb();
    Zl();
    ZH();
    ZT();
    Zx(paramBoolean);
    ZK();
    ZF(paramString1);
    Zj(paramString2);
    Zq(paramString3);
  }
  
  private void ZF() {
    Properties properties = System.getProperties();
    String[] arrayOfString = ZV;
    Zbqc[] arrayOfZbqc = Zz9t.Zh();
    int i = arrayOfString.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString[b];
      this.ZF.put(str.replace('.', '_'), Zzc.Zq(properties.getProperty(str, a(3085, 30818))));
      b++;
      if (arrayOfZbqc == null)
        break; 
    } 
  }
  
  private void ZI() {
    Runtime runtime = Runtime.getRuntime();
    this.ZF.put(a(3112, 17989), Zzc.Zq(Zlb0.Zl.format(runtime.maxMemory())));
    this.ZF.put(a(3129, -4792), Zzc.Zq(Zlb0.Zl.format(runtime.availableProcessors())));
    MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
    Zlxx.ZE(Zl_6.TOTAL_PHYSICAL_MEMORY_SIZE, mBeanServer).ifPresent(this::lambda$addMemoryAndCpuDetailsToDiagnostics$0);
    Zlxx.ZE(Zl_6.FREE_PHYSICAL_MEMORY_SIZE, mBeanServer).ifPresent(this::lambda$addMemoryAndCpuDetailsToDiagnostics$1);
    Zlxx.ZE(Zl_6.TOTAL_SWAP_SPACE_SIZE, mBeanServer).ifPresent(this::lambda$addMemoryAndCpuDetailsToDiagnostics$2);
    Zlxx.ZE(Zl_6.FREE_SWAP_SPACE_SIZE, mBeanServer).ifPresent(this::lambda$addMemoryAndCpuDetailsToDiagnostics$3);
  }
  
  private void Zb() {
    if (Zb12.ZG())
      return; 
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    String str1 = String.format(a(3076, 25752), new Object[] { Integer.valueOf(dimension.width), Integer.valueOf(dimension.height) });
    Preferences preferences = Preferences.userNodeForPackage(StartBurp.class);
    String str2 = Zbq8.ZS(preferences, a(3134, 29796));
    String str3 = Zbq8.ZS(preferences, a(3122, 17732));
    String str4 = (str2 == null || str3 == null) ? a(3128, -31598) : String.format(a(3131, 23046), new Object[] { str2, str3 });
    this.ZF.put(a(3106, 30530), Zzc.Zq(str1));
    this.ZF.put(a(3077, -3822), Zzc.Zq(str4));
  }
  
  private void Zl() {
    String str = a(3133, 14415);
    try {
      Class.forName(a(3104, -7122));
      Class.forName(a(3109, -31825));
      Class.forName(a(3119, -23436));
      this.ZF.put(str, Zzc.Zq(a(3083, 5911)));
    } catch (ClassNotFoundException classNotFoundException) {
      Zah.Zl(classNotFoundException, Zk_.IGNORED);
      this.ZF.put(str, Zzc.Zq(a(3121, 1471)));
    } 
  }
  
  private void ZH() {
    this.ZF.put(a(3118, -6180), Zzc.Zq(Boolean.toString(Zxyl.ZO())));
  }
  
  private void ZT() {
    this.ZF.put(a(3111, -10736), Zzc.Zq(String.valueOf(Zsht.ZQ())));
  }
  
  private void Zx(boolean paramBoolean) {
    if (paramBoolean)
      this.ZF.put(a(3113, 9045), Zzc.Zq(Ze_f.Z_().ZZ().toString())); 
  }
  
  private void ZK() {
    if (Zjb.Zr().ZC())
      this.ZF.put(a(3125, -15719), Zzc.Zq(Boolean.toString(Zt2u.ZX.Zb))); 
  }
  
  private void ZF(String paramString) {
    this.ZF.put(a(3124, -11376), Zzc.Zq(paramString));
  }
  
  private void Zj(String paramString) {
    this.ZF.put(a(3110, 32158), Zzc.Zq(paramString));
    this.ZF.put(a(3126, -19368), Zzc.Zq(Zgkt.Zj()));
  }
  
  private void Zq(String paramString) {
    this.ZF.put(a(3073, -4342), Zzc.Zq(paramString));
  }
  
  public Map<String, String> ZR() {
    return this.ZF;
  }
  
  private void lambda$addMemoryAndCpuDetailsToDiagnostics$3(Long paramLong) {
    this.ZF.put(a(3115, -9333), Zzc.Zq(Zlb0.Zl.format(paramLong)));
  }
  
  private void lambda$addMemoryAndCpuDetailsToDiagnostics$2(Long paramLong) {
    this.ZF.put(a(3130, 4041), Zzc.Zq(Zlb0.Zl.format(paramLong)));
  }
  
  private void lambda$addMemoryAndCpuDetailsToDiagnostics$1(Long paramLong) {
    this.ZF.put(a(3086, 10273), Zzc.Zq(Zlb0.Zl.format(paramLong)));
  }
  
  private void lambda$addMemoryAndCpuDetailsToDiagnostics$0(Long paramLong) {
    this.ZF.put(a(3107, 31887), Zzc.Zq(Zlb0.Zl.format(paramLong)));
  }
  
  static {
    // Byte code:
    //   0: bipush #50
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ouPº9zrz°é%d´Xîê«¤¡¡eZåË¢\\b²UÁÉJ£ì¦æ*Õ~¼g%\\t0áÌÞ¥i÷¢~\\na&\\rvi\\r·ÄRø\\fO­Âf/gâèï©yÐé?k%93S[nÕêß>á«ãíïwÓºí#`õ«mÿ\\bw¢~ÅÉR" ÑOM;531ZMÇfp{¦\\na¢ÿþ Çñ¤lþ\,$§("[Ï3Å|© µ24ke§Eâ¤æïBÔ\\r¿ñ7\\nx¸øþÁòÃ'1oKê­GÓgíçíg6iÜV@®Âõâjch5VÍz0IT±æàB½?£tþl d;³Kc°JLÂ-zT«£ÿÎüSÚh79ÜmRh³\\nLÑo ÿ4j-YÀ±õb)pé8Õ{7çEl9úfÒÅÈÕM§ø'Y;*c3\\n°¡ØÞdÕÕÇöÄíØâ-ø²Æ\\fÞ¨Íc¿\\tÙ¡¢R·5jÓÓ´²®©üÛ\\rÀ(£Ñ9b-0\\bÕP¬*\\bÿ³~ý¹(¿Zë¢÷ÞWuØD ?(¦B \\fã>½M¯¼þ)\\f«!t½ÒÕD8ènkãßz{YªK0õR)vÀç25gâ·ËÊJ_,ß8Ô¯s+ EÄ&nÿt\\r!xÜÏÙû¸a1ø3Ó½ZßNF*\ô×jkw¨a~¾°¾-ÏV\\ná;·4è è+'È°*ç^wQKøîÞxS¬úYE!\\fDu*2ZzH`Xç7ËøØ7ÔÊ¿éüw@ºkÀk}\$æjèík§CozVÉ¨£\\f/ú^&ÔMñTI\\fFE?¯Ôû£B$'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc '|Ïø¨·hÏ0ñ\\t#L³I>Æµ³­Q-;SrØv×H-è¾'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #107
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
    //   129: putstatic burp/Zro8.a : [Ljava/lang/String;
    //   132: bipush #50
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zro8.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #35
    //   214: goto -> 244
    //   217: bipush #54
    //   219: goto -> 244
    //   222: bipush #94
    //   224: goto -> 244
    //   227: bipush #66
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #116
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: bipush #22
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #3117
    //   310: sipush #-28274
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #3074
    //   322: sipush #-30033
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #3097
    //   334: sipush #838
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #3072
    //   346: sipush #-11647
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #3114
    //   358: sipush #-26829
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #3132
    //   370: sipush #16486
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #6
    //   380: sipush #3081
    //   383: sipush #-10113
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aastore
    //   390: dup
    //   391: bipush #7
    //   393: sipush #3079
    //   396: sipush #-20548
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #8
    //   406: sipush #3120
    //   409: sipush #-4908
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #9
    //   419: sipush #3127
    //   422: sipush #-26879
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #10
    //   432: sipush #3105
    //   435: sipush #3324
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: bipush #11
    //   445: sipush #3108
    //   448: sipush #28904
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush #12
    //   458: sipush #3082
    //   461: sipush #-11340
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: bipush #13
    //   471: sipush #3075
    //   474: sipush #22318
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: aastore
    //   481: dup
    //   482: bipush #14
    //   484: sipush #3135
    //   487: sipush #4763
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: aastore
    //   494: dup
    //   495: bipush #15
    //   497: sipush #3084
    //   500: sipush #14688
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: aastore
    //   507: dup
    //   508: bipush #16
    //   510: sipush #3116
    //   513: sipush #27344
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: aastore
    //   520: dup
    //   521: bipush #17
    //   523: sipush #3087
    //   526: sipush #2649
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aastore
    //   533: dup
    //   534: bipush #18
    //   536: sipush #3096
    //   539: sipush #-18526
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: aastore
    //   546: dup
    //   547: bipush #19
    //   549: sipush #3080
    //   552: sipush #-29963
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aastore
    //   559: dup
    //   560: bipush #20
    //   562: sipush #3078
    //   565: sipush #25373
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: aastore
    //   572: dup
    //   573: bipush #21
    //   575: sipush #3123
    //   578: sipush #10626
    //   581: invokestatic a : (II)Ljava/lang/String;
    //   584: aastore
    //   585: putstatic burp/Zro8.ZV : [Ljava/lang/String;
    //   588: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xC28) & 0xFFFF;
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
      char c = 'û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zro8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */