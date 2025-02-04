package org.bouncycastle.operator;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

public class MacCaptureStream extends OutputStream {
  private final OutputStream cOut;
  
  private final byte[] mac;
  
  int macIndex = 0;
  
  public MacCaptureStream(OutputStream paramOutputStream, int paramInt) {
    this.cOut = paramOutputStream;
    this.mac = new byte[paramInt];
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (paramInt2 >= this.mac.length) {
      this.cOut.write(this.mac, 0, this.macIndex);
      this.macIndex = this.mac.length;
      System.arraycopy(paramArrayOfbyte, paramInt1 + paramInt2 - this.mac.length, this.mac, 0, this.mac.length);
      this.cOut.write(paramArrayOfbyte, paramInt1, paramInt2 - this.mac.length);
    } else {
      for (int i = 0; i != paramInt2; i++)
        write(paramArrayOfbyte[paramInt1 + i]); 
    } 
  }
  
  public void write(int paramInt) throws IOException {
    if (this.macIndex == this.mac.length) {
      byte b = this.mac[0];
      System.arraycopy(this.mac, 1, this.mac, 0, this.mac.length - 1);
      this.mac[this.mac.length - 1] = (byte)paramInt;
      this.cOut.write(b);
    } else {
      this.mac[this.macIndex++] = (byte)paramInt;
    } 
  }
  
  public byte[] getMac() {
    return Arrays.clone(this.mac);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\MacCaptureStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */