package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

public class CMacWithIV extends CMac {
  public CMacWithIV(BlockCipher paramBlockCipher) {
    super(paramBlockCipher);
  }
  
  public CMacWithIV(BlockCipher paramBlockCipher, int paramInt) {
    super(paramBlockCipher, paramInt);
  }
  
  void validate(CipherParameters paramCipherParameters) {}
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\macs\CMacWithIV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */