package burp;

public class Zmmi extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic Zk : ()Z
    //   12: aload #12
    //   14: sipush #7471
    //   17: sipush #7350
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload #12
    //   29: aload #6
    //   31: iconst_1
    //   32: iconst_1
    //   33: invokestatic ZM : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: istore #11
    //   42: aload #12
    //   44: sipush #7459
    //   47: sipush #14833
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: aload #12
    //   59: sipush #7463
    //   62: sipush #-3576
    //   65: invokestatic a : (II)Ljava/lang/String;
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload_1
    //   73: getstatic burp/Zzu2.CSS_INJECTION_REFLECTED : Lburp/Zzu2;
    //   76: if_acmpne -> 151
    //   79: aload #5
    //   81: invokevirtual Zd : ()Lburp/Zkcp;
    //   84: invokeinterface Zub : ()Lburp/Zll7;
    //   89: invokeinterface Zsf : ()Lburp/Zstu;
    //   94: invokeinterface Zis : ()Ljava/lang/String;
    //   99: astore #13
    //   101: aload #12
    //   103: aload #13
    //   105: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   108: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   111: aload #12
    //   113: sipush #7457
    //   116: sipush #-26732
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #12
    //   128: aload #6
    //   130: iconst_1
    //   131: iconst_0
    //   132: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: iload #11
    //   141: ifeq -> 272
    //   144: iconst_1
    //   145: anewarray burp/Zbqc
    //   148: invokestatic Zr : ([Lburp/Zbqc;)V
    //   151: aload_1
    //   152: getstatic burp/Zzu2.CSS_INJECTION_STORED : Lburp/Zzu2;
    //   155: if_acmpne -> 261
    //   158: aload #5
    //   160: invokevirtual Zx : ()Lburp/Zrp9;
    //   163: invokeinterface Zub : ()Lburp/Zll7;
    //   168: invokeinterface Zsf : ()Lburp/Zstu;
    //   173: invokeinterface Zis : ()Ljava/lang/String;
    //   178: astore #13
    //   180: aload #12
    //   182: aload #13
    //   184: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   187: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   190: aload #12
    //   192: sipush #7461
    //   195: sipush #15638
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload #12
    //   207: aload #5
    //   209: invokevirtual Zx : ()Lburp/Zrp9;
    //   212: invokeinterface Zvs : ()[B
    //   217: invokestatic ZG : ([B)Ljava/lang/String;
    //   220: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   223: aload #12
    //   225: sipush #7470
    //   228: sipush #1758
    //   231: invokestatic a : (II)Ljava/lang/String;
    //   234: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   237: pop
    //   238: aload #12
    //   240: aload #5
    //   242: invokevirtual Zx : ()Lburp/Zrp9;
    //   245: invokeinterface ZvM : ()[B
    //   250: invokestatic ZG : ([B)Ljava/lang/String;
    //   253: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   256: iload #11
    //   258: ifeq -> 272
    //   261: iconst_0
    //   262: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   265: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   268: ldc ''
    //   270: astore #13
    //   272: aload #12
    //   274: sipush #7458
    //   277: sipush #5248
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: pop
    //   287: aload #4
    //   289: getstatic burp/Ztz3.MATCH : Lburp/Ztz3;
    //   292: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   295: astore #14
    //   297: aload #13
    //   299: aload #14
    //   301: invokevirtual equals : (Ljava/lang/Object;)Z
    //   304: ifeq -> 327
    //   307: aload #12
    //   309: sipush #7469
    //   312: sipush #-16537
    //   315: invokestatic a : (II)Ljava/lang/String;
    //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   321: pop
    //   322: iload #11
    //   324: ifeq -> 364
    //   327: aload #12
    //   329: sipush #7462
    //   332: sipush #-23024
    //   335: invokestatic a : (II)Ljava/lang/String;
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload #12
    //   344: aload #14
    //   346: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   349: aload #12
    //   351: sipush #7460
    //   354: sipush #1490
    //   357: invokestatic a : (II)Ljava/lang/String;
    //   360: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: pop
    //   364: aload #12
    //   366: sipush #7468
    //   369: sipush #-7439
    //   372: invokestatic a : (II)Ljava/lang/String;
    //   375: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: sipush #7456
    //   381: sipush #-5768
    //   384: invokestatic a : (II)Ljava/lang/String;
    //   387: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: pop
    //   391: aload #12
    //   393: invokevirtual toString : ()Ljava/lang/String;
    //   396: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¹±f;²_9è½]Ýmë!^¢rN47Ì®æÄÜ«'¼TÈîúÕ@§)êåß\\tùõO%9õ*À>hëJr\\nQ°À¹%R©Sä~Í>ø.o«| =éÅ¬zR¾za¥?ÛêÜzcËÐ¦tíWWR¯/IãíÜ[P~´Ô8Â»sè)£¼ÃÒBÖ1½Õ`ÏqjK [¢úýez8Ð+Þî=Ñßòd%Ù*G*`ßñÁÄÑ\\tHnJé Üª¼ûV×Úä\\t!ÜtmT8»|ÊëiÏKªHXÍmùl|víp`¶ïN×ûÿ¤¿\\fB%²VÀ²ç\\n&wOoRkOÖÝ9Cm6(¥\\b2]}Þ¶t¹£ÎHLsÈuwçÙIüÊ£hä±³Lx\»ö·Îåã\\nÐ¡$P>Ü¯] J×Íê²EÚ_\fÊÃÓÑÅÃ¢DS4ló)'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #114
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc '¶"pm)¡\\n<Ú¬é®iè¨y?ÒûÏÙèkRmî³(ç!tÉ:¸\\b¹Fo'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #44
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
    //   128: putstatic burp/Zmmi.a : [Ljava/lang/String;
    //   131: bipush #12
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmmi.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
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
    //   212: bipush #116
    //   214: goto -> 243
    //   217: bipush #70
    //   219: goto -> 243
    //   222: bipush #58
    //   224: goto -> 243
    //   227: bipush #13
    //   229: goto -> 243
    //   232: bipush #11
    //   234: goto -> 243
    //   237: bipush #104
    //   239: goto -> 243
    //   242: iconst_5
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1D25) & 0xFFFF;
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
      char c = '¡';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */