package com.fasterxml;

import burp.Zbqc;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.time.DateTimeException;

abstract class Zg7 extends Zf {
  private static final String a;
  
  public final Object Z_(String paramString, Zyg paramZyg) throws IOException {
    try {
      if ("".equals(paramString))
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return Ze(paramString, paramZyg);
  }
  
  protected abstract Object Ze(String paramString, Zyg paramZyg) throws IOException;
  
  protected <T> T ZA(Zyg paramZyg, Class<?> paramClass, DateTimeException paramDateTimeException, String paramString) throws IOException {
    Zbqc[] arrayOfZbqc = Zgi.ZV();
    try {
      try {
        if (arrayOfZbqc == null)
          Zbqc.Zr(new Zbqc[3]); 
        return (T)paramZyg.Zk(paramClass, paramString, a, new Object[] { paramClass.getName(), paramDateTimeException.getClass().getName(), paramDateTimeException.getMessage() });
      } catch (Zy_ zy_) {
        zy_.initCause(paramDateTimeException);
        throw zy_;
      } catch (IOException iOException) {}
    } catch (DateTimeException dateTimeException) {
      throw a(null);
    } 
    try {
      if (null == iOException.getCause())
        iOException.initCause(paramDateTimeException); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    throw Zy_.ZG(iOException);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #70
    //   2: ldc '\\f*\\tyZl >$@qZ{E8"yVrEjn/ 9b@0L'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zg7.a : Ljava/lang/String;
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
    //   85: bipush #13
    //   87: goto -> 112
    //   90: bipush #38
    //   92: goto -> 112
    //   95: bipush #83
    //   97: goto -> 112
    //   100: bipush #121
    //   102: goto -> 112
    //   105: bipush #78
    //   107: goto -> 112
    //   110: bipush #102
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zg7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */