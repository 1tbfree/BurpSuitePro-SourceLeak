package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import java.io.IOException;
import java.util.Arrays;

@Zl
final class Zud extends Zu1<char[]> {
  private static final long serialVersionUID = 1L;
  
  private static final String f;
  
  public Zud() {
    super((Class)char[].class);
  }
  
  protected Zu1<?> Zk(Zzb paramZzb, Boolean paramBoolean) {
    return this;
  }
  
  protected char[] ZQ() {
    return new char[0];
  }
  
  public char[] ZK(Zg paramZg, Zyg paramZyg) throws IOException {
    // Byte code:
    //   0: invokestatic Zn : ()[Lburp/Zbqc;
    //   3: astore_3
    //   4: aload_1
    //   5: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   8: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   11: ifeq -> 53
    //   14: aload_1
    //   15: invokevirtual ZW : ()[C
    //   18: astore #4
    //   20: aload_1
    //   21: invokevirtual Zk : ()I
    //   24: istore #5
    //   26: aload_1
    //   27: invokevirtual Zn : ()I
    //   30: istore #6
    //   32: iload #6
    //   34: newarray char
    //   36: astore #7
    //   38: aload #4
    //   40: iload #5
    //   42: aload #7
    //   44: iconst_0
    //   45: iload #6
    //   47: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   50: aload #7
    //   52: areturn
    //   53: aload_1
    //   54: invokevirtual Zs : ()Z
    //   57: ifeq -> 253
    //   60: new java/lang/StringBuilder
    //   63: dup
    //   64: bipush #64
    //   66: invokespecial <init> : (I)V
    //   69: astore #4
    //   71: aload_1
    //   72: invokevirtual ZV : ()Lcom/fasterxml/Zb/Zl;
    //   75: dup
    //   76: astore #5
    //   78: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   81: if_acmpeq -> 244
    //   84: aload #5
    //   86: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   89: if_acmpne -> 102
    //   92: aload_1
    //   93: invokevirtual ZR : ()Ljava/lang/String;
    //   96: astore #6
    //   98: aload_3
    //   99: ifnull -> 188
    //   102: aload #5
    //   104: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   107: if_acmpne -> 166
    //   110: goto -> 117
    //   113: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   116: athrow
    //   117: aload_0
    //   118: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   121: ifnull -> 153
    //   124: goto -> 131
    //   127: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   130: athrow
    //   131: aload_0
    //   132: getfield Zp : Lcom/fasterxml/Zo/Zzb;
    //   135: aload_2
    //   136: invokeinterface Zj : (Lcom/fasterxml/Zor/Zyg;)Ljava/lang/Object;
    //   141: pop
    //   142: aload_3
    //   143: ifnull -> 71
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   152: athrow
    //   153: aload_0
    //   154: aload_2
    //   155: invokevirtual Zn : (Lcom/fasterxml/Zor/Zyg;)V
    //   158: ldc ' '
    //   160: astore #6
    //   162: aload_3
    //   163: ifnull -> 188
    //   166: aload_2
    //   167: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
    //   170: aload_1
    //   171: invokevirtual ZB : (Ljava/lang/Class;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   174: checkcast java/lang/CharSequence
    //   177: astore #7
    //   179: aload #7
    //   181: invokeinterface toString : ()Ljava/lang/String;
    //   186: astore #6
    //   188: aload #6
    //   190: invokevirtual length : ()I
    //   193: iconst_1
    //   194: if_icmpeq -> 228
    //   197: aload_2
    //   198: aload_0
    //   199: getstatic com/fasterxml/Zs/Zud.f : Ljava/lang/String;
    //   202: iconst_1
    //   203: anewarray java/lang/Object
    //   206: dup
    //   207: iconst_0
    //   208: aload #6
    //   210: invokevirtual length : ()I
    //   213: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   216: aastore
    //   217: invokevirtual ZY : (Lcom/fasterxml/Zor/Zyo;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   220: pop
    //   221: goto -> 228
    //   224: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   227: athrow
    //   228: aload #4
    //   230: aload #6
    //   232: iconst_0
    //   233: invokevirtual charAt : (I)C
    //   236: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_3
    //   241: ifnull -> 71
    //   244: aload #4
    //   246: invokevirtual toString : ()Ljava/lang/String;
    //   249: invokevirtual toCharArray : ()[C
    //   252: areturn
    //   253: aload_1
    //   254: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   257: invokevirtual ZL : (Lcom/fasterxml/Zb/Zl;)Z
    //   260: ifeq -> 353
    //   263: aload_1
    //   264: invokevirtual ZO : ()Ljava/lang/Object;
    //   267: astore #4
    //   269: aload #4
    //   271: ifnonnull -> 280
    //   274: aconst_null
    //   275: areturn
    //   276: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   279: athrow
    //   280: aload #4
    //   282: instanceof [C
    //   285: ifeq -> 301
    //   288: aload #4
    //   290: checkcast [C
    //   293: checkcast [C
    //   296: areturn
    //   297: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   300: athrow
    //   301: aload #4
    //   303: instanceof java/lang/String
    //   306: ifeq -> 322
    //   309: aload #4
    //   311: checkcast java/lang/String
    //   314: invokevirtual toCharArray : ()[C
    //   317: areturn
    //   318: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   321: athrow
    //   322: aload #4
    //   324: instanceof [B
    //   327: ifeq -> 353
    //   330: invokestatic Zx : ()Lcom/fasterxml/Zb/Zy;
    //   333: aload #4
    //   335: checkcast [B
    //   338: checkcast [B
    //   341: iconst_0
    //   342: invokevirtual Zn : ([BZ)Ljava/lang/String;
    //   345: invokevirtual toCharArray : ()[C
    //   348: areturn
    //   349: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   352: athrow
    //   353: aload_2
    //   354: aload_0
    //   355: getfield ZC : Ljava/lang/Class;
    //   358: aload_1
    //   359: invokevirtual ZB : (Ljava/lang/Class;Lcom/fasterxml/Zb/Zg;)Ljava/lang/Object;
    //   362: checkcast [C
    //   365: checkcast [C
    //   368: areturn
    // Exception table:
    //   from	to	target	type
    //   98	110	113	java/io/IOException
    //   102	124	127	java/io/IOException
    //   117	146	149	java/io/IOException
    //   188	221	224	java/io/IOException
    //   269	276	276	java/io/IOException
    //   280	297	297	java/io/IOException
    //   301	318	318	java/io/IOException
    //   322	349	349	java/io/IOException
  }
  
  protected char[] ZO(Zg paramZg, Zyg paramZyg) throws IOException {
    return (char[])paramZyg.ZB(this.ZC, paramZg);
  }
  
  protected char[] ZN(char[] paramArrayOfchar1, char[] paramArrayOfchar2) {
    int i = paramArrayOfchar1.length;
    int j = paramArrayOfchar2.length;
    char[] arrayOfChar = Arrays.copyOf(paramArrayOfchar1, i + j);
    System.arraycopy(paramArrayOfchar2, 0, arrayOfChar, i, j);
    return arrayOfChar;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: ldc '(j8)+y\\bj #--K$K7p$/1>Kbv*:7\\flvc;y\\np9f>y\\b\\fe$f:5\\ta826\\rDg>'-y\\nv7?'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zs/Zud.f : Ljava/lang/String;
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
    //   80: bipush #102
    //   82: goto -> 112
    //   85: bipush #105
    //   87: goto -> 112
    //   90: bipush #9
    //   92: goto -> 112
    //   95: bipush #91
    //   97: goto -> 112
    //   100: bipush #75
    //   102: goto -> 112
    //   105: bipush #82
    //   107: goto -> 112
    //   110: bipush #84
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zud.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */