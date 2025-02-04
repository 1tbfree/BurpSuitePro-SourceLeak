package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithUKM implements CipherParameters {
  private byte[] ukm;
  
  private CipherParameters parameters;
  
  public ParametersWithUKM(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte) {
    this(paramCipherParameters, paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public ParametersWithUKM(CipherParameters paramCipherParameters, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.ukm = new byte[paramInt2];
    this.parameters = paramCipherParameters;
    System.arraycopy(paramArrayOfbyte, paramInt1, this.ukm, 0, paramInt2);
  }
  
  public byte[] getUKM() {
    return this.ukm;
  }
  
  public CipherParameters getParameters() {
    return this.parameters;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\ParametersWithUKM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */