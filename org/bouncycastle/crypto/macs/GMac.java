package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.GCMModeCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class GMac implements Mac {
  private final GCMModeCipher cipher;
  
  private final int macSizeBits;
  
  public GMac(GCMModeCipher paramGCMModeCipher) {
    this.cipher = paramGCMModeCipher;
    this.macSizeBits = 128;
  }
  
  public GMac(GCMModeCipher paramGCMModeCipher, int paramInt) {
    this.cipher = paramGCMModeCipher;
    this.macSizeBits = paramInt;
  }
  
  public void init(CipherParameters paramCipherParameters) throws IllegalArgumentException {
    if (paramCipherParameters instanceof ParametersWithIV) {
      ParametersWithIV parametersWithIV = (ParametersWithIV)paramCipherParameters;
      byte[] arrayOfByte = parametersWithIV.getIV();
      KeyParameter keyParameter = (KeyParameter)parametersWithIV.getParameters();
      this.cipher.init(true, (CipherParameters)new AEADParameters(keyParameter, this.macSizeBits, arrayOfByte));
    } else {
      throw new IllegalArgumentException("GMAC requires ParametersWithIV");
    } 
  }
  
  public String getAlgorithmName() {
    return this.cipher.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
  }
  
  public int getMacSize() {
    return this.macSizeBits / 8;
  }
  
  public void update(byte paramByte) throws IllegalStateException {
    this.cipher.processAADByte(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws DataLengthException, IllegalStateException {
    this.cipher.processAADBytes(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws DataLengthException, IllegalStateException {
    try {
      return this.cipher.doFinal(paramArrayOfbyte, paramInt);
    } catch (InvalidCipherTextException invalidCipherTextException) {
      throw new IllegalStateException(invalidCipherTextException.toString());
    } 
  }
  
  public void reset() {
    this.cipher.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\macs\GMac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */