package burp;

import com.formdev.flatlaf.FlatLaf;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.beans.Beans;
import java.util.List;
import java.util.Map;
import javax.swing.UIManager;
import javax.swing.text.StyleContext;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zrt {
  private static final char[] ZG;
  
  private static final List<String> Zw;
  
  static Font Zf;
  
  static Font Zp;
  
  static Font ZM;
  
  static Font Z_;
  
  static Font Za;
  
  static Font Zl;
  
  static Font Zx;
  
  static Font Zs;
  
  static Font ZQ;
  
  static Font ZS;
  
  static Font ZK;
  
  static Font Zb;
  
  static Font ZZ;
  
  static Font ZL;
  
  static int Zn;
  
  private static String ZC;
  
  private static float Zy;
  
  private static float Zk;
  
  private static float ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static List<String> Zm() {
    return Zw;
  }
  
  public static int ZC() {
    return Zn;
  }
  
  public static float Zx() {
    return Zy;
  }
  
  public static float ZH() {
    return Zk;
  }
  
  public static float ZN() {
    return ZH;
  }
  
  static String ZJ() {
    return ZC;
  }
  
  static void Zp(int paramInt) {
    Zn = paramInt;
    if (!Zb12.ZG() || Beans.isDesignTime()) {
      Font font1 = ZO();
      Font font2 = StyleContext.getDefaultStyleContext().getFont(font1.getFamily(), font1.getStyle(), paramInt);
      UIManager.put(a(-15676, 10416), font2);
    } 
  }
  
  static void ZF(int paramInt) {
    Zri5.ZR();
    Zp(paramInt);
    Zb();
    FlatLaf.updateUI();
    Zri5.Zz();
  }
  
  static void Zb() {
    try {
      Font font = ZO();
      try {
      
      } catch (Exception exception) {
        throw a(null);
      } 
      Zp = font.isPlain() ? font : font.deriveFont(0);
      Zf = Zp.deriveFont(0.9F * Zp.getSize());
      ZM = Zp.deriveFont(1);
      Z_ = Zp.deriveFont(2);
      Za = ZM.deriveFont(2);
      Zl = Zp.deriveFont(Map.of(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON));
      Zs = Zp.deriveFont(1, (int)(0.8D * Zp.getSize()));
      ZQ = Zp.deriveFont(1, (int)(1.2F * Zp.getSize()));
      ZS = Zp.deriveFont(0, (int)(1.2F * Zp.getSize()));
      ZK = ZS.deriveFont(Map.of(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON));
      Zb = Zp.deriveFont(1, (int)(1.5F * Zp.getSize()));
      ZZ = Zp.deriveFont(0, (int)(1.7F * Zp.getSize()));
      ZL = Zp.deriveFont(1, (int)(5.0F * Zp.getSize()));
      Zx = new Font(a(-15662, 16791), 0, Zp.getSize());
      if (!Zb12.ZG()) {
        Zm99 zm99 = new Zm99();
        int j = ZG.length;
        Zzkh zzkh = Zzkh.Zb(zm99.getFontMetrics(Zp));
        Zy = zzkh.Zh();
        Zk = zzkh.Zo(ZG, 0, j) / j;
        zzkh = Zzkh.Zb(zm99.getFontMetrics(ZM));
        ZH = zzkh.Zo(ZG, 0, j) / j;
      } 
      int i = Zp.getSize();
      try {
        if (i < 12) {
          ZC = a(-15675, -27145);
        } else {
          try {
            if (i > 16)
              ZC = a(-15674, 24911); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static Font ZO() {
    Object object = UIManager.getFont(a(-15680, 14));
    if (object == null)
      object = UIManager.getLookAndFeelDefaults().get(a(-15676, 10416)); 
    if (!(object instanceof Font))
      object = UIManager.getLookAndFeelDefaults().get(a(-15663, 12733)); 
    if (!(object instanceof Font))
      object = new Font(a(-15657, -22406), 0, 12); 
    return (Font)object;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'µè½àM­¨Ñ@4á ËÔÞ×óðuã-¤µÁ-Tip¢¬y¬ße^\\n]4E¡Ù¬Å(ÊÑ<HòÙH\\bPòùbÄo¸|ù¢³jöo@p%<xlEú8+RVoJfIWea\\né{ä£f\\r3ñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #11
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #104
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
    //   68: ldc 'nÝ²ÕIÖäD©ñ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #123
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
    //   129: putstatic burp/Zrt.a : [Ljava/lang/String;
    //   132: bipush #24
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrt.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 231, 5 -> 236
    //   212: bipush #21
    //   214: goto -> 243
    //   217: bipush #62
    //   219: goto -> 243
    //   222: bipush #67
    //   224: goto -> 243
    //   227: iconst_1
    //   228: goto -> 243
    //   231: bipush #47
    //   233: goto -> 243
    //   236: bipush #88
    //   238: goto -> 243
    //   241: bipush #126
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: sipush #-15660
    //   303: sipush #19472
    //   306: invokestatic a : (II)Ljava/lang/String;
    //   309: invokevirtual toCharArray : ()[C
    //   312: putstatic burp/Zrt.ZG : [C
    //   315: invokestatic isDesignTime : ()Z
    //   318: ifeq -> 336
    //   321: invokestatic Zl : ()V
    //   324: bipush #12
    //   326: invokestatic Zp : (I)V
    //   329: invokestatic Zb : ()V
    //   332: iconst_0
    //   333: invokestatic ZK : (Z)V
    //   336: bipush #18
    //   338: anewarray java/lang/String
    //   341: dup
    //   342: iconst_0
    //   343: ldc '8'
    //   345: aastore
    //   346: dup
    //   347: iconst_1
    //   348: ldc '9'
    //   350: aastore
    //   351: dup
    //   352: iconst_2
    //   353: sipush #-15678
    //   356: sipush #17398
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: aastore
    //   363: dup
    //   364: iconst_3
    //   365: sipush #-15667
    //   368: sipush #-16470
    //   371: invokestatic a : (II)Ljava/lang/String;
    //   374: aastore
    //   375: dup
    //   376: iconst_4
    //   377: sipush #-15672
    //   380: sipush #30475
    //   383: invokestatic a : (II)Ljava/lang/String;
    //   386: aastore
    //   387: dup
    //   388: iconst_5
    //   389: sipush #-15668
    //   392: sipush #-32630
    //   395: invokestatic a : (II)Ljava/lang/String;
    //   398: aastore
    //   399: dup
    //   400: bipush #6
    //   402: sipush #-15659
    //   405: sipush #14434
    //   408: invokestatic a : (II)Ljava/lang/String;
    //   411: aastore
    //   412: dup
    //   413: bipush #7
    //   415: sipush #-15661
    //   418: sipush #-31238
    //   421: invokestatic a : (II)Ljava/lang/String;
    //   424: aastore
    //   425: dup
    //   426: bipush #8
    //   428: sipush #-15664
    //   431: sipush #24455
    //   434: invokestatic a : (II)Ljava/lang/String;
    //   437: aastore
    //   438: dup
    //   439: bipush #9
    //   441: sipush #-15666
    //   444: sipush #-15559
    //   447: invokestatic a : (II)Ljava/lang/String;
    //   450: aastore
    //   451: dup
    //   452: bipush #10
    //   454: sipush #-15665
    //   457: sipush #27100
    //   460: invokestatic a : (II)Ljava/lang/String;
    //   463: aastore
    //   464: dup
    //   465: bipush #11
    //   467: sipush #-15669
    //   470: sipush #-13849
    //   473: invokestatic a : (II)Ljava/lang/String;
    //   476: aastore
    //   477: dup
    //   478: bipush #12
    //   480: sipush #-15658
    //   483: sipush #-23606
    //   486: invokestatic a : (II)Ljava/lang/String;
    //   489: aastore
    //   490: dup
    //   491: bipush #13
    //   493: sipush #-15677
    //   496: sipush #20630
    //   499: invokestatic a : (II)Ljava/lang/String;
    //   502: aastore
    //   503: dup
    //   504: bipush #14
    //   506: sipush #-15671
    //   509: sipush #-16503
    //   512: invokestatic a : (II)Ljava/lang/String;
    //   515: aastore
    //   516: dup
    //   517: bipush #15
    //   519: sipush #-15679
    //   522: sipush #31658
    //   525: invokestatic a : (II)Ljava/lang/String;
    //   528: aastore
    //   529: dup
    //   530: bipush #16
    //   532: sipush #-15673
    //   535: sipush #-24443
    //   538: invokestatic a : (II)Ljava/lang/String;
    //   541: aastore
    //   542: dup
    //   543: bipush #17
    //   545: sipush #-15670
    //   548: sipush #6861
    //   551: invokestatic a : (II)Ljava/lang/String;
    //   554: aastore
    //   555: invokestatic of : ([Ljava/lang/Object;)Ljava/util/List;
    //   558: putstatic burp/Zrt.Zw : Ljava/util/List;
    //   561: ldc 14.0
    //   563: putstatic burp/Zrt.Zy : F
    //   566: ldc 7.0
    //   568: putstatic burp/Zrt.Zk : F
    //   571: ldc 9.0
    //   573: putstatic burp/Zrt.ZH : F
    //   576: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFC2C4) & 0xFFFF;
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
      char c = 'Û';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */