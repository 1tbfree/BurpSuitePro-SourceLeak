package net.portswigger;

import java.util.concurrent.atomic.AtomicReference;

class Zm8 implements Zak {
  final Zrmq ZY;
  
  final AtomicReference ZB;
  
  final Ztj Zi;
  
  private static final String a;
  
  Zm8(Ztj paramZtj, Zrmq paramZrmq, AtomicReference paramAtomicReference) {}
  
  public void ZJ(Zkr paramZkr) {
    String str = this.ZY.Zo(paramZkr.ZQ).ZV(null);
    if (str == null)
      str = paramZkr.ZG; 
    try {
      if (str == null)
        throw new Zqb(String.format(a, new Object[] { paramZkr.ZQ })); 
    } catch (Zqb zqb) {
      throw a(null);
    } 
    this.ZB.set(this.Zi.ZO(str));
  }
  
  public void ZT(Zrmx paramZrmx) {}
  
  private static Zqb a(Zqb paramZqb) {
    return paramZqb;
  }
  
  static {
    // Byte code:
    //   0: bipush #117
    //   2: ldc '#MwI -8}DNb)@kHC\\n'(oTPb(]hNR/%VzYO\\fbkh\\n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zm8.a : Ljava/lang/String;
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
    //   80: bipush #55
    //   82: goto -> 112
    //   85: bipush #57
    //   87: goto -> 112
    //   90: bipush #77
    //   92: goto -> 112
    //   95: bipush #110
    //   97: goto -> 112
    //   100: bipush #88
    //   102: goto -> 112
    //   105: bipush #85
    //   107: goto -> 112
    //   110: bipush #11
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zm8.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */