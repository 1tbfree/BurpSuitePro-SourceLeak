package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;

public class Zba0 extends Zbv5 implements Zt3u {
  private final Zxx6 Zr;
  
  private final Zgb6 ZW;
  
  private final Zr1m Zy;
  
  private final Set<String> ZH;
  
  private final String Zs;
  
  private boolean Z_;
  
  private Zzdy ZL;
  
  private Zzdy ZO;
  
  private Zzdy ZP;
  
  private Zzdy Zm;
  
  private Zm99 ZB;
  
  private Zm99 Zw;
  
  private Zgfl Zg;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zba0(Zxx6 paramZxx6, Zgb6 paramZgb6, Zr1m paramZr1m, Zr_4 paramZr_4) {
    this.Zr = paramZxx6;
    this.ZW = paramZgb6;
    this.Zy = paramZr1m;
    Zd();
    setName(a(10260, 27872));
    String str1 = a(10271, 1420);
    this.ZH = Set.of(str1, a(10249, 12495), a(10248, 27017), a(10252, 483), a(10250, 13395), a(10266, -26409), a(10263, -26162), a(10261, 8241), a(10270, -18571));
    String str2 = "";
    if (!paramZr_4.Zi()) {
      str2 = a(10256, -3066);
      ZZ();
    } 
    this.Zs = str1 + str1;
    this.Zg.ZO(a(10259, -6818), a(10268, 5621));
    this.Zg.Zv(new Zr_n(this));
  }
  
  public String Zjd() {
    return this.Zs;
  }
  
  public String ZjS() {
    return a(10262, 2018);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(10254, -18767), Zk97.DESKTOP_SETTINGS_PROJECT_AUTOMATIC_BACKUP_AUTOMATIC_BACKUP, this.Zy, new String[] { a(10269, 20877) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZH;
  }
  
  private void ZZ() {
    this.Z_ = true;
    this.ZO.setEnabled(false);
    this.Zg.setEnabled(false);
    this.ZB.setEnabled(false);
    this.ZP.setEnabled(false);
    this.Zm.setEnabled(false);
    this.ZL.setEnabled(false);
  }
  
  public void Zt2() {
    if (this.Z_)
      return; 
    boolean bool = this.ZW.ZfY();
    this.ZO.setSelected(bool);
    int i = this.ZW.Zfs();
    ZB(i);
    this.Zg.setText(Integer.toString(i));
    this.Zg.setEnabled(bool);
    this.ZP.setSelected(this.ZW.ZEv());
    this.ZP.setEnabled(bool);
    this.Zm.setSelected(this.ZW.ZEl());
    this.Zm.setEnabled(bool);
    this.ZL.setSelected(this.ZW.Zf9());
    this.ZL.setEnabled(bool);
    this.Zr.Zz();
  }
  
  private void ZB(int paramInt) {
    this.ZB.setText((paramInt == 1) ? a(10251, -1014) : a(10255, -11962));
  }
  
  private void Zd() {
    this.ZO = new Zzdy();
    this.Zg = new Zgfl();
    this.ZB = new Zm99();
    this.Zw = new Zm99();
    this.ZP = new Zzdy();
    this.Zm = new Zzdy();
    this.ZL = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZO.setText(a(10253, -1390));
    this.ZO.addActionListener(new Zmkv(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.ZO, gridBagConstraints);
    this.Zg.setColumns(4);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    add(this.Zg, gridBagConstraints);
    this.ZB.setText(a(10265, -22803));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 21;
    add(this.ZB, gridBagConstraints);
    this.Zw.setText(a(10264, -25322));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    add(this.Zw, gridBagConstraints);
    this.ZP.setText(a(10258, -23959));
    this.ZP.addActionListener(new Zk5r(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZP, gridBagConstraints);
    this.Zm.setText(a(10257, 3320));
    this.Zm.addActionListener(new Zm10(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.Zm, gridBagConstraints);
    this.ZL.setText(a(10267, -24291));
    this.ZL.addActionListener(new Zgrp(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.ZL, gridBagConstraints);
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    boolean bool = this.ZO.isSelected();
    this.ZW.ZHW(bool);
    this.Zg.setEnabled(bool);
    this.ZP.setEnabled(bool);
    this.Zm.setEnabled(bool);
    this.ZL.setEnabled(bool);
    this.Zr.Zz();
  }
  
  private void ZA(ActionEvent paramActionEvent) {
    this.ZW.ZH7(this.ZP.isSelected());
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.ZW.ZHT(this.Zm.isSelected());
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    this.ZW.ZHn(this.ZL.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'VÇ"¢jÒ±%,»Ì/Ñ´ç·*½DÐ¯âi®\\rñ$½4{ÀMny+Mûxh`F¥¼Y [õü¶3Ä¼`Ü´ÞÒ§èê´/\\b­+Avhi2á8l eþÀ,±_Àr57DÉÈ*Ûæ¸^rß7`VzÀ]E¬è2"ûÞ\\bÁ<Q,\\bZÉyÜÐ<]³\\r"cõÿÇâO£J!É³JZp{p>óâÏxNCåÆØcçÈ\iÄã\ÆÌ¶ÑíMÔµj°êC¡ÒP\\r<-p8<MimC(Ø;s<SIß¹¨ÌÚ&x¹|p{7Ty<n>^\\bÁÎ±¥XÁF1ÚcùËÊªtGWq¯(ÒÉ$pôSR[;TÜQf,N'']þqY+B wÅÐ£ÛáO \\tÙÕ-¢ÎXÐ:MnAä­§gc¡ª yC?ã«åÆ¡¦#½)·ì|óM!ÿÇ¸±È+6êú\\b&¨þTÄZÛ3épQ-Ð ¿F°«Iä¬3KBÍGNÏÚ;ø¤ûÚ=¨èôûË»àñü÷ß´Wuâ;´9ÃG¾ï'ÊÅ9m!Õ¹Éa aíËübÛ7ÎìÃ7ÞÃ@}ò\\bß©g°\\nõ¥ãdÝP!âÍæ<$ëÌÎ=X=P.8ú+AÌZ\\tÎ,ä¼lä!c~ÞÒû'C'\\n*'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #42
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #42
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Åºmé\\f'@oL×­ø<ïc8'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #29
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zba0.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zba0.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #97
    //   219: goto -> 244
    //   222: bipush #127
    //   224: goto -> 244
    //   227: bipush #118
    //   229: goto -> 244
    //   232: bipush #56
    //   234: goto -> 244
    //   237: bipush #116
    //   239: goto -> 244
    //   242: bipush #80
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x281D) & 0xFFFF;
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
      char c = 'õ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */