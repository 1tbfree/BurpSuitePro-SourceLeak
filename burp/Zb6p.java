package burp;

import java.util.List;

public class Zb6p implements Zrzt<Zzh2, Zkvy> {
  private final Zm6x ZF;
  
  private final Zze3<Zzh2> Zv;
  
  private final Zbp5 ZS;
  
  private final Zm6v Zw;
  
  private final Zgb6 ZZ;
  
  private final Zg9z ZO;
  
  private final Zkvy Zz;
  
  private final Zm51 ZJ;
  
  private final Zl6k ZW;
  
  private final Zbqa Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb6p(Zze3<Zzh2> paramZze3, Zbp5 paramZbp5, Zm6v paramZm6v, Zgb6 paramZgb6, Zg9z paramZg9z, Zkvy paramZkvy, Zm51 paramZm51, Zl6k paramZl6k, Zbqa paramZbqa, Zm6x paramZm6x) {
    this.Zv = paramZze3;
    this.ZS = paramZbp5;
    this.Zw = paramZm6v;
    this.ZZ = paramZgb6;
    this.ZO = paramZg9z;
    this.Zz = paramZkvy;
    this.ZJ = paramZm51;
    this.ZW = paramZl6k;
    this.Zc = paramZbqa;
    this.ZF = paramZm6x;
  }
  
  public int Z_() {
    return Zq().Zf().indexOf(Zg2y.Zi);
  }
  
  public Zmjx<Zzh2> Zq() {
    return new Zg2y(this.ZS);
  }
  
  public Zsh3<Zzh2> Zu(Zzp8<Zzh2> paramZzp8, Zerg paramZerg, Zz28 paramZz28, Zbiv paramZbiv, Zbnt paramZbnt, Zkl6 paramZkl6) {
    return new Zmtj(paramZzp8, this.Zv, paramZbnt, paramZkl6, paramZerg, this.ZS, this.ZF);
  }
  
  public Zecu<Zzh2> ZR(Zz0n paramZz0n, Zerg paramZerg, Zgb6 paramZgb6, Zskh paramZskh, Zbnt paramZbnt, Ztwv paramZtwv, Ztyg paramZtyg, Zgq7 paramZgq7, Zey9 paramZey9, boolean paramBoolean) {
    return new Zb5l(paramZz0n, paramZerg, paramZgb6, paramZskh, paramZbnt, paramZtwv, paramZtyg, paramZgq7, this.Zv, this.ZS, paramBoolean, this.ZF);
  }
  
  public Zspx<Zzh2> ZT(Zsii<Zzh2> paramZsii, Zzit<Zzh2, Zkvy> paramZzit, Zg0a<Zzh2> paramZg0a, Ztwv paramZtwv, Zm2j paramZm2j) {
    Ztm_ ztm_ = new Ztm_(a(-26983, -22835), Zzca.SETTINGS, Zk97.DESKTOP_TOOLS_PROXY_HISTORY_WEBSOCKET_HISTORY_DISPLAY_FILTER, paramZzit, new String[] { a(-26984, -2506) });
    Ztd8 ztd8 = ZY();
    this.Zz.Zm(ztd8);
    this.Zz.Zf(ztd8);
    Zbqc[] arrayOfZbqc = Zb5z.Zp6();
    Ztun ztun = ZU(ztd8, ztm_);
    Zspx<Zzh2> zspx = new Zspx<>(paramZsii, paramZg0a, ztun, paramZm2j);
    while (this.ZW.ZR()) {
      Zsij zsij = this.ZW.ZE();
      zspx.Zn(zsij);
      ztd8.Zn(zsij);
      if (arrayOfZbqc == null)
        break; 
    } 
    zspx.ZR().setName(a(-26990, -4338));
    return zspx;
  }
  
  private Ztd8 ZY() {
    Zg98 zg98 = new Zg98(Zxcu.Zh, a(-26985, -14531), a(-26992, 3955), a(-26988, -29724), a(-26987, -27635), Zrrh.PROXY_WEB_SOCKET_HISTORY_BAMBDA_HELP_SECTION_EXPANDED, Zec3.PROXY_WEB_SOCKET_HISTORY_FILTER_BAMBDA_HASH, Zze0.PROXY_WEB_SOCKET_HISTORY_FILTER_BAMBDA_APPLIED, Zrrh.PROXY_WEB_SOCKET_HISTORY_JAVADOC_LINK_CLICKED);
    Zbqr zbqr = new Zbqr(zg98, this.ZZ, this.ZO, this.ZF);
    Ztd8 ztd8 = new Ztd8(zbqr, zg98, this.ZJ, this.Zz, this.Zw);
    ztd8.Za4();
    return ztd8;
  }
  
  private Ztun ZU(Ztd8 paramZtd8, Ztm_ paramZtm_) {
    Ztm_ ztm_ = new Ztm_(a(-26986, -1200), Zzca.BAMBDA, Zk97.BAMBDAS_WEBSOCKET_HISTORY, paramZtd8, new String[] { a(-26982, 3606) });
    return new Zglg(this.Zc, this.Zz, paramZtd8, List.of(paramZtm_, ztm_), Zk97.BAMBDAS_WEBSOCKET_HISTORY_CONVERT_TO_BAMBDA);
  }
  
  public Zbqc Zm(Zerg paramZerg, Zx8n paramZx8n) {
    return Zltn.ZK(Zgzq.PROXY_HISTORY_EMPTY_PANEL_ICON, a(-26981, 21697)).Za(a(-26989, -15038)).ZN(Zlar.PROXY_WEBSOCKETS_HISTORY_LEARN_MORE_INFO).ZN(new Zxtg(paramZerg, paramZx8n)).Zi();
  }
  
  public String ZI() {
    return a(-26991, -23726);
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÆL%bÚÞ'«U«]H}T«PnÑåpQ®v&<4³¤ª6)'Aì¼Õ\\n«´7CõðÄ{Ðà&¿hô(ÊØæ¾9ÿE eåç£Âã½ó¡Ò%QKd=?¤XBÊý\\foS¿Å[w¨{06pDÞfFÕ4Ák|;ÁM¼jbüëêÿØ~ßÈÁr6e\\tU<îEÉx\\feýûKÂ¨Ð¡J:¢Wwõa`rÑz-ì_mÃä¦úó/Ã ´¯9TGóª[^>×'ôó,_ªqÖ ?íx[Ò{[u¥\\tà(S|hÄËP^{Â½>ÿ½~ *S¢Ç¡Äî õ¦ËNÙñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #29
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_5
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 143
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 23
    //   67: ldc '@oî$&üå!×ËÏÅºkè?mØ?V¹½/ö·Õ'ßô 4PnM­Þrv= Áµæj"v­\æàô¦8!KÁ8ídú6ÛÇß\\tRËAï.mHÛ?­ï`;Ù±#©óøoÜ»+7|!«½³Pãx>°|4è=@ÌHÁb½;AQEûßZØ^*^wËº\\nF1þ[Ù¸[N GíÇ(Xb\`\\tÈõ·^WÓ)ÉÍ0tõº 1ôÕ¼Zÿ÷×Vx¢wGùþ¾mÍ3º ~\\n'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: sipush #201
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #118
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zb6p.a : [Ljava/lang/String;
    //   132: bipush #12
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb6p.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 258
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #77
    //   214: goto -> 242
    //   217: bipush #82
    //   219: goto -> 242
    //   222: bipush #11
    //   224: goto -> 242
    //   227: iconst_2
    //   228: goto -> 242
    //   231: bipush #116
    //   233: goto -> 242
    //   236: bipush #122
    //   238: goto -> 242
    //   241: iconst_3
    //   242: ixor
    //   243: ixor
    //   244: i2c
    //   245: castore
    //   246: iinc #6, 1
    //   249: dup
    //   250: ifne -> 258
    //   253: dup2
    //   254: dup_x1
    //   255: goto -> 166
    //   258: dup2_x1
    //   259: pop2
    //   260: dup_x2
    //   261: iload #6
    //   263: if_icmpgt -> 162
    //   266: pop
    //   267: new java/lang/String
    //   270: dup_x1
    //   271: swap
    //   272: invokespecial <init> : ([C)V
    //   275: invokevirtual intern : ()Ljava/lang/String;
    //   278: swap
    //   279: pop
    //   280: swap
    //   281: tableswitch default -> 39, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9691) & 0xFFFF;
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
      char c = '¾';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb6p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */