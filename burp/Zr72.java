package burp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class Zr72 extends Zrh7 implements ActionListener {
  private final Zm1n ZD;
  
  private final boolean Zh;
  
  private final Zbk8 ZE;
  
  private final Ze01 ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr72(Zz0n paramZz0n, Zt4u paramZt4u, Zxzh paramZxzh, Zbk8 paramZbk8, Zm1n paramZm1n, boolean paramBoolean, Zerg paramZerg, Zskh paramZskh, Zgb6 paramZgb6, Zkl6 paramZkl6, Window paramWindow, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Ze4m paramZe4m) {
    super(paramWindow, true, Zzv7.RULE_EDITOR_UI_DIALOG);
    this.ZE = paramZbk8;
    this.ZD = paramZm1n;
    this.Zh = paramBoolean;
    setLayout(new BorderLayout());
    setTitle(a(28792, 31279));
    setDefaultCloseOperation(0);
    addWindowListener(new Zk8a(this));
    Zba_ zba_ = new Zba_(paramZz0n, paramZt4u, paramZskh, true, Zk97.DESKTOP_OPTIONS_SESSIONS_RULE_EDITOR_URL_SCOPE, null, a(28782, -29700), a(28779, -9004), null, a(28780, -23049), a(28774, -27446), a(28776, -15533), paramZm1n.Zk(), paramZkl6.Zq(), paramZkl6.ZB(), paramZr_4, null, new String[0]);
    Zxer zxer = new Zxer();
    zxer.setName(a(28783, -30132));
    Zmse.Zf(zxer.ZO(), 120, 40);
    add(zxer.ZO(), a(28793, -9014));
    zxer.add(a(28788, 3701), (new Zsz7(new Zrx6[] { new Zbew(paramZm1n), new Zbe0(paramZm1n, paramZz0n, paramZt4u, paramZerg, paramZgb6, paramZkl6.ZB(), paramZxzh, paramZtwv, paramZr_4, paramZtyg, paramZgq7, paramZlr9, paramZe4m, paramZkl6.ZH()) })).Z_());
    zxer.add(a(28784, -31871), (new Zsz7(new Zrx6[] { new Zbe_(paramZm1n), zba_, new Zben(paramZm1n, paramWindow, paramZz0n, paramZt4u) })).Z_());
    Zbqc zbqc1 = new Zbqc(new BorderLayout());
    zbqc1.setBorder(new EmptyBorder(10, 10, 10, 10));
    add(zbqc1, a(28787, 21295));
    Zbqc zbqc2 = new Zbqc(new GridLayout(1, 2, 5, 5));
    zbqc1.add(zbqc2, a(28778, 25467));
    this.ZS = new Ze01(a(28789, -17821));
    Zbqc[] arrayOfZbqc = Zxzh.Zs();
    this.ZS.addActionListener(this);
    zbqc2.add(this.ZS);
    if (paramBoolean) {
      Ze01 ze01 = new Ze01(a(28785, -29414));
      ze01.addActionListener(this);
      zbqc2.add(ze01);
    } 
    pack();
    Zq(paramWindow);
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private void Z_(Object paramObject) {
    // Byte code:
    //   0: invokestatic Zs : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield ZS : Lburp/Ze01;
    //   9: if_acmpne -> 233
    //   12: new java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: astore_3
    //   20: aload_0
    //   21: getfield ZD : Lburp/Zm1n;
    //   24: invokevirtual ZA : ()Ljava/util/List;
    //   27: invokeinterface size : ()I
    //   32: ifne -> 49
    //   35: aload_3
    //   36: sipush #28795
    //   39: sipush #13159
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: pop
    //   49: aload_0
    //   50: getfield ZD : Lburp/Zm1n;
    //   53: invokevirtual Zk : ()Lburp/Zz9f;
    //   56: invokevirtual Z_z : ()Z
    //   59: ifeq -> 76
    //   62: aload_3
    //   63: sipush #28797
    //   66: sipush #10652
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: invokestatic ZK : ()Ljava/util/List;
    //   79: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   84: aload_0
    //   85: getfield ZD : Lburp/Zm1n;
    //   88: dup
    //   89: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: pop
    //   93: <illegal opcode> test : (Lburp/Zm1n;)Ljava/util/function/Predicate;
    //   98: invokeinterface anyMatch : (Ljava/util/function/Predicate;)Z
    //   103: istore #4
    //   105: iload #4
    //   107: ifne -> 124
    //   110: aload_3
    //   111: sipush #28781
    //   114: sipush #-26387
    //   117: invokestatic a : (II)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: pop
    //   124: aload_3
    //   125: invokevirtual length : ()I
    //   128: ifle -> 196
    //   131: iconst_0
    //   132: aload_0
    //   133: sipush #28786
    //   136: sipush #7823
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: aload_3
    //   143: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   146: sipush #28799
    //   149: sipush #-21474
    //   152: invokestatic a : (II)Ljava/lang/String;
    //   155: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   160: iconst_2
    //   161: anewarray java/lang/String
    //   164: dup
    //   165: iconst_0
    //   166: sipush #28791
    //   169: sipush #13342
    //   172: invokestatic a : (II)Ljava/lang/String;
    //   175: aastore
    //   176: dup
    //   177: iconst_1
    //   178: sipush #28794
    //   181: sipush #18579
    //   184: invokestatic a : (II)Ljava/lang/String;
    //   187: aastore
    //   188: iconst_1
    //   189: invokestatic Zc : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;I)I
    //   192: if_icmpeq -> 196
    //   195: return
    //   196: aload_0
    //   197: getfield Zh : Z
    //   200: ifeq -> 218
    //   203: aload_0
    //   204: getfield ZE : Lburp/Zbk8;
    //   207: aload_0
    //   208: getfield ZD : Lburp/Zm1n;
    //   211: invokevirtual Zm : (Lburp/Zm1n;)V
    //   214: aload_2
    //   215: ifnonnull -> 229
    //   218: aload_0
    //   219: getfield ZE : Lburp/Zbk8;
    //   222: aload_0
    //   223: getfield ZD : Lburp/Zm1n;
    //   226: invokevirtual ZU : (Lburp/Zm1n;)V
    //   229: aload_2
    //   230: ifnonnull -> 304
    //   233: aload_0
    //   234: getfield ZD : Lburp/Zm1n;
    //   237: invokevirtual ZA : ()Ljava/util/List;
    //   240: invokeinterface size : ()I
    //   245: ifle -> 304
    //   248: iconst_0
    //   249: aload_0
    //   250: sipush #28790
    //   253: sipush #7586
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: sipush #28777
    //   262: sipush #-5636
    //   265: invokestatic a : (II)Ljava/lang/String;
    //   268: iconst_2
    //   269: anewarray java/lang/String
    //   272: dup
    //   273: iconst_0
    //   274: sipush #28796
    //   277: sipush #-24261
    //   280: invokestatic a : (II)Ljava/lang/String;
    //   283: aastore
    //   284: dup
    //   285: iconst_1
    //   286: sipush #28798
    //   289: sipush #-5962
    //   292: invokestatic a : (II)Ljava/lang/String;
    //   295: aastore
    //   296: iconst_1
    //   297: invokestatic Zc : (Ljava/awt/Component;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/String;I)I
    //   300: if_icmpeq -> 304
    //   303: return
    //   304: aload_0
    //   305: iconst_0
    //   306: invokevirtual setVisible : (Z)V
    //   309: aload_0
    //   310: invokevirtual dispose : ()V
    //   313: return
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    Z_(paramActionEvent.getSource());
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\b£!Ó&ÂÓì³£ôPë·¬W%¬¬FloM xÃÂgïVe'ÖO¶:xý-TpÇitÅ^s¡A5ÆóJ:åó@¦7úf£P[Kõd¥râ¨Î¯û v[ædÕÎ#©Ð\eæà ÁJ)tÑ ×:¦ÑÅi$¶gCÄ5yíûß~óh»zzÈvOü þd<¾?µ>"Ýþbø­YÃhâh¸]bo\\tÄ\\n^c~ÔWy'#ÈânÑ\\rlI×6=£¯¬(ÒìýjCÛDÃ³îG«=\\fÝÕï8À<ÚÌÇ¶¹(MÄgÇTV0èíÈð~nEÅøÒ0[è>]Ä¦Dë¦ý\\t(5$æ»ÿG]E×ºzi4Ê³~Û´Ñ±Pö45²þó¶6§§[#x¢°q®»fmV«_g§mîTïÚ6m»zùrÎc3úÇÝ3TA#òãxc·ôS'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_2
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #120
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
    //   67: ldc 'N2dM3°ÿÑÉÊ1;\\nzU¶lH"ÁF_\\fEë¥'¤'jÞØM%M/-\\fÞppq[@'t3(÷¯±¾ËÃ\Ç½³~X'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #42
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #88
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
    //   128: putstatic burp/Zr72.a : [Ljava/lang/String;
    //   131: bipush #25
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr72.b : [Ljava/lang/String;
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
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #26
    //   219: goto -> 244
    //   222: bipush #74
    //   224: goto -> 244
    //   227: bipush #46
    //   229: goto -> 244
    //   232: bipush #61
    //   234: goto -> 244
    //   237: bipush #77
    //   239: goto -> 244
    //   242: bipush #58
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
    int i = (paramInt1 ^ 0x707E) & 0xFFFF;
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
      byte b1 = 97;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr72.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */