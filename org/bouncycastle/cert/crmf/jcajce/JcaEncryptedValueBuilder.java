package org.bouncycastle.cert.crmf.jcajce;

import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cert.crmf.EncryptedValueBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.operator.KeyWrapper;
import org.bouncycastle.operator.OutputEncryptor;

public class JcaEncryptedValueBuilder extends EncryptedValueBuilder {
  public JcaEncryptedValueBuilder(KeyWrapper paramKeyWrapper, OutputEncryptor paramOutputEncryptor) {
    super(paramKeyWrapper, paramOutputEncryptor);
  }
  
  public EncryptedValue build(X509Certificate paramX509Certificate) throws CertificateEncodingException, CRMFException {
    return build((X509CertificateHolder)new JcaX509CertificateHolder(paramX509Certificate));
  }
  
  public EncryptedValue build(PrivateKey paramPrivateKey) throws CertificateEncodingException, CRMFException {
    return build(PrivateKeyInfo.getInstance(paramPrivateKey.getEncoded()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\jcajce\JcaEncryptedValueBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */