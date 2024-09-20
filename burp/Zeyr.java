package burp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.Signature;
import java.security.SignatureException;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

public class Zeyr {
  private static String ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void Zq(File paramFile, Zl0 paramZl0) throws Zlvd, Zlvc {
    BufferedInputStream bufferedInputStream = null;
    try {
      bufferedInputStream = new BufferedInputStream(paramZl0.ZO(paramFile));
      ZO(bufferedInputStream);
    } catch (FileNotFoundException fileNotFoundException) {
      Zah.Zl(fileNotFoundException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zlvd(a(7718, 26047));
    } finally {
      try {
        if (bufferedInputStream != null)
          try {
            bufferedInputStream.close();
          } catch (IOException iOException) {
            Zah.Zl(iOException, Zk_.IGNORED);
          }  
      } catch (Zlvd zlvd) {
        throw a(null);
      } 
    } 
  }
  
  public void ZO(InputStream paramInputStream) throws Zlvd, Zlvc {
    String str = Zc();
    try {
      Signature signature = Signature.getInstance(a(7714, 17863));
      signature.initVerify(Zgm9.ZE);
      byte[] arrayOfByte = ZC(paramInputStream, signature);
      try {
        if (arrayOfByte != null)
          try {
            if (signature.verify(arrayOfByte)) {
              try {
                if (str == null)
                  Zbqc.Zr(new Zbqc[1]); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              return;
            } 
            throw new Zlvd(a(7712, -23191));
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      throw new Zlvd(a(7712, -23191));
    } catch (IOException|java.security.NoSuchAlgorithmException|java.security.InvalidKeyException|SignatureException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zlvd(a(7716, 3011), iOException);
    } catch (Zlvc|Zlvd zlvc) {
      Zah.Zl((Throwable)zlvc, Zk_.COMMON_RUNTIME_FAILURE);
      throw zlvc;
    } 
  }
  
  private byte[] ZC(InputStream paramInputStream, Signature paramSignature) throws IOException, SignatureException, Zlvc {
    // Byte code:
    //   0: new java/util/zip/ZipInputStream
    //   3: dup
    //   4: aload_1
    //   5: invokespecial <init> : (Ljava/io/InputStream;)V
    //   8: astore #4
    //   10: invokestatic Zc : ()Ljava/lang/String;
    //   13: aconst_null
    //   14: astore #6
    //   16: astore_3
    //   17: iconst_0
    //   18: istore #7
    //   20: aload #4
    //   22: invokevirtual getNextEntry : ()Ljava/util/zip/ZipEntry;
    //   25: dup
    //   26: astore #5
    //   28: ifnull -> 107
    //   31: aload #4
    //   33: invokestatic Zs : (Ljava/io/InputStream;)[B
    //   36: astore #8
    //   38: aload #5
    //   40: invokevirtual getName : ()Ljava/lang/String;
    //   43: astore #9
    //   45: aload #9
    //   47: sipush #7715
    //   50: sipush #-20970
    //   53: invokestatic a : (II)Ljava/lang/String;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: ifeq -> 70
    //   62: aload #8
    //   64: astore #6
    //   66: aload_3
    //   67: ifnonnull -> 103
    //   70: aload #9
    //   72: sipush #7719
    //   75: sipush #-26617
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokevirtual equals : (Ljava/lang/Object;)Z
    //   84: ifeq -> 97
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   93: athrow
    //   94: iconst_1
    //   95: istore #7
    //   97: aload_2
    //   98: aload #8
    //   100: invokevirtual update : ([B)V
    //   103: aload_3
    //   104: ifnonnull -> 20
    //   107: iload #7
    //   109: ifne -> 133
    //   112: new burp/Zlvc
    //   115: dup
    //   116: sipush #7713
    //   119: sipush #30578
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: athrow
    //   129: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   132: athrow
    //   133: aload #6
    //   135: areturn
    // Exception table:
    //   from	to	target	type
    //   66	87	90	java/io/IOException
    //   107	129	129	java/io/IOException
  }
  
  public static void ZK(String paramString) {
    ZJ = paramString;
  }
  
  public static String Zc() {
    return ZJ;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'aox1tc'
    //   11: ldc 'än`ÃOQé:®½\\n¿Âì¤³å6¡l>â9ùS±!.ú\\bGë8s¼ÃNÙ'Î-°L÷%ÁNI<}÷LºÃaÊ%g¿Ï¬Ie·ûE¿sÚàËVO1ÜMiÕíØ²½,óê?¾Ò¡#\\nû©6B\\b|ØA1ÝØ,mÞ¿®21)lZv9¦}ÐD\\téLå®87.Î÷¸\ZÁÅîÎ]a&·}å0¡9Ñ<ÐÃåYRý/lé¾¹ i¬röÀ7>·ëP#UíT¨WR°¶<ý"'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: bipush #13
    //   22: istore_1
    //   23: invokestatic ZK : (Ljava/lang/String;)V
    //   26: iconst_m1
    //   27: istore_0
    //   28: bipush #58
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 148
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'àA\ÎUz<TOAÇ¶pÍ-AxXäáÜu¬y3{\\bßèç¬â¶'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: bipush #16
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #39
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
    //   134: putstatic burp/Zeyr.a : [Ljava/lang/String;
    //   137: bipush #7
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zeyr.b : [Ljava/lang/String;
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
    //   216: bipush #103
    //   218: goto -> 248
    //   221: bipush #116
    //   223: goto -> 248
    //   226: bipush #21
    //   228: goto -> 248
    //   231: bipush #92
    //   233: goto -> 248
    //   236: bipush #23
    //   238: goto -> 248
    //   241: bipush #85
    //   243: goto -> 248
    //   246: bipush #39
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
    //   287: tableswitch default -> 45, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1E22) & 0xFFFF;
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
      char c = 'ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeyr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */