package burp;

import java.io.IOException;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zm2;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zzc;

public class Zlci implements Zrpo {
  private final Zekl ZU;
  
  private final Zskh Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zlci(Zekl paramZekl, Zskh paramZskh) {
    this.ZU = paramZekl;
    this.Zq = paramZskh;
  }
  
  public void ZM(Throwable paramThrowable, Socket paramSocket) {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: instanceof burp/Zz8m
    //   8: ifeq -> 22
    //   11: aload_0
    //   12: aload_1
    //   13: aload_2
    //   14: iconst_0
    //   15: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   18: aload_3
    //   19: ifnonnull -> 228
    //   22: aload_1
    //   23: instanceof burp/Zz8v
    //   26: ifeq -> 40
    //   29: aload_0
    //   30: aload_1
    //   31: aload_2
    //   32: iconst_1
    //   33: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   36: aload_3
    //   37: ifnonnull -> 228
    //   40: aload_1
    //   41: instanceof burp/Zz87
    //   44: ifeq -> 58
    //   47: aload_0
    //   48: aload_1
    //   49: aload_2
    //   50: iconst_0
    //   51: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   54: aload_3
    //   55: ifnonnull -> 228
    //   58: aload_1
    //   59: instanceof burp/Zz8h
    //   62: ifeq -> 76
    //   65: aload_0
    //   66: aload_1
    //   67: aload_2
    //   68: iconst_1
    //   69: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   72: aload_3
    //   73: ifnonnull -> 228
    //   76: aload_1
    //   77: instanceof burp/Zxgy
    //   80: ifeq -> 94
    //   83: aload_0
    //   84: aload_1
    //   85: aload_2
    //   86: iconst_1
    //   87: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   90: aload_3
    //   91: ifnonnull -> 228
    //   94: aload_1
    //   95: instanceof burp/Zxg5
    //   98: ifeq -> 112
    //   101: aload_0
    //   102: aload_1
    //   103: aload_2
    //   104: iconst_1
    //   105: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   108: aload_3
    //   109: ifnonnull -> 228
    //   112: aload_1
    //   113: instanceof burp/Zxro
    //   116: ifeq -> 130
    //   119: aload_0
    //   120: aload_1
    //   121: aload_2
    //   122: iconst_1
    //   123: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   126: aload_3
    //   127: ifnonnull -> 228
    //   130: aload_1
    //   131: instanceof javax/net/ssl/SSLException
    //   134: ifeq -> 148
    //   137: aload_0
    //   138: aload_1
    //   139: aload_2
    //   140: iconst_1
    //   141: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   144: aload_3
    //   145: ifnonnull -> 228
    //   148: aload_1
    //   149: instanceof java/io/IOException
    //   152: ifeq -> 166
    //   155: aload_0
    //   156: aload_1
    //   157: aload_2
    //   158: iconst_0
    //   159: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   162: aload_3
    //   163: ifnonnull -> 228
    //   166: aload_1
    //   167: instanceof burp/Zt2b
    //   170: ifeq -> 184
    //   173: aload_0
    //   174: aload_1
    //   175: aload_2
    //   176: iconst_1
    //   177: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   180: aload_3
    //   181: ifnonnull -> 228
    //   184: aload_1
    //   185: instanceof java/lang/OutOfMemoryError
    //   188: ifeq -> 199
    //   191: aload_0
    //   192: invokevirtual ZZ : ()V
    //   195: aload_3
    //   196: ifnonnull -> 228
    //   199: aload_1
    //   200: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   203: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   206: aload_0
    //   207: new java/lang/Exception
    //   210: dup
    //   211: sipush #21097
    //   214: sipush #-15292
    //   217: invokestatic a : (II)Ljava/lang/String;
    //   220: invokespecial <init> : (Ljava/lang/String;)V
    //   223: aload_2
    //   224: iconst_0
    //   225: invokevirtual ZU : (Ljava/lang/Throwable;Ljava/net/Socket;Z)V
    //   228: return
  }
  
  protected void ZZ() {
    Ztyh.ZR(this.Zq);
  }
  
  private void ZU(Throwable paramThrowable, Socket paramSocket, boolean paramBoolean) {
    try {
      try {
        if (paramBoolean)
          Zc(paramThrowable); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      ZL(paramThrowable, paramSocket);
      ZJ(paramSocket);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.IGNORED);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zc(Throwable paramThrowable) {
    String str = paramThrowable.getMessage();
    Zuh.ZT((str != null), Zqf.Zx, paramThrowable.toString());
    this.Zq.Zl(Zkqn.ERROR, str);
  }
  
  private void ZL(Throwable paramThrowable, Socket paramSocket) throws IOException {
    try {
      if (this.ZU.ZlS()) {
        Zm2.ZC(Zrrh.PROXY_OPTIONS_MISC_SUPPRESS_BURP_MESSAGES_IN_BROWSER);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zzea zzea = new Zzea(false);
    zzea.ZL();
    zzea.Zf(Zs(paramThrowable));
    if (paramThrowable instanceof Zz8v) {
      byte[] arrayOfByte = ((Zz8v)paramThrowable).ZR();
      try {
        if (arrayOfByte != null)
          zzea.ZZ(arrayOfByte); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    zzea.ZT();
    paramSocket.getOutputStream().write(zzea.ZZ());
    paramSocket.getOutputStream().flush();
  }
  
  private static byte[] Zs(Throwable paramThrowable) {
    String str = Zzc.Zn(paramThrowable.getMessage());
    return Zkb.Zy(a(21099, 5297) + a(21099, 5297) + str);
  }
  
  private static void ZJ(Socket paramSocket) throws IOException {
    paramSocket.close();
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'AØuËÔ²®çý\N\9êø-R&YWñ5!h~yQ¯Ç\\t5nVx'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #26
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #118
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
    //   69: putstatic burp/Zlci.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zlci.b : [Ljava/lang/String;
    //   79: goto -> 224
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
    //   98: if_icmpgt -> 197
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 180, 0 -> 152, 1 -> 157, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 175
    //   152: bipush #55
    //   154: goto -> 181
    //   157: iconst_1
    //   158: goto -> 181
    //   161: bipush #74
    //   163: goto -> 181
    //   166: bipush #67
    //   168: goto -> 181
    //   171: iconst_5
    //   172: goto -> 181
    //   175: bipush #105
    //   177: goto -> 181
    //   180: iconst_3
    //   181: ixor
    //   182: ixor
    //   183: i2c
    //   184: castore
    //   185: iinc #6, 1
    //   188: dup
    //   189: ifne -> 197
    //   192: dup2
    //   193: dup_x1
    //   194: goto -> 105
    //   197: dup2_x1
    //   198: pop2
    //   199: dup_x2
    //   200: iload #6
    //   202: if_icmpgt -> 101
    //   205: pop
    //   206: new java/lang/String
    //   209: dup_x1
    //   210: swap
    //   211: invokespecial <init> : ([C)V
    //   214: invokevirtual intern : ()Ljava/lang/String;
    //   217: swap
    //   218: pop
    //   219: swap
    //   220: pop
    //   221: goto -> 39
    //   224: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5269) & 0xFFFF;
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
      byte b1 = 58;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlci.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */