package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zb.Za;
import com.fasterxml.Zb.Zmt;
import com.fasterxml.Zor.Zb;
import java.net.URL;

public class Zh {
  private final URL ZR;
  
  private final String Zo;
  
  private final String ZH;
  
  private Zb Zw;
  
  private Object ZA;
  
  private static int[] ZS;
  
  private static final String a;
  
  Zh(URL paramURL, String paramString1, String paramString2) {
    this.ZR = paramURL;
    this.Zo = paramString1;
    this.ZH = paramString2;
    this.Zw = null;
    int[] arrayOfInt = Zy();
    try {
      if (Zbqc.Zwu() == null)
        ZZ(new int[2]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  URL ZW() {
    return this.ZR;
  }
  
  public String ZE() {
    return this.Zo;
  }
  
  public String Zp() {
    return this.ZH;
  }
  
  void Zo(Zb paramZb) {
    this.Zw = paramZb;
  }
  
  public <T> T Zg(Class<T> paramClass) throws Zau {
    try {
      if (this.ZA != null)
        try {
          if (this.ZA.getClass().equals(paramClass))
            return (T)this.ZA; 
          try {
            this.ZA = Zpl.Zo.Zi((Za)this.Zw, paramClass);
            return (T)this.ZA;
          } catch (Zmt|RuntimeException zmt) {
            throw new Zau(String.format(a, new Object[] { this.ZH, paramClass.getSimpleName() }), zmt);
          } 
        } catch (Zau zau) {
          throw a(null);
        }  
    } catch (Zmt zmt) {
      throw a(null);
    } 
    try {
      this.ZA = Zpl.Zo.Zi((Za)this.Zw, paramClass);
      return (T)this.ZA;
    } catch (Zmt|RuntimeException zmt) {
      throw new Zau(String.format(a, new Object[] { this.ZH, paramClass.getSimpleName() }), zmt);
    } 
  }
  
  public static void ZZ(int[] paramArrayOfint) {
    ZS = paramArrayOfint;
  }
  
  public static int[] Zy() {
    return ZS;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zy : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_5
    //   7: newarray int
    //   9: invokestatic ZZ : ([I)V
    //   12: bipush #103
    //   14: ldc '{8< .NZ9}/;N\3;'. M3}eV8I52,. Zv*+#NM:<1 kI%zl'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic org/openapi4j/Zh.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #73
    //   94: goto -> 124
    //   97: bipush #49
    //   99: goto -> 124
    //   102: bipush #58
    //   104: goto -> 124
    //   107: bipush #37
    //   109: goto -> 124
    //   112: bipush #20
    //   114: goto -> 124
    //   117: bipush #44
    //   119: goto -> 124
    //   122: bipush #9
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */