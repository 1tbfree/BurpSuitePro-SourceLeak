package burp;

import net.portswigger.Zsy;

public class Zlzh {
  private final int ZP;
  
  private final Zsmb Zd;
  
  private final Zsy ZI;
  
  private final Zblf Zx;
  
  private final Zxs7 Zj;
  
  private final Zsjk ZB;
  
  private final Ztpk ZJ;
  
  private final boolean ZX;
  
  private static String[] ZA;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zlzh(Zsy paramZsy, Zblf paramZblf, Zsmb paramZsmb, Zxs7 paramZxs7, Ztpk paramZtpk, Zsjk paramZsjk, boolean paramBoolean) {
    this(paramZsy, paramZblf, paramZsmb, paramZxs7, paramZtpk, 0, paramZsjk, paramBoolean);
  }
  
  private Zlzh(Zsy paramZsy, Zblf paramZblf, Zsmb paramZsmb, Zxs7 paramZxs7, Ztpk paramZtpk, int paramInt, Zsjk paramZsjk, boolean paramBoolean) {
    this.ZP = paramInt;
    this.Zd = paramZsmb;
    this.ZI = paramZsy;
    this.Zx = paramZblf;
    this.Zj = paramZxs7;
    this.ZB = paramZsjk;
    this.ZJ = paramZtpk;
    this.ZX = paramBoolean;
  }
  
  public Zsov ZP(byte paramByte, String paramString, Zgk_ paramZgk_) {
    Zkcf zkcf = ZZ(paramString);
    String str = ZX(paramString, zkcf);
    return this.Zd.ZK(this.Zj, this.ZP, str, this.ZB, paramByte, this.ZJ, this.ZX, paramZgk_.Zn(zkcf).Zc(str));
  }
  
  private Zkcf ZZ(String paramString) {
    return new Zkcf(this, this.ZJ, this.ZI.Z_(5), this.ZI.Z_(5), this.ZI.Z_(8), this.ZI.Z_(10), Integer.toString(this.ZI.ZP().ZO(100).Zr(1000).Zc()), Integer.toString(this.ZI.ZP().ZO(10000).Zr(100000).Zc()), Integer.toString(this.ZI.ZP().ZO(10000000).Zr(100000000).Zc()), this.Zx.Zh(5), paramString);
  }
  
  static String ZX(String paramString, Zkcf paramZkcf) {
    paramString = paramString.replace("%", a(-30751, -31427));
    paramString = paramString.replace(a(-30741, -31334), a(-30752, -7566));
    paramString = paramString.replace(a(-30744, 22193), a(-30736, -18192));
    paramString = paramString.replace(a(-30746, -2237), a(-30739, -7302));
    paramString = paramString.replace(a(-30740, -16530), a(-30748, -27326));
    paramString = paramString.replace(a(-30747, 5869), a(-30734, -11198));
    String[] arrayOfString = Zj();
    paramString = paramString.replace(a(-30738, -3721), a(-30749, 6661));
    paramString = paramString.replace(a(-30737, 28268), a(-30745, -28761));
    paramString = paramString.replace(a(-30733, 14330), a(-30750, 1236));
    paramString = paramString.replace(a(-30742, 24478), a(-30743, 2611));
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[1]); 
    return String.format(paramString, new Object[] { paramZkcf.ZM, paramZkcf.ZH, paramZkcf.Zo, paramZkcf.ZQ, paramZkcf.ZL, paramZkcf.Zc, paramZkcf.Zp, paramZkcf.Zq, paramZkcf.ZX });
  }
  
  public Zlzh Zz(int paramInt) {
    return new Zlzh(this.ZI, this.Zx, this.Zd, this.Zj, this.ZJ, this.ZP | paramInt, this.ZB, this.ZX);
  }
  
  public Zlzh Zz() {
    return new Zlzh(this.ZI, this.Zx, this.Zd, this.Zj, this.ZJ, this.ZP, this.ZB, false);
  }
  
  public static void ZG(String[] paramArrayOfString) {
    ZA = paramArrayOfString;
  }
  
  public static String[] Zj() {
    return ZA;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc '-M*K\\f#ëQ½l&LAºFÙá@ÕÂÌeB#D²#Ùëwb5¯\\r»|¿"S?wZ5{Op2ííó`¶¢rþî@¹§_4 Ï~²5w»;Û=¥¸oôFÐÒ;4¹ç¥ÅÎM.ÁÚã¸×Y'ã`s^^3Wâ±b<zQYR#T{Qßí39\\tX;[-Zw:Vjü¯kê¶¾}rû×$3Tc:U%z²aÙb'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: iconst_4
    //   20: istore_1
    //   21: invokestatic ZG : ([Ljava/lang/String;)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #17
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
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
    //   71: ldc 'ê\ÍÇ*øPF¸jö ûÞß,\\tát:8s'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #26
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #15
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
    //   132: putstatic burp/Zlzh.b : [Ljava/lang/String;
    //   135: bipush #19
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zlzh.c : [Ljava/lang/String;
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
    //   162: if_icmpgt -> 262
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 244, 0 -> 216, 1 -> 221, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 239
    //   216: bipush #41
    //   218: goto -> 246
    //   221: iconst_4
    //   222: goto -> 246
    //   225: bipush #60
    //   227: goto -> 246
    //   230: bipush #29
    //   232: goto -> 246
    //   235: iconst_5
    //   236: goto -> 246
    //   239: bipush #18
    //   241: goto -> 246
    //   244: bipush #17
    //   246: ixor
    //   247: ixor
    //   248: i2c
    //   249: castore
    //   250: iinc #6, 1
    //   253: dup
    //   254: ifne -> 262
    //   257: dup2
    //   258: dup_x1
    //   259: goto -> 169
    //   262: dup2_x1
    //   263: pop2
    //   264: dup_x2
    //   265: iload #6
    //   267: if_icmpgt -> 165
    //   270: pop
    //   271: new java/lang/String
    //   274: dup_x1
    //   275: swap
    //   276: invokespecial <init> : ([C)V
    //   279: invokevirtual intern : ()Ljava/lang/String;
    //   282: swap
    //   283: pop
    //   284: swap
    //   285: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF87E2) & 0xFFFF;
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
      byte b1 = 41;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlzh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */