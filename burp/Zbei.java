package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

public class Zbei extends Zbv5 implements Zt3u {
  private final Zekl Za;
  
  private final Zr1m Zy;
  
  private final Set<String> ZG;
  
  private Zm99 Zi;
  
  private Zzdy Zg;
  
  private Zzdy Zz;
  
  private Zzdy ZN;
  
  private Zzdy Zr;
  
  private Zzdy ZS;
  
  public Zzdy ZM;
  
  private Zzdy Zw;
  
  private Zzdy Zd;
  
  private Zzdy ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbei(Zekl paramZekl, Zr1m paramZr1m) {
    this.Za = paramZekl;
    this.Zy = paramZr1m;
    this.ZG = Set.of(new String[] { 
          Zjd(), a(22880, 9849), a(22904, 5817), a(22899, 22646), a(22901, -20226), a(22911, -11201), a(22883, 25583), a(22896, -16810), a(22898, -2854), a(22889, 15780), 
          a(22900, 24028), a(22907, 24414), a(22891, -6698), a(22885, 1744), a(22886, -27749), a(22910, 9498) });
    ZF();
    setName(a(22906, -11843));
  }
  
  public String Zjd() {
    return a(22908, -1368);
  }
  
  public String ZjS() {
    return a(22888, 9360);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_RESPONSE_MODIFICATION, this.Zy, new String[] { a(22884, 4855) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZG;
  }
  
  public void Zt2() {
    this.Zz.setSelected(this.Za.Zl5());
    this.Zr.setSelected(this.Za.Zlw());
    this.ZS.setSelected(this.Za.Zlx());
    this.ZM.setSelected(this.Za.Zl7());
    this.Zw.setSelected(this.Za.Zlu());
    this.ZR.setSelected(this.Za.ZlT());
    this.ZN.setSelected(this.Za.ZlU());
    this.Zg.setSelected(this.Za.ZlF());
    this.Zd.setSelected(this.Za.ZlZ());
    this.ZN.setEnabled(this.ZR.isSelected());
  }
  
  private void ZF() {
    this.ZR = new Zzdy();
    this.Zz = new Zzdy();
    this.ZM = new Zzdy();
    this.ZS = new Zzdy();
    this.Zr = new Zzdy();
    this.Zw = new Zzdy();
    this.Zg = new Zzdy();
    this.Zd = new Zzdy();
    this.Zi = new Zm99();
    this.ZN = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZR.setText(a(22905, 2284));
    this.ZR.addActionListener(new Zl5c(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZR, gridBagConstraints);
    this.Zz.setText(a(22902, -7));
    this.Zz.addActionListener(new Zb6h(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zz, gridBagConstraints);
    this.ZM.setText(a(22897, -26115));
    this.ZM.addActionListener(new Ztyf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZM, gridBagConstraints);
    this.ZS.setText(a(22881, -7761));
    this.ZS.addActionListener(new Zr2d(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZS, gridBagConstraints);
    this.Zr.setText(a(22909, 26273));
    this.Zr.addActionListener(new Zrb8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zr, gridBagConstraints);
    this.Zw.setText(a(22894, 22345));
    this.Zw.addActionListener(new Zsf6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zw, gridBagConstraints);
    this.Zg.setText(a(22890, 1427));
    this.Zg.addActionListener(new Zg4q(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zg, gridBagConstraints);
    this.Zd.setText(a(22882, 948));
    this.Zd.addActionListener(new Ztls(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zd, gridBagConstraints);
    this.Zi.setText(a(22903, -12052));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    add(this.Zi, gridBagConstraints);
    this.ZN.setText(a(22887, -280));
    this.ZN.addActionListener(new Ze6p(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZN, gridBagConstraints);
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.Za.Zf0(this.Zz.isSelected());
    this.Za.ZfU(this.Zr.isSelected());
    this.Za.Zf5(this.ZS.isSelected());
    this.Za.ZfJ(this.ZM.isSelected());
    this.Za.Zf6(this.Zw.isSelected());
    this.Za.Zfh(this.ZR.isSelected());
    this.Za.Zfv(this.ZN.isSelected());
    this.Za.ZfF(this.Zg.isSelected());
    this.Za.ZfA(this.Zd.isSelected());
    this.ZN.setEnabled(this.ZR.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':±´ÜÀ1ãK ÅPÁjK3§r=f}ú¡Ù-í%zð\\bþg>¼´Òó\\b*§'ÉG³É ÛÞñ['04 ^ôÎÁäRÿ0}ùmJÂo¯c\\t-7 ßÑ#J´o ·öóCâSa®ýÊFa4mb5bëÈ0Ä'¡M·v~;JKMÀvÎï´YÇGÓÕÜ2cXÉbhÐ@m³?*@Éë£ÏÄkÁ*ºÓï·{{ª;F­;ã\\t!N\\f\\néw9[á¬YøÝ+,ý0Ã5?`ÔsÔ¤¨ú\\rÕ¹Icº7Âr9^ZÚ\\r¦~ßÚ`÷}eÖ:jÉò}Q±ýU¬uòLòø&5qTSj2Ãù<0ÇÁÒrC¢ÁxÍÐs¹ÿ$j1p&!sºDÌ\\fû~Ì3ÿ·ùoÿc,ôär XW6Àç@éE`\\rV©¡Üæ&/§owÿ9Õm£ö¬úùcà'V#ìðJ4;9Jûyþo 2$/tÂí^½ä *ÛJî\QgíY¿öÖçs±gÃiTê®L\\n_`¨y#Ïbù'"Ä/ÍÍøÒ¶Ý\\fíÛs ü2yvÿRòró!Îõ*l-çut¸®ÐU5P²Ã~¢Á¦!M#jw·ì¡ BwÕïÐÐ6Âlc;$»i%6÷3ÛREÿhqnªM/{ÙZØ£$B{«ºf¹Ézgü$#ô½HIå&¹öÿ§×ãèÄËñ­#ãN6ÐÌÓôÂÝ´E¿EÆ' Þ ¥hjßÔé0.¥él¶D¾t>þÐé»wnµHrVùpAOÆ¹Hqâ,:EØ¦Dªk­ìéÊªÑÿ·ÈLO©'#-8½&£ÍäZ3±¢ÍzW©ùxBgý$1ª1ùù}Ó \\nd'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #33
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_2
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
    //   64: goto -> 23
    //   67: ldc 'VRt-ñ' üèxkÐòô¤¢Êõ\Ä`ûDåï»©aýFáËËJu²ÌÒµ×'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #25
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #99
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
    //   128: putstatic burp/Zbei.a : [Ljava/lang/String;
    //   131: bipush #29
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbei.b : [Ljava/lang/String;
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
    //   212: bipush #61
    //   214: goto -> 244
    //   217: bipush #71
    //   219: goto -> 244
    //   222: bipush #71
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #120
    //   239: goto -> 244
    //   242: bipush #75
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
    int i = (paramInt1 ^ 0x5972) & 0xFFFF;
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
      byte b1 = 15;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbei.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */