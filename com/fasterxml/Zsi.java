package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Zsi extends Zsu<Duration> {
  private static final long serialVersionUID = 1L;
  
  public static final Zsi Zm;
  
  private Zqk ZV;
  
  private static final String d;
  
  protected Zsi() {
    super(Duration.class);
  }
  
  protected Zsi(Zsi paramZsi, Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZsi, paramBoolean, paramDateTimeFormatter, (Zqi)null);
  }
  
  protected Zsi(Zsi paramZsi, Boolean paramBoolean1, Boolean paramBoolean2, DateTimeFormatter paramDateTimeFormatter) {
    super(paramZsi, paramBoolean1, paramBoolean2, paramDateTimeFormatter, (Zqi)null);
  }
  
  protected Zsi(Zsi paramZsi, Zqk paramZqk) {
    super(paramZsi, paramZsi.Zt, paramZsi.ZL, paramZsi.ZE, paramZsi.ZQ);
    this.ZV = paramZqk;
  }
  
  protected Zsi ZD(Boolean paramBoolean, DateTimeFormatter paramDateTimeFormatter, Zqi paramZqi) {
    return new Zsi(this, paramBoolean, paramDateTimeFormatter);
  }
  
  protected Zsi Zz(Zqk paramZqk) {
    return new Zsi(this, paramZqk);
  }
  
  protected Zy0 ZK() {
    return Zy0.WRITE_DURATIONS_AS_TIMESTAMPS;
  }
  
  public Zyd<?> Za(Zyi paramZyi, Zo paramZo) throws Zy_ {
    Zsi zsi = (Zsi)super.Za(paramZyi, paramZo);
    Zgy zgy = Z_(paramZyi, paramZo, Zz());
    try {
      if (zgy != null && zgy.ZR()) {
        String str = zgy.Zu();
        Zqk zqk = Zqk.Zn(str);
        try {
          if (zqk == null)
            paramZyi.ZA(Zz(), String.format(d, new Object[] { str, Zqk.ZX() })); 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
        zsi = zsi.Zz(zqk);
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zsi;
  }
  
  public void Zl(Duration paramDuration, Zf paramZf, Zyi paramZyi) throws IOException {
    // Byte code:
    //   0: invokestatic Zm : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: aload_3
    //   7: invokevirtual Za : (Lcom/fasterxml/Zor/Zyi;)Z
    //   10: ifeq -> 107
    //   13: aload_0
    //   14: getfield ZV : Lcom/fasterxml/Zqk;
    //   17: ifnull -> 51
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   26: athrow
    //   27: aload_2
    //   28: aload_0
    //   29: getfield ZV : Lcom/fasterxml/Zqk;
    //   32: aload_1
    //   33: invokevirtual ZH : (Ljava/time/Duration;)J
    //   36: invokevirtual Zw : (J)V
    //   39: aload #4
    //   41: ifnull -> 122
    //   44: goto -> 51
    //   47: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   50: athrow
    //   51: aload_0
    //   52: aload_3
    //   53: invokevirtual Zl : (Lcom/fasterxml/Zor/Zyi;)Z
    //   56: ifeq -> 87
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload_2
    //   67: aload_0
    //   68: aload_1
    //   69: invokespecial Zy : (Ljava/time/Duration;)Ljava/math/BigDecimal;
    //   72: invokevirtual ZI : (Ljava/math/BigDecimal;)V
    //   75: aload #4
    //   77: ifnull -> 122
    //   80: goto -> 87
    //   83: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   86: athrow
    //   87: aload_2
    //   88: aload_1
    //   89: invokevirtual toMillis : ()J
    //   92: invokevirtual Zw : (J)V
    //   95: aload #4
    //   97: ifnull -> 122
    //   100: goto -> 107
    //   103: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   106: athrow
    //   107: aload_2
    //   108: aload_1
    //   109: invokevirtual toString : ()Ljava/lang/String;
    //   112: invokevirtual ZD : (Ljava/lang/String;)V
    //   115: goto -> 122
    //   118: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   121: athrow
    //   122: return
    // Exception table:
    //   from	to	target	type
    //   5	20	23	java/io/IOException
    //   13	44	47	java/io/IOException
    //   27	59	62	java/io/IOException
    //   51	80	83	java/io/IOException
    //   66	100	103	java/io/IOException
    //   87	115	118	java/io/IOException
  }
  
  private BigDecimal Zy(Duration paramDuration) {
    int[] arrayOfInt = Zsy.Zm();
    if (paramDuration.isNegative()) {
      paramDuration = paramDuration.abs();
      BigDecimal bigDecimal = Zg4.ZL(paramDuration.getSeconds(), paramDuration.getNano()).negate();
      return (arrayOfInt != null) ? Zg4.ZL(paramDuration.getSeconds(), paramDuration.getNano()) : bigDecimal;
    } 
    return Zg4.ZL(paramDuration.getSeconds(), paramDuration.getNano());
  }
  
  protected Zl Zj(Zyi paramZyi) {
    return Za(paramZyi) ? (Zl(paramZyi) ? Zl.VALUE_NUMBER_FLOAT : Zl.VALUE_NUMBER_INT) : Zl.VALUE_STRING;
  }
  
  protected Zsu<?> ZF(Boolean paramBoolean1, Boolean paramBoolean2) {
    return new Zsi(this, this.Zt, paramBoolean2, this.ZE);
  }
  
  protected DateTimeFormatter Zs(Zyi paramZyi, Zgy paramZgy) {
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #77
    //   2: ldc 'v:#s"@/"!HYcP>!:H7]4)s\fGyns@1;&T7]4)3^&L+"0R'4)6% b {'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zsi.d : Ljava/lang/String;
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
    //   80: bipush #121
    //   82: goto -> 112
    //   85: bipush #22
    //   87: goto -> 112
    //   90: bipush #10
    //   92: goto -> 112
    //   95: bipush #30
    //   97: goto -> 112
    //   100: bipush #107
    //   102: goto -> 112
    //   105: bipush #51
    //   107: goto -> 112
    //   110: bipush #14
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
    //   154: new com/fasterxml/Zsi
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic com/fasterxml/Zsi.Zm : Lcom/fasterxml/Zsi;
    //   164: return
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zsi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */