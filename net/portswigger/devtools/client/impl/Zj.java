package net.portswigger.devtools.client.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.portswigger.browser.Zel;
import net.portswigger.browser.Zt3;
import net.portswigger.devtools.client.Zi;

public class Zj implements Zt3 {
  private final List<Zel> ZJ;
  
  private static final String a;
  
  Zj(List<Zel> paramList) {
    this.ZJ = paramList;
  }
  
  private void ZM(Zel paramZel, Consumer<Zel> paramConsumer, BiConsumer<LinkedList<Zel>, List<Zel>> paramBiConsumer) {
    LinkedList<Zel> linkedList = new LinkedList();
    String str = Zx7.ZT();
    linkedList.add(paramZel);
    while (!linkedList.isEmpty()) {
      Zel zel = linkedList.poll();
      paramConsumer.accept(zel);
      Objects.requireNonNull(this.ZJ);
      paramBiConsumer.accept(linkedList, (List<Zel>)zel.Zb().stream().filter(Objects::nonNull).filter(this::lambda$applyUnderNode$0).map(this.ZJ::get).filter(Objects::nonNull).collect(Collectors.toList()));
      if (str != null)
        break; 
    } 
  }
  
  public void ZA(Zel paramZel, Consumer<Zel> paramConsumer) {
    ZM(paramZel, paramConsumer, Zj::lambda$applyDepthFirstUnderNode$1);
  }
  
  public void Zi(Zel paramZel, Consumer<Zel> paramConsumer) {
    ZM(paramZel, paramConsumer, LinkedList::addAll);
  }
  
  public Iterator<Zel> iterator() {
    return this.ZJ.iterator();
  }
  
  public Optional<Zel> ZS(int paramInt) {
    return this.ZJ.stream().filter(paramInt::lambda$findById$2).findFirst();
  }
  
  public Optional<Zel> Zo(int paramInt) {
    return (paramInt >= 0 && paramInt < this.ZJ.size()) ? Optional.of(this.ZJ.get(paramInt)) : Optional.empty();
  }
  
  public Optional<Zel> ZZ() {
    return this.ZJ.stream().filter(Zj::lambda$getRootNode$3).findFirst();
  }
  
  public boolean ZR(Zel paramZel) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface Zq : ()Lnet/portswigger/browser/Zh;
    //   6: checkcast net/portswigger/devtools/client/impl/Zor
    //   9: astore_2
    //   10: aload_2
    //   11: invokevirtual Zk : ()Ljava/util/Optional;
    //   14: astore_3
    //   15: aload_1
    //   16: invokeinterface Z_ : ()Ljava/util/Optional;
    //   21: astore #4
    //   23: aload_3
    //   24: invokevirtual isEmpty : ()Z
    //   27: ifne -> 45
    //   30: aload #4
    //   32: invokevirtual isEmpty : ()Z
    //   35: ifeq -> 47
    //   38: goto -> 45
    //   41: invokestatic a : (Lnet/portswigger/devtools/client/Zi;)Lnet/portswigger/devtools/client/Zi;
    //   44: athrow
    //   45: iconst_0
    //   46: ireturn
    //   47: aload_1
    //   48: invokeinterface Zt : ()I
    //   53: aload #4
    //   55: invokevirtual get : ()Ljava/lang/Object;
    //   58: checkcast java/lang/Integer
    //   61: invokevirtual intValue : ()I
    //   64: if_icmpne -> 69
    //   67: iconst_1
    //   68: ireturn
    //   69: new java/util/concurrent/atomic/AtomicBoolean
    //   72: dup
    //   73: iconst_0
    //   74: invokespecial <init> : (Z)V
    //   77: astore #5
    //   79: aload_0
    //   80: aload_1
    //   81: aload #4
    //   83: aload #5
    //   85: <illegal opcode> accept : (Ljava/util/Optional;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/function/Consumer;
    //   90: invokevirtual Zi : (Lnet/portswigger/browser/Zel;Ljava/util/function/Consumer;)V
    //   93: aload #5
    //   95: invokevirtual get : ()Z
    //   98: ireturn
    //   99: astore_2
    //   100: aload_2
    //   101: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   104: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   107: iconst_0
    //   108: ireturn
    // Exception table:
    //   from	to	target	type
    //   0	46	99	net/portswigger/devtools/client/Zi
    //   0	46	99	java/lang/InterruptedException
    //   23	38	41	net/portswigger/devtools/client/Zi
    //   47	68	99	net/portswigger/devtools/client/Zi
    //   47	68	99	java/lang/InterruptedException
    //   69	98	99	net/portswigger/devtools/client/Zi
    //   69	98	99	java/lang/InterruptedException
  }
  
  private static void lambda$isClickableAtExpectedPosition$4(Optional<Integer> paramOptional, AtomicBoolean paramAtomicBoolean, Zel paramZel) {
    if (paramZel.Zt() == ((Integer)paramOptional.get()).intValue())
      paramAtomicBoolean.set(true); 
  }
  
  private static boolean lambda$getRootNode$3(Zel paramZel) {
    return a.equals(paramZel.ZD());
  }
  
  private static boolean lambda$findById$2(int paramInt, Zel paramZel) {
    return (paramZel.Zt() == paramInt);
  }
  
  private static void lambda$applyDepthFirstUnderNode$1(LinkedList paramLinkedList, List paramList) {
    paramLinkedList.addAll(0, paramList);
  }
  
  private boolean lambda$applyUnderNode$0(Integer paramInteger) {
    return (paramInteger.intValue() > 0 && paramInteger.intValue() < this.ZJ.size());
  }
  
  private static Zi a(Zi paramZi) {
    return paramZi;
  }
  
  static {
    // Byte code:
    //   0: bipush #105
    //   2: ldc 'M\\f~B\\r '
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/devtools/client/impl/Zj.a : Ljava/lang/String;
    //   11: goto -> 151
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
    //   29: if_icmpgt -> 125
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 98, 5 -> 103
    //   80: bipush #7
    //   82: goto -> 109
    //   85: iconst_1
    //   86: goto -> 109
    //   89: bipush #120
    //   91: goto -> 109
    //   94: iconst_1
    //   95: goto -> 109
    //   98: bipush #29
    //   100: goto -> 109
    //   103: bipush #70
    //   105: goto -> 109
    //   108: iconst_1
    //   109: ixor
    //   110: ixor
    //   111: i2c
    //   112: castore
    //   113: iinc #0, 1
    //   116: dup
    //   117: ifne -> 125
    //   120: dup2
    //   121: dup_x1
    //   122: goto -> 35
    //   125: dup2_x1
    //   126: pop2
    //   127: dup_x2
    //   128: iload_0
    //   129: if_icmpgt -> 32
    //   132: pop
    //   133: new java/lang/String
    //   136: dup_x1
    //   137: swap
    //   138: invokespecial <init> : ([C)V
    //   141: invokevirtual intern : ()Ljava/lang/String;
    //   144: swap
    //   145: pop
    //   146: swap
    //   147: pop
    //   148: goto -> 8
    //   151: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\devtools\client\impl\Zj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */