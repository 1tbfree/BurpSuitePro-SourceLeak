package burp;

import java.util.Collections;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;

public class Zg20 extends Zg2n {
  private final Ztai ZM;
  
  private final Zen Zn;
  
  private final Zbjl ZS;
  
  private static String ZO;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zg20(Zen paramZen, Zbjl paramZbjl, Ztai paramZtai) {
    super(a(-27467, -17502), a(-27464, 22971), paramZen, paramZbjl);
    this.Zn = paramZen;
    this.ZS = paramZbjl;
    this.ZM = paramZtai;
  }
  
  public void ZS(Zlvf paramZlvf, byte[] paramArrayOfbyte1, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList, Zbnt paramZbnt) {
    ZK(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList);
  }
  
  public void Zu(Zlvf paramZlvf, byte[] paramArrayOfbyte1, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    ZK(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList);
  }
  
  private void ZK(byte[] paramArrayOfbyte1, Zlvf paramZlvf, Zxs7 paramZxs7, Zz4_ paramZz4_, Ze3n paramZe3n, byte[] paramArrayOfbyte2, List<Zl1r> paramList) {
    ZX(paramArrayOfbyte1, paramZlvf, paramZxs7, paramZz4_, paramZe3n, paramArrayOfbyte2, paramList, this.ZM);
    if (!this.ZM.ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.PHP_ECHO_BASED))
      return; 
    String str = Zxau.ZH(this.Zn.toString());
    Ze9u ze9u = Zlep.Zx(paramZlvf, Zxar.ZK(Zkb.Zy(str)));
    if (ze9u != null)
      paramZz4_.Zz(Zsla.ZH(paramZe3n.Za(), paramZe3n.ZN(), ze9u.ZG, paramArrayOfbyte2, str, paramList, Collections.singletonList(ze9u.Zo()), paramZxs7)); 
  }
  
  protected String ZP(String paramString) {
    null = a(-27463, 22868);
    if (this.ZM.ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.PHP_ECHO_BASED) || this.ZM.Zr(Zzu2.INPUT_RETRIEVAL_REFLECTED)) {
      String str1 = this.Zn.toString();
      String str2 = Zxau.Zu(Zkvx.PHP_PAYLOAD_ONE, str1);
      String str3 = Zxau.Zu(Zkvx.PHP_PAYLOAD_TWO, str1);
      a(-27458, 10714);
      null = null + null + a(-27458, 10714) + str2 + a(-27459, -20600) + str3;
    } 
    if (this.ZS.ZG() && this.ZM.ZS(Zzu2.PHP_CODE_INJECTION, Zr3z.COLLABORATOR_BASED))
      null = null + null; 
    return null + null;
  }
  
  public static Zsqx<Zrdb> ZX(Zzi5 paramZzi5, Ze3n paramZe3n, Zxs7 paramZxs7, Zbll paramZbll) {
    String str = Zb();
    Zvow zvow = paramZe3n.ZI().Zp(paramZbll.Zk.Zu(paramZxs7).ZE()).ZK(paramZbll.Zk.Zn(paramZbll, paramZxs7)).ZK(paramZbll.ZR);
    if (paramZbll.ZR != null) {
      String str1 = Zxau.ZH(paramZbll.Zk.ZF().toString());
      Ze6l ze6l = Zxar.ZK(Zkb.Zy(str1)).ZL(paramZbll.ZR, 0, paramZbll.ZR.length);
      if (ze6l != null) {
        zvow.Zf(Zrlp.Zj(ze6l.Zk, ze6l.ZR));
        return Zsla.Zw(paramZe3n.Za(), paramZe3n.ZN(), zvow, paramZbll.ZP, paramZbll.Zk.Zh(), paramZzi5.Zi(), str1, paramZxs7);
      } 
    } 
    if (str == null)
      Zbqc.Zr(new Zbqc[3]); 
    return Zsla.Zh(paramZe3n.Za(), paramZe3n.ZN(), paramZzi5.Zi(), zvow, paramZbll.ZP, paramZbll.Zk.Zh(), paramZxs7);
  }
  
  private String ZA() {
    Zzi5 zzi5 = this.ZS.ZB();
    if (zzi5.Zi()) {
      a(-27465, 2557);
      return a(-27465, 2557) + a(-27465, 2557) + zzi5.ZJ() + a(-27461, -3163) + String.valueOf(this.Zn);
    } 
    String str = zzi5.Ze(".", "\"", this.Zn);
    return a(-27460, 2208) + a(-27460, 2208) + str;
  }
  
  public static void ZR(String paramString) {
    ZO = paramString;
  }
  
  public static String Zb() {
    return ZO;
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: ldc 'tNGbP'
    //   9: iconst_0
    //   10: istore_3
    //   11: ldc '«uDtÈ×«]ôÆ$\\tôÆYcrÏ0\\bô AêÑeîüä°pWLÞ²$\\fÕN»cô¾Ò,Å/È2ªÒ8ÁÑ§Ê\\b!S×½n)ùûº¾¡\\fêÏ¨=@xYMø.B,âMwm»ùäçY¦\\n¥¿|à\\n ª'
    //   13: dup
    //   14: astore_2
    //   15: invokevirtual length : ()I
    //   18: istore #4
    //   20: bipush #15
    //   22: istore_1
    //   23: iconst_m1
    //   24: istore_0
    //   25: invokestatic ZR : (Ljava/lang/String;)V
    //   28: bipush #47
    //   30: iinc #0, 1
    //   33: aload_2
    //   34: iload_0
    //   35: dup
    //   36: iload_1
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 147
    //   45: aload #5
    //   47: swap
    //   48: iload_3
    //   49: iinc #3, 1
    //   52: swap
    //   53: aastore
    //   54: iload_0
    //   55: iload_1
    //   56: iadd
    //   57: dup
    //   58: istore_0
    //   59: iload #4
    //   61: if_icmpge -> 73
    //   64: aload_2
    //   65: iload_0
    //   66: invokevirtual charAt : (I)C
    //   69: istore_1
    //   70: goto -> 28
    //   73: ldc 'ÔþZ\\bH¦â(·f½>'
    //   75: dup
    //   76: astore_2
    //   77: invokevirtual length : ()I
    //   80: istore #4
    //   82: iconst_3
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #84
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
    //   133: putstatic burp/Zg20.a : [Ljava/lang/String;
    //   136: bipush #12
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zg20.b : [Ljava/lang/String;
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
    //   216: bipush #113
    //   218: goto -> 248
    //   221: bipush #104
    //   223: goto -> 248
    //   226: bipush #109
    //   228: goto -> 248
    //   231: bipush #87
    //   233: goto -> 248
    //   236: bipush #40
    //   238: goto -> 248
    //   241: bipush #39
    //   243: goto -> 248
    //   246: bipush #127
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
    //   287: tableswitch default -> 45, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF94BC) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg20.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */