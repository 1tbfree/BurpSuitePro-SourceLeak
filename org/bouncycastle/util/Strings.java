package org.bouncycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;
import org.bouncycastle.util.encoders.UTF8;

public final class Strings {
  private static String LINE_SEPARATOR;
  
  public static String fromUTF8ByteArray(byte[] paramArrayOfbyte) {
    char[] arrayOfChar = new char[paramArrayOfbyte.length];
    int i = UTF8.transcodeToUTF16(paramArrayOfbyte, arrayOfChar);
    if (i < 0)
      throw new IllegalArgumentException("Invalid UTF-8 input"); 
    return new String(arrayOfChar, 0, i);
  }
  
  public static String fromUTF8ByteArray(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    char[] arrayOfChar = new char[paramInt2];
    int i = UTF8.transcodeToUTF16(paramArrayOfbyte, paramInt1, paramInt2, arrayOfChar);
    if (i < 0)
      throw new IllegalArgumentException("Invalid UTF-8 input"); 
    return new String(arrayOfChar, 0, i);
  }
  
  public static byte[] toUTF8ByteArray(String paramString) {
    return toUTF8ByteArray(paramString.toCharArray());
  }
  
  public static byte[] toUTF8ByteArray(char[] paramArrayOfchar) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    try {
      toUTF8ByteArray(paramArrayOfchar, byteArrayOutputStream);
    } catch (IOException iOException) {
      throw new IllegalStateException("cannot encode string to byte array!");
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public static void toUTF8ByteArray(char[] paramArrayOfchar, OutputStream paramOutputStream) throws IOException {
    char[] arrayOfChar = paramArrayOfchar;
    for (byte b = 0; b < arrayOfChar.length; b++) {
      char c = arrayOfChar[b];
      if (c < '') {
        paramOutputStream.write(c);
      } else if (c < 'ࠀ') {
        paramOutputStream.write(0xC0 | c >> 6);
        paramOutputStream.write(0x80 | c & 0x3F);
      } else if (c >= '?' && c <= '?') {
        if (b + 1 >= arrayOfChar.length)
          throw new IllegalStateException("invalid UTF-16 codepoint"); 
        char c1 = c;
        c = arrayOfChar[++b];
        char c2 = c;
        if (c1 > '?')
          throw new IllegalStateException("invalid UTF-16 codepoint"); 
        int i = ((c1 & 0x3FF) << 10 | c2 & 0x3FF) + 65536;
        paramOutputStream.write(0xF0 | i >> 18);
        paramOutputStream.write(0x80 | i >> 12 & 0x3F);
        paramOutputStream.write(0x80 | i >> 6 & 0x3F);
        paramOutputStream.write(0x80 | i & 0x3F);
      } else {
        paramOutputStream.write(0xE0 | c >> 12);
        paramOutputStream.write(0x80 | c >> 6 & 0x3F);
        paramOutputStream.write(0x80 | c & 0x3F);
      } 
    } 
  }
  
  public static String toUpperCase(String paramString) {
    boolean bool = false;
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b = 0; b != arrayOfChar.length; b++) {
      char c = arrayOfChar[b];
      if ('a' <= c && 'z' >= c) {
        bool = true;
        arrayOfChar[b] = (char)(c - 97 + 65);
      } 
    } 
    return bool ? new String(arrayOfChar) : paramString;
  }
  
  public static String toLowerCase(String paramString) {
    boolean bool = false;
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b = 0; b != arrayOfChar.length; b++) {
      char c = arrayOfChar[b];
      if ('A' <= c && 'Z' >= c) {
        bool = true;
        arrayOfChar[b] = (char)(c - 65 + 97);
      } 
    } 
    return bool ? new String(arrayOfChar) : paramString;
  }
  
  public static byte[] toByteArray(char[] paramArrayOfchar) {
    byte[] arrayOfByte = new byte[paramArrayOfchar.length];
    for (byte b = 0; b != arrayOfByte.length; b++)
      arrayOfByte[b] = (byte)paramArrayOfchar[b]; 
    return arrayOfByte;
  }
  
  public static byte[] toByteArray(String paramString) {
    byte[] arrayOfByte = new byte[paramString.length()];
    for (byte b = 0; b != arrayOfByte.length; b++) {
      char c = paramString.charAt(b);
      arrayOfByte[b] = (byte)c;
    } 
    return arrayOfByte;
  }
  
  public static int toByteArray(String paramString, byte[] paramArrayOfbyte, int paramInt) {
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      paramArrayOfbyte[paramInt + b] = (byte)c;
    } 
    return i;
  }
  
  public static boolean constantTimeAreEqual(String paramString1, String paramString2) {
    int i = (paramString1.length() == paramString2.length()) ? 1 : 0;
    int j = paramString1.length();
    if (i) {
      for (int k = 0; k != j; k++)
        i &= (paramString1.charAt(k) == paramString2.charAt(k)) ? 1 : 0; 
    } else {
      for (int k = 0; k != j; k++)
        i &= (paramString1.charAt(k) == ' ') ? 1 : 0; 
    } 
    return i;
  }
  
  public static String fromByteArray(byte[] paramArrayOfbyte) {
    return new String(asCharArray(paramArrayOfbyte));
  }
  
  public static char[] asCharArray(byte[] paramArrayOfbyte) {
    char[] arrayOfChar = new char[paramArrayOfbyte.length];
    for (byte b = 0; b != arrayOfChar.length; b++)
      arrayOfChar[b] = (char)(paramArrayOfbyte[b] & 0xFF); 
    return arrayOfChar;
  }
  
  public static String[] split(String paramString, char paramChar) {
    Vector<String> vector = new Vector();
    boolean bool = true;
    while (bool) {
      int i = paramString.indexOf(paramChar);
      if (i > 0) {
        String str = paramString.substring(0, i);
        vector.addElement(str);
        paramString = paramString.substring(i + 1);
        continue;
      } 
      bool = false;
      vector.addElement(paramString);
    } 
    String[] arrayOfString = new String[vector.size()];
    for (byte b = 0; b != arrayOfString.length; b++)
      arrayOfString[b] = vector.elementAt(b); 
    return arrayOfString;
  }
  
  public static StringList newList() {
    return new StringListImpl();
  }
  
  public static String lineSeparator() {
    return LINE_SEPARATOR;
  }
  
  static {
    try {
      LINE_SEPARATOR = AccessController.<String>doPrivileged(new PrivilegedAction<String>() {
            public String run() {
              return System.getProperty("line.separator");
            }
          });
    } catch (Exception exception) {
      try {
        LINE_SEPARATOR = String.format("%n", new Object[0]);
      } catch (Exception exception1) {
        LINE_SEPARATOR = "\n";
      } 
    } 
  }
  
  private static class StringListImpl extends ArrayList<String> implements StringList {
    private StringListImpl() {}
    
    public boolean add(String param1String) {
      return super.add(param1String);
    }
    
    public String set(int param1Int, String param1String) {
      return super.set(param1Int, param1String);
    }
    
    public void add(int param1Int, String param1String) {
      super.add(param1Int, param1String);
    }
    
    public String[] toStringArray() {
      String[] arrayOfString = new String[size()];
      for (byte b = 0; b != arrayOfString.length; b++)
        arrayOfString[b] = get(b); 
      return arrayOfString;
    }
    
    public String[] toStringArray(int param1Int1, int param1Int2) {
      String[] arrayOfString = new String[param1Int2 - param1Int1];
      for (int i = param1Int1; i != size() && i != param1Int2; i++)
        arrayOfString[i - param1Int1] = get(i); 
      return arrayOfString;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastl\\util\Strings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */