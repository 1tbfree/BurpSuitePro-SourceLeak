package net.portswigger.browser;

import java.util.Optional;
import net.portswigger.Zi7;

public interface Zer {
  public static final String[] a;
  
  public static final String[] b;
  
  static Optional<Zer> ZJ(Zi7 paramZi7) throws Zcy {
    // Byte code:
    //   0: invokestatic ZZ : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: sipush #16264
    //   8: sipush #-712
    //   11: invokestatic a : (II)Ljava/lang/String;
    //   14: invokeinterface Zm : (Ljava/lang/String;)Z
    //   19: ifne -> 52
    //   22: new net/portswigger/browser/Zcy
    //   25: dup
    //   26: sipush #16259
    //   29: sipush #899
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: sipush #16265
    //   38: sipush #28384
    //   41: invokestatic a : (II)Ljava/lang/String;
    //   44: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   47: athrow
    //   48: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   51: athrow
    //   52: aload_0
    //   53: sipush #16265
    //   56: sipush #28384
    //   59: invokestatic a : (II)Ljava/lang/String;
    //   62: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   67: invokeinterface ZW : ()Ljava/lang/String;
    //   72: astore_3
    //   73: aload_3
    //   74: astore #4
    //   76: iconst_m1
    //   77: istore #5
    //   79: aload #4
    //   81: invokevirtual hashCode : ()I
    //   84: lookupswitch default -> 366, -1413741364 -> 276, -858798729 -> 183, 3178851 -> 152, 3641717 -> 307, 94750088 -> 245, 109757538 -> 338, 503739367 -> 214
    //   152: aload #4
    //   154: sipush #16271
    //   157: sipush #29105
    //   160: invokestatic a : (II)Ljava/lang/String;
    //   163: invokevirtual equals : (Ljava/lang/Object;)Z
    //   166: ifeq -> 366
    //   169: goto -> 176
    //   172: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   175: athrow
    //   176: iconst_0
    //   177: istore #5
    //   179: aload_1
    //   180: ifnonnull -> 366
    //   183: aload #4
    //   185: sipush #16268
    //   188: sipush #10280
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: invokevirtual equals : (Ljava/lang/Object;)Z
    //   197: ifeq -> 366
    //   200: goto -> 207
    //   203: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   206: athrow
    //   207: iconst_1
    //   208: istore #5
    //   210: aload_1
    //   211: ifnonnull -> 366
    //   214: aload #4
    //   216: sipush #16257
    //   219: sipush #12837
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: invokevirtual equals : (Ljava/lang/Object;)Z
    //   228: ifeq -> 366
    //   231: goto -> 238
    //   234: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   237: athrow
    //   238: iconst_2
    //   239: istore #5
    //   241: aload_1
    //   242: ifnonnull -> 366
    //   245: aload #4
    //   247: sipush #16269
    //   250: sipush #13595
    //   253: invokestatic a : (II)Ljava/lang/String;
    //   256: invokevirtual equals : (Ljava/lang/Object;)Z
    //   259: ifeq -> 366
    //   262: goto -> 269
    //   265: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   268: athrow
    //   269: iconst_3
    //   270: istore #5
    //   272: aload_1
    //   273: ifnonnull -> 366
    //   276: aload #4
    //   278: sipush #16256
    //   281: sipush #2995
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual equals : (Ljava/lang/Object;)Z
    //   290: ifeq -> 366
    //   293: goto -> 300
    //   296: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   299: athrow
    //   300: iconst_4
    //   301: istore #5
    //   303: aload_1
    //   304: ifnonnull -> 366
    //   307: aload #4
    //   309: sipush #16266
    //   312: sipush #32502
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual equals : (Ljava/lang/Object;)Z
    //   321: ifeq -> 366
    //   324: goto -> 331
    //   327: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   330: athrow
    //   331: iconst_5
    //   332: istore #5
    //   334: aload_1
    //   335: ifnonnull -> 366
    //   338: aload #4
    //   340: sipush #16267
    //   343: sipush #6597
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokevirtual equals : (Ljava/lang/Object;)Z
    //   352: ifeq -> 366
    //   355: goto -> 362
    //   358: invokestatic a : (Lnet/portswigger/browser/Zcy;)Lnet/portswigger/browser/Zcy;
    //   361: athrow
    //   362: bipush #6
    //   364: istore #5
    //   366: iload #5
    //   368: tableswitch default -> 525, 0 -> 412, 1 -> 425, 2 -> 438, 3 -> 486, 4 -> 486, 5 -> 499, 6 -> 512
    //   412: new net/portswigger/browser/Zjx
    //   415: dup
    //   416: aload_0
    //   417: invokespecial <init> : (Lnet/portswigger/Zi7;)V
    //   420: astore_2
    //   421: aload_1
    //   422: ifnonnull -> 527
    //   425: new net/portswigger/browser/Zjr
    //   428: dup
    //   429: aload_0
    //   430: invokespecial <init> : (Lnet/portswigger/Zi7;)V
    //   433: astore_2
    //   434: aload_1
    //   435: ifnonnull -> 527
    //   438: aload_0
    //   439: sipush #16270
    //   442: sipush #-30644
    //   445: invokestatic a : (II)Ljava/lang/String;
    //   448: invokeinterface Zo : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   453: invokeinterface ZW : ()Ljava/lang/String;
    //   458: invokestatic ZN : (Ljava/lang/String;)Ljava/util/Optional;
    //   461: astore #6
    //   463: aload #6
    //   465: aload_0
    //   466: <illegal opcode> apply : (Lnet/portswigger/Zi7;)Ljava/util/function/Function;
    //   471: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   474: aconst_null
    //   475: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   478: checkcast net/portswigger/browser/Zer
    //   481: astore_2
    //   482: aload_1
    //   483: ifnonnull -> 527
    //   486: new net/portswigger/browser/Zj3
    //   489: dup
    //   490: aload_0
    //   491: invokespecial <init> : (Lnet/portswigger/Zi7;)V
    //   494: astore_2
    //   495: aload_1
    //   496: ifnonnull -> 527
    //   499: new net/portswigger/browser/Zjf
    //   502: dup
    //   503: aload_0
    //   504: invokespecial <init> : (Lnet/portswigger/Zi7;)V
    //   507: astore_2
    //   508: aload_1
    //   509: ifnonnull -> 527
    //   512: new net/portswigger/browser/Zdr
    //   515: dup
    //   516: aload_0
    //   517: invokespecial <init> : (Lnet/portswigger/Zi7;)V
    //   520: astore_2
    //   521: aload_1
    //   522: ifnonnull -> 527
    //   525: aconst_null
    //   526: astore_2
    //   527: aload_2
    //   528: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   531: areturn
    // Exception table:
    //   from	to	target	type
    //   4	48	48	net/portswigger/browser/Zcy
    //   79	169	172	net/portswigger/browser/Zcy
    //   179	200	203	net/portswigger/browser/Zcy
    //   210	231	234	net/portswigger/browser/Zcy
    //   241	262	265	net/portswigger/browser/Zcy
    //   272	293	296	net/portswigger/browser/Zcy
    //   303	324	327	net/portswigger/browser/Zcy
    //   334	355	358	net/portswigger/browser/Zcy
  }
  
  Zi7 ZA(Zi7 paramZi7);
  
  private static Zjz lambda$fromJsonObject$0(Zi7 paramZi7, Za paramZa) {
    return new Zjz(paramZi7, paramZa);
  }
  
  private static Zcy a(Zcy paramZcy) {
    return paramZcy;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '~O×ÄHºÒv\\tÍÓ¡WÈRM¢IZ¥îÐØÃª©uø¥!p;øltÆãy·\\búù\\t{Ðm'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #19
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
    //   68: ldc 'D³ùcÔX1à÷æÕÝCìO'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #124
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
    //   129: putstatic net/portswigger/browser/Zer.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/browser/Zer.b : [Ljava/lang/String;
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
    //   212: bipush #119
    //   214: goto -> 244
    //   217: bipush #39
    //   219: goto -> 244
    //   222: bipush #43
    //   224: goto -> 244
    //   227: bipush #110
    //   229: goto -> 244
    //   232: bipush #27
    //   234: goto -> 244
    //   237: bipush #105
    //   239: goto -> 244
    //   242: bipush #19
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3F89) & 0xFFFF;
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
      char c = '¦';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */