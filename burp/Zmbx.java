package burp;

import java.util.EnumSet;

public class Zmbx extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmbx() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic ZU : ()[Ljava/lang/String;
    //   12: aload #12
    //   14: sipush #-28245
    //   17: sipush #20691
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
    //   40: aload #12
    //   42: sipush #-28241
    //   45: sipush #27046
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: astore #11
    //   57: iload_2
    //   58: tableswitch default -> 126, 0 -> 84, 1 -> 111, 2 -> 111
    //   84: aload #12
    //   86: sipush #-28244
    //   89: sipush #25154
    //   92: invokestatic a : (II)Ljava/lang/String;
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload #11
    //   101: ifnonnull -> 126
    //   104: iconst_5
    //   105: anewarray burp/Zbqc
    //   108: invokestatic Zr : ([Lburp/Zbqc;)V
    //   111: aload #12
    //   113: sipush #-28243
    //   116: sipush #-17597
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload #12
    //   128: sipush #-28250
    //   131: sipush #11120
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload #12
    //   143: sipush #-28251
    //   146: sipush #-28443
    //   149: invokestatic a : (II)Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: pop
    //   156: aload #4
    //   158: getstatic burp/Ztz3.MATCH : Lburp/Ztz3;
    //   161: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   164: astore #13
    //   166: aload_1
    //   167: getstatic burp/Zzu2.LINK_MANIPULATION_REFLECTED : Lburp/Zzu2;
    //   170: if_acmpne -> 238
    //   173: aload #5
    //   175: invokevirtual Zd : ()Lburp/Zkcp;
    //   178: invokeinterface Zub : ()Lburp/Zll7;
    //   183: invokeinterface Zsf : ()Lburp/Zstu;
    //   188: invokeinterface Zis : ()Ljava/lang/String;
    //   193: astore #14
    //   195: aload #12
    //   197: aload #14
    //   199: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   202: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   205: aload #12
    //   207: sipush #-28255
    //   210: sipush #8380
    //   213: invokestatic a : (II)Ljava/lang/String;
    //   216: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: aload #12
    //   222: aload #6
    //   224: iconst_1
    //   225: iconst_0
    //   226: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: aload #11
    //   235: ifnonnull -> 359
    //   238: aload_1
    //   239: getstatic burp/Zzu2.LINK_MANIPULATION_STORED : Lburp/Zzu2;
    //   242: if_acmpne -> 348
    //   245: aload #5
    //   247: invokevirtual Zx : ()Lburp/Zrp9;
    //   250: invokeinterface Zub : ()Lburp/Zll7;
    //   255: invokeinterface Zsf : ()Lburp/Zstu;
    //   260: invokeinterface Zis : ()Ljava/lang/String;
    //   265: astore #14
    //   267: aload #12
    //   269: aload #14
    //   271: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   274: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   277: aload #12
    //   279: sipush #-28253
    //   282: sipush #29188
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload #12
    //   294: aload #5
    //   296: invokevirtual Zx : ()Lburp/Zrp9;
    //   299: invokeinterface Zvs : ()[B
    //   304: invokestatic ZG : ([B)Ljava/lang/String;
    //   307: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   310: aload #12
    //   312: sipush #-28242
    //   315: sipush #-25621
    //   318: invokestatic a : (II)Ljava/lang/String;
    //   321: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: pop
    //   325: aload #12
    //   327: aload #5
    //   329: invokevirtual Zx : ()Lburp/Zrp9;
    //   332: invokeinterface ZvM : ()[B
    //   337: invokestatic ZG : ([B)Ljava/lang/String;
    //   340: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   343: aload #11
    //   345: ifnonnull -> 359
    //   348: iconst_0
    //   349: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   352: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   355: ldc ''
    //   357: astore #14
    //   359: aload #12
    //   361: sipush #-28252
    //   364: sipush #-13579
    //   367: invokestatic a : (II)Ljava/lang/String;
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: pop
    //   374: aload #14
    //   376: aload #13
    //   378: invokevirtual equals : (Ljava/lang/Object;)Z
    //   381: ifeq -> 404
    //   384: aload #12
    //   386: sipush #-28254
    //   389: sipush #-25672
    //   392: invokestatic a : (II)Ljava/lang/String;
    //   395: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: pop
    //   399: aload #11
    //   401: ifnonnull -> 441
    //   404: aload #12
    //   406: sipush #-28246
    //   409: sipush #-9714
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: pop
    //   419: aload #12
    //   421: aload #13
    //   423: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   426: aload #12
    //   428: sipush #-28249
    //   431: sipush #-2468
    //   434: invokestatic a : (II)Ljava/lang/String;
    //   437: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: pop
    //   441: aload #4
    //   443: aload #12
    //   445: invokestatic ZS : (Lburp/Ztlj;Ljava/lang/StringBuilder;)V
    //   448: aload #12
    //   450: sipush #-28248
    //   453: sipush #4794
    //   456: invokestatic a : (II)Ljava/lang/String;
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: iload_2
    //   464: tableswitch default -> 527, 0 -> 492, 1 -> 512, 2 -> 512
    //   492: aload #12
    //   494: sipush #-28226
    //   497: sipush #-6738
    //   500: invokestatic a : (II)Ljava/lang/String;
    //   503: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload #11
    //   509: ifnonnull -> 527
    //   512: aload #12
    //   514: sipush #-28247
    //   517: sipush #884
    //   520: invokestatic a : (II)Ljava/lang/String;
    //   523: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: pop
    //   527: iload_2
    //   528: iconst_2
    //   529: if_icmpne -> 547
    //   532: aload #12
    //   534: sipush #-28256
    //   537: sipush #16993
    //   540: invokestatic a : (II)Ljava/lang/String;
    //   543: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   546: pop
    //   547: aload #12
    //   549: invokevirtual toString : ()Ljava/lang/String;
    //   552: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'âdØt¿¶iÖI#Â{u¾º!7¶^ðåëþ`1Tò:´$b®^'+b­t.vaöÀa­HLâq»>\\r1Á´°>ãa^eêÇ+ñ\\nÕ°n\ÞKt¬ñ-¨C/¿,ø)¯]Ñ²rªQfä¢_ËåO_5\\rjUÕÖ¢­PÀ®v|ÊXòþ"Í$¬ñ·mÿYaøëë£5÷5ò­ßkk³kN~1ÕHLs'yÔrP[tÂ¢ÆYOO½¶`åü¹i4Xw°Æ?½P"suñ\\nÖqNr¯ÙÐàR"ÅMùï0&&Ô?m@£Y%½¹E\\npúÝNÍDw²ÄjRIÂNÅ\\n©Â:\\r¹,Ã8>øk^µ#cH)3N²OEìTöc1±t7t)S¶Õyr\\t±?0\\f%L\åÎùd^ÉöÎ®&R}ÉÜ:\±,ÆJoÙµ\\f¼â>pYAª1ÔÞúÅÌK/ÑEá¨q÷µo­íNïûsÁúd©[ÊÍîQ ½¨:§6Ò¯(¾bù\\fuPM~'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #41
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #40
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
    //   68: ldc 'µwÞÅ&æ=fMk®­×y\\b~v/ÝæÛbaF¶'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #26
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #69
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
    //   129: putstatic burp/Zmbx.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmbx.b : [Ljava/lang/String;
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
    //   212: bipush #116
    //   214: goto -> 244
    //   217: bipush #57
    //   219: goto -> 244
    //   222: bipush #60
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #79
    //   234: goto -> 244
    //   237: bipush #84
    //   239: goto -> 244
    //   242: bipush #31
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
    int i = (paramInt1 ^ 0xFFFF91AE) & 0xFFFF;
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
      char c = 'Æ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */