package burp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zgxq {
  private final Set<Zepq> ZV;
  
  private static final String a;
  
  Zgxq(Set<Zepq> paramSet) {
    this.ZV = new HashSet<>(paramSet);
  }
  
  static Zgxq Zq(Long paramLong) {
    String str = Zs_g.Zq();
    if (paramLong == null)
      paramLong = Long.valueOf(0L); 
    HashSet<Zepq> hashSet = new HashSet();
    byte b = 0;
    while (b < 64) {
      if ((paramLong.longValue() & 1L << b) != 0L)
        hashSet.add(new Zepq(b)); 
      b++;
      if (str != null)
        break; 
    } 
    return new Zgxq(hashSet);
  }
  
  long ZB() {
    long l = 0L;
    Iterator<Zepq> iterator = this.ZV.iterator();
    String str = Zs_g.Zq();
    while (iterator.hasNext()) {
      Zepq zepq = iterator.next();
      l |= 1L << zepq.Z_();
      if (str != null)
        break; 
    } 
    return l;
  }
  
  boolean ZS(Zepq paramZepq) {
    Zuh.Zb((paramZepq.Z_() < 64), Zqf.Zk);
    return this.ZV.add(paramZepq);
  }
  
  void Zj(Zepq paramZepq) {
    this.ZV.remove(paramZepq);
    this.ZV.remove(Zepq.ZZ);
  }
  
  boolean Zm(Zepq paramZepq) {
    return (this.ZV.contains(Zepq.ZZ) || this.ZV.contains(paramZepq));
  }
  
  boolean ZJ() {
    return this.ZV.isEmpty();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zgxq zgxq = (Zgxq)paramObject;
    return Objects.equals(this.ZV, zgxq.ZV);
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZV });
  }
  
  public String toString() {
    return a + a;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: ldc 'd#? 2{g20>f'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgxq.a : Ljava/lang/String;
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
    //   80: bipush #63
    //   82: goto -> 112
    //   85: bipush #77
    //   87: goto -> 112
    //   90: bipush #90
    //   92: goto -> 112
    //   95: bipush #111
    //   97: goto -> 112
    //   100: bipush #80
    //   102: goto -> 112
    //   105: bipush #30
    //   107: goto -> 112
    //   110: bipush #106
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgxq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */