package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbt_ extends Zbg2 {
  private final Zt8q Zf;
  
  private Zm2o Z_;
  
  private Zbkc Zq;
  
  private Ze01 Zs;
  
  private Zm99 ZV;
  
  private Zm9v ZE;
  
  private Zm99 Zm;
  
  private Zg85 ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbt_(Zt8q paramZt8q) {
    this.Zf = paramZt8q;
    ZD();
    this.ZE.setVisible(false);
    Zmse.Zb(this, 120);
    setVisible(true);
    this.ZB = new String[] { a(-22572, -25055), a(-22571, -30561) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  private void ZD() {
    this.Z_ = new Zm2o();
    this.Zq = new Zbkc();
    this.Zm = new Zm99();
    this.ZJ = new Zg85();
    this.Zs = new Ze01();
    this.ZE = new Zm9v();
    this.ZV = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Z_.Zi(Zk97.INFILTRATOR);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Z_, gridBagConstraints);
    this.Zq.Zx(a(-22562, -31148));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zq, gridBagConstraints);
    this.Zm.setText(a(-22580, -17394));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zm, gridBagConstraints);
    this.ZJ.setColumns(30);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZJ, gridBagConstraints);
    this.Zs.setText(a(-22573, 28355));
    this.Zs.addActionListener(new Zxx1(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zs, gridBagConstraints);
    this.ZE.setText(a(-22576, 22992));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    add(this.ZE, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZV, gridBagConstraints);
  }
  
  public Zsic Zn(int paramInt) {
    try {
      switch (paramInt) {
        case 0:
          return this.Zf.Zn(this);
        case 1:
          try {
            if (ZU())
              return this.Zf.ZS(this); 
          } catch (IOException iOException) {
            Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
            this.Zf.Z_(iOException.getMessage());
            return this.Zf.ZS(this);
          } 
          break;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return this;
  }
  
  private boolean ZU() throws IOException {
    String str = this.ZJ.getText();
    File file = new File(str);
    try {
      if (str != null)
        try {
          if (!str.isEmpty()) {
            try {
              if (!file.exists())
                try {
                  this.ZE.setVisible(false);
                  if (Zx6o.ZY(Zt2m.ZF(this), a(-22577, -9621))) {
                    if (!(new File(str)).mkdirs()) {
                      this.ZE.setText(a(-22564, -29730));
                      this.ZE.setVisible(true);
                      return false;
                    } 
                  } else {
                    return false;
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            } 
            try {
              if (!file.isDirectory()) {
                this.ZE.setText(a(-22565, -32336));
                this.ZE.setVisible(true);
                return false;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            try {
              if (!file.canWrite()) {
                this.ZE.setText(a(-22575, 5657));
                this.ZE.setVisible(true);
                return false;
              } 
            } catch (IOException iOException) {
              throw a(null);
            } 
            String str1 = null;
            if (this.Zf.ZR == Zltf.DOTNET) {
              str1 = a(-22570, -24571);
            } else if (this.Zf.ZR == Zltf.JAVA) {
              str1 = a(-22569, -19713);
            } else {
              Zuh.ZT(false, Zqf.Zk, a(-22574, -11438));
            } 
            try {
              if ((new File(str, str1)).exists())
                try {
                  if (!Zx6o.ZY(Zt2m.ZF(this), a(-22561, 2402)))
                    return false; 
                } catch (IOException iOException) {
                  throw a(null);
                }  
            } catch (IOException iOException) {
              throw a(null);
            } 
            ZP(file);
            return true;
          } 
          this.ZE.setText(a(-22568, 31374));
          this.ZE.setVisible(true);
          return false;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZE.setText(a(-22568, 31374));
    this.ZE.setVisible(true);
    return false;
  }
  
  private void ZP(File paramFile) throws IOException {
    Zbqc[] arrayOfZbqc = Zt8q.Zv();
    try {
      if (this.Zf.ZR == Zltf.JAVA) {
        try {
          ZJ(paramFile);
          if (arrayOfZbqc == null) {
            try {
              if (this.Zf.ZR == Zltf.DOTNET)
                Zg(paramFile); 
            } catch (IOException iOException) {
              throw a(null);
            } 
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zf.ZR == Zltf.DOTNET)
        Zg(paramFile); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void Zg(File paramFile) throws IOException {
    Zt(paramFile, a(-22578, 8394));
  }
  
  private void ZJ(File paramFile) throws IOException {
    Zt(paramFile, a(-22566, -22493));
  }
  
  private void Zt(File paramFile, String paramString) throws IOException {
    InputStream inputStream = getClass().getResourceAsStream(a(-22563, -12570) + a(-22563, -12570));
    FileOutputStream fileOutputStream = new FileOutputStream(new File(paramFile, paramString));
    Zbqc[] arrayOfZbqc = Zt8q.Zv();
    byte[] arrayOfByte = new byte[1024];
    int i;
    while ((i = inputStream.read(arrayOfByte, 0, arrayOfByte.length)) != -1) {
      fileOutputStream.write(arrayOfByte, 0, i);
      if (arrayOfZbqc == null)
        break; 
    } 
    inputStream.close();
    fileOutputStream.close();
  }
  
  private void ZE(ActionEvent paramActionEvent) {
    this.ZE.setVisible(false);
    File file = Zs6n.Zc(Zg1m.DATA, this, 1, a(-22567, -2653));
    if (file == null)
      return; 
    this.ZJ.setText(file.getAbsolutePath());
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'çþðç-¯TÑKLXØøczÑÜY-IFN]×zÚáJí¢¬ýaÖ:FçUý¯0Ôt¡­®?öÄáVÃ¤¬5ãþµ@OÝ  RÞîâþB>rÝ7Ï&\\nuØ\\rÁÎå±<9DòÔIûÎÍÉ;IvJ;U\\tY6:xÍi¹?ôVÕ`HwòÕn|Þ8ó]øÜX:¹Aáy¦Ì}><Æ©Ë6PÞ¤ùi}d.¨k»×<Øó?|Íä6ðRqÞ­ù\\rx.Í¢®bñlðc8Êäóßr:8vVT)#Z§¾ÓkéKfåC2ûAåð·/§FEøS*D\\tv>çö#ý­¯ã~0Æ äâä]=tâw£Ò§7ü·z\\b¢=3°P2*ôRÿzå\\bÎE 2rsÑæ-½G_ÔûÑ~ú\\rÛ»1OÕîûõ%8Ä¹9æÆí'ÒMóH.\Vå¼º'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #118
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
    //   68: ldc 'U:©þ ¹·ïy#^\ëRß'ôÄ²Íî¡±Pg'º÷ X¹YýEøvK=¹C9g&EHTÔWVêü¸«¢qQÝo¶ãPÑeJõ\\t=f ÄÚOcoPîøRëûý­nw;ÀÇ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #52
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #88
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
    //   129: putstatic burp/Zbt_.a : [Ljava/lang/String;
    //   132: bipush #19
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbt_.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #110
    //   214: goto -> 243
    //   217: bipush #18
    //   219: goto -> 243
    //   222: iconst_1
    //   223: goto -> 243
    //   226: bipush #11
    //   228: goto -> 243
    //   231: bipush #125
    //   233: goto -> 243
    //   236: bipush #115
    //   238: goto -> 243
    //   241: bipush #14
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA7DE) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbt_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */