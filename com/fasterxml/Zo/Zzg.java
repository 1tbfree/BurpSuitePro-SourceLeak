package com.fasterxml.Zo;

import com.fasterxml.Zgy;
import com.fasterxml.Zh.Ze;
import com.fasterxml.Zh.Zf;
import com.fasterxml.Zh.Zg;
import com.fasterxml.Zh.Zn;
import com.fasterxml.Zh.Zo;
import com.fasterxml.Zh.Zs;
import com.fasterxml.Zj.Zf;
import com.fasterxml.Zm.Zet;
import com.fasterxml.Zm.Zu;
import com.fasterxml.Zm.Zv;
import com.fasterxml.Zm.Zx;
import com.fasterxml.Zor.Zb;
import com.fasterxml.Zor.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zt;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyf;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Ziv;
import com.fasterxml.Zqi;
import com.fasterxml.Zs.Zum;
import java.io.Serializable;
import java.util.HashMap;

public final class Zzg implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zet<Zk, Zyo<Object>> Zr;
  
  protected final HashMap<Zk, Zyo<Object>> ZR = new HashMap<>(8);
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzg() {
    this(2000);
  }
  
  public Zzg(int paramInt) {
    this((Zet<Zk, Zyo<Object>>)new Zu(Math.min(64, paramInt >> 2), paramInt));
  }
  
  public Zzg(Zet<Zk, Zyo<Object>> paramZet) {
    this.Zr = paramZet;
  }
  
  Object writeReplace() {
    this.ZR.clear();
    return this;
  }
  
  public Zyo<Object> ZX(Zyg paramZyg, Zz paramZz, Zk paramZk) throws Zy_ {
    Zyo<Object> zyo = ZE(paramZk);
    if (zyo == null) {
      zyo = ZO(paramZyg, paramZz, paramZk);
      if (zyo == null)
        zyo = Zo(paramZyg, paramZk); 
    } 
    return zyo;
  }
  
  public Zf Zu(Zyg paramZyg, Zz paramZz, Zk paramZk) throws Zy_ {
    Zf zf = paramZz.ZC(paramZyg, paramZk);
    try {
      if (zf == null)
        return Zq(paramZyg, paramZk); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (zf instanceof Zq)
        ((Zq)zf).Zs(paramZyg); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zf;
  }
  
  protected Zyo<Object> ZE(Zk paramZk) {
    try {
      if (paramZk == null)
        throw new IllegalArgumentException(a(25667, -20532)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (Zh(paramZk))
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (Zyo<Object>)this.Zr.ZM(paramZk);
  }
  
  protected Zyo<Object> ZO(Zyg paramZyg, Zz paramZz, Zk paramZk) throws Zy_ {
    synchronized (this.ZR) {
      Zyo<Object> zyo = ZE(paramZk);
      if (zyo != null)
        return zyo; 
      int i = this.ZR.size();
      if (i > 0) {
        zyo = this.ZR.get(paramZk);
        if (zyo != null)
          return zyo; 
      } 
      try {
        return Zi(paramZyg, paramZz, paramZk);
      } finally {
        try {
          if (i == 0)
            try {
              if (this.ZR.size() > 0)
                this.ZR.clear(); 
            } catch (Zy_ zy_) {
              throw a(null);
            }  
        } catch (Zy_ zy_) {
          throw a(null);
        } 
      } 
    } 
  }
  
  protected Zyo<Object> Zi(Zyg paramZyg, Zz paramZz, Zk paramZk) throws Zy_ {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokevirtual Ze : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zo/Zz;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyo;
    //   7: astore #4
    //   9: goto -> 28
    //   12: astore #5
    //   14: aload_1
    //   15: aload_3
    //   16: aload #5
    //   18: invokestatic Zr : (Ljava/lang/Throwable;)Ljava/lang/String;
    //   21: invokevirtual Zm : (Lcom/fasterxml/Zor/Zk;Ljava/lang/String;)Ljava/lang/Object;
    //   24: pop
    //   25: aconst_null
    //   26: astore #4
    //   28: aload #4
    //   30: ifnonnull -> 39
    //   33: aconst_null
    //   34: areturn
    //   35: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   38: athrow
    //   39: aload_0
    //   40: aload_3
    //   41: invokespecial Zh : (Lcom/fasterxml/Zor/Zk;)Z
    //   44: ifne -> 70
    //   47: aload #4
    //   49: invokevirtual Zs : ()Z
    //   52: ifeq -> 70
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: iconst_1
    //   63: goto -> 71
    //   66: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   69: athrow
    //   70: iconst_0
    //   71: istore #5
    //   73: aload #4
    //   75: instanceof com/fasterxml/Zo/Zq
    //   78: ifeq -> 129
    //   81: aload_0
    //   82: getfield ZR : Ljava/util/HashMap;
    //   85: aload_3
    //   86: aload #4
    //   88: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   91: pop
    //   92: aload #4
    //   94: checkcast com/fasterxml/Zo/Zq
    //   97: aload_1
    //   98: invokeinterface Zs : (Lcom/fasterxml/Zor/Zyg;)V
    //   103: aload_0
    //   104: getfield ZR : Ljava/util/HashMap;
    //   107: aload_3
    //   108: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   111: pop
    //   112: goto -> 129
    //   115: astore #6
    //   117: aload_0
    //   118: getfield ZR : Ljava/util/HashMap;
    //   121: aload_3
    //   122: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   125: pop
    //   126: aload #6
    //   128: athrow
    //   129: iload #5
    //   131: ifeq -> 154
    //   134: aload_0
    //   135: getfield Zr : Lcom/fasterxml/Zm/Zet;
    //   138: aload_3
    //   139: aload #4
    //   141: invokeinterface Zm : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: pop
    //   147: goto -> 154
    //   150: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload #4
    //   156: areturn
    // Exception table:
    //   from	to	target	type
    //   0	9	12	java/lang/IllegalArgumentException
    //   28	35	35	java/lang/IllegalArgumentException
    //   39	55	58	java/lang/IllegalArgumentException
    //   47	66	66	java/lang/IllegalArgumentException
    //   92	103	115	finally
    //   115	117	115	finally
    //   129	147	150	java/lang/IllegalArgumentException
  }
  
  protected Zyo<Object> Ze(Zyg paramZyg, Zz paramZz, Zk paramZk) throws Zy_ {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual Za : ()Lcom/fasterxml/Zor/Zyc;
    //   4: astore #4
    //   6: aload_3
    //   7: invokevirtual ZV : ()Z
    //   10: ifne -> 41
    //   13: aload_3
    //   14: invokevirtual Zh : ()Z
    //   17: ifne -> 41
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   26: athrow
    //   27: aload_3
    //   28: invokevirtual Za : ()Z
    //   31: ifeq -> 49
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   40: athrow
    //   41: aload_2
    //   42: aload #4
    //   44: aload_3
    //   45: invokevirtual Zb : (Lcom/fasterxml/Zor/Zyc;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zk;
    //   48: astore_3
    //   49: aload #4
    //   51: aload_3
    //   52: invokevirtual ZA : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyv;
    //   55: astore #5
    //   57: aload_0
    //   58: aload_1
    //   59: aload #5
    //   61: invokevirtual Zo : ()Lcom/fasterxml/Zoz/Zia;
    //   64: invokevirtual Zs : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zoz/Ziv;)Lcom/fasterxml/Zor/Zyo;
    //   67: astore #6
    //   69: aload #6
    //   71: ifnull -> 81
    //   74: aload #6
    //   76: areturn
    //   77: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   80: athrow
    //   81: aload_0
    //   82: aload_1
    //   83: aload #5
    //   85: invokevirtual Zo : ()Lcom/fasterxml/Zoz/Zia;
    //   88: aload_3
    //   89: invokespecial Zn : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zoz/Ziv;Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zk;
    //   92: astore #7
    //   94: aload #7
    //   96: aload_3
    //   97: if_acmpeq -> 112
    //   100: aload #7
    //   102: astore_3
    //   103: aload #4
    //   105: aload #7
    //   107: invokevirtual ZA : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyv;
    //   110: astore #5
    //   112: aload #5
    //   114: invokevirtual ZD : ()Ljava/lang/Class;
    //   117: astore #8
    //   119: aload #8
    //   121: ifnull -> 139
    //   124: aload_2
    //   125: aload_1
    //   126: aload_3
    //   127: aload #5
    //   129: aload #8
    //   131: invokevirtual ZJ : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyv;Ljava/lang/Class;)Lcom/fasterxml/Zor/Zyo;
    //   134: areturn
    //   135: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   138: athrow
    //   139: aload #5
    //   141: invokevirtual Zv : ()Lcom/fasterxml/Zm/Zv;
    //   144: astore #9
    //   146: aload #9
    //   148: ifnull -> 207
    //   151: aload #9
    //   153: aload_1
    //   154: invokevirtual ZL : ()Lcom/fasterxml/Zh/Zi;
    //   157: invokeinterface ZD : (Lcom/fasterxml/Zh/Zi;)Lcom/fasterxml/Zor/Zk;
    //   162: astore #10
    //   164: aload #10
    //   166: aload_3
    //   167: invokevirtual Zf : ()Ljava/lang/Class;
    //   170: invokevirtual ZP : (Ljava/lang/Class;)Z
    //   173: ifne -> 185
    //   176: aload #4
    //   178: aload #10
    //   180: invokevirtual ZA : (Lcom/fasterxml/Zor/Zk;)Lcom/fasterxml/Zor/Zyv;
    //   183: astore #5
    //   185: new com/fasterxml/Zs/Zum
    //   188: dup
    //   189: aload #9
    //   191: aload #10
    //   193: aload_0
    //   194: aload_1
    //   195: aload_2
    //   196: aload #10
    //   198: aload #5
    //   200: invokevirtual Zr : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zo/Zz;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyv;)Lcom/fasterxml/Zor/Zyo;
    //   203: invokespecial <init> : (Lcom/fasterxml/Zm/Zv;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyo;)V
    //   206: areturn
    //   207: aload_0
    //   208: aload_1
    //   209: aload_2
    //   210: aload_3
    //   211: aload #5
    //   213: invokevirtual Zr : (Lcom/fasterxml/Zor/Zyg;Lcom/fasterxml/Zo/Zz;Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zor/Zyv;)Lcom/fasterxml/Zor/Zyo;
    //   216: areturn
    // Exception table:
    //   from	to	target	type
    //   6	20	23	com/fasterxml/Zor/Zy_
    //   13	34	37	com/fasterxml/Zor/Zy_
    //   69	77	77	com/fasterxml/Zor/Zy_
    //   119	135	135	com/fasterxml/Zor/Zy_
  }
  
  protected Zyo<?> Zr(Zyg paramZyg, Zz paramZz, Zk paramZk, Zyv paramZyv) throws Zy_ {
    Zyc zyc = paramZyg.Za();
    try {
      if (paramZk.ZF())
        return paramZz.Zh(paramZyg, paramZk, paramZyv); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (paramZk.ZH()) {
        try {
          if (paramZk.ZC())
            return paramZz.ZU(paramZyg, (Zg)paramZk, paramZyv); 
        } catch (Zy_ zy_) {
          throw a(null);
        } 
        if (paramZk.Zh()) {
          Zgy zgy = paramZyv.ZX();
          if (zgy.ZI() != Zqi.OBJECT) {
            Zo zo = (Zo)paramZk;
            try {
              if (zo instanceof Zf)
                return paramZz.Zj(paramZyg, (Zf)zo, paramZyv); 
            } catch (Zy_ zy_) {
              throw a(null);
            } 
            return paramZz.Zz(paramZyg, zo, paramZyv);
          } 
        } 
        if (paramZk.Za()) {
          Zgy zgy = paramZyv.ZX();
          if (zgy.ZI() != Zqi.OBJECT) {
            Ze ze = (Ze)paramZk;
            try {
              if (ze instanceof Zs)
                return paramZz.Zy(paramZyg, (Zs)ze, paramZyv); 
            } catch (Zy_ zy_) {
              throw a(null);
            } 
            return paramZz.Zk(paramZyg, ze, paramZyv);
          } 
        } 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (paramZk.ZP())
        return paramZz.ZF(paramZyg, (Zn)paramZk, paramZyv); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    try {
      if (Zb.class.isAssignableFrom(paramZk.Zf()))
        return paramZz.Zx(zyc, paramZk, paramZyv); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return paramZz.ZQ(paramZyg, paramZk, paramZyv);
  }
  
  protected Zyo<Object> Zs(Zyg paramZyg, Ziv paramZiv) throws Zy_ {
    Object object = paramZyg.Zv().Zs(paramZiv);
    try {
      if (object == null)
        return null; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zyo<Object> zyo = paramZyg.ZM(paramZiv, object);
    return ZX(paramZyg, paramZiv, zyo);
  }
  
  protected Zyo<Object> ZX(Zyg paramZyg, Ziv paramZiv, Zyo<Object> paramZyo) throws Zy_ {
    Zv<Object, Object> zv = ZN(paramZyg, paramZiv);
    try {
      if (zv == null)
        return paramZyo; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    Zk zk = zv.ZD(paramZyg.ZL());
    return (Zyo<Object>)new Zum(zv, zk, paramZyo);
  }
  
  protected Zv<Object, Object> ZN(Zyg paramZyg, Ziv paramZiv) throws Zy_ {
    Object object = paramZyg.Zv().Zw(paramZiv);
    try {
      if (object == null)
        return null; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return paramZyg.ZS(paramZiv, object);
  }
  
  private Zk Zn(Zyg paramZyg, Ziv paramZiv, Zk paramZk) throws Zy_ {
    Zo zo;
    Zt zt = paramZyg.Zv();
    try {
      if (zt == null)
        return paramZk; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    if (paramZk.Zh()) {
      Zk zk1 = paramZk.Zu();
      try {
        if (zk1 != null && zk1.ZY() == null) {
          Object object = zt.ZZ(paramZiv);
          if (object != null) {
            Zf zf = paramZyg.Zx(paramZiv, object);
            if (zf != null)
              zo = ((Zo)paramZk).ZO(zf); 
          } 
        } 
      } catch (Zy_ zy_) {
        throw a(null);
      } 
    } 
    Zk zk = zo.ZB();
    try {
      if (zk != null && zk.ZY() == null) {
        Object object = zt.Zg(paramZiv);
        if (object != null) {
          Zyo zyo = null;
          if (object instanceof Zyo) {
            zyo = (Zyo)object;
          } else {
            Class<?> clazz = ZZ(object, a(25664, -25301), Zyf.class);
            if (clazz != null)
              zyo = paramZyg.ZM(paramZiv, clazz); 
          } 
          if (zyo != null)
            null = zo.Zw(zyo); 
        } 
      } 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return zt.ZL((Zf)paramZyg.Za(), paramZiv, null);
  }
  
  private boolean Zh(Zk paramZk) {
    if (paramZk.ZH()) {
      Zk zk = paramZk.ZB();
      try {
        if (zk != null)
          try {
            if (zk.ZY() == null) {
              try {
                if (zk.Zi() != null)
                  return true; 
              } catch (IllegalArgumentException illegalArgumentException) {
                throw a(null);
              } 
            } else {
              return true;
            } 
          } catch (IllegalArgumentException illegalArgumentException) {
            throw a(null);
          }  
      } catch (IllegalArgumentException illegalArgumentException) {
        throw a(null);
      } 
      if (paramZk.Zh()) {
        Zk zk1 = paramZk.Zu();
        try {
          if (zk1.ZY() != null)
            return true; 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        } 
      } 
    } 
    return false;
  }
  
  private Class<?> ZZ(Object paramObject, String paramString, Class<?> paramClass) {
    try {
      if (paramObject == null)
        return null; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    try {
      if (!(paramObject instanceof Class))
        throw new IllegalStateException(a(25665, 21272) + paramString + a(25670, 5218) + paramObject.getClass().getName() + a(25669, -26827)); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Class<?> clazz = (Class)paramObject;
    try {
      if (clazz != paramClass)
        try {
          return !Zx.Zu(clazz) ? clazz : null;
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return null;
  }
  
  protected Zyo<Object> Zo(Zyg paramZyg, Zk paramZk) throws Zy_ {
    Class clazz = paramZk.Zf();
    try {
      if (!Zx.Zv(clazz))
        return (Zyo<Object>)paramZyg.Zm(paramZk, a(25666, -3032) + paramZk); 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    return (Zyo<Object>)paramZyg.Zm(paramZk, a(25668, 29280) + paramZk);
  }
  
  protected Zf Zq(Zyg paramZyg, Zk paramZk) throws Zy_ {
    return (Zf)paramZyg.Zm(paramZk, a(25671, -20153) + paramZk);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'u«Àk¢A©]\6^r¤è3©åõ6\\t\\nºnD:Ê?~^­·CËA¿ó-ßu\\n®Ó\\b¸-×}ê»J¬Ï`#£Ý,Ò?L &»¦ÁG`!Fõ®<ìI Aù³?ºåó­j)Uòo{<Å.Jè¢û<PÆ ~^:z_%g(*`¸ÎÏX¦|Qõbib¤&c°«ÁO÷ÜLçå¬Ï«°Ú<d4'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #83
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'Fä9YÉ]¶]FÄcÈ»éCc-%=h\\r´è8è×YÐ¦í À<Û(ÃµRÄ®ÈÉà1XøpSF*\\flgVÐòî»IÈ!R=·4æÎLå#Ò¬æ |á!|.Xé°'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #63
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #51
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic com/fasterxml/Zo/Zzg.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic com/fasterxml/Zo/Zzg.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #102
    //   214: goto -> 244
    //   217: bipush #124
    //   219: goto -> 244
    //   222: bipush #112
    //   224: goto -> 244
    //   227: bipush #31
    //   229: goto -> 244
    //   232: bipush #76
    //   234: goto -> 244
    //   237: bipush #93
    //   239: goto -> 244
    //   242: bipush #57
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6443) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = '­';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zzg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */