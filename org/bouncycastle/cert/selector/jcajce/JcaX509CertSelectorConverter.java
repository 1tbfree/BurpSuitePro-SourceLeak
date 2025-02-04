package org.bouncycastle.cert.selector.jcajce;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.X509CertSelector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;
import org.bouncycastle.util.Exceptions;

public class JcaX509CertSelectorConverter {
  protected X509CertSelector doConversion(X500Name paramX500Name, BigInteger paramBigInteger, byte[] paramArrayOfbyte) {
    X509CertSelector x509CertSelector = new X509CertSelector();
    if (paramX500Name != null)
      try {
        x509CertSelector.setIssuer(paramX500Name.getEncoded());
      } catch (IOException iOException) {
        throw Exceptions.illegalArgumentException("unable to convert issuer: " + iOException.getMessage(), iOException);
      }  
    if (paramBigInteger != null)
      x509CertSelector.setSerialNumber(paramBigInteger); 
    if (paramArrayOfbyte != null)
      try {
        x509CertSelector.setSubjectKeyIdentifier((new DEROctetString(paramArrayOfbyte)).getEncoded());
      } catch (IOException iOException) {
        throw Exceptions.illegalArgumentException("unable to convert subjectKeyIdentifier: " + iOException.getMessage(), iOException);
      }  
    return x509CertSelector;
  }
  
  public X509CertSelector getCertSelector(X509CertificateHolderSelector paramX509CertificateHolderSelector) {
    return doConversion(paramX509CertificateHolderSelector.getIssuer(), paramX509CertificateHolderSelector.getSerialNumber(), paramX509CertificateHolderSelector.getSubjectKeyIdentifier());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\selector\jcajce\JcaX509CertSelectorConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */