package burp;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class Ze_p {
  private static final String[] a;
  
  private static final String[] b;
  
  public static Zg8k ZH(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zejb paramZejb, Zzlx paramZzlx, Zr_4 paramZr_4) {
    try {
      switch (Zlbf.ZI[paramZejb.ordinal()]) {
        case 1:
          return new Zg8r(paramZlfa, paramList, paramZr_d, paramZzlx);
        case 2:
          return new Zg8c(paramZlfa, paramList, paramZr_d, paramZzlx);
        case 3:
          return new Zg8g(paramZlfa, paramList, paramZr_d, paramZzlx);
        case 4:
          return new Zg8d(paramZlfa, paramList, paramZr_d, paramZzlx, paramZr_4);
      } 
    } catch (Zeje zeje) {
      throw a(null);
    } 
    throw new Zeje(String.format(a(30282, -2311), new Object[] { paramZejb }));
  }
  
  public static Zg8k ZW(String paramString, Zgyp paramZgyp, Zsh8 paramZsh8, Supplier<Zzlx> paramSupplier, Zr_4 paramZr_4, Zr_d paramZr_d, Zlfa paramZlfa) throws IOException, Ze27 {
    // Byte code:
    //   0: invokestatic Zt : ()[Lburp/Zbqc;
    //   3: astore #7
    //   5: aload_1
    //   6: aload_0
    //   7: invokeinterface Zm : (Ljava/lang/String;)Lburp/Zgyp;
    //   12: astore #8
    //   14: aload #8
    //   16: ifnonnull -> 25
    //   19: aconst_null
    //   20: areturn
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload #8
    //   27: sipush #30276
    //   30: sipush #-12531
    //   33: invokestatic a : (II)Ljava/lang/String;
    //   36: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   41: invokestatic Zr : (Ljava/lang/Number;)Lburp/Zejb;
    //   44: astore #9
    //   46: new java/util/ArrayList
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: astore #10
    //   55: aload #8
    //   57: sipush #30280
    //   60: sipush #8652
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokeinterface ZI : (Ljava/lang/String;)[B
    //   71: astore #11
    //   73: aload #11
    //   75: getstatic burp/Zgyp.Zm : [B
    //   78: if_acmpne -> 95
    //   81: aload #10
    //   83: aconst_null
    //   84: invokeinterface add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: aload #7
    //   92: ifnull -> 55
    //   95: aload #8
    //   97: sipush #30287
    //   100: sipush #-3865
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokeinterface ZI : (Ljava/lang/String;)[B
    //   111: astore #12
    //   113: aload #12
    //   115: ifnonnull -> 125
    //   118: goto -> 226
    //   121: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   124: athrow
    //   125: aload #8
    //   127: sipush #30283
    //   130: sipush #-1848
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokeinterface ZI : (Ljava/lang/String;)[B
    //   141: astore #13
    //   143: aload #8
    //   145: sipush #30285
    //   148: sipush #20167
    //   151: invokestatic a : (II)Ljava/lang/String;
    //   154: invokeinterface ZI : (Ljava/lang/String;)[B
    //   159: astore #14
    //   161: aload #12
    //   163: getstatic burp/Zgyp.Zm : [B
    //   166: if_acmpne -> 172
    //   169: aconst_null
    //   170: astore #12
    //   172: aload #13
    //   174: getstatic burp/Zgyp.Zm : [B
    //   177: if_acmpne -> 183
    //   180: aconst_null
    //   181: astore #13
    //   183: aload #14
    //   185: getstatic burp/Zgyp.Zm : [B
    //   188: if_acmpne -> 194
    //   191: aconst_null
    //   192: astore #14
    //   194: aload #10
    //   196: iconst_3
    //   197: anewarray [B
    //   200: dup
    //   201: iconst_0
    //   202: aload #12
    //   204: aastore
    //   205: dup
    //   206: iconst_1
    //   207: aload #13
    //   209: aastore
    //   210: dup
    //   211: iconst_2
    //   212: aload #14
    //   214: aastore
    //   215: invokeinterface add : (Ljava/lang/Object;)Z
    //   220: pop
    //   221: aload #7
    //   223: ifnull -> 55
    //   226: aload #10
    //   228: invokeinterface size : ()I
    //   233: anewarray [[B
    //   236: astore #11
    //   238: aload #10
    //   240: aload #11
    //   242: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   247: pop
    //   248: aload #8
    //   250: sipush #30286
    //   253: sipush #-6876
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   264: invokevirtual shortValue : ()S
    //   267: istore #12
    //   269: aload #8
    //   271: sipush #30284
    //   274: sipush #-27832
    //   277: invokestatic a : (II)Ljava/lang/String;
    //   280: invokeinterface ZM : (Ljava/lang/String;)Ljava/lang/Integer;
    //   285: invokevirtual intValue : ()I
    //   288: istore #13
    //   290: aload #8
    //   292: ldc 'a'
    //   294: invokeinterface Zq : (Ljava/lang/String;)Ljava/lang/Boolean;
    //   299: invokevirtual booleanValue : ()Z
    //   302: istore #14
    //   304: aload #6
    //   306: aload #11
    //   308: aload #4
    //   310: invokestatic Za : ([[[BLburp/Zr_4;)Lburp/Zxph;
    //   313: invokeinterface Zc : (Lburp/Zxph;)V
    //   318: aload #6
    //   320: iload #12
    //   322: invokeinterface ZD : (S)V
    //   327: aload #6
    //   329: aload_2
    //   330: invokeinterface ZPg : ()Ljava/util/List;
    //   335: aload #5
    //   337: aload #9
    //   339: iload #13
    //   341: iload #14
    //   343: aload_3
    //   344: invokestatic Zu : (Lburp/Zlfa;Ljava/util/List;Lburp/Zr_d;Lburp/Zejb;IZLjava/util/function/Supplier;)Lburp/Zg8k;
    //   347: astore #15
    //   349: aload #8
    //   351: invokeinterface ZE : ()V
    //   356: aload #15
    //   358: areturn
    // Exception table:
    //   from	to	target	type
    //   14	21	21	java/io/IOException
    //   113	121	121	java/io/IOException
  }
  
  private static Zg8k Zu(Zlfa paramZlfa, List<Zkq1> paramList, Zr_d paramZr_d, Zejb paramZejb, int paramInt, boolean paramBoolean, Supplier<Zzlx> paramSupplier) {
    try {
      switch (Zlbf.ZI[paramZejb.ordinal()]) {
        case 1:
          return new Zg8r(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
        case 2:
          return new Zg8c(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
        case 3:
          return new Zg8g(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
        case 4:
          return new Zg8d(paramZlfa, paramList, paramZr_d, paramInt, paramBoolean, paramSupplier);
      } 
    } catch (Zeje zeje) {
      throw a(null);
    } 
    throw new Zeje(String.format(a(30281, 13325), new Object[] { paramZejb }));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '~:â6"gÇ¨=D-× ÄëÑÔ/pñ=½vq\\nZ¸Ý¯à­]l"¯ÐÞÑ¦ÆÏP%õKV½·é¡Ö}sº:okn¼SÍqiÝàG8©'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #96
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
    //   67: ldc 'ýM'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #109
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Ze_p.a : [Ljava/lang/String;
    //   130: bipush #9
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ze_p.b : [Ljava/lang/String;
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
    //   212: bipush #70
    //   214: goto -> 244
    //   217: bipush #95
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #75
    //   229: goto -> 244
    //   232: bipush #118
    //   234: goto -> 244
    //   237: bipush #106
    //   239: goto -> 244
    //   242: bipush #36
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x764C) & 0xFFFF;
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
      char c = 'ý';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze_p.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */