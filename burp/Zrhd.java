package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.util.List;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrhd extends Zrh7 {
  private final Zz0n ZA;
  
  private final Zt4u Zh;
  
  private final Zl_2 Zd;
  
  private final List<String> Zu;
  
  private final Zt0_ ZT;
  
  private final Zbws ZO;
  
  private Zbqc Ze;
  
  private Ze01 Zn;
  
  private Ze01 ZF;
  
  private Ze01 Zj;
  
  private Ze01 Zy;
  
  private Ze01 Zx;
  
  private Ze01 ZK;
  
  private Zbup Zg;
  
  private Zgff Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrhd(Window paramWindow, Zz0n paramZz0n, Zt4u paramZt4u, Zl_2 paramZl_2, List<String> paramList) {
    super(paramWindow, true, Zzv7.LIST_CHOOSER_UI_DIALOG);
    this.ZA = paramZz0n;
    this.Zh = paramZt4u;
    this.Zd = paramZl_2;
    this.Zu = paramList;
    Zl();
    this.ZT = new Zt0_<>(paramList);
    this.ZO = new Zbws(this.ZT);
    this.Zg.setViewportView(this.ZO);
    setTitle(a(-6006, -14022));
    pack();
    Zq(paramWindow);
    setDefaultCloseOperation(0);
    addWindowListener(new Zsay(this));
    setVisible(true);
  }
  
  private boolean ZM(String paramString) {
    String[] arrayOfString = Zbv5.ZvS();
    if (paramString.length() > 0 && !this.Zu.contains(paramString)) {
      synchronized (this.Zu) {
        byte b = 0;
        while (b < this.Zu.size() && ((String)this.Zu.get(b)).compareToIgnoreCase(paramString) <= 0) {
          b++;
          if (arrayOfString == null)
            break; 
        } 
        this.Zu.add(b, paramString);
        this.ZT.fireTableRowsInserted(b, b);
      } 
      return true;
    } 
    return false;
  }
  
  public static String Zp(List<String> paramList) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZvS : ()[Ljava/lang/String;
    //   11: aload_0
    //   12: invokeinterface iterator : ()Ljava/util/Iterator;
    //   17: astore_3
    //   18: astore_1
    //   19: aload_3
    //   20: invokeinterface hasNext : ()Z
    //   25: ifeq -> 94
    //   28: aload_2
    //   29: invokevirtual length : ()I
    //   32: bipush #60
    //   34: if_icmple -> 55
    //   37: aload_2
    //   38: sipush #-6012
    //   41: sipush #23347
    //   44: invokestatic a : (II)Ljava/lang/String;
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: aload_1
    //   52: ifnonnull -> 94
    //   55: aload_2
    //   56: invokevirtual length : ()I
    //   59: ifle -> 76
    //   62: aload_2
    //   63: sipush #-6016
    //   66: sipush #-2210
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_2
    //   77: aload_3
    //   78: invokeinterface next : ()Ljava/lang/Object;
    //   83: checkcast java/lang/String
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload_1
    //   91: ifnonnull -> 19
    //   94: aload_2
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: areturn
  }
  
  private void Zl() {
    this.Ze = new Zbqc();
    this.Zn = new Ze01();
    this.Zk = new Zgff();
    this.Zy = new Ze01();
    this.ZK = new Ze01();
    this.ZF = new Ze01();
    this.Zg = new Zbup();
    this.Zx = new Ze01();
    this.Zj = new Ze01();
    this.Ze.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    this.Ze.setLayout(gridBagLayout);
    this.Zn.setText(a(-6004, 13464));
    this.Zn.setToolTipText(a(-6014, 28914));
    this.Zn.setIconTextGap(0);
    this.Zn.addActionListener(new Zsq_(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Ze.add(this.Zn, gridBagConstraints);
    this.Zk.setColumns(20);
    this.Zk.ZM(a(-6008, 25245));
    this.Zk.addActionListener(new Zmkj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    this.Ze.add(this.Zk, gridBagConstraints);
    this.Zy.setText(a(-6015, -539));
    this.Zy.setToolTipText(a(-6011, -1749));
    this.Zy.addActionListener(new Zbfn(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Ze.add(this.Zy, gridBagConstraints);
    this.ZK.setText(a(-6002, -9108));
    this.ZK.setToolTipText(a(-6001, -17396));
    this.ZK.addActionListener(new Zv7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Ze.add(this.ZK, gridBagConstraints);
    this.ZF.setText(a(-6003, -8539));
    this.ZF.setToolTipText(a(-6005, -13999));
    this.ZF.addActionListener(new Zsgx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Ze.add(this.ZF, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    this.Ze.add(this.Zg, gridBagConstraints);
    this.Zx.setText(a(-6007, -27301));
    this.Zx.setToolTipText(a(-6009, 26136));
    this.Zx.addActionListener(new Zkg7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    this.Ze.add(this.Zx, gridBagConstraints);
    this.Zj.setText(a(-6010, -28784));
    this.Zj.addActionListener(new Zeau(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 20, 0, 0);
    this.Ze.add(this.Zj, gridBagConstraints);
    getContentPane().add(this.Ze, a(-6013, 12723));
  }
  
  private void ZD(ActionEvent paramActionEvent) {
    String[] arrayOfString = Zbv5.ZvS();
    try {
      String str1 = this.ZA.ZD().Zp();
      if (str1 == null)
        return; 
      BufferedReader bufferedReader = new BufferedReader(new StringReader(str1));
      String str2;
      while ((str2 = bufferedReader.readLine()) != null) {
        ZM(str2);
        if (arrayOfString == null)
          break; 
      } 
      bufferedReader.close();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    synchronized (this.Zu) {
      this.Zu.clear();
      this.ZT.fireTableDataChanged();
    } 
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    int i = this.ZO.getSelectedRow();
    if (i >= 0 && i < this.Zu.size())
      synchronized (this.Zu) {
        this.Zu.remove(i);
        this.ZT.fireTableRowsDeleted(i, i);
        this.ZO.getSelectionModel().setSelectionInterval(i, i);
        this.ZO.requestFocus();
      }  
    if (i >= this.ZO.getRowCount())
      i--; 
    if (i >= 0 && i < this.ZO.getRowCount())
      this.ZO.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void Ze(ActionEvent paramActionEvent) {
    String[] arrayOfString = Zbv5.ZvS();
    File file = Zs6n.ZP(Zg1m.CONFIG, this.Zh, this, 0);
    if (file != null)
      try {
        for (String str : Zs6n.ZJ(file, this.ZA.ZM())) {
          ZM(str);
          if (arrayOfString == null)
            break; 
        } 
      } catch (Exception exception) {
        Zah.Zl(exception, Zk_.UNEXPECTED);
      }  
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    Zw((ActionEvent)null);
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.Zk.focusLost((FocusEvent)null);
    if (ZM(this.Zk.getText()))
      this.Zk.setText(""); 
    this.Zk.requestFocus();
    this.Zk.focusGained((FocusEvent)null);
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.Zd.Zz(this.Zu);
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\Òz®wH×T%Ik`\\t $Pót¶õÄÐVà\\tPÛ9~o°v»XÜ®¹\\nMxÊÊiçN©=h¢¥ÀUl7å`§­gW¢Ú¸!¡'ÅsI,ÈñB¹,ÛïWt=¤fÍ]¢ýk6A\\r÷;n~éüQg/HèßÞß\\bÐª:W}¿ ç*¦hyÐ S£õY¹i6*À½ïtÙÌKýö¾fºn~¸mâµ?öës'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #30
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc 'ÑRû³®àâ¡ÛôxÙ¤Úþ\\t®;<*e'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #20
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #108
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
    //   129: putstatic burp/Zrhd.a : [Ljava/lang/String;
    //   132: bipush #16
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrhd.b : [Ljava/lang/String;
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
    //   212: bipush #124
    //   214: goto -> 244
    //   217: bipush #77
    //   219: goto -> 244
    //   222: bipush #41
    //   224: goto -> 244
    //   227: bipush #111
    //   229: goto -> 244
    //   232: bipush #80
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #45
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
    int i = (paramInt1 ^ 0xFFFFE88B) & 0xFFFF;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrhd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */