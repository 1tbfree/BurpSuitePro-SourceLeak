package burp;

import java.io.File;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zl0;

class Zm7r {
  private static final String[] Zr;
  
  static final String[] Zb;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private static boolean Zq(File paramFile, Zl0 paramZl0, Zskh paramZskh) {
    String str = Zgkj.ZV();
    try {
      List<String> list = Zs9v.Zo(paramFile, paramZl0, paramZskh);
      if (list == null)
        return false; 
      String[] arrayOfString = Zr;
      int i = arrayOfString.length;
      byte b = 0;
      while (b < i) {
        String str1 = arrayOfString[b];
        if (!list.contains(str1))
          return false; 
        b++;
        if (str != null)
          break; 
      } 
      return true;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return false;
    } 
  }
  
  static void Zk(Zgsd paramZgsd, String[] paramArrayOfString, boolean paramBoolean, Zl0 paramZl0, Zskh paramZskh) {
    String[] arrayOfString = paramArrayOfString;
    int i = arrayOfString.length;
    String str = Zgkj.ZV();
    byte b = 0;
    while (b < i) {
      String str1 = arrayOfString[b];
      ZD(paramZgsd, str1, paramBoolean, paramZl0, paramZskh);
      b++;
      if (str != null)
        break; 
    } 
    paramZgsd.Zq(2.0F, a(-9256, 1485));
  }
  
  private static void ZD(Zgsd paramZgsd, String paramString, boolean paramBoolean, Zl0 paramZl0, Zskh paramZskh) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore #5
    //   5: aload_0
    //   6: fconst_0
    //   7: aload_1
    //   8: sipush #-9249
    //   11: sipush #-1144
    //   14: invokestatic a : (II)Ljava/lang/String;
    //   17: swap
    //   18: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   23: invokeinterface Zq : (FLjava/lang/String;)Z
    //   28: ifne -> 32
    //   31: return
    //   32: new java/io/File
    //   35: dup
    //   36: aload_1
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: invokevirtual listFiles : ()[Ljava/io/File;
    //   43: astore #6
    //   45: aload #6
    //   47: ifnonnull -> 51
    //   50: return
    //   51: aload #6
    //   53: astore #7
    //   55: aload #7
    //   57: arraylength
    //   58: istore #8
    //   60: iconst_0
    //   61: istore #9
    //   63: iload #9
    //   65: iload #8
    //   67: if_icmpge -> 219
    //   70: aload #7
    //   72: iload #9
    //   74: aaload
    //   75: astore #10
    //   77: aload_0
    //   78: fconst_0
    //   79: aconst_null
    //   80: invokeinterface Zq : (FLjava/lang/String;)Z
    //   85: ifne -> 89
    //   88: return
    //   89: aload #10
    //   91: invokevirtual getName : ()Ljava/lang/String;
    //   94: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   97: astore #11
    //   99: aload #10
    //   101: invokevirtual isDirectory : ()Z
    //   104: ifeq -> 151
    //   107: iload_2
    //   108: ifeq -> 211
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload_0
    //   119: new java/io/File
    //   122: dup
    //   123: aload_1
    //   124: aload #11
    //   126: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   129: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   132: iload_2
    //   133: aload_3
    //   134: aload #4
    //   136: invokestatic ZD : (Lburp/Zgsd;Ljava/lang/String;ZLnet/portswigger/Zl0;Lburp/Zskh;)V
    //   139: aload #5
    //   141: ifnull -> 211
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   150: athrow
    //   151: aload #11
    //   153: sipush #-9253
    //   156: sipush #10484
    //   159: invokestatic a : (II)Ljava/lang/String;
    //   162: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   165: ifne -> 182
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: goto -> 211
    //   178: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   181: athrow
    //   182: aload #10
    //   184: aload_3
    //   185: aload #4
    //   187: invokestatic Zq : (Ljava/io/File;Lnet/portswigger/Zl0;Lburp/Zskh;)Z
    //   190: ifeq -> 211
    //   193: aload_0
    //   194: aload #10
    //   196: invokevirtual getCanonicalPath : ()Ljava/lang/String;
    //   199: invokeinterface ZX : (Ljava/lang/String;)V
    //   204: goto -> 211
    //   207: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   210: athrow
    //   211: iinc #9, 1
    //   214: aload #5
    //   216: ifnull -> 63
    //   219: goto -> 232
    //   222: astore #6
    //   224: aload #6
    //   226: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   229: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   232: return
    // Exception table:
    //   from	to	target	type
    //   5	31	222	java/lang/Exception
    //   32	50	222	java/lang/Exception
    //   51	88	222	java/lang/Exception
    //   89	219	222	java/lang/Exception
    //   99	111	114	java/lang/Exception
    //   107	144	147	java/lang/Exception
    //   118	168	171	java/lang/Exception
    //   151	178	178	java/lang/Exception
    //   182	204	207	java/lang/Exception
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¿"7ÁB§²&ì÷¿_×¾_%+!Á»Â¥âò6\\n$Ñ¸g7 rñ)¿Ë8Åo¹Õ\\b\\rá´ÓNHu¨­E+GqÜ6nÞ£)wr¡üJª7%ÇZe+eêÊIº6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #19
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #76
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
    //   68: ldc 'K;ÔX÷qLµ6Wº¯? $ñÝ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #22
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
    //   129: putstatic burp/Zm7r.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zm7r.b : [Ljava/lang/String;
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
    //   212: bipush #114
    //   214: goto -> 244
    //   217: bipush #98
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #88
    //   234: goto -> 244
    //   237: bipush #77
    //   239: goto -> 244
    //   242: bipush #20
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
    //   300: iconst_1
    //   301: anewarray java/lang/String
    //   304: dup
    //   305: iconst_0
    //   306: sipush #-9255
    //   309: sipush #29743
    //   312: invokestatic a : (II)Ljava/lang/String;
    //   315: aastore
    //   316: putstatic burp/Zm7r.Zr : [Ljava/lang/String;
    //   319: iconst_4
    //   320: anewarray java/lang/String
    //   323: dup
    //   324: iconst_0
    //   325: sipush #-9250
    //   328: sipush #28226
    //   331: invokestatic a : (II)Ljava/lang/String;
    //   334: aastore
    //   335: dup
    //   336: iconst_1
    //   337: sipush #-9254
    //   340: sipush #-7463
    //   343: invokestatic a : (II)Ljava/lang/String;
    //   346: aastore
    //   347: dup
    //   348: iconst_2
    //   349: sipush #-9251
    //   352: sipush #-32398
    //   355: invokestatic a : (II)Ljava/lang/String;
    //   358: aastore
    //   359: dup
    //   360: iconst_3
    //   361: sipush #-9252
    //   364: sipush #-8598
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: aastore
    //   371: putstatic burp/Zm7r.Zb : [Ljava/lang/String;
    //   374: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDBDC) & 0xFFFF;
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
      byte b1 = 121;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm7r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */