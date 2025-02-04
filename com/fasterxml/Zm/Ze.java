package com.fasterxml.Zm;

import com.fasterxml.Zb.Zj;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zj.Zj;
import com.fasterxml.Zj.Zz;
import com.fasterxml.Zor.Zp;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zoz.Zia;
import java.io.Serializable;

public final class Ze implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private final Class<Enum<?>> Zn;
  
  private final Enum<?>[] Zl;
  
  private final Zj[] ZL;
  
  private static final String a;
  
  private Ze(Class<Enum<?>> paramClass, Zj[] paramArrayOfZj) {
    this.Zn = paramClass;
    this.Zl = paramClass.getEnumConstants();
    this.ZL = paramArrayOfZj;
  }
  
  public static Ze Zk(Zf<?> paramZf, Zia paramZia) {
    Zt zt = paramZf.ZK();
    boolean bool = paramZf.ZV((Zz)Zj.WRITE_ENUMS_TO_LOWERCASE);
    Class<?> clazz = paramZia.ZN();
    int i = Zx.Zo();
    Class<Enum<?>> clazz1 = ZY(clazz);
    Enum[] arrayOfEnum = (Enum[])ZJ(clazz);
    String[] arrayOfString = zt.ZH(paramZf, paramZia, arrayOfEnum, new String[arrayOfEnum.length]);
    Zj[] arrayOfZj = new Zj[arrayOfEnum.length];
    byte b = 0;
    int j = arrayOfEnum.length;
    while (b < j) {
      Enum enum_ = arrayOfEnum[b];
      String str = arrayOfString[b];
      if (str == null)
        str = enum_.name(); 
      if (bool)
        str = str.toLowerCase(); 
      arrayOfZj[enum_.ordinal()] = paramZf.ZT(str);
      b++;
      if (i == 0)
        break; 
    } 
    return Zm(clazz1, arrayOfZj);
  }
  
  public static Ze ZB(Zf<?> paramZf, Zia paramZia) {
    Zt zt = paramZf.ZK();
    boolean bool = paramZf.ZV((Zz)Zj.WRITE_ENUMS_TO_LOWERCASE);
    Class<?> clazz = paramZia.ZN();
    Class<Enum<?>> clazz1 = ZY(clazz);
    Enum[] arrayOfEnum = (Enum[])ZJ(clazz);
    String[] arrayOfString = new String[arrayOfEnum.length];
    int i = Zx.ZY();
    try {
      if (zt != null)
        zt.ZH(paramZf, paramZia, arrayOfEnum, arrayOfString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zj[] arrayOfZj = new Zj[arrayOfEnum.length];
    byte b = 0;
    while (b < arrayOfEnum.length) {
      String str = arrayOfString[b];
      if (str == null) {
        Enum enum_ = arrayOfEnum[b];
        str = enum_.toString();
        if (str == null)
          str = ""; 
      } 
      if (bool)
        str = str.toLowerCase(); 
      arrayOfZj[b] = paramZf.ZT(str);
      b++;
      if (i != 0)
        break; 
    } 
    return Zm(clazz1, arrayOfZj);
  }
  
  public static Ze ZK(Zf<?> paramZf, Zia paramZia, Zp paramZp) {
    Zt zt = paramZf.ZK();
    int i = Zx.Zo();
    boolean bool = paramZf.ZV((Zz)Zj.WRITE_ENUMS_TO_LOWERCASE);
    Class<?> clazz = paramZia.ZN();
    Class<Enum<?>> clazz1 = ZY(clazz);
    Enum[] arrayOfEnum = (Enum[])ZJ(clazz);
    String[] arrayOfString = new String[arrayOfEnum.length];
    try {
      if (zt != null)
        zt.ZH(paramZf, paramZia, arrayOfEnum, arrayOfString); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zj[] arrayOfZj = new Zj[arrayOfEnum.length];
    byte b = 0;
    int j = arrayOfEnum.length;
    while (b < j) {
      Enum enum_ = arrayOfEnum[b];
      String str = arrayOfString[b];
      if (str == null)
        str = paramZp.Zv(enum_.name()); 
      if (bool)
        str = str.toLowerCase(); 
      arrayOfZj[b] = paramZf.ZT(str);
      b++;
      if (i == 0)
        break; 
    } 
    return Zm(clazz1, arrayOfZj);
  }
  
  public static Ze Zm(Class<Enum<?>> paramClass, Zj[] paramArrayOfZj) {
    return new Ze(paramClass, paramArrayOfZj);
  }
  
  protected static Class<Enum<?>> ZY(Class<?> paramClass) {
    return (Class)paramClass;
  }
  
  protected static Enum<?>[] ZJ(Class<?> paramClass) {
    Enum[] arrayOfEnum = (Enum[])Zx.ZI(paramClass).getEnumConstants();
    try {
      if (arrayOfEnum == null)
        throw new IllegalArgumentException(a + paramClass.getName()); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Enum<?>[])arrayOfEnum;
  }
  
  public Zj Zy(Enum<?> paramEnum) {
    return this.ZL[paramEnum.ordinal()];
  }
  
  public Class<Enum<?>> Zh() {
    return this.Zn;
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc '\\f??6mMMb3p=pLA,$lseWRb3s2pK '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zm/Ze.a : Ljava/lang/String;
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
    //   80: bipush #12
    //   82: goto -> 112
    //   85: bipush #30
    //   87: goto -> 112
    //   90: bipush #81
    //   92: goto -> 112
    //   95: bipush #29
    //   97: goto -> 112
    //   100: bipush #77
    //   102: goto -> 112
    //   105: bipush #118
    //   107: goto -> 112
    //   110: bipush #110
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */