package burp;

import java.util.EnumSet;

public class Zmma extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmma() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #12
    //   9: invokestatic Zb : ()Ljava/lang/String;
    //   12: aload #12
    //   14: sipush #-25727
    //   17: sipush #629
    //   20: invokestatic a : (II)Ljava/lang/String;
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: astore #11
    //   29: aload #12
    //   31: aload #6
    //   33: iconst_1
    //   34: iconst_1
    //   35: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: pop
    //   42: iload #9
    //   44: iconst_1
    //   45: if_icmpne -> 75
    //   48: aload #12
    //   50: sipush #-25722
    //   53: sipush #10201
    //   56: invokestatic a : (II)Ljava/lang/String;
    //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: aload #11
    //   65: ifnull -> 90
    //   68: iconst_4
    //   69: anewarray burp/Zbqc
    //   72: invokestatic Zr : ([Lburp/Zbqc;)V
    //   75: aload #12
    //   77: sipush #-25724
    //   80: sipush #9904
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload #12
    //   92: sipush #-25725
    //   95: sipush #16382
    //   98: invokestatic a : (II)Ljava/lang/String;
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: iload_2
    //   106: iconst_3
    //   107: if_icmpeq -> 181
    //   110: aload #12
    //   112: sipush #-25728
    //   115: sipush #14933
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: aload #12
    //   127: aload #5
    //   129: invokevirtual Zd : ()Lburp/Zkcp;
    //   132: invokeinterface Zub : ()Lburp/Zll7;
    //   137: invokeinterface Zsf : ()Lburp/Zstu;
    //   142: invokeinterface Zis : ()Ljava/lang/String;
    //   147: invokestatic ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   150: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   153: aload #12
    //   155: sipush #-25721
    //   158: sipush #5960
    //   161: invokestatic a : (II)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload #12
    //   170: aload #6
    //   172: iconst_1
    //   173: iconst_0
    //   174: invokestatic Zt : (Lburp/Zefg;ZZ)Ljava/lang/String;
    //   177: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: iload_2
    //   182: tableswitch default -> 277, 0 -> 212, 1 -> 232, 2 -> 252, 3 -> 272
    //   212: aload #12
    //   214: sipush #-25715
    //   217: sipush #-2897
    //   220: invokestatic a : (II)Ljava/lang/String;
    //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: pop
    //   227: aload #11
    //   229: ifnull -> 286
    //   232: aload #12
    //   234: sipush #-25726
    //   237: sipush #-1900
    //   240: invokestatic a : (II)Ljava/lang/String;
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload #11
    //   249: ifnull -> 286
    //   252: aload #12
    //   254: sipush #-25723
    //   257: sipush #-9447
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #11
    //   269: ifnull -> 286
    //   272: aload #11
    //   274: ifnull -> 286
    //   277: iconst_0
    //   278: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   281: iload_2
    //   282: i2l
    //   283: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   286: aload #5
    //   288: invokevirtual Zk : ()Z
    //   291: ifeq -> 306
    //   294: aload #12
    //   296: invokestatic ZO : (Ljava/lang/StringBuilder;)V
    //   299: aload #5
    //   301: aload #12
    //   303: invokestatic ZV : (Lburp/Ztub;Ljava/lang/StringBuilder;)V
    //   306: aload #12
    //   308: invokevirtual toString : ()Ljava/lang/String;
    //   311: areturn
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return Zp.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public byte Zj(Ztlj paramZtlj, Ztub paramZtub, byte paramByte, int paramInt, Zs66 paramZs66, byte[] paramArrayOfbyte, Zrdb paramZrdb) {
    return (paramZtub.Za() == 4) ? 1 : 4;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ô{Ù8­9ñÜÇPÀÚãÔÚÏ¥"C*Ûªõú¾@b¶æÕõ»R;ë¬o²©"&ÝaU84àBEÿïÅÀ_­`ÊêóÉt'À#pã1l¾nÕT×`¨ÎèJºcWðÏtÛÜkG\\r4+4,×Z¿u`àCæÑé+&jà<Õóå¶¨g ´ñîÃ6Yþ="4äJR¿f8b$mMZn÷+j6ÅåÖ"DÜYøùØ?¥Ô|^0w6\\tðÑØÛúºw÷)5 =\\n`1ié>­Çc¯¦S·û³Æ¹Õ;E£ú8¦¨ÿ@ì\\Øyâu^&¼0]ô?ÊtÊÙõJÈ5ê½­äÿ-½»°\\rOâÊbÌ&Ì~ªð[vç{°ñ\RuABW%ÓiÖ\\r½²õuª0_ûh`Ôú'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #178
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #123
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 145
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '¸M£9Ö}\\bÃÏÍN<¿BâaRË¹¥£·Õ6[:êépvAl*bÀa¬X®Ü>;·|TvæisÙ.Y+Aóªþí¾%B[èÎoiHûûÕÅÁ±Õ²¹EöÐÀX;ñ«8Çµ»ûÑô[¿\\tLÓ^!éÅxì3p,Ã4Aùj#xQ õ÷ª«@H½Sú\\fà.©r°8²ÐJX³Dô;R§«º$¬C!ðiybN^Læ=ã­FèöC¸90Ja'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: sipush #156
    //   81: istore_1
    //   82: iconst_m1
    //   83: istore_0
    //   84: bipush #80
    //   86: iinc #0, 1
    //   89: aload_2
    //   90: iload_0
    //   91: dup
    //   92: iload_1
    //   93: iadd
    //   94: invokevirtual substring : (II)Ljava/lang/String;
    //   97: iconst_0
    //   98: goto -> 145
    //   101: aload #5
    //   103: swap
    //   104: iload_3
    //   105: iinc #3, 1
    //   108: swap
    //   109: aastore
    //   110: iload_0
    //   111: iload_1
    //   112: iadd
    //   113: dup
    //   114: istore_0
    //   115: iload #4
    //   117: if_icmpge -> 129
    //   120: aload_2
    //   121: iload_0
    //   122: invokevirtual charAt : (I)C
    //   125: istore_1
    //   126: goto -> 84
    //   129: aload #5
    //   131: putstatic burp/Zmma.a : [Ljava/lang/String;
    //   134: bipush #9
    //   136: anewarray java/lang/String
    //   139: putstatic burp/Zmma.b : [Ljava/lang/String;
    //   142: goto -> 304
    //   145: dup_x2
    //   146: pop
    //   147: invokevirtual toCharArray : ()[C
    //   150: dup_x1
    //   151: arraylength
    //   152: dup_x2
    //   153: pop
    //   154: iconst_0
    //   155: istore #6
    //   157: dup2_x1
    //   158: pop2
    //   159: dup_x2
    //   160: iconst_1
    //   161: if_icmpgt -> 263
    //   164: dup2
    //   165: swap
    //   166: iload #6
    //   168: dup2_x1
    //   169: caload
    //   170: swap
    //   171: iload #6
    //   173: bipush #7
    //   175: irem
    //   176: tableswitch default -> 245, 0 -> 216, 1 -> 220, 2 -> 225, 3 -> 230, 4 -> 235, 5 -> 240
    //   216: iconst_2
    //   217: goto -> 247
    //   220: bipush #7
    //   222: goto -> 247
    //   225: bipush #10
    //   227: goto -> 247
    //   230: bipush #66
    //   232: goto -> 247
    //   235: bipush #28
    //   237: goto -> 247
    //   240: bipush #26
    //   242: goto -> 247
    //   245: bipush #22
    //   247: ixor
    //   248: ixor
    //   249: i2c
    //   250: castore
    //   251: iinc #6, 1
    //   254: dup
    //   255: ifne -> 263
    //   258: dup2
    //   259: dup_x1
    //   260: goto -> 168
    //   263: dup2_x1
    //   264: pop2
    //   265: dup_x2
    //   266: iload #6
    //   268: if_icmpgt -> 164
    //   271: pop
    //   272: new java/lang/String
    //   275: dup_x1
    //   276: swap
    //   277: invokespecial <init> : ([C)V
    //   280: invokevirtual intern : ()Ljava/lang/String;
    //   283: swap
    //   284: pop
    //   285: swap
    //   286: tableswitch default -> 41, 0 -> 101
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF9B85) & 0xFFFF;
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
      byte b1 = 83;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmma.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */