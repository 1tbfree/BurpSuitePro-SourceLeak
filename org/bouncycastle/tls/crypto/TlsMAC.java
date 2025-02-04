package org.bouncycastle.tls.crypto;

public interface TlsMAC {
  void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  byte[] calculateMAC();
  
  void calculateMAC(byte[] paramArrayOfbyte, int paramInt);
  
  int getMacLength();
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\TlsMAC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */