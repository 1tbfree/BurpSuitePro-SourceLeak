package com.fasterxml.Zs;

import burp.Zbqc;
import com.fasterxml.Zgd;
import com.fasterxml.Zm.Zef;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zo.Zr;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zy9;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Zi5;
import com.fasterxml.Zoz.Zik;
import com.fasterxml.Zoz.Ziq;
import com.fasterxml.Zoz.Ziz;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class Zfm implements Zr, Serializable {
  private static final long serialVersionUID = 1L;
  
  private static final String a;
  
  public static Zf ZG(Zef paramZef1, Zef paramZef2, Zef paramZef3, Zef paramZef4) {
    return new Zw(paramZef1, null, paramZef2, paramZef3, paramZef4);
  }
  
  public static Zf Zu(Zef paramZef1, Ziq paramZiq, Zef paramZef2, Zef paramZef3, Zef paramZef4) {
    return new Zw(paramZef1, paramZiq, paramZef2, paramZef3, paramZef4);
  }
  
  public static Zf Zx(Zyc paramZyc, Zk paramZk, Zyo<?> paramZyo) {
    return new Zn(paramZk.Zf(), paramZyo);
  }
  
  public static Zf Zm(Zyc paramZyc, Zk paramZk) throws Zy_ {
    Zyv zyv = paramZyc.Zs(paramZk);
    Zi5<Zik, Zgd> zi5 = Zs(zyv);
    try {
      if (zi5 != null)
        try {
          if (zi5.Zt != null)
            return Zt(paramZyc, (Ziz)zi5.ZQ); 
        } catch (Zy_ zy_) {
          throw a(null);
        }  
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    List<Zi5<Ziq, Zgd>> list = zyv.Zc();
    list.removeIf(Zfm::lambda$findStringBasedKeyDeserializer$0);
    Ziq ziq = Zb(list);
    try {
      if (ziq != null)
        return Zt(paramZyc, (Ziz)ziq); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (zi5 != null)
        return Zt(paramZyc, (Ziz)zi5.ZQ); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (!list.isEmpty())
        return Zt(paramZyc, (Ziz)((Zi5)list.get(0)).ZQ); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return null;
  }
  
  private static Zf Zt(Zyc paramZyc, Ziz paramZiz) {
    if (paramZiz instanceof Zik) {
      Constructor<?> constructor = ((Zik)paramZiz).Zq();
      try {
        if (paramZyc.Zd())
          Zx.ZR(constructor, paramZyc.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)); 
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      return new Zo(constructor);
    } 
    Method method = ((Ziq)paramZiz).Zu();
    try {
      if (paramZyc.Zd())
        Zx.ZR(method, paramZyc.ZB(Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return new Zv(method);
  }
  
  private static Zi5<Zik, Zgd> Zs(Zyv paramZyv) {
    Iterator<Zi5> iterator = paramZyv.Zt().iterator();
    Zbqc[] arrayOfZbqc = Zl.Zn();
    while (iterator.hasNext()) {
      Zi5<Zik, Zgd> zi5 = iterator.next();
      Zik zik = (Zik)zi5.ZQ;
      try {
        if (zik.ZL() == 1)
          try {
            if (String.class == zik.ZP(0))
              return zi5; 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  private static Ziq Zb(List<Zi5<Ziq, Zgd>> paramList) throws Zy_ {
    Ziq ziq = null;
    Iterator<Zi5<Ziq, Zgd>> iterator = paramList.iterator();
    Zbqc[] arrayOfZbqc = Zl.Zn();
    while (iterator.hasNext()) {
      Zi5 zi5 = iterator.next();
      try {
        if (zi5.Zt != null)
          if (ziq == null) {
            ziq = (Ziq)zi5.ZQ;
            if (arrayOfZbqc != null) {
              Class clazz = ((Ziq)zi5.ZQ).ZE();
              throw new IllegalArgumentException(a + Zx.Za(clazz));
            } 
          } else {
            Class clazz = ((Ziq)zi5.ZQ).ZE();
            throw new IllegalArgumentException(a + Zx.Za(clazz));
          }  
      } catch (Zy_ zy_) {
        throw a(null);
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    return ziq;
  }
  
  public Zf ZX(Zk paramZk, Zyc paramZyc, Zyv paramZyv) throws Zy_ {
    Class<?> clazz = paramZk.Zf();
    if (clazz.isPrimitive())
      clazz = Zx.ZP(clazz); 
    return Zc.Zi(clazz);
  }
  
  private static boolean lambda$findStringBasedKeyDeserializer$0(Zi5 paramZi5) {
    try {
      if (((Ziq)paramZi5.ZQ).ZL() == 1)
        try {
          if (((Ziq)paramZi5.ZQ).ZP(0) == String.class) {
            try {
              if (paramZi5.Zt == Zgd.PROPERTIES);
            } catch (IllegalArgumentException illegalArgumentException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: ldc 'EiH<r'vH8 \`S@"p-DdD(>B`U#lbVdU#l;hU$q&C%Nl|'p D(>#C%I)>\\tU|SE)m'BlM%d'B%N>>6Iu'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zfm.a : Ljava/lang/String;
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
    //   80: bipush #75
    //   82: goto -> 112
    //   85: bipush #57
    //   87: goto -> 112
    //   90: bipush #12
    //   92: goto -> 112
    //   95: bipush #122
    //   97: goto -> 112
    //   100: bipush #40
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #23
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zfm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */