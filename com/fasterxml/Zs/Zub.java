package com.fasterxml.Zs;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zq;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyg;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class Zub<T> extends Zuy<T> {
  private static final String[] e;
  
  private static final String[] f;
  
  public static Class<?>[] Zr() {
    return new Class[] { 
        File.class, URL.class, URI.class, Class.class, Zk.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, 
        InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class };
  }
  
  protected Zub(Class<?> paramClass) {
    super(paramClass);
  }
  
  public static Zub<?> Zb(Class<?> paramClass) {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: iconst_0
    //   4: istore_2
    //   5: astore_1
    //   6: aload_0
    //   7: ldc java/io/File
    //   9: if_acmpne -> 18
    //   12: iconst_1
    //   13: istore_2
    //   14: aload_1
    //   15: ifnull -> 279
    //   18: aload_0
    //   19: ldc java/net/URL
    //   21: if_acmpne -> 37
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   30: athrow
    //   31: iconst_2
    //   32: istore_2
    //   33: aload_1
    //   34: ifnull -> 279
    //   37: aload_0
    //   38: ldc java/net/URI
    //   40: if_acmpne -> 56
    //   43: goto -> 50
    //   46: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   49: athrow
    //   50: iconst_3
    //   51: istore_2
    //   52: aload_1
    //   53: ifnull -> 279
    //   56: aload_0
    //   57: ldc java/lang/Class
    //   59: if_acmpne -> 75
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   68: athrow
    //   69: iconst_4
    //   70: istore_2
    //   71: aload_1
    //   72: ifnull -> 279
    //   75: aload_0
    //   76: ldc com/fasterxml/Zor/Zk
    //   78: if_acmpne -> 94
    //   81: goto -> 88
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: iconst_5
    //   89: istore_2
    //   90: aload_1
    //   91: ifnull -> 279
    //   94: aload_0
    //   95: ldc java/util/Currency
    //   97: if_acmpne -> 114
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   106: athrow
    //   107: bipush #6
    //   109: istore_2
    //   110: aload_1
    //   111: ifnull -> 279
    //   114: aload_0
    //   115: ldc java/util/regex/Pattern
    //   117: if_acmpne -> 134
    //   120: goto -> 127
    //   123: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   126: athrow
    //   127: bipush #7
    //   129: istore_2
    //   130: aload_1
    //   131: ifnull -> 279
    //   134: aload_0
    //   135: ldc java/util/Locale
    //   137: if_acmpne -> 154
    //   140: goto -> 147
    //   143: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   146: athrow
    //   147: bipush #8
    //   149: istore_2
    //   150: aload_1
    //   151: ifnull -> 279
    //   154: aload_0
    //   155: ldc java/nio/charset/Charset
    //   157: if_acmpne -> 174
    //   160: goto -> 167
    //   163: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: bipush #9
    //   169: istore_2
    //   170: aload_1
    //   171: ifnull -> 279
    //   174: aload_0
    //   175: ldc java/util/TimeZone
    //   177: if_acmpne -> 194
    //   180: goto -> 187
    //   183: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   186: athrow
    //   187: bipush #10
    //   189: istore_2
    //   190: aload_1
    //   191: ifnull -> 279
    //   194: aload_0
    //   195: ldc java/net/InetAddress
    //   197: if_acmpne -> 214
    //   200: goto -> 207
    //   203: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   206: athrow
    //   207: bipush #11
    //   209: istore_2
    //   210: aload_1
    //   211: ifnull -> 279
    //   214: aload_0
    //   215: ldc java/net/InetSocketAddress
    //   217: if_acmpne -> 234
    //   220: goto -> 227
    //   223: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   226: athrow
    //   227: bipush #12
    //   229: istore_2
    //   230: aload_1
    //   231: ifnull -> 279
    //   234: aload_0
    //   235: ldc java/lang/StringBuilder
    //   237: if_acmpne -> 259
    //   240: goto -> 247
    //   243: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   246: athrow
    //   247: new com/fasterxml/Zs/Zu9
    //   250: dup
    //   251: invokespecial <init> : ()V
    //   254: areturn
    //   255: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   258: athrow
    //   259: aload_0
    //   260: ldc java/lang/StringBuffer
    //   262: if_acmpne -> 277
    //   265: new com/fasterxml/Zs/Zuc
    //   268: dup
    //   269: invokespecial <init> : ()V
    //   272: areturn
    //   273: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   276: athrow
    //   277: aconst_null
    //   278: areturn
    //   279: new com/fasterxml/Zs/Zup
    //   282: dup
    //   283: aload_0
    //   284: iload_2
    //   285: invokespecial <init> : (Ljava/lang/Class;I)V
    //   288: areturn
    // Exception table:
    //   from	to	target	type
    //   14	24	27	java/lang/IllegalArgumentException
    //   33	43	46	java/lang/IllegalArgumentException
    //   52	62	65	java/lang/IllegalArgumentException
    //   71	81	84	java/lang/IllegalArgumentException
    //   90	100	103	java/lang/IllegalArgumentException
    //   110	120	123	java/lang/IllegalArgumentException
    //   130	140	143	java/lang/IllegalArgumentException
    //   150	160	163	java/lang/IllegalArgumentException
    //   170	180	183	java/lang/IllegalArgumentException
    //   190	200	203	java/lang/IllegalArgumentException
    //   210	220	223	java/lang/IllegalArgumentException
    //   230	240	243	java/lang/IllegalArgumentException
    //   234	255	255	java/lang/IllegalArgumentException
    //   259	273	273	java/lang/IllegalArgumentException
  }
  
  public Zd Zb() {
    return Zd.OtherScalar;
  }
  
  public T deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    String str = paramZg.Zd();
    if (str == null) {
      Zl zl = paramZg.Zh();
      try {
        if (zl != Zl.START_OBJECT)
          return (T)Zm(paramZg, paramZyg, zl); 
      } catch (IllegalArgumentException illegalArgumentException1) {
        throw a(null);
      } 
      str = paramZyg.Zc(paramZg, this, this.ZC);
    } 
    try {
      if (str.isEmpty())
        return (T)Zh(paramZyg); 
    } catch (IllegalArgumentException illegalArgumentException1) {
      throw a(null);
    } 
    if (ZR()) {
      String str1 = str;
      str = str.trim();
      try {
        if (str != str1)
          try {
            if (str.isEmpty())
              return (T)Zh(paramZyg); 
          } catch (IllegalArgumentException illegalArgumentException1) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException1) {
        throw a(null);
      } 
    } 
    IllegalArgumentException illegalArgumentException = null;
    try {
      return ZV(str, paramZyg);
    } catch (IllegalArgumentException|java.net.MalformedURLException illegalArgumentException1) {
      illegalArgumentException = illegalArgumentException1;
      String str1 = c(28873, -22123);
      String str2 = illegalArgumentException.getMessage();
      if (str2 != null)
        str1 = str1 + c(28875, 4851) + str2; 
      throw paramZyg.ZR(str, this.ZC, str1).Zc(illegalArgumentException);
    } 
  }
  
  protected abstract T ZV(String paramString, Zyg paramZyg) throws IOException;
  
  protected boolean ZR() {
    return true;
  }
  
  protected Object Zm(Zg paramZg, Zyg paramZyg, Zl paramZl) throws IOException {
    try {
      if (paramZl == Zl.START_ARRAY)
        return ZF(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    if (paramZl == Zl.VALUE_EMBEDDED_OBJECT) {
      Object object = paramZg.ZO();
      try {
        if (object == null)
          return null; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      try {
        if (this.ZC.isAssignableFrom(object.getClass()))
          return object; 
      } catch (IOException iOException) {
        throw a(null);
      } 
      return ZQ(object, paramZyg);
    } 
    return paramZyg.ZB(this.ZC, paramZg);
  }
  
  protected T ZQ(Object paramObject, Zyg paramZyg) throws IOException {
    paramZyg.ZY(this, c(28874, -23282), new Object[] { paramObject.getClass().getName(), this.ZC.getName() });
    return null;
  }
  
  protected Object Zh(Zyg paramZyg) throws IOException {
    Zx zx = paramZyg.ZT(Zb(), this.ZC, Zq.EmptyString);
    try {
      if (zx == Zx.Fail)
        paramZyg.ZY(this, c(28872, 26561), new Object[] { Zu() }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zx == Zx.AsNull)
        return Zj(paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (zx == Zx.AsEmpty)
        return Zy(paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZG(paramZyg);
  }
  
  protected Object ZG(Zyg paramZyg) throws IOException {
    return Zj(paramZyg);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc ' «ÀðÂH&µVh"íl¯äg5Wî¸±-ÖËZR¨´%ô35ÙáÄµ¨sþ¶/µÕÓTdÂvjõ¾È6JT·©# ,¦ékÝó*-_FÉYè"üÙT¶E©þübÈüßhL¬/÷à6Þ¼qnEÒ*Ù¤'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #93
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #44
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
    //   67: ldc 'øû5iYòDÌ[©<¶³ÛÝ[ì,ú=Ók§îå¨°ÉZ©¨ª/ÐD^5d:RØÀË­/£ºÐ¶<'®Ã:hÿFn'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #60
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #112
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
    //   128: putstatic com/fasterxml/Zs/Zub.e : [Ljava/lang/String;
    //   131: iconst_4
    //   132: anewarray java/lang/String
    //   135: putstatic com/fasterxml/Zs/Zub.f : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #107
    //   219: goto -> 244
    //   222: bipush #61
    //   224: goto -> 244
    //   227: bipush #98
    //   229: goto -> 244
    //   232: bipush #24
    //   234: goto -> 244
    //   237: bipush #46
    //   239: goto -> 244
    //   242: bipush #91
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
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
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x70C8) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 98;
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */