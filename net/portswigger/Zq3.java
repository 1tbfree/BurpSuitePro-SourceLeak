package net.portswigger;

import burp.Zbqc;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

class Zq3 {
  private static final Pattern ZF;
  
  private final Map<String, Pattern> Zc = new HashMap<>();
  
  private static final String[] a;
  
  private static final String[] b;
  
  public void ZZ(String paramString) {
    // Byte code:
    //   0: invokestatic Zk : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   8: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   11: astore_1
    //   12: aload_1
    //   13: ldc '.'
    //   15: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   18: ifeq -> 29
    //   21: aload_1
    //   22: goto -> 35
    //   25: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   28: athrow
    //   29: aload_1
    //   30: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   35: astore_3
    //   36: getstatic net/portswigger/Zq3.ZF : Ljava/util/regex/Pattern;
    //   39: aload_3
    //   40: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   43: astore #4
    //   45: aload #4
    //   47: invokevirtual matches : ()Z
    //   50: ifne -> 54
    //   53: return
    //   54: aload_0
    //   55: getfield Zc : Ljava/util/Map;
    //   58: aload_1
    //   59: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   64: ifeq -> 68
    //   67: return
    //   68: aload #4
    //   70: iconst_1
    //   71: invokevirtual group : (I)Ljava/lang/String;
    //   74: astore #5
    //   76: iconst_m1
    //   77: istore #6
    //   79: aload #5
    //   81: ifnull -> 93
    //   84: aload #5
    //   86: bipush #42
    //   88: invokevirtual indexOf : (I)I
    //   91: istore #6
    //   93: iload #6
    //   95: iconst_m1
    //   96: if_icmpeq -> 164
    //   99: aload #5
    //   101: bipush #42
    //   103: iload #6
    //   105: iconst_1
    //   106: iadd
    //   107: invokevirtual indexOf : (II)I
    //   110: iconst_m1
    //   111: if_icmpeq -> 122
    //   114: goto -> 121
    //   117: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   120: athrow
    //   121: return
    //   122: aload_1
    //   123: iconst_0
    //   124: iload #6
    //   126: invokevirtual substring : (II)Ljava/lang/String;
    //   129: invokestatic quote : (Ljava/lang/String;)Ljava/lang/String;
    //   132: aload_1
    //   133: iload #6
    //   135: iconst_1
    //   136: iadd
    //   137: invokevirtual substring : (I)Ljava/lang/String;
    //   140: invokestatic quote : (Ljava/lang/String;)Ljava/lang/String;
    //   143: sipush #20552
    //   146: sipush #31061
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: swap
    //   153: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   158: astore #7
    //   160: aload_2
    //   161: ifnull -> 170
    //   164: aload_1
    //   165: invokestatic quote : (Ljava/lang/String;)Ljava/lang/String;
    //   168: astore #7
    //   170: aload_0
    //   171: getfield Zc : Ljava/util/Map;
    //   174: aload_1
    //   175: aload #7
    //   177: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   180: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   185: pop
    //   186: goto -> 201
    //   189: astore_3
    //   190: aload_3
    //   191: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   194: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   197: aload_3
    //   198: invokevirtual printStackTrace : ()V
    //   201: return
    // Exception table:
    //   from	to	target	type
    //   4	53	189	java/lang/Throwable
    //   12	25	25	java/lang/Throwable
    //   54	67	189	java/lang/Throwable
    //   68	121	189	java/lang/Throwable
    //   93	114	117	java/lang/Throwable
    //   122	186	189	java/lang/Throwable
  }
  
  public boolean Zz(String paramString) {
    paramString = paramString.toLowerCase(Locale.US);
    Zbqc[] arrayOfZbqc = Zj.Zk();
    for (Pattern pattern : this.Zc.values()) {
      if (pattern.matcher(paramString).matches())
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '²p^ás¨»}ÑÔ ;æ°Eà}qÍJçéSO®æ»¢\\r)¹Úë;ÕBÛ,¶þE²æ¦w³ØÓsý9WÔX4HÌ0ùÁ³8²L,JçH¿B%&9[HJÇQõ¶gÐ^Ë>'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #45
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic net/portswigger/Zq3.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic net/portswigger/Zq3.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #52
    //   154: goto -> 184
    //   157: bipush #23
    //   159: goto -> 184
    //   162: bipush #24
    //   164: goto -> 184
    //   167: bipush #77
    //   169: goto -> 184
    //   172: bipush #29
    //   174: goto -> 184
    //   177: bipush #127
    //   179: goto -> 184
    //   182: bipush #87
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: sipush #20553
    //   230: sipush #6372
    //   233: invokestatic a : (II)Ljava/lang/String;
    //   236: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
    //   239: putstatic net/portswigger/Zq3.ZF : Ljava/util/regex/Pattern;
    //   242: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5048) & 0xFFFF;
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
      byte b1 = 98;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zq3.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */