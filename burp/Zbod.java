package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;

public class Zbod implements Zzwz {
  private static final String[] ZZ;
  
  private final Ze3n Zk;
  
  private final Zbjl Zd;
  
  private final Zt8g Zz;
  
  private final int Zt;
  
  private Zen Zw;
  
  private static int[] Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbod(Ze3n paramZe3n, Zbjl paramZbjl, Zt8g paramZt8g, int paramInt) {
    this.Zk = paramZe3n;
    this.Zd = paramZbjl;
    this.Zz = paramZt8g;
    this.Zt = paramInt;
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    Zen zen = ZA();
    Zzi5 zzi5 = this.Zd.ZB();
    String str = zzi5.Zq(zen);
    int[] arrayOfInt = ZZ();
    if (Zbqc.Zwu() == null)
      ZQ(new int[4]); 
    return new Zew3(Zkb.Zy(str), zen, Zlp9.HOST_OVERRIDE_PAYLOAD, Zm4p.Zz(Zf(zen, zzi5), this.Zz), zzi5.Zi(), Zw(zen, zzi5), this.Zk, ZZ);
  }
  
  private Zmhr Zw(Zen paramZen, Zzi5 paramZzi5) {
    Zmzk zmzk = this.Zk.Za();
    boolean bool = zmzk.ZJZ() ? true : true;
    return new Zmhr(paramZzi5.ZU(paramZen), bool, zmzk.ZJZ());
  }
  
  public List<Zewx> ZK() {
    return Collections.singletonList(Zt(Zlp9.NONE));
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.Zw = paramZen;
    return Zt(paramZlp9);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    return new Zmit();
  }
  
  public List<String> Zf(Zen paramZen, Zzi5 paramZzi5) {
    int[] arrayOfInt = ZZ();
    String str = paramZzi5.Zq(paramZen);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[4]); 
    return Arrays.asList(new String[] { String.format(a(24474, -1093), new Object[] { str }), String.format(a(24478, -2831), new Object[] { str }), String.format(a(24477, -5726), new Object[] { str }) });
  }
  
  private Zen ZA() {
    if (this.Zw != null)
      return this.Zw; 
    Ztt6 ztt6 = new Ztt6(this.Zt, this.Zk.ZM().Zgv(), Zlp9.HOST_OVERRIDE_PAYLOAD, Zro0.Zgd(a(24476, 25232)));
    return this.Zd.ZK(1, ztt6.toString());
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZQ : ([I)V
    //   13: ldc '÷L¡Ê³!ÜóVçÝÖ\\bº.«¨z­2äX­ÍõbÔÀWÃBèFBÏ\\tÙ(h; ?×ôrn '
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: bipush #18
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #82
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
    //   72: ldc 'Tþ·è¢Øþºa I<ÖÙ\\nÆÒ;gañÊö'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #22
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #45
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
    //   133: putstatic burp/Zbod.a : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zbod.b : [Ljava/lang/String;
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
    //   216: bipush #35
    //   218: goto -> 248
    //   221: bipush #65
    //   223: goto -> 248
    //   226: bipush #20
    //   228: goto -> 248
    //   231: bipush #122
    //   233: goto -> 248
    //   236: bipush #62
    //   238: goto -> 248
    //   241: bipush #44
    //   243: goto -> 248
    //   246: bipush #82
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
    //   304: iconst_3
    //   305: anewarray java/lang/String
    //   308: dup
    //   309: iconst_0
    //   310: sipush #24472
    //   313: sipush #-17817
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: sipush #24473
    //   325: sipush #-32759
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: aastore
    //   332: dup
    //   333: iconst_2
    //   334: sipush #24475
    //   337: sipush #4776
    //   340: invokestatic a : (II)Ljava/lang/String;
    //   343: aastore
    //   344: putstatic burp/Zbod.ZZ : [Ljava/lang/String;
    //   347: return
  }
  
  public static void ZQ(int[] paramArrayOfint) {
    Zl = paramArrayOfint;
  }
  
  public static int[] ZZ() {
    return Zl;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5F98) & 0xFFFF;
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
      byte b1 = 52;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbod.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */