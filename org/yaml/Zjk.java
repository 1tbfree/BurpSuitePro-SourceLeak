package org.yaml;

import java.util.Set;

public class Zjk implements Zt2 {
  final Zt5 Zm;
  
  private static final String a;
  
  public Zjk(Zt5 paramZt5) {}
  
  public Object ZF(Zi paramZi) {
    try {
      if (paramZi.Zf()) {
        try {
        
        } catch (Zj3 zj3) {
          throw a(null);
        } 
        return this.Zm.Za.containsKey(paramZi) ? this.Zm.Za.get(paramZi) : this.Zm.Zz(((Zf)paramZi).Zk().size());
      } 
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    return this.Zm.Ze((Zf)paramZi);
  }
  
  public void ZH(Zi paramZi, Object paramObject) {
    int i = Ztp.Zy();
    try {
      if (paramZi.Zf())
        try {
          this.Zm.ZF((Zf)paramZi, (Set<Object>)paramObject);
          if (i != 0)
            return; 
          throw new Zj3(a + paramZi);
        } catch (Zj3 zj3) {
          throw a(null);
        }  
    } catch (Zj3 zj3) {
      throw a(null);
    } 
    throw new Zj3(a + paramZi);
  }
  
  private static Zj3 a(Zj3 paramZj3) {
    return paramZj3;
  }
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: ldc 'e*6 t!D!7Xv!E6 r!LC!'Xw0E''\\rv!B\\n<a~L'
    //   3: iconst_m1
    //   4: goto -> 13
    //   7: putstatic org/yaml/Zjk.a : Ljava/lang/String;
    //   10: goto -> 153
    //   13: dup_x2
    //   14: pop
    //   15: invokevirtual toCharArray : ()[C
    //   18: dup_x1
    //   19: arraylength
    //   20: dup_x2
    //   21: pop
    //   22: iconst_0
    //   23: istore_0
    //   24: dup2_x1
    //   25: pop2
    //   26: dup_x2
    //   27: iconst_1
    //   28: if_icmpgt -> 127
    //   31: dup2
    //   32: swap
    //   33: iload_0
    //   34: dup2_x1
    //   35: caload
    //   36: swap
    //   37: iload_0
    //   38: bipush #7
    //   40: irem
    //   41: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 104
    //   80: bipush #49
    //   82: goto -> 111
    //   85: bipush #69
    //   87: goto -> 111
    //   90: bipush #82
    //   92: goto -> 111
    //   95: bipush #121
    //   97: goto -> 111
    //   100: iconst_5
    //   101: goto -> 111
    //   104: bipush #69
    //   106: goto -> 111
    //   109: bipush #109
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 34
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 31
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 7
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zjk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */