package burp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zlyy {
  private static int[] Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zsqx<Zrdb> Zo(Zmzk paramZmzk, String paramString1, Zvow paramZvow, Zxs7 paramZxs7, String paramString2, String paramString3) {
    return new Zx_5(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, (byte)0, 0, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.IN_BAND_ENTITY_NAME, paramString2) }), Collections.singletonList(new Zt2w(new Zz25(Zkb.Zy(paramString3), 0), paramZvow)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Zf(Zmzk paramZmzk, String paramString1, Zvow paramZvow, Zxs7 paramZxs7, String paramString2, String paramString3, int paramInt, List<Zsjh<?>> paramList) {
    int[] arrayOfInt = Zu();
    if (Zbqc.Zwu() == null)
      ZE(new int[1]); 
    return new Zx_5(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, (byte)0, paramInt, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.OUT_BAND_ENTITY_NAME, paramString2) }), Collections.singletonList(new Zt69(new Zz25(Zkb.Zy(paramString3), 0), paramZvow, paramList)), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  public static Zsqx<Zrdb> Ze(Zmzk paramZmzk, String paramString1, Zvow paramZvow1, Zvow paramZvow2, Zxs7 paramZxs7, String paramString2, String paramString3, String paramString4, String paramString5, List<Zsjh<?>> paramList) {
    int[] arrayOfInt = Zu();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
    return new Zx_5(Zzu2.XML_EXTERNAL_ENTITY_INJECTION, (byte)0, 4, Zriz.ZO(new Zra_[] { Zriz.ZG(Ztz3.IN_BAND_ENTITY_NAME, paramString2), Zriz.ZG(Ztz3.OUT_BAND_ENTITY_NAME, paramString4) }), Arrays.asList((Zlfv<? extends Zgkc>[])new Zlfv[] { new Zt2w(new Zz25(Zkb.Zy(paramString3), 0), paramZvow1), new Zt69(new Zz25(Zkb.Zy(paramString5), 0), paramZvow2, paramList) }), (byte)2, (byte)4, paramZmzk, Zkb.Zy(paramString1), paramZxs7);
  }
  
  private static StringBuilder Zv(Zefg<Zxtl> paramZefg) {
    int[] arrayOfInt = Zu();
    StringBuilder stringBuilder = new StringBuilder();
    if (paramZefg.isEmpty()) {
      Zuh.Zb(false, Zqf.Zr);
      return stringBuilder;
    } 
    stringBuilder.append(a(-10387, -26585));
    if (((Zxtl)paramZefg.get(0)).ZTr() == Zs66.ENTIRE_BODY) {
      stringBuilder.append(a(-10386, 6873));
      if (arrayOfInt == null) {
        stringBuilder.append(Zg2x.Zt(paramZefg, true, true));
        stringBuilder.append(a(-10400, -29548));
        return stringBuilder;
      } 
      stringBuilder.append(a(-10400, -29548));
      return stringBuilder;
    } 
    stringBuilder.append(Zg2x.Zt(paramZefg, true, true));
    stringBuilder.append(a(-10400, -29548));
    return stringBuilder;
  }
  
  private static String Zd(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    Zrlp.Zn(stringBuilder, Zmey.ZW(paramString2));
    stringBuilder.append(a(-10392, -28649));
    Zrlp.Zn(stringBuilder, Zmey.ZW(paramString1));
    stringBuilder.append(a(-10388, -11342));
    return stringBuilder.toString();
  }
  
  private static String Zk(int paramInt1, String paramString1, String paramString2, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    if ((paramInt2 & 0x1) == 1)
      stringBuilder.append(a(-10391, -4986)); 
    Zrlp.Zn(stringBuilder, Zmey.ZW(paramString2));
    stringBuilder.append(a(-10385, -31273));
    Zrlp.Zn(stringBuilder, Zmey.ZW(paramString1));
    stringBuilder.append(a(-10389, 28336));
    if ((paramInt1 & 0x4) == 4)
      stringBuilder.append(a(-10390, 12885)); 
    return stringBuilder.toString();
  }
  
  public static void ZE(int[] paramArrayOfint) {
    Zf = paramArrayOfint;
  }
  
  public static int[] Zu() {
    return Zf;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_3
    //   8: newarray int
    //   10: iconst_0
    //   11: istore_3
    //   12: invokestatic ZE : ([I)V
    //   15: ldc 'Ë¥ðü¡æØZ,#r¬eë î§5ÅÌB¯>/\\fâÃÝ¤\Á,ø²ÿ¢<6?³FG9ÏÏÃzhæ}nP`5¡\\tyWEáhh´táw0bðJ{B¼?."øjÈ _®¶õëõÍË?My ? umPt~ÕÉh9¹gEî(\\fFB-XugÃ[jrûbÉùL J7b; Y0ë÷@ÂÕfMð\õA­Þî\\nÇÍÖn0ú²(&¯æ¥·°#êÛ\Ï¨À§$@Û@ä?¾§àØª2.eîqKkºvÎASDD" ©dmÚm¡Á£ÇÄ?£ÊJKQ8C!!gâ=H<ó¤þö¦0öÙZ@v¡ü¢þÄÛM£{á?ÿ%õ.Ç2Åe×ýI¦\\r*d¡wBç¦)Í-ïd}\\r\\nî§Ñ÷VÕeÍv3y8µÜ£Ò ¬wßö0y¨'§¶ÕJÃ/÷/>Ç>ù;v"x±]Ô¨cÃX¸'¸1Å\\r­7ÔvTäqg.Ćß(rA¦ÊÇÀàIuÓä¿Z&__È¢{-ÙºEÿÈæÿ¬?¹h#T(%OÂUJùòXý»·Wbi_óãgBÉgÞÏ|ûM ûö2¬ÈB~Üçä\\nt7 AyTÜý_` ·ëåçÓMr<Ä£æ 8ÄÅ2+£Mk¿%Â.)ù,·Ë¹áï|õDoÖhÆ.\\tÛÜØ6Mfû.|Nçîc^ü}xü´øjÊÒzdøAo~üvâi)ÒöõÄÛ¸_>3·o¬K¯â±z¶Íç`UXð)¼s0®RlÑj\Á}éû÷âdB@kg<_Ïr'
    //   17: dup
    //   18: astore_2
    //   19: invokevirtual length : ()I
    //   22: istore #4
    //   24: bipush #91
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #118
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 149
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '¢¸OÍõiß"©I§4sàíÓ£´ÝÂI(zðl|ªkìï­?`ÿÊï*Ù\¨VôUÜÈ»ÿ3U±0þ\AÊ;­æíÞC¼«éYÔ¸.&hª»G«<ÛÈWe¢©Ùº³ýÆÂ­JNøùÝÆ.âJmSÕ©¬©üÜ\\f/°D1á\£õÅ£5}^uNî\\t¿3wÝÓ&'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: bipush #91
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #30
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zlyy.a : [Ljava/lang/String;
    //   138: bipush #9
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zlyy.b : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #79
    //   222: goto -> 252
    //   225: bipush #29
    //   227: goto -> 252
    //   230: bipush #79
    //   232: goto -> 252
    //   235: bipush #102
    //   237: goto -> 252
    //   240: bipush #23
    //   242: goto -> 252
    //   245: bipush #69
    //   247: goto -> 252
    //   250: bipush #102
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 46, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD768) & 0xFFFF;
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
      byte b1 = 45;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlyy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */