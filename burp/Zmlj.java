package burp;

import java.util.List;
import java.util.function.BiFunction;
import net.portswigger.Zsy;

class Zmlj implements Zebd {
  private static final String a;
  
  public <T> void ZD(List<T> paramList, int paramInt, String paramString1, String paramString2, BiFunction<String, String, T> paramBiFunction) {
    String str = (new Zsy()).Zi().Zx().ZK(8);
    paramList.set(paramInt, paramBiFunction.apply(String.format(a, new Object[] { str, str, paramString1 }), paramString2));
  }
  
  static {
    // Byte code:
    //   0: bipush #88
    //   2: ldc 'k"gC8qk"'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmlj.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #22
    //   82: goto -> 111
    //   85: bipush #9
    //   87: goto -> 111
    //   90: iconst_5
    //   91: goto -> 111
    //   94: bipush #7
    //   96: goto -> 111
    //   99: bipush #62
    //   101: goto -> 111
    //   104: bipush #19
    //   106: goto -> 111
    //   109: bipush #35
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmlj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */