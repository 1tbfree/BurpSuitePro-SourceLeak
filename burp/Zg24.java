package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;

public class Zg24 extends Zg2n {
  private final Zen Zd;
  
  private final Zbjl ZB;
  
  private final boolean Z_;
  
  private final Ztai Zw;
  
  private static Zbqc[] Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zg24(Zen paramZen, Zbjl paramZbjl, boolean paramBoolean, Ztai paramZtai) {
    super(a(23688, 7552), a(23684, -25137), paramZen, paramZbjl);
    this.Zd = paramZen;
    this.ZB = paramZbjl;
    this.Z_ = paramBoolean;
    this.Zw = paramZtai;
  }
  
  public void ZS(Zlvf paramZlvf, byte[] paramArrayOfbyte1, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList, Zbnt paramZbnt) {
    Zn(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList);
  }
  
  public void Zu(Zlvf paramZlvf, byte[] paramArrayOfbyte1, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    Zn(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList);
  }
  
  protected String ZP(String paramString) {
    Zbqc[] arrayOfZbqc = Zw();
    String str = "";
    if (this.Zw.ZS(Zzu2.SSI_INJECTION, Zr3z.SSI_ECHO_BASED) || this.Zw.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED))
      str = str + str; 
    if (this.Z_)
      str = a(23686, -8255) + a(23686, -8255); 
    boolean bool = ((this.Zw.ZS(Zzu2.SSI_INJECTION, Zr3z.COLLABORATOR_BASED) || this.Zw.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_DNS, Zr3z.COLLABORATOR_BASED) || this.Zw.ZS(Zzu2.EXTERNAL_SERVICE_INTERACTION_HTTP, Zr3z.COLLABORATOR_BASED)) && this.ZB.ZG() && !this.ZB.ZB().Zi()) ? true : false;
    if (bool)
      return str + str + a(23683, -21226) + this.ZB.ZB().Zq(this.Zd); 
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
    return str;
  }
  
  private void Zn(byte[] paramArrayOfbyte1, Zlvf paramZlvf, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    ZX(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList, this.Zw);
    if (this.Zw.ZS(Zzu2.SSI_INJECTION, Zr3z.SSI_ECHO_BASED)) {
      String str = Zszk.Zr(this.Zd);
      Ze9u ze9u = Zlep.Zx(paramZlvf, Zxar.ZK(Zkb.Zy(str)));
      if (ze9u != null)
        paramZz4_.Zz(Zrfz.Zw(paramZe3n.Za(), paramZe3n.ZN(), ze9u.ZG, paramArrayOfbyte2, Zkb.ZG(ze9u.Zj), paramList, Collections.singletonList(ze9u.Zo()), paramZxs7)); 
    } 
  }
  
  private String Zc(Zen paramZen) {
    String str1 = Zkvx.HTML_PAYLOAD_ID_ONE.ZY(paramZen.toString(), 3);
    String str2 = Zkvx.HTML_PAYLOAD_ID_TWO.ZY(paramZen.toString(), 3);
    String str3 = str2;
    String str4 = str1;
    String str5 = Zszk.ZU(paramZen);
    String str6 = str2;
    String str7 = Zszk.Zw(paramZen);
    String str8 = str1;
    return a(23682, 17730) + a(23682, 17730) + str8 + a(23691, 16253) + str7 + a(23687, -26199) + str6 + a(23689, 4496) + str5 + a(23681, 228) + str4 + a(23690, -29773) + str3;
  }
  
  public static Zsqx<Zrdb> Zi(Ze3n paramZe3n, Zxs7 paramZxs7, Zbll paramZbll) {
    Zbqc[] arrayOfZbqc = Zw();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7)).ZK(paramZbll.ZR);
    if (paramZbll.ZR != null) {
      String str = Zszk.Zr(paramZbll.Zk.ZF());
      Ze6l ze6l = Zxar.ZK(Zkb.Zy(str)).ZL(paramZbll.ZR, 0, paramZbll.ZR.length);
      if (ze6l != null) {
        zvow.Zf(Zrlp.Zj(ze6l.Zk, ze6l.ZR));
        return Zrfz.ZS(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZbll.ZP, paramZxs7, str, paramZbll.Zk.Zh());
      } 
    } 
    if (Zbqc.Zwu() == null)
      ZH(new Zbqc[2]); 
    return Zrfz.Zz(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZbll.ZP, paramZxs7, paramZbll.Zk.Zh());
  }
  
  public static void ZH(Zbqc[] paramArrayOfZbqc) {
    Zi = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zw() {
    return Zi;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'UdªMnÙrÐª¶-b!­8µÆ¾¬ê¥TðqÌ·íÖ¼·-3ÇPáRý:ñ\\faff!ËÛ¥ y1Äþ»í+$ë\\fìþ@7O-S\\rLÎÏýª´ªJ8þ2ÎÔd|{ÂËÆP¨×õÜ/-Áö3!º_Ú¸4BÚÑÕ\\tçP¹­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: anewarray burp/Zbqc
    //   22: bipush #14
    //   24: istore_1
    //   25: invokestatic ZH : ([Lburp/Zbqc;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #40
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc '6û|ÿó½\\t ¦%ÛCkÒÿe'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #9
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #70
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zg24.a : [Ljava/lang/String;
    //   139: bipush #12
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zg24.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #55
    //   222: goto -> 252
    //   225: bipush #20
    //   227: goto -> 252
    //   230: bipush #93
    //   232: goto -> 252
    //   235: bipush #70
    //   237: goto -> 252
    //   240: bipush #22
    //   242: goto -> 252
    //   245: bipush #110
    //   247: goto -> 252
    //   250: bipush #114
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5C82) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg24.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */