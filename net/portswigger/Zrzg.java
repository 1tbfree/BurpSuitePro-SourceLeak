package net.portswigger;

import burp.Zbqc;
import java.io.File;

public class Zrzg {
  private final Zl0 ZP;
  
  private final File ZX;
  
  private final String ZH;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrzg(Zl0 paramZl0) {
    this(paramZl0, Zl(paramZl0));
  }
  
  private static File Zl(Zl0 paramZl0) {
    File file = null;
    if (Zvh.ZU.ZE()) {
      String str = System.getenv(a(15147, -12059));
      if (str != null)
        file = paramZl0.ZJ(str, a(15138, 1702)); 
    } 
    if (file == null)
      file = paramZl0.ZJ(System.getProperty(a(15148, -30396)), a(15144, 13234)); 
    return file;
  }
  
  public Zrzg(Zl0 paramZl0, File paramFile) {
    this.ZP = paramZl0;
    int[] arrayOfInt = Zvh.Zd();
    this.ZH = paramFile.getPath();
    if (!paramFile.exists()) {
      if (!paramFile.mkdirs()) {
        Zuh.ZT(false, Zqf.Zr, String.format(a(15146, -1732), new Object[] { this.ZH }));
        this.ZX = null;
        return;
      } 
      Zze.Zd(paramFile);
    } 
    if (!paramFile.isDirectory()) {
      Zuh.ZT(false, Zqf.Zr, String.format(a(15151, -7641), new Object[] { this.ZH }));
      this.ZX = null;
      return;
    } 
    if (!paramFile.canRead()) {
      Zuh.ZT(false, Zqf.Zr, String.format(a(15149, 7149), new Object[] { this.ZH }));
      this.ZX = null;
      return;
    } 
    if (!paramFile.canWrite()) {
      Zuh.ZT(false, Zqf.Zr, String.format(a(15139, 28374), new Object[] { this.ZH }));
      this.ZX = null;
      return;
    } 
    this.ZX = paramFile;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public File Zc() {
    int[] arrayOfInt = Zvh.Zd();
    Zuh.ZT((this.ZX != null), Zqf.Zr, String.format(a(15150, -23200), new Object[] { this.ZH }));
    if (Zbqc.Zwu() == null)
      Zvh.ZM(new int[5]); 
    return this.ZX;
  }
  
  public File ZB() {
    return Zm(a(15145, 19716));
  }
  
  private File Zm(String paramString) {
    Zuh.Zv((this.ZX != null), Zqf.Zr, 1L);
    File file = this.ZP.Zh(this.ZX, paramString);
    if (file.exists() && !file.isDirectory() && !file.delete()) {
      Zuh.Zv(false, Zqf.Zr, 2L);
      return null;
    } 
    if (!file.exists() && !file.mkdirs()) {
      Zuh.Zv(false, Zqf.Zr, 3L);
      return null;
    } 
    return file;
  }
  
  public boolean ZY() {
    return Zo(this.ZX);
  }
  
  private static boolean Zo(File paramFile) {
    File[] arrayOfFile1 = paramFile.listFiles();
    int[] arrayOfInt = Zvh.Zd();
    Zuh.Zb((arrayOfFile1 != null), Zqf.Zr);
    File[] arrayOfFile2 = arrayOfFile1;
    int i = arrayOfFile2.length;
    byte b = 0;
    while (b < i) {
      File file = arrayOfFile2[b];
      if (file.isDirectory()) {
        if (!Zo(file))
          return false; 
      } else if (!file.delete()) {
        return false;
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return paramFile.delete();
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '!c(õöL§<#5ï J×xÚ°övªãl?¨úFç¾ýÎ¥ãjÖ¼3G2)Ñ·°°x7©ÕA3jZvûbø\\rÆÝ¨Ø7¼¿,M¤÷\\nSÀÁç{ù5uD'Ë$ÎSèÈò´>âêe7*sÊ?­D\\b{wò(,NmÑ&:ÒÌü.Hôl¤90S+SìTïbÊ07­1õ®±#Ý$É¬²3á±\\rS&CeÅÌÌ´ üb ='MÁ¾^3¿ï¤Ö\\tãÐ÷òñ`ëéæ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #7
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #64
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'õÞù±D-u\\fådÑí3UÀà)Exæ<ú8³Þ[´\\tî\ À­Õ;+'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #39
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_4
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic net/portswigger/Zrzg.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic net/portswigger/Zrzg.b : [Ljava/lang/String;
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
    //   212: bipush #65
    //   214: goto -> 244
    //   217: bipush #63
    //   219: goto -> 244
    //   222: bipush #85
    //   224: goto -> 244
    //   227: bipush #40
    //   229: goto -> 244
    //   232: bipush #10
    //   234: goto -> 244
    //   237: bipush #39
    //   239: goto -> 244
    //   242: bipush #88
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
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3B2B) & 0xFFFF;
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
      char c = 'Ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zrzg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */