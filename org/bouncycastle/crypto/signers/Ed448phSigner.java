package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PublicKeyParameters;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.Arrays;

public class Ed448phSigner implements Signer {
  private final Xof prehash = Ed448.createPrehash();
  
  private final byte[] context;
  
  private boolean forSigning;
  
  private Ed448PrivateKeyParameters privateKey;
  
  private Ed448PublicKeyParameters publicKey;
  
  public Ed448phSigner(byte[] paramArrayOfbyte) {
    if (null == paramArrayOfbyte)
      throw new NullPointerException("'context' cannot be null"); 
    this.context = Arrays.clone(paramArrayOfbyte);
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    this.forSigning = paramBoolean;
    if (paramBoolean) {
      this.privateKey = (Ed448PrivateKeyParameters)paramCipherParameters;
      this.publicKey = null;
    } else {
      this.privateKey = null;
      this.publicKey = (Ed448PublicKeyParameters)paramCipherParameters;
    } 
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("Ed448", 224, paramCipherParameters, paramBoolean));
    reset();
  }
  
  public void update(byte paramByte) {
    this.prehash.update(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.prehash.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] generateSignature() {
    if (!this.forSigning || null == this.privateKey)
      throw new IllegalStateException("Ed448phSigner not initialised for signature generation."); 
    byte[] arrayOfByte1 = new byte[64];
    if (64 != this.prehash.doFinal(arrayOfByte1, 0, 64))
      throw new IllegalStateException("Prehash digest failed"); 
    byte[] arrayOfByte2 = new byte[114];
    this.privateKey.sign(1, this.context, arrayOfByte1, 0, 64, arrayOfByte2, 0);
    return arrayOfByte2;
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte) {
    if (this.forSigning || null == this.publicKey)
      throw new IllegalStateException("Ed448phSigner not initialised for verification"); 
    if (114 != paramArrayOfbyte.length) {
      this.prehash.reset();
      return false;
    } 
    byte[] arrayOfByte = new byte[64];
    if (64 != this.prehash.doFinal(arrayOfByte, 0, 64))
      throw new IllegalStateException("Prehash digest failed"); 
    return this.publicKey.verify(1, this.context, arrayOfByte, 0, 64, paramArrayOfbyte, 0);
  }
  
  public void reset() {
    this.prehash.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\signers\Ed448phSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */