package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.SwingUtilities;

class Zbcz extends Zbqc {
  private final Ze9n ZU = Ze3m.ZC(Zeuf.CHEVRON_DOWN, Zlkk.ACTION_NORMAL).ZG(Zlkk.ACTION_HOVER).ZU(Zmcx.LARGE_LINE_SIZE).Z_();
  
  private final Ze9n Zi = Ze3m.ZC(Zeuf.CHEVRON_UP, Zlkk.ACTION_NORMAL).ZG(Zlkk.ACTION_HOVER).ZU(Zmcx.LARGE_LINE_SIZE).Z_();
  
  private final Box.Filler Zd;
  
  private final Zkj9 Za;
  
  private final Zm99 ZQ;
  
  private boolean ZW;
  
  final Zbc6 Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zbcz(Zbc6 paramZbc6, Zm99 paramZm99) {
    this.ZQ = paramZm99;
    this.Zd = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Za = new Zkj9();
    setLayout(new GridBagLayout());
    setName(a(-9485, -20211));
    setAlignmentY(0.5F);
    setOpaque(false);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(paramZm99, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = (getComponents()).length;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    gridBagConstraints.insets = Zbc6.Zr;
    this.ZW = false;
    Zm99 zm99 = new Zm99(this.ZU);
    zm99.setOpaque(false);
    zm99.setName(a(-9486, 16685));
    addMouseListener(new Zza9(this, paramZbc6, zm99));
    this.Za.addPopupMenuListener(new Zzq7(this, paramZbc6, zm99));
    add(zm99, gridBagConstraints);
    ZT();
  }
  
  private void Zt(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: invokestatic ZQ : ()Z
    //   3: istore_3
    //   4: iload_1
    //   5: ifne -> 12
    //   8: iload_2
    //   9: ifeq -> 60
    //   12: aload_0
    //   13: getfield Zi : Lburp/Ze9n;
    //   16: invokevirtual Zx : ()V
    //   19: aload_0
    //   20: getfield ZU : Lburp/Ze9n;
    //   23: invokevirtual Zx : ()V
    //   26: aload_0
    //   27: getfield Zl : Lburp/Zbc6;
    //   30: getfield ZI : Lburp/Ze9n;
    //   33: invokevirtual Zx : ()V
    //   36: aload_0
    //   37: getfield Zl : Lburp/Zbc6;
    //   40: getfield ZG : Lburp/Ze9n;
    //   43: invokevirtual Zx : ()V
    //   46: aload_0
    //   47: getfield ZQ : Lburp/Zm99;
    //   50: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   53: invokevirtual Ze : (Lburp/Zlkk;)V
    //   56: iload_3
    //   57: ifeq -> 104
    //   60: aload_0
    //   61: getfield Zi : Lburp/Ze9n;
    //   64: invokevirtual Zm : ()V
    //   67: aload_0
    //   68: getfield ZU : Lburp/Ze9n;
    //   71: invokevirtual Zm : ()V
    //   74: aload_0
    //   75: getfield Zl : Lburp/Zbc6;
    //   78: getfield ZI : Lburp/Ze9n;
    //   81: invokevirtual Zm : ()V
    //   84: aload_0
    //   85: getfield Zl : Lburp/Zbc6;
    //   88: getfield ZG : Lburp/Ze9n;
    //   91: invokevirtual Zm : ()V
    //   94: aload_0
    //   95: getfield ZQ : Lburp/Zm99;
    //   98: getstatic burp/Zlkk.FILTER_BAR_FOREGROUND : Lburp/Zlkk;
    //   101: invokevirtual Ze : (Lburp/Zlkk;)V
    //   104: aload_0
    //   105: invokevirtual repaint : ()V
    //   108: return
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.Za != null)
      SwingUtilities.updateComponentTreeUI(this.Za); 
  }
  
  private void ZW(Zl2d paramZl2d) {
    Zbqc zbqc = new Zbqc(new GridBagLayout());
    zbqc.setBorder(BorderFactory.createEmptyBorder(0, 6, 6, 6));
    boolean bool = Zm99.ZM();
    byte b = 0;
    if ((this.Za.getComponents()).length > 0) {
      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = b++;
      gridBagConstraints.weightx = 1.0D;
      gridBagConstraints.anchor = 23;
      gridBagConstraints.fill = 2;
      gridBagConstraints.insets = new Insets(2, 0, 2, 0);
      zbqc.add(new Zem9(0), gridBagConstraints);
    } 
    for (AbstractButton abstractButton : paramZl2d.ZN) {
      GridBagConstraints gridBagConstraints = new GridBagConstraints();
      gridBagConstraints.gridx = 0;
      gridBagConstraints.gridy = b++;
      gridBagConstraints.weightx = 1.0D;
      gridBagConstraints.anchor = 23;
      gridBagConstraints.insets = new Insets(6, 0, 0, 0);
      zbqc.add(abstractButton, gridBagConstraints);
      if (!bool)
        break; 
    } 
    zbqc.setOpaque(false);
    this.Za.add(zbqc);
  }
  
  private void ZT() {
    remove(this.Zd);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = (getComponents()).length;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zd, gridBagConstraints);
  }
  
  private void ZD(Component paramComponent, int paramInt1, int paramInt2) {
    this.Za.show(paramComponent, paramInt1, paramInt2);
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'rÇÓ9qÀ77=´5P36û ¶28#(Þäø?ßØD4Bl\\f¹·]¤Æ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #17
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #90
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
    //   69: putstatic burp/Zbcz.a : [Ljava/lang/String;
    //   72: iconst_2
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zbcz.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #93
    //   154: goto -> 183
    //   157: bipush #64
    //   159: goto -> 183
    //   162: bipush #17
    //   164: goto -> 183
    //   167: bipush #96
    //   169: goto -> 183
    //   172: bipush #99
    //   174: goto -> 183
    //   177: iconst_2
    //   178: goto -> 183
    //   181: bipush #32
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
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
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFDAF3) & 0xFFFF;
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
      char c = '®';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */