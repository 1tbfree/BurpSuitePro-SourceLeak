package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.editor.extension.EditorMode;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpResponseEditor;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;
import net.portswigger.Zdo;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zkvi implements Zge7, Zzu4 {
  private final Zmgv Zq;
  
  private final Zgi0 ZE;
  
  private final ExtensionProvidedHttpResponseEditor Zh;
  
  private final Zskl Zw;
  
  private final Zey9 ZX;
  
  private final Zbqc Zc;
  
  private Zsmh ZI;
  
  private ByteArray ZA;
  
  private boolean Ze;
  
  private boolean Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkvi(Zmgv paramZmgv, Zgi0 paramZgi0, Zeew paramZeew, boolean paramBoolean, Zskl paramZskl, Zey9 paramZey9) {
    this.Zq = paramZmgv;
    this.ZE = paramZgi0;
    this.Zw = paramZskl;
    this.ZX = paramZey9;
    int i = Zlzj.ZZ();
    try {
      this.Za = true;
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    EditorMode editorMode = paramBoolean ? EditorMode.DEFAULT : EditorMode.READ_ONLY;
    Zsmh zsmh = Zsmh.ZN(paramZmgv.ZoO());
    try {
      this.Zh = paramZgi0.ZP(Zs(zsmh), editorMode, paramZeew);
      this.Zc = new Zbvy();
      if (this.Zh == null)
        throw new IllegalStateException(a(22045, -31775)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zh.caption() == null)
        throw new IllegalStateException(a(22047, -13967)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (this.Zh.uiComponent() == null)
        throw new IllegalStateException(a(22044, 16210)); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (Zbqc.Zwu() == null)
        Zlzj.ZR(++i); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  public boolean Zn(Zkvi paramZkvi) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZE == paramZkvi.ZE);
  }
  
  public boolean Zq(Zgyu paramZgyu) {
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZE == paramZgyu);
  }
  
  public Zrri Zp() {
    return null;
  }
  
  public boolean ZT(Zsmh paramZsmh, Zgu3 paramZgu3, Zs68 paramZs68, boolean paramBoolean) {
    int i = Zlzj.ZY();
    try {
      if (paramZgu3 == Zgu3.HTTP_RESPONSE) {
        try {
        
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        byte[] arrayOfByte = (paramZsmh == null) ? Zdo.ZQ : Zt6s.Zb(paramZsmh);
        try {
          this.Ze = this.Zh.isEnabledFor(Zs(Zsmh.Zh(arrayOfByte)));
          if (i == 0) {
            this.Ze = false;
            return this.Ze;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return this.Ze;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Ze = false;
    return this.Ze;
  }
  
  public boolean ZD(Zefx paramZefx) {
    return false;
  }
  
  public boolean Zv() {
    return this.Ze;
  }
  
  public boolean Zr() {
    return false;
  }
  
  public boolean Zc() {
    return false;
  }
  
  public boolean ZR() {
    return this.Zh.isModified();
  }
  
  public boolean ZF() {
    return this.Za;
  }
  
  public Zsmh Zb() {
    try {
      if (this.ZI == null)
        return Zsmh.Zy; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (this.Zh.isModified()) {
      HttpResponse httpResponse = this.Zh.getResponse();
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      return (httpResponse == null) ? Zsmh.Zy : Zsmh.Zh(httpResponse.toByteArray().getBytes());
    } 
    return this.ZI;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    this.ZI = paramZsmh;
    this.Zh.setRequestResponse(Zs(paramZsmh));
  }
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
  }
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {}
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {}
  
  public void Zx() {
    this.ZI = null;
    this.Zh.setRequestResponse(null);
  }
  
  public boolean ZQ() {
    try {
      this.ZA = this.Zh.selectedData().contents();
      if (this.ZA == null)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (this.ZA.length() > 0);
  }
  
  public String Zk() {
    return this.ZA.toString();
  }
  
  public byte[] Zw() {
    return this.ZA.getBytes();
  }
  
  public int[] Zg() {
    return null;
  }
  
  public void Zm(int paramInt1, int paramInt2) {}
  
  public Component Zz() {
    Component component = this.Zh.uiComponent();
    try {
      if ((this.Zc.getComponents()).length != 0) {
        try {
          if (component != this.Zc.getComponent(0)) {
            this.Zc.removeAll();
            this.Zc.add(component);
            return this.Zc;
          } 
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        } 
        return this.Zc;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.Zc.removeAll();
    this.Zc.add(component);
    return this.Zc;
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return null;
  }
  
  public void Za() {
    this.Zh.uiComponent().requestFocus();
  }
  
  public void Zb(Ztoy paramZtoy) {
    this.Za = paramZtoy.ZZ();
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    return Zkcm.Zy(this.Zh.caption(), this.ZE.ZM().ZN());
  }
  
  private HttpRequestResponse Zs(Zsmh paramZsmh) {
    Zbr zbr = this.Zq.Zo3();
    try {
    
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    Zefx zefx = (zbr == null) ? null : zbr.ZP(this.Zq.Zod(), this.ZX);
    return this.Zw.Zv(zefx, ZI(paramZsmh));
  }
  
  private byte[] ZI(Zsmh paramZsmh) {
    if (paramZsmh == null)
      paramZsmh = Zsmh.Zh(Zdo.ZQ); 
    Zrp8 zrp8 = new Zrp8();
    paramZsmh.Zh(zrp8);
    return zrp8.Zb();
  }
  
  public Ztcw ZI() {
    return Zi;
  }
  
  public void ZU() {}
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ò:ÁEgë¹Ó/át¦]µ?÷8^Ïà)^¤@·bVÄFÑå)ünFY««]á±£óA¨¿^8µµq/Mîèá6QàïË)âä@~ÌrlÔHéodHl jLVÁPÑO¾/R_/ÏcÇºv·'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #60
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #27
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic burp/Zkvi.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zkvi.b : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #93
    //   154: goto -> 184
    //   157: bipush #11
    //   159: goto -> 184
    //   162: bipush #18
    //   164: goto -> 184
    //   167: bipush #17
    //   169: goto -> 184
    //   172: bipush #80
    //   174: goto -> 184
    //   177: bipush #13
    //   179: goto -> 184
    //   182: bipush #112
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x561D) & 0xFFFF;
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
      char c = '»';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkvi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */