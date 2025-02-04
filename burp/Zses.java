package burp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zses implements Zrz3 {
  private static final Ztt4 ZQ;
  
  private final String ZS;
  
  private final char[] ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zses(String paramString1, String paramString2) {
    this.ZS = paramString1;
    this.ZZ = paramString2.toCharArray();
  }
  
  public Zzz8 Zi() {
    BufferedInputStream bufferedInputStream = null;
    try {
      File file = new File(this.ZS);
      bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
      KeyStore keyStore = KeyStore.getInstance(a(-30708, 2109));
      keyStore.load(bufferedInputStream, this.ZZ);
      return new Zzz8(keyStore, this.ZZ);
    } catch (CertificateException|java.security.KeyStoreException|java.security.NoSuchAlgorithmException|IOException certificateException) {
      Zah.Zl(certificateException, Zk_.UNEXPECTED);
      ZY(certificateException);
    } finally {
      try {
        if (bufferedInputStream != null)
          try {
            bufferedInputStream.close();
          } catch (IOException iOException) {
            Zah.Zl(iOException, Zk_.UNEXPECTED);
            ZY(iOException);
          }  
      } catch (CertificateException certificateException) {
        throw a(null);
      } 
    } 
    return null;
  }
  
  private static void ZY(Exception paramException) {
    ZQ.Zh(paramException.getMessage());
    throw new Zs0z(a(-30707, 25373), paramException);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Õ;ÎCX)yÈ²þo¶Uµäîæ7='
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: iconst_4
    //   22: iinc #0, 1
    //   25: aload_2
    //   26: iload_0
    //   27: dup
    //   28: iload_1
    //   29: iadd
    //   30: invokevirtual substring : (II)Ljava/lang/String;
    //   33: iconst_m1
    //   34: goto -> 80
    //   37: aload #5
    //   39: swap
    //   40: iload_3
    //   41: iinc #3, 1
    //   44: swap
    //   45: aastore
    //   46: iload_0
    //   47: iload_1
    //   48: iadd
    //   49: dup
    //   50: istore_0
    //   51: iload #4
    //   53: if_icmpge -> 65
    //   56: aload_2
    //   57: iload_0
    //   58: invokevirtual charAt : (I)C
    //   61: istore_1
    //   62: goto -> 21
    //   65: aload #5
    //   67: putstatic burp/Zses.a : [Ljava/lang/String;
    //   70: iconst_2
    //   71: anewarray java/lang/String
    //   74: putstatic burp/Zses.b : [Ljava/lang/String;
    //   77: goto -> 223
    //   80: dup_x2
    //   81: pop
    //   82: invokevirtual toCharArray : ()[C
    //   85: dup_x1
    //   86: arraylength
    //   87: dup_x2
    //   88: pop
    //   89: iconst_0
    //   90: istore #6
    //   92: dup2_x1
    //   93: pop2
    //   94: dup_x2
    //   95: iconst_1
    //   96: if_icmpgt -> 196
    //   99: dup2
    //   100: swap
    //   101: iload #6
    //   103: dup2_x1
    //   104: caload
    //   105: swap
    //   106: iload #6
    //   108: bipush #7
    //   110: irem
    //   111: tableswitch default -> 178, 0 -> 148, 1 -> 153, 2 -> 158, 3 -> 163, 4 -> 168, 5 -> 173
    //   148: bipush #40
    //   150: goto -> 180
    //   153: bipush #32
    //   155: goto -> 180
    //   158: bipush #127
    //   160: goto -> 180
    //   163: bipush #73
    //   165: goto -> 180
    //   168: bipush #112
    //   170: goto -> 180
    //   173: bipush #105
    //   175: goto -> 180
    //   178: bipush #48
    //   180: ixor
    //   181: ixor
    //   182: i2c
    //   183: castore
    //   184: iinc #6, 1
    //   187: dup
    //   188: ifne -> 196
    //   191: dup2
    //   192: dup_x1
    //   193: goto -> 103
    //   196: dup2_x1
    //   197: pop2
    //   198: dup_x2
    //   199: iload #6
    //   201: if_icmpgt -> 99
    //   204: pop
    //   205: new java/lang/String
    //   208: dup_x1
    //   209: swap
    //   210: invokespecial <init> : ([C)V
    //   213: invokevirtual intern : ()Ljava/lang/String;
    //   216: swap
    //   217: pop
    //   218: swap
    //   219: pop
    //   220: goto -> 37
    //   223: invokestatic Zr : ()Lburp/Ztt4;
    //   226: putstatic burp/Zses.ZQ : Lburp/Ztt4;
    //   229: return
  }
  
  private static CertificateException a(CertificateException paramCertificateException) {
    return paramCertificateException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF880C) & 0xFFFF;
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
      char c = 'ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zses.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */