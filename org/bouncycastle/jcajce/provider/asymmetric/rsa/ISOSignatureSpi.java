package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.signers.ISO9796d2Signer;
import org.bouncycastle.crypto.util.DigestFactory;

public class ISOSignatureSpi extends SignatureSpi {
  private ISO9796d2Signer signer;
  
  protected ISOSignatureSpi(Digest paramDigest, AsymmetricBlockCipher paramAsymmetricBlockCipher) {
    this.signer = new ISO9796d2Signer(paramAsymmetricBlockCipher, paramDigest, true);
  }
  
  protected void engineInitVerify(PublicKey paramPublicKey) throws InvalidKeyException {
    RSAKeyParameters rSAKeyParameters = RSAUtil.generatePublicKeyParameter((RSAPublicKey)paramPublicKey);
    this.signer.init(false, (CipherParameters)rSAKeyParameters);
  }
  
  protected void engineInitSign(PrivateKey paramPrivateKey) throws InvalidKeyException {
    RSAKeyParameters rSAKeyParameters = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey)paramPrivateKey);
    this.signer.init(true, (CipherParameters)rSAKeyParameters);
  }
  
  protected void engineUpdate(byte paramByte) throws SignatureException {
    this.signer.update(paramByte);
  }
  
  protected void engineUpdate(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws SignatureException {
    this.signer.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  protected byte[] engineSign() throws SignatureException {
    try {
      return this.signer.generateSignature();
    } catch (Exception exception) {
      throw new SignatureException(exception.toString());
    } 
  }
  
  protected boolean engineVerify(byte[] paramArrayOfbyte) throws SignatureException {
    return this.signer.verifySignature(paramArrayOfbyte);
  }
  
  protected void engineSetParameter(AlgorithmParameterSpec paramAlgorithmParameterSpec) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected void engineSetParameter(String paramString, Object paramObject) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  protected Object engineGetParameter(String paramString) {
    throw new UnsupportedOperationException("engineSetParameter unsupported");
  }
  
  public static class MD5WithRSAEncryption extends ISOSignatureSpi {
    public MD5WithRSAEncryption() {
      super(DigestFactory.createMD5(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class RIPEMD160WithRSAEncryption extends ISOSignatureSpi {
    public RIPEMD160WithRSAEncryption() {
      super((Digest)new RIPEMD160Digest(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA1WithRSAEncryption extends ISOSignatureSpi {
    public SHA1WithRSAEncryption() {
      super(DigestFactory.createSHA1(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA224WithRSAEncryption extends ISOSignatureSpi {
    public SHA224WithRSAEncryption() {
      super(DigestFactory.createSHA224(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA256WithRSAEncryption extends ISOSignatureSpi {
    public SHA256WithRSAEncryption() {
      super(DigestFactory.createSHA256(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA384WithRSAEncryption extends ISOSignatureSpi {
    public SHA384WithRSAEncryption() {
      super(DigestFactory.createSHA384(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA512WithRSAEncryption extends ISOSignatureSpi {
    public SHA512WithRSAEncryption() {
      super(DigestFactory.createSHA512(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA512_224WithRSAEncryption extends ISOSignatureSpi {
    public SHA512_224WithRSAEncryption() {
      super(DigestFactory.createSHA512_224(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class SHA512_256WithRSAEncryption extends ISOSignatureSpi {
    public SHA512_256WithRSAEncryption() {
      super(DigestFactory.createSHA512_256(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
  
  public static class WhirlpoolWithRSAEncryption extends ISOSignatureSpi {
    public WhirlpoolWithRSAEncryption() {
      super((Digest)new WhirlpoolDigest(), (AsymmetricBlockCipher)new RSABlindedEngine());
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\rsa\ISOSignatureSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */