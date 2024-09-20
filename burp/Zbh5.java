package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;

class Zbh5 extends Zbqc {
  private static final String[] a;
  
  private static final String[] b;
  
  private Zbh5(String paramString, Component paramComponent) {
    this(paramString, paramComponent, null);
  }
  
  private Zbh5(String paramString, Component paramComponent1, Component paramComponent2) {
    super(new BorderLayout());
    Zm99 zm99 = new Zm99(paramString);
    zm99.ZE(Zt00.BOLD_FONT);
    Zbqc zbqc1 = new Zbqc(new BorderLayout());
    zbqc1.Zl(Zlkk.INSPECTOR_TABLE_HEADING_BACKGROUND);
    zbqc1.setBorder(new EmptyBorder(5, 10, 3, 10));
    zbqc1.add(zm99, a(11486, 7221));
    if (paramComponent2 != null)
      zbqc1.add(paramComponent2, a(11485, -19282)); 
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.Zl(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    zbqc2.setBorder(new Zr43(Zlkk.INSPECTOR_TABLE_HEADING_BACKGROUND, 2, new Insets(10, 10, 10, 10)));
    zbqc2.add(paramComponent1, a(11484, 4826));
    add(zbqc1, a(11487, -7972));
    add(zbqc2, a(11484, 4826));
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    return new Dimension(Math.max(150, dimension.width), dimension.height);
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    return new Dimension(Math.max(150, dimension.width), dimension.height);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '21$Î[Òük'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: iconst_4
    //   22: iinc #0, 1
    //   25: aload_2
    //   26: iload_0
    //   27: dup
    //   28: iload_1
    //   29: iadd
    //   30: invokevirtual substring : (II)Ljava/lang/String;
    //   33: iconst_m1
    //   34: goto -> 137
    //   37: aload #5
    //   39: swap
    //   40: iload_3
    //   41: iinc #3, 1
    //   44: swap
    //   45: aastore
    //   46: iload_0
    //   47: iload_1
    //   48: iadd
    //   49: dup
    //   50: istore_0
    //   51: iload #4
    //   53: if_icmpge -> 65
    //   56: aload_2
    //   57: iload_0
    //   58: invokevirtual charAt : (I)C
    //   61: istore_1
    //   62: goto -> 21
    //   65: ldc 'S_¥\\nÑiGRB½'
    //   67: dup
    //   68: astore_2
    //   69: invokevirtual length : ()I
    //   72: istore #4
    //   74: iconst_5
    //   75: istore_1
    //   76: iconst_m1
    //   77: istore_0
    //   78: iconst_2
    //   79: iinc #0, 1
    //   82: aload_2
    //   83: iload_0
    //   84: dup
    //   85: iload_1
    //   86: iadd
    //   87: invokevirtual substring : (II)Ljava/lang/String;
    //   90: iconst_0
    //   91: goto -> 137
    //   94: aload #5
    //   96: swap
    //   97: iload_3
    //   98: iinc #3, 1
    //   101: swap
    //   102: aastore
    //   103: iload_0
    //   104: iload_1
    //   105: iadd
    //   106: dup
    //   107: istore_0
    //   108: iload #4
    //   110: if_icmpge -> 122
    //   113: aload_2
    //   114: iload_0
    //   115: invokevirtual charAt : (I)C
    //   118: istore_1
    //   119: goto -> 78
    //   122: aload #5
    //   124: putstatic burp/Zbh5.a : [Ljava/lang/String;
    //   127: iconst_4
    //   128: anewarray java/lang/String
    //   131: putstatic burp/Zbh5.b : [Ljava/lang/String;
    //   134: goto -> 296
    //   137: dup_x2
    //   138: pop
    //   139: invokevirtual toCharArray : ()[C
    //   142: dup_x1
    //   143: arraylength
    //   144: dup_x2
    //   145: pop
    //   146: iconst_0
    //   147: istore #6
    //   149: dup2_x1
    //   150: pop2
    //   151: dup_x2
    //   152: iconst_1
    //   153: if_icmpgt -> 256
    //   156: dup2
    //   157: swap
    //   158: iload #6
    //   160: dup2_x1
    //   161: caload
    //   162: swap
    //   163: iload #6
    //   165: bipush #7
    //   167: irem
    //   168: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #75
    //   210: goto -> 240
    //   213: bipush #106
    //   215: goto -> 240
    //   218: bipush #17
    //   220: goto -> 240
    //   223: bipush #24
    //   225: goto -> 240
    //   228: bipush #81
    //   230: goto -> 240
    //   233: bipush #16
    //   235: goto -> 240
    //   238: bipush #60
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 160
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 156
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 37, 0 -> 94
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2CDD) & 0xFFFF;
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
      char c = '×';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */