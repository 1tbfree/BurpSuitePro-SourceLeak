package burp;

import java.math.BigInteger;

class Zmou extends ClassLoader {
  static Object ZT;
  
  static String ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  static boolean ZQ(Object[] paramArrayOfObject, Object paramObject) throws Throwable {
    try {
      try {
        Zeyd.Zl = ((BigInteger)Zm0v.ZH).subtract((BigInteger)Zge1.ZK);
        Zluk.Zz = ((BigInteger)Zluk.Zz).add((BigInteger)Zg_i.ZQ);
        if (Zxzt.ZG.charAt(Math.abs(((BigInteger)Zm7y.Zr).intValue() % 32)) <= Zrug.Zq.charAt(Math.abs(((BigInteger)Zts_.ZH).intValue() % 32)))
          try {
            if (Zlqy.ZZ.charAt(Math.abs(((BigInteger)Zvof.Zl).intValue() % 32)) <= Zbu6.ZQ.charAt(Math.abs(((BigInteger)Zkor.Ze).intValue() % 32))) {
              try {
                if (Zmpv.Zb.charAt(Math.abs(((BigInteger)Zr3j.ZT).intValue() % 32)) > Zbf9.Zp.charAt(Math.abs(((BigInteger)Zlqy.ZP).intValue() % 32)));
              } catch (Throwable throwable) {
                throw a(null);
              } 
              return false;
            } 
          } catch (Throwable throwable) {
            throw a(null);
          }  
      } catch (Throwable throwable) {
        throw a(null);
      } 
    } catch (Throwable throwable) {
      throw new Exception(throwable.getMessage());
    } 
  }
  
  static void Zc(Object[] paramArrayOfObject, Object paramObject) throws Throwable {}
  
  static void ZD(Object paramObject) {
    Zgk1.Zv = a(-16279, -18830);
    Zgk1.ZD = new BigInteger(a(-16278, -32497));
    boolean bool = Zt2e.ZN();
    try {
      try {
        if (Zzuh.ZX.charAt(Math.abs(((BigInteger)Zr_z.ZT).intValue() % 32)) > Zlfg.Zb.charAt(Math.abs(((BigInteger)Zr_z.ZT).intValue() % 32))) {
          try {
            Zsts.Zo(Class.forName(a(-16277, 18159)));
            if (!bool)
              Zb9d.Zw(Class.forName(a(-16273, 1370))); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          return;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zb9d.Zw(Class.forName(a(-16273, 1370)));
    } catch (Throwable throwable) {}
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'cäî¤M4Q#UUæ¾cÇÜ§M³¤i°OÍxëÙ*(þØKQ®öfÊx1?;_?ÐoàPøÔÊ¼/ Ô¶ÂÇÔËç¥Ì¤ÄzeZ]: ÅïÆSÌý`¹´*È1@´R¸ÚLßZO'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #9
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #55
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'äìqYñ{*ß¡GË^²ÿl(Ðrú!q¸*Õ¶\\tÖ%8Óã-ÑNá'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #32
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #22
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zmou.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zmou.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #24
    //   214: goto -> 243
    //   217: bipush #35
    //   219: goto -> 243
    //   222: bipush #105
    //   224: goto -> 243
    //   227: bipush #108
    //   229: goto -> 243
    //   232: bipush #15
    //   234: goto -> 243
    //   237: bipush #42
    //   239: goto -> 243
    //   242: iconst_1
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: new java/math/BigInteger
    //   303: dup
    //   304: iconst_1
    //   305: bipush #32
    //   307: newarray byte
    //   309: dup
    //   310: iconst_0
    //   311: iconst_4
    //   312: bastore
    //   313: dup
    //   314: iconst_1
    //   315: bipush #-38
    //   317: bastore
    //   318: dup
    //   319: iconst_2
    //   320: bipush #91
    //   322: bastore
    //   323: dup
    //   324: iconst_3
    //   325: bipush #111
    //   327: bastore
    //   328: dup
    //   329: iconst_4
    //   330: bipush #-99
    //   332: bastore
    //   333: dup
    //   334: iconst_5
    //   335: bipush #-95
    //   337: bastore
    //   338: dup
    //   339: bipush #6
    //   341: bipush #-111
    //   343: bastore
    //   344: dup
    //   345: bipush #7
    //   347: bipush #73
    //   349: bastore
    //   350: dup
    //   351: bipush #8
    //   353: bipush #59
    //   355: bastore
    //   356: dup
    //   357: bipush #9
    //   359: bipush #89
    //   361: bastore
    //   362: dup
    //   363: bipush #10
    //   365: bipush #47
    //   367: bastore
    //   368: dup
    //   369: bipush #11
    //   371: bipush #-87
    //   373: bastore
    //   374: dup
    //   375: bipush #12
    //   377: bipush #51
    //   379: bastore
    //   380: dup
    //   381: bipush #13
    //   383: bipush #-82
    //   385: bastore
    //   386: dup
    //   387: bipush #14
    //   389: bipush #-117
    //   391: bastore
    //   392: dup
    //   393: bipush #15
    //   395: bipush #16
    //   397: bastore
    //   398: dup
    //   399: bipush #16
    //   401: bipush #75
    //   403: bastore
    //   404: dup
    //   405: bipush #17
    //   407: bipush #-29
    //   409: bastore
    //   410: dup
    //   411: bipush #18
    //   413: bipush #52
    //   415: bastore
    //   416: dup
    //   417: bipush #19
    //   419: bipush #87
    //   421: bastore
    //   422: dup
    //   423: bipush #20
    //   425: bipush #37
    //   427: bastore
    //   428: dup
    //   429: bipush #21
    //   431: bipush #-86
    //   433: bastore
    //   434: dup
    //   435: bipush #22
    //   437: bipush #-96
    //   439: bastore
    //   440: dup
    //   441: bipush #23
    //   443: bipush #-103
    //   445: bastore
    //   446: dup
    //   447: bipush #24
    //   449: bipush #-25
    //   451: bastore
    //   452: dup
    //   453: bipush #25
    //   455: bipush #72
    //   457: bastore
    //   458: dup
    //   459: bipush #26
    //   461: bipush #-121
    //   463: bastore
    //   464: dup
    //   465: bipush #27
    //   467: bipush #115
    //   469: bastore
    //   470: dup
    //   471: bipush #28
    //   473: bipush #-73
    //   475: bastore
    //   476: dup
    //   477: bipush #29
    //   479: bipush #-43
    //   481: bastore
    //   482: dup
    //   483: bipush #30
    //   485: bipush #19
    //   487: bastore
    //   488: dup
    //   489: bipush #31
    //   491: bipush #-55
    //   493: bastore
    //   494: invokespecial <init> : (I[B)V
    //   497: putstatic burp/Zmou.ZT : Ljava/lang/Object;
    //   500: sipush #-16280
    //   503: sipush #-10307
    //   506: invokestatic a : (II)Ljava/lang/String;
    //   509: putstatic burp/Zmou.ZP : Ljava/lang/String;
    //   512: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC06B) & 0xFFFF;
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
      char c = '¾';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmou.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */