package com.fasterxml.Zs;

import com.fasterxml.Zor.Zyo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class Zf {
  private static final HashSet<String> Zt;
  
  public static Zyo<?> Zh(Class<?> paramClass, String paramString) {
    if (Zt.contains(paramString)) {
      if (paramClass == Calendar.class)
        return new Zuw(); 
      if (paramClass == Date.class)
        return Zuq.Zf; 
      if (paramClass == GregorianCalendar.class)
        return new Zuw((Class)GregorianCalendar.class); 
    } 
    return null;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'VS1|+X[3*IVS1|+X[32ISD"VS1|+X[ ;KEL1<MRK43,'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #14
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #26
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 215
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 188
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #119
    //   142: goto -> 172
    //   145: bipush #45
    //   147: goto -> 172
    //   150: bipush #63
    //   152: goto -> 172
    //   155: bipush #74
    //   157: goto -> 172
    //   160: bipush #72
    //   162: goto -> 172
    //   165: bipush #68
    //   167: goto -> 172
    //   170: bipush #54
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 93
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 89
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 39
    //   215: new java/util/HashSet
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: putstatic com/fasterxml/Zs/Zf.Zt : Ljava/util/HashSet;
    //   225: getstatic com/fasterxml/Zs/Zf.Zt : Ljava/util/HashSet;
    //   228: aload_0
    //   229: iconst_1
    //   230: aaload
    //   231: invokevirtual add : (Ljava/lang/Object;)Z
    //   234: pop
    //   235: getstatic com/fasterxml/Zs/Zf.Zt : Ljava/util/HashSet;
    //   238: aload_0
    //   239: iconst_2
    //   240: aaload
    //   241: invokevirtual add : (Ljava/lang/Object;)Z
    //   244: pop
    //   245: getstatic com/fasterxml/Zs/Zf.Zt : Ljava/util/HashSet;
    //   248: aload_0
    //   249: iconst_0
    //   250: aaload
    //   251: invokevirtual add : (Ljava/lang/Object;)Z
    //   254: pop
    //   255: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */