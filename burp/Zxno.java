package burp;

public class Zxno implements Zvb {
  private final Exception Z_;
  
  private static final String a;
  
  Zxno(Exception paramException) {
    this.Z_ = paramException;
  }
  
  public Exception Zt() {
    return this.Z_;
  }
  
  public String toString() {
    return a;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: ldc 'aCU'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic burp/Zxno.a : Ljava/lang/String;
    //   10: goto -> 154
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 128
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #39
    //   82: goto -> 112
    //   85: bipush #50
    //   87: goto -> 112
    //   90: bipush #115
    //   92: goto -> 112
    //   95: bipush #118
    //   97: goto -> 112
    //   100: bipush #36
    //   102: goto -> 112
    //   105: bipush #116
    //   107: goto -> 112
    //   110: bipush #70
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 34
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 31
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
    //   151: goto -> 7
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxno.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */