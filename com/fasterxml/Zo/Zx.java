package com.fasterxml.Zo;

import com.fasterxml.Ze.Z_;
import com.fasterxml.Ze.Zok;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;

class Zx extends Z_ {
  private final Zyg Ze;
  
  private final Zv ZX;
  
  private Object Zv;
  
  private static final String a;
  
  Zx(Zyg paramZyg, Zz7 paramZz7, Zk paramZk, Zok paramZok, Zv paramZv) {
    super(paramZz7, paramZk);
    this.Ze = paramZyg;
    this.ZX = paramZv;
  }
  
  public void Zf(Object paramObject) {
    this.Zv = paramObject;
  }
  
  public void Zv(Object paramObject1, Object paramObject2) throws IOException {
    try {
      if (this.Zv == null)
        this.Ze.Zu((Zo)this.ZX, a, new Object[] { this.ZX.ZT(), this.ZX.ZY().getName() }); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZX.Zj(this.Zv, paramObject2);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #85
    //   2: ldc '+6=Wr}2 Vq8H1Sx\\f)!3s_r*\\t%7o\\n;\\r%6W~\\n}$:WzO-8#\o$HpvJ:Ou1sMd8Hr 'O\\r6=s )H.6M=88?Ox'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zo/Zx.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #61
    //   82: goto -> 111
    //   85: iconst_2
    //   86: goto -> 111
    //   89: bipush #6
    //   91: goto -> 111
    //   94: bipush #108
    //   96: goto -> 111
    //   99: bipush #72
    //   101: goto -> 111
    //   104: bipush #58
    //   106: goto -> 111
    //   109: bipush #8
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zo\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */