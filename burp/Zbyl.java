package burp;

class Zbyl extends Zbtk {
  private final Zxwh Zg;
  
  private final String ZY;
  
  private final String Zk;
  
  private static final String a;
  
  Zbyl(Zxwh paramZxwh, String paramString1, String paramString2, String paramString3) {
    super(paramZxwh);
    this.Zg = paramZxwh;
    this.ZY = paramString2;
    this.Zk = paramString3;
    Zm99 zm99 = new Zm99(a);
    Z_(zm99, 0, 0, 1);
    Zg85 zg85 = new Zg85(paramString2);
    zg85.setEnabled(false);
    zg85.setName(paramString1);
    Z_(zg85, 1, 0, 1);
  }
  
  void Zy() throws Zsx7 {
    this.Zg.ZAe(this.ZY);
    this.Zg.ZAC(this.Zk);
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: ldc '<[r`o Sc%sLEaif\\t\\r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbyl.a : Ljava/lang/String;
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
    //   80: bipush #118
    //   82: goto -> 112
    //   85: bipush #45
    //   87: goto -> 112
    //   90: bipush #102
    //   92: goto -> 112
    //   95: bipush #11
    //   97: goto -> 112
    //   100: bipush #31
    //   102: goto -> 112
    //   105: bipush #29
    //   107: goto -> 112
    //   110: bipush #99
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */