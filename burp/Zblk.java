package burp;

public class Zblk {
  private final String Zx;
  
  private static final String a;
  
  public Zblk(String paramString) {
    this.Zx = String.format(a, new Object[] { paramString });
  }
  
  public String Zd() {
    return this.Zx;
  }
  
  static {
    // Byte code:
    //   0: bipush #113
    //   2: ldc 'J!%j#1&Ej]H\\nv]H\\nvL\\fH\\njVD )HtwH|#.[8hT#KGe+}To.}T1t(\VC%E\\nr+FH%e8LTYh{T#KHB?YW+l&Kt%\\tVajLc/J]\\t #\\tdj\\bPWT "LUT%{NZX\\nr:EI*r:JzevEHIHh/\\t\\rt#NWbjYc+@ ,[Wc?@|v?Gb#@sdJz %\\f\\t5pj9\'9J]sjHHa?LWejYc+@Vb/Gbe9LHojG\\ra)\\t hjAH4u8\\t4l+\\bF\\to8JZ e8F\\tVe$K\\rVB?YW;i>#Vd/LVv+@ 9Jt3J_e8Kt#ZYbJ/:TV"h/Jk \\tE\\to8]Vs/_Vd%ZWtj]\\rfjGa>\\t #]c>FVw#A}\\tyjPmfJH\\fVo$PWs:GVt%J@r+\\t]sjAVi>J[i<ZWo'JF r@Pm9D#KG>v>Vy%\\t +JZe'\\t\\fi$Zt%\\t 3\W\\tejLgjG\\ra)@ =]Hh/`k \\tE\\to8]Vs/_Vi$JP &NDVt"GW #\\te&\\t tjF\\rn/J@be9@Vy%[WbjYc+@Vu9GH4u8\\t$t/D\\t>Vy%\\t >P >\\t\\fn>Obh/JYo$J[o$@ ,[Wi9J]i$\\rWujAdjLwjFVw/\\b\\t\\rv/#Va:Et#GHo-\\t >LWm/JHHh#\\tAWe9\\te8Jn9J^ #@t/#Vy%[Ws>DF|<eKHF%\\tt"[W\\ft+EHb%]W*r:Jja([rfJY\\rs/JZ\\rVt"\\tK\\tVh8OJJS1npeFe$Hne\\tFb%H/hTO .Jn>]<eYTYptVyt`X m&T'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zblk.a : Ljava/lang/String;
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
    //   80: bipush #7
    //   82: goto -> 112
    //   85: bipush #113
    //   87: goto -> 112
    //   90: bipush #59
    //   92: goto -> 112
    //   95: bipush #27
    //   97: goto -> 112
    //   100: bipush #88
    //   102: goto -> 112
    //   105: bipush #6
    //   107: goto -> 112
    //   110: bipush #25
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zblk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */