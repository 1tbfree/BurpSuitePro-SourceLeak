package burp;

import java.io.File;
import java.io.OutputStream;
import java.lang.reflect.Method;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zmdy {
  private final Zz0n ZT;
  
  private final Zee5 Zy;
  
  private final Zskh Zr;
  
  private final Zbnt ZL;
  
  private final Ztg4 Zh;
  
  private final Ztwv Zg;
  
  private final Zrn7 ZI;
  
  private final Zteh Zd;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmdy(Zz0n paramZz0n, Zee5 paramZee5, Zskh paramZskh, Zbnt paramZbnt, Ztg4 paramZtg4, Ztwv paramZtwv, Zrn7 paramZrn7, Zteh paramZteh) {
    this.ZT = paramZz0n;
    this.Zy = paramZee5;
    this.Zr = paramZskh;
    this.ZL = paramZbnt;
    this.Zh = paramZtg4;
    this.Zg = paramZtwv;
    this.ZI = paramZrn7;
    this.Zd = paramZteh;
  }
  
  Zlz3 Zd(Zeu1 paramZeu1, Zxr1 paramZxr1, Ztx8 paramZtx8) throws Exception {
    Class<?> clazz1;
    String[] arrayOfString = Ztw3.ZI();
    try {
      if (!this.ZI.ZM())
        throw new Exception(a(30814, -10944)); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    File file = this.ZT.ZM().Zg(this.ZI.ZG());
    try {
      if (!file.exists())
        throw new Exception(a(30799, -28953)); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    Zt05 zt05 = new Zt05(this.Zd.Zv(file, paramZeu1));
    try {
      clazz1 = Class.forName(a(30805, -31942), true, zt05);
    } catch (ClassNotFoundException classNotFoundException) {
      Zah.Zl(classNotFoundException, Zk_.USER_ERROR);
      throw new Exception(a(30809, -18970));
    } 
    Object object = clazz1.getConstructor(new Class[0]).newInstance(new Object[0]);
    Method method1 = clazz1.getMethod(a(30791, -28001), new Class[] { OutputStream.class });
    method1.invoke(object, new Object[] { paramZeu1.ZU() });
    Method method2 = clazz1.getMethod(a(30789, -15516), new Class[] { OutputStream.class });
    method2.invoke(object, new Object[] { paramZeu1.ZJ() });
    Method method3 = clazz1.getMethod(a(30807, 26674), new Class[] { String.class });
    method3.invoke(object, new Object[] { a(30788, -30995) });
    method3.invoke(object, new Object[] { a(30815, -3296) });
    String str1 = paramZeu1.Zj(this.Zy);
    String str2 = this.ZT.ZM().Zg(str1).getParent().replace("\\", a(30796, -13599)).replace("'", a(30810, 11191));
    method3.invoke(object, new Object[] { a(30813, -28201) + a(30813, -28201) + str2 });
    method3.invoke(object, new Object[] { a(30800, -12679) + a(30800, -12679) + str2 });
    if (paramZeu1.ZR()) {
      File file1 = this.Zy.ZI(paramZeu1.ZE());
      File file2 = this.ZT.ZM().Zh(file1, a(30806, 30698));
      try {
        if (file2.isDirectory())
          method3.invoke(object, new Object[] { a(30811, -24066) + a(30811, -24066) + file2.getAbsolutePath().replace("\\", a(30787, 24479)) }); 
      } catch (ClassNotFoundException classNotFoundException) {
        throw a(null);
      } 
    } 
    String str3 = this.ZI.ZW();
    try {
      if (!str3.isEmpty())
        method3.invoke(object, new Object[] { a(30811, -24066) + a(30811, -24066) + str3.replace("\\", a(30787, 24479)) }); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    clazz1.getMethod(a(30812, 18059), new Class[] { String.class }).invoke(object, new Object[] { str1 });
    method3.invoke(object, new Object[] { a(30784, -8389) });
    Method method4 = clazz1.getMethod(a(30790, 30601), new Class[] { String.class });
    Object object1 = method4.invoke(object, new Object[] { a(30804, -20592) });
    Class<?> clazz2 = Class.forName(a(30798, 16738), true, zt05);
    Method method5 = clazz2.getMethod(a(30803, 15422), new Class[] { Class.class });
    Boolean bool = (Boolean)method5.invoke(object1, new Object[] { Boolean.class });
    try {
      if (!bool.booleanValue())
        throw new Exception(a(30808, -13210)); 
    } catch (ClassNotFoundException classNotFoundException) {
      throw a(null);
    } 
    object1 = method4.invoke(object, new Object[] { a(30785, -32098) });
    Method method6 = clazz2.getMethod(a(30802, -11104), new Class[0]);
    object1 = method6.invoke(object1, new Object[0]);
    IBurpExtender iBurpExtender = (IBurpExtender)method5.invoke(object1, new Object[] { IBurpExtender.class });
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zlzi(this.ZT, paramZeu1, this.Zy, this.Zr, this.ZL, this.Zh, this.Zg, this.ZI, paramZxr1, iBurpExtender, paramZtx8, zt05);
  }
  
  private static ClassNotFoundException a(ClassNotFoundException paramClassNotFoundException) {
    return paramClassNotFoundException;
  }
  
  static {
    // Byte code:
    //   0: bipush #27
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '<ã-°äý£Ñt0òã"å7¶\\rfXºU8T&Ðh]ºï%).ÝCììÀ33!*pPõÇn#²RÍØ5ªfÀÑýü¡B²Ð\\b©Ç{4\\nU0º,Çð\\n¿3¡Ø½v«rh!ÙNDfü¼a'Ç"_~ìÛL¥\\b\\fZR;qKë1Kg´ýGÄs\\b]*¢:I\\t¯W«æv"\\bNûµ£Sm\\nÜbfön\\tàL7ûXöfÂpEa|F²Eð=.¸DAaÖãOáýÂX5è21:lÖÿì´Ñò»xÕ\\nEM¿bàiÑCÈ|ÏÀ¥­-1³<ÊÚÌª¢ÈeÀjaB],ª64WVËÙ&4ùt%ÞñØ³ÄH´éç§=2¹IA°lò?0`zÇþÿ¬ifÊ½*¤d¿¬Ø×·Cçt\\nbwâ"öõ8 !µË;piâA`Ûsð?æAuÆâÚG¥Éîf:õÊñ¡¸có/\\rÎ&-©dq\á¤»¿@mFýRì;Ð×Ðã(¤rs~h8°åkö{½MÑL\\niàx´Ëüö«\\fwFº±ÇÒ\\f'¶~ÖïV|Ì¡Bi?Ú8òN=ÜáÓÃ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'Wºä¾ýö"wÇ°ïþkmjÉQR¦Ó¤«V²ië§'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #30
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #81
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zmdy.a : [Ljava/lang/String;
    //   131: bipush #27
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmdy.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #21
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #125
    //   229: goto -> 244
    //   232: bipush #68
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #124
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7856) & 0xFFFF;
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
      byte b1 = 70;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmdy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */