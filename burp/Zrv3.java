package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import net.portswigger.Zkb;
import net.portswigger.Zm2;

public class Zrv3 extends Zrh7 {
  private Zm2o ZR;
  
  private Zbkc Zu;
  
  private Zm99 Zm;
  
  private Zbqc ZK;
  
  private Ze01 ZJ;
  
  private Ze01 Zs;
  
  private Zl8w Zl;
  
  private Zl8w ZD;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrv3(Window paramWindow) {
    super(paramWindow, false, Zzv7.CLICKBANDIT_UI_DIALOG);
    ZU();
    setTitle(a(24471, 20058));
    Zmse.Zb(this, 120);
    pack();
    Zq(paramWindow);
    setVisible(true);
  }
  
  private void ZU() {
    this.ZK = new Zbqc();
    this.ZR = new Zm2o();
    this.Zu = new Zbkc();
    this.Zl = new Zl8w();
    this.Zs = new Ze01();
    this.ZJ = new Ze01();
    this.Zm = new Zm99();
    this.ZD = new Zl8w();
    setDefaultCloseOperation(2);
    this.ZK.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.ZK.setLayout(gridBagLayout);
    this.ZR.Zi(Zk97.DESKTOP_TOOLS_CLICKBANDIT);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.ZK.add(this.ZR, gridBagConstraints);
    this.Zu.Zx(a(24470, 12589));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.ZK.add(this.Zu, gridBagConstraints);
    this.Zl.setText(a(24465, -5345));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZK.add(this.Zl, gridBagConstraints);
    this.Zs.setText(a(24467, 14174));
    this.Zs.addActionListener(new Zmr_(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    this.ZK.add(this.Zs, gridBagConstraints);
    this.ZJ.setText(a(24469, 6923));
    this.ZJ.addActionListener(new Zeif(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    this.ZK.add(this.ZJ, gridBagConstraints);
    this.Zm.setText(a(24466, -19724));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    this.ZK.add(this.Zm, gridBagConstraints);
    this.ZD.setText(a(24464, 7645));
    this.ZD.Zl(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZK.add(this.ZD, gridBagConstraints);
    getContentPane().add(this.ZK, a(24472, -22919));
    pack();
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.SUITE_CLICKBANDIT_EXPORTED);
    byte[] arrayOfByte = Zgyo.ZJ(a(24468, -17265));
    (new Zb0h()).ZR(Zkb.ZG(arrayOfByte));
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ú§Å·êØ®]½¥p_56zvª\\rømÓ4B w¶ª?ÛBx®:9¸'0Y÷ëùðí!æeÁ$ç&(O¥NÁ3îÊ"b½ëöeR«5=êâa`**Îªußhe¬®µzoYí_~SÈÿÉG%cKÀ[ hÎµXp 8,¢i(ä\\f¤Êü{^Oþ& zÛôáõd¾O^͹J·Fx27íÿ«\\nò}è¦*æ.1 @|mx .ë_Ó_íNö9ø½DÙH÷¸ºîÿ+ÂÑãb¨4¿IU}e¸{Ã7\\t>¼ï wäõOE|í¹-DZ"ìOæ¯®íÿz\\bIÌ4ýjK\\b6ÖXç¤¯ò)ãÊÍ<q+8eui×`*JN³ñÝËù°Ê ë+W¼÷AÝ¢¹Iïçþ\\bt]gd¸Ç{ ÷RÂFKvªïj~ç1YÎÂ£K±EèoZ¢òvç­âvå?Ë0¦üÕXË½'OÏ5Ç´hã(íåô©»ÈO²JwÎ·úV\\tdùæ<ûG7dµ:µã:ýR§ÎV ä¬}rDÕOâ8þuY/ºCw.ÞÀãÐÊû¶IöÃ¾Æ8¿l»vÍ.$ñ§SlnVëeMÉ}µ1èBÏÌâ@e4ÃAÇó\\r4`ä\\r¼Î8s2NP\Sµ\\bÊH¿w/É®ù¶òÿí VÞþDÏ`¦ï y#VÖFéyçªÛx´þzR¶l¨þÉ+hæA2Fg»Ð'c '¶È0-WyºçvïJ^Soè¨x¯bÜsmìW<ßhpò®npSÎqY1¤ÉY%§æýë;å_3\\r-xµVM_*e ­h1,³#ÌÌ\\fl)­J\\nçUÓü\\b(Û¸Á{õÊR%µüåÔg²¿ý³AÔU;Ð&)s®^Og"ÖN4¹HAï^âÞÀ?%¯(¦X°ùÅ³9c?ä_ÈxöOd¢þüS°ÉÊ|Rd\\r.·YÈó¦~îY±+µíµáë(-Avá^òÜp!§P¦!5*ÝÁWá¸¢à±±òS0ív¥FÍ!«k(~Ð×¡æwÎ­ï§ë»ãÚ¬³ôé?\\b\\bþñïþ@.ÈÞÄ¼£ÊX\K®ÄNpÄV9F£&§(Ô-Ù;H pQ³*Éb´]ÉË®¨?*<º\\rÅÒgYû+rç^Q\\rZX:ø"ªæúª» àñÆàxH^×}åA9¶|ÒÁ}c9deçüOG¶lÆ ULñ-à²uö8sN £$÷Z^Ý\\bÏìôñ\\býuRÝ#ò *ù6Vf\ÿ\\fè©Æ¬"­ï@¿Á¿ÔÈ3«{äÎ%3'îd%2­T\\noS¯¦æù?S5åHñý{àë\\fP\\fRÚP"åÊép{Üûp_ôÓ5ä8it3e'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #184
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #37
    //   26: iinc #0, 1
    //   29: aload_2
    //   30: iload_0
    //   31: dup
    //   32: iload_1
    //   33: iadd
    //   34: invokevirtual substring : (II)Ljava/lang/String;
    //   37: iconst_m1
    //   38: goto -> 144
    //   41: aload #5
    //   43: swap
    //   44: iload_3
    //   45: iinc #3, 1
    //   48: swap
    //   49: aastore
    //   50: iload_0
    //   51: iload_1
    //   52: iadd
    //   53: dup
    //   54: istore_0
    //   55: iload #4
    //   57: if_icmpge -> 69
    //   60: aload_2
    //   61: iload_0
    //   62: invokevirtual charAt : (I)C
    //   65: istore_1
    //   66: goto -> 24
    //   69: ldc '0ã©n»ê ôÓùôçwXQ'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #16
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #19
    //   85: iinc #0, 1
    //   88: aload_2
    //   89: iload_0
    //   90: dup
    //   91: iload_1
    //   92: iadd
    //   93: invokevirtual substring : (II)Ljava/lang/String;
    //   96: iconst_0
    //   97: goto -> 144
    //   100: aload #5
    //   102: swap
    //   103: iload_3
    //   104: iinc #3, 1
    //   107: swap
    //   108: aastore
    //   109: iload_0
    //   110: iload_1
    //   111: iadd
    //   112: dup
    //   113: istore_0
    //   114: iload #4
    //   116: if_icmpge -> 128
    //   119: aload_2
    //   120: iload_0
    //   121: invokevirtual charAt : (I)C
    //   124: istore_1
    //   125: goto -> 83
    //   128: aload #5
    //   130: putstatic burp/Zrv3.a : [Ljava/lang/String;
    //   133: bipush #9
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zrv3.b : [Ljava/lang/String;
    //   141: goto -> 300
    //   144: dup_x2
    //   145: pop
    //   146: invokevirtual toCharArray : ()[C
    //   149: dup_x1
    //   150: arraylength
    //   151: dup_x2
    //   152: pop
    //   153: iconst_0
    //   154: istore #6
    //   156: dup2_x1
    //   157: pop2
    //   158: dup_x2
    //   159: iconst_1
    //   160: if_icmpgt -> 260
    //   163: dup2
    //   164: swap
    //   165: iload #6
    //   167: dup2_x1
    //   168: caload
    //   169: swap
    //   170: iload #6
    //   172: bipush #7
    //   174: irem
    //   175: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #44
    //   214: goto -> 244
    //   217: bipush #48
    //   219: goto -> 244
    //   222: bipush #105
    //   224: goto -> 244
    //   227: bipush #35
    //   229: goto -> 244
    //   232: bipush #62
    //   234: goto -> 244
    //   237: bipush #34
    //   239: goto -> 244
    //   242: bipush #54
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 167
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 163
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 41, 0 -> 100
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5F90) & 0xFFFF;
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
      byte b1 = 88;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */