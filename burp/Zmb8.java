package burp;

import java.util.EnumSet;

public class Zmb8 extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmb8() {
    super(EnumSet.of(Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(a(10755, 13269));
    String[] arrayOfString = Zb1q.Zw();
    stringBuilder.append(Zg2x.ZM(paramZefg, true, true));
    stringBuilder.append(a(10757, 5465));
    Zrlp.Zn(stringBuilder, paramZtlj.ZJ(Ztz3.HEADER_NAME));
    stringBuilder.append(a(10760, 9022));
    Zrlp.Zn(stringBuilder, Zmey.ZW(paramZtub.Zd().Zub().Zsf().Zis()));
    stringBuilder.append(a(10752, -2984));
    stringBuilder.append(Zg2x.Zt(paramZefg, true, false));
    stringBuilder.append(a(10756, 25410));
    if ((paramInt & 0x1) == 1) {
      String str = Zmey.ZS(paramZefg) ? a(10759, 14859) : a(10763, 32566);
      stringBuilder.append(a(10766, 29940)).append(str).append(a(10767, -31671));
    } 
    if ((paramInt & 0x2) == 2)
      stringBuilder.append(a(10754, 16077)); 
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[5]); 
    return stringBuilder.toString();
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    StringBuilder stringBuilder = new StringBuilder();
    if ((paramInt & 0x1) == 1) {
      stringBuilder.append(a(10753, -20379));
      stringBuilder.append(Zg2x.ZM(paramZefg, true, false));
      if (Zmey.ZS(paramZefg))
        stringBuilder.append(a(10762, 26174)); 
      stringBuilder.append(a(10761, -19326));
    } 
    if ((paramInt & 0x2) == 2)
      stringBuilder.append(a(10758, -15326)); 
    String str = stringBuilder.toString();
    if ("".equals(str))
      str = null; 
    return str;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'LN6»*X2\\fÙm\\fr3¶$ÚF©$Ê[©½íY£É_ý!*-k¯¯úÑzÞu.Ð¶ôþã!5V×ÇÜDi¢é0.çÝ-ÀÜT±\\ró{=ÞugùKÚ6s^¾\\t£ÐéøYîÄJHò4R¼y¨oªeGFÖ yÄBÒÊ¢°Tûï$DÚÝ\ÛÁÞJn[â@\\rñ³BNÏ\\bXÒTËCâðÐ¦X<9^µ~öµd³ñ§Éº`ÁF­©®Úxæ\\t¯Ë(\\nª?C²:¤Ï@å\\tè.èi&TæŒkØ¨ÿ/ëØ!ÏØÖ2,0ó?åùÒ°Id8ÚyýwçÁåãe_^·PV 2>àÄSýZ9>T ×@W0.#õ%úH¾+8GÍA;øO\\bÝ2|ï¼¯µä­ßOßL¹·qÒøB©g!ïÑêæRv¶°µÒIþ@EoE§lÑç Ë´»}99ÚGÂKÞ¹À¹x}tzÐwûËºÎ«s/¾0zÒCEî¤!÷Hñ >ÚúØÄÞ5»kÑv:©OíG=òMPõVðVâ?ÄóËÇñôUø¦ië··*Ò{²Ì¢ e×oæ¦G©8ª\ÝAW]¦m0vm°ï±ÅÌ\\r?¡³~ïã±IA4£.Ï¹<ÂØÐì74U<ueââs`PÉ-{mX]ON|GÜáÞF2\\nÕ  `ßº<e fNYã_'¬ë{^ÔöTJý×w6.ATÄ½"r ËPC²UøÒ"¶ÚLh\\t¤a¢ÎGcjåÍH5}âHäñÓÂ;HJpkß"WßÀ\[Uö1âÎö õdpsÉ(Qó 5SQ2%ÿ­e -W¿´WW¤r\\nEÖ!]³Zs½ø,5¶ÕõFW'K¹Ká"lÃùåCK¹]*ðMñ\a\¢9ïõ"\\füÚJ\\fECZ-ç"ÂA®¡ûoLÀæ¯=¾|ð^£Ð0y¢RI¡î*0?EV|ðì\m¼5m$X1LÝ±øSMTÛr{®+OMä£^ÞíQOoEqOxñ!{Ôô-=¿÷¬ðÇ&ª?Ø'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #153
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #53
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc 'Ú»¡¸ef\\nîW`åë|ÙçÑMEæPÍ"&· »kpòs^\0 K'P0½APx¸Ý:ÌzÖ·ËÞæ(Fw"PßÚ=¤ÞMu1"øo)Ã²×ÂYõL@gÅSÕ¾_0<ÛJ¨«äE6v#à]¦õº{«ÿxþF6ão!¸:jÔ*Õzÿ5¦Þ+_½\\r³BÎs½Ëè_ÃÚ(W·\\r\\betòqám¼­oÉ0UMýLÇþTÅÊSY'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: sipush #184
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #98
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zmb8.a : [Ljava/lang/String;
    //   134: bipush #14
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zmb8.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 262
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 244, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 240
    //   216: bipush #84
    //   218: goto -> 246
    //   221: bipush #94
    //   223: goto -> 246
    //   226: bipush #23
    //   228: goto -> 246
    //   231: bipush #15
    //   233: goto -> 246
    //   236: iconst_3
    //   237: goto -> 246
    //   240: iconst_5
    //   241: goto -> 246
    //   244: bipush #21
    //   246: ixor
    //   247: ixor
    //   248: i2c
    //   249: castore
    //   250: iinc #6, 1
    //   253: dup
    //   254: ifne -> 262
    //   257: dup2
    //   258: dup_x1
    //   259: goto -> 168
    //   262: dup2_x1
    //   263: pop2
    //   264: dup_x2
    //   265: iload #6
    //   267: if_icmpgt -> 164
    //   270: pop
    //   271: new java/lang/String
    //   274: dup_x1
    //   275: swap
    //   276: invokespecial <init> : ([C)V
    //   279: invokevirtual intern : ()Ljava/lang/String;
    //   282: swap
    //   283: pop
    //   284: swap
    //   285: tableswitch default -> 41, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2A02) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmb8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */