package burp;

import java.util.List;

public class Zthf implements Zbnd {
  private static final List<String> Zk;
  
  private static final List<String> ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zgho ZS(String paramString) {
    return (Zk.contains(paramString) || ZK.contains(paramString)) ? Zgho.valueOf(a(14662, -9994) + a(14662, -9994)) : (a(14681, -23596).equals(paramString) ? Zgho.KEYWORD_NULL : null);
  }
  
  static {
    // Byte code:
    //   0: bipush #35
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ëÔôÞ{ác³m3ÙHr$Ëaé6õ7Ã\\bÇ¾üWh/c[Ý44ö\\tGÙìËnjh¶98b h\\b¸íÈØJ!F\\rä_öAèGhnRû,\\\b@t!*eI®U=ä=$¢,¿SL\\bø+µãfjgµØÃW%Õ5çÇw-l{l~Ë­ªWÝ Åº'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #10
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #43
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
    //   68: ldc ' öðC)Ó¶±'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #78
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
    //   128: putstatic burp/Zthf.a : [Ljava/lang/String;
    //   131: bipush #35
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zthf.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
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
    //   212: bipush #108
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #125
    //   224: goto -> 244
    //   227: bipush #116
    //   229: goto -> 244
    //   232: bipush #120
    //   234: goto -> 244
    //   237: bipush #110
    //   239: goto -> 244
    //   242: bipush #127
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: bipush #31
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #14666
    //   310: sipush #15387
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #14687
    //   322: sipush #-12370
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #14678
    //   334: sipush #16234
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #14660
    //   346: sipush #-738
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #14680
    //   358: sipush #21259
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #14669
    //   370: sipush #727
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #6
    //   380: sipush #14665
    //   383: sipush #-4062
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aastore
    //   390: dup
    //   391: bipush #7
    //   393: sipush #14711
    //   396: sipush #30766
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #8
    //   406: sipush #14664
    //   409: sipush #-28143
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #9
    //   419: sipush #14684
    //   422: sipush #26998
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #10
    //   432: sipush #14675
    //   435: sipush #-21093
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: bipush #11
    //   445: sipush #14671
    //   448: sipush #-6718
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush #12
    //   458: sipush #14672
    //   461: sipush #6739
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: bipush #13
    //   471: sipush #14657
    //   474: sipush #23922
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: aastore
    //   481: dup
    //   482: bipush #14
    //   484: sipush #14683
    //   487: sipush #-20911
    //   490: invokestatic a : (II)Ljava/lang/String;
    //   493: aastore
    //   494: dup
    //   495: bipush #15
    //   497: sipush #14670
    //   500: sipush #4055
    //   503: invokestatic a : (II)Ljava/lang/String;
    //   506: aastore
    //   507: dup
    //   508: bipush #16
    //   510: sipush #14677
    //   513: sipush #9743
    //   516: invokestatic a : (II)Ljava/lang/String;
    //   519: aastore
    //   520: dup
    //   521: bipush #17
    //   523: sipush #14686
    //   526: sipush #-25836
    //   529: invokestatic a : (II)Ljava/lang/String;
    //   532: aastore
    //   533: dup
    //   534: bipush #18
    //   536: sipush #14682
    //   539: sipush #-24816
    //   542: invokestatic a : (II)Ljava/lang/String;
    //   545: aastore
    //   546: dup
    //   547: bipush #19
    //   549: sipush #14658
    //   552: sipush #-18201
    //   555: invokestatic a : (II)Ljava/lang/String;
    //   558: aastore
    //   559: dup
    //   560: bipush #20
    //   562: sipush #14667
    //   565: sipush #-10987
    //   568: invokestatic a : (II)Ljava/lang/String;
    //   571: aastore
    //   572: dup
    //   573: bipush #21
    //   575: sipush #14674
    //   578: sipush #-30537
    //   581: invokestatic a : (II)Ljava/lang/String;
    //   584: aastore
    //   585: dup
    //   586: bipush #22
    //   588: sipush #14709
    //   591: sipush #1179
    //   594: invokestatic a : (II)Ljava/lang/String;
    //   597: aastore
    //   598: dup
    //   599: bipush #23
    //   601: sipush #14679
    //   604: sipush #-13623
    //   607: invokestatic a : (II)Ljava/lang/String;
    //   610: aastore
    //   611: dup
    //   612: bipush #24
    //   614: sipush #14673
    //   617: sipush #-12709
    //   620: invokestatic a : (II)Ljava/lang/String;
    //   623: aastore
    //   624: dup
    //   625: bipush #25
    //   627: sipush #14708
    //   630: sipush #11291
    //   633: invokestatic a : (II)Ljava/lang/String;
    //   636: aastore
    //   637: dup
    //   638: bipush #26
    //   640: sipush #14668
    //   643: sipush #-19362
    //   646: invokestatic a : (II)Ljava/lang/String;
    //   649: aastore
    //   650: dup
    //   651: bipush #27
    //   653: sipush #14676
    //   656: sipush #-15638
    //   659: invokestatic a : (II)Ljava/lang/String;
    //   662: aastore
    //   663: dup
    //   664: bipush #28
    //   666: sipush #14661
    //   669: sipush #-4997
    //   672: invokestatic a : (II)Ljava/lang/String;
    //   675: aastore
    //   676: dup
    //   677: bipush #29
    //   679: sipush #14656
    //   682: sipush #13671
    //   685: invokestatic a : (II)Ljava/lang/String;
    //   688: aastore
    //   689: dup
    //   690: bipush #30
    //   692: sipush #14663
    //   695: sipush #-16261
    //   698: invokestatic a : (II)Ljava/lang/String;
    //   701: aastore
    //   702: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   705: putstatic burp/Zthf.Zk : Ljava/util/List;
    //   708: iconst_2
    //   709: anewarray java/lang/String
    //   712: dup
    //   713: iconst_0
    //   714: sipush #14685
    //   717: sipush #15779
    //   720: invokestatic a : (II)Ljava/lang/String;
    //   723: aastore
    //   724: dup
    //   725: iconst_1
    //   726: sipush #14659
    //   729: sipush #13858
    //   732: invokestatic a : (II)Ljava/lang/String;
    //   735: aastore
    //   736: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   739: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   742: putstatic burp/Zthf.ZK : Ljava/util/List;
    //   745: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3955) & 0xFFFF;
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
      byte b1 = 111;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zthf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */