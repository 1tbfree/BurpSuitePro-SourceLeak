package burp;

import java.util.Comparator;
import java.util.Objects;

class Zr3 {
  private static final Comparator<Zg55> Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZQ(Zg55 paramZg55, String paramString) {
    if (!paramZg55.ZaS())
      return false; 
    String str1 = paramZg55.ZaD();
    int i = paramString.indexOf(a(4920, -28389));
    int j = str1.indexOf(a(4927, 84));
    if (j > 0 && !ZD(paramString, i).equals(ZD(str1, j)))
      return false; 
    String str2 = ZB(paramString, i);
    String str3 = ZB(str1, j);
    return paramZg55.Zau() ? Zi(str2, str3) : str2.startsWith(str3);
  }
  
  static boolean ZB(Zg55 paramZg55, Zmzk paramZmzk) {
    if (!paramZg55.ZaS())
      return false; 
    String str = paramZg55.ZaD();
    return paramZg55.Zau() ? Zb(paramZmzk, str) : ZV(paramZmzk, str);
  }
  
  private static boolean ZV(Zmzk paramZmzk, String paramString) {
    return ZH(paramString) ? ZL(paramString, paramZmzk) : ((ZL(a(4926, -27209) + a(4926, -27209), paramZmzk) || ZL(a(4921, -11237) + a(4921, -11237), paramZmzk)));
  }
  
  private static boolean Zb(Zmzk paramZmzk, String paramString) {
    return ZH(paramString) ? ZE(paramString, paramZmzk) : ((ZE(a(4926, -27209) + a(4926, -27209), paramZmzk) || ZE(a(4921, -11237) + a(4921, -11237), paramZmzk)));
  }
  
  static boolean Zm(Zg55 paramZg55, String paramString) {
    if (!paramZg55.ZaS())
      return false; 
    String str1 = paramZg55.ZaD();
    int i = paramString.indexOf(a(4927, 84));
    int j = str1.indexOf(a(4927, 84));
    if (j > 0 && !ZD(paramString, i).equals(ZD(str1, j)))
      return false; 
    String str2 = ZB(paramString, i);
    String str3 = ZB(str1, j);
    return paramZg55.Zau() ? ZU(str2, str3) : str3.startsWith(str2);
  }
  
  private static boolean Zi(String paramString1, String paramString2) {
    String[] arrayOfString = Zsl2.ZP();
    if (paramString2.isEmpty())
      return true; 
    int i = paramString1.length();
    int j = i - 1;
    int k = paramString2.length();
    int m = k - 1;
    while (j >= 0 && m >= 0) {
      while (j >= 0 && paramString2.charAt(m) != paramString1.charAt(j)) {
        j--;
        if (arrayOfString == null)
          break; 
      } 
      while (j >= 0 && m >= 0 && paramString2.charAt(m) == paramString1.charAt(j)) {
        m--;
        j--;
        if (arrayOfString == null)
          break; 
      } 
      if (m < 0 && Zy(j, paramString1) && ZX(j, paramString1))
        return true; 
      m = k - 1;
      if (arrayOfString == null)
        break; 
    } 
    return false;
  }
  
  private static boolean ZU(String paramString1, String paramString2) {
    String[] arrayOfString = Zsl2.ZP();
    if (paramString1.isEmpty())
      return true; 
    int i = paramString1.length();
    int j = i - 1;
    int k = paramString2.length() - 1;
    while (j >= 0 && k >= 0) {
      while (k >= 0 && paramString2.charAt(k) != paramString1.charAt(j)) {
        k--;
        if (arrayOfString == null)
          break; 
      } 
      while (j >= 0 && k >= 0 && paramString2.charAt(k) == paramString1.charAt(j)) {
        k--;
        j--;
        if (arrayOfString == null)
          break; 
      } 
      if (k < 0 && Zy(j, paramString1) && ZX(j, paramString1))
        return true; 
      j = i - 1;
      k--;
      if (arrayOfString == null)
        break; 
    } 
    return false;
  }
  
  private static boolean Zy(int paramInt, String paramString) {
    return (paramInt < 0 || paramString.charAt(paramInt) == '.');
  }
  
  private static boolean ZX(int paramInt, String paramString) {
    String[] arrayOfString = Zsl2.ZP();
    if (paramInt > 0) {
      int i = paramInt - 1;
      while (i >= 0) {
        if (paramString.charAt(i) == '/' || paramString.charAt(i) == '?')
          return false; 
        i--;
        if (arrayOfString == null)
          break; 
      } 
    } 
    return true;
  }
  
  private static boolean ZH(String paramString) {
    return (paramString.startsWith(a(4922, 5267)) || paramString.startsWith(a(4923, 8724)));
  }
  
  private static String ZD(String paramString, int paramInt) {
    return (paramInt != -1) ? paramString.substring(0, paramInt + 3) : "";
  }
  
  private static String ZB(String paramString, int paramInt) {
    return (paramInt != -1) ? paramString.substring(paramInt + 3) : paramString;
  }
  
  private static boolean ZL(String paramString, Zmzk paramZmzk) {
    int i = paramString.indexOf(a(4927, 84));
    if (i == -1)
      return false; 
    i += 3;
    int j = Zd(paramString, i);
    String str1 = paramString.substring(0, j);
    String str2 = (paramZmzk.ZJY() == 6) ? ("[" + paramZmzk.ZJ1() + "]") : paramZmzk.ZJ1();
    String str3 = paramZmzk.ZJQ() + paramZmzk.ZJQ() + a(4927, 84);
    return str1.equals(str3);
  }
  
  private static boolean ZE(String paramString, Zmzk paramZmzk) {
    int i = paramString.indexOf(a(4927, 84));
    if (i == -1)
      return false; 
    String str1 = paramString.substring(0, i);
    i += 3;
    int j = Zd(paramString, i);
    String str2 = paramString.substring(i, j);
    String str3 = (paramZmzk.ZJY() == 6) ? ("[" + paramZmzk.ZJ1() + "]") : paramZmzk.ZJ1();
    String str4 = (new StringBuilder(str3)).reverse().toString();
    String str5 = (new StringBuilder(str2)).reverse().toString();
    return (str4.startsWith(str5) && paramZmzk.ZJQ().equals(str1));
  }
  
  private static int Zd(String paramString, int paramInt) {
    int i = paramInt;
    if (paramInt < paramString.length() && paramString.charAt(paramInt) == '[') {
      int m = paramString.indexOf(']', paramInt);
      if (m > -1)
        i = m; 
    } 
    int j = paramString.indexOf(':', i);
    int k = paramString.indexOf('/', i);
    return (j != -1) ? j : ((k != -1) ? k : paramString.length());
  }
  
  static int ZE(Zg55 paramZg551, Zg55 paramZg552) {
    return Zn.compare(paramZg551, paramZg552);
  }
  
  static boolean Zw(Zg55 paramZg55, Object paramObject) {
    if (paramObject == null || paramZg55.getClass() != paramObject.getClass())
      return false; 
    Zg55 zg55 = (Zg55)paramObject;
    return (paramZg55.ZaS() == zg55.ZaS() && paramZg55.ZaD().equals(zg55.ZaD()) && paramZg55.Zau() == zg55.Zau());
  }
  
  static int ZF(Zg55 paramZg55) {
    String[] arrayOfString = Zsl2.ZP();
    if (Zbqc.Zwu() == null)
      Zsl2.ZL(new String[3]); 
    return Objects.hash(new Object[] { paramZg55.ZaD(), Boolean.valueOf(paramZg55.ZaS()), Boolean.valueOf(paramZg55.Zau()) });
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ý#újB§\\b÷¢ÃÚBß=ý\\b¯weØ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #64
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
    //   68: ldc '.1ÛIf\?û~'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #92
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
    //   129: putstatic burp/Zr3.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr3.b : [Ljava/lang/String;
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
    //   212: bipush #74
    //   214: goto -> 244
    //   217: bipush #55
    //   219: goto -> 244
    //   222: bipush #85
    //   224: goto -> 244
    //   227: bipush #70
    //   229: goto -> 244
    //   232: bipush #23
    //   234: goto -> 244
    //   237: bipush #83
    //   239: goto -> 244
    //   242: bipush #18
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
    //   300: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   305: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   308: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   313: invokeinterface thenComparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   318: putstatic burp/Zr3.Zn : Ljava/util/Comparator;
    //   321: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x133A) & 0xFFFF;
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
      char c = 'ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */