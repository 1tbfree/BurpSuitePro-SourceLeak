package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.browser.Zc7;
import net.portswigger.browser.Zdn;
import net.portswigger.browser.Ze7;
import net.portswigger.browser.Zje;
import net.portswigger.browser.Zjw;
import net.portswigger.browser.Zt;
import net.portswigger.browser.Ztk;

public interface Zlvj extends Zg8y {
  public static final String[] a;
  
  public static final String[] b;
  
  Zski Zx();
  
  String ZY();
  
  String Zf();
  
  List<String> Z_();
  
  default Zt5v Zy() {
    String str = Zf();
    Zsba zsba = Zsba.ZQ(str);
    switch (Zt9i.Zt[zsba.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
      case 4:
      
    } 
    Zuh.Zv(false, Zqf.Zk, zsba.Zi());
    return Zkjw.ZK;
  }
  
  default Zefx ZL(Zkl6 paramZkl6, List<Ztnz> paramList, Function<Ze7n, Zkg3> paramFunction, Zlit paramZlit) {
    List<? extends Ze7n> list = Zh().stream().filter(Zlvj::lambda$buildHttpRequest$0).map(paramFunction::lambda$buildHttpRequest$1).toList();
    return ZW(paramZkl6, list, paramZlit, paramList);
  }
  
  default Zefx Zi(Zkl6 paramZkl6, List<Ztnz> paramList, Zkg3 paramZkg3, Zlit paramZlit) {
    Objects.requireNonNull(paramZkg3);
    List<? extends Ze7n> list = Zh().stream().filter(Zlvj::lambda$buildHttpRequest$0).map(paramZkg3::ZQ).filter(Predicate.not(Objects::isNull)).toList();
    return ZW(paramZkl6, list, paramZlit, paramList);
  }
  
  private Zefx ZW(Zkl6 paramZkl6, List<? extends Ze7n> paramList, Zlit paramZlit, List<Ztnz> paramList1) {
    Zlai zlai = (new Zlai()).Zb(paramZlit).ZL(paramList1);
    Zlit zlit = Zs0p.ZD(ZM(), ZY(), Zx().ZyR(), paramList);
    Zmzk zmzk = zlit.Zdz();
    Zstu zstu = Zs0p.ZU(ZY(), Zy(), paramList, zlai);
    Ztom ztom = paramZkl6.Zs().ZO().Zj(Zde.Zv(ZY())).Zf(zlit).ZZ(zstu);
    Zbqc[] arrayOfZbqc = Zres.Zu();
    ztom.Za((List<Ztnz>)paramList.stream().filter(Ze7n::Zz).map(Ze7n::ZC).collect(Collectors.toList()));
    if (Z_().isEmpty()) {
      ztom.Za(zlai.Zk());
      if (arrayOfZbqc == null) {
        List<Ztnz> list1 = Z_().stream().filter(Zlvj::lambda$buildRequest$3).map(Zlvj::lambda$buildRequest$4).toList();
        ztom.Zl(list1);
        Zey9 zey92 = paramZkl6.ZH();
        return zey92.ZY(zmzk, ztom.Zr().ZiD());
      } 
      Zey9 zey91 = paramZkl6.ZH();
      return zey91.ZY(zmzk, ztom.Zr().ZiD());
    } 
    List<Ztnz> list = Z_().stream().filter(Zlvj::lambda$buildRequest$3).map(Zlvj::lambda$buildRequest$4).toList();
    ztom.Zl(list);
    Zey9 zey9 = paramZkl6.ZH();
    return zey9.ZY(zmzk, ztom.Zr().ZiD());
  }
  
  default Ze7 ZA(Zkg3 paramZkg3, Zzmb paramZzmb) {
    List<?> list = Zh().stream().filter(Zlvj::lambda$buildHttpRequest$0).toList();
    ArrayList<? extends Ze7n> arrayList = new ArrayList(paramZkg3.ZB(list));
    Zlit zlit = Zs0p.ZD(ZM(), ZY(), Zx().ZyR(), arrayList);
    Zlai zlai = new Zlai();
    Zstu zstu = Zs0p.ZU(ZY(), Zy(), arrayList, zlai);
    if (zstu == null) {
      Zski zski = Zski.ZO(zlit, Zx().Zyb());
      return Ze7.Zc(zski::lambda$navigate$6).ZY((Zt)Zje.ZR(paramZzmb.Zi()));
    } 
    Zdn zdn = new Zdn(ZY(), zlit.Zdw(), Zx().Zyb(), Z_().isEmpty() ? (List)zlai.Zk().stream().map(Zlvj::lambda$navigate$7).collect(Collectors.toList()) : (List)Z_().stream().map(Zlvj::lambda$navigate$8).collect(Collectors.toList()), zstu.Zis());
    return Ze7.Zc(zdn::lambda$navigate$9).ZY((Zt)Zje.ZR(paramZzmb.Zi()));
  }
  
  static String ZU(Zlvj paramZlvj) {
    return String.format(a(5720, 18415), new Object[] { paramZlvj.ZM(), paramZlvj.ZY(), paramZlvj.Zx().ZyJ() });
  }
  
  private static void lambda$navigate$9(Zdn paramZdn, Zjw paramZjw) throws Ztk, InterruptedException {
    paramZjw.ZS().ZJ(paramZdn.Zj());
  }
  
  private static Zc7 lambda$navigate$8(String paramString) {
    String[] arrayOfString = paramString.split(":", 2);
    return new Zc7(arrayOfString[0].strip(), arrayOfString[1].strip());
  }
  
  private static Zc7 lambda$navigate$7(Ztnz paramZtnz) {
    return new Zc7(Zkb.ZG(paramZtnz.Ze), Zkb.ZG(paramZtnz.ZM));
  }
  
  private static void lambda$navigate$6(Zski paramZski, Zjw paramZjw) throws Ztk, InterruptedException {
    paramZjw.ZS().Zh(paramZski.ZyJ());
  }
  
  private static Ztnz lambda$buildRequest$4(String paramString) {
    String[] arrayOfString = paramString.split(":", 2);
    return new Ztnz(arrayOfString[0].strip(), arrayOfString[1].strip());
  }
  
  private static boolean lambda$buildRequest$3(String paramString) {
    return (!paramString.toLowerCase().startsWith(a(5722, 17634)) && !paramString.toLowerCase().startsWith(a(5723, 756)));
  }
  
  private static Ze7n lambda$buildHttpRequest$1(Function<Ze7n, Zkg3> paramFunction, Ze7n paramZe7n) {
    Zkg3 zkg3 = paramFunction.apply(paramZe7n);
    return zkg3.ZQ(paramZe7n);
  }
  
  private static boolean lambda$buildHttpRequest$0(Ze7n paramZe7n) {
    return !paramZe7n.ZH().Zw();
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '»\\r`º,Ð«ï\\rÃû{É\\bÁ³íVÈ§]'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #104
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zlvj.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zlvj.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #113
    //   154: goto -> 184
    //   157: bipush #38
    //   159: goto -> 184
    //   162: bipush #74
    //   164: goto -> 184
    //   167: bipush #76
    //   169: goto -> 184
    //   172: bipush #91
    //   174: goto -> 184
    //   177: bipush #56
    //   179: goto -> 184
    //   182: bipush #91
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x165A) & 0xFFFF;
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
      char c = 'ÿ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlvj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */