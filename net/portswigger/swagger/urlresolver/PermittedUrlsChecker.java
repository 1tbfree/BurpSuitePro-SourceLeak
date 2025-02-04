package net.portswigger.swagger.urlresolver;

import burp.Zbqc;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import net.portswigger.swagger.NetUtils;
import net.portswigger.swagger.urlresolver.exceptions.HostDeniedException;
import net.portswigger.swagger.urlresolver.matchers.UrlPatternMatcher;
import net.portswigger.swagger.urlresolver.models.ResolvedUrl;

public class PermittedUrlsChecker {
  protected final UrlPatternMatcher allowlistMatcher = new UrlPatternMatcher(Collections.emptyList());
  
  protected final UrlPatternMatcher denylistMatcher = new UrlPatternMatcher(Collections.emptyList());
  
  private static Zbqc[] ZL;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public PermittedUrlsChecker() {}
  
  public PermittedUrlsChecker(List<String> paramList1, List<String> paramList2) {
    // Byte code:
    //   0: invokestatic Zr : ()[Lburp/Zbqc;
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: aload_1
    //   9: ifnull -> 28
    //   12: aload_0
    //   13: new net/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher
    //   16: dup
    //   17: aload_1
    //   18: invokespecial <init> : (Ljava/util/List;)V
    //   21: putfield allowlistMatcher : Lnet/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher;
    //   24: aload_3
    //   25: ifnonnull -> 42
    //   28: aload_0
    //   29: new net/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher
    //   32: dup
    //   33: invokestatic emptyList : ()Ljava/util/List;
    //   36: invokespecial <init> : (Ljava/util/List;)V
    //   39: putfield allowlistMatcher : Lnet/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher;
    //   42: aload_2
    //   43: ifnull -> 62
    //   46: aload_0
    //   47: new net/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher
    //   50: dup
    //   51: aload_2
    //   52: invokespecial <init> : (Ljava/util/List;)V
    //   55: putfield denylistMatcher : Lnet/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher;
    //   58: aload_3
    //   59: ifnonnull -> 76
    //   62: aload_0
    //   63: new net/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher
    //   66: dup
    //   67: invokestatic emptyList : ()Ljava/util/List;
    //   70: invokespecial <init> : (Ljava/util/List;)V
    //   73: putfield denylistMatcher : Lnet/portswigger/swagger/urlresolver/matchers/UrlPatternMatcher;
    //   76: invokestatic Zwu : ()[Lburp/Zbqc;
    //   79: ifnonnull -> 89
    //   82: iconst_2
    //   83: anewarray burp/Zbqc
    //   86: invokestatic ZT : ([Lburp/Zbqc;)V
    //   89: return
  }
  
  public ResolvedUrl verify(String paramString) throws HostDeniedException {
    URL uRL;
    String str1;
    InetAddress inetAddress;
    String str2;
    Zbqc[] arrayOfZbqc = Zr();
    try {
      uRL = new URL(paramString);
    } catch (MalformedURLException malformedURLException) {
      throw new HostDeniedException(String.format(a(14688, 20413), new Object[] { paramString }), malformedURLException);
    } 
    try {
      if (!uRL.getProtocol().equals(a(14699, 32279)))
        try {
          if (!uRL.getProtocol().equals(a(14700, -4028)))
            throw new HostDeniedException(String.format(a(14703, 32105), new Object[] { paramString })); 
        } catch (MalformedURLException malformedURLException) {
          throw a(null);
        }  
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      str1 = NetUtils.getHostFromUrl(paramString);
    } catch (MalformedURLException malformedURLException) {
      throw new HostDeniedException(String.format(a(14696, -30116), new Object[] { paramString }), malformedURLException);
    } 
    try {
      if (this.allowlistMatcher.matches(paramString))
        return new ResolvedUrl(paramString, str1); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (this.denylistMatcher.matches(paramString))
        throw new HostDeniedException(String.format(a(14702, 18779), new Object[] { paramString })); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      inetAddress = NetUtils.getHostByName(str1);
    } catch (UnknownHostException unknownHostException) {
      throw new HostDeniedException(String.format(a(14689, 17947), new Object[] { str1 }), unknownHostException);
    } 
    try {
      str2 = NetUtils.setHost(paramString, inetAddress.getHostAddress());
    } catch (MalformedURLException malformedURLException) {
      throw new HostDeniedException(String.format(a(14697, -2673), new Object[] { inetAddress.getHostAddress(), paramString }), malformedURLException);
    } 
    try {
      if (this.allowlistMatcher.matches(str2))
        return new ResolvedUrl(str2, str1); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (isRestrictedIpRange(inetAddress))
        throw new HostDeniedException(String.format(a(14698, -23534), new Object[] { str2 })); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (this.denylistMatcher.matches(str2))
        throw new HostDeniedException(String.format(a(14701, -20143), new Object[] { str2 })); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    try {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (MalformedURLException malformedURLException) {
      throw a(null);
    } 
    return new ResolvedUrl(str2, str1);
  }
  
  protected boolean isRestrictedIpRange(InetAddress paramInetAddress) {
    return (paramInetAddress.isLinkLocalAddress() || paramInetAddress.isSiteLocalAddress() || paramInetAddress.isLoopbackAddress() || paramInetAddress.isAnyLocalAddress() || NetUtils.isUniqueLocalAddress(paramInetAddress) || NetUtils.isNAT64Address(paramInetAddress));
  }
  
  public static void ZT(Zbqc[] paramArrayOfZbqc) {
    ZL = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zr() {
    return ZL;
  }
  
  private static MalformedURLException a(MalformedURLException paramMalformedURLException) {
    return paramMalformedURLException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_3
    //   8: anewarray burp/Zbqc
    //   11: iconst_0
    //   12: istore_3
    //   13: invokestatic ZT : ([Lburp/Zbqc;)V
    //   16: ldc 'Âº;ýf\\tCk6§¬#ùl­ðæ¶, &+AC¤_).¨XÊÓA2Râ)ö$hSob³& cð@Ìi~úýjþ¡£æítBàªÐèyò,°W¥T÷ò7"3f7sêW¹Y[%ÿyl\\rÈ,ßX~Ã31%'{¢úUö-d,H=~ð¥Ü\\t\\fð>ÎÜeTø¹Ê`ù³úBWÂä] ðë%.üÜ¨(ai¿+×Ó\×]2¿#hJÚV"9«+Ù«K+\3`Nç/ÛL\\bh²ü·_zæÏeÚV~Y'¾c×Ë(ãm¢\\nGaÀf]÷v{'
    //   18: dup
    //   19: astore_2
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: bipush #41
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #76
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc ''þQÝImG9d¸_^Ìzö»_ôì[õ1ÿÆ(Æ°Úu[¾yû|6(Òö¨³à*,ÙxU}Î\\fú¼=c¶è\\tÍ,UÓ'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #29
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #19
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic net/portswigger/swagger/urlresolver/PermittedUrlsChecker.a : [Ljava/lang/String;
    //   139: bipush #10
    //   141: anewarray java/lang/String
    //   144: putstatic net/portswigger/swagger/urlresolver/PermittedUrlsChecker.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #120
    //   222: goto -> 252
    //   225: bipush #73
    //   227: goto -> 252
    //   230: bipush #78
    //   232: goto -> 252
    //   235: bipush #103
    //   237: goto -> 252
    //   240: bipush #44
    //   242: goto -> 252
    //   245: bipush #26
    //   247: goto -> 252
    //   250: bipush #126
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3968) & 0xFFFF;
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
      byte b1 = 86;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagge\\urlresolver\PermittedUrlsChecker.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */