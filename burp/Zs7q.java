package burp;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;

class Zs7q implements Zmxf {
  private final Zey9 ZH;
  
  private final Zlou Zl;
  
  private static final String a;
  
  private Zs7q(Zey9 paramZey9, Zlou paramZlou) {
    this.ZH = paramZey9;
    this.Zl = paramZlou;
  }
  
  public Zefx ZF(Zr6h paramZr6h) {
    List<Ztnz> list = paramZr6h.ZK();
    ArrayList<Ztnz> arrayList = new ArrayList<>(list);
    boolean bool = Zey9.ZC();
    if (!paramZr6h.ZQ()) {
      int j = Zeg6.ZX(list, Ztnz::ZS);
      Zeg6.Zl(arrayList, j, Ztnz.ZV, a);
    } 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    if (paramZr6h.ZQ()) {
      byteArrayOutputStream.write(paramZr6h.Zw(), 0, (paramZr6h.Zw()).length);
      byteArrayOutputStream.write(38);
    } 
    byte[] arrayOfByte1 = Zkb.Zy(this.Zl.ZA + "=" + this.Zl.ZA);
    byteArrayOutputStream.write(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = byteArrayOutputStream.toByteArray();
    int[] arrayOfInt = Zeg6.Zv(paramZr6h);
    int i = arrayOfInt.length;
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt[b];
      Zeg6.Zx(arrayList, j, Ztnz.ZB, Integer.toString(arrayOfByte2.length), true);
      b++;
      if (bool) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    Zmzk zmzk = paramZr6h.ZT();
    return this.ZH.ZR(zmzk, arrayList, arrayOfByte2);
  }
  
  static {
    // Byte code:
    //   0: bipush #70
    //   2: ldc ':,M\\f#3EV_=+W\\fA g)\\bK%8'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs7q.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #62
    //   82: goto -> 112
    //   85: bipush #12
    //   87: goto -> 112
    //   90: bipush #26
    //   92: goto -> 112
    //   95: bipush #60
    //   97: goto -> 112
    //   100: bipush #44
    //   102: goto -> 112
    //   105: bipush #104
    //   107: goto -> 112
    //   110: bipush #52
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs7q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */