package org.bouncycastle.mime;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Strings;

public class BoundaryLimitedInputStream extends InputStream {
  private final InputStream src;
  
  private final byte[] boundary;
  
  private final byte[] buf;
  
  private int bufOff = 0;
  
  private int index = 0;
  
  private boolean ended = false;
  
  private int lastI;
  
  public BoundaryLimitedInputStream(InputStream paramInputStream, String paramString) {
    this.src = paramInputStream;
    this.boundary = Strings.toByteArray(paramString);
    this.buf = new byte[paramString.length() + 3];
    this.bufOff = 0;
  }
  
  public int read() throws IOException {
    int i;
    if (this.ended)
      return -1; 
    if (this.index < this.bufOff) {
      i = this.buf[this.index++] & 0xFF;
      if (this.index < this.bufOff)
        return i; 
      this.index = this.bufOff = 0;
    } else {
      i = this.src.read();
    } 
    this.lastI = i;
    if (i < 0)
      return -1; 
    if (i == 13 || i == 10) {
      int j;
      this.index = 0;
      if (i == 13) {
        j = this.src.read();
        if (j == 10) {
          this.buf[this.bufOff++] = 10;
          j = this.src.read();
        } 
      } else {
        j = this.src.read();
      } 
      if (j == 45) {
        this.buf[this.bufOff++] = 45;
        j = this.src.read();
      } 
      if (j == 45) {
        this.buf[this.bufOff++] = 45;
        int k = this.bufOff;
        int m;
        while (this.bufOff - k != this.boundary.length && (m = this.src.read()) >= 0) {
          this.buf[this.bufOff] = (byte)m;
          if (this.buf[this.bufOff] != this.boundary[this.bufOff - k]) {
            this.bufOff++;
            break;
          } 
          this.bufOff++;
        } 
        if (this.bufOff - k == this.boundary.length) {
          this.ended = true;
          return -1;
        } 
      } else if (j >= 0) {
        this.buf[this.bufOff++] = (byte)j;
      } 
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\mime\BoundaryLimitedInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */