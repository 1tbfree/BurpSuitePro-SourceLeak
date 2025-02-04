package burp;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.swing.JSeparator;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zl85 extends MouseAdapter implements Zzyl, Zeq {
  private final Zlba ZZ;
  
  private final Ztyg Zy;
  
  private final Zgq7 Zj;
  
  private final Zbws ZM;
  
  private final Ztn8 Zn;
  
  private final Runnable Zm;
  
  private final Consumer<Zbza> ZH;
  
  private final Zerg Zf;
  
  private final Zbjf ZQ;
  
  private final Zkl6 ZP;
  
  private final Zg09 ZJ;
  
  private Zbza ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl85(Consumer<Zbza> paramConsumer, Zerg paramZerg, Zlba paramZlba, Zbjf paramZbjf, Ztyg paramZtyg, Zgq7 paramZgq7, Zkl6 paramZkl6, Zg09 paramZg09, Ztn8 paramZtn8, Runnable paramRunnable) {
    this.ZH = paramConsumer;
    this.Zf = paramZerg;
    this.ZZ = paramZlba;
    this.ZQ = paramZbjf;
    this.Zy = paramZtyg;
    this.Zj = paramZgq7;
    this.ZM = paramZbjf.ZV();
    this.ZP = paramZkl6;
    this.ZJ = paramZg09;
    this.Zn = paramZtn8;
    this.Zm = paramRunnable;
  }
  
  public void mousePressed(MouseEvent paramMouseEvent) {
    // Byte code:
    //   0: invokestatic Zq : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual isPopupTrigger : ()Z
    //   8: ifeq -> 20
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual Zm : (Ljava/awt/event/MouseEvent;)V
    //   16: aload_2
    //   17: ifnull -> 71
    //   20: aload_1
    //   21: invokevirtual getClickCount : ()I
    //   24: iconst_2
    //   25: if_icmpne -> 71
    //   28: aload_0
    //   29: getfield ZM : Lburp/Zbws;
    //   32: invokevirtual getSelectedColumn : ()I
    //   35: getstatic burp/Zmug.Zs : I
    //   38: if_icmpeq -> 71
    //   41: aload_0
    //   42: getfield ZJ : Lburp/Zg09;
    //   45: aload_0
    //   46: getfield ZM : Lburp/Zbws;
    //   49: aload_0
    //   50: getfield ZM : Lburp/Zbws;
    //   53: invokevirtual getSelectedRow : ()I
    //   56: invokevirtual convertRowIndexToModel : (I)I
    //   59: invokevirtual get : (I)Ljava/lang/Object;
    //   62: checkcast burp/Zbza
    //   65: astore_3
    //   66: aload_0
    //   67: aload_3
    //   68: invokevirtual ZX : (Lburp/Zbza;)V
    //   71: return
  }
  
  public void mouseReleased(MouseEvent paramMouseEvent) {
    if (paramMouseEvent.isPopupTrigger())
      Zm(paramMouseEvent); 
  }
  
  private void ZX(Zbza paramZbza) {
    String[] arrayOfString = Zxcf.Zq();
    Zl03 zl03 = this.Zn.Za(paramZbza);
    if (zl03 == null) {
      Zl03 zl031 = new Zl03(Zt2m.ZF(this.ZM), this.Zy, this.Zj, paramZbza, this.Zn, this.ZP);
      zl031.setVisible(true);
      if (arrayOfString != null) {
        zl03.requestFocus();
        return;
      } 
      return;
    } 
    zl03.requestFocus();
  }
  
  private void Zm(MouseEvent paramMouseEvent) {
    int i = this.ZM.rowAtPoint(paramMouseEvent.getPoint());
    if (i < 0)
      return; 
    List<Zmzr> list = Zd(paramMouseEvent.getPoint());
    Zg(list).show(paramMouseEvent.getComponent(), paramMouseEvent.getX(), paramMouseEvent.getY());
  }
  
  private List<Zmzr> Zd(Point paramPoint) {
    return Zt(this.ZM.ZS(paramPoint));
  }
  
  private List<Zmzr> Zt(int[] paramArrayOfint) {
    return (List<Zmzr>)Arrays.stream(paramArrayOfint).mapToObj(this::Zr).filter(Objects::nonNull).collect(Collectors.toList());
  }
  
  private Zmzr Zr(int paramInt) {
    if (paramInt < 0 || paramInt >= this.ZM.getRowCount())
      return null; 
    int i = this.ZM.convertRowIndexToModel(paramInt);
    Zbza zbza = this.ZJ.get(i);
    return (zbza == null) ? null : new Zmzr(paramInt, zbza);
  }
  
  private Zkj9 Zg(List<Zmzr> paramList) {
    Zlu7 zlu7 = new Zlu7(paramList, this.Zf, this.ZZ, this.ZQ, this.ZM, this::ZX, this.Zm);
    Zkj9 zkj9 = Zd(paramList);
    String[] arrayOfString = Zxcf.Zq();
    if (!paramList.isEmpty()) {
      zkj9.add(Ztsr.ZW(zlu7, 527872));
      if (paramList.size() == 1)
        zkj9.add(Ztsr.ZW(zlu7, 527888)); 
    } 
    boolean bool1 = false;
    boolean bool2 = false;
    for (Zmzr zmzr : paramList) {
      switch (zmzr.ZwX().Zg6()) {
        case 0:
          bool1 = true;
        case 1:
          bool1 = true;
          bool2 = true;
        case 2:
        case 4:
          bool2 = true;
          break;
      } 
      continue;
      if (arrayOfString != null)
        break; 
    } 
    boolean bool3 = false;
    if (bool1) {
      bool3 = true;
      zkj9.add(Ztsr.ZW(zlu7, 528640));
    } 
    if (bool2) {
      bool3 = true;
      Zepk zepk = Ztsr.ZW(zlu7, 528896);
      zepk.setName(a(25210, -30331));
      zkj9.add(zepk);
    } 
    if (!paramList.isEmpty()) {
      if (bool3)
        zkj9.add(new JSeparator()); 
      bool3 = true;
      Zz5n.Zn(((Zmzr)paramList.get(0)).ZwX().Zg0(), zkj9, zlu7, a(25209, -5686));
      if (paramList.size() == 1) {
        zkj9.add(new JSeparator());
        zkj9.add(Ztsr.ZW(zlu7, 131328));
        zkj9.add(Ztsr.ZW(zlu7, 131584));
        zkj9.add(Ztsr.ZW(zlu7, 132992));
      } 
    } 
    if (bool3)
      zkj9.add(new JSeparator()); 
    zkj9.add(new Zepa(a(25208, 1581), Zk97.DESKTOP_SCANNING_AUDIT_ITEMS, Zt2m.ZF(this.ZM)));
    return zkj9;
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    List<Zmzr> list = Arrays.stream(this.ZM.getSelectedRows()).mapToObj(this::lambda$handleAction$0).toList();
    return (new Zlu7(list, this.Zf, this.ZZ, this.ZQ, this.ZM, this::ZX, this.Zm)).ZI(paramInt, paramObject);
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    try {
      try {
        if (paramInt1 >= 0 && paramInt1 < this.ZJ.size()) {
          Zbza zbza = this.ZJ.get(this.ZM.convertRowIndexToModel(paramInt1));
          try {
            if (!Objects.equals(zbza, this.ZN))
              this.ZH.accept(zbza); 
          } catch (Exception exception) {
            throw a(null);
          } 
          this.ZN = zbza;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
  }
  
  private static Zkj9 Zd(List<Zmzr> paramList) {
    if (paramList.size() > 1)
      return Zsn5.ZA(paramList.size()); 
    Zbza zbza = ((Zmzr)paramList.get(0)).ZwX();
    return Zsn5.ZR(String.valueOf(zbza.Zg0()) + String.valueOf(zbza.Zg0()));
  }
  
  private Zmzr lambda$handleAction$0(int paramInt) {
    return new Zmzr(paramInt, this.ZJ.get(this.ZM.convertRowIndexToModel(paramInt)));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'aÛ¦¼8B_kl6ñQ\\r»>áõìä.g.q)G»3B7E û_¥R×ÌÃMê\\rÓfs\\f0V'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #25
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #41
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
    //   69: putstatic burp/Zl85.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zl85.b : [Ljava/lang/String;
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
    //   152: bipush #28
    //   154: goto -> 184
    //   157: bipush #126
    //   159: goto -> 184
    //   162: bipush #64
    //   164: goto -> 184
    //   167: bipush #90
    //   169: goto -> 184
    //   172: bipush #99
    //   174: goto -> 184
    //   177: bipush #101
    //   179: goto -> 184
    //   182: bipush #52
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
    int i = (paramInt1 ^ 0x6278) & 0xFFFF;
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
      byte b1 = 115;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl85.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */