package net.portswigger;

import burp.Zbqc;

public class Zj {
  private static Zbqc[] Ze;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static void Zy(int paramInt, Zve paramZve) {
    Zbqc[] arrayOfZbqc = Zk();
    try {
      if (Zcl.Zy == paramZve) {
        try {
          if (paramInt < 32) {
            try {
              System.err.printf(a(-4746, -29123), new Object[] { Integer.valueOf(paramInt) });
              if (paramInt == 10)
                try {
                  System.err.println();
                  if (arrayOfZbqc != null) {
                    System.err.print((char)paramInt);
                    return;
                  } 
                } catch (Zk8 zk8) {
                  throw a(null);
                }  
            } catch (Zk8 zk8) {
              throw a(null);
            } 
            return;
          } 
        } catch (Zk8 zk8) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (Zk8 zk8) {
      throw a(null);
    } 
    System.err.print((char)paramInt);
  }
  
  public static byte[] Zt(byte[] paramArrayOfbyte, Zve paramZve) {
    // Byte code:
    //   0: invokestatic Zk : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: getstatic net/portswigger/Zcl.Zy : Lnet/portswigger/Zve;
    //   7: aload_1
    //   8: if_acmpne -> 119
    //   11: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   14: aload_1
    //   15: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   18: sipush #-4745
    //   21: sipush #-7528
    //   24: invokestatic a : (II)Ljava/lang/String;
    //   27: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   32: invokevirtual println : (Ljava/lang/String;)V
    //   35: aload_0
    //   36: ifnull -> 91
    //   39: goto -> 46
    //   42: invokestatic a : (Lnet/portswigger/Zk8;)Lnet/portswigger/Zk8;
    //   45: athrow
    //   46: aload_0
    //   47: astore_3
    //   48: aload_3
    //   49: arraylength
    //   50: istore #4
    //   52: iconst_0
    //   53: istore #5
    //   55: iload #5
    //   57: iload #4
    //   59: if_icmpge -> 81
    //   62: aload_3
    //   63: iload #5
    //   65: baload
    //   66: istore #6
    //   68: iload #6
    //   70: aload_1
    //   71: invokestatic Zy : (ILnet/portswigger/Zve;)V
    //   74: iinc #5, 1
    //   77: aload_2
    //   78: ifnull -> 55
    //   81: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   84: invokevirtual println : ()V
    //   87: aload_2
    //   88: ifnull -> 113
    //   91: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   94: sipush #-4748
    //   97: sipush #-25617
    //   100: invokestatic a : (II)Ljava/lang/String;
    //   103: invokevirtual println : (Ljava/lang/String;)V
    //   106: goto -> 113
    //   109: invokestatic a : (Lnet/portswigger/Zk8;)Lnet/portswigger/Zk8;
    //   112: athrow
    //   113: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   116: invokevirtual println : ()V
    //   119: aload_0
    //   120: areturn
    // Exception table:
    //   from	to	target	type
    //   4	39	42	net/portswigger/Zk8
    //   81	106	109	net/portswigger/Zk8
  }
  
  public static void Zi(Zbqc[] paramArrayOfZbqc) {
    Ze = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zk() {
    return Ze;
  }
  
  private static Zk8 a(Zk8 paramZk8) {
    return paramZk8;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: aconst_null
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'd\\fO¼#þÅ§pKû~äø '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: invokestatic Zi : ([Lburp/Zbqc;)V
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #51
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic net/portswigger/Zj.a : [Ljava/lang/String;
    //   76: iconst_3
    //   77: anewarray java/lang/String
    //   80: putstatic net/portswigger/Zj.b : [Ljava/lang/String;
    //   83: goto -> 230
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 203
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #102
    //   158: goto -> 187
    //   161: bipush #79
    //   163: goto -> 187
    //   166: bipush #50
    //   168: goto -> 187
    //   171: bipush #91
    //   173: goto -> 187
    //   176: bipush #10
    //   178: goto -> 187
    //   181: bipush #11
    //   183: goto -> 187
    //   186: iconst_3
    //   187: ixor
    //   188: ixor
    //   189: i2c
    //   190: castore
    //   191: iinc #6, 1
    //   194: dup
    //   195: ifne -> 203
    //   198: dup2
    //   199: dup_x1
    //   200: goto -> 109
    //   203: dup2_x1
    //   204: pop2
    //   205: dup_x2
    //   206: iload #6
    //   208: if_icmpgt -> 105
    //   211: pop
    //   212: new java/lang/String
    //   215: dup_x1
    //   216: swap
    //   217: invokespecial <init> : ([C)V
    //   220: invokevirtual intern : ()Ljava/lang/String;
    //   223: swap
    //   224: pop
    //   225: swap
    //   226: pop
    //   227: goto -> 43
    //   230: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFED76) & 0xFFFF;
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
      byte b1 = 4;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zj.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */