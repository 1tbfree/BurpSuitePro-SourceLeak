package burp;

class Zg42 implements Zmxf {
  private final Zefx ZF;
  
  private final Zlou Zf;
  
  private final Zs7q ZW;
  
  private final Zla7 Zv;
  
  private final Zxnf ZS;
  
  private final Zm18 ZO;
  
  private static final String a;
  
  Zg42(Zey9 paramZey9, Zefx paramZefx, Zlou paramZlou) {
    this.ZF = paramZefx;
    this.Zf = paramZlou;
    this.ZW = new Zs7q(paramZey9, paramZlou);
    this.Zv = new Zla7(paramZey9, paramZefx, paramZlou, this.ZW);
    this.ZS = new Zxnf(paramZey9, paramZlou);
    this.ZO = new Zm18(paramZey9, paramZefx, paramZlou);
  }
  
  public Zefx ZF(Zr6h paramZr6h) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZF : Lburp/Zefx;
    //   4: invokeinterface Zv : ()Lburp/Zsba;
    //   9: getstatic burp/Zsba.MULTIPART : Lburp/Zsba;
    //   12: if_acmpne -> 45
    //   15: aload_0
    //   16: getfield Zf : Lburp/Zlou;
    //   19: getfield Zx : Lburp/Zrdu;
    //   22: getstatic burp/Zrdu.BODY_PARAM_URL_ENCODED : Lburp/Zrdu;
    //   25: if_acmpne -> 45
    //   28: goto -> 35
    //   31: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   34: athrow
    //   35: getstatic burp/Zrdu.BODY_PARAM_MULTIPART : Lburp/Zrdu;
    //   38: goto -> 52
    //   41: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   44: athrow
    //   45: aload_0
    //   46: getfield Zf : Lburp/Zlou;
    //   49: getfield Zx : Lburp/Zrdu;
    //   52: astore_2
    //   53: getstatic burp/Ztc8.ZY : [I
    //   56: aload_2
    //   57: invokevirtual ordinal : ()I
    //   60: iaload
    //   61: tableswitch default -> 132, 1 -> 92, 2 -> 105, 3 -> 114, 4 -> 123
    //   92: aload_0
    //   93: getfield ZO : Lburp/Zm18;
    //   96: aload_1
    //   97: invokevirtual ZF : (Lburp/Zr6h;)Lburp/Zefx;
    //   100: areturn
    //   101: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   104: athrow
    //   105: aload_0
    //   106: getfield ZS : Lburp/Zxnf;
    //   109: aload_1
    //   110: invokevirtual ZF : (Lburp/Zr6h;)Lburp/Zefx;
    //   113: areturn
    //   114: aload_0
    //   115: getfield ZW : Lburp/Zs7q;
    //   118: aload_1
    //   119: invokevirtual ZF : (Lburp/Zr6h;)Lburp/Zefx;
    //   122: areturn
    //   123: aload_0
    //   124: getfield Zv : Lburp/Zla7;
    //   127: aload_1
    //   128: invokevirtual ZF : (Lburp/Zr6h;)Lburp/Zefx;
    //   131: areturn
    //   132: new java/lang/IllegalArgumentException
    //   135: dup
    //   136: aload_0
    //   137: getfield Zf : Lburp/Zlou;
    //   140: getfield Zx : Lburp/Zrdu;
    //   143: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   146: getstatic burp/Zg42.a : Ljava/lang/String;
    //   149: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   154: invokespecial <init> : (Ljava/lang/String;)V
    //   157: athrow
    // Exception table:
    //   from	to	target	type
    //   0	28	31	java/lang/IllegalArgumentException
    //   15	41	41	java/lang/IllegalArgumentException
    //   53	101	101	java/lang/IllegalArgumentException
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #97
    //   2: ldc '7ASdug AU0d'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg42.a : Ljava/lang/String;
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
    //   85: bipush #17
    //   87: goto -> 112
    //   90: bipush #79
    //   92: goto -> 112
    //   95: bipush #70
    //   97: goto -> 112
    //   100: bipush #37
    //   102: goto -> 112
    //   105: bipush #11
    //   107: goto -> 112
    //   110: bipush #97
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg42.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */