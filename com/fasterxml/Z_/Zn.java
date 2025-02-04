package com.fasterxml.Z_;

import com.fasterxml.Zk.Zc;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zm.Zz;
import com.fasterxml.Zo.Zza;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zsq;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Zn implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final Class<?> Zd;
  
  private static final Class<?> Zi;
  
  private static final Zu ZO;
  
  public static final Zn ZL;
  
  private final Map<String, String> Ze = new HashMap<>();
  
  private final Map<String, Object> ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zn() {
    this.Ze.put(a(-11393, -21761), a(-11407, 12486));
    this.Ze.put(a(-11420, 5747), a(-11399, 11285));
    this.ZV = new HashMap<>();
    this.ZV.put(a(-11415, 28786), Zsq.ZJ);
    this.ZV.put(a(-11406, -5623), a(-11411, -1417));
    this.ZV.put(a(-11394, -10368), a(-11404, 16904));
    this.ZV.put(a(-11418, 23077), a(-11400, -22366));
    this.ZV.put(a(-11409, -764), a(-11398, -16275));
  }
  
  public Zyd<?> Zm(Zy7 paramZy7, Zk paramZk, Zyv paramZyv) {
    Class<?> clazz = paramZk.Zf();
    int[] arrayOfInt = Zf.ZZ();
    try {
      if (Zi(clazz, Zd))
        return (Zyd)ZQ(a(-11419, 31331), paramZk); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (ZO != null) {
      Zyd<?> zyd = ZO.Zb(clazz);
      try {
        if (zyd != null)
          return zyd; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
    } 
    String str = clazz.getName();
    Object object = this.ZV.get(str);
    try {
      if (object != null) {
        try {
          if (object instanceof Zyd)
            return (Zyd)object; 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return (Zyd)ZQ((String)object, paramZk);
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (str.startsWith(a(-11408, 22462)) || Zq(clazz, a(-11414, -16009))) {
        String str1 = a(-11403, -22461);
        try {
          if (arrayOfInt != null) {
            Object object1 = ZQ(str1, paramZk);
            try {
              if (object1 == null)
                return null; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            return ((Zc)object1).Zf(paramZy7, paramZk, paramZyv);
          } 
          return null;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zyo<?> Zb(Zk paramZk, Zyc paramZyc, Zyv paramZyv) throws Zy_ {
    Class<?> clazz = paramZk.Zf();
    int[] arrayOfInt = Zf.ZZ();
    if (ZO != null) {
      Zyo<?> zyo = ZO.Zp(clazz);
      try {
        if (zyo != null)
          return zyo; 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    try {
      if (Zi(clazz, Zd))
        return (Zyo)ZQ(a(-11412, 23091), paramZk); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (Zi(clazz, Zi))
        return (Zyo)ZQ(a(-11395, 30244), paramZk); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    String str1 = clazz.getName();
    String str2 = this.Ze.get(str1);
    try {
      if (str2 != null)
        return (Zyo)ZQ(str2, paramZk); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (str1.startsWith(a(-11414, -16009)) || Zq(clazz, a(-11414, -16009))) {
        String str = a(-11417, 1114);
        try {
          if (arrayOfInt != null) {
            Object object = ZQ(str, paramZk);
            try {
              if (object == null)
                return null; 
            } catch (Zy_ zy_) {
              throw a(null);
            } 
            return ((Zza)object).ZV(paramZk, paramZyc, paramZyv);
          } 
          return null;
        } catch (Zy_ zy_) {
          throw a(null);
        } 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return null;
  }
  
  private boolean Zi(Class<?> paramClass1, Class<?> paramClass2) {
    try {
      if (paramClass2 != null)
        try {
          if (paramClass2.isAssignableFrom(paramClass1));
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  private Object ZQ(String paramString, Zk paramZk) {
    try {
      return Zs(Class.forName(paramString), paramZk);
    } catch (Throwable throwable) {
      Zz.ZI(throwable);
      throw new IllegalStateException(a(-11416, 10928) + paramString + a(-11396, 28817) + Zx.ZN(paramZk) + a(-11413, 22477) + throwable.getClass().getName() + a(-11410, -6738) + throwable.getMessage());
    } 
  }
  
  private Object Zs(Class<?> paramClass, Zk paramZk) {
    try {
      return Zx.ZR(paramClass, false);
    } catch (Throwable throwable) {
      Zz.ZI(throwable);
      throw new IllegalStateException(a(-11401, -30761) + paramClass.getName() + a(-11397, 5076) + Zx.ZN(paramZk) + a(-11405, 10430) + throwable.getClass().getName() + a(-11402, -1796) + throwable.getMessage());
    } 
  }
  
  private boolean Zq(Class<?> paramClass, String paramString) {
    Class<?> clazz = paramClass.getSuperclass();
    int[] arrayOfInt = Zf.ZZ();
    while (clazz != null) {
      try {
        if (clazz == Object.class)
          return false; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      try {
        if (clazz.getName().startsWith(paramString))
          return true; 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      clazz = clazz.getSuperclass();
      if (arrayOfInt == null)
        break; 
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÜhÞ¡ßÎÝï\\rú4QR Íü½uÍ¡nýE¥Ô:~J îídÛM¿QS?±bsÔì5 ß`¥®¼QåÕ½\\fíã¡,Pý_\\fÕò" 23{½ë­Q1XÙ?<úÝ=zìd4Ø+&1ÞZU¯§"½©Zn¸×ýÞÎi\\fIGQu| w¬äp­a¿ãÀõL¦P@5¦¼¨ñ.éÐ|£Ù ¯Äj¼<%RÀÚv(SP¸~%¢_æyÌH\+p2Ã1>6=crnU¾ÜMTî;¨"c*¤fûM\\råÃeHôè@nNÑ4+Xtò¬ºZý¦?K9©¸fv³ õãËS2d2cL¸¢ÃXFÌ3ß2ãe>°]Wo«éê] .X3Êæø=n^cÞdèÁï5çÚr¿C !éÉ_Q<R8X6Üü{¯¸¼úzæ#8ºÇÈÜh)ØAFUxÁ=¡¦\\bò-YÉ)ïØÂ\\r½=Ð/=2·\\f&ßiSük3u\\r±w8:-h]\\tQS.´Nu¯¡hHí}jæ 1­pJbmhÜ¿NYX^¿ùá­,Ò@xóX³|0O\\b[ÔiJµ$À×Lý*ó³t0O([ÐiÊµ4À\\nÖÔæUñþ"÷©ðáb©rç`4O È¡r×7z»s=\|ÃÒ(/Üæ8gúÑ G\?Â\\nµøààÂ Ç ¶ä²\\f8òÙð©ô²e:® ×ÔïÀáeÛ^\À\\fLõýZ²~v§÷§\\f\\rS'ÄI0ë¾e>\\nzlñæf¢AàÙïh5À\\n«ùzè«}|gJ¹\\bØlh3LX\\fpÐyDÑ¬Ý]ÑS>Û»õ³¥?Y\\n'd¦\\r_µåb<ç{¶'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #13
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #77
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '¹àú¸µÈgäË%d¹Å¡¤×KÞWû`+õy'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #123
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
    //   129: putstatic com/fasterxml/Z_/Zn.a : [Ljava/lang/String;
    //   132: bipush #28
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Z_/Zn.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #22
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #121
    //   224: goto -> 244
    //   227: bipush #91
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #121
    //   239: goto -> 244
    //   242: bipush #93
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: aconst_null
    //   301: astore #7
    //   303: aconst_null
    //   304: astore #8
    //   306: ldc org/w3c/dom/Node
    //   308: astore #8
    //   310: ldc org/w3c/dom/Document
    //   312: astore #7
    //   314: goto -> 324
    //   317: astore #9
    //   319: aload #9
    //   321: invokestatic ZI : (Ljava/lang/Throwable;)V
    //   324: aload #8
    //   326: putstatic com/fasterxml/Z_/Zn.Zd : Ljava/lang/Class;
    //   329: aload #7
    //   331: putstatic com/fasterxml/Z_/Zn.Zi : Ljava/lang/Class;
    //   334: aconst_null
    //   335: astore #7
    //   337: invokestatic ZO : ()Lcom/fasterxml/Z_/Zu;
    //   340: astore #7
    //   342: goto -> 352
    //   345: astore #8
    //   347: aload #8
    //   349: invokestatic ZI : (Ljava/lang/Throwable;)V
    //   352: aload #7
    //   354: putstatic com/fasterxml/Z_/Zn.ZO : Lcom/fasterxml/Z_/Zu;
    //   357: new com/fasterxml/Z_/Zn
    //   360: dup
    //   361: invokespecial <init> : ()V
    //   364: putstatic com/fasterxml/Z_/Zn.ZL : Lcom/fasterxml/Z_/Zn;
    //   367: return
    // Exception table:
    //   from	to	target	type
    //   306	314	317	java/lang/Throwable
    //   337	342	345	java/lang/Throwable
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD37F) & 0xFFFF;
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
      byte b1 = 75;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */