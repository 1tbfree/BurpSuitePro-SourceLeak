package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public abstract class Zmj5 implements Zm7w {
  protected final Zbw_ Zx;
  
  protected final Zgb6 ZB;
  
  protected final Zrgd Zo;
  
  protected final Zkl6 Zr;
  
  protected String ZS;
  
  protected int ZX;
  
  private Socket Zj;
  
  private Zky_ Zd;
  
  private String ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmj5(Zbw_ paramZbw_, Zgb6 paramZgb6, Zrgd paramZrgd, Zkl6 paramZkl6) {
    this.Zx = paramZbw_;
    this.ZB = paramZgb6;
    this.Zo = paramZrgd;
    this.Zr = paramZkl6;
  }
  
  void ZK(Zml3 paramZml3) throws Zz8v {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zi : ()Lburp/Zz1p;
    //   10: getfield Zo : Lburp/Zlit;
    //   13: invokeinterface ZdH : ()[B
    //   18: astore_3
    //   19: aload_3
    //   20: iconst_0
    //   21: baload
    //   22: bipush #91
    //   24: if_icmpne -> 75
    //   27: iconst_2
    //   28: aload_3
    //   29: bipush #93
    //   31: iconst_0
    //   32: aload_3
    //   33: arraylength
    //   34: invokestatic ZU : ([BBII)I
    //   37: iadd
    //   38: istore #4
    //   40: iload #4
    //   42: iconst_1
    //   43: if_icmpgt -> 58
    //   46: new java/lang/Exception
    //   49: dup
    //   50: invokespecial <init> : ()V
    //   53: athrow
    //   54: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   57: athrow
    //   58: aload_0
    //   59: aload_3
    //   60: iconst_1
    //   61: iload #4
    //   63: iconst_3
    //   64: isub
    //   65: invokestatic Zo : ([BII)Ljava/lang/String;
    //   68: putfield ZE : Ljava/lang/String;
    //   71: aload_2
    //   72: ifnonnull -> 118
    //   75: iconst_1
    //   76: aload_3
    //   77: bipush #58
    //   79: iconst_0
    //   80: aload_3
    //   81: arraylength
    //   82: invokestatic ZU : ([BBII)I
    //   85: iadd
    //   86: istore #4
    //   88: iload #4
    //   90: ifgt -> 105
    //   93: new java/lang/Exception
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: athrow
    //   101: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   104: athrow
    //   105: aload_0
    //   106: aload_3
    //   107: iconst_0
    //   108: iload #4
    //   110: iconst_1
    //   111: isub
    //   112: invokestatic Zo : ([BII)Ljava/lang/String;
    //   115: putfield ZE : Ljava/lang/String;
    //   118: aload_0
    //   119: aload_0
    //   120: getfield ZE : Ljava/lang/String;
    //   123: putfield ZS : Ljava/lang/String;
    //   126: aload_0
    //   127: aload_3
    //   128: iload #4
    //   130: aload_3
    //   131: arraylength
    //   132: iload #4
    //   134: isub
    //   135: invokestatic Zo : ([BII)Ljava/lang/String;
    //   138: invokestatic parseInt : (Ljava/lang/String;)I
    //   141: putfield ZX : I
    //   144: goto -> 178
    //   147: astore_3
    //   148: aload_3
    //   149: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   152: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   155: new burp/Zz8v
    //   158: dup
    //   159: sipush #-21946
    //   162: sipush #1860
    //   165: invokestatic a : (II)Ljava/lang/String;
    //   168: aload_1
    //   169: invokeinterface ZC : ()[B
    //   174: invokespecial <init> : (Ljava/lang/String;[B)V
    //   177: athrow
    //   178: return
    // Exception table:
    //   from	to	target	type
    //   4	144	147	java/lang/Exception
    //   40	54	54	java/lang/Exception
    //   88	101	101	java/lang/Exception
  }
  
  void ZY(Zml3 paramZml3) throws Zz8v, Zxgy, Zxg5 {
    try {
      if (this.ZX != paramZml3.Zu().getLocalPort())
        return; 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    Zmzk zmzk = this.Zr.ZB().ZY(this.ZS, this.ZX, true);
    InetAddress inetAddress = zmzk.Zx(this.ZB, this.Zo, this.Zr.Zq(), this.Zr.Zd());
    try {
      if (inetAddress == null)
        return; 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
    String str = inetAddress.getHostAddress();
    try {
      if (Zxkg.Zo(str, paramZml3.Zu(), paramZml3.ZX()))
        throw new Zz8v(a(-21945, -27401), paramZml3.ZC()); 
    } catch (Zz8v zz8v) {
      throw a(null);
    } 
  }
  
  void ZI(Zml3 paramZml3) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    byte[] arrayOfByte = a(-21947, 21272).equals((paramZml3.Zi()).Zh) ? ZP : Zl;
    OutputStream outputStream = paramZml3.Zu().getOutputStream();
    outputStream.write(arrayOfByte);
    outputStream.flush();
  }
  
  void ZW(Zml3 paramZml3) throws IOException {
    OutputStream outputStream = paramZml3.Zu().getOutputStream();
    outputStream.write(Zm7w.Ze);
    outputStream.flush();
  }
  
  void ZL(Zml3 paramZml3) throws Zz8e, IOException {
    try {
    
    } catch (Zz8e zz8e) {
      throw a(null);
    } 
    boolean bool = (Zko5.Zi(this.ZE) != 0) ? true : false;
    try {
      this.Zd = new Zky_(this.Zx, paramZml3.Zu(), paramZml3, this.ZE, this.ZX, bool);
      this.Zd.ZW();
      this.Zj = this.Zd.ZC();
      if (bool)
        try {
          if (this.Zd.Za() != null)
            this.ZS = this.Zd.Za(); 
        } catch (Zz8e zz8e) {
          throw a(null);
        }  
    } catch (Zz8e zz8e) {
      throw a(null);
    } 
  }
  
  void ZT(Zb2f paramZb2f) {
    paramZb2f.Zy(this.Zj, this.ZS, this.ZX, this.Zd.ZU());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ýö_Y%%§Î3Y¢ÄèÏÐéË´lD,·Çt5/£¶ ÉtbañæõöÝ^ýêÞ:ååÝPâZ¡=ûÎB b³M¸Yèf\\bÕ<Ì¤°å¬ÛåH å'|`9e¼O²SGÇ\\t¤æm¿ú4\\bñR­\\t<w?'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #52
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #37
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
    //   69: putstatic burp/Zmj5.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zmj5.b : [Ljava/lang/String;
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
    //   152: bipush #73
    //   154: goto -> 184
    //   157: bipush #51
    //   159: goto -> 184
    //   162: bipush #46
    //   164: goto -> 184
    //   167: bipush #42
    //   169: goto -> 184
    //   172: bipush #60
    //   174: goto -> 184
    //   177: bipush #17
    //   179: goto -> 184
    //   182: bipush #18
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
    int i = (paramInt1 ^ 0xFFFFAA47) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmj5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */