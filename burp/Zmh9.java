package burp;

import java.io.IOException;
import java.io.Writer;
import net.portswigger.Zdo;
import net.portswigger.Zkb;

public class Zmh9 {
  private static final byte[] Zc;
  
  private static final byte[] ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void ZB(Writer paramWriter, String paramString1, String paramString2, String paramString3, String paramString4) throws IOException {
    if (paramString4 == null)
      paramString4 = ""; 
    Zk(paramWriter, paramString1, paramString2, paramString3, Zkb.Zy(paramString4), paramString4.length());
  }
  
  public static void ZQ(Writer paramWriter, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null)
      paramArrayOfbyte = Zdo.ZQ; 
    Zk(paramWriter, paramString1, paramString2, paramString3, paramArrayOfbyte, paramArrayOfbyte.length);
  }
  
  public static void Zk(Writer paramWriter, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfbyte, int paramInt) throws IOException {
    // Byte code:
    //   0: invokestatic ZK : ()[I
    //   3: astore #6
    //   5: aload #4
    //   7: ifnonnull -> 15
    //   10: getstatic net/portswigger/Zdo.ZQ : [B
    //   13: astore #4
    //   15: aload_0
    //   16: aload_1
    //   17: aload_2
    //   18: aload_3
    //   19: ifnonnull -> 31
    //   22: ldc ''
    //   24: goto -> 37
    //   27: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   30: athrow
    //   31: aload_3
    //   32: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   37: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   42: invokevirtual write : (Ljava/lang/String;)V
    //   45: iconst_0
    //   46: istore #7
    //   48: iconst_0
    //   49: istore #8
    //   51: iload #8
    //   53: iload #5
    //   55: if_icmpge -> 116
    //   58: aload #4
    //   60: getstatic burp/Zmh9.ZD : [B
    //   63: iload #7
    //   65: iload #5
    //   67: invokestatic Zw : ([B[BII)I
    //   70: istore #8
    //   72: iload #8
    //   74: iconst_m1
    //   75: if_icmpne -> 87
    //   78: iload #5
    //   80: istore #8
    //   82: aload #6
    //   84: ifnonnull -> 97
    //   87: iinc #8, 1
    //   90: goto -> 97
    //   93: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   96: athrow
    //   97: aload_0
    //   98: aload #4
    //   100: iload #7
    //   102: iload #8
    //   104: invokestatic ZE : (Ljava/io/Writer;[BII)V
    //   107: iload #8
    //   109: istore #7
    //   111: aload #6
    //   113: ifnonnull -> 51
    //   116: aload_0
    //   117: aload_2
    //   118: sipush #10955
    //   121: sipush #-21450
    //   124: invokestatic a : (II)Ljava/lang/String;
    //   127: swap
    //   128: sipush #10954
    //   131: sipush #30189
    //   134: invokestatic a : (II)Ljava/lang/String;
    //   137: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   142: invokevirtual write : (Ljava/lang/String;)V
    //   145: return
    // Exception table:
    //   from	to	target	type
    //   15	27	27	java/io/IOException
    //   82	90	93	java/io/IOException
  }
  
  private static void ZE(Writer paramWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    Zb(paramWriter, Zc, 0, Zc.length);
    Zb(paramWriter, paramArrayOfbyte, paramInt1, paramInt2);
    Zb(paramWriter, ZD, 0, ZD.length);
  }
  
  private static void Zb(Writer paramWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int[] arrayOfInt = Zsw8.ZK();
    int i = paramInt1;
    while (i < paramInt2) {
      paramWriter.write(Zq(paramArrayOfbyte[i]));
      i++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private static byte Zq(byte paramByte) {
    if (paramByte >= 32)
      return paramByte; 
    switch (paramByte) {
      case 9:
      case 10:
      case 13:
        return paramByte;
    } 
    return 46;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'hí<þ©'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_3
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #24
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zmh9.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zmh9.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #92
    //   154: goto -> 184
    //   157: bipush #98
    //   159: goto -> 184
    //   162: bipush #82
    //   164: goto -> 184
    //   167: bipush #121
    //   169: goto -> 184
    //   172: bipush #96
    //   174: goto -> 184
    //   177: bipush #56
    //   179: goto -> 184
    //   182: bipush #16
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: bipush #9
    //   229: newarray byte
    //   231: dup
    //   232: iconst_0
    //   233: bipush #60
    //   235: bastore
    //   236: dup
    //   237: iconst_1
    //   238: bipush #33
    //   240: bastore
    //   241: dup
    //   242: iconst_2
    //   243: bipush #91
    //   245: bastore
    //   246: dup
    //   247: iconst_3
    //   248: bipush #67
    //   250: bastore
    //   251: dup
    //   252: iconst_4
    //   253: bipush #68
    //   255: bastore
    //   256: dup
    //   257: iconst_5
    //   258: bipush #65
    //   260: bastore
    //   261: dup
    //   262: bipush #6
    //   264: bipush #84
    //   266: bastore
    //   267: dup
    //   268: bipush #7
    //   270: bipush #65
    //   272: bastore
    //   273: dup
    //   274: bipush #8
    //   276: bipush #91
    //   278: bastore
    //   279: putstatic burp/Zmh9.Zc : [B
    //   282: iconst_3
    //   283: newarray byte
    //   285: dup
    //   286: iconst_0
    //   287: bipush #93
    //   289: bastore
    //   290: dup
    //   291: iconst_1
    //   292: bipush #93
    //   294: bastore
    //   295: dup
    //   296: iconst_2
    //   297: bipush #62
    //   299: bastore
    //   300: putstatic burp/Zmh9.ZD : [B
    //   303: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2ACA) & 0xFFFF;
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
      byte b1 = 125;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmh9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */