package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.portswigger.Zkb;

public class Zxna implements Zehc {
  private final Ze3n Zg;
  
  private final Zz_9 ZY;
  
  private final Zbnt ZK;
  
  private static String ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zxna(Ze3n paramZe3n, Zz_9 paramZz_9, Zbnt paramZbnt) {
    this.Zg = paramZe3n;
    String str = ZV();
    this.ZY = paramZz_9;
    this.ZK = paramZbnt;
    if (Zbqc.Zwu() == null)
      Zt("LF39Ib"); 
  }
  
  public Ztk8 Zb() {
    String str = ZV();
    Zgq<Zgpi> zgq = new Zgq<>();
    if (this.ZY.Zr(Zzu2.CLEARTEXT_SUBMISSION_OF_PASSWORD))
      zgq.ZM((Zsqx)ZC()); 
    if (this.ZY.Zr(Zzu2.BROWSER_XSS_FILTER_DISABLED))
      zgq.ZM((Zsqx)Zm()); 
    if (this.ZY.Zr(Zzu2.FRAMEABLE_RESPONSE_POTENTIAL_CLICKJACKING))
      zgq.ZM((Zsqx)Zo()); 
    if (str != null)
      Zbqc.Zr(new Zbqc[3]); 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableHeaders;
  }
  
  private Zsqx<Zrdb> ZC() {
    if (ZX()) {
      String str = this.Zg.ZL().ZY(a(-17862, 19672)).orElse(null);
      if (ZM(str))
        return Zrcm.Zy((byte)1, this.Zg.Za(), this.Zg.ZN(), ZF(a(-17864, -12258)), null, null); 
    } 
    return null;
  }
  
  private Zsqx<Zrdb> Zm() {
    String str = this.Zg.ZL().ZY(a(-17867, -22441)).orElse(null);
    return "0".equals(str) ? Zkqa.Zy(this.Zg.Za(), this.Zg.ZN(), ZF(a(-17870, -6005))) : null;
  }
  
  private Zsqx<Zrdb> Zo() {
    if (a(-17865, -23171).equalsIgnoreCase(this.Zg.ZA().Zr()) && (this.Zg.ZL().Ze() < 300 || this.Zg.ZL().Ze() >= 400) && (this.Zg.Zp()).ZH.Zj == 256) {
      Zs68 zs68 = this.Zg.Zp();
      List list = (List)((zs68 != null && zs68.Zd != null) ? Zx6a.Zf(this.Zg.ZA().ZF(), zs68, this.ZK) : Collections.emptyList());
      if (!list.isEmpty()) {
        String str = this.Zg.ZL().ZY(a(-17861, 32664)).orElse(null);
        if (Zj(str))
          return null; 
        int i = 0;
        if (str != null)
          i |= 0x2; 
        if (Zk(this.Zg.Zp()))
          i |= 0x1; 
        return Zton.Zc(this.Zg.Za(), this.Zg.ZN(), this.Zg.Zt(), i);
      } 
    } 
    return null;
  }
  
  private boolean Zj(String paramString) {
    return (a(-17860, -31683).equalsIgnoreCase(paramString) || a(-17866, -32379).equalsIgnoreCase(paramString));
  }
  
  private boolean Zk(Zs68 paramZs68) {
    String str = ZV();
    for (Ztu8 ztu8 : paramZs68.Zd) {
      switch (ztu8.ZlD()) {
        case 0:
        case 4:
          if (a(-17863, -25295).equalsIgnoreCase(ztu8.ZlP().ZJ3()) && ZB(ztu8.ZlP()))
            return true; 
          break;
        case 1:
          if (a(-17859, 2525).equalsIgnoreCase(ztu8.ZlP().ZJ3()))
            return false; 
          break;
      } 
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private boolean ZB(Zs_n paramZs_n) {
    Zs5n zs5n = paramZs_n.ZIm(a(-17857, 2599));
    return (zs5n != null && a(-17868, -27350).equalsIgnoreCase(zs5n.ZQG()));
  }
  
  private boolean ZX() {
    return (!this.Zg.ZA().ZT().ZJZ() && this.Zg.ZL().Ze() == 401);
  }
  
  private boolean ZM(String paramString) {
    return (paramString != null && paramString.trim().toLowerCase(Locale.ENGLISH).startsWith(a(-17858, -24096)));
  }
  
  private Zvow ZF(String paramString) {
    int i = Zlt_.Zf(this.Zg.ZL().Za(), Zkb.Zy("\n" + paramString), false) + 1;
    int j = Zlt_.ZT(this.Zg.ZL().Za(), (byte)10, i, this.Zg.ZL().Zs());
    ArrayList<Zl1r> arrayList = new ArrayList();
    arrayList.add(Zrlp.Zj(i, j));
    return this.Zg.Zt().Z_(arrayList);
  }
  
  public static void Zt(String paramString) {
    ZH = paramString;
  }
  
  public static String ZV() {
    return ZH;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '¶ü¬¹\\nV­Ñ(eIÄ² Ú§ÊóWÄ±5ÒU&`|ìáKLGÿä ùÏÙYÉÊÙ·â\\fB¬°ªªTÿ· Ó*°kNÒ\\n.0¿9¯çí¬z\\f.tÌ\\n¬l¿VjÐ¬ú{'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zt : (Ljava/lang/String;)V
    //   22: iconst_5
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #43
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
    //   71: ldc '\\fÕýÙd5í!oDÞgÕPã[é^9ÅF?½¦²Úêy'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #16
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #84
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
    //   132: putstatic burp/Zxna.a : [Ljava/lang/String;
    //   135: bipush #13
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zxna.b : [Ljava/lang/String;
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
    //   162: if_icmpgt -> 263
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 245, 0 -> 216, 1 -> 220, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: iconst_3
    //   217: goto -> 247
    //   220: bipush #11
    //   222: goto -> 247
    //   225: bipush #36
    //   227: goto -> 247
    //   230: bipush #56
    //   232: goto -> 247
    //   235: bipush #61
    //   237: goto -> 247
    //   240: bipush #50
    //   242: goto -> 247
    //   245: bipush #26
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 169
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 165
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBA3E) & 0xFFFF;
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
      char c = 'Ï';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxna.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */