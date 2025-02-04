package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.macs.GOST28147Mac;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.util.Arrays;

public class GOST28147WrapEngine implements Wrapper {
  private GOST28147Engine cipher = new GOST28147Engine();
  
  private GOST28147Mac mac = new GOST28147Mac();
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramCipherParameters instanceof ParametersWithRandom) {
      ParametersWithRandom parametersWithRandom = (ParametersWithRandom)paramCipherParameters;
      paramCipherParameters = parametersWithRandom.getParameters();
    } 
    ParametersWithUKM parametersWithUKM = (ParametersWithUKM)paramCipherParameters;
    this.cipher.init(paramBoolean, parametersWithUKM.getParameters());
    this.mac.init((CipherParameters)new ParametersWithIV(parametersWithUKM.getParameters(), parametersWithUKM.getUKM()));
  }
  
  public String getAlgorithmName() {
    return "GOST28147Wrap";
  }
  
  public byte[] wrap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.mac.update(paramArrayOfbyte, paramInt1, paramInt2);
    byte[] arrayOfByte = new byte[paramInt2 + this.mac.getMacSize()];
    this.cipher.processBlock(paramArrayOfbyte, paramInt1, arrayOfByte, 0);
    this.cipher.processBlock(paramArrayOfbyte, paramInt1 + 8, arrayOfByte, 8);
    this.cipher.processBlock(paramArrayOfbyte, paramInt1 + 16, arrayOfByte, 16);
    this.cipher.processBlock(paramArrayOfbyte, paramInt1 + 24, arrayOfByte, 24);
    this.mac.doFinal(arrayOfByte, paramInt2);
    return arrayOfByte;
  }
  
  public byte[] unwrap(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws InvalidCipherTextException {
    byte[] arrayOfByte1 = new byte[paramInt2 - this.mac.getMacSize()];
    this.cipher.processBlock(paramArrayOfbyte, paramInt1, arrayOfByte1, 0);
    this.cipher.processBlock(paramArrayOfbyte, paramInt1 + 8, arrayOfByte1, 8);
    this.cipher.processBlock(paramArrayOfbyte, paramInt1 + 16, arrayOfByte1, 16);
    this.cipher.processBlock(paramArrayOfbyte, paramInt1 + 24, arrayOfByte1, 24);
    byte[] arrayOfByte2 = new byte[this.mac.getMacSize()];
    this.mac.update(arrayOfByte1, 0, arrayOfByte1.length);
    this.mac.doFinal(arrayOfByte2, 0);
    byte[] arrayOfByte3 = new byte[this.mac.getMacSize()];
    System.arraycopy(paramArrayOfbyte, paramInt1 + paramInt2 - 4, arrayOfByte3, 0, this.mac.getMacSize());
    if (!Arrays.constantTimeAreEqual(arrayOfByte2, arrayOfByte3))
      throw new IllegalStateException("mac mismatch"); 
    return arrayOfByte1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\engines\GOST28147WrapEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */