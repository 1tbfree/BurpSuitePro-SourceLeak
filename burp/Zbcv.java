package burp;

public class Zbcv extends Zbqc {
  private final Ztzt ZI;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zbcv(Zz5_ paramZz5_) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZQ : ()Z
    //   7: aload_0
    //   8: new java/awt/BorderLayout
    //   11: dup
    //   12: bipush #10
    //   14: iconst_0
    //   15: invokespecial <init> : (II)V
    //   18: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   21: aload_0
    //   22: aload_1
    //   23: getfield Zh : Ljava/awt/Component;
    //   26: sipush #-10848
    //   29: sipush #-16225
    //   32: invokestatic a : (II)Ljava/lang/String;
    //   35: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   38: istore_2
    //   39: aload_1
    //   40: getfield ZC : Lburp/Ze9n;
    //   43: ifnull -> 166
    //   46: aload_1
    //   47: getfield ZC : Lburp/Ze9n;
    //   50: astore #6
    //   52: aload #6
    //   54: dup
    //   55: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: pop
    //   59: <illegal opcode> run : (Lburp/Ze9n;)Ljava/lang/Runnable;
    //   64: astore_3
    //   65: aload #6
    //   67: dup
    //   68: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   71: pop
    //   72: <illegal opcode> run : (Lburp/Ze9n;)Ljava/lang/Runnable;
    //   77: astore #4
    //   79: new burp/Zm99
    //   82: dup
    //   83: aload #6
    //   85: invokespecial <init> : (Ljavax/swing/Icon;)V
    //   88: astore #7
    //   90: aload_1
    //   91: getfield ZM : Lburp/Zsnk;
    //   94: invokevirtual ordinal : ()I
    //   97: lookupswitch default -> 158, 0 -> 124, 1 -> 143
    //   124: aload_0
    //   125: aload #7
    //   127: sipush #-10846
    //   130: sipush #6476
    //   133: invokestatic a : (II)Ljava/lang/String;
    //   136: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   139: iload_2
    //   140: ifeq -> 158
    //   143: aload_0
    //   144: aload #7
    //   146: sipush #-10845
    //   149: sipush #-28035
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   158: aload #7
    //   160: astore #5
    //   162: iload_2
    //   163: ifeq -> 185
    //   166: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   171: astore_3
    //   172: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   177: astore #4
    //   179: aload_1
    //   180: getfield ZR : Ljava/awt/Component;
    //   183: astore #5
    //   185: aload_0
    //   186: new burp/Ztzt
    //   189: dup
    //   190: aload #5
    //   192: aload_1
    //   193: getfield Zo : Ljava/awt/Component;
    //   196: aload_1
    //   197: getfield ZD : Lburp/Zeyc;
    //   200: aload_1
    //   201: getfield Zf : I
    //   204: invokespecial <init> : (Ljava/awt/Component;Ljava/awt/Component;Lburp/Zeyc;I)V
    //   207: putfield ZI : Lburp/Ztzt;
    //   210: aload_0
    //   211: new burp/Zevb
    //   214: dup
    //   215: aload_0
    //   216: aload_3
    //   217: aload #4
    //   219: invokespecial <init> : (Lburp/Zbcv;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    //   222: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   225: return
  }
  
  public void setVisible(boolean paramBoolean) {
    super.setVisible(paramBoolean);
    if (!paramBoolean)
      this.ZI.Zt(); 
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZI != null)
      this.ZI.Zf(); 
  }
  
  private static void lambda$new$0() {}
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '=x·L\\n³^QRÓ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #43
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
    //   68: putstatic burp/Zbcv.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zbcv.b : [Ljava/lang/String;
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
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #43
    //   154: goto -> 183
    //   157: iconst_1
    //   158: goto -> 183
    //   161: bipush #73
    //   163: goto -> 183
    //   166: bipush #74
    //   168: goto -> 183
    //   171: bipush #88
    //   173: goto -> 183
    //   176: bipush #70
    //   178: goto -> 183
    //   181: bipush #30
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
    int i = (paramInt1 ^ 0xFFFFD5A2) & 0xFFFF;
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
      char c = 'Ï';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */