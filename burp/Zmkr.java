package burp;

import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zrzt;

public class Zmkr {
  private final List<Zruh> Zy = new ArrayList<>();
  
  public static final boolean[] Zq;
  
  private final Zb0h Zb;
  
  private static String[] ZU;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zmkr(Zb0h paramZb0h) {
    this.Zb = paramZb0h;
  }
  
  public String ZZ(Zlit paramZlit, Zstu paramZstu, Component paramComponent, byte paramByte) {
    // Byte code:
    //   0: new burp/Zruh
    //   3: dup
    //   4: aload_1
    //   5: aload_2
    //   6: invokespecial <init> : (Lburp/Zlit;Lburp/Zstu;)V
    //   9: astore #8
    //   11: invokestatic Zj : ()[Ljava/lang/String;
    //   14: aload_0
    //   15: getfield Zy : Ljava/util/List;
    //   18: dup
    //   19: astore #9
    //   21: monitorenter
    //   22: astore #5
    //   24: aload_0
    //   25: getfield Zy : Ljava/util/List;
    //   28: aload #8
    //   30: invokeinterface add : (Ljava/lang/Object;)Z
    //   35: pop
    //   36: aload_0
    //   37: getfield Zy : Ljava/util/List;
    //   40: invokeinterface size : ()I
    //   45: iconst_1
    //   46: isub
    //   47: istore #6
    //   49: aload #9
    //   51: monitorexit
    //   52: goto -> 63
    //   55: astore #10
    //   57: aload #9
    //   59: monitorexit
    //   60: aload #10
    //   62: athrow
    //   63: aload_0
    //   64: iload #6
    //   66: aload #8
    //   68: invokevirtual Zg : (ILburp/Zruh;)Ljava/lang/String;
    //   71: astore #7
    //   73: getstatic burp/Zmkr.Zq : [Z
    //   76: iload #4
    //   78: baload
    //   79: ifne -> 111
    //   82: aload_0
    //   83: aload_3
    //   84: iload #4
    //   86: aload #7
    //   88: sipush #10863
    //   91: sipush #18496
    //   94: invokestatic a : (II)Ljava/lang/String;
    //   97: swap
    //   98: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   103: invokevirtual Zh : (Ljava/awt/Component;BLjava/lang/String;)V
    //   106: aload #5
    //   108: ifnonnull -> 135
    //   111: aload_0
    //   112: getfield Zb : Lburp/Zb0h;
    //   115: aload #7
    //   117: sipush #10861
    //   120: sipush #-22797
    //   123: invokestatic a : (II)Ljava/lang/String;
    //   126: swap
    //   127: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   132: invokevirtual ZR : (Ljava/lang/String;)V
    //   135: aload #7
    //   137: invokestatic Zwu : ()[Lburp/Zbqc;
    //   140: ifnonnull -> 150
    //   143: iconst_3
    //   144: anewarray java/lang/String
    //   147: invokestatic Zn : ([Ljava/lang/String;)V
    //   150: areturn
    // Exception table:
    //   from	to	target	type
    //   24	52	55	finally
    //   55	60	55	finally
  }
  
  void Zh(Component paramComponent, byte paramByte, String paramString) {
    Zr7e zr7e = new Zr7e(Zt2m.ZF(paramComponent), paramString, paramByte, this.Zb);
    zr7e.setVisible(true);
  }
  
  private String Zg(int paramInt, Zruh paramZruh) {
    a(10862, 26330);
    return a(10862, 26330) + a(10862, 26330) + paramInt + 1 + "/";
  }
  
  public Zruh ZB(String paramString, Zmzk paramZmzk) throws Zg9k {
    try {
      String[] arrayOfString = paramString.split("/");
      int i = Integer.parseInt(arrayOfString[2]) - 1;
      String str = arrayOfString[3];
      Zruh zruh = this.Zy.get(i);
      try {
        if (!str.equals(zruh.Zy))
          throw new Exception(); 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (paramZmzk != null)
          try {
            if (!paramZmzk.equals(zruh.ZB.Zdz()))
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          }  
      } catch (Exception exception) {
        throw a(null);
      } 
      return zruh;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      throw new Zg9k();
    } 
  }
  
  public void ZP(Socket paramSocket, String paramString, Zmzk paramZmzk) throws IOException {
    byte[] arrayOfByte;
    Zzea zzea = new Zzea(false);
    try {
      paramString = Zrzt.ZJ(paramString);
      Zruh zruh = ZB(paramString, paramZmzk);
      arrayOfByte = zruh.Zr.ZiD();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.COMMON_RUNTIME_FAILURE);
      zzea.ZQ(Zxse.ZA);
      return;
    } 
    zzea.Zf(arrayOfByte);
    paramSocket.getOutputStream().write(zzea.ZZ());
    paramSocket.close();
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_2
    //   7: anewarray java/lang/String
    //   10: iconst_0
    //   11: istore_3
    //   12: ldc '*á¢çÃL.Çy«Ó¡ êã_¡0£¶"XFöIo%'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: bipush #16
    //   23: istore_1
    //   24: invokestatic Zn : ([Ljava/lang/String;)V
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #39
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 89
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: aload #5
    //   76: putstatic burp/Zmkr.b : [Ljava/lang/String;
    //   79: iconst_3
    //   80: anewarray java/lang/String
    //   83: putstatic burp/Zmkr.c : [Ljava/lang/String;
    //   86: goto -> 234
    //   89: dup_x2
    //   90: pop
    //   91: invokevirtual toCharArray : ()[C
    //   94: dup_x1
    //   95: arraylength
    //   96: dup_x2
    //   97: pop
    //   98: iconst_0
    //   99: istore #6
    //   101: dup2_x1
    //   102: pop2
    //   103: dup_x2
    //   104: iconst_1
    //   105: if_icmpgt -> 207
    //   108: dup2
    //   109: swap
    //   110: iload #6
    //   112: dup2_x1
    //   113: caload
    //   114: swap
    //   115: iload #6
    //   117: bipush #7
    //   119: irem
    //   120: tableswitch default -> 189, 0 -> 160, 1 -> 165, 2 -> 169, 3 -> 174, 4 -> 179, 5 -> 184
    //   160: bipush #90
    //   162: goto -> 191
    //   165: iconst_2
    //   166: goto -> 191
    //   169: bipush #90
    //   171: goto -> 191
    //   174: bipush #42
    //   176: goto -> 191
    //   179: bipush #58
    //   181: goto -> 191
    //   184: bipush #12
    //   186: goto -> 191
    //   189: bipush #65
    //   191: ixor
    //   192: ixor
    //   193: i2c
    //   194: castore
    //   195: iinc #6, 1
    //   198: dup
    //   199: ifne -> 207
    //   202: dup2
    //   203: dup_x1
    //   204: goto -> 112
    //   207: dup2_x1
    //   208: pop2
    //   209: dup_x2
    //   210: iload #6
    //   212: if_icmpgt -> 108
    //   215: pop
    //   216: new java/lang/String
    //   219: dup_x1
    //   220: swap
    //   221: invokespecial <init> : ([C)V
    //   224: invokevirtual intern : ()Ljava/lang/String;
    //   227: swap
    //   228: pop
    //   229: swap
    //   230: pop
    //   231: goto -> 46
    //   234: iconst_3
    //   235: newarray boolean
    //   237: putstatic burp/Zmkr.Zq : [Z
    //   240: return
  }
  
  public static void Zn(String[] paramArrayOfString) {
    ZU = paramArrayOfString;
  }
  
  public static String[] Zj() {
    return ZU;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2A6F) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 17;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmkr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */