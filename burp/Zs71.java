package burp;

import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;

class Zs71 extends DropTargetAdapter {
  final Zbct ZR;
  
  private static final String a;
  
  private Zs71(Zbct paramZbct) {}
  
  public void dragOver(DropTargetDragEvent paramDropTargetDragEvent) {
    try {
      super.dragOver(paramDropTargetDragEvent);
      if (!Zj())
        paramDropTargetDragEvent.rejectDrag(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void dragEnter(DropTargetDragEvent paramDropTargetDragEvent) {
    try {
      if (Zj())
        this.ZR.Zr.Zl(Zlkk.FILE_UPLOAD_HOVER_BACKGROUND); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private boolean Zj() {
    try {
      if (!this.ZR.ZJ())
        try {
          if (this.ZR.isEnabled());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void dragExit(DropTargetEvent paramDropTargetEvent) {
    this.ZR.Zr.Zl(Zlkk.FILE_UPLOAD_BACKGROUND);
  }
  
  public void drop(DropTargetDropEvent paramDropTargetDropEvent) {
    // Byte code:
    //   0: invokestatic ZTu : ()Z
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZR : Lburp/Zbct;
    //   8: invokevirtual ZJ : ()Z
    //   11: ifne -> 90
    //   14: aload_1
    //   15: iconst_1
    //   16: invokevirtual acceptDrop : (I)V
    //   19: aload_1
    //   20: invokevirtual getTransferable : ()Ljava/awt/datatransfer/Transferable;
    //   23: getstatic java/awt/datatransfer/DataFlavor.javaFileListFlavor : Ljava/awt/datatransfer/DataFlavor;
    //   26: invokeinterface getTransferData : (Ljava/awt/datatransfer/DataFlavor;)Ljava/lang/Object;
    //   31: checkcast java/util/List
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface size : ()I
    //   41: iconst_1
    //   42: if_icmpne -> 73
    //   45: aload_0
    //   46: getfield ZR : Lburp/Zbct;
    //   49: aload_3
    //   50: iconst_0
    //   51: invokeinterface get : (I)Ljava/lang/Object;
    //   56: checkcast java/io/File
    //   59: invokevirtual Zz : (Ljava/io/File;)V
    //   62: iload_2
    //   63: ifne -> 90
    //   66: goto -> 73
    //   69: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   72: athrow
    //   73: aload_0
    //   74: getfield ZR : Lburp/Zbct;
    //   77: getstatic burp/Zs71.a : Ljava/lang/String;
    //   80: invokevirtual ZK : (Ljava/lang/String;)V
    //   83: goto -> 90
    //   86: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   89: athrow
    //   90: aload_0
    //   91: getfield ZR : Lburp/Zbct;
    //   94: getfield Zr : Lburp/Zbqc;
    //   97: getstatic burp/Zlkk.FILE_UPLOAD_BACKGROUND : Lburp/Zlkk;
    //   100: invokevirtual Zl : (Lburp/Zlkk;)V
    //   103: goto -> 141
    //   106: astore_3
    //   107: aload_3
    //   108: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   111: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   114: new java/lang/RuntimeException
    //   117: dup
    //   118: aload_3
    //   119: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   122: athrow
    //   123: astore #4
    //   125: aload_0
    //   126: getfield ZR : Lburp/Zbct;
    //   129: getfield Zr : Lburp/Zbqc;
    //   132: getstatic burp/Zlkk.FILE_UPLOAD_BACKGROUND : Lburp/Zlkk;
    //   135: invokevirtual Zl : (Lburp/Zlkk;)V
    //   138: aload #4
    //   140: athrow
    //   141: invokestatic Zwu : ()[Lburp/Zbqc;
    //   144: ifnonnull -> 170
    //   147: iload_2
    //   148: ifeq -> 166
    //   151: goto -> 158
    //   154: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   157: athrow
    //   158: iconst_0
    //   159: goto -> 167
    //   162: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   165: athrow
    //   166: iconst_1
    //   167: invokestatic ZE : (Z)V
    //   170: return
    // Exception table:
    //   from	to	target	type
    //   4	90	106	java/awt/datatransfer/UnsupportedFlavorException
    //   4	90	106	java/io/IOException
    //   4	90	123	finally
    //   35	66	69	java/awt/datatransfer/UnsupportedFlavorException
    //   45	83	86	java/awt/datatransfer/UnsupportedFlavorException
    //   106	125	123	finally
    //   141	151	154	java/awt/datatransfer/UnsupportedFlavorException
    //   147	162	162	java/awt/datatransfer/UnsupportedFlavorException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #85
    //   2: ldc 'V_%3BqjX ;FqX93J"9B,cL#mT\\n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs71.a : Ljava/lang/String;
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
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #76
    //   82: goto -> 111
    //   85: bipush #100
    //   87: goto -> 111
    //   90: bipush #59
    //   92: goto -> 111
    //   95: bipush #9
    //   97: goto -> 111
    //   100: bipush #70
    //   102: goto -> 111
    //   105: bipush #118
    //   107: goto -> 111
    //   110: iconst_4
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs71.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */