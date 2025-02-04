package net.portswigger;

import burp.Zbqc;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiPredicate;

public class Zdq extends Zdi {
  private final List<String> ZR;
  
  private static final String c;
  
  Zdq(Z_3 paramZ_3, String paramString) {
    super(paramZ_3);
    if (paramString == null)
      throw new Zk8(String.format(c, new Object[] { paramZ_3.ZZ })); 
    this.ZR = new LinkedList<>();
    this.ZR.add(paramString);
  }
  
  private Zdq(Z_3 paramZ_3, List<String> paramList) {
    super(paramZ_3);
    this.ZR = paramList;
  }
  
  protected Zdi Zh(Zdi paramZdi) {
    LinkedList<String> linkedList = new LinkedList<>(this.ZR);
    paramZdi.ZC(linkedList::lambda$combine$0);
    return new Zdq(this.ZW, linkedList);
  }
  
  public void ZC(Zcb paramZcb) {
    ZE(Zdq::lambda$accept$1, paramZcb);
  }
  
  public void ZE(BiPredicate<Z_3, String> paramBiPredicate, Zcb paramZcb) {
    Iterator<String> iterator = this.ZR.iterator();
    Zbqc[] arrayOfZbqc = Zj.Zk();
    while (iterator.hasNext()) {
      String str = iterator.next();
      try {
        if (paramBiPredicate.test(this.ZW, str))
          paramZcb.Zx(this.ZW, str); 
      } catch (Zk8 zk8) {
        throw a(null);
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (Zk8 zk8) {
      throw a(null);
    } 
    try {
      if (paramObject != null)
        try {
          if (getClass() == paramObject.getClass()) {
            Zdq zdq = (Zdq)paramObject;
            return Objects.equals(this.ZR, zdq.ZR);
          } 
          return false;
        } catch (Zk8 zk8) {
          throw a(null);
        }  
    } catch (Zk8 zk8) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    return Objects.hash(new Object[] { this.ZR });
  }
  
  private static boolean lambda$accept$1(Z_3 paramZ_3, String paramString) {
    return true;
  }
  
  private static void lambda$combine$0(LinkedList<String> paramLinkedList, Z_3 paramZ_3, String paramString) {
    paramLinkedList.add(paramString);
  }
  
  private static Zk8 a(Zk8 paramZk8) {
    return paramZk8;
  }
  
  static {
    // Byte code:
    //   0: bipush #61
    //   2: ldc 'V. #*? 9-/ny*a//{*aHo=8'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zdq.c : Ljava/lang/String;
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
    //   80: bipush #34
    //   82: goto -> 112
    //   85: bipush #75
    //   87: goto -> 112
    //   90: bipush #101
    //   92: goto -> 112
    //   95: bipush #124
    //   97: goto -> 112
    //   100: bipush #82
    //   102: goto -> 112
    //   105: bipush #119
    //   107: goto -> 112
    //   110: bipush #115
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zdq.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */