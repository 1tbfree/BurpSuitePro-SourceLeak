package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

public final class Zo6 extends Zyo<Object> implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected final Zt Zo;
  
  protected final Zyo<Object> Zu;
  
  private static final String c;
  
  public Zo6(Zt paramZt, Zyo<?> paramZyo) {
    this.Zo = paramZt;
    this.Zu = (Zyo)paramZyo;
  }
  
  public Zd Zb() {
    return this.Zu.Zb();
  }
  
  public Class<?> ZX() {
    return this.Zu.ZX();
  }
  
  public Boolean Zu(Zyc paramZyc) {
    return this.Zu.Zu(paramZyc);
  }
  
  public Zyo<?> Za() {
    return this.Zu.Za();
  }
  
  public Collection<Object> Z_() {
    return this.Zu.Z_();
  }
  
  public Object Zj(Zyg paramZyg) throws Zy_ {
    return this.Zu.Zj(paramZyg);
  }
  
  public Object Zy(Zyg paramZyg) throws Zy_ {
    return this.Zu.Zy(paramZyg);
  }
  
  public Object deserialize(Zg paramZg, Zyg paramZyg) throws IOException {
    return this.Zu.Zf(paramZg, paramZyg, this.Zo);
  }
  
  public Object Zf(Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    throw new IllegalStateException(c);
  }
  
  public Object ZI(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    return this.Zu.ZI(paramZg, paramZyg, paramObject);
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: ldc '+% UdQ, U-\\b/B G &BnUL9U;O\\r5\\nUO\\b\\t@,3\-*BiA\\t|Q%J\\t'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Ze/Zo6.c : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #91
    //   82: goto -> 111
    //   85: bipush #120
    //   87: goto -> 111
    //   90: bipush #84
    //   92: goto -> 111
    //   95: bipush #20
    //   97: goto -> 111
    //   100: bipush #109
    //   102: goto -> 111
    //   105: iconst_2
    //   106: goto -> 111
    //   109: bipush #72
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
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
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zo6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */