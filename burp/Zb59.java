package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileFilter;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zb59 extends Zbqc implements Zx8l, Zm6, Zg5f {
  private final Ztwv Zr;
  
  private final FileFilter ZD;
  
  private final Zb52 Zv;
  
  private final Zbct Zs;
  
  private final Zm5j Zx;
  
  private final Ztb9 ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb59(Zm5j paramZm5j, Ztwv paramZtwv, Zzov paramZzov) {
    this.Zr = paramZtwv;
    this.ZM = paramZzov.ZJ();
    this.ZD = new Zzy2();
    this.Zx = paramZm5j;
    this.Zv = new Zb52(a(-5415, -19221), a(-5409, -1518), this);
    this.Zs = new Zbct(a(-5424, 32668), a(-5410, 29200), this, this::lambda$new$0);
    setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.fill = 2;
    gridBagConstraints.insets = new Insets(8, 0, 10, 0);
    Zm99 zm991 = new Zm99(a(-5412, -31008));
    zm991.ZE(Zt00.TITLE_BOLD_FONT);
    add(zm991, gridBagConstraints);
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    Zl8x zl8x = new Zl8x();
    zl8x.setText(a(-5422, 14205));
    zl8x.setEditable(false);
    zl8x.setCaret(new Zmjt());
    zl8x.setLineWrap(true);
    zl8x.setWrapStyleWord(true);
    zl8x.setOpaque(false);
    zl8x.setColumns(1);
    add(zl8x, gridBagConstraints);
    gridBagConstraints.gridy = 2;
    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
    add(new Zem9(), gridBagConstraints);
    gridBagConstraints.gridy = 3;
    gridBagConstraints.insets = new Insets(20, 0, 20, 0);
    add(this.Zv, gridBagConstraints);
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
    add(new Zem9(), gridBagConstraints);
    gridBagConstraints.gridx = 1;
    gridBagConstraints.fill = 0;
    gridBagConstraints.weightx = 0.0D;
    gridBagConstraints.insets = new Insets(0, 20, 0, 20);
    Zm99 zm992 = new Zm99(a(-5414, 8303));
    zm992.ZE(Zt00.BOLD_FONT);
    add(zm992, gridBagConstraints);
    gridBagConstraints.gridx = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 0, 0);
    add(new Zem9(), gridBagConstraints);
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.gridx = 0;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zs, gridBagConstraints);
    setName(a(-5423, -22724));
  }
  
  public Zeuf ZL() {
    return Zeuf.SCAN_DETAILS;
  }
  
  public Zze2 Zx() {
    return new Zze2(a(-5413, -16990), "");
  }
  
  public Component ZZ() {
    return this;
  }
  
  public String ZP() {
    return a(-5419, 18675);
  }
  
  public CompletableFuture<Zlaj> Zy(File paramFile) {
    // Byte code:
    //   0: new java/util/concurrent/CompletableFuture
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield Zv : Lburp/Zb52;
    //   12: iconst_0
    //   13: invokevirtual setEnabled : (Z)V
    //   16: aload_0
    //   17: getfield Zr : Lburp/Ztwv;
    //   20: aload_0
    //   21: aload_1
    //   22: aload_2
    //   23: <illegal opcode> run : (Lburp/Zb59;Ljava/io/File;Ljava/util/concurrent/CompletableFuture;)Ljava/lang/Runnable;
    //   28: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   33: pop
    //   34: aload_2
    //   35: areturn
  }
  
  public void ZW() {
    this.Zv.setEnabled(true);
    this.Zx.Zm();
  }
  
  public CompletableFuture<Zrk5> ZQ(String paramString) {
    // Byte code:
    //   0: new java/util/concurrent/CompletableFuture
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: getfield Zs : Lburp/Zbct;
    //   12: iconst_0
    //   13: invokevirtual setEnabled : (Z)V
    //   16: aload_0
    //   17: getfield Zr : Lburp/Ztwv;
    //   20: aload_0
    //   21: aload_1
    //   22: aload_2
    //   23: <illegal opcode> run : (Lburp/Zb59;Ljava/lang/String;Ljava/util/concurrent/CompletableFuture;)Ljava/lang/Runnable;
    //   28: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   33: pop
    //   34: aload_2
    //   35: areturn
  }
  
  public void ZB() {
    this.Zs.setEnabled(true);
    this.Zx.Zm();
  }
  
  private void lambda$handleUrl$3(String paramString, CompletableFuture<Zrk5> paramCompletableFuture) {
    int[] arrayOfInt = Zt3i.Zu();
    try {
      SwingUtilities.invokeLater(this::lambda$handleUrl$2);
      Optional<Zlit> optional = this.ZM.Za(paramString);
      if (optional.isEmpty()) {
        paramCompletableFuture.complete(Zrk5.ZE(a(-5420, 2828)));
        return;
      } 
      Zejt zejt = this.ZM.ZZ(optional.get());
      try {
        if (zejt.ZAP()) {
          try {
            this.Zx.ZU(zejt.ZAU(), optional.get());
            paramCompletableFuture.complete(Zrk5.Zw(a(-5418, -15939)));
            if (arrayOfInt != null)
              paramCompletableFuture.complete(Zrk5.ZE(zejt.ZAy())); 
          } catch (Exception exception) {
            throw a(null);
          } 
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      paramCompletableFuture.complete(Zrk5.ZE(zejt.ZAy()));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      paramCompletableFuture.completeExceptionally(exception);
    } 
  }
  
  private void lambda$handleUrl$2() {
    this.Zv.Zy(a(-5421, -17617));
  }
  
  private void lambda$handleFileUpload$1(File paramFile, CompletableFuture<Zlaj> paramCompletableFuture) {
    try {
      boolean bool = this.ZD.accept(paramFile);
      try {
        if (!bool)
          paramCompletableFuture.complete(Zlaj.Zb(a(-5417, -23113))); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      Zejt zejt = Ztt_.ZC(paramFile);
      try {
        if (zejt.ZAP())
          this.Zx.ZU(zejt.ZAU(), null); 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      paramCompletableFuture.complete(new Zlaj(zejt.ZAP(), zejt.ZAy()));
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
      paramCompletableFuture.completeExceptionally(throwable);
    } 
  }
  
  private File lambda$new$0() {
    return Zs6n.ZG(Zg1m.API_DEFINITIONS, this, 0, a(-5416, -22737), this.ZD);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'YÅ«w°übù2ëÚ}.pöLX¬úÈ·'KÒ< á#(D±,L4ûxmàÂôj$á\\n}K½¥r2Ü¹²2«×¦æ =ó@O\\nÅâÿ`õ*3ÉF3>>6©k×ÕÒ°d¿!]iâ\\nc·(óüò*_³¢Vuþpæú=Á}Ð2{,2vTÔÙÈ;5\\b§æÞ5a¬Ú ÙHºß>ÛI$$à+;òÃwzl-ù½@ÔP³\\bôørc¦t\\bfÔ\\fN3Æ&"]æõ"áa³i5`p1«ßÃ É²þ>cÂãMÐå-¼\\nkvíç¿~³¤Cíªü /¯°ö±ít;«(:;¨ÈäL*I©Û7ùôNóTæÌ1bui§"ÖzæÔ8üntwÙàÁ5=á±ù4½ÄèNté4¡^®KükÐÏÈ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: sipush #141
    //   21: istore_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: bipush #118
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
    //   69: ldc 'x¹ÝlÜ;S$Næ§Ù¶\\biØ´Üõ'
    //   71: dup
    //   72: astore_2
    //   73: invokevirtual length : ()I
    //   76: istore #4
    //   78: bipush #6
    //   80: istore_1
    //   81: iconst_m1
    //   82: istore_0
    //   83: bipush #70
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
    //   130: putstatic burp/Zb59.a : [Ljava/lang/String;
    //   133: bipush #15
    //   135: anewarray java/lang/String
    //   138: putstatic burp/Zb59.b : [Ljava/lang/String;
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
    //   212: bipush #70
    //   214: goto -> 244
    //   217: bipush #53
    //   219: goto -> 244
    //   222: bipush #99
    //   224: goto -> 244
    //   227: bipush #38
    //   229: goto -> 244
    //   232: bipush #86
    //   234: goto -> 244
    //   237: bipush #24
    //   239: goto -> 244
    //   242: bipush #13
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
    int i = (paramInt1 ^ 0xFFFFEAD2) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb59.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */