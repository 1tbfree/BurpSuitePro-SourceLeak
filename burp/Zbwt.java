package burp;

import java.io.IOException;
import net.portswigger.Zkb;

public class Zbwt {
  private static String[] Ze;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public static void Zl(Zs4f paramZs4f, Zr4o paramZr4o) throws IOException {
    String[] arrayOfString = ZR();
    String str = paramZr4o.ZFo();
    try {
      if (str != null)
        paramZs4f.ZY(a(9960, -31231), Zkb.Zy(str)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZs4f.Zk(a(9963, -20583), paramZr4o.ZFW());
    paramZs4f.Zb(a(9966, 8376), paramZr4o.ZFh());
    for (Zstu zstu : paramZr4o.ZFB()) {
      paramZs4f.Ze("l", zstu);
      if (arrayOfString != null)
        break; 
    } 
    try {
      paramZs4f.Zb(a(9967, -26869), paramZr4o.ZFc());
      paramZs4f.Zb(a(9962, -11818), paramZr4o.ZFw());
      if (Zbqc.Zwu() == null)
        Zo(new String[1]); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static void Zl(Zr4o paramZr4o) {
    String[] arrayOfString = ZR();
    if (paramZr4o.ZyP()) {
      if (paramZr4o.ZFo() == null) {
        paramZr4o.ZvH(-1);
        if (arrayOfString != null) {
          int j = ZL(paramZr4o, paramZr4o.ZFo());
          paramZr4o.ZvH(j * (1 + paramZr4o.ZFB().size()) * (j + 1));
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    int i = ZL(paramZr4o, paramZr4o.ZFo());
    paramZr4o.ZvH(i * (1 + paramZr4o.ZFB().size()) * (i + 1));
  }
  
  private static int ZL(Zr4o paramZr4o, String paramString) {
    int i = paramZr4o.ZFh();
    if (i == 0)
      return 0; 
    int j = paramString.length();
    if (paramZr4o.ZFW())
      j /= 2; 
    return j / i;
  }
  
  static void ZX(Zsh8 paramZsh8, Zr4o paramZr4o) throws Zs7w {
    try {
      if (paramZr4o.ZFh() <= 0)
        throw new Zs7w(a(9964, -30400)); 
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
    String str = paramZr4o.ZFo();
    try {
      if (str != null)
        try {
          if (str.length() == 0)
            throw new Zs7w(a(9965, -1977)); 
        } catch (Zs7w zs7w) {
          throw a(null);
        }  
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
    try {
      if (paramZsh8.ZPa() == Zejb.BATTERING_RAM)
        throw new Zs7w(a(9961, 28149)); 
    } catch (Zs7w zs7w) {
      throw a(null);
    } 
  }
  
  static void ZQ(Zr4o paramZr4o) {
    paramZr4o.Ze((Zrte<Zstu>)null);
    paramZr4o.ZWo(0);
    paramZr4o.ZWY(0);
  }
  
  public static void Zo(String[] paramArrayOfString) {
    Ze = paramArrayOfString;
  }
  
  public static String[] ZR() {
    return Ze;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc 'ÙD9©!û&UÌGôYÃO»7}ló"]\\fÊ2Â¬ÇÝ:¶V½H!îCÚn ¢<;ª³GÁWN ¢FH¸0÷FI£9Ö©Æ|õeÕê«1æ\\td3'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zo : ([Ljava/lang/String;)V
    //   22: iconst_2
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #81
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 145
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc '/MPÛ'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: iconst_3
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #20
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zbwt.b : [Ljava/lang/String;
    //   134: bipush #8
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zbwt.c : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 264
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #27
    //   218: goto -> 248
    //   221: bipush #16
    //   223: goto -> 248
    //   226: bipush #76
    //   228: goto -> 248
    //   231: bipush #72
    //   233: goto -> 248
    //   236: bipush #73
    //   238: goto -> 248
    //   241: bipush #123
    //   243: goto -> 248
    //   246: bipush #61
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 168
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 164
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x26E8) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 97;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbwt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */