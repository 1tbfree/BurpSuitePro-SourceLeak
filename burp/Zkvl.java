package burp;

import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import javax.security.auth.x500.X500Principal;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zkvl implements Zrz3 {
  private static final Base64.Decoder Zg;
  
  private final List<String> Zx;
  
  private final Zrc4 Z_;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zkvl(List<String> paramList) {
    this.Zx = paramList;
    this.Z_ = new Zrc4();
  }
  
  public Zzz8 Zi() {
    LinkedList<String> linkedList1 = new LinkedList();
    LinkedList<String> linkedList2 = new LinkedList();
    String str = Zzz8.Zn();
    for (String str1 : this.Zx) {
      Zl0z zl0z = Zltq.ZW(str1);
      linkedList1.addAll(zl0z.Zb());
      linkedList2.addAll(zl0z.Zp());
      if (str == null)
        break; 
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zzz8.Zz("uiyevb"); 
    } catch (Zs0z zs0z) {
      throw a(null);
    } 
    return ZT(this.Z_.Zb(), linkedList1, linkedList2);
  }
  
  private static Zzz8 ZT(String paramString, List<String> paramList1, List<String> paramList2) {
    Zn(paramList1, paramList2);
    return ZN(paramString, paramList1, paramList2);
  }
  
  private static void Zn(List<String> paramList1, List<String> paramList2) {
    try {
      if (paramList1.isEmpty())
        throw new Zs0z(a(-29064, 25291)); 
    } catch (Zs0z zs0z) {
      throw a(null);
    } 
    try {
      if (paramList2.size() != 1)
        throw new Zs0z(a(-29060, -10952)); 
    } catch (Zs0z zs0z) {
      throw a(null);
    } 
  }
  
  private static Zzz8 ZN(String paramString, List<String> paramList1, List<String> paramList2) {
    List<Certificate> list = (List)paramList1.stream().map(Zkvl::Zl).collect(Collectors.toList());
    PrivateKey privateKey = Zr(paramList2.get(0), list.get(0));
    try {
      KeyStore keyStore = ZZ();
      keyStore.setKeyEntry(paramString, privateKey, Zzz8.ZN, list.<Certificate>toArray(new Certificate[0]));
      return new Zzz8(keyStore, Zzz8.ZN);
    } catch (KeyStoreException keyStoreException) {
      Zah.Zl(keyStoreException, Zk_.RETHROWN);
      throw new Zs0z(a(-29062, -7954), keyStoreException);
    } 
  }
  
  private static KeyStore ZZ() {
    try {
      KeyStore keyStore = KeyStore.getInstance(a(-29071, -5828));
      keyStore.load(null);
      return keyStore;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new Zs0z(a(-29067, -13425), exception);
    } 
  }
  
  private static Certificate Zl(String paramString) {
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Zg.decode(paramString));
      CertificateFactory certificateFactory = CertificateFactory.getInstance(a(-29072, 20339));
      X509Certificate x509Certificate = (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
      X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
      String str = x500Principal.getName(a(-29061, 5617));
      try {
        x509Certificate.checkValidity();
        if (str == null)
          throw new Zs0z(a(-29063, 29797)); 
      } catch (CertificateExpiredException certificateExpiredException) {
        throw a(null);
      } 
      return x509Certificate;
    } catch (CertificateExpiredException certificateExpiredException) {
      Zah.Zl(certificateExpiredException, Zk_.RETHROWN);
      throw new Zs0z(a(-29066, 31608), certificateExpiredException);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.RETHROWN);
      throw new Zs0z(a(-29065, 23481), exception);
    } 
  }
  
  private static PrivateKey Zr(String paramString, Certificate paramCertificate) {
    try {
      PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Zg.decode(paramString));
      try {
      
      } catch (GeneralSecurityException generalSecurityException) {
        throw a(null);
      } 
      String str = a(-29070, -27088).equals(paramCertificate.getPublicKey().getAlgorithm()) ? a(-29068, -24795) : a(-29059, -28931);
      KeyFactory keyFactory = KeyFactory.getInstance(str);
      return keyFactory.generatePrivate(pKCS8EncodedKeySpec);
    } catch (GeneralSecurityException generalSecurityException) {
      Zah.Zl(generalSecurityException, Zk_.RETHROWN);
      throw new Zs0z(a(-29069, -8005), generalSecurityException);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'N}É_»[),J?ób5ÆÉðM?] u>X[Í'±S­èq B6¼JÁ@ÓJ1Tãnà;ï"=Dþò]'¼çßu¢Ò5;­ÿ"' ùI]îCÖh©¼^aÃRÕ7B4\ÈâÂI'$3btgÁú>²7Ü³Y=L¥Dxµ>¬Ì_guêÁ&²ë%Üsý0 E*B©®âÎ\\t|Z!H>½\\rê(roÄ-×¡ÍI?ÊùlH²ÈFÅY¾<çBVXI¯¾|q0²\\r2\\b1ÑÞC£½tß|EOC*@BÎFÐW5`þ¦O'òoÓqü£Swâ\\fÙ`0Wâ)^¬Ö8H¬Ü®äê]Mw8ù#añÎê}\\r±±Ë,zØºk-=EhÝÓR]ònôøb¥7¸YÃÌÛá=ÉòKr-r5vDCÜºsï¦°ïpÝ"°\\r \«\ý+§èKôwü²þ íb¦¡ü2§Üº£4~WTh\\\rø¨ÙÄí¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #104
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: ldc 'îzÅ5}ÜyúC;2_ùÀãEEÊ):>ò±ÓÐñVsJÔ7ÓÞ=õ÷¶[{Nd'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #109
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zkvl.a : [Ljava/lang/String;
    //   130: bipush #14
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zkvl.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #127
    //   214: goto -> 243
    //   217: bipush #123
    //   219: goto -> 243
    //   222: bipush #110
    //   224: goto -> 243
    //   227: bipush #97
    //   229: goto -> 243
    //   232: bipush #92
    //   234: goto -> 243
    //   237: iconst_2
    //   238: goto -> 243
    //   241: bipush #71
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 97
    //   300: invokestatic getDecoder : ()Ljava/util/Base64$Decoder;
    //   303: putstatic burp/Zkvl.Zg : Ljava/util/Base64$Decoder;
    //   306: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8E71) & 0xFFFF;
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
      char c = '¶';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */