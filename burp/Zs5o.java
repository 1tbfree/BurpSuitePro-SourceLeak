package burp;

import java.awt.Font;

public class Zs5o {
  private final String ZY;
  
  private final Font Zm;
  
  private final float Zj;
  
  private final int ZE;
  
  private final float ZF;
  
  private final int Zs;
  
  private static int ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zs5o(String paramString, Font paramFont, float paramFloat1, int paramInt1, float paramFloat2, int paramInt2) {
    this.ZY = paramString;
    this.Zm = paramFont;
    this.Zj = paramFloat1;
    this.ZE = paramInt1;
    this.ZF = paramFloat2;
    this.Zs = paramInt2;
  }
  
  public static Zs5o ZI(char paramChar, Zzkh paramZzkh) {
    Font font1 = paramZzkh.Zl();
    float f1 = paramZzkh.Zm('A');
    float f2 = (float)Math.ceil((f1 * 0.8F));
    Font font2 = font1.deriveFont((float)(font1.getSize() * 0.8D));
    String str = Ze(paramChar);
    float f3 = f2 * str.length();
    int j = (int)Math.floor((f2 * 0.75F));
    float f4 = j + f3 + j;
    float f5 = paramZzkh.Zh() - 2.0F;
    int i = Zj();
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zs5o(str, font2, f4, j, f5, 1);
  }
  
  private static String Ze(char paramChar) {
    try {
      if (paramChar == '\t')
        return a(-14388, -5); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramChar == '\000')
        return a(-14386, -20436); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramChar == '\r')
        return a(-14387, 5304); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (paramChar == '\n')
        return a(-14389, -9433); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (ZN(paramChar))
        return String.format(a(-14385, 8758), new Object[] { Integer.valueOf(paramChar) }); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(-14392, -2) + a(-14392, -2) + paramChar);
  }
  
  public static boolean ZN(char paramChar) {
    // Byte code:
    //   0: iload_0
    //   1: invokestatic ZR : (C)Z
    //   4: ifne -> 48
    //   7: iload_0
    //   8: bipush #127
    //   10: if_icmple -> 34
    //   13: goto -> 20
    //   16: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   19: athrow
    //   20: iload_0
    //   21: sipush #255
    //   24: if_icmple -> 48
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   33: athrow
    //   34: iload_0
    //   35: invokestatic Zc : (C)Z
    //   38: ifeq -> 56
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   47: athrow
    //   48: iconst_1
    //   49: goto -> 57
    //   52: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   55: athrow
    //   56: iconst_0
    //   57: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	13	16	java/lang/IllegalArgumentException
    //   7	27	30	java/lang/IllegalArgumentException
    //   20	41	44	java/lang/IllegalArgumentException
    //   34	52	52	java/lang/IllegalArgumentException
  }
  
  public static boolean Zc(char paramChar) {
    try {
      if (!Character.isHighSurrogate(paramChar)) {
        try {
          if (Character.isLowSurrogate(paramChar));
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public static boolean ZR(char paramChar) {
    try {
      if (paramChar >= ' ') {
        try {
          if (paramChar == '');
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  public float Zq() {
    return this.Zs + this.Zj;
  }
  
  float ZZ() {
    return this.Zj;
  }
  
  float Zz() {
    return this.ZF;
  }
  
  int ZY() {
    return this.Zs;
  }
  
  public String ZG() {
    return this.ZY;
  }
  
  Font ZK() {
    return this.Zm;
  }
  
  int Zd() {
    return this.ZE;
  }
  
  public static void Zd(int paramInt) {
    ZB = paramInt;
  }
  
  public static int Zb() {
    return ZB;
  }
  
  public static int Zj() {
    int i = Zb();
    try {
      if (i == 0)
        return 118; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: bipush #17
    //   11: ldc 'd ªøLèfM";¢¬7Ê%1=ÇÉ)¥¼TJ;ü:}Ãâ$'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: iconst_2
    //   21: istore_1
    //   22: invokestatic Zd : (I)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #68
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
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
    //   72: ldc '\\b­ÄðóóÇÔ'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #10
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #38
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zs5o.a : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zs5o.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 263
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 245, 0 -> 216, 1 -> 220, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: iconst_3
    //   217: goto -> 247
    //   220: bipush #56
    //   222: goto -> 247
    //   225: bipush #6
    //   227: goto -> 247
    //   230: bipush #114
    //   232: goto -> 247
    //   235: bipush #127
    //   237: goto -> 247
    //   240: bipush #51
    //   242: goto -> 247
    //   245: bipush #95
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 170
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 166
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC7CD) & 0xFFFF;
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
      byte b1 = 99;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs5o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */