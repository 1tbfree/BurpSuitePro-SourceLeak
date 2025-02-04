package com.fasterxml;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Zyn implements Zvs<Zqr>, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zyn ZG;
  
  protected final Set<String> Zi;
  
  private static final String a;
  
  protected Zyn(Set<String> paramSet) {
    this.Zi = paramSet;
  }
  
  public static Zyn Zf(Zqr paramZqr) {
    return (paramZqr == null) ? ZG : new Zyn(ZD(paramZqr.value()));
  }
  
  public static Zyn ZG() {
    return ZG;
  }
  
  public Set<String> ZU() {
    return this.Zi;
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.Zi });
  }
  
  public int hashCode() {
    return (this.Zi == null) ? 0 : this.Zi.size();
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject.getClass() == getClass() && ZT(this.Zi, ((Zyn)paramObject).Zi))));
  }
  
  private static boolean ZT(Set<String> paramSet1, Set<String> paramSet2) {
    return (paramSet1 == null) ? ((paramSet2 == null)) : paramSet1.equals(paramSet2);
  }
  
  private static Set<String> ZD(String[] paramArrayOfString) {
    String[] arrayOfString1 = Zgy.ZF();
    if (paramArrayOfString == null || paramArrayOfString.length == 0)
      return Collections.emptySet(); 
    HashSet<String> hashSet = new HashSet(paramArrayOfString.length);
    String[] arrayOfString2 = paramArrayOfString;
    int i = arrayOfString2.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString2[b];
      hashSet.add(str);
      b++;
      if (arrayOfString1 != null)
        break; 
    } 
    return hashSet;
  }
  
  static {
    // Byte code:
    //   0: bipush #21
    //   2: ldc 'l;j5J=a 9V-w:%\\bd\\t&~O&f\\t&3Bu z'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zyn.a : Ljava/lang/String;
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
    //   80: bipush #51
    //   82: goto -> 112
    //   85: bipush #93
    //   87: goto -> 112
    //   90: bipush #16
    //   92: goto -> 112
    //   95: bipush #112
    //   97: goto -> 112
    //   100: bipush #70
    //   102: goto -> 112
    //   105: bipush #117
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
    //   154: new com/fasterxml/Zyn
    //   157: dup
    //   158: aconst_null
    //   159: invokespecial <init> : (Ljava/util/Set;)V
    //   162: putstatic com/fasterxml/Zyn.ZG : Lcom/fasterxml/Zyn;
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */