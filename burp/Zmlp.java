package burp;

import java.util.List;

class Zmlp implements Zb4e {
  private final Zs1h ZG;
  
  private final Zr_4 ZU;
  
  private final Zbnt Zx;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmlp(Zs1h paramZs1h, Zr_4 paramZr_4, Zbnt paramZbnt) {
    this.ZG = paramZs1h;
    this.ZU = paramZr_4;
    this.Zx = paramZbnt;
  }
  
  public boolean Zc() {
    return this.ZG.ZO();
  }
  
  public Zsgw ZX(Zsgw paramZsgw, List<Zkg1> paramList, Zlgm paramZlgm, Ze44 paramZe44, int paramInt) {
    // Byte code:
    //   0: invokestatic Zr : ()Z
    //   3: istore #6
    //   5: aload_2
    //   6: invokeinterface isEmpty : ()Z
    //   11: ifeq -> 16
    //   14: aload_1
    //   15: areturn
    //   16: aload_2
    //   17: aload_2
    //   18: invokeinterface size : ()I
    //   23: iconst_1
    //   24: isub
    //   25: invokeinterface get : (I)Ljava/lang/Object;
    //   30: checkcast burp/Zkg1
    //   33: astore #7
    //   35: aload #7
    //   37: ifnull -> 48
    //   40: aload #7
    //   42: getfield ZP : Lburp/Zs68;
    //   45: ifnonnull -> 50
    //   48: aload_1
    //   49: areturn
    //   50: aload_1
    //   51: getfield Zi : Lburp/Zsxd;
    //   54: invokeinterface ZG : ()Lburp/Zg3d;
    //   59: invokeinterface ZR : ()Lburp/Zefx;
    //   64: astore #8
    //   66: aload #8
    //   68: aload_0
    //   69: aload_3
    //   70: <illegal opcode> test : (Lburp/Zmlp;Lburp/Zlgm;)Ljava/util/function/Predicate;
    //   75: invokeinterface ZZ : (Ljava/util/function/Predicate;)Ljava/util/List;
    //   80: astore #9
    //   82: aload #9
    //   84: invokeinterface iterator : ()Ljava/util/Iterator;
    //   89: astore #10
    //   91: aload #10
    //   93: invokeinterface hasNext : ()Z
    //   98: ifeq -> 430
    //   101: aload #10
    //   103: invokeinterface next : ()Ljava/lang/Object;
    //   108: checkcast burp/Zlou
    //   111: astore #11
    //   113: aload #7
    //   115: getfield Zx : Lburp/Zstu;
    //   118: invokeinterface ZiD : ()[B
    //   123: aload #7
    //   125: getfield ZC : Lburp/Zlit;
    //   128: aload #7
    //   130: getfield Za : Lburp/Zstu;
    //   133: ifnonnull -> 140
    //   136: aconst_null
    //   137: goto -> 150
    //   140: aload #7
    //   142: getfield Za : Lburp/Zstu;
    //   145: invokeinterface ZiD : ()[B
    //   150: aload #7
    //   152: getfield ZP : Lburp/Zs68;
    //   155: aload #8
    //   157: invokeinterface Zr : ()Ljava/lang/String;
    //   162: aload #8
    //   164: invokeinterface ZF : ()Lburp/Zlit;
    //   169: aload #7
    //   171: getfield ZL : Lburp/Ztpb;
    //   174: invokevirtual Zh : ()Lburp/Zefg;
    //   177: aload #11
    //   179: getfield ZA : Ljava/lang/String;
    //   182: aload #11
    //   184: getfield Zx : Lburp/Zrdu;
    //   187: iconst_0
    //   188: aload_0
    //   189: getfield Zx : Lburp/Zbnt;
    //   192: aload_0
    //   193: getfield ZU : Lburp/Zr_4;
    //   196: invokestatic ZN : ([BLburp/Zlit;[BLburp/Zs68;Ljava/lang/String;Lburp/Zlit;Lburp/Zefg;Ljava/lang/String;Lburp/Zrdu;ZLburp/Zbnt;Lburp/Zr_4;)Ljava/lang/String;
    //   199: astore #12
    //   201: aload #12
    //   203: ifnonnull -> 297
    //   206: aload_0
    //   207: getfield ZG : Lburp/Zs1h;
    //   210: invokevirtual Zz : ()Z
    //   213: ifeq -> 297
    //   216: aload #7
    //   218: getfield Zx : Lburp/Zstu;
    //   221: invokeinterface ZiD : ()[B
    //   226: aload #7
    //   228: getfield ZC : Lburp/Zlit;
    //   231: aload #7
    //   233: getfield Za : Lburp/Zstu;
    //   236: ifnonnull -> 243
    //   239: aconst_null
    //   240: goto -> 253
    //   243: aload #7
    //   245: getfield Za : Lburp/Zstu;
    //   248: invokeinterface ZiD : ()[B
    //   253: aload #7
    //   255: getfield ZP : Lburp/Zs68;
    //   258: aload #8
    //   260: invokeinterface Zr : ()Ljava/lang/String;
    //   265: aload #8
    //   267: invokeinterface ZF : ()Lburp/Zlit;
    //   272: aconst_null
    //   273: aload #11
    //   275: getfield ZA : Ljava/lang/String;
    //   278: aload #11
    //   280: getfield Zx : Lburp/Zrdu;
    //   283: iconst_1
    //   284: aload_0
    //   285: getfield Zx : Lburp/Zbnt;
    //   288: aload_0
    //   289: getfield ZU : Lburp/Zr_4;
    //   292: invokestatic ZN : ([BLburp/Zlit;[BLburp/Zs68;Ljava/lang/String;Lburp/Zlit;Lburp/Zefg;Ljava/lang/String;Lburp/Zrdu;ZLburp/Zbnt;Lburp/Zr_4;)Ljava/lang/String;
    //   295: astore #12
    //   297: aload #12
    //   299: ifnonnull -> 305
    //   302: goto -> 91
    //   305: aload #11
    //   307: getfield Zx : Lburp/Zrdu;
    //   310: invokevirtual Za : ()Z
    //   313: ifeq -> 323
    //   316: aload #12
    //   318: invokestatic Zk : (Ljava/lang/String;)Ljava/lang/String;
    //   321: astore #12
    //   323: aload #8
    //   325: aload #11
    //   327: getfield ZA : Ljava/lang/String;
    //   330: aload #11
    //   332: getfield Zx : Lburp/Zrdu;
    //   335: aload #12
    //   337: invokeinterface ZK : (Ljava/lang/String;Lburp/Zrdu;Ljava/lang/String;)Lburp/Zefx;
    //   342: astore #13
    //   344: aload #4
    //   346: ifnull -> 421
    //   349: aload #13
    //   351: aload #8
    //   353: if_acmpeq -> 421
    //   356: aload #4
    //   358: getstatic burp/Zgsg.INFO_GOOD : Lburp/Zgsg;
    //   361: iload #5
    //   363: iconst_1
    //   364: iadd
    //   365: aload #11
    //   367: getfield ZA : Ljava/lang/String;
    //   370: sipush #29543
    //   373: sipush #-29408
    //   376: invokestatic a : (II)Ljava/lang/String;
    //   379: swap
    //   380: sipush #29542
    //   383: sipush #-19333
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   394: aconst_null
    //   395: aload #13
    //   397: invokeinterface ZT : ()Lburp/Zmzk;
    //   402: aload #13
    //   404: invokeinterface Zb : ()Lburp/Zefx;
    //   409: invokeinterface ZD : ()[B
    //   414: aconst_null
    //   415: invokeinterface ZI : (Lburp/Zgsg;ILjava/lang/String;Ljava/lang/String;Lburp/Zmzk;[B[B)Lburp/Zm3k;
    //   420: pop
    //   421: aload #13
    //   423: astore #8
    //   425: iload #6
    //   427: ifeq -> 91
    //   430: aload_1
    //   431: getfield Zi : Lburp/Zsxd;
    //   434: aload #8
    //   436: invokestatic Zc : (Lburp/Zsxd;Lburp/Zefx;)Lburp/Zsxd;
    //   439: astore #10
    //   441: new burp/Zsgw
    //   444: dup
    //   445: aload #10
    //   447: invokespecial <init> : (Lburp/Zsxd;)V
    //   450: areturn
  }
  
  private static boolean Zw(Zlgm paramZlgm, Zlou paramZlou) {
    return (paramZlgm != null && !paramZlgm.Zh(paramZlou.Zx, paramZlou.ZA));
  }
  
  private static boolean Zj(Zlou paramZlou) {
    switch (Ztuk.Zx[paramZlou.Zx.ordinal()]) {
      case 1:
      case 2:
      case 3:
      
    } 
    return false;
  }
  
  private boolean lambda$performRequestModification$0(Zlgm paramZlgm, Zlou paramZlou) {
    return (Zj(paramZlou) && this.ZG.ZI(paramZlou.ZA) && !Zw(paramZlgm, paramZlou));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Âh±àçjºßø)·=ø¥.$Ô]Î¶ðS q³ºn\CØE\\tZ}ò9?¯Ii0æUcÅØ÷~'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #18
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #123
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic burp/Zmlp.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zmlp.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #46
    //   154: goto -> 184
    //   157: bipush #76
    //   159: goto -> 184
    //   162: bipush #6
    //   164: goto -> 184
    //   167: bipush #62
    //   169: goto -> 184
    //   172: bipush #42
    //   174: goto -> 184
    //   177: bipush #42
    //   179: goto -> 184
    //   182: bipush #65
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7367) & 0xFFFF;
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
      char c = '¤';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */