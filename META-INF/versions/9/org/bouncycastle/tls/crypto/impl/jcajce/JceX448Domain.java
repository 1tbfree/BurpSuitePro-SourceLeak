package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsECDomain;
import org.bouncycastle.tls.crypto.impl.jcajce.Exceptions;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JceTlsSecret;
import org.bouncycastle.tls.crypto.impl.jcajce.JceX448;
import org.bouncycastle.tls.crypto.impl.jcajce.XDHUtil;
import org.bouncycastle.util.Arrays;

public class JceX448Domain implements TlsECDomain {
  protected final JcaTlsCrypto crypto;
  
  public JceX448Domain(JcaTlsCrypto paramJcaTlsCrypto) {
    this.crypto = paramJcaTlsCrypto;
  }
  
  public JceTlsSecret calculateECDHAgreement(PrivateKey paramPrivateKey, PublicKey paramPublicKey) throws IOException {
    try {
      byte[] arrayOfByte = this.crypto.calculateKeyAgreement("X448", paramPrivateKey, paramPublicKey, "TlsPremasterSecret");
      if (arrayOfByte == null || arrayOfByte.length != 56)
        throw new TlsCryptoException("invalid secret calculated"); 
      if (Arrays.areAllZeroes(arrayOfByte, 0, arrayOfByte.length))
        throw new TlsFatalAlert((short)40); 
      return this.crypto.adoptLocalSecret(arrayOfByte);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("cannot calculate secret", generalSecurityException);
    } 
  }
  
  public TlsAgreement createECDH() {
    return (TlsAgreement)new JceX448(this);
  }
  
  public PublicKey decodePublicKey(byte[] paramArrayOfbyte) throws IOException {
    return XDHUtil.decodePublicKey(this.crypto, "X448", EdECObjectIdentifiers.id_X448, paramArrayOfbyte);
  }
  
  public byte[] encodePublicKey(PublicKey paramPublicKey) throws IOException {
    return XDHUtil.encodePublicKey(paramPublicKey);
  }
  
  public KeyPair generateKeyPair() {
    try {
      KeyPairGenerator keyPairGenerator = this.crypto.getHelper().createKeyPairGenerator("X448");
      keyPairGenerator.initialize(448, this.crypto.getSecureRandom());
      return keyPairGenerator.generateKeyPair();
    } catch (GeneralSecurityException generalSecurityException) {
      throw Exceptions.illegalStateException("unable to create key pair: " + generalSecurityException.getMessage(), generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JceX448Domain.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */