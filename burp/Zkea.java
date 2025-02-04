package burp;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zli;
import net.portswigger.Zm2;

class Zkea {
  private static final Map<Zlk4, Long> Zc;
  
  private final Zrgd ZW;
  
  private final Zskh Zq;
  
  private final Zlx7 ZK;
  
  private final List<String> ZL;
  
  private final long Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zkea(Zrgd paramZrgd, Zskh paramZskh, Zlx7 paramZlx7, Zlk4 paramZlk4) {
    this.ZW = paramZrgd;
    this.Zq = paramZskh;
    this.ZK = paramZlx7;
    this.ZL = Zmt8.Zb();
    this.Zp = ((Long)Zc.getOrDefault(paramZlk4, Long.valueOf(Long.MAX_VALUE))).longValue();
  }
  
  String ZU(Zxrc paramZxrc, String paramString) {
    synchronized (this.ZK.Zz6()) {
      String str = paramZxrc.ZP();
      if (!this.ZK.Zvn(str))
        return null; 
      this.ZK.Zvq(str);
    } 
    return ZI(paramZxrc, paramString);
  }
  
  private String ZI(Zxrc paramZxrc, String paramString) {
    long l1 = this.ZW.ZX();
    byte[] arrayOfByte = paramZxrc.Zd();
    long l2 = 0L;
    Iterator<String> iterator = this.ZL.iterator();
    int[] arrayOfInt = Ztyp.Zw();
    while (iterator.hasNext()) {
      String str = iterator.next();
      byte[] arrayOfByte1 = ZJ(paramZxrc.ZB(), paramString, str);
      boolean bool = Zli.ZQ(arrayOfByte, arrayOfByte1);
      l2 = this.ZW.ZX() - l1;
      if (bool) {
        Zm2.Zi(Zv8r.SCANNER_JWT_HMAC_BRUTE_FORCE_SECRET_COMPLETED_DURATION, l2);
        return str;
      } 
      if (l2 > this.Zp) {
        Zm2.Zi(Zv8r.SCANNER_JWT_HMAC_BRUTE_FORCE_SECRET_TIMEOUT_DURATION, this.Zp);
        Zmgc.JWT_BRUTE_FORCE_TIMEOUT.ZK(this.Zq, new Object[0]);
        return null;
      } 
      if (arrayOfInt == null)
        break; 
    } 
    Zm2.Zi(Zv8r.SCANNER_JWT_HMAC_BRUTE_FORCE_SECRET_COMPLETED_DURATION, l2);
    return null;
  }
  
  private static byte[] ZJ(String paramString1, String paramString2, String paramString3) {
    String str = ZQ(paramString2);
    try {
      (new byte[1])[0] = 0;
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      throw a(null);
    } 
    byte[] arrayOfByte = paramString3.isEmpty() ? new byte[1] : paramString3.getBytes(StandardCharsets.UTF_8);
    try {
      Mac mac = Mac.getInstance(str);
      mac.init(new SecretKeySpec(arrayOfByte, str));
      mac.update(paramString1.getBytes(StandardCharsets.UTF_8));
      return mac.doFinal();
    } catch (NoSuchAlgorithmException|java.security.InvalidKeyException noSuchAlgorithmException) {
      Zah.Zl(noSuchAlgorithmException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private static String ZQ(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: astore_2
    //   2: invokestatic Zw : ()[I
    //   5: iconst_m1
    //   6: istore_3
    //   7: astore_1
    //   8: aload_2
    //   9: invokevirtual hashCode : ()I
    //   12: lookupswitch default -> 110, 69015912 -> 48, 69016964 -> 70, 69018667 -> 92
    //   48: aload_2
    //   49: sipush #-32643
    //   52: sipush #-28492
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: invokevirtual equals : (Ljava/lang/Object;)Z
    //   61: ifeq -> 110
    //   64: iconst_0
    //   65: istore_3
    //   66: aload_1
    //   67: ifnonnull -> 110
    //   70: aload_2
    //   71: sipush #-32644
    //   74: sipush #19861
    //   77: invokestatic a : (II)Ljava/lang/String;
    //   80: invokevirtual equals : (Ljava/lang/Object;)Z
    //   83: ifeq -> 110
    //   86: iconst_1
    //   87: istore_3
    //   88: aload_1
    //   89: ifnonnull -> 110
    //   92: aload_2
    //   93: sipush #-32648
    //   96: sipush #-4932
    //   99: invokestatic a : (II)Ljava/lang/String;
    //   102: invokevirtual equals : (Ljava/lang/Object;)Z
    //   105: ifeq -> 110
    //   108: iconst_2
    //   109: istore_3
    //   110: iload_3
    //   111: tableswitch default -> 172, 0 -> 136, 1 -> 148, 2 -> 160
    //   136: sipush #-32645
    //   139: sipush #-6465
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: goto -> 182
    //   148: sipush #-32646
    //   151: sipush #21872
    //   154: invokestatic a : (II)Ljava/lang/String;
    //   157: goto -> 182
    //   160: sipush #-32647
    //   163: sipush #-694
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: goto -> 182
    //   172: iconst_0
    //   173: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   176: aload_0
    //   177: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   180: ldc ''
    //   182: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '{Nöò!·¼^l^Õù>\\nÁ¡êË´ÄØö\\nbµ@/3ÿ²²'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
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
    //   68: ldc 'Â*ÔE ,²'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #54
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
    //   128: putstatic burp/Zkea.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zkea.b : [Ljava/lang/String;
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
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #91
    //   219: goto -> 244
    //   222: bipush #98
    //   224: goto -> 244
    //   227: bipush #87
    //   229: goto -> 244
    //   232: bipush #111
    //   234: goto -> 244
    //   237: bipush #84
    //   239: goto -> 244
    //   242: bipush #122
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
    //   300: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   303: ldc2_w 100
    //   306: invokestatic valueOf : (J)Ljava/lang/Long;
    //   309: getstatic burp/Zlk4.NORMAL : Lburp/Zlk4;
    //   312: ldc2_w 500
    //   315: invokestatic valueOf : (J)Ljava/lang/Long;
    //   318: getstatic burp/Zlk4.THOROUGH : Lburp/Zlk4;
    //   321: ldc2_w 1000
    //   324: invokestatic valueOf : (J)Ljava/lang/Long;
    //   327: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;
    //   330: putstatic burp/Zkea.Zc : Ljava/util/Map;
    //   333: return
  }
  
  private static NoSuchAlgorithmException a(NoSuchAlgorithmException paramNoSuchAlgorithmException) {
    return paramNoSuchAlgorithmException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8079) & 0xFFFF;
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
      byte b1 = 55;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkea.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */