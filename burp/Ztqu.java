package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;

public class Ztqu implements Zzwz {
  private final int Zq;
  
  private final int Zs;
  
  private final Zxs7 Zo;
  
  private final Zbjl Zj;
  
  private Zen ZX;
  
  private static String[] ZD;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Ztqu(Zxs7 paramZxs7, int paramInt1, int paramInt2, Zbjl paramZbjl) {
    this.Zq = paramInt1;
    this.Zs = paramInt2;
    this.Zo = paramZxs7;
    this.Zj = paramZbjl;
  }
  
  public List<Zewx> ZK() {
    ArrayList<Zewx> arrayList = new ArrayList();
    arrayList.add(ZV(a(-3935, 3658), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_JAVA_EL));
    arrayList.add(ZV(a(-3929, -22036), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_SPRING_HASH));
    arrayList.add(ZV(a(-3936, 15617), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_SPRING_DOLLAR));
    arrayList.add(ZV(a(-3933, 25943), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_FREEMARKER));
    arrayList.add(ZV(a(-3930, -1068), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_THYMELEAF));
    arrayList.add(ZV(a(-3932, -4858), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_VELOCITY));
    arrayList.add(ZV(a(-3931, -19874), Zlp9.SERVER_SIDE_TEMPLATE_INJECTION_OGNL));
    String[] arrayOfString = ZA();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
    return arrayList;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    return ZK().stream().filter(paramZlp9::lambda$buildIndividualPayload$0).findFirst().orElse(null);
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.ZX = paramZen;
    return Zt(paramZlp9);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return new Zkqy();
  }
  
  private Zewx ZV(String paramString, Zlp9 paramZlp9) {
    Zen zen = Zd(paramZlp9);
    Zzi5 zzi5 = this.Zj.ZB();
    String str = zzi5.ZU(zen);
    return new Zewx(zen, Zkb.Zy(String.format(paramString, new Object[] { str + "." })), paramZlp9, new Zmhr(zzi5.ZJ(), 80, false), (byte)0, Zewx.ZA);
  }
  
  private Zen Zd(Zlp9 paramZlp9) {
    return (this.ZX != null) ? this.ZX : this.Zj.ZK(1, (new Ztt6(this.Zq, this.Zs, paramZlp9, this.Zo.Zl())).toString());
  }
  
  private static boolean lambda$buildIndividualPayload$0(Zlp9 paramZlp9, Zewx paramZewx) {
    return (paramZlp9 == paramZewx.ZG());
  }
  
  public static void Zn(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] ZA() {
    return ZD;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_4
    //   8: anewarray java/lang/String
    //   11: iconst_0
    //   12: istore_3
    //   13: invokestatic Zn : ([Ljava/lang/String;)V
    //   16: ldc '2þ÷/tep\\tü®4ª4ñâm@èù¯õÄ+ØõKÉorþ­I(+HQ`okx¢mªÎs_îLl&%ÜÜ¢å7yþíàFÚ.:Q@\\bm¦Áµí`þùÙõüÑâ`ÐÅø_ÓKûÞ19JÎ/Î<q)Á¨²U¤ôpÓ1>ØØÓÕä>¢øæì1Ç{g-ë¤Î5R*ñùQR C÷Lêi«âQ^ý1B[àañw\\t¹n*/Ât!Z.K³ºpe@¦*)1ûeyÉÜý§SfóÍ3ÔúaîïHö)U»@Ýt<]/®ÄÌãkó KþþYØO©NÐ©Qlu$×è½ÄóL`i8(jDã"è÷1Ä>´a9pòä¾K¹Íú\\fGò°]lØYCñÛf"¢a]Y­oRå!V®LIs¬£7ÉÞûËc.jÉ§Á¾'pÕ&?rò"¹·.u{]7 ±8`\\n¸AÙî¥'
    //   18: dup
    //   19: astore_2
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: sipush #129
    //   28: istore_1
    //   29: iconst_m1
    //   30: istore_0
    //   31: bipush #81
    //   33: iinc #0, 1
    //   36: aload_2
    //   37: iload_0
    //   38: dup
    //   39: iload_1
    //   40: iadd
    //   41: invokevirtual substring : (II)Ljava/lang/String;
    //   44: iconst_m1
    //   45: goto -> 151
    //   48: aload #5
    //   50: swap
    //   51: iload_3
    //   52: iinc #3, 1
    //   55: swap
    //   56: aastore
    //   57: iload_0
    //   58: iload_1
    //   59: iadd
    //   60: dup
    //   61: istore_0
    //   62: iload #4
    //   64: if_icmpge -> 76
    //   67: aload_2
    //   68: iload_0
    //   69: invokevirtual charAt : (I)C
    //   72: istore_1
    //   73: goto -> 31
    //   76: ldc 'àÌäS÷õw9CïHN* ¿*£mãÄ+Ô%Ào6¾1,~y>íÔÍx°8¦]þÙ0+Üt±gàíl 1ËÕçØF8Zê7n}¬Ó%DãáÌ¹+¼1ö½?|ñxwÖõ¶\\r\\f§â¾5KÃrÈ8/Ãò/À×Â+PBé²h\\tR"}ÓÔë4ù'÷àë g#ã'
    //   78: dup
    //   79: astore_2
    //   80: invokevirtual length : ()I
    //   83: istore #4
    //   85: bipush #42
    //   87: istore_1
    //   88: iconst_m1
    //   89: istore_0
    //   90: bipush #87
    //   92: iinc #0, 1
    //   95: aload_2
    //   96: iload_0
    //   97: dup
    //   98: iload_1
    //   99: iadd
    //   100: invokevirtual substring : (II)Ljava/lang/String;
    //   103: iconst_0
    //   104: goto -> 151
    //   107: aload #5
    //   109: swap
    //   110: iload_3
    //   111: iinc #3, 1
    //   114: swap
    //   115: aastore
    //   116: iload_0
    //   117: iload_1
    //   118: iadd
    //   119: dup
    //   120: istore_0
    //   121: iload #4
    //   123: if_icmpge -> 135
    //   126: aload_2
    //   127: iload_0
    //   128: invokevirtual charAt : (I)C
    //   131: istore_1
    //   132: goto -> 90
    //   135: aload #5
    //   137: putstatic burp/Ztqu.b : [Ljava/lang/String;
    //   140: bipush #7
    //   142: anewarray java/lang/String
    //   145: putstatic burp/Ztqu.c : [Ljava/lang/String;
    //   148: goto -> 308
    //   151: dup_x2
    //   152: pop
    //   153: invokevirtual toCharArray : ()[C
    //   156: dup_x1
    //   157: arraylength
    //   158: dup_x2
    //   159: pop
    //   160: iconst_0
    //   161: istore #6
    //   163: dup2_x1
    //   164: pop2
    //   165: dup_x2
    //   166: iconst_1
    //   167: if_icmpgt -> 267
    //   170: dup2
    //   171: swap
    //   172: iload #6
    //   174: dup2_x1
    //   175: caload
    //   176: swap
    //   177: iload #6
    //   179: bipush #7
    //   181: irem
    //   182: tableswitch default -> 249, 0 -> 220, 1 -> 225, 2 -> 229, 3 -> 234, 4 -> 239, 5 -> 244
    //   220: bipush #58
    //   222: goto -> 251
    //   225: iconst_5
    //   226: goto -> 251
    //   229: bipush #14
    //   231: goto -> 251
    //   234: bipush #92
    //   236: goto -> 251
    //   239: bipush #24
    //   241: goto -> 251
    //   244: bipush #17
    //   246: goto -> 251
    //   249: bipush #112
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 174
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 170
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 48, 0 -> 107
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF0A5) & 0xFFFF;
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
      char c = 'À';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztqu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */