package burp;

import java.util.EnumSet;

public class Zmme extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmme() {
    super(EnumSet.of(Zzqz.VARIANT, Zzqz.FLAGS));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: aload #12
    //   11: sipush #8735
    //   14: sipush #-780
    //   17: invokestatic a : (II)Ljava/lang/String;
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: invokestatic Zy : ()Ljava/lang/String;
    //   27: aload #12
    //   29: aload #6
    //   31: iconst_1
    //   32: iconst_1
    //   33: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: astore #11
    //   42: aload #12
    //   44: sipush #8734
    //   47: sipush #29624
    //   50: invokestatic a : (II)Ljava/lang/String;
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: pop
    //   57: iload_2
    //   58: lookupswitch default -> 88, 0 -> 76
    //   76: aload #11
    //   78: ifnull -> 97
    //   81: iconst_3
    //   82: anewarray burp/Zbqc
    //   85: invokestatic Zr : ([Lburp/Zbqc;)V
    //   88: iconst_0
    //   89: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   92: iload_2
    //   93: i2l
    //   94: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   97: iload_3
    //   98: iconst_1
    //   99: iand
    //   100: iconst_1
    //   101: if_icmpne -> 108
    //   104: iconst_1
    //   105: goto -> 109
    //   108: iconst_0
    //   109: istore #13
    //   111: iload #13
    //   113: ifeq -> 143
    //   116: aload #5
    //   118: invokevirtual Zd : ()Lburp/Zkcp;
    //   121: invokeinterface Zub : ()Lburp/Zll7;
    //   126: invokeinterface Zsf : ()Lburp/Zstu;
    //   131: invokeinterface ZiD : ()[B
    //   136: astore #14
    //   138: aload #11
    //   140: ifnull -> 165
    //   143: aload #5
    //   145: invokevirtual ZO : ()Lburp/Zg3y;
    //   148: invokeinterface Zub : ()Lburp/Zll7;
    //   153: invokeinterface Zsf : ()Lburp/Zstu;
    //   158: invokeinterface ZiD : ()[B
    //   163: astore #14
    //   165: aload #12
    //   167: sipush #8730
    //   170: sipush #-2647
    //   173: invokestatic a : (II)Ljava/lang/String;
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: pop
    //   180: aload #12
    //   182: aload #14
    //   184: invokestatic Zn : ([B)Ljava/lang/String;
    //   187: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   190: aload #12
    //   192: sipush #8725
    //   195: sipush #20073
    //   198: invokestatic a : (II)Ljava/lang/String;
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload #12
    //   207: aload #6
    //   209: iconst_1
    //   210: iconst_0
    //   211: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: pop
    //   218: aload #12
    //   220: sipush #8729
    //   223: sipush #-12778
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: iload #13
    //   235: ifeq -> 281
    //   238: aload #12
    //   240: sipush #8733
    //   243: sipush #21107
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: aload #4
    //   254: getstatic burp/Ztz3.FILENAME : Lburp/Ztz3;
    //   257: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: sipush #8728
    //   266: sipush #-23558
    //   269: invokestatic a : (II)Ljava/lang/String;
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload #11
    //   278: ifnull -> 339
    //   281: aload #12
    //   283: sipush #8731
    //   286: sipush #10995
    //   289: invokestatic a : (II)Ljava/lang/String;
    //   292: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: pop
    //   296: aload #12
    //   298: aload #5
    //   300: invokevirtual ZO : ()Lburp/Zg3y;
    //   303: invokeinterface ZXh : ()Lburp/Zll7;
    //   308: invokeinterface Zsf : ()Lburp/Zstu;
    //   313: invokeinterface ZiD : ()[B
    //   318: invokestatic Zn : ([B)Ljava/lang/String;
    //   321: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   324: aload #12
    //   326: sipush #8732
    //   329: sipush #-27476
    //   332: invokestatic a : (II)Ljava/lang/String;
    //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload #12
    //   341: invokevirtual toString : ()Ljava/lang/String;
    //   344: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ã_£\²÷½Cc#ùh¶-ÛÉ¡)ÉG;Gêí\\fÝajþÓ \6y3mè'Ù2ÓxÖ!º¼µÐkH8ã,µ^Ú9V\\nÝFÿ"1zF\\r¨°Mj+òeí±ãi]ÄÌ^wËL]Þ§±k"¢¸³º3±îèÛ£¿|*çç\\bÝ+Û¤:²¤g¶å%JÍ¸³þd1SC=÷ÎOíàI½Ò¿7ÓTÉi*h.c3ÕÏ92aÚaËçç©ÎÊW4áEÞ½ùeÅÇ ðlJÔK»£_ ã+$-XC\\t`-­ùDÓflùôÀÀ!S¤Z°¦#ÃÃblî_ü`J¤ÇùÁFWªJY#e^7dè?'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #74
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
    //   68: ldc 'ýôÜe`¤Rª8p÷ø&"÷rÌ!wS1ò,SÆÔX_Ü\\nã=ôwå'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #23
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #27
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
    //   129: putstatic burp/Zmme.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmme.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 236
    //   212: bipush #106
    //   214: goto -> 243
    //   217: bipush #11
    //   219: goto -> 243
    //   222: bipush #42
    //   224: goto -> 243
    //   227: bipush #66
    //   229: goto -> 243
    //   232: iconst_3
    //   233: goto -> 243
    //   236: bipush #80
    //   238: goto -> 243
    //   241: bipush #42
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x221D) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */