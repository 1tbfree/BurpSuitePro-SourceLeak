package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;

class Zbtv extends Zbg2 {
  private final Zzlr ZU;
  
  private final int Zz;
  
  private Zm2o ZZ;
  
  private Zl8w Zm;
  
  private Zm99 Zx;
  
  private ButtonGroup ZW;
  
  private Zzdy ZX;
  
  private Zbkc ZM;
  
  private Zbqc Zy;
  
  private Zmg2 Zj;
  
  private Zmg2 ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtv(Zzlr paramZzlr, int paramInt) {
    this.ZU = paramZzlr;
    this.Zz = paramInt;
    ZK();
    this.ZM.Zx(a(-15360, -6120) + a(-15360, -6120));
    this.ZB = new String[] { a(-15356, 8240), a(-15353, 16796) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  public void ZC() {
    Zl6 zl6 = this.ZU.Zh(this.Zz);
    this.Zy.removeAll();
    if (zl6.ZI == Zxl3.PROJECT_FILE)
      this.Zy.add(zl6.ZA.ZC(), a(-15358, 25423)); 
  }
  
  private void ZK() {
    this.ZW = new ButtonGroup();
    this.Zj = new Zmg2();
    this.ZR = new Zmg2();
    this.ZX = new Zzdy();
    this.Zx = new Zm99();
    this.Zm = new Zl8w();
    this.ZZ = new Zm2o();
    this.Zy = new Zbqc();
    this.ZM = new Zbkc();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZW.add(this.Zj);
    this.Zj.setSelected(true);
    this.Zj.setText(a(-15357, -21362));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zj, gridBagConstraints);
    this.ZW.add(this.ZR);
    this.ZR.setText(a(-15345, 13019));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZR, gridBagConstraints);
    this.ZX.setText(a(-15354, 30190));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(10, 0, 15, 0);
    add(this.ZX, gridBagConstraints);
    this.Zx.setText(a(-15355, -2833));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    add(this.Zx, gridBagConstraints);
    this.Zm.setText(a(-15359, -10969));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zm, gridBagConstraints);
    this.ZZ.Zi(Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_COMPARING_SITE_MAP_SOURCES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.ZZ, gridBagConstraints);
    this.Zy.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zy, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZM, gridBagConstraints);
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic Zp : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 115, 0 -> 32, 1 -> 43
    //   32: aload_0
    //   33: getfield ZU : Lburp/Zzlr;
    //   36: aload_0
    //   37: invokevirtual Zw : (Lburp/Zsic;)Lburp/Zsic;
    //   40: goto -> 125
    //   43: aload_0
    //   44: getfield ZU : Lburp/Zzlr;
    //   47: aload_0
    //   48: getfield Zz : I
    //   51: invokevirtual Zh : (I)Lburp/Zl6;
    //   54: astore_3
    //   55: aload_0
    //   56: getfield Zj : Lburp/Zmg2;
    //   59: invokevirtual isSelected : ()Z
    //   62: ifeq -> 76
    //   65: aload_3
    //   66: getstatic burp/Zxyi.INCLUDE_ALL : Lburp/Zxyi;
    //   69: putfield ZN : Lburp/Zxyi;
    //   72: aload_2
    //   73: ifnull -> 93
    //   76: aload_0
    //   77: getfield ZR : Lburp/Zmg2;
    //   80: invokevirtual isSelected : ()Z
    //   83: ifeq -> 93
    //   86: aload_3
    //   87: getstatic burp/Zxyi.INCLUDE_SELECTED : Lburp/Zxyi;
    //   90: putfield ZN : Lburp/Zxyi;
    //   93: aload_3
    //   94: aload_0
    //   95: getfield ZX : Lburp/Zzdy;
    //   98: invokevirtual isSelected : ()Z
    //   101: putfield ZE : Z
    //   104: aload_0
    //   105: getfield ZU : Lburp/Zzlr;
    //   108: aload_0
    //   109: invokevirtual ZV : (Lburp/Zsic;)Lburp/Zsic;
    //   112: goto -> 125
    //   115: iconst_0
    //   116: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   119: iload_1
    //   120: i2l
    //   121: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   124: aload_0
    //   125: areturn
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '*¿"ì4\\fSðP¢ÓéËÙ7÷µÓx3ïö»ô¤@O|Ëwq\\t.n`x-Í^v´Ðre¸ÞÛÓ°*×¯@òß9¨Ď">Ï@=y5Âu¯Ïµ|)lÀ"M\\t^©ÜWV]>a+Ü7> ó~§6þm.SÔ>y[vÓçM§| k¬_qÕpÏç=y7ã#ü9{; -(aqÅGè¥Üo~o ýsL³ÝI1TÇÿleÿ3.ûÞEBEÁg®\\nf9 Ñt-ô]¸¸Ù^Õ[;ïjÁÚ$¼ËÚGù.w+ñ úÉ´{¿ZÐy¦@¹çÙÌ±y5¦ùy ²ÑÔú¹Fiº8>YÚÎRÒ>MWÏ¹=²D0ú´t¹E&fª\\nYÀïß$§Çtà5EäS=Ä'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #43
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   67: ldc 'sáÏ¹õÊÇ¤Uâ3,Uz$awùoc 0;³?À?Ø'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #9
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #91
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbtv.a : [Ljava/lang/String;
    //   131: bipush #9
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbtv.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #22
    //   224: goto -> 244
    //   227: bipush #81
    //   229: goto -> 244
    //   232: bipush #36
    //   234: goto -> 244
    //   237: bipush #99
    //   239: goto -> 244
    //   242: bipush #78
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC407) & 0xFFFF;
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
      char c = 'ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */