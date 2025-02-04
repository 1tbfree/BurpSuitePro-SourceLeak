package org.bouncycastle.cert.jcajce;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.cert.X509CertificateHolder;

public class JcaX509CertificateHolder extends X509CertificateHolder {
  public JcaX509CertificateHolder(X509Certificate paramX509Certificate) throws CertificateEncodingException {
    super(Certificate.getInstance(paramX509Certificate.getEncoded()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\jcajce\JcaX509CertificateHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */