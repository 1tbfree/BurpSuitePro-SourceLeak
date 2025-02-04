package com.fasterxml;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zj.Zq;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Zq1 extends Zq2<LocalDate> {
  private static final long serialVersionUID = 1L;
  
  private static final DateTimeFormatter ZU;
  
  public static final Zq1 Zm;
  
  private static final String[] h;
  
  private static final String[] i;
  
  protected Zq1() {
    this(ZU);
  }
  
  public Zq1(DateTimeFormatter paramDateTimeFormatter) {
    super(LocalDate.class, paramDateTimeFormatter);
  }
  
  public Zq1(Zq1 paramZq1, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZq1, paramDateTimeFormatter);
  }
  
  protected Zq1(Zq1 paramZq1, Boolean paramBoolean) {
    super(paramZq1, paramBoolean);
  }
  
  protected Zq1(Zq1 paramZq1, Zqi paramZqi) {
    super(paramZq1, paramZqi);
  }
  
  protected Zq1 ZW(DateTimeFormatter paramDateTimeFormatter) {
    return new Zq1(this, paramDateTimeFormatter);
  }
  
  protected Zq1 ZR(Boolean paramBoolean) {
    return new Zq1(this, paramBoolean);
  }
  
  protected Zq1 Zr(Zqi paramZqi) {
    return new Zq1(this, paramZqi);
  }
  
  public LocalDate ZA(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_STRING))
        return Zc(paramZg, paramZyg, paramZg.ZR()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.Zp())
        return Zc(paramZg, paramZyg, paramZyg.Zc(paramZg, (Zyo)this, ZX())); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (paramZg.Zs()) {
      Zl zl = paramZg.ZV();
      try {
        if (zl == Zl.END_ARRAY)
          return null; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (paramZyg.Zg(Zyp.UNWRAP_SINGLE_VALUE_ARRAYS))
          try {
            if (zl == Zl.VALUE_STRING || zl == Zl.VALUE_EMBEDDED_OBJECT) {
              LocalDate localDate = ZA(paramZg, paramZyg);
              try {
                if (paramZg.ZV() != Zl.END_ARRAY)
                  ZH(paramZg, paramZyg); 
              } catch (IOException iOException) {
                throw a(null);
              } 
              return localDate;
            } 
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      if (zl == Zl.VALUE_NUMBER_INT) {
        int i = paramZg.Ze();
        int j = paramZg.Zq(-1);
        int k = paramZg.Zq(-1);
        try {
          if (paramZg.ZV() != Zl.END_ARRAY)
            throw paramZyg.Zq(paramZg, ZX(), Zl.END_ARRAY, d(8076, -10045)); 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return LocalDate.of(i, j, k);
      } 
      paramZyg.ZF(ZX(), d(8078, 21864), new Object[] { zl });
    } 
    try {
      if (paramZg.ZL(Zl.VALUE_EMBEDDED_OBJECT))
        return (LocalDate)paramZg.ZO(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (paramZg.ZL(Zl.VALUE_NUMBER_INT)) {
      Zx zx = paramZyg.ZT(Zb(), this.ZC, Zq.Integer);
      try {
        ZY(paramZyg, zx, ZX(), Long.valueOf(paramZg.ZE()), d(8073, 21402) + paramZg.ZE() + ")");
        if (this.Zw != Zqi.NUMBER_INT)
          try {
            return !ZK() ? Zn(paramZg, paramZyg, Zl.VALUE_STRING) : LocalDate.ofEpochDay(paramZg.ZE());
          } catch (IOException iOException) {
            throw a(null);
          }  
      } catch (IOException iOException) {
        throw a(null);
      } 
      return LocalDate.ofEpochDay(paramZg.ZE());
    } 
    return (LocalDate)ZE(paramZyg, paramZg, d(8077, 27527), new Object[0]);
  }
  
  protected LocalDate Zc(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    String str = paramString.trim();
    try {
      if (str.length() == 0)
        return ZN(paramZg, paramZyg, str); 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      DateTimeFormatter dateTimeFormatter = this.Za;
      try {
        if (dateTimeFormatter == ZU)
          try {
            if (str.length() > 10)
              try {
                if (str.charAt(10) == 'T') {
                  try {
                    if (ZK())
                      return str.endsWith("Z") ? LocalDate.parse(str.substring(0, str.length() - 1), DateTimeFormatter.ISO_LOCAL_DATE_TIME) : LocalDate.parse(str, DateTimeFormatter.ISO_LOCAL_DATE_TIME); 
                  } catch (DateTimeException dateTimeException) {
                    throw a(null);
                  } 
                  Zk zk = Zq(paramZyg);
                  return (LocalDate)paramZyg.ZN(zk.Zf(), str, d(8079, -1077), new Object[0]);
                } 
              } catch (DateTimeException dateTimeException) {
                throw a(null);
              }  
          } catch (DateTimeException dateTimeException) {
            throw a(null);
          }  
      } catch (DateTimeException dateTimeException) {
        throw a(null);
      } 
      return LocalDate.parse(str, dateTimeFormatter);
    } catch (DateTimeException dateTimeException) {
      return (LocalDate)Z_(paramZyg, dateTimeException, str);
    } 
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Iòtæ  ñÍ: ÝzèMro¤í-ß9íCàÐf£p»Á!*âÐcxr­9nxi«UìXg±\\bmù¼Rr¤p#.GÙX (Ø½QÓzÒ%>M{ÛèdoókÒ«ÍrÆ¦½¾ôÏè5KÀF0Z#zµº}¥âq[-×SxZÄ4 Õd£ÎºóGëxXlæD\\n'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #25
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #9
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   64: goto -> 22
    //   67: ldc 'ø)5Ý¡eb³æC¨ã(ZÍãØÎEd}\\t0gØ;C\\tWÑ7À]:\\fN#¡øÜ9x»-ÕÆ8c<âWåwxûúgÌ¦eEI`'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #61
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #32
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic com/fasterxml/Zq1.h : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zq1.i : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_4
    //   213: goto -> 243
    //   216: bipush #123
    //   218: goto -> 243
    //   221: bipush #37
    //   223: goto -> 243
    //   226: bipush #8
    //   228: goto -> 243
    //   231: bipush #41
    //   233: goto -> 243
    //   236: bipush #26
    //   238: goto -> 243
    //   241: bipush #27
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: getstatic java/time/format/DateTimeFormatter.ISO_LOCAL_DATE : Ljava/time/format/DateTimeFormatter;
    //   303: putstatic com/fasterxml/Zq1.ZU : Ljava/time/format/DateTimeFormatter;
    //   306: new com/fasterxml/Zq1
    //   309: dup
    //   310: invokespecial <init> : ()V
    //   313: putstatic com/fasterxml/Zq1.Zm : Lcom/fasterxml/Zq1;
    //   316: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String d(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1F8D) & 0xFFFF;
    if (i[i] == null) {
      char[] arrayOfChar = h[i].toCharArray();
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
      byte b1 = 50;
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
      i[i] = (new String(arrayOfChar)).intern();
    } 
    return i[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zq1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */