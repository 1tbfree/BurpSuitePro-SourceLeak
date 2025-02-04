package org.bouncycastle.mime.encoding;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class QuotedPrintableInputStream extends FilterInputStream {
  public QuotedPrintableInputStream(InputStream paramInputStream) {
    super(paramInputStream);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    int i;
    for (i = 0; i != paramInt2; i++) {
      int j = read();
      if (j < 0)
        break; 
      paramArrayOfbyte[i + paramInt1] = (byte)j;
    } 
    return (i == 0) ? -1 : i;
  }
  
  public int read() throws IOException {
    int i = this.in.read();
    if (i == -1)
      return -1; 
    while (i == 61) {
      int j = this.in.read();
      if (j == -1)
        throw new IllegalStateException("Quoted '=' at end of stream"); 
      if (j == 13) {
        j = this.in.read();
        if (j == 10)
          j = this.in.read(); 
        i = j;
        continue;
      } 
      if (j == 10) {
        i = this.in.read();
        continue;
      } 
      int k = 0;
      if (j >= 48 && j <= 57) {
        k = j - 48;
      } else if (j >= 65 && j <= 70) {
        k = 10 + j - 65;
      } else {
        throw new IllegalStateException("Expecting '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
      } 
      k <<= 4;
      j = this.in.read();
      if (j >= 48 && j <= 57) {
        k |= j - 48;
      } else if (j >= 65 && j <= 70) {
        k |= 10 + j - 65;
      } else {
        throw new IllegalStateException("Expecting second '0123456789ABCDEF after quote that was not immediately followed by LF or CRLF");
      } 
      return k;
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\encoding\QuotedPrintableInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */