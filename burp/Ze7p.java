package burp;

import java.util.List;
import java.util.regex.Pattern;

public class Ze7p {
  private static final Pattern Ze;
  
  private static final List<Pattern> Zl;
  
  private static boolean Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static boolean Zn(Zxs7 paramZxs7) {
    String str = paramZxs7.ZI();
    return (str == null) ? false : (Ze.matcher(str).matches() ? true : Zl.stream().anyMatch(str::lambda$baseValueLooksLikeUrl$1));
  }
  
  public static boolean ZS(Zxs7 paramZxs7, Zbph paramZbph) {
    if (paramZxs7.Zq(paramZbph))
      return false; 
    String str = paramZxs7.ZI();
    if (a(-17968, -2035).equalsIgnoreCase(str) || a(-17963, 13842).equalsIgnoreCase(str) || (str != null && str.contains("\002")))
      return false; 
    switch (Zx4t.ZW[paramZxs7.Z_().ordinal()]) {
      case 1:
      case 2:
      case 3:
        return false;
    } 
    return true;
  }
  
  public static boolean Zn(Zxs7 paramZxs7, Zbph paramZbph, boolean paramBoolean) {
    if (paramZxs7.Zq(paramZbph))
      return false; 
    if (!Zk(paramZxs7, paramBoolean))
      return false; 
    switch (Zx4t.ZW[paramZxs7.Z_().ordinal()]) {
      case 1:
      case 2:
      case 3:
      case 4:
        return false;
    } 
    return true;
  }
  
  private static boolean Zk(Zxs7 paramZxs7, boolean paramBoolean) {
    boolean bool = ZV();
    if (paramBoolean)
      return true; 
    if (paramZxs7.Zg())
      return false; 
    String str = paramZxs7.ZI();
    if (a(-17961, 3048).equalsIgnoreCase(str) || a(-17954, -2539).equalsIgnoreCase(str))
      return false; 
    byte b = 0;
    while (b < str.length()) {
      char c = str.charAt(b);
      if (!Character.isLetterOrDigit(c) && a(-17962, -30150).indexOf(c) == -1)
        return false; 
      b++;
      if (bool)
        break; 
    } 
    return true;
  }
  
  public static boolean Zt(Zxs7 paramZxs7) {
    return (paramZxs7.Z_() == Zs66.PATH_FILENAME_PARAM || paramZxs7.Z_() == Zs66.PATH_FOLDER_PARAM);
  }
  
  private static boolean lambda$baseValueLooksLikeUrl$1(String paramString, Pattern paramPattern) {
    return paramPattern.matcher(paramString).matches();
  }
  
  private static Pattern lambda$static$0(String paramString) {
    return Pattern.compile(paramString + paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zf : (Z)V
    //   13: ldc 'CÚÅíYU~75ÏéÒ$(ä_ªûá\\f¢ï÷ðãtäöyñ¿Ê'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #9
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #96
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'VVè([í(7?zåÍ¿äRàÆ\\nõ®)(/mLÌÊ±À'D-Ú¸'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_5
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #27
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Ze7p.a : [Ljava/lang/String;
    //   135: bipush #10
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Ze7p.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #55
    //   218: goto -> 248
    //   221: bipush #16
    //   223: goto -> 248
    //   226: bipush #44
    //   228: goto -> 248
    //   231: bipush #10
    //   233: goto -> 248
    //   236: bipush #91
    //   238: goto -> 248
    //   241: bipush #39
    //   243: goto -> 248
    //   246: bipush #21
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: sipush #-17965
    //   307: sipush #-10413
    //   310: invokestatic a : (II)Ljava/lang/String;
    //   313: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   316: putstatic burp/Ze7p.Ze : Ljava/util/regex/Pattern;
    //   319: iconst_5
    //   320: anewarray java/lang/String
    //   323: dup
    //   324: iconst_0
    //   325: ldc ''
    //   327: aastore
    //   328: dup
    //   329: iconst_1
    //   330: ldc '/'
    //   332: aastore
    //   333: dup
    //   334: iconst_2
    //   335: sipush #-17966
    //   338: sipush #25127
    //   341: invokestatic a : (II)Ljava/lang/String;
    //   344: aastore
    //   345: dup
    //   346: iconst_3
    //   347: sipush #-17964
    //   350: sipush #18963
    //   353: invokestatic a : (II)Ljava/lang/String;
    //   356: aastore
    //   357: dup
    //   358: iconst_4
    //   359: sipush #-17967
    //   362: sipush #29663
    //   365: invokestatic a : (II)Ljava/lang/String;
    //   368: aastore
    //   369: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   372: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   377: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   382: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   387: invokestatic toList : ()Ljava/util/stream/Collector;
    //   390: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   395: checkcast java/util/List
    //   398: putstatic burp/Ze7p.Zl : Ljava/util/List;
    //   401: return
  }
  
  public static void Zf(boolean paramBoolean) {
    Zb = paramBoolean;
  }
  
  public static boolean ZJ() {
    return Zb;
  }
  
  public static boolean ZV() {
    boolean bool = ZJ();
    return !bool;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB9D6) & 0xFFFF;
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
      byte b1 = 38;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze7p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */