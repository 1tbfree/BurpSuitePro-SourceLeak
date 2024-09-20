package org.bouncycastle.tls.crypto;

public final class TlsDecodeResult {
  public final byte[] buf;
  
  public final int off;
  
  public final int len;
  
  public final short contentType;
  
  public TlsDecodeResult(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, short paramShort) {
    this.buf = paramArrayOfbyte;
    this.off = paramInt1;
    this.len = paramInt2;
    this.contentType = paramShort;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsDecodeResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */