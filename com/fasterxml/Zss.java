package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.math.BigDecimal;

final class Zss extends Zsf {
  static final Zss Zo;
  
  private static final String d;
  
  public Zss() {
    super(BigDecimal.class);
  }
  
  public boolean Zt(Zyi paramZyi, Object paramObject) {
    return false;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_2
    //   6: getstatic com/fasterxml/Zb/Zi.WRITE_BIGDECIMAL_AS_PLAIN : Lcom/fasterxml/Zb/Zi;
    //   9: invokevirtual Za : (Lcom/fasterxml/Zb/Zi;)Z
    //   12: ifeq -> 94
    //   15: aload_1
    //   16: checkcast java/math/BigDecimal
    //   19: astore #6
    //   21: aload_0
    //   22: aload_2
    //   23: aload #6
    //   25: invokevirtual Zx : (Lcom/fasterxml/Zb/Zf;Ljava/math/BigDecimal;)Z
    //   28: ifne -> 82
    //   31: getstatic com/fasterxml/Zss.d : Ljava/lang/String;
    //   34: iconst_3
    //   35: anewarray java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: aload #6
    //   42: invokevirtual scale : ()I
    //   45: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: sipush #9999
    //   54: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: sipush #9999
    //   63: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   66: aastore
    //   67: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   70: astore #7
    //   72: aload_3
    //   73: aload #7
    //   75: iconst_0
    //   76: anewarray java/lang/Object
    //   79: invokevirtual Ze : (Ljava/lang/String;[Ljava/lang/Object;)V
    //   82: aload #6
    //   84: invokevirtual toPlainString : ()Ljava/lang/String;
    //   87: astore #5
    //   89: aload #4
    //   91: ifnull -> 100
    //   94: aload_1
    //   95: invokevirtual toString : ()Ljava/lang/String;
    //   98: astore #5
    //   100: aload_2
    //   101: aload #5
    //   103: invokevirtual ZD : (Ljava/lang/String;)V
    //   106: return
  }
  
  public String Ze(Object paramObject) {
    throw new IllegalStateException();
  }
  
  protected boolean Zx(Zf paramZf, BigDecimal paramBigDecimal) throws IOException {
    int i = paramBigDecimal.scale();
    try {
      if (i >= -9999)
        try {
          if (i <= 9999);
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return false;
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc '\\npC$mkpX_&p?a5p%$W"xeiVz["cs=t*hW_\'|.$}\\f:^.jR\\r v9*q l9a(&M[u63\\\bMz>8X[g35Wb$@ <9"h[5ukwT19c!SVNtw.aS\\fT vkfR_1m<aRT4n`_Q0D'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zss.d : Ljava/lang/String;
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
    //   80: bipush #113
    //   82: goto -> 112
    //   85: bipush #62
    //   87: goto -> 112
    //   90: bipush #13
    //   92: goto -> 112
    //   95: bipush #69
    //   97: goto -> 112
    //   100: bipush #78
    //   102: goto -> 112
    //   105: bipush #110
    //   107: goto -> 112
    //   110: bipush #35
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
    //   154: new com/fasterxml/Zss
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic com/fasterxml/Zss.Zo : Lcom/fasterxml/Zss;
    //   164: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zss.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */