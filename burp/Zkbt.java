package burp;

public class Zkbt implements Zl1a {
  private final Zlhe Zc;
  
  private final int Zj;
  
  private static final String a;
  
  public Zkbt(Zlhe paramZlhe, Zrti paramZrti) {
    this.Zc = paramZlhe;
    this.Zj = paramZrti.ZX;
  }
  
  public Zmf Zy(Zgv1 paramZgv1) {
    return new Zs_d(this.Zc, paramZgv1, Zkbt::lambda$get$0, this.Zj);
  }
  
  private static void lambda$get$0(Zken paramZken, String paramString) {
    paramZken.Za(String.format(a, new Object[] { paramString }));
  }
  
  static {
    // Byte code:
    //   0: bipush #71
    //   2: ldc '$\\t4}W }W0~K:_i3HH$5R#/H`Q:ck\\b6|v\\b6}a" B#3US1e"\\n^.f XyA;tYwH^!|Y|Q*>wVtuyLtaqF\\bwu:M:ck\\b6|v\\b6}aM8}o\\b:rk\\b+~V|J8xK:Sv/KW5\\bQ|bW[5MvrkV\=~qK\)~{\O'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkbt.a : Ljava/lang/String;
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
    //   80: bipush #95
    //   82: goto -> 112
    //   85: bipush #98
    //   87: goto -> 112
    //   90: bipush #54
    //   92: goto -> 112
    //   95: bipush #30
    //   97: goto -> 112
    //   100: bipush #86
    //   102: goto -> 112
    //   105: bipush #48
    //   107: goto -> 112
    //   110: bipush #49
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkbt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */