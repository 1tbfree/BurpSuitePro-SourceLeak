package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zz8y implements Zkrr {
  public static final List<String> ZK;
  
  private final Zsoh Za;
  
  private final Ze3n Zx;
  
  private final Zkq4 Zt;
  
  private final Zm6e Zs;
  
  private final Zly Zk;
  
  private static String ZI;
  
  public Zz8y(Zsoh paramZsoh, Zkl6 paramZkl6, Ze3n paramZe3n, Zkq4 paramZkq4) {
    this.Za = paramZsoh;
    this.Zx = paramZe3n;
    this.Zt = paramZkq4;
    String str = Zf();
    this.Zs = paramZkl6.Zs();
    this.Zk = new Zly(paramZe3n);
    if (str == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zbsl Zp() {
    return Zbsl.APH_JwkDisclosed;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zt : Lburp/Zkq4;
    //   4: getstatic burp/Zzu2.JWK_DISCLOSED : Lburp/Zzu2;
    //   7: invokeinterface Zr : (Lburp/Zvs;)Z
    //   12: ifeq -> 30
    //   15: aload_0
    //   16: getfield Zt : Lburp/Zkq4;
    //   19: invokeinterface ZqT : ()Lburp/Zlk4;
    //   24: getstatic burp/Zlk4.FAST : Lburp/Zlk4;
    //   27: if_acmpne -> 31
    //   30: return
    //   31: getstatic burp/Zz8y.ZK : Ljava/util/List;
    //   34: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   39: aload_0
    //   40: aload_2
    //   41: <illegal opcode> apply : (Lburp/Zz8y;Lburp/Ztpx;)Ljava/util/function/Function;
    //   46: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   51: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   56: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   61: aload_3
    //   62: dup
    //   63: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: <illegal opcode> accept : (Lburp/Zz4_;)Ljava/util/function/Consumer;
    //   72: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   77: return
  }
  
  private Zsxd ZC(String paramString, Ztpx paramZtpx) {
    byte[] arrayOfByte = this.Zs.ZO().Zf(new Zax(this.Zx.Za(), Zkb.Zy(paramString))).Zr().ZiD();
    return this.Za.ZD(Ztao.Zc(paramZtpx, this.Zx.ZM(), arrayOfByte).Zz(false).ZA());
  }
  
  public String toString() {
    return Zp().name();
  }
  
  private Zsqx lambda$doCheck$0(Ztpx paramZtpx, String paramString) {
    Zsxd zsxd = ZC(paramString, paramZtpx);
    return this.Zk.ZE(zsxd, paramString);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore_0
    //   6: ldc 'b18fvb'
    //   8: iconst_0
    //   9: istore #4
    //   11: invokestatic ZQ : (Ljava/lang/String;)V
    //   14: ldc 'd9SPb/HKFrA'B]%)K_e;IHDC`bMAZ&%)K_e;IHADn %CJM[e\\b%@\U#IHDC`\\bb\\ncLWG\\na'TIDGd %)K_e;IHDC`RG'
    //   16: dup
    //   17: astore_3
    //   18: invokevirtual length : ()I
    //   21: istore #5
    //   23: bipush #21
    //   25: istore_2
    //   26: iconst_m1
    //   27: istore_1
    //   28: bipush #95
    //   30: iinc #1, 1
    //   33: aload_3
    //   34: iload_1
    //   35: dup
    //   36: iload_2
    //   37: iadd
    //   38: invokevirtual substring : (II)Ljava/lang/String;
    //   41: iconst_m1
    //   42: goto -> 135
    //   45: aload_0
    //   46: swap
    //   47: iload #4
    //   49: iinc #4, 1
    //   52: swap
    //   53: aastore
    //   54: iload_1
    //   55: iload_2
    //   56: iadd
    //   57: dup
    //   58: istore_1
    //   59: iload #5
    //   61: if_icmpge -> 73
    //   64: aload_3
    //   65: iload_1
    //   66: invokevirtual charAt : (I)C
    //   69: istore_2
    //   70: goto -> 28
    //   73: ldc '[$^i\\tN\\n[(Ab\\tB\\r dD{\\fT@8Ab[$OyO\[=#\\fB'
    //   75: dup
    //   76: astore_3
    //   77: invokevirtual length : ()I
    //   80: istore #5
    //   82: bipush #25
    //   84: istore_2
    //   85: iconst_m1
    //   86: istore_1
    //   87: bipush #31
    //   89: iinc #1, 1
    //   92: aload_3
    //   93: iload_1
    //   94: dup
    //   95: iload_2
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 135
    //   104: aload_0
    //   105: swap
    //   106: iload #4
    //   108: iinc #4, 1
    //   111: swap
    //   112: aastore
    //   113: iload_1
    //   114: iload_2
    //   115: iadd
    //   116: dup
    //   117: istore_1
    //   118: iload #5
    //   120: if_icmpge -> 132
    //   123: aload_3
    //   124: iload_1
    //   125: invokevirtual charAt : (I)C
    //   128: istore_2
    //   129: goto -> 87
    //   132: goto -> 292
    //   135: dup_x2
    //   136: pop
    //   137: invokevirtual toCharArray : ()[C
    //   140: dup_x1
    //   141: arraylength
    //   142: dup_x2
    //   143: pop
    //   144: iconst_0
    //   145: istore #6
    //   147: dup2_x1
    //   148: pop2
    //   149: dup_x2
    //   150: iconst_1
    //   151: if_icmpgt -> 252
    //   154: dup2
    //   155: swap
    //   156: iload #6
    //   158: dup2_x1
    //   159: caload
    //   160: swap
    //   161: iload #6
    //   163: bipush #7
    //   165: irem
    //   166: tableswitch default -> 234, 0 -> 204, 1 -> 209, 2 -> 214, 3 -> 219, 4 -> 224, 5 -> 229
    //   204: bipush #107
    //   206: goto -> 236
    //   209: bipush #84
    //   211: goto -> 236
    //   214: bipush #49
    //   216: goto -> 236
    //   219: bipush #19
    //   221: goto -> 236
    //   224: bipush #120
    //   226: goto -> 236
    //   229: bipush #56
    //   231: goto -> 236
    //   234: bipush #113
    //   236: ixor
    //   237: ixor
    //   238: i2c
    //   239: castore
    //   240: iinc #6, 1
    //   243: dup
    //   244: ifne -> 252
    //   247: dup2
    //   248: dup_x1
    //   249: goto -> 158
    //   252: dup2_x1
    //   253: pop2
    //   254: dup_x2
    //   255: iload #6
    //   257: if_icmpgt -> 154
    //   260: pop
    //   261: new java/lang/String
    //   264: dup_x1
    //   265: swap
    //   266: invokespecial <init> : ([C)V
    //   269: invokevirtual intern : ()Ljava/lang/String;
    //   272: swap
    //   273: pop
    //   274: swap
    //   275: tableswitch default -> 45, 0 -> 104
    //   292: aload_0
    //   293: bipush #7
    //   295: aaload
    //   296: aload_0
    //   297: iconst_4
    //   298: aaload
    //   299: aload_0
    //   300: iconst_1
    //   301: aaload
    //   302: aload_0
    //   303: iconst_5
    //   304: aaload
    //   305: aload_0
    //   306: iconst_2
    //   307: aaload
    //   308: aload_0
    //   309: bipush #6
    //   311: aaload
    //   312: aload_0
    //   313: iconst_0
    //   314: aaload
    //   315: aload_0
    //   316: iconst_3
    //   317: aaload
    //   318: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    //   321: putstatic burp/Zz8y.ZK : Ljava/util/List;
    //   324: return
  }
  
  public static void ZQ(String paramString) {
    ZI = paramString;
  }
  
  public static String Zf() {
    return ZI;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz8y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */