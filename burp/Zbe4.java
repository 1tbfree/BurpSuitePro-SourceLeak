package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

public class Zbe4 extends Zbv5 implements Zky2, Zt3u {
  private final Ze9y ZA;
  
  private final Zkl6 ZJ;
  
  private final Zr_4 ZD;
  
  private final Zr1m Zh;
  
  private final Zbws ZL;
  
  private final Set<String> Zu;
  
  private int ZP = -1;
  
  private Zmyw ZH;
  
  private Zzdy Zr;
  
  private Ze01 ZG;
  
  private Ze01 Zk;
  
  private Ze01 Zc;
  
  private Ze01 Zg;
  
  private Ze01 Zx;
  
  private Zbup ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbe4(Ze9y paramZe9y, Zkl6 paramZkl6, Zr_4 paramZr_4, Zr1m paramZr1m) {
    this.ZA = paramZe9y;
    this.ZJ = paramZkl6;
    this.ZD = paramZr_4;
    this.Zh = paramZr1m;
    this.Zu = Set.of(Zjd(), a(-1393, 11722), a(-1388, 25261), a(-1380, -22101), a(-1389, 3500), a(-1396, -27039));
    Zi();
    setName(a(-1385, -30303));
    this.Zr.setName(a(-1383, -4721));
    this.ZG.setName(a(-1384, -21407));
    this.Zk.setName(a(-1379, 7909));
    this.Zr.setSelected(paramZe9y.ZH());
    this.ZL = new Zbws(paramZe9y.ZD());
    this.ZL.Zk(this);
    this.ZL.setName(a(-1377, -14627));
    this.ZR.setViewportView(this.ZL);
  }
  
  public String Zjd() {
    return a(-1395, 26520);
  }
  
  public String ZjS() {
    return a(-1381, 12878);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_MATCH_AND_REPLACE, this.Zh, new String[] { a(-1398, 32197), a(-1378, -3681) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zu;
  }
  
  public void Zt2() {
    this.Zr.setSelected(this.ZA.ZH());
  }
  
  void ZW(Zgaj paramZgaj) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: ifnull -> 40
    //   8: aload_0
    //   9: getfield ZP : I
    //   12: iconst_m1
    //   13: if_icmpne -> 28
    //   16: aload_0
    //   17: getfield ZA : Lburp/Ze9y;
    //   20: aload_1
    //   21: invokevirtual Zb : (Lburp/Zgaj;)V
    //   24: aload_2
    //   25: ifnull -> 40
    //   28: aload_0
    //   29: getfield ZA : Lburp/Ze9y;
    //   32: aload_1
    //   33: aload_0
    //   34: getfield ZP : I
    //   37: invokevirtual Zs : (Lburp/Zgaj;I)V
    //   40: aload_0
    //   41: iconst_m1
    //   42: putfield ZP : I
    //   45: return
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    this.ZA.ZM(paramInt1);
  }
  
  private void Ze(boolean paramBoolean) {
    this.ZA.ZI(paramBoolean);
  }
  
  private void Zi() {
    this.Zr = new Zzdy();
    this.ZG = new Ze01();
    this.Zk = new Ze01();
    this.Zx = new Ze01();
    this.Zg = new Ze01();
    this.Zc = new Ze01();
    this.ZH = new Zmyw();
    this.ZR = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zr.setText(a(-1394, 9180));
    this.Zr.addActionListener(new Zz2f(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 8, 0);
    add(this.Zr, gridBagConstraints);
    this.ZG.setText(a(-1401, 23391));
    this.ZG.setToolTipText(a(-1399, 28702));
    this.ZG.addActionListener(new Zthv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.ZG, gridBagConstraints);
    this.Zk.setText(a(-1382, -4018));
    this.Zk.setToolTipText(a(-1400, 28744));
    this.Zk.addActionListener(new Zs65(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zk, gridBagConstraints);
    this.Zx.setText(a(-1387, 11746));
    this.Zx.setToolTipText(a(-1397, -3854));
    this.Zx.addActionListener(new Zes7(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zx, gridBagConstraints);
    this.Zg.setText(a(-1392, 7750));
    this.Zg.setToolTipText(a(-1391, 10239));
    this.Zg.addActionListener(new Zsga(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zg, gridBagConstraints);
    this.Zc.setText(a(-1386, 28085));
    this.Zc.setToolTipText(a(-1390, -8258));
    this.Zc.addActionListener(new Zt8h(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zc, gridBagConstraints);
    this.ZH.setLeftComponent(this.ZR);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZH, gridBagConstraints);
  }
  
  private void Zg(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZL : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_m1
    //   14: if_icmpeq -> 30
    //   17: iload_3
    //   18: aload_0
    //   19: getfield ZL : Lburp/Zbws;
    //   22: invokevirtual getRowCount : ()I
    //   25: iconst_1
    //   26: isub
    //   27: if_icmpne -> 31
    //   30: return
    //   31: iload_3
    //   32: aload_0
    //   33: getfield ZP : I
    //   36: if_icmpne -> 53
    //   39: aload_0
    //   40: dup
    //   41: getfield ZP : I
    //   44: iconst_1
    //   45: iadd
    //   46: putfield ZP : I
    //   49: aload_2
    //   50: ifnull -> 73
    //   53: iload_3
    //   54: aload_0
    //   55: getfield ZP : I
    //   58: iconst_1
    //   59: isub
    //   60: if_icmpne -> 73
    //   63: aload_0
    //   64: dup
    //   65: getfield ZP : I
    //   68: iconst_1
    //   69: isub
    //   70: putfield ZP : I
    //   73: aload_0
    //   74: getfield ZA : Lburp/Ze9y;
    //   77: iload_3
    //   78: invokevirtual Zo : (I)V
    //   81: aload_0
    //   82: getfield ZL : Lburp/Zbws;
    //   85: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   88: iload_3
    //   89: iconst_1
    //   90: iadd
    //   91: iload_3
    //   92: iconst_1
    //   93: iadd
    //   94: invokeinterface setSelectionInterval : (II)V
    //   99: return
  }
  
  private void ZI(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZL : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_1
    //   14: if_icmpge -> 18
    //   17: return
    //   18: iload_3
    //   19: aload_0
    //   20: getfield ZP : I
    //   23: if_icmpne -> 40
    //   26: aload_0
    //   27: dup
    //   28: getfield ZP : I
    //   31: iconst_1
    //   32: isub
    //   33: putfield ZP : I
    //   36: aload_2
    //   37: ifnull -> 60
    //   40: iload_3
    //   41: aload_0
    //   42: getfield ZP : I
    //   45: iconst_1
    //   46: iadd
    //   47: if_icmpne -> 60
    //   50: aload_0
    //   51: dup
    //   52: getfield ZP : I
    //   55: iconst_1
    //   56: iadd
    //   57: putfield ZP : I
    //   60: aload_0
    //   61: getfield ZA : Lburp/Ze9y;
    //   64: iload_3
    //   65: iconst_1
    //   66: isub
    //   67: invokevirtual Zo : (I)V
    //   70: aload_0
    //   71: getfield ZL : Lburp/Zbws;
    //   74: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   77: iload_3
    //   78: iconst_1
    //   79: isub
    //   80: iload_3
    //   81: iconst_1
    //   82: isub
    //   83: invokeinterface setSelectionInterval : (II)V
    //   88: return
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zv : ()[I
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZL : Lburp/Zbws;
    //   8: invokevirtual getSelectedRow : ()I
    //   11: istore_3
    //   12: iload_3
    //   13: iconst_m1
    //   14: if_icmpne -> 18
    //   17: return
    //   18: iload_3
    //   19: aload_0
    //   20: getfield ZP : I
    //   23: if_icmpne -> 35
    //   26: aload_0
    //   27: iconst_m1
    //   28: putfield ZP : I
    //   31: aload_2
    //   32: ifnull -> 53
    //   35: iload_3
    //   36: aload_0
    //   37: getfield ZP : I
    //   40: if_icmpge -> 53
    //   43: aload_0
    //   44: dup
    //   45: getfield ZP : I
    //   48: iconst_1
    //   49: isub
    //   50: putfield ZP : I
    //   53: aload_0
    //   54: getfield ZA : Lburp/Ze9y;
    //   57: iload_3
    //   58: invokevirtual Zn : (I)V
    //   61: iload_3
    //   62: aload_0
    //   63: getfield ZL : Lburp/Zbws;
    //   66: invokevirtual getRowCount : ()I
    //   69: if_icmplt -> 75
    //   72: iinc #3, -1
    //   75: iload_3
    //   76: iflt -> 104
    //   79: iload_3
    //   80: aload_0
    //   81: getfield ZL : Lburp/Zbws;
    //   84: invokevirtual getRowCount : ()I
    //   87: if_icmpge -> 104
    //   90: aload_0
    //   91: getfield ZL : Lburp/Zbws;
    //   94: invokevirtual getSelectionModel : ()Ljavax/swing/ListSelectionModel;
    //   97: iload_3
    //   98: iload_3
    //   99: invokeinterface setSelectionInterval : (II)V
    //   104: return
  }
  
  private void ZK(ActionEvent paramActionEvent) {
    int i = this.ZL.getSelectedRow();
    if (i == -1)
      return; 
    this.ZP = i;
    Zgaj zgaj = this.ZA.ZR(this.ZP);
    Zr7a zr7a = new Zr7a(this, zgaj, this.ZJ, this.ZD);
    zr7a.setVisible(true);
  }
  
  private void ZP(ActionEvent paramActionEvent) {
    Zr7a zr7a = new Zr7a(this, null, this.ZJ, this.ZD);
    zr7a.setVisible(true);
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    Ze(this.Zr.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'èàJPL=èéÄ0'1ÄuÈÝ>Å(i@¢^g°Ääuè¦$ìèsÂTïÿ À*ÔKi:p\\r½êâÌ}bwË³Ô²±nH%nè9Ö·}<yo¶ ¬å­C½×¸4mW`\k¹î*M<g4\\n¬¸W=ZØ=ÌÕÎîacçÉR6á~Zm(=å±"\\tÏgµÈIÍ¶]á\\bÙÄq¶HwvIùsvieç6¨.A\\bmqvÌX÷ $÷¢ý6ÈV£åæøj¼?Ô$ÙGRìEü²\\bT8²k¸¢'ô¢×;ö\\t]oñW#7çQ<~UX¨2-*KBìjÃq(§²ÛZ9È§±û þ¦ñ³&º7RÆ?ÔîæUX0]©r8ñ0UþñO¢ë\\n­ý×wðVc¢c¡Çd\\tÜ!V!Íâ~pn»Ä)ªþ oÎÅNxÎS­4è\\f¸ØtÊì¸Ã%£Q­·A`=ÛQÂ-{G»µì\\f¿\\bzAAtI7¥Y6,~FF3ç8uþï7p$:Ö_÷ÄTªêmåb]ùjýø&yfL\É ¥»"FA\\rÚÆÈM£)_õiOiNÀ¤JÜ9ó(©ÕÍì_[õñ:f!ÁôzÓDL"´:²o_}ªésVì$B¨ãÙåGÏåÓ5Ø0\\nÈ[Pêòán}G`X¸B÷×'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #73
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
    //   68: ldc '.zÔB8lÎÜ<Ã©ÍÛÕÜU!2'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #22
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #125
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
    //   129: putstatic burp/Zbe4.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbe4.b : [Ljava/lang/String;
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
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #31
    //   219: goto -> 244
    //   222: bipush #15
    //   224: goto -> 244
    //   227: bipush #109
    //   229: goto -> 244
    //   232: bipush #71
    //   234: goto -> 244
    //   237: bipush #66
    //   239: goto -> 244
    //   242: bipush #31
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
    int i = (paramInt1 ^ 0xFFFFFA9F) & 0xFFFF;
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
      char c = 'ð';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */