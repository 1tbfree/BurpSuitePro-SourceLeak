package net.portswigger.devtools.client.impl;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.portswigger.Ztj;
import net.portswigger.devtools.protocol.ChromeDevTools;

public class Zm0 {
  private static final Class<?>[] Ze;
  
  private static final Ztj ZY;
  
  private static final Ztj ZV;
  
  private static final Map<Zof, Zmm> ZJ;
  
  private static final String a;
  
  public static Ztj Zg() {
    return ZY;
  }
  
  public static Ztj Zt() {
    return ZV;
  }
  
  static Map<Zof, Zmm> ZE() {
    return ZJ;
  }
  
  private static Map<Zof, Zmm> ZQ() {
    HashMap<Object, Object> hashMap = new HashMap<>();
    for (Method method : ChromeDevTools.class.getDeclaredMethods()) {
      Class<?> clazz = method.getReturnType();
      for (Method method1 : clazz.getDeclaredMethods()) {
        Zmm zmm1 = Zmm.Zg(method1);
        Zmm zmm2 = (Zmm)hashMap.put(zmm1.name(), zmm1);
        if (zmm2 != null && !zmm2.Za().equals(zmm1.Za()))
          throw new AssertionError(a + a); 
      } 
    } 
    return (Map)hashMap;
  }
  
  private static Class<?>[] Zl(Class<?>[] paramArrayOfClass1, Class<?>[] paramArrayOfClass2) {
    Class[] arrayOfClass = (Class[])Arrays.<Class<?>[]>copyOf((Class<?>[][])paramArrayOfClass1, paramArrayOfClass1.length + paramArrayOfClass2.length);
    System.arraycopy(paramArrayOfClass2, 0, arrayOfClass, paramArrayOfClass1.length, paramArrayOfClass2.length);
    return arrayOfClass;
  }
  
  static {
    // Byte code:
    //   0: bipush #19
    //   2: ldc 'wm?5WSb?9CRj*$RS~.# .81^_|$$\.&5G.'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zm0.a : Ljava/lang/String;
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
    //   80: bipush #32
    //   82: goto -> 112
    //   85: bipush #96
    //   87: goto -> 112
    //   90: bipush #108
    //   92: goto -> 112
    //   95: bipush #97
    //   97: goto -> 112
    //   100: bipush #29
    //   102: goto -> 112
    //   105: bipush #88
    //   107: goto -> 112
    //   110: bipush #67
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
    //   154: iconst_1
    //   155: anewarray java/lang/Class
    //   158: dup
    //   159: iconst_0
    //   160: ldc net/portswigger/devtools/client/impl/Zx_
    //   162: aastore
    //   163: putstatic net/portswigger/devtools/client/impl/Zm0.Ze : [Ljava/lang/Class;
    //   166: invokestatic Zg : ()[Ljava/lang/Class;
    //   169: invokestatic ZI : ([Ljava/lang/reflect/Type;)Lnet/portswigger/Ztj;
    //   172: putstatic net/portswigger/devtools/client/impl/Zm0.ZY : Lnet/portswigger/Ztj;
    //   175: getstatic net/portswigger/devtools/client/impl/Zm0.Ze : [Ljava/lang/Class;
    //   178: invokestatic Zg : ()[Ljava/lang/Class;
    //   181: invokestatic Zl : ([Ljava/lang/Class;[Ljava/lang/Class;)[Ljava/lang/Class;
    //   184: invokestatic ZI : ([Ljava/lang/reflect/Type;)Lnet/portswigger/Ztj;
    //   187: putstatic net/portswigger/devtools/client/impl/Zm0.ZV : Lnet/portswigger/Ztj;
    //   190: invokestatic ZQ : ()Ljava/util/Map;
    //   193: putstatic net/portswigger/devtools/client/impl/Zm0.ZJ : Ljava/util/Map;
    //   196: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zm0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */