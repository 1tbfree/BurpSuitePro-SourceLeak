package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbge extends Zbg2 {
  private final Zr5w ZY;
  
  private final Zmjm ZN;
  
  private final Zs8i Zq;
  
  private Zgzc Zy;
  
  private Zm2o Zz;
  
  private Ze01 Zs;
  
  private Zm99 ZX;
  
  private Zm9v ZG;
  
  private Zl8w Zj;
  
  private Zm99 Zg;
  
  public Zg85 Zk;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbge(Zr5w paramZr5w, Zl0 paramZl0, Zmjm paramZmjm) {
    this.ZY = paramZr5w;
    this.ZN = paramZmjm;
    this.Zq = new Zs8i(paramZl0);
    this.Zy = Zgzc.ZH;
    ZW();
    this.Zg.ZE(Zt00.BOLD_FONT);
    this.ZG.setVisible(false);
    this.ZB = new String[] { a(-13407, 3996), a(-13405, -13197) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
      
      case 1:
      
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  Zgzc Zv() {
    return this.Zy;
  }
  
  private void ZW() {
    this.Zj = new Zl8w();
    this.Zz = new Zm2o();
    this.ZX = new Zm99();
    this.Zk = new Zg85();
    this.ZG = new Zm9v();
    this.Zs = new Ze01();
    this.Zg = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zj.setText(a(-13402, -10219));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zj, gridBagConstraints);
    this.Zz.Zi(null);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zz, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.Zk.setEditable(false);
    this.Zk.setColumns(20);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 10);
    add(this.Zk, gridBagConstraints);
    this.ZG.setText(a(-13403, 25239));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.Zs.setText(a(-13401, 31428));
    this.Zs.addActionListener(new Zr03(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 18;
    add(this.Zs, gridBagConstraints);
    this.Zg.setText(a(-13406, -29696));
    this.Zg.setToolTipText("");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.Zg, gridBagConstraints);
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zg1m.CONFIG : Lburp/Zg1m;
    //   7: aload_0
    //   8: getfield ZN : Lburp/Zmjm;
    //   11: aload_0
    //   12: iconst_0
    //   13: sipush #-13404
    //   16: sipush #-9303
    //   19: invokestatic a : (II)Ljava/lang/String;
    //   22: invokestatic Zp : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;ILjava/lang/String;)Ljava/io/File;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnull -> 86
    //   30: aload_0
    //   31: getfield Zk : Lburp/Zg85;
    //   34: aload_3
    //   35: invokevirtual getPath : ()Ljava/lang/String;
    //   38: invokevirtual setText : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: aload_0
    //   43: getfield Zq : Lburp/Zs8i;
    //   46: aload_3
    //   47: invokevirtual getPath : ()Ljava/lang/String;
    //   50: invokevirtual Zz : (Ljava/lang/String;)Lburp/Zgzc;
    //   53: putfield Zy : Lburp/Zgzc;
    //   56: aload_0
    //   57: getfield Zy : Lburp/Zgzc;
    //   60: getstatic burp/Zgzc.ZH : Lburp/Zgzc;
    //   63: if_acmpne -> 70
    //   66: iconst_1
    //   67: goto -> 71
    //   70: iconst_0
    //   71: istore #4
    //   73: aload_0
    //   74: getfield ZG : Lburp/Zm9v;
    //   77: iload #4
    //   79: invokevirtual setVisible : (Z)V
    //   82: aload_2
    //   83: ifnull -> 110
    //   86: aload_0
    //   87: getfield Zk : Lburp/Zg85;
    //   90: ldc ''
    //   92: invokevirtual setText : (Ljava/lang/String;)V
    //   95: aload_0
    //   96: getfield ZG : Lburp/Zm9v;
    //   99: iconst_0
    //   100: invokevirtual setVisible : (Z)V
    //   103: aload_0
    //   104: getstatic burp/Zgzc.ZH : Lburp/Zgzc;
    //   107: putfield Zy : Lburp/Zgzc;
    //   110: aload_0
    //   111: getfield Zy : Lburp/Zgzc;
    //   114: getstatic burp/Zgzc.ZH : Lburp/Zgzc;
    //   117: if_acmpeq -> 126
    //   120: getstatic burp/Zrrh.USER_OPTIONS_TLS_CLIENT_CERTIFICATES_INTERMEDIATE_CA_CERTIFICATE_LOADED : Lburp/Zrrh;
    //   123: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   126: return
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'TJíæQàPÐþ]ÇÐá9Ėj`6¦K¾m¤Ei9ÚñA±m·L¥p¬âUqî.ãêØUf q#ùBxÖH}ýüØ^1¥¬Ã®¶ÁEJan¾²éìúDo¬\\bv½VVdy0úTd¶«®±Öáê*'#ÇªM\\rÆËÂ<·÷I%+N9fÚLLß+SKõÀúØ&ÚôÀ~³×Rìu6®¯Bûâe§¥?Ãr²«2Ï·'yáuaýîv|Ìuõr\\nÅBîØoíÓß\µF~è\\fâùp#}4×÷+öN\\r ªÏZçnsJ³T0AP-å\\t|~ ñmU©ç°«µ1«Ð-$Ëë«Ç$ÁÒó´ò§Ò"{`:¤þëK·<À±«ÿá¥#Xgjc©¡`?b¼9X7²zÎòàÇ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #15
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #32
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
    //   68: ldc '#âDíË°¬ZË'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #77
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
    //   129: putstatic burp/Zbge.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbge.b : [Ljava/lang/String;
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
    //   212: bipush #73
    //   214: goto -> 244
    //   217: bipush #43
    //   219: goto -> 244
    //   222: bipush #63
    //   224: goto -> 244
    //   227: bipush #39
    //   229: goto -> 244
    //   232: bipush #26
    //   234: goto -> 244
    //   237: bipush #92
    //   239: goto -> 244
    //   242: bipush #116
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
    int i = (paramInt1 ^ 0xFFFFCBA7) & 0xFFFF;
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
      byte b1 = 106;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbge.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */