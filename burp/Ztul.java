package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import net.portswigger.Zah;
import net.portswigger.Zdo;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Ztul implements Zr97 {
  private static final byte[] ZU;
  
  private static final DateFormat Zu;
  
  private final Zgb6 ZM;
  
  private final Zrgd Zg;
  
  private final Zr1j ZS;
  
  private final Zkh7 Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztul(Zgb6 paramZgb6, Zrgd paramZrgd, Zr1j paramZr1j, Zkh7 paramZkh7) {
    this.ZM = paramZgb6;
    this.Zg = paramZrgd;
    this.ZS = paramZr1j;
    this.Zd = paramZkh7;
  }
  
  public void ZZ(Zesy paramZesy) {
    ZK(paramZesy.Zd, paramZesy.ZV, paramZesy.ZM);
  }
  
  private void ZK(Zeew paramZeew, Zefx paramZefx, Zb6q paramZb6q) {
    OutputStream outputStream1 = this.ZM.ZY(paramZeew);
    OutputStream outputStream2 = this.ZM.Zr(paramZeew);
    try {
      if (outputStream1 == null)
        try {
          if (outputStream2 == null)
            return; 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object1 = (outputStream1 == null) ? new Object() : outputStream1;
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Object object2 = (outputStream2 == null) ? new Object() : outputStream2;
    synchronized (object1) {
      synchronized (object2) {
        try {
          if (outputStream1 != null)
            ZG(outputStream1, paramZefx.ZT()); 
          try {
            if (outputStream2 != null)
              try {
                if (outputStream2 != outputStream1)
                  ZG(outputStream2, paramZefx.ZT()); 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (outputStream1 != null) {
              outputStream1.write(Zdo.Zn);
              outputStream1.write(paramZefx.ZD());
              outputStream1.write(Zdo.Zn);
              outputStream1.write(ZU);
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (outputStream2 != null)
              try {
                if (paramZb6q != null)
                  try {
                    if (paramZb6q.Za().Zpu() > 0)
                      try {
                        if (Za(paramZb6q)) {
                          outputStream2.write(Zdo.Zn);
                          outputStream2.write(paramZb6q.Za().ZiD());
                          outputStream2.write(Zdo.Zn);
                          outputStream2.write(ZU);
                        } 
                      } catch (IOException iOException) {
                        throw a(null);
                      }  
                  } catch (IOException iOException) {
                    throw a(null);
                  }  
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (outputStream1 != null) {
              outputStream1.write(Zdo.Zn);
              outputStream1.write(Zdo.Zn);
              outputStream1.write(Zdo.Zn);
              outputStream1.write(Zdo.Zn);
              outputStream1.flush();
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (outputStream2 != null)
              try {
                if (outputStream2 != outputStream1) {
                  outputStream2.write(Zdo.Zn);
                  outputStream2.write(Zdo.Zn);
                  outputStream2.write(Zdo.Zn);
                  outputStream2.write(Zdo.Zn);
                  outputStream2.flush();
                } 
              } catch (IOException iOException) {
                throw a(null);
              }  
          } catch (IOException iOException) {
            throw a(null);
          } 
        } catch (IOException iOException) {
          Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
        } catch (Exception exception) {
          Zah.Zl(exception, Zk_.UNEXPECTED);
        } 
      } 
    } 
  }
  
  private void ZG(OutputStream paramOutputStream, Zmzk paramZmzk) throws IOException {
    paramOutputStream.write(ZU);
    paramOutputStream.write(Zdo.Zn);
    paramOutputStream.write(Zkb.Zy(Zu.format(new Date(this.Zg.ZX()))));
    paramOutputStream.write(32);
    paramOutputStream.write(32);
    paramOutputStream.write(Zkb.Zy(Ztt2.ZZ(paramZmzk, "", this.ZM, this.Zg, this.ZS, this.Zd)));
    paramOutputStream.write(Zdo.Zn);
    paramOutputStream.write(ZU);
  }
  
  private static boolean Za(Zb6q paramZb6q) {
    return paramZb6q.Zm().stream().map(String::toLowerCase).filter(Ztul::lambda$isContentTypeText$0).map(Ztul::lambda$isContentTypeText$1).noneMatch(Ztul::lambda$isContentTypeText$2);
  }
  
  private static boolean lambda$isContentTypeText$2(String paramString) {
    return (!paramString.contains(a(-541, -9924)) && !paramString.contains(a(-539, -12291)) && !paramString.contains(a(-544, -11693)) && !paramString.contains(a(-542, -27449)));
  }
  
  private static String lambda$isContentTypeText$1(String paramString) {
    return paramString.substring(13).trim();
  }
  
  private static boolean lambda$isContentTypeText$0(String paramString) {
    return paramString.startsWith(a(-543, 2340));
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÝzjGýÖx\\nÒDó(ásdó~ÐkojÑ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #44
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
    //   68: ldc ';26PN©x':_¯ OÜùß{Õaµ¶ÖlÈ¸¢S\\n¸S"Ñ ~`ux7KÓÂOã­8Õ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #33
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
    //   128: putstatic burp/Ztul.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Ztul.b : [Ljava/lang/String;
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
    //   212: bipush #20
    //   214: goto -> 244
    //   217: bipush #54
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #32
    //   229: goto -> 244
    //   232: bipush #78
    //   234: goto -> 244
    //   237: bipush #28
    //   239: goto -> 244
    //   242: bipush #121
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
    //   300: sipush #-540
    //   303: sipush #-1639
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokestatic Zy : (Ljava/lang/String;)[B
    //   312: putstatic burp/Ztul.ZU : [B
    //   315: iconst_2
    //   316: invokestatic getTimeInstance : (I)Ljava/text/DateFormat;
    //   319: putstatic burp/Ztul.Zu : Ljava/text/DateFormat;
    //   322: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFDE1) & 0xFFFF;
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
      byte b1 = 77;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztul.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */