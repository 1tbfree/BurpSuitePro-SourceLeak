package burp;

import java.util.EnumSet;

public class Zmbv extends Zmvg {
  private static final String[] a;
  
  private static final String[] b;
  
  public Zmbv() {
    super(EnumSet.of(Zzqz.VARIANT));
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    // Byte code:
    //   0: invokestatic ZQ : ()I
    //   3: istore #11
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore #12
    //   14: iload_2
    //   15: lookupswitch default -> 258, 0 -> 40, 1 -> 238
    //   40: aload #4
    //   42: getstatic burp/Ztz3.FIELD_NAMES : Lburp/Ztz3;
    //   45: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   48: ldc ','
    //   50: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   53: astore #13
    //   55: aload #12
    //   57: sipush #-20922
    //   60: sipush #6749
    //   63: invokestatic a : (II)Ljava/lang/String;
    //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: pop
    //   70: aload #12
    //   72: aload #4
    //   74: getstatic burp/Ztz3.ACTION_URL : Lburp/Ztz3;
    //   77: invokevirtual ZJ : (Lburp/Ztz3;)Ljava/lang/String;
    //   80: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   83: aload #12
    //   85: sipush #-20925
    //   88: sipush #16956
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: aload #12
    //   100: aload #13
    //   102: arraylength
    //   103: iconst_1
    //   104: if_icmpne -> 119
    //   107: sipush #-20920
    //   110: sipush #-14790
    //   113: invokestatic a : (II)Ljava/lang/String;
    //   116: goto -> 128
    //   119: sipush #-20924
    //   122: sipush #27182
    //   125: invokestatic a : (II)Ljava/lang/String;
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload #12
    //   134: sipush #-20921
    //   137: sipush #6974
    //   140: invokestatic a : (II)Ljava/lang/String;
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: aload #13
    //   149: astore #14
    //   151: aload #14
    //   153: arraylength
    //   154: istore #15
    //   156: iconst_0
    //   157: istore #16
    //   159: iload #16
    //   161: iload #15
    //   163: if_icmpge -> 218
    //   166: aload #14
    //   168: iload #16
    //   170: aaload
    //   171: astore #17
    //   173: aload #12
    //   175: sipush #-20927
    //   178: sipush #-6051
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: aload #12
    //   190: aload #17
    //   192: invokestatic Zn : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   195: aload #12
    //   197: sipush #-20923
    //   200: sipush #-23155
    //   203: invokestatic a : (II)Ljava/lang/String;
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: pop
    //   210: iinc #16, 1
    //   213: iload #11
    //   215: ifne -> 159
    //   218: aload #12
    //   220: sipush #-20926
    //   223: sipush #32355
    //   226: invokestatic a : (II)Ljava/lang/String;
    //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: pop
    //   233: iload #11
    //   235: ifne -> 267
    //   238: aload #12
    //   240: sipush #-20928
    //   243: sipush #24053
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: iload #11
    //   255: ifne -> 267
    //   258: iconst_0
    //   259: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   262: iload_2
    //   263: i2l
    //   264: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   267: aload #12
    //   269: aload #4
    //   271: aload #5
    //   273: invokestatic ZG : (Ljava/lang/StringBuilder;Lburp/Ztlj;Lburp/Ztub;)V
    //   276: aload #12
    //   278: invokevirtual toString : ()Ljava/lang/String;
    //   281: invokestatic Zwu : ()[Lburp/Zbqc;
    //   284: ifnonnull -> 295
    //   287: iinc #11, 1
    //   290: iload #11
    //   292: invokestatic Zv : (I)V
    //   295: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '?^êÓ¶¾ÍíoAõBÆÊ "9ìwSÞÇ\\bPÇç» ÿCÈ`0Þ8µ*Ã+<JO5ýªL%td¡ª?ÿ_\\nd¯C{&\\rWà­3rM^òÓBÈRy²ü* [ç[ü£ð@¸{"Tu';ä$·\\fREZ.]²z3iâ}ºìPtÞ[}ÌÖKf|0ó®'¾naâ´´Õ¬Kå\\ré1ÛBùFU°Q£3½SIåÔ>×Å©Pô4ª;q+\\bzã\\bmr\\tÛ\\bcþ¢M9ÆG~?·M£Í'I\Ns-[nhc'aüÅ_õ@± ³wàþ^­ç4N\\fÀõÐµÂíFÛª#¢¾÷wÙ²!?Ç&QÂjs®ßd¦d×.PÞsbOúØË2ºÿUùÎQ(ÈêÍe}RÛJÖê\\téÂa\\fmêeßö'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #171
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #100
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 143
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
    //   69: ldc 'ÆÛ'sâ<OS'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: iconst_5
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
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
    //   129: putstatic burp/Zmbv.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zmbv.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_3
    //   213: goto -> 243
    //   216: bipush #38
    //   218: goto -> 243
    //   221: bipush #62
    //   223: goto -> 243
    //   226: bipush #113
    //   228: goto -> 243
    //   231: bipush #127
    //   233: goto -> 243
    //   236: bipush #67
    //   238: goto -> 243
    //   241: bipush #83
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
    //   282: tableswitch default -> 41, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAE40) & 0xFFFF;
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
      char c = 'ú';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmbv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */