package burp;

import net.portswigger.Ztj;

public class Zgae {
  private final Zra1 ZN;
  
  private final Zgdu Zk;
  
  private final Zr18 ZB;
  
  private final Zmx0 Zr;
  
  private final Ztj Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zgae(Zra1 paramZra1, Zgdu paramZgdu, Zr18 paramZr18, Zmx0 paramZmx0, Ztj paramZtj) {
    if (paramZtj == null)
      throw new IllegalArgumentException(a(-21444, 32758)); 
    this.ZN = paramZra1;
    this.Zk = paramZgdu;
    this.ZB = paramZr18;
    this.Zr = paramZmx0;
    this.Zz = paramZtj;
  }
  
  public Zrwj Zt(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zk : Lburp/Zgdu;
    //   4: invokevirtual Zu : ()Ljava/lang/String;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull -> 54
    //   12: aload_0
    //   13: getfield ZN : Lburp/Zra1;
    //   16: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_SERVER : Lburp/Zra1;
    //   19: if_acmpeq -> 46
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   28: athrow
    //   29: aload_0
    //   30: getfield ZN : Lburp/Zra1;
    //   33: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   36: if_acmpne -> 54
    //   39: goto -> 46
    //   42: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: iconst_1
    //   47: goto -> 55
    //   50: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   53: athrow
    //   54: iconst_0
    //   55: istore_3
    //   56: iload_3
    //   57: ifne -> 68
    //   60: getstatic burp/Zrwj.Zn : Lburp/Zrwj;
    //   63: areturn
    //   64: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   67: athrow
    //   68: new burp/Zeuy
    //   71: dup
    //   72: new net/portswigger/Zt_
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: iconst_1
    //   80: invokevirtual ZL : (Z)Lnet/portswigger/Zt_;
    //   83: aload_1
    //   84: aload_2
    //   85: aload_0
    //   86: getfield ZB : Lburp/Zr18;
    //   89: aload_0
    //   90: <illegal opcode> run : (Lburp/Zgae;)Ljava/lang/Runnable;
    //   95: aload_0
    //   96: getfield Zr : Lburp/Zmx0;
    //   99: aload_0
    //   100: getfield Zz : Lnet/portswigger/Ztj;
    //   103: invokespecial <init> : (Lnet/portswigger/Zt_;Ljava/lang/String;Ljava/lang/String;Lburp/Zr18;Ljava/lang/Runnable;Lburp/Zmx0;Lnet/portswigger/Ztj;)V
    //   106: areturn
    // Exception table:
    //   from	to	target	type
    //   8	22	25	java/lang/IllegalArgumentException
    //   12	39	42	java/lang/IllegalArgumentException
    //   29	50	50	java/lang/IllegalArgumentException
    //   56	64	64	java/lang/IllegalArgumentException
  }
  
  private void lambda$build$0() {
    try {
      if (this.Zk.ZV()) {
        this.Zr.ZH(a(-21443, 26772));
        this.ZB.Z_(Zmg9.HEARTBEAT_FAILED);
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'æI~±ªaYÆÃ§±­öB­¹ÒOù3æ\\nÇ¢²Ís¼R\\bºYV ¶#T´1³(Cõ>W_ÂS±\\fÑ&\\b#;FDàw3'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #44
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_4
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
    //   63: goto -> 22
    //   66: aload #5
    //   68: putstatic burp/Zgae.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zgae.b : [Ljava/lang/String;
    //   78: goto -> 226
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
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: iconst_3
    //   153: goto -> 183
    //   156: bipush #79
    //   158: goto -> 183
    //   161: bipush #62
    //   163: goto -> 183
    //   166: bipush #94
    //   168: goto -> 183
    //   171: bipush #58
    //   173: goto -> 183
    //   176: bipush #127
    //   178: goto -> 183
    //   181: bipush #91
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
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
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAC3D) & 0xFFFF;
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
      byte b1 = 44;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgae.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */