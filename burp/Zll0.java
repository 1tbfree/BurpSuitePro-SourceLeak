package burp;

class Zll0 extends Zlln {
  private static final String a;
  
  Zll0(Zxgh paramZxgh) {
    super(paramZxgh);
  }
  
  public Zlln ZZ(Zsp paramZsp) throws Zzt7 {
    try {
      if (!this.Zq.Zx(paramZsp.Zi))
        throw new Zzt7(Zlxi.PROTOCOL_ERROR); 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    try {
      switch (Zst2.Zk[paramZsp.Zi.ordinal()]) {
        case 1:
          try {
            if (this.Zq.ZQ())
              throw new Zzt7(Zlxi.PROTOCOL_ERROR); 
          } catch (Zzt7 zzt7) {
            throw a(null);
          } 
          try {
            this.Zq.ZI(paramZsp);
            if (this.Zq.ZQ())
              try {
                if (this.Zq.ZG());
              } catch (Zzt7 zzt7) {
                throw a(null);
              }  
          } catch (Zzt7 zzt7) {
            throw a(null);
          } 
          return this;
        case 2:
          try {
            this.Zq.ZI(paramZsp);
            if (this.Zq.ZQ())
              try {
                if (this.Zq.ZG());
              } catch (Zzt7 zzt7) {
                throw a(null);
              }  
          } catch (Zzt7 zzt7) {
            throw a(null);
          } 
          return this;
        case 3:
          try {
            this.Zq.ZI(paramZsp);
          } catch (Zzt7 zzt7) {
            throw a(null);
          } 
          return this.Zq.ZQ() ? new Zll_() : this;
        case 4:
        case 5:
        case 6:
          return this;
        case 7:
          return new Zll_();
      } 
    } catch (Zzt7 zzt7) {
      throw a(null);
    } 
    throw new IllegalStateException();
  }
  
  public Zlln Zs(Zsp paramZsp) {
    try {
      switch (Zst2.Zk[paramZsp.Zi.ordinal()]) {
        case 4:
        case 5:
          return this;
        case 7:
          return new Zll_();
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    throw new IllegalStateException(a);
  }
  
  public Zrsv Zl() {
    return Zrsv.HALF_CLOSED_LOCAL;
  }
  
  public String toString() {
    return Zl().toString();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #41
    //   2: ldc '&ror5\\r&~"2b*p \\n\\f&~r$Gnk\\t"(!~]r$o~\\tg%Ghnpatxl5Grk\\tgo'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zll0.a : Ljava/lang/String;
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
    //   80: bipush #78
    //   82: goto -> 112
    //   85: bipush #64
    //   87: goto -> 112
    //   90: bipush #47
    //   92: goto -> 112
    //   95: bipush #35
    //   97: goto -> 112
    //   100: bipush #84
    //   102: goto -> 112
    //   105: bipush #43
    //   107: goto -> 112
    //   110: bipush #104
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zll0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */