package burp;

import java.nio.file.NoSuchFileException;

public class Zt6q {
  private static final Ztt4 ZZ;
  
  private String ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zt6q(String paramString) {
    // Byte code:
    //   0: invokestatic Zp : ()I
    //   3: aload_0
    //   4: invokespecial <init> : ()V
    //   7: istore_2
    //   8: aload_0
    //   9: aconst_null
    //   10: putfield ZY : Ljava/lang/String;
    //   13: aload_1
    //   14: ifnonnull -> 38
    //   17: getstatic burp/Zt6q.ZZ : Lburp/Ztt4;
    //   20: sipush #-29596
    //   23: sipush #-28934
    //   26: invokestatic a : (II)Ljava/lang/String;
    //   29: invokeinterface ZJ : (Ljava/lang/String;)V
    //   34: iload_2
    //   35: ifne -> 69
    //   38: getstatic burp/Zt6q.ZZ : Lburp/Ztt4;
    //   41: aload_1
    //   42: sipush #-29599
    //   45: sipush #16693
    //   48: invokestatic a : (II)Ljava/lang/String;
    //   51: swap
    //   52: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   57: invokeinterface ZJ : (Ljava/lang/String;)V
    //   62: goto -> 69
    //   65: invokestatic a : (Ljava/nio/file/NoSuchFileException;)Ljava/nio/file/NoSuchFileException;
    //   68: athrow
    //   69: aload_1
    //   70: ifnonnull -> 89
    //   73: sipush #-29600
    //   76: sipush #30325
    //   79: invokestatic a : (II)Ljava/lang/String;
    //   82: goto -> 90
    //   85: invokestatic a : (Ljava/nio/file/NoSuchFileException;)Ljava/nio/file/NoSuchFileException;
    //   88: athrow
    //   89: aload_1
    //   90: astore_3
    //   91: aload_0
    //   92: new java/lang/String
    //   95: dup
    //   96: aload_3
    //   97: iconst_0
    //   98: anewarray java/lang/String
    //   101: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    //   104: invokestatic readAllBytes : (Ljava/nio/file/Path;)[B
    //   107: getstatic java/nio/charset/StandardCharsets.UTF_8 : Ljava/nio/charset/Charset;
    //   110: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
    //   113: putfield ZY : Ljava/lang/String;
    //   116: goto -> 234
    //   119: astore_3
    //   120: aload_1
    //   121: ifnull -> 160
    //   124: aload_3
    //   125: getstatic net/portswigger/Zk_.USER_ERROR : Lnet/portswigger/Zk_;
    //   128: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   131: new burp/Zs0z
    //   134: dup
    //   135: aload_1
    //   136: sipush #-29595
    //   139: sipush #6331
    //   142: invokestatic a : (II)Ljava/lang/String;
    //   145: swap
    //   146: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   151: aload_3
    //   152: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
    //   155: athrow
    //   156: invokestatic a : (Ljava/nio/file/NoSuchFileException;)Ljava/nio/file/NoSuchFileException;
    //   159: athrow
    //   160: aload_3
    //   161: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   164: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   167: getstatic burp/Zt6q.ZZ : Lburp/Ztt4;
    //   170: sipush #-29593
    //   173: sipush #-23544
    //   176: invokestatic a : (II)Ljava/lang/String;
    //   179: invokeinterface ZJ : (Ljava/lang/String;)V
    //   184: goto -> 234
    //   187: astore_3
    //   188: aload_3
    //   189: aload_1
    //   190: ifnonnull -> 203
    //   193: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   196: goto -> 206
    //   199: invokestatic a : (Ljava/nio/file/NoSuchFileException;)Ljava/nio/file/NoSuchFileException;
    //   202: athrow
    //   203: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   206: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   209: new burp/Zs0z
    //   212: dup
    //   213: aload_1
    //   214: sipush #-29594
    //   217: sipush #-1060
    //   220: invokestatic a : (II)Ljava/lang/String;
    //   223: swap
    //   224: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   229: aload_3
    //   230: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
    //   233: athrow
    //   234: return
    // Exception table:
    //   from	to	target	type
    //   13	116	119	java/nio/file/NoSuchFileException
    //   13	116	187	java/io/IOException
    //   17	62	65	java/nio/file/NoSuchFileException
    //   69	85	85	java/nio/file/NoSuchFileException
    //   120	156	156	java/nio/file/NoSuchFileException
    //   188	199	199	java/nio/file/NoSuchFileException
  }
  
  public String ZU() {
    return this.ZY;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ç_ÝdYÒYMf\\bx\\nªÁ0»·¸íâùå9¢U½+.õÿõÞ~ÚBªÛlHÏ5Ñ¿´ÖT±vA05óC×ëK²rÉs¾bpÐUÈçS÷ô'wðÔ!Á~GôBhyÈ \\n\&ß%Íc[2ÂEEìzK.1;p·òôD\\rf ã´.{bvQ\s#Ú¥¬NeF+®Ð\\bdJÿw|ã$'$Ú+!÷2£ÉÁ^­úÅøºht@z±Óßo(À \§yº!p.hóè2TntÍÕ³%¨§ý¤ÍcE¡JÐãÚ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #44
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_5
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   64: goto -> 23
    //   67: ldc 'ÄóøïªÎÃ¬ªtÍÒâ×Î»R]~\\nÓ·Br¬¹¢\\rdîË{\\fôSë'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #25
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #104
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
    //   128: putstatic burp/Zt6q.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zt6q.b : [Ljava/lang/String;
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
    //   212: bipush #107
    //   214: goto -> 244
    //   217: bipush #18
    //   219: goto -> 244
    //   222: bipush #119
    //   224: goto -> 244
    //   227: bipush #63
    //   229: goto -> 244
    //   232: bipush #51
    //   234: goto -> 244
    //   237: bipush #97
    //   239: goto -> 244
    //   242: bipush #27
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: invokestatic Zr : ()Lburp/Ztt4;
    //   303: putstatic burp/Zt6q.ZZ : Lburp/Ztt4;
    //   306: return
  }
  
  private static NoSuchFileException a(NoSuchFileException paramNoSuchFileException) {
    return paramNoSuchFileException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8C65) & 0xFFFF;
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
      char c = 'Ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt6q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */