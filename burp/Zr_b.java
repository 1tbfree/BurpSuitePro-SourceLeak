package burp;

public class Zr_b {
  public static final Zrij ZS;
  
  private final Zsiv ZT;
  
  private final Ztk0 Zn;
  
  private final Zz1m<Zt18> ZX;
  
  private final Zr69 ZH;
  
  private final Zkl6 Zs;
  
  private static final String a;
  
  public Zr_b(Zsiv paramZsiv, Ztk0 paramZtk0, Zz1m<Zt18> paramZz1m, Zr69 paramZr69, Zkl6 paramZkl6) {
    this.ZT = paramZsiv;
    this.Zn = paramZtk0;
    this.ZX = paramZz1m;
    this.ZH = paramZr69;
    this.Zs = paramZkl6;
  }
  
  public void ZB(Ztos<Zt35> paramZtos) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zt35.Zo : Lburp/Zlnb;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> accept : (Lburp/Zr_b;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   11: getstatic burp/Zr_b.ZS : Lburp/Zrij;
    //   14: invokevirtual ZO : (Lburp/Zlnb;Ljava/util/function/Consumer;Lburp/Zrij;)Lburp/Zgrn;
    //   17: pop
    //   18: aload_1
    //   19: getstatic burp/Zt35.ZO : Lburp/Zlnb;
    //   22: aload_0
    //   23: <illegal opcode> accept : (Lburp/Zr_b;)Ljava/util/function/Consumer;
    //   28: getstatic burp/Zr_b.ZS : Lburp/Zrij;
    //   31: invokevirtual ZO : (Lburp/Zlnb;Ljava/util/function/Consumer;Lburp/Zrij;)Lburp/Zgrn;
    //   34: pop
    //   35: aload_1
    //   36: getstatic burp/Zt35.Zu : Lburp/Zlnb;
    //   39: aload_0
    //   40: <illegal opcode> accept : (Lburp/Zr_b;)Ljava/util/function/Consumer;
    //   45: getstatic burp/Zr_b.ZS : Lburp/Zrij;
    //   48: invokevirtual ZO : (Lburp/Zlnb;Ljava/util/function/Consumer;Lburp/Zrij;)Lburp/Zgrn;
    //   51: pop
    //   52: return
  }
  
  private void ZK(Zs_l paramZs_l, Zz1m<Zt35> paramZz1m) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Zpt : ()Lburp/Zt8i;
    //   4: invokeinterface Zsu : ()Lburp/Zeu9;
    //   9: astore_3
    //   10: aload_0
    //   11: getfield ZT : Lburp/Zsiv;
    //   14: invokeinterface ZZo : ()I
    //   19: istore #4
    //   21: aload_3
    //   22: aload_0
    //   23: getfield ZT : Lburp/Zsiv;
    //   26: aload_0
    //   27: getfield Zn : Lburp/Ztk0;
    //   30: aload_0
    //   31: getfield ZH : Lburp/Zr69;
    //   34: aload_2
    //   35: invokeinterface ZR : (Lburp/Zsiv;Lburp/Ztk0;Lburp/Zr69;Lburp/Zz1m;)V
    //   40: aload_3
    //   41: new burp/Zbud
    //   44: dup
    //   45: aload_0
    //   46: getfield ZH : Lburp/Zr69;
    //   49: aload_2
    //   50: invokespecial <init> : (Lburp/Zr69;Lburp/Zz1m;)V
    //   53: invokeinterface Zp : (Lburp/Zsl5;)V
    //   58: aload_0
    //   59: getfield ZT : Lburp/Zsiv;
    //   62: invokeinterface ZZo : ()I
    //   67: iload #4
    //   69: isub
    //   70: istore #5
    //   72: iload #5
    //   74: ifle -> 94
    //   77: aload_3
    //   78: invokeinterface ZHk : ()Ljava/util/Optional;
    //   83: aload_0
    //   84: iload #5
    //   86: <illegal opcode> accept : (Lburp/Zr_b;I)Ljava/util/function/Consumer;
    //   91: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   94: return
  }
  
  private void ZZ() {
    this.ZX.ZD(new Zxr8(Zt18.Zt, Integer.valueOf(this.ZT.ZZo())));
  }
  
  private void lambda$roomAdded$4(int paramInt, Zski paramZski) {
    this.ZX.ZD(new Zxr8(Zt18.Zp, a.formatted(new Object[] { Integer.valueOf(paramInt), paramZski })));
  }
  
  private void lambda$subscribeTo$2(Zxr8 paramZxr8) {
    ZZ();
  }
  
  private void lambda$subscribeTo$1(Ztos paramZtos, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zr_b;Lburp/Ztos;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$subscribeTo$0(Ztos<Zt35> paramZtos, Zs_l paramZs_l) {
    ZK(paramZs_l, paramZtos);
  }
  
  static {
    // Byte code:
    //   0: bipush #67
    //   2: ldc 'G\\tdd _J#\\t }+Vog-/[on~n^i  }/_<M%~'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr_b.a : Ljava/lang/String;
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
    //   80: bipush #69
    //   82: goto -> 112
    //   85: bipush #46
    //   87: goto -> 112
    //   90: bipush #67
    //   92: goto -> 112
    //   95: bipush #78
    //   97: goto -> 112
    //   100: bipush #13
    //   102: goto -> 112
    //   105: bipush #123
    //   107: goto -> 112
    //   110: bipush #41
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
    //   154: getstatic burp/Zrij.Zx : Lburp/Zrij;
    //   157: putstatic burp/Zr_b.ZS : Lburp/Zrij;
    //   160: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr_b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */