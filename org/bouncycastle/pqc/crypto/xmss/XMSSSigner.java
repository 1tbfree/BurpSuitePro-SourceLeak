package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.util.Arrays;

public class XMSSSigner implements StateAwareMessageSigner {
  private XMSSPrivateKeyParameters privateKey;
  
  private XMSSPublicKeyParameters publicKey;
  
  private XMSSParameters params;
  
  private WOTSPlus wotsPlus;
  
  private KeyedHashFunctions khf;
  
  private boolean initSign;
  
  private boolean hasGenerated;
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) {
    if (paramBoolean) {
      this.initSign = true;
      this.hasGenerated = false;
      this.privateKey = (XMSSPrivateKeyParameters)paramCipherParameters;
      this.params = this.privateKey.getParameters();
    } else {
      this.initSign = false;
      this.publicKey = (XMSSPublicKeyParameters)paramCipherParameters;
      this.params = this.publicKey.getParameters();
    } 
    this.wotsPlus = this.params.getWOTSPlus();
    this.khf = this.wotsPlus.getKhf();
  }
  
  public byte[] generateSignature(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      throw new NullPointerException("message == null"); 
    if (this.initSign) {
      if (this.privateKey == null)
        throw new IllegalStateException("signing key no longer usable"); 
    } else {
      throw new IllegalStateException("signer not initialized for signature generation");
    } 
    synchronized (this.privateKey) {
      if (this.privateKey.getUsagesRemaining() <= 0L)
        throw new ExhaustedPrivateKeyException("no usages of private key remaining"); 
      if (this.privateKey.getBDSState().getAuthenticationPath().isEmpty())
        throw new IllegalStateException("not initialized"); 
      try {
        int i = this.privateKey.getIndex();
        this.hasGenerated = true;
        byte[] arrayOfByte1 = this.khf.PRF(this.privateKey.getSecretKeyPRF(), XMSSUtil.toBytesBigEndian(i, 32));
        byte[] arrayOfByte2 = Arrays.concatenate(arrayOfByte1, this.privateKey.getRoot(), XMSSUtil.toBytesBigEndian(i, this.params.getTreeDigestSize()));
        byte[] arrayOfByte3 = this.khf.HMsg(arrayOfByte2, paramArrayOfbyte);
        OTSHashAddress oTSHashAddress = (OTSHashAddress)(new OTSHashAddress.Builder()).withOTSAddress(i).build();
        WOTSPlusSignature wOTSPlusSignature = wotsSign(arrayOfByte3, oTSHashAddress);
        return (new XMSSSignature.Builder(this.params)).withIndex(i).withRandom(arrayOfByte1).withWOTSPlusSignature(wOTSPlusSignature).withAuthPath(this.privateKey.getBDSState().getAuthenticationPath()).build().toByteArray();
      } finally {
        this.privateKey.getBDSState().markUsed();
        this.privateKey.rollKey();
      } 
    } 
  }
  
  public long getUsagesRemaining() {
    return this.privateKey.getUsagesRemaining();
  }
  
  public boolean verifySignature(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    XMSSSignature xMSSSignature = (new XMSSSignature.Builder(this.params)).withSignature(paramArrayOfbyte2).build();
    int i = xMSSSignature.getIndex();
    this.wotsPlus.importKeys(new byte[this.params.getTreeDigestSize()], this.publicKey.getPublicSeed());
    byte[] arrayOfByte1 = Arrays.concatenate(xMSSSignature.getRandom(), this.publicKey.getRoot(), XMSSUtil.toBytesBigEndian(i, this.params.getTreeDigestSize()));
    byte[] arrayOfByte2 = this.khf.HMsg(arrayOfByte1, paramArrayOfbyte1);
    int j = this.params.getHeight();
    int k = XMSSUtil.getLeafIndex(i, j);
    OTSHashAddress oTSHashAddress = (OTSHashAddress)(new OTSHashAddress.Builder()).withOTSAddress(i).build();
    XMSSNode xMSSNode = XMSSVerifierUtil.getRootNodeFromSignature(this.wotsPlus, j, arrayOfByte2, xMSSSignature, oTSHashAddress, k);
    return Arrays.constantTimeAreEqual(xMSSNode.getValue(), this.publicKey.getRoot());
  }
  
  public AsymmetricKeyParameter getUpdatedPrivateKey() {
    synchronized (this.privateKey) {
      if (this.hasGenerated) {
        XMSSPrivateKeyParameters xMSSPrivateKeyParameters1 = this.privateKey;
        this.privateKey = null;
        return xMSSPrivateKeyParameters1;
      } 
      XMSSPrivateKeyParameters xMSSPrivateKeyParameters = this.privateKey;
      if (xMSSPrivateKeyParameters != null)
        this.privateKey = this.privateKey.getNextKey(); 
      return xMSSPrivateKeyParameters;
    } 
  }
  
  private WOTSPlusSignature wotsSign(byte[] paramArrayOfbyte, OTSHashAddress paramOTSHashAddress) {
    if (paramArrayOfbyte.length != this.params.getTreeDigestSize())
      throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest"); 
    if (paramOTSHashAddress == null)
      throw new NullPointerException("otsHashAddress == null"); 
    this.wotsPlus.importKeys(this.wotsPlus.getWOTSPlusSecretKey(this.privateKey.getSecretKeySeed(), paramOTSHashAddress), this.privateKey.getPublicSeed());
    return this.wotsPlus.sign(paramArrayOfbyte, paramOTSHashAddress);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xmss\XMSSSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */