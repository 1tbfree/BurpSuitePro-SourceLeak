package burp;

public class Zv8f implements Zsz6 {
  private final Zsz6 ZZ;
  
  private final Zkjm Zz;
  
  private static final String a;
  
  public Zv8f(Zmzk paramZmzk, Zkjm paramZkjm) {
    this(paramZmzk.ZJ1(), paramZmzk.ZJO(), paramZkjm);
  }
  
  Zv8f(String paramString, int paramInt, Zkjm paramZkjm) {
    this.ZZ = new Zre9(paramString, paramInt);
    this.Zz = paramZkjm;
  }
  
  public byte[] Zn() {
    byte[] arrayOfByte = this.ZZ.Zn();
    if (this.Zz != null && this.Zz.Zn() == 1)
      arrayOfByte = Zsbj.Zi(arrayOfByte, a + a); 
    return arrayOfByte;
  }
  
  static {
    // Byte code:
    //   0: bipush #97
    //   2: ldc 'aX\\rR cD^\\nYDXP^EsK\\tH\\r'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zv8f.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 98, 5 -> 103
    //   80: bipush #80
    //   82: goto -> 110
    //   85: bipush #75
    //   87: goto -> 110
    //   90: iconst_3
    //   91: goto -> 110
    //   94: iconst_1
    //   95: goto -> 110
    //   98: bipush #74
    //   100: goto -> 110
    //   103: bipush #76
    //   105: goto -> 110
    //   108: bipush #67
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8f.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */