package com.fasterxml;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zj.Zq;
import com.fasterxml.Zj.Zx;
import com.fasterxml.Zo.Zi;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Zqx extends Zq4<Object> implements Zi {
  private static final long serialVersionUID = 1L;
  
  public static final Zyo<Period> ZV;
  
  public static final Zyo<ZoneId> ZE;
  
  public static final Zyo<ZoneOffset> Zq;
  
  protected final int ZI;
  
  private static final String g;
  
  protected Zqx(Class<?> paramClass, int paramInt) {
    super(paramClass);
    this.ZI = paramInt;
  }
  
  protected Zqx(Zqx paramZqx, Boolean paramBoolean) {
    super(paramZqx, paramBoolean);
    this.ZI = paramZqx.ZI;
  }
  
  protected static <T> Zyo<T> Zz(Class<T> paramClass, int paramInt) {
    return (Zyo<T>)new Zqx(paramClass, paramInt);
  }
  
  protected Zqx ZZ(Boolean paramBoolean) {
    try {
    
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      if (this.Zb == (!Boolean.FALSE.equals(paramBoolean)))
        return this; 
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    return new Zqx(this, paramBoolean);
  }
  
  public Zyo<?> Zq(Zyg paramZyg, Zo paramZo) throws Zy_ {
    Zgy zgy = Zx(paramZyg, paramZo, ZX());
    Zqx zqx = this;
    try {
      if (zgy != null && zgy.ZQ()) {
        Boolean bool = zgy.Zy();
        if (bool != null)
          zqx = ZZ(bool); 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyo<?>)zqx;
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    try {
      if (paramZg.ZL(Zl.VALUE_STRING))
        return ZK(paramZg, paramZyg, paramZg.ZR()); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.Zp())
        return ZK(paramZg, paramZyg, paramZyg.Zc(paramZg, (Zyo)this, ZX())); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.ZL(Zl.VALUE_EMBEDDED_OBJECT))
        return paramZg.ZO(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (paramZg.Zs())
        return ZF(paramZg, paramZyg); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    throw paramZyg.Zq(paramZg, ZX(), Zl.VALUE_STRING, null);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    Zl zl = paramZg.Zj();
    try {
      if (zl != null)
        try {
          if (zl.Zl())
            return deserialize(paramZg, paramZyg); 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramZt.Zy(paramZg, paramZyg);
  }
  
  protected Object ZK(Zg paramZg, Zyg paramZyg, String paramString) throws IOException {
    paramString = paramString.trim();
    if (paramString.length() == 0) {
      Zx zx = paramZyg.ZT(Zb(), this.ZC, Zq.EmptyString);
      try {
        if (zx == Zx.Fail)
          paramZyg.ZY((Zyo)this, g, new Object[] { Zu() }); 
      } catch (DateTimeException dateTimeException) {
        throw a(null);
      } 
      try {
        if (!ZK())
          return Zn(paramZg, paramZyg, Zl.VALUE_STRING); 
      } catch (DateTimeException dateTimeException) {
        throw a(null);
      } 
      try {
        if (zx == Zx.AsEmpty)
          return Zy(paramZyg); 
      } catch (DateTimeException dateTimeException) {
        throw a(null);
      } 
      return null;
    } 
    try {
      try {
        switch (this.ZI) {
          case 1:
            return Period.parse(paramString);
          case 2:
            return ZoneId.of(paramString);
          case 3:
            return ZoneOffset.of(paramString);
        } 
      } catch (DateTimeException dateTimeException) {
        return Z_(paramZyg, dateTimeException, paramString);
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: ldc 'wap eWo{\\feQmnA@rw\\bAm"7Kes>C\\r1cqe]f> 'Xip\\fO*Qr} eAsw\\bA%wo{\\f\\b*ZCq\\t\\b"T)'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zqx.g : Ljava/lang/String;
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
    //   80: bipush #8
    //   82: goto -> 112
    //   85: bipush #60
    //   87: goto -> 112
    //   90: bipush #34
    //   92: goto -> 112
    //   95: bipush #87
    //   97: goto -> 112
    //   100: bipush #83
    //   102: goto -> 112
    //   105: bipush #93
    //   107: goto -> 112
    //   110: bipush #121
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
    //   154: ldc java/time/Period
    //   156: iconst_1
    //   157: invokestatic Zz : (Ljava/lang/Class;I)Lcom/fasterxml/Zor/Zyo;
    //   160: putstatic com/fasterxml/Zqx.ZV : Lcom/fasterxml/Zor/Zyo;
    //   163: ldc java/time/ZoneId
    //   165: iconst_2
    //   166: invokestatic Zz : (Ljava/lang/Class;I)Lcom/fasterxml/Zor/Zyo;
    //   169: putstatic com/fasterxml/Zqx.ZE : Lcom/fasterxml/Zor/Zyo;
    //   172: ldc java/time/ZoneOffset
    //   174: iconst_3
    //   175: invokestatic Zz : (Ljava/lang/Class;I)Lcom/fasterxml/Zor/Zyo;
    //   178: putstatic com/fasterxml/Zqx.Zq : Lcom/fasterxml/Zor/Zyo;
    //   181: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zqx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */