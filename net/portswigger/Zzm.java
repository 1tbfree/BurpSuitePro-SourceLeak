package net.portswigger;

public class Zzm {
  private final Ztb Zp;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzm(Ztb paramZtb) {
    this.Zp = paramZtb;
  }
  
  public Zrmf Zr(Zrmf paramZrmf) {
    Zqa zqa = new Zqa(paramZrmf);
    try {
      Zmf zmf = this.Zp.ZM();
      zmf.ZH().forEach(zqa::lambda$from$1);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return zqa.ZG();
  }
  
  private static void lambda$from$1(Zqa paramZqa, Zn2 paramZn2) {
    paramZn2.ZR().forEach(paramZqa::lambda$from$0);
  }
  
  private static void lambda$from$0(Zqa paramZqa, Zzq paramZzq) {
    // Byte code:
    //   0: invokestatic Zl : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual ZB : ()Lnet/portswigger/Zfe;
    //   7: astore_3
    //   8: astore_2
    //   9: new net/portswigger/Zsk
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: aload_3
    //   17: invokevirtual ZU : (Lnet/portswigger/Zfe;)Lnet/portswigger/Zsk;
    //   20: aload_1
    //   21: invokevirtual ZY : ()Ljava/lang/String;
    //   24: invokevirtual Zi : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   27: aload_1
    //   28: invokevirtual Zw : ()Ljava/lang/String;
    //   31: invokevirtual Zk : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   34: aload_1
    //   35: invokevirtual Zy : ()Ljava/lang/String;
    //   38: invokevirtual ZO : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   41: astore #4
    //   43: getstatic net/portswigger/Zrxh.ZZ : [I
    //   46: aload_3
    //   47: invokevirtual ordinal : ()I
    //   50: iaload
    //   51: tableswitch default -> 257, 1 -> 88, 2 -> 88, 3 -> 175, 4 -> 175, 5 -> 199, 6 -> 233
    //   88: aload #4
    //   90: sipush #17999
    //   93: sipush #10448
    //   96: invokestatic a : (II)Ljava/lang/String;
    //   99: invokevirtual Zo : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   102: new net/portswigger/Zrm7
    //   105: dup
    //   106: aload_3
    //   107: getstatic net/portswigger/Zfe.BASIC : Lnet/portswigger/Zfe;
    //   110: if_acmpne -> 136
    //   113: goto -> 120
    //   116: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   119: athrow
    //   120: sipush #17998
    //   123: sipush #-31273
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: goto -> 145
    //   132: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   135: athrow
    //   136: sipush #17996
    //   139: sipush #-19049
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: invokespecial <init> : (Ljava/lang/String;)V
    //   148: invokevirtual ZN : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsk;
    //   151: new net/portswigger/Zaq
    //   154: dup
    //   155: invokespecial <init> : ()V
    //   158: getstatic net/portswigger/Zrms.BYTE : Lnet/portswigger/Zrms;
    //   161: invokevirtual ZM : (Lnet/portswigger/Zrms;)Lnet/portswigger/Zaq;
    //   164: invokevirtual Zg : ()Lnet/portswigger/Zrmr;
    //   167: invokevirtual ZN : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsk;
    //   170: pop
    //   171: aload_2
    //   172: ifnonnull -> 257
    //   175: aload #4
    //   177: aload_1
    //   178: invokevirtual ZJ : ()Ljava/lang/String;
    //   181: invokevirtual Zo : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   184: new net/portswigger/Zrmr
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: invokevirtual ZN : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsk;
    //   194: pop
    //   195: aload_2
    //   196: ifnonnull -> 257
    //   199: aload #4
    //   201: aload_1
    //   202: invokevirtual ZJ : ()Ljava/lang/String;
    //   205: invokevirtual Zo : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   208: new net/portswigger/Zaq
    //   211: dup
    //   212: invokespecial <init> : ()V
    //   215: invokevirtual Zg : ()Lnet/portswigger/Zrmr;
    //   218: invokevirtual ZN : (Lnet/portswigger/Zms;)Lnet/portswigger/Zsk;
    //   221: pop
    //   222: aload_2
    //   223: ifnonnull -> 257
    //   226: goto -> 233
    //   229: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   232: athrow
    //   233: aload #4
    //   235: aload_1
    //   236: invokevirtual ZJ : ()Ljava/lang/String;
    //   239: invokevirtual Zo : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   242: aload_1
    //   243: invokevirtual Zw : ()Ljava/lang/String;
    //   246: invokevirtual Zk : (Ljava/lang/String;)Lnet/portswigger/Zsk;
    //   249: pop
    //   250: goto -> 257
    //   253: invokestatic a : (Lnet/portswigger/Zki;)Lnet/portswigger/Zki;
    //   256: athrow
    //   257: aload_0
    //   258: aload #4
    //   260: invokevirtual Zn : ()Lnet/portswigger/Zrzk;
    //   263: invokevirtual Za : (Lnet/portswigger/Zrzk;)Lnet/portswigger/Zqa;
    //   266: pop
    //   267: goto -> 280
    //   270: astore #4
    //   272: aload #4
    //   274: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   277: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   280: return
    // Exception table:
    //   from	to	target	type
    //   9	267	270	net/portswigger/Zki
    //   43	113	116	net/portswigger/Zki
    //   88	132	132	net/portswigger/Zki
    //   175	226	229	net/portswigger/Zki
    //   199	250	253	net/portswigger/Zki
  }
  
  private static Zki a(Zki paramZki) {
    return paramZki;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ç¬ÇÅÀì\\rÚ\ LÓ®sw>=Ý¤¿¹8YyÑ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #122
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
    //   69: putstatic net/portswigger/Zzm.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic net/portswigger/Zzm.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
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
    //   152: bipush #9
    //   154: goto -> 183
    //   157: bipush #19
    //   159: goto -> 183
    //   162: bipush #82
    //   164: goto -> 183
    //   167: bipush #35
    //   169: goto -> 183
    //   172: bipush #57
    //   174: goto -> 183
    //   177: bipush #97
    //   179: goto -> 183
    //   182: iconst_1
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x464E) & 0xFFFF;
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
      byte b1 = 43;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zzm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */