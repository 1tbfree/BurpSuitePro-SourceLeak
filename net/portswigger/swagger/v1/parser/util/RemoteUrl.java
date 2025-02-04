package net.portswigger.swagger.v1.parser.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import net.portswigger.swagger.v1.models.auth.AuthorizationValue;

public class RemoteUrl {
  private static final String TRUST_ALL;
  
  private static final RemoteUrl$ConnectionConfigurator CONNECTION_CONFIGURATOR;
  
  private static final Charset UTF_8;
  
  private static final String ACCEPT_HEADER_VALUE;
  
  private static final String USER_AGENT_HEADER_VALUE;
  
  private static int[] ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static RemoteUrl$ConnectionConfigurator createConnectionConfigurator() {
    if (Boolean.parseBoolean(System.getProperty(TRUST_ALL)))
      try {
        TrustManager[] arrayOfTrustManager = { new RemoteUrl$1() };
        SSLContext sSLContext = SSLContext.getInstance(a(-27093, -13456));
        sSLContext.init(null, arrayOfTrustManager, new SecureRandom());
        SSLSocketFactory sSLSocketFactory = sSLContext.getSocketFactory();
        RemoteUrl$2 remoteUrl$2 = new RemoteUrl$2();
        return new RemoteUrl$3(sSLSocketFactory, remoteUrl$2);
      } catch (NoSuchAlgorithmException|java.security.KeyManagementException noSuchAlgorithmException) {} 
    return new RemoteUrl$4();
  }
  
  public static String cleanUrl(String paramString) {
    return paramString.replaceAll(a(-27091, -448), a(-27102, -91)).replaceAll(a(-27092, 4735), a(-27103, -14932)).replaceAll(" ", a(-27094, 16250));
  }
  
  public static String urlToString(String paramString, List<AuthorizationValue> paramList) throws Exception {
    InputStream inputStream = null;
    int[] arrayOfInt = ZS();
    BufferedReader bufferedReader = null;
    try {
      while (true) {
        while (true) {
          URL uRL = new URL(cleanUrl(paramString));
          ArrayList arrayList1 = new ArrayList();
          ArrayList arrayList2 = new ArrayList();
          break;
        } 
        if (301 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode() && 302 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode() && 307 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode() && 308 != ((HttpURLConnection)SYNTHETIC_LOCAL_VARIABLE_5).getResponseCode()) {
          InputStream inputStream1 = SYNTHETIC_LOCAL_VARIABLE_5.getInputStream();
          StringBuilder stringBuilder = new StringBuilder();
          BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream1, UTF_8));
          int i = 0;
          while (i != -1) {
            char c = (char)i;
            try {
              if (!Character.isISOControl(c))
                stringBuilder.append((char)i); 
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
              if (c == '\n')
                stringBuilder.append('\n'); 
            } catch (Exception exception) {
              throw a(null);
            } 
            i = bufferedReader1.read();
            if (arrayOfInt == null)
              break; 
          } 
          inputStream1.close();
          return stringBuilder.toString();
        } 
      } 
      throw a(paramList != null);
    } catch (Exception exception) {
      throw exception;
    } finally {
      try {
        if (inputStream != null)
          inputStream.close(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (bufferedReader != null)
          bufferedReader.close(); 
      } catch (Exception exception) {
        throw a(null);
      } 
    } 
  }
  
  private static void appendValue(URL paramURL, AuthorizationValue paramAuthorizationValue, Collection<AuthorizationValue> paramCollection) {
    if (paramAuthorizationValue instanceof ManagedValue && !((ManagedValue)paramAuthorizationValue).process(paramURL))
      return; 
    paramCollection.add(paramAuthorizationValue);
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'OI:/uSÝ\\báÏ¾¹@­Nk]Ç@Ñ>LkÕYBG5C\\nEº8ÏíâÊ¡¿=ß»üzDÑc:ÍEbûÔ5+Þ¾Û:\\b'¬Ô¼¬á9Õ n½/Úªp&ÌÛ¬ëÞÒ¯~+'\\t)ò#ô¥caùý½ÿ eBrÜ¨÷$×²úÍkó9Â!}kId^ô`è¾ö×ø4Lrlõõe¾A®?Ù³28z+ÒÉs'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_1
    //   19: newarray int
    //   21: bipush #39
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: invokestatic Zo : ([I)V
    //   29: bipush #31
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 172
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '~s`~¤'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: iconst_3
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #41
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 172
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
    //   134: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.a : [Ljava/lang/String;
    //   137: bipush #16
    //   139: anewarray java/lang/String
    //   142: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.b : [Ljava/lang/String;
    //   145: sipush #-27090
    //   148: sipush #19560
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.ACCEPT_HEADER_VALUE : Ljava/lang/String;
    //   157: sipush #-27098
    //   160: sipush #-17470
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.USER_AGENT_HEADER_VALUE : Ljava/lang/String;
    //   169: goto -> 328
    //   172: dup_x2
    //   173: pop
    //   174: invokevirtual toCharArray : ()[C
    //   177: dup_x1
    //   178: arraylength
    //   179: dup_x2
    //   180: pop
    //   181: iconst_0
    //   182: istore #6
    //   184: dup2_x1
    //   185: pop2
    //   186: dup_x2
    //   187: iconst_1
    //   188: if_icmpgt -> 288
    //   191: dup2
    //   192: swap
    //   193: iload #6
    //   195: dup2_x1
    //   196: caload
    //   197: swap
    //   198: iload #6
    //   200: bipush #7
    //   202: irem
    //   203: tableswitch default -> 270, 0 -> 240, 1 -> 245, 2 -> 250, 3 -> 255, 4 -> 260, 5 -> 265
    //   240: bipush #51
    //   242: goto -> 272
    //   245: bipush #110
    //   247: goto -> 272
    //   250: bipush #116
    //   252: goto -> 272
    //   255: bipush #37
    //   257: goto -> 272
    //   260: bipush #32
    //   262: goto -> 272
    //   265: bipush #74
    //   267: goto -> 272
    //   270: bipush #27
    //   272: ixor
    //   273: ixor
    //   274: i2c
    //   275: castore
    //   276: iinc #6, 1
    //   279: dup
    //   280: ifne -> 288
    //   283: dup2
    //   284: dup_x1
    //   285: goto -> 195
    //   288: dup2_x1
    //   289: pop2
    //   290: dup_x2
    //   291: iload #6
    //   293: if_icmpgt -> 191
    //   296: pop
    //   297: new java/lang/String
    //   300: dup_x1
    //   301: swap
    //   302: invokespecial <init> : ([C)V
    //   305: invokevirtual intern : ()Ljava/lang/String;
    //   308: swap
    //   309: pop
    //   310: swap
    //   311: tableswitch default -> 46, 0 -> 104
    //   328: sipush #-27095
    //   331: sipush #11823
    //   334: invokestatic a : (II)Ljava/lang/String;
    //   337: iconst_1
    //   338: anewarray java/lang/Object
    //   341: dup
    //   342: iconst_0
    //   343: ldc net/portswigger/swagger/v1/parser/util/RemoteUrl
    //   345: invokevirtual getName : ()Ljava/lang/String;
    //   348: aastore
    //   349: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   352: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.TRUST_ALL : Ljava/lang/String;
    //   355: invokestatic createConnectionConfigurator : ()Lnet/portswigger/swagger/v1/parser/util/RemoteUrl$ConnectionConfigurator;
    //   358: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.CONNECTION_CONFIGURATOR : Lnet/portswigger/swagger/v1/parser/util/RemoteUrl$ConnectionConfigurator;
    //   361: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   364: putstatic net/portswigger/swagger/v1/parser/util/RemoteUrl.UTF_8 : Ljava/nio/charset/Charset;
    //   367: return
  }
  
  public static void Zo(int[] paramArrayOfint) {
    ZJ = paramArrayOfint;
  }
  
  public static int[] ZS() {
    return ZJ;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9624) & 0xFFFF;
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
      byte b1 = 122;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\parse\\util\RemoteUrl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */