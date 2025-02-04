package com.fasterxml.Zb;

public enum Zl {
  NOT_AVAILABLE, START_OBJECT, END_OBJECT, START_ARRAY, END_ARRAY, FIELD_NAME, VALUE_EMBEDDED_OBJECT, VALUE_STRING, VALUE_NUMBER_INT, VALUE_NUMBER_FLOAT, VALUE_TRUE, VALUE_FALSE, VALUE_NULL;
  
  final String Zj;
  
  final char[] Zb;
  
  final byte[] Zr;
  
  final int ZY;
  
  final boolean ZE;
  
  final boolean ZS;
  
  final boolean ZC;
  
  final boolean Zu;
  
  final boolean ZD;
  
  private static final Zl[] ZU;
  
  private static int[] Zz;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zl(String paramString1, int paramInt1) {
    if (paramString1 == null) {
      this.Zj = null;
      this.Zb = null;
      this.Zr = null;
    } else {
      this.Zj = paramString1;
      this.Zb = paramString1.toCharArray();
      int i = this.Zb.length;
      this.Zr = new byte[i];
      for (byte b = 0; b < i; b++)
        this.Zr[b] = (byte)this.Zb[b]; 
    } 
    this.ZY = paramInt1;
    this.Zu = (paramInt1 == 10 || paramInt1 == 9);
    this.ZC = (paramInt1 == 7 || paramInt1 == 8);
    this.ZE = (paramInt1 == 1 || paramInt1 == 3);
    this.ZS = (paramInt1 == 2 || paramInt1 == 4);
    this.ZD = (!this.ZE && !this.ZS && paramInt1 != 5 && paramInt1 != -1);
  }
  
  public final int Zs() {
    return this.ZY;
  }
  
  public final String ZI() {
    return this.Zj;
  }
  
  public final char[] ZU() {
    return this.Zb;
  }
  
  public final boolean ZW() {
    return this.ZC;
  }
  
  public final boolean ZT() {
    return this.ZE;
  }
  
  public final boolean Zf() {
    return this.ZS;
  }
  
  public final boolean Zl() {
    return this.ZD;
  }
  
  public static String Zy(Zl paramZl) {
    if (paramZl == null)
      return a(27701, -9242); 
    switch (Zw.ZW[paramZl.ordinal()]) {
      case 1:
      case 2:
      case 3:
        return a(27682, -11409);
      case 4:
      case 5:
        return a(27704, -11732);
      case 6:
      case 7:
        return a(27687, -2987);
      case 8:
        return a(27702, 18516);
      case 9:
        return a(27708, 28390);
      case 10:
        return a(27681, -16107);
      case 11:
        return a(27683, 1250);
      case 12:
        return a(27700, 11097);
    } 
    return a(27686, -14490);
  }
  
  static {
    // Byte code:
    //   0: bipush #26
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: aconst_null
    //   10: ldc 'B&£oVk;¼ïÐk®_ö](7özê±byÄý%[9ÉxÓCÀ±i£Ì\\n·µ&l^³T^zÃ¤Ó}Á|Ñ: ÔAi´íµætdbgçGp\\rÖ ÍÎÚr²õOoÜk¾\\fä\\ta/¾ª3¨&\}w\\nÚTÉÅÓUíõç<\\f=UL`ÉHÜÈÕÍ0có¦Ò¤$cÏÿo®aJ)fHU÷\ßé-?$-®\\r\\f%iÊÛ (Ñ: WH¾¾÷YÒ]þîÜÎ\\r38;üíâr"\\r>JJ,@9?Öbgn6\\tïqîÁ\\n¦?¨®#ñ-éó\\fÞÈ«N1y<j\\f©GÂ4u ú ü¯r\\r8(Òñí¼DÇö»è\\nê­+uäWy:8'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic ZE : ([I)V
    //   22: bipush #10
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #20
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc '¨¶ôw}_}uêñ}Þ\\fÖË/\\tÜ_F1'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #16
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #86
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic com/fasterxml/Zb/Zl.a : [Ljava/lang/String;
    //   136: bipush #26
    //   138: anewarray java/lang/String
    //   141: putstatic com/fasterxml/Zb/Zl.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #7
    //   218: goto -> 248
    //   221: bipush #104
    //   223: goto -> 248
    //   226: bipush #77
    //   228: goto -> 248
    //   231: bipush #12
    //   233: goto -> 248
    //   236: bipush #86
    //   238: goto -> 248
    //   241: bipush #12
    //   243: goto -> 248
    //   246: bipush #39
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: new com/fasterxml/Zb/Zl
    //   307: dup
    //   308: sipush #27705
    //   311: sipush #-26927
    //   314: invokestatic a : (II)Ljava/lang/String;
    //   317: iconst_0
    //   318: aconst_null
    //   319: iconst_m1
    //   320: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   323: putstatic com/fasterxml/Zb/Zl.NOT_AVAILABLE : Lcom/fasterxml/Zb/Zl;
    //   326: new com/fasterxml/Zb/Zl
    //   329: dup
    //   330: sipush #27694
    //   333: sipush #24768
    //   336: invokestatic a : (II)Ljava/lang/String;
    //   339: iconst_1
    //   340: ldc '{'
    //   342: iconst_1
    //   343: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   346: putstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   349: new com/fasterxml/Zb/Zl
    //   352: dup
    //   353: sipush #27710
    //   356: sipush #28308
    //   359: invokestatic a : (II)Ljava/lang/String;
    //   362: iconst_2
    //   363: ldc '}'
    //   365: iconst_2
    //   366: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   369: putstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   372: new com/fasterxml/Zb/Zl
    //   375: dup
    //   376: sipush #27707
    //   379: sipush #-9840
    //   382: invokestatic a : (II)Ljava/lang/String;
    //   385: iconst_3
    //   386: ldc '['
    //   388: iconst_3
    //   389: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   392: putstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   395: new com/fasterxml/Zb/Zl
    //   398: dup
    //   399: sipush #27696
    //   402: sipush #-11797
    //   405: invokestatic a : (II)Ljava/lang/String;
    //   408: iconst_4
    //   409: ldc ']'
    //   411: iconst_4
    //   412: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   415: putstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   418: new com/fasterxml/Zb/Zl
    //   421: dup
    //   422: sipush #27680
    //   425: sipush #-27229
    //   428: invokestatic a : (II)Ljava/lang/String;
    //   431: iconst_5
    //   432: aconst_null
    //   433: iconst_5
    //   434: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   437: putstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   440: new com/fasterxml/Zb/Zl
    //   443: dup
    //   444: sipush #27699
    //   447: sipush #-21524
    //   450: invokestatic a : (II)Ljava/lang/String;
    //   453: bipush #6
    //   455: aconst_null
    //   456: bipush #12
    //   458: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   461: putstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   464: new com/fasterxml/Zb/Zl
    //   467: dup
    //   468: sipush #27709
    //   471: sipush #-31596
    //   474: invokestatic a : (II)Ljava/lang/String;
    //   477: bipush #7
    //   479: aconst_null
    //   480: bipush #6
    //   482: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   485: putstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   488: new com/fasterxml/Zb/Zl
    //   491: dup
    //   492: sipush #27695
    //   495: sipush #-21101
    //   498: invokestatic a : (II)Ljava/lang/String;
    //   501: bipush #8
    //   503: aconst_null
    //   504: bipush #7
    //   506: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   509: putstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   512: new com/fasterxml/Zb/Zl
    //   515: dup
    //   516: sipush #27697
    //   519: sipush #-6208
    //   522: invokestatic a : (II)Ljava/lang/String;
    //   525: bipush #9
    //   527: aconst_null
    //   528: bipush #8
    //   530: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   533: putstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_FLOAT : Lcom/fasterxml/Zb/Zl;
    //   536: new com/fasterxml/Zb/Zl
    //   539: dup
    //   540: sipush #27685
    //   543: sipush #27433
    //   546: invokestatic a : (II)Ljava/lang/String;
    //   549: bipush #10
    //   551: sipush #27684
    //   554: sipush #-20975
    //   557: invokestatic a : (II)Ljava/lang/String;
    //   560: bipush #9
    //   562: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   565: putstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   568: new com/fasterxml/Zb/Zl
    //   571: dup
    //   572: sipush #27698
    //   575: sipush #8418
    //   578: invokestatic a : (II)Ljava/lang/String;
    //   581: bipush #11
    //   583: sipush #27706
    //   586: sipush #-11035
    //   589: invokestatic a : (II)Ljava/lang/String;
    //   592: bipush #10
    //   594: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   597: putstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   600: new com/fasterxml/Zb/Zl
    //   603: dup
    //   604: sipush #27703
    //   607: sipush #3063
    //   610: invokestatic a : (II)Ljava/lang/String;
    //   613: bipush #12
    //   615: sipush #27711
    //   618: sipush #14630
    //   621: invokestatic a : (II)Ljava/lang/String;
    //   624: bipush #11
    //   626: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;I)V
    //   629: putstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   632: bipush #13
    //   634: anewarray com/fasterxml/Zb/Zl
    //   637: dup
    //   638: iconst_0
    //   639: getstatic com/fasterxml/Zb/Zl.NOT_AVAILABLE : Lcom/fasterxml/Zb/Zl;
    //   642: aastore
    //   643: dup
    //   644: iconst_1
    //   645: getstatic com/fasterxml/Zb/Zl.START_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   648: aastore
    //   649: dup
    //   650: iconst_2
    //   651: getstatic com/fasterxml/Zb/Zl.END_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   654: aastore
    //   655: dup
    //   656: iconst_3
    //   657: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   660: aastore
    //   661: dup
    //   662: iconst_4
    //   663: getstatic com/fasterxml/Zb/Zl.END_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   666: aastore
    //   667: dup
    //   668: iconst_5
    //   669: getstatic com/fasterxml/Zb/Zl.FIELD_NAME : Lcom/fasterxml/Zb/Zl;
    //   672: aastore
    //   673: dup
    //   674: bipush #6
    //   676: getstatic com/fasterxml/Zb/Zl.VALUE_EMBEDDED_OBJECT : Lcom/fasterxml/Zb/Zl;
    //   679: aastore
    //   680: dup
    //   681: bipush #7
    //   683: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   686: aastore
    //   687: dup
    //   688: bipush #8
    //   690: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_INT : Lcom/fasterxml/Zb/Zl;
    //   693: aastore
    //   694: dup
    //   695: bipush #9
    //   697: getstatic com/fasterxml/Zb/Zl.VALUE_NUMBER_FLOAT : Lcom/fasterxml/Zb/Zl;
    //   700: aastore
    //   701: dup
    //   702: bipush #10
    //   704: getstatic com/fasterxml/Zb/Zl.VALUE_TRUE : Lcom/fasterxml/Zb/Zl;
    //   707: aastore
    //   708: dup
    //   709: bipush #11
    //   711: getstatic com/fasterxml/Zb/Zl.VALUE_FALSE : Lcom/fasterxml/Zb/Zl;
    //   714: aastore
    //   715: dup
    //   716: bipush #12
    //   718: getstatic com/fasterxml/Zb/Zl.VALUE_NULL : Lcom/fasterxml/Zb/Zl;
    //   721: aastore
    //   722: putstatic com/fasterxml/Zb/Zl.ZU : [Lcom/fasterxml/Zb/Zl;
    //   725: return
  }
  
  public static void ZE(int[] paramArrayOfint) {
    Zz = paramArrayOfint;
  }
  
  public static int[] Zz() {
    return Zz;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6C37) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 73;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */