package burp;

public class Ztvk implements Zrec {
  public static Zrec Zv;
  
  private static Zbqc[] ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zefx Zv(Zefx paramZefx) {
    Zbqc[] arrayOfZbqc = ZT();
    String str = a(-22855, -30493).equalsIgnoreCase(paramZefx.Zr()) ? a(-22852, -16272) : a(-22855, -30493);
    Zefx zefx = paramZefx.Zr(str);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[3]); 
    return Zf(zefx);
  }
  
  private static Zefx Zf(Zefx paramZefx) {
    // Byte code:
    //   0: invokestatic ZT : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: astore_2
    //   6: sipush #-22856
    //   9: sipush #-12888
    //   12: invokestatic a : (II)Ljava/lang/String;
    //   15: aload_0
    //   16: invokeinterface Zr : ()Ljava/lang/String;
    //   21: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   24: istore_3
    //   25: iload_3
    //   26: ifne -> 37
    //   29: iconst_1
    //   30: goto -> 38
    //   33: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   36: athrow
    //   37: iconst_0
    //   38: istore #4
    //   40: iload #4
    //   42: ifeq -> 100
    //   45: aload_2
    //   46: iconst_0
    //   47: newarray byte
    //   49: invokeinterface ZZ : ([B)Lburp/Zefx;
    //   54: astore_2
    //   55: aload_2
    //   56: sipush #-22854
    //   59: sipush #-26237
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: sipush #-22853
    //   68: sipush #-17567
    //   71: invokestatic a : (II)Ljava/lang/String;
    //   74: invokeinterface Zx : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zefx;
    //   79: astore_2
    //   80: aload_2
    //   81: sipush #-22850
    //   84: sipush #8037
    //   87: invokestatic a : (II)Ljava/lang/String;
    //   90: iconst_0
    //   91: invokestatic valueOf : (I)Ljava/lang/String;
    //   94: invokeinterface Zx : (Ljava/lang/String;Ljava/lang/String;)Lburp/Zefx;
    //   99: astore_2
    //   100: aload_0
    //   101: invokeinterface Zc : ()Ljava/util/List;
    //   106: invokeinterface iterator : ()Ljava/util/Iterator;
    //   111: astore #5
    //   113: aload #5
    //   115: invokeinterface hasNext : ()Z
    //   120: ifeq -> 346
    //   123: aload #5
    //   125: invokeinterface next : ()Ljava/lang/Object;
    //   130: checkcast burp/Zlou
    //   133: astore #6
    //   135: iload_3
    //   136: ifeq -> 284
    //   139: aload #6
    //   141: getfield Zx : Lburp/Zrdu;
    //   144: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   147: if_acmpeq -> 175
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: aload #6
    //   159: getfield Zx : Lburp/Zrdu;
    //   162: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   165: if_acmpne -> 342
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   174: athrow
    //   175: aload_0
    //   176: invokeinterface Zv : ()Lburp/Zsba;
    //   181: getstatic burp/Zsba.MULTIPART : Lburp/Zsba;
    //   184: if_acmpne -> 218
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   193: athrow
    //   194: aload #6
    //   196: getfield ZA : Ljava/lang/String;
    //   199: invokestatic Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   202: astore #7
    //   204: aload #6
    //   206: getfield Zr : Ljava/lang/String;
    //   209: invokestatic Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   212: astore #8
    //   214: aload_1
    //   215: ifnull -> 246
    //   218: aload #6
    //   220: getfield ZA : Ljava/lang/String;
    //   223: bipush #32
    //   225: bipush #43
    //   227: invokevirtual replace : (CC)Ljava/lang/String;
    //   230: astore #7
    //   232: aload #6
    //   234: getfield Zr : Ljava/lang/String;
    //   237: bipush #32
    //   239: bipush #43
    //   241: invokevirtual replace : (CC)Ljava/lang/String;
    //   244: astore #8
    //   246: aload_2
    //   247: aload #6
    //   249: getfield ZA : Ljava/lang/String;
    //   252: aload #6
    //   254: getfield Zx : Lburp/Zrdu;
    //   257: invokeinterface ZX : (Ljava/lang/String;Lburp/Zrdu;)Lburp/Zefx;
    //   262: astore_2
    //   263: aload_2
    //   264: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   267: aload #7
    //   269: aload #8
    //   271: invokestatic Z_ : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;)Lburp/Zlou;
    //   274: invokeinterface ZH : (Lburp/Zlou;)Lburp/Zefx;
    //   279: astore_2
    //   280: aload_1
    //   281: ifnull -> 342
    //   284: aload #6
    //   286: getfield Zx : Lburp/Zrdu;
    //   289: getstatic burp/Zrdu.URL_PARAM : Lburp/Zrdu;
    //   292: if_acmpne -> 342
    //   295: goto -> 302
    //   298: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   301: athrow
    //   302: aload_2
    //   303: aload #6
    //   305: getfield ZA : Ljava/lang/String;
    //   308: aload #6
    //   310: getfield Zx : Lburp/Zrdu;
    //   313: invokeinterface ZX : (Ljava/lang/String;Lburp/Zrdu;)Lburp/Zefx;
    //   318: astore_2
    //   319: aload_2
    //   320: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   323: aload #6
    //   325: getfield ZA : Ljava/lang/String;
    //   328: aload #6
    //   330: getfield Zr : Ljava/lang/String;
    //   333: invokestatic Z_ : (Lburp/Zrdu;Ljava/lang/String;Ljava/lang/String;)Lburp/Zlou;
    //   336: invokeinterface ZH : (Lburp/Zlou;)Lburp/Zefx;
    //   341: astore_2
    //   342: aload_1
    //   343: ifnull -> 113
    //   346: iload_3
    //   347: ifeq -> 392
    //   350: aload_2
    //   351: sipush #-22849
    //   354: sipush #10190
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokeinterface ZY : (Ljava/lang/String;)Lburp/Zefx;
    //   365: astore_2
    //   366: aload_2
    //   367: sipush #-22851
    //   370: sipush #8141
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: invokeinterface ZY : (Ljava/lang/String;)Lburp/Zefx;
    //   381: astore_2
    //   382: aload_2
    //   383: iconst_0
    //   384: newarray byte
    //   386: invokeinterface ZZ : ([B)Lburp/Zefx;
    //   391: astore_2
    //   392: aload_2
    //   393: areturn
    //   394: astore_3
    //   395: aload_3
    //   396: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   399: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   402: aload_0
    //   403: areturn
    // Exception table:
    //   from	to	target	type
    //   6	393	394	java/lang/Exception
    //   25	33	33	java/lang/Exception
    //   135	150	153	java/lang/Exception
    //   139	168	171	java/lang/Exception
    //   157	187	190	java/lang/Exception
    //   280	295	298	java/lang/Exception
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: aconst_null
    //   8: iconst_0
    //   9: istore_3
    //   10: ldc '¥àÔµ×ÐB$ÄI!W#ÆÌ=-O±¦4è°rÄ­¦¶\\rWi.xE[47?|Kgï,Æ£FL ­MÓ\²Í{Z®sJî/eÃ<íË³A'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: bipush #12
    //   21: istore_1
    //   22: invokestatic ZS : ([Lburp/Zbqc;)V
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #50
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 146
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '¢[v\\f¥$÷7¡Ð)Ù`Ìç3'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: iconst_4
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #99
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Ztvk.a : [Ljava/lang/String;
    //   135: bipush #8
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Ztvk.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #106
    //   218: goto -> 248
    //   221: bipush #105
    //   223: goto -> 248
    //   226: bipush #68
    //   228: goto -> 248
    //   231: bipush #103
    //   233: goto -> 248
    //   236: bipush #30
    //   238: goto -> 248
    //   241: bipush #65
    //   243: goto -> 248
    //   246: bipush #108
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 102
    //   304: new burp/Ztvk
    //   307: dup
    //   308: invokespecial <init> : ()V
    //   311: putstatic burp/Ztvk.Zv : Lburp/Zrec;
    //   314: return
  }
  
  public static void ZS(Zbqc[] paramArrayOfZbqc) {
    ZR = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZT() {
    return ZR;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA6BA) & 0xFFFF;
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
      byte b1 = 127;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztvk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */