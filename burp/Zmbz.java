package burp;

import java.util.EnumSet;

public class Zmbz extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmbz() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: aload #5
    //   2: invokevirtual Za : ()I
    //   5: istore #12
    //   7: invokestatic Zj : ()Z
    //   10: new java/lang/StringBuilder
    //   13: dup
    //   14: invokespecial <init> : ()V
    //   17: astore #13
    //   19: istore #11
    //   21: aload #13
    //   23: sipush #-16410
    //   26: sipush #4542
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload #13
    //   38: aload #6
    //   40: iconst_1
    //   41: iconst_1
    //   42: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: iload #9
    //   51: iconst_1
    //   52: if_icmpne -> 82
    //   55: aload #13
    //   57: sipush #-16411
    //   60: sipush #-30338
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: iload #11
    //   72: ifne -> 97
    //   75: iconst_2
    //   76: anewarray burp/Zbqc
    //   79: invokestatic Zr : ([Lburp/Zbqc;)V
    //   82: aload #13
    //   84: sipush #-16412
    //   87: sipush #-9595
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #13
    //   99: sipush #-16409
    //   102: sipush #-31590
    //   105: invokestatic a : (II)Ljava/lang/String;
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: iload #12
    //   114: iconst_1
    //   115: iand
    //   116: iconst_1
    //   117: if_icmpne -> 340
    //   120: aload #5
    //   122: invokevirtual ZO : ()Lburp/Zg3y;
    //   125: astore #14
    //   127: aload #13
    //   129: sipush #-16416
    //   132: sipush #6644
    //   135: invokestatic a : (II)Ljava/lang/String;
    //   138: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #13
    //   144: aload #14
    //   146: invokeinterface Zub : ()Lburp/Zll7;
    //   151: invokeinterface Zsf : ()Lburp/Zstu;
    //   156: invokeinterface ZiD : ()[B
    //   161: invokestatic Zn : ([B)Ljava/lang/String;
    //   164: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   167: aload #13
    //   169: sipush #-16405
    //   172: sipush #-25449
    //   175: invokestatic a : (II)Ljava/lang/String;
    //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload #13
    //   184: aload #14
    //   186: invokeinterface ZXh : ()Lburp/Zll7;
    //   191: invokeinterface Zsf : ()Lburp/Zstu;
    //   196: invokeinterface ZiD : ()[B
    //   201: invokestatic Zn : ([B)Ljava/lang/String;
    //   204: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   207: aload #13
    //   209: sipush #-16408
    //   212: sipush #5128
    //   215: invokestatic a : (II)Ljava/lang/String;
    //   218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: pop
    //   222: aload #13
    //   224: aload #6
    //   226: iconst_1
    //   227: iconst_0
    //   228: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   234: pop
    //   235: aload #13
    //   237: sipush #-16414
    //   240: sipush #5429
    //   243: invokestatic a : (II)Ljava/lang/String;
    //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: iload_2
    //   251: lookupswitch default -> 316, 0 -> 276, 1 -> 296
    //   276: aload #13
    //   278: sipush #-16406
    //   281: sipush #-8291
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: iload #11
    //   293: ifne -> 325
    //   296: aload #13
    //   298: sipush #-16415
    //   301: sipush #-16567
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: pop
    //   311: iload #11
    //   313: ifne -> 325
    //   316: iconst_0
    //   317: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   320: iload_2
    //   321: i2l
    //   322: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   325: aload #13
    //   327: sipush #-16413
    //   330: sipush #26979
    //   333: invokestatic a : (II)Ljava/lang/String;
    //   336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: pop
    //   340: iload #12
    //   342: iconst_4
    //   343: iand
    //   344: iconst_4
    //   345: if_icmpne -> 353
    //   348: aload #13
    //   350: invokestatic ZO : (Ljava/lang/StringBuilder;)V
    //   353: aload #5
    //   355: aload #13
    //   357: invokestatic ZV : (Lburp/Ztub;Ljava/lang/StringBuilder;)V
    //   360: aload #13
    //   362: invokevirtual toString : ()Ljava/lang/String;
    //   365: areturn
  }
  
  public byte Zf(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return ((paramZtub.Za() & 0x4) == 4) ? 2 : paramByte;
  }
  
  public byte Zj(Ztlj paramZtlj, Ztub paramZtub, byte paramByte, int paramInt, Zs66 paramZs66, byte[] paramArrayOfbyte, Zrdb paramZrdb) {
    return ((paramZtub.Za() & 0x1) == 1) ? 4 : 1;
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZW.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'g¢LtÀãó 2ù\\r´Ki\\bµN£¸©\\beÑ/îÊñî ûÃ¶DªXáU¼A,ÎhbNÔ¸ØÙú©Ë¡0½YºÌ·¹]5´r¿Æ¼×sÙâýÚ JÓúFSY·ÖÐ­7õë­ò\\rÔúE\\nô?§Q ­ÔÊr7|fl¨;É}ÐyzÑknèûôA¹ëùöUE|Ô}zÍí3&ÑÔuåPOÃz`Õ¥0à. (H³ÒJ%üÊTüº»ì#0+6º¼Ìg"¤¥\\b,ZTßdzÓÜ/òÓ.\\f-YôÂúHÓK\\fN©Rßö\\ncI²­¸\\bâK®QÆËfA_e'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #113
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #21
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
    //   68: ldc ' Ã°~¥~Bt2© ÀÐn¿wþLv¢- ±ly_¾:d! ò}'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #7
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
    //   129: putstatic burp/Zmbz.a : [Ljava/lang/String;
    //   132: bipush #11
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmbz.b : [Ljava/lang/String;
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
    //   212: bipush #68
    //   214: goto -> 244
    //   217: bipush #111
    //   219: goto -> 244
    //   222: bipush #32
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #65
    //   234: goto -> 244
    //   237: bipush #10
    //   239: goto -> 244
    //   242: bipush #52
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
    int i = (paramInt1 ^ 0xFFFFBFE2) & 0xFFFF;
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
      byte b1 = 103;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */