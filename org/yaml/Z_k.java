package org.yaml;

import burp.Zbqc;
import java.util.Map;
import java.util.TimeZone;

public class Z_k {
  private Zjm ZE = Zjm.PLAIN;
  
  private Zp ZI = Zp.AUTO;
  
  private boolean Z_ = false;
  
  private boolean Zs = true;
  
  private boolean ZH = false;
  
  private int Zf = 2;
  
  private int ZW = 0;
  
  private boolean Zv = false;
  
  private int Zq = 80;
  
  private boolean ZO = true;
  
  private Ztz Zb = Ztz.UNIX;
  
  private boolean ZP = false;
  
  private boolean Zd = false;
  
  private TimeZone Zl;
  
  private int ZV;
  
  private boolean ZQ;
  
  private Zjp ZX;
  
  private Zjv ZZ;
  
  private Map<String, String> ZB;
  
  private Boolean Ze;
  
  private Z_o ZF;
  
  private static boolean ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Z_k() {
    boolean bool = Zt();
    try {
      this.Zl = null;
      this.ZV = 128;
      this.ZQ = false;
      this.ZX = Zjp.BINARY;
      this.ZZ = null;
      this.ZB = null;
      this.Ze = Boolean.valueOf(false);
      this.ZF = new Zl(0);
      if (Zbqc.Zwu() == null) {
        try {
        
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        Zf(!bool);
      } 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
  }
  
  public boolean ZA() {
    return this.Zs;
  }
  
  public Zjm Zr() {
    return this.ZE;
  }
  
  public void Zm(Zjm paramZjm) {
    try {
      if (paramZjm == null)
        throw new NullPointerException(a(-3170, 25572)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.ZE = paramZjm;
  }
  
  public void Zt(int paramInt) {
    try {
      if (paramInt < 1)
        throw new Zj3(a(-3175, -24251)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramInt > 10)
        throw new Zj3(a(-3173, -28951)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zf = paramInt;
  }
  
  public int Z_() {
    return this.Zf;
  }
  
  public void ZM(int paramInt) {
    try {
      if (paramInt < 0)
        throw new Zj3(a(-3169, 14552)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (paramInt > 9)
        throw new Zj3(a(-3172, 13183)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.ZW = paramInt;
  }
  
  public int ZZ() {
    return this.ZW;
  }
  
  public boolean ZR() {
    return this.Zv;
  }
  
  public void Zz(boolean paramBoolean) {
    this.Zv = paramBoolean;
  }
  
  public Zjv ZI() {
    return this.ZZ;
  }
  
  public void ZO(boolean paramBoolean) {
    this.Z_ = paramBoolean;
  }
  
  public boolean Zq() {
    return this.Z_;
  }
  
  public boolean ZE() {
    return this.Ze.booleanValue();
  }
  
  public int ZV() {
    return this.Zq;
  }
  
  public void ZG(boolean paramBoolean) {
    this.ZO = paramBoolean;
  }
  
  public boolean ZW() {
    return this.ZO;
  }
  
  public Ztz Zh() {
    return this.Zb;
  }
  
  public void ZE(Zp paramZp) {
    try {
      if (paramZp == null)
        throw new NullPointerException(a(-3171, -2209)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.ZI = paramZp;
  }
  
  public Zp ZF() {
    return this.ZI;
  }
  
  public void Zk(Ztz paramZtz) {
    try {
      if (paramZtz == null)
        throw new NullPointerException(a(-3174, -11994)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.Zb = paramZtz;
  }
  
  public boolean ZJ() {
    return this.ZH;
  }
  
  public void Zk(boolean paramBoolean) {
    this.ZH = paramBoolean;
  }
  
  public TimeZone ZC() {
    return this.Zl;
  }
  
  public void Zr(TimeZone paramTimeZone) {
    this.Zl = paramTimeZone;
  }
  
  public int Ze() {
    return this.ZV;
  }
  
  public void ZS(int paramInt) {
    try {
      if (paramInt > 1024)
        throw new Zj3(a(-3176, -7636)); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    this.ZV = paramInt;
  }
  
  public boolean Zc() {
    return this.ZQ;
  }
  
  public Zjp ZX() {
    return this.ZX;
  }
  
  public static void Zf(boolean paramBoolean) {
    ZU = paramBoolean;
  }
  
  public static boolean ZQ() {
    return ZU;
  }
  
  public static boolean Zt() {
    boolean bool = ZQ();
    try {
      if (!bool)
        return true; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    return false;
  }
  
  private static NullPointerException a(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic Zf : (Z)V
    //   13: ldc 'Þs\Ò²#óÓ0Fïúm0ç©|_­gCP?èjÃqËÍrbÕWØ½Þ6±$ Úò\\b¸$lå?5¹núÇ6!­\\r\\rO*4h8É\\bð3_¼ýÆ1¡!zKÆ ²&Ú2è\\n_NMï\\n}¯Èfâ¡TÏh5îsÞ\\tÌ²zó»@ê©ñõÕÀí>9©~'RqÆyD×\\rÅ3)Á}¸/`ßsþ§'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #38
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #123
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
    //   72: ldc 'àA&åªî\\nîYPßfz-!ÃZÖÄf5Õ#ô6<j¨Çß²UõçÌ!5öî1CºêëÎ±±wá]¨y I~Ò6üÛ` tð:L øäRÈÉKÄòÁ/Þ%¡ï¦b¼âHUì&J Ä0\\nFá<'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #25
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #7
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
    //   133: putstatic org/yaml/Z_k.a : [Ljava/lang/String;
    //   136: bipush #8
    //   138: anewarray java/lang/String
    //   141: putstatic org/yaml/Z_k.b : [Ljava/lang/String;
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
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #71
    //   218: goto -> 248
    //   221: bipush #109
    //   223: goto -> 248
    //   226: bipush #49
    //   228: goto -> 248
    //   231: bipush #65
    //   233: goto -> 248
    //   236: bipush #41
    //   238: goto -> 248
    //   241: bipush #32
    //   243: goto -> 248
    //   246: bipush #30
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF39F) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Z_k.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */