package org.bouncycastle.pkcs.jcajce;

import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;

public class JcaPKCS10CertificationRequestBuilder extends PKCS10CertificationRequestBuilder {
  public JcaPKCS10CertificationRequestBuilder(X500Name paramX500Name, PublicKey paramPublicKey) {
    super(paramX500Name, SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
  }
  
  public JcaPKCS10CertificationRequestBuilder(X500Principal paramX500Principal, PublicKey paramPublicKey) {
    super(X500Name.getInstance(paramX500Principal.getEncoded()), SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()));
  }
  
  public PKCS10CertificationRequest build(ContentSigner paramContentSigner1, PublicKey paramPublicKey, ContentSigner paramContentSigner2) {
    return build(paramContentSigner1, SubjectPublicKeyInfo.getInstance(paramPublicKey.getEncoded()), paramContentSigner2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\jcajce\JcaPKCS10CertificationRequestBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */