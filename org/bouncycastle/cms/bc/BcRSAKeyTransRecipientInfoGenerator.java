package org.bouncycastle.cms.bc;

import java.io.IOException;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.operator.bc.BcAsymmetricKeyWrapper;
import org.bouncycastle.operator.bc.BcRSAAsymmetricKeyWrapper;

public class BcRSAKeyTransRecipientInfoGenerator extends BcKeyTransRecipientInfoGenerator {
  public BcRSAKeyTransRecipientInfoGenerator(byte[] paramArrayOfbyte, AlgorithmIdentifier paramAlgorithmIdentifier, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    super(paramArrayOfbyte, (BcAsymmetricKeyWrapper)new BcRSAAsymmetricKeyWrapper(paramAlgorithmIdentifier, paramAsymmetricKeyParameter));
  }
  
  public BcRSAKeyTransRecipientInfoGenerator(X509CertificateHolder paramX509CertificateHolder) throws IOException {
    super(paramX509CertificateHolder, (BcAsymmetricKeyWrapper)new BcRSAAsymmetricKeyWrapper(paramX509CertificateHolder.getSubjectPublicKeyInfo().getAlgorithm(), paramX509CertificateHolder.getSubjectPublicKeyInfo()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\bc\BcRSAKeyTransRecipientInfoGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */