package burp;

import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zkb;

class Ztgm {
  private static final int Zc;
  
  private static final byte[] ZS;
  
  private final Zewk Zk;
  
  private final byte[] Zq;
  
  private final Zl9f ZW;
  
  private int Zw = 0;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Ztgm(Zbjt paramZbjt, Zl9f paramZl9f) {
    this.ZW = paramZl9f;
    this.Zk = new Zewk();
    int i = paramZbjt.ZO();
    this.Zq = new byte[i];
    System.arraycopy(paramZbjt.Z_(), 0, this.Zq, 0, i);
    Zn();
  }
  
  private void Zn() {
    this.Zq[2] = (byte)(this.Zq[2] | 0x80);
  }
  
  void ZR(List<InetAddress> paramList, int paramInt) {
    Iterator<InetAddress> iterator = paramList.iterator();
    boolean bool = Zbjt.ZA();
    while (iterator.hasNext()) {
      InetAddress inetAddress = iterator.next();
      if (inetAddress instanceof java.net.Inet6Address) {
        this.Zw++;
        ZV(28, paramInt);
        this.Zk.ZQ(16);
        byte[] arrayOfByte = inetAddress.getAddress();
        byte b = 0;
        while (b < 16) {
          this.Zk.ZE(arrayOfByte[b]);
          b++;
          if (bool)
            break; 
        } 
      } 
      if (bool)
        break; 
    } 
  }
  
  void Zk(int paramInt1, int paramInt2) {
    this.Zw++;
    ZV(6, paramInt1);
    this.Zk.ZE(0);
    this.Zk.ZE(33);
    this.Zk.ZH(this.ZW.Zj());
    this.Zk.Z_(paramInt2);
    this.Zk.ZH(ZS);
    this.Zk.Zb();
    boolean bool = Zbjt.Zg();
    this.Zk.ZO(Zc);
    this.Zk.ZO(1792L);
    this.Zk.ZO(255L);
    this.Zk.ZO(1209600L);
    this.Zk.ZO(3600L);
    if (Zbqc.Zwu() == null)
      Zbjt.ZZ(!bool); 
  }
  
  void ZT(Zbjt paramZbjt, int paramInt) {
    this.Zw++;
    ZV(15, paramInt);
    int i = 0;
    null = paramZbjt.Ze().iterator();
    boolean bool = Zbjt.ZA();
    while (null.hasNext()) {
      String str = null.next();
      i = ++i + str.length();
      if (bool)
        break; 
    } 
    this.Zk.ZE(0);
    this.Zk.ZE((byte)i + 8);
    this.Zk.ZE(0);
    this.Zk.ZE(1);
    this.Zk.ZH(ZS);
    for (String str : paramZbjt.Ze()) {
      this.Zk.ZE((byte)str.length());
      char[] arrayOfChar = str.toCharArray();
      int j = arrayOfChar.length;
      byte b = 0;
      while (b < j) {
        char c = arrayOfChar[b];
        this.Zk.ZE(c);
        b++;
        if (bool)
          break; 
      } 
      if (bool)
        break; 
    } 
    this.Zk.ZE(0);
  }
  
  void Zl(int paramInt) {
    this.Zw += this.ZW.ZJ();
    boolean bool = Zbjt.ZA();
    for (String str : this.ZW.ZO()) {
      Zw(Zkb.Zy(str), paramInt);
      if (bool)
        break; 
    } 
  }
  
  private void Zw(byte[] paramArrayOfbyte, int paramInt) {
    this.Zk.Z_(paramInt);
    this.Zk.ZQ(2);
    this.Zk.ZQ(1);
    this.Zk.ZO(3600L);
    this.Zk.ZQ(3 + paramArrayOfbyte.length);
    this.Zk.ZH(paramArrayOfbyte);
    this.Zk.Z_(paramInt);
  }
  
  void Zg(List<InetAddress> paramList, int paramInt) {
    Iterator<InetAddress> iterator = paramList.iterator();
    boolean bool = Zbjt.Zg();
    while (iterator.hasNext()) {
      InetAddress inetAddress = iterator.next();
      if (inetAddress instanceof java.net.Inet4Address) {
        this.Zw++;
        ZV(1, paramInt);
        this.Zk.ZQ(4);
        byte[] arrayOfByte = inetAddress.getAddress();
        this.Zk.ZE(arrayOfByte[0]);
        this.Zk.ZE(arrayOfByte[1]);
        this.Zk.ZE(arrayOfByte[2]);
        this.Zk.ZE(arrayOfByte[3]);
      } 
      if (!bool)
        break; 
    } 
  }
  
  void ZR(String paramString, int paramInt) {
    this.Zw++;
    ZV(5, paramInt);
    String[] arrayOfString1 = paramString.split(a(-29991, 1704));
    int i = paramString.length() + 2;
    this.Zk.ZQ(i);
    String[] arrayOfString2 = arrayOfString1;
    boolean bool = Zbjt.ZA();
    int j = arrayOfString2.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString2[b];
      this.Zk.ZH(str.getBytes(StandardCharsets.US_ASCII));
      b++;
      if (bool)
        break; 
    } 
    this.Zk.ZE(0);
  }
  
  void ZB(String paramString, int paramInt) {
    this.Zw++;
    ZV(16, paramInt);
    byte[] arrayOfByte = paramString.getBytes(StandardCharsets.US_ASCII);
    this.Zk.ZQ(arrayOfByte.length + 1);
    this.Zk.ZH(arrayOfByte);
  }
  
  public void ZP(String paramString1, String paramString2, int paramInt) {
    this.Zw++;
    ZV(257, paramInt);
    byte[] arrayOfByte1 = paramString1.getBytes(StandardCharsets.US_ASCII);
    byte[] arrayOfByte2 = paramString2.getBytes(StandardCharsets.US_ASCII);
    this.Zk.ZQ(2 + arrayOfByte1.length + arrayOfByte2.length);
    this.Zk.ZE(0);
    this.Zk.ZH(arrayOfByte1);
    boolean bool = Zbjt.Zg();
    byte[] arrayOfByte3 = arrayOfByte2;
    int i = arrayOfByte3.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte3[b];
      this.Zk.ZE(b1);
      b++;
      if (!bool)
        break; 
    } 
  }
  
  private void ZV(int paramInt1, int paramInt2) {
    this.Zk.Zb();
    this.Zk.ZQ(paramInt1);
    this.Zk.ZQ(1);
    this.Zk.ZO(paramInt2);
  }
  
  private void ZR(int paramInt) {
    this.Zq[7] = (byte)paramInt;
  }
  
  private void ZJ(int paramInt) {
    this.Zq[9] = (byte)paramInt;
  }
  
  private void Zb(int paramInt) {
    this.Zq[11] = (byte)paramInt;
  }
  
  void Zr() {
    this.Zq[2] = (byte)(this.Zq[2] | 0x4);
  }
  
  void ZY(int paramInt) {
    this.Zq[3] = (byte)(this.Zq[3] | (byte)(paramInt & 0xF));
  }
  
  public byte[] ZX() {
    ZR(this.Zw);
    ZJ(0);
    Zb(0);
    byte[] arrayOfByte1 = this.Zk.Zl();
    int i = this.Zq.length + arrayOfByte1.length;
    byte[] arrayOfByte2 = new byte[i];
    System.arraycopy(this.Zq, 0, arrayOfByte2, 0, this.Zq.length);
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, this.Zq.length, arrayOfByte1.length);
    return arrayOfByte2;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '\\bÏx7H?ØÀm'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #8
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #81
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
    //   69: putstatic burp/Ztgm.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Ztgm.b : [Ljava/lang/String;
    //   79: goto -> 225
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
    //   98: if_icmpgt -> 198
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 171, 5 -> 176
    //   152: bipush #90
    //   154: goto -> 182
    //   157: bipush #97
    //   159: goto -> 182
    //   162: bipush #63
    //   164: goto -> 182
    //   167: iconst_1
    //   168: goto -> 182
    //   171: bipush #113
    //   173: goto -> 182
    //   176: bipush #87
    //   178: goto -> 182
    //   181: iconst_3
    //   182: ixor
    //   183: ixor
    //   184: i2c
    //   185: castore
    //   186: iinc #6, 1
    //   189: dup
    //   190: ifne -> 198
    //   193: dup2
    //   194: dup_x1
    //   195: goto -> 105
    //   198: dup2_x1
    //   199: pop2
    //   200: dup_x2
    //   201: iload #6
    //   203: if_icmpgt -> 101
    //   206: pop
    //   207: new java/lang/String
    //   210: dup_x1
    //   211: swap
    //   212: invokespecial <init> : ([C)V
    //   215: invokevirtual intern : ()Ljava/lang/String;
    //   218: swap
    //   219: pop
    //   220: swap
    //   221: pop
    //   222: goto -> 39
    //   225: new java/text/SimpleDateFormat
    //   228: dup
    //   229: sipush #-29992
    //   232: sipush #-16501
    //   235: invokestatic a : (II)Ljava/lang/String;
    //   238: getstatic java/util/Locale.UK : Ljava/util/Locale;
    //   241: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
    //   244: new java/util/Date
    //   247: dup
    //   248: invokespecial <init> : ()V
    //   251: invokevirtual format : (Ljava/util/Date;)Ljava/lang/String;
    //   254: sipush #-29990
    //   257: sipush #-28899
    //   260: invokestatic a : (II)Ljava/lang/String;
    //   263: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   268: invokestatic parseInt : (Ljava/lang/String;)I
    //   271: putstatic burp/Ztgm.Zc : I
    //   274: iconst_4
    //   275: newarray byte
    //   277: dup
    //   278: iconst_0
    //   279: bipush #109
    //   281: bastore
    //   282: dup
    //   283: iconst_1
    //   284: bipush #97
    //   286: bastore
    //   287: dup
    //   288: iconst_2
    //   289: bipush #105
    //   291: bastore
    //   292: dup
    //   293: iconst_3
    //   294: bipush #108
    //   296: bastore
    //   297: putstatic burp/Ztgm.ZS : [B
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF8AD8) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztgm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */