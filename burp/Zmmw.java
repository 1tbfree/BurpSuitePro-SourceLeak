package burp;

public class Zmmw extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZO : ()[Lburp/Zbqc;
    //   3: astore #11
    //   5: aload #5
    //   7: invokevirtual Zg : ()Z
    //   10: ifne -> 22
    //   13: iconst_0
    //   14: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   17: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   20: aconst_null
    //   21: areturn
    //   22: aload #5
    //   24: invokevirtual Zd : ()Lburp/Zkcp;
    //   27: astore #12
    //   29: aload #12
    //   31: invokeinterface Zub : ()Lburp/Zll7;
    //   36: invokeinterface Zsf : ()Lburp/Zstu;
    //   41: invokeinterface ZiD : ()[B
    //   46: astore #13
    //   48: aload #4
    //   50: getstatic burp/Ztz3.REFLECTION : Lburp/Ztz3;
    //   53: invokevirtual Zm : (Lburp/Ztz3;)[B
    //   56: astore #14
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: astore #15
    //   67: aload #15
    //   69: sipush #-17841
    //   72: sipush #-3876
    //   75: invokestatic a : (II)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload #15
    //   84: aload #13
    //   86: invokestatic Zn : ([B)Ljava/lang/String;
    //   89: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   92: aload #15
    //   94: sipush #-17855
    //   97: sipush #15931
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload #15
    //   109: aload #6
    //   111: iconst_1
    //   112: iconst_1
    //   113: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload #13
    //   122: aload #14
    //   124: invokestatic ZQ : ([B[B)Z
    //   127: ifeq -> 150
    //   130: aload #15
    //   132: sipush #-17849
    //   135: sipush #5347
    //   138: invokestatic a : (II)Ljava/lang/String;
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: pop
    //   145: aload #11
    //   147: ifnonnull -> 190
    //   150: aload #15
    //   152: sipush #-17852
    //   155: sipush #-2465
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #15
    //   167: aload #14
    //   169: invokestatic Zn : ([B)Ljava/lang/String;
    //   172: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   175: aload #15
    //   177: sipush #-17854
    //   180: sipush #-30615
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload #15
    //   192: sipush #-17844
    //   195: sipush #4256
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload #4
    //   207: getstatic burp/Ztz3.ANGULAR_VERSION : Lburp/Ztz3;
    //   210: invokevirtual Zn : (Lburp/Ztz3;)Z
    //   213: ifeq -> 296
    //   216: aload #4
    //   218: getstatic burp/Ztz3.ANGULAR_VERSION : Lburp/Ztz3;
    //   221: invokevirtual Zm : (Lburp/Ztz3;)[B
    //   224: astore #16
    //   226: aload #15
    //   228: sipush #-17850
    //   231: sipush #29258
    //   234: invokestatic a : (II)Ljava/lang/String;
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   240: pop
    //   241: aload #15
    //   243: aload #16
    //   245: invokestatic Zn : ([B)Ljava/lang/String;
    //   248: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   251: aload #15
    //   253: sipush #-17853
    //   256: sipush #-12444
    //   259: invokestatic a : (II)Ljava/lang/String;
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload #15
    //   268: aload #16
    //   270: invokestatic Zn : ([B)Ljava/lang/String;
    //   273: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   276: aload #15
    //   278: sipush #-17856
    //   281: sipush #-5109
    //   284: invokestatic a : (II)Ljava/lang/String;
    //   287: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: pop
    //   291: aload #11
    //   293: ifnonnull -> 335
    //   296: aload #15
    //   298: sipush #-17851
    //   301: sipush #-29647
    //   304: invokestatic a : (II)Ljava/lang/String;
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: sipush #-17843
    //   313: sipush #31887
    //   316: invokestatic a : (II)Ljava/lang/String;
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: sipush #-17842
    //   325: sipush #25090
    //   328: invokestatic a : (II)Ljava/lang/String;
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload #15
    //   337: invokevirtual toString : ()Ljava/lang/String;
    //   340: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #12
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'dR¼À%_«ðÎ D]Ý/ú³$çYX¿àíîÜefIBÜíh¤V¹¬P\f®<óË\_Â-q\\nS»ØC¹qÆ¶Rvx©ÇjO5_tf+çv[´Ìäâ·÷Efóúeé9òDÉ@Zÿ·ÞÇ¢: v h"w¡Ã µ@éá,\\fU`³\\f§³hó_¹<>Ñ\\r©\\n¡XÏR½!1Ö8ð3éËéÕÔ\\tI¹áªûuõí|âq"y\\f¤ààêNRôJe·«Èè@HHÇriûåc,ÖÖpEð\\taÖ\\bf£¸;~Ø¯O×á¨5×i&ºôFæÕA×Sl1* â7&öß¥yèdQÞ«L_øNöpðÐ²[M²d8ÿåÀ­NÄßkHGh2:ôÁ þÝÚÑ×:9bþtë8w÷°Ö ºÄp°[$lÖfN¤)³(À_ÞòÂhéPÁë,ù7uïñÊÒ|ßó©âØ±Ü9;eßÑZ¦5×£^ÿ`¤¶6«ÆD\\f"¹é§³J²ÆCÿCr@§^ûÎal4ñÍWkeßØ;$³æeÜÿ:ø!/ññ\\bEBäõØcå:HlG"\¡v²æ)\\b.ö#þîÏ£UÑÇ)¸B°hkò :{p?àº®ßØáºOgújÌR#ºØ¬¾ßN¥ºZ¤ ][Þ´»¦'`º G¸RÆÒÀ/zÝÕ1!¥X=Ôí9]÷9\\bY>é\\nÝb²zYå6ÅW³×iOê(Û·*<ÿ#Ýý¬\\fjÿnêÊÑ±JmG#IÅëcVÔ!¬û&_¿1°KÌr\\fp4\\f\\tþROwÜM²±]0ÛÇ>Sf´êèo]è'4"6sHi1!WþOûÌ\\nËìÌ-À§õ\\b5íø\\n8¹Æ³G@n!ÅÄW²¡ þp¨×ãfNûv{Ì\\bùØZxÌ°\\båÙÃÎD_ýJlÞÝ<âßf;´Û\\fJÍÚ t6¬¨M«`ãxd?®n¸¶UÅÐ\(~ dÇà¼b?¾©¦=«nç55_¡'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #30
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #89
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 144
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
    //   68: ldc '«¯ùcú rY=y¦7jýåçè\\b/;"öcªêu«&@Óm©^~!´bxo?dÉ&ªsü÷|V±³Ã9£?m]ÓÉÔDJõRlý"¢¾H¦c½70Yµù\\nmÇYH\ÉõF¡ô\\r\\fÂ÷ª'd§×)¿e4¤íMS6¹±I\\f5¢¡dÎ/Î²hô¥+µ×Y(» ú¥Þ×!ûÅ¢DpmÞSÏáXagq%M´Ç Äú´®yÎjKDé±JùCêÜÍîÇ4IìÑK+=È`]ã ~¿ø ·sy\\fÍÿ".«z/pAfW]Ô¢q;©zéL@S^ZóÍjþRv4Xkë²YÉ?Þ÷¨"¹å¢Ê¹Ä´(`.Q®$üJ(áY<Dæ{Z9°T~c¶cZ"ObÞU#íSKºú.tòIü\\nKìgØR³+"s9´\\f´'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: sipush #228
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #51
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zmmw.a : [Ljava/lang/String;
    //   133: bipush #12
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zmmw.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 259
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_2
    //   213: goto -> 243
    //   216: bipush #72
    //   218: goto -> 243
    //   221: bipush #6
    //   223: goto -> 243
    //   226: bipush #86
    //   228: goto -> 243
    //   231: bipush #113
    //   233: goto -> 243
    //   236: bipush #88
    //   238: goto -> 243
    //   241: bipush #106
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 167
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 163
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFBA44) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */