package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface AEADCipher {
  void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException;
  
  String getAlgorithmName();
  
  void processAADByte(byte paramByte);
  
  void processAADBytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException;
  
  int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException;
  
  int doFinal(byte[] paramArrayOfbyte, int paramInt) throws IllegalStateException, InvalidCipherTextException;
  
  byte[] getMac();
  
  int getUpdateOutputSize(int paramInt);
  
  int getOutputSize(int paramInt);
  
  void reset();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\modes\AEADCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */