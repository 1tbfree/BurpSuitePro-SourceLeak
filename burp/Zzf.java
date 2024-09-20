package burp;

import burp.api.montoya.core.Registration;
import burp.api.montoya.http.Http;
import burp.api.montoya.http.HttpMode;
import burp.api.montoya.http.RedirectionMode;
import burp.api.montoya.http.RequestOptions;
import burp.api.montoya.http.handler.HttpHandler;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.analysis.ResponseKeywordsAnalyzer;
import burp.api.montoya.http.message.responses.analysis.ResponseVariationsAnalyzer;
import burp.api.montoya.http.sessions.CookieJar;
import burp.api.montoya.http.sessions.SessionHandlingAction;
import java.util.List;
import java.util.Objects;
import javax.swing.SwingUtilities;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zzf implements Http {
  private final Zbnt Zt;
  
  private final CookieJar ZY;
  
  private final Zlz3 ZV;
  
  private final Ze2 Zl;
  
  private final Zskl Zk;
  
  private final Zb4u ZB;
  
  private final Zey9 Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzf(Zbnt paramZbnt, CookieJar paramCookieJar, Zlz3 paramZlz3, Ze2 paramZe2, Zskl paramZskl, Zb4u paramZb4u, Zey9 paramZey9) {
    this.Zt = paramZbnt;
    this.ZY = paramCookieJar;
    this.ZV = paramZlz3;
    this.Zl = paramZe2;
    this.Zk = paramZskl;
    this.ZB = paramZb4u;
    this.Zp = paramZey9;
  }
  
  public Registration registerHttpHandler(HttpHandler paramHttpHandler) {
    try {
      if (paramHttpHandler == null)
        throw new IllegalArgumentException(a(23006, -24469)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZV.Zi(this.Zl.<HttpHandler>Zv(paramHttpHandler, HttpHandler.class));
  }
  
  public HttpRequestResponse sendRequest(HttpRequest paramHttpRequest, HttpMode paramHttpMode, String paramString) {
    return Zz(paramHttpRequest, paramHttpMode, paramString, false, RedirectionMode.NEVER);
  }
  
  public HttpRequestResponse sendRequest(HttpRequest paramHttpRequest, RequestOptions paramRequestOptions) {
    String str = Zzls.Zf();
    if (paramRequestOptions instanceof Zgj0) {
      Zgj0 zgj0 = (Zgj0)paramRequestOptions;
      try {
        if (str != null)
          return Zz(paramHttpRequest, zgj0.Zb(), zgj0.ZL(), zgj0.Ze(), zgj0.ZW()); 
        throw new IllegalArgumentException(a(22982, -9878));
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
    } 
    throw new IllegalArgumentException(a(22982, -9878));
  }
  
  private HttpRequestResponse Zz(HttpRequest paramHttpRequest, HttpMode paramHttpMode, String paramString, boolean paramBoolean, RedirectionMode paramRedirectionMode) {
    try {
      Zf();
      if (paramHttpRequest == null)
        throw new IllegalArgumentException(a(22984, 1430)); 
    } catch (Zs2o zs2o) {
      throw a(null);
    } 
    try {
      if (paramHttpRequest.httpService() == null)
        throw new IllegalArgumentException(a(22988, 26185)); 
    } catch (Zs2o zs2o) {
      throw a(null);
    } 
    try {
      if (paramHttpMode == null)
        throw new IllegalArgumentException(a(22987, -22637)); 
    } catch (Zs2o zs2o) {
      throw a(null);
    } 
    try {
      if (paramString != null)
        try {
          if (paramHttpMode != HttpMode.AUTO) {
            try {
              if (paramHttpMode == HttpMode.HTTP_1)
                throw new IllegalArgumentException(a(22980, 21313)); 
            } catch (Zs2o zs2o) {
              throw a(null);
            } 
          } else {
            throw new IllegalArgumentException(a(22980, 21313));
          } 
        } catch (Zs2o zs2o) {
          throw a(null);
        }  
    } catch (Zs2o zs2o) {
      throw a(null);
    } 
    try {
      if (paramRedirectionMode == null)
        throw new IllegalArgumentException(a(22986, -31553)); 
    } catch (Zs2o zs2o) {
      throw a(null);
    } 
    try {
      Ze45 ze45 = Zblx.ZK(paramHttpMode, paramString);
      Zefx zefx = Zblx.ZW(paramHttpRequest, this.Zt, this.Zp);
      Zsxd zsxd = this.ZB.ZT(zefx, ze45, paramString, paramBoolean, new Zxfl(this, paramRedirectionMode));
      return this.Zk.ZR(zsxd);
    } catch (Zs2o zs2o) {
      Zah.Zl(zs2o, Zk_.IGNORED);
      throw new RuntimeException(a(22991, -22133));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      throw new RuntimeException(throwable);
    } 
  }
  
  public List<HttpRequestResponse> sendRequests(List<HttpRequest> paramList) {
    return sendRequests(paramList, HttpMode.AUTO);
  }
  
  public List<HttpRequestResponse> sendRequests(List<HttpRequest> paramList, HttpMode paramHttpMode) {
    String str = Zzls.Zf();
    try {
      Zf();
      if (paramList == null)
        throw new IllegalArgumentException(a(22983, -18310)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramList.isEmpty())
        throw new IllegalArgumentException(a(22985, -1233)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramList.stream().anyMatch(Objects::isNull))
        throw new IllegalArgumentException(a(22990, -8525)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramList.stream().anyMatch(Zzf::lambda$sendRequests$0))
        throw new IllegalArgumentException(a(22977, -11620)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramList.stream().map(HttpRequest::httpService).distinct().count() != 1L)
        throw new IllegalArgumentException(a(23007, 17929)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramList.stream().anyMatch(Zzf::lambda$sendRequests$1))
        throw new IllegalArgumentException(a(22979, -6725)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramHttpMode == null)
        throw new IllegalArgumentException(a(22976, 4455)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramHttpMode == HttpMode.HTTP_2_IGNORE_ALPN)
        throw new IllegalArgumentException(a(22989, -26995)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Ze45 ze45 = Zblx.ZK(paramHttpMode, null);
    List<Zefx> list = paramList.stream().map(this::lambda$sendRequests$2).toList();
    try {
      Objects.requireNonNull(this.Zk);
      if (str == null)
        Zbqc.Zr(new Zbqc[3]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZB.ZF(list, ze45).stream().map(this.Zk::ZR).toList();
  }
  
  public ResponseKeywordsAnalyzer createResponseKeywordsAnalyzer(List<String> paramList) {
    return new Ztlt(paramList);
  }
  
  public ResponseVariationsAnalyzer createResponseVariationsAnalyzer() {
    return new Zgng();
  }
  
  public CookieJar cookieJar() {
    return this.ZY;
  }
  
  public HttpRequestResponse sendRequest(HttpRequest paramHttpRequest) {
    return sendRequest(paramHttpRequest, HttpMode.AUTO, null);
  }
  
  public HttpRequestResponse sendRequest(HttpRequest paramHttpRequest, HttpMode paramHttpMode) {
    return sendRequest(paramHttpRequest, paramHttpMode, null);
  }
  
  public Registration registerSessionHandlingAction(SessionHandlingAction paramSessionHandlingAction) {
    try {
      if (paramSessionHandlingAction == null)
        throw new IllegalArgumentException(a(22978, 28488)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this.ZV.ZW(this.Zl.<SessionHandlingAction>Zv(paramSessionHandlingAction, SessionHandlingAction.class));
  }
  
  private static Zx_o Zq(RedirectionMode paramRedirectionMode) {
    try {
      switch (Zj.Zr[paramRedirectionMode.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
          break;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zsox();
  }
  
  private static void Zf() {
    try {
      if (SwingUtilities.isEventDispatchThread())
        throw new RuntimeException(a(22981, -322)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private Zefx lambda$sendRequests$2(HttpRequest paramHttpRequest) {
    return Zblx.ZW(paramHttpRequest, this.Zt, this.Zp);
  }
  
  private static boolean lambda$sendRequests$1(HttpRequest paramHttpRequest) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramHttpRequest.toByteArray().length() == 0);
  }
  
  private static boolean lambda$sendRequests$0(HttpRequest paramHttpRequest) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (paramHttpRequest.httpService() == null);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'åñ«Øî³6AÞ9Ëëù\\fN|¦l;¿sËY.}\\r9£]piÈ½½-ñþ¶W*õûjÿ½Ñ\\t±èVg]¬¯)Lb,\\nÈ³gÂ¨ÐQØå°S z\\bV*>Á~.°Æ¨lÄëé8]Åm(0£+{#4ìQVª:{ùäö×Ü.i~¶ËÚ%GöutsÃ\\fð\\tí6:\\b £z?¯LCþXW½ qõPùß0øó[þBT àóöpX`²{ÞÙ¦¬WÄr<%ãW$+$adB}"Ìåä+g8|@ZHM"Ïøeëì0Dö$ÿs7ýý·;V1°aEGp¸¤\\tKÇ÷æÃY5º¶Þÿ¨³isø¯k£Ðuy36\\t2N8º×l³:_¢¡rQxl×÷^Á.zL^>B:f±\\bÔRµj?¬°*?¨Cóé¾:CÀfMþq;CÀôÏ¬cÍZ«?)´ÿ_1½$ð÷êzäXã*Á)Q#»JUÜlß\\rÒ*²Ù¢{»Éy¿¥àæà°ÎEÌì´¨~;qi³(ÕÎN]p½q´"Ã"hÜ+8F\\t°_e;.E¿Ì³´«sÒ8·U×|.5ÏrÊÞ"`çu·çnnÄ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #9
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
    //   68: ldc '2B*-wîö#¡ÙßLæ¯%ÙUÞ+eº"3-ùMÿK°~¹_`CIý\U]u%Êh½&C¤?k¼Å§'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #45
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #43
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
    //   129: putstatic burp/Zzf.a : [Ljava/lang/String;
    //   132: bipush #18
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzf.b : [Ljava/lang/String;
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
    //   212: bipush #15
    //   214: goto -> 244
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #40
    //   224: goto -> 244
    //   227: bipush #106
    //   229: goto -> 244
    //   232: bipush #106
    //   234: goto -> 244
    //   237: bipush #90
    //   239: goto -> 244
    //   242: bipush #91
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x59CF) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */