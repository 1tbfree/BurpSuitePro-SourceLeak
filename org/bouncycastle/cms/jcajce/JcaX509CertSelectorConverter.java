package org.bouncycastle.cms.jcajce;

import java.security.cert.X509CertSelector;
import org.bouncycastle.cert.selector.jcajce.JcaX509CertSelectorConverter;
import org.bouncycastle.cms.KeyTransRecipientId;
import org.bouncycastle.cms.SignerId;

public class JcaX509CertSelectorConverter extends JcaX509CertSelectorConverter {
  public X509CertSelector getCertSelector(KeyTransRecipientId paramKeyTransRecipientId) {
    return doConversion(paramKeyTransRecipientId.getIssuer(), paramKeyTransRecipientId.getSerialNumber(), paramKeyTransRecipientId.getSubjectKeyIdentifier());
  }
  
  public X509CertSelector getCertSelector(SignerId paramSignerId) {
    return doConversion(paramSignerId.getIssuer(), paramSignerId.getSerialNumber(), paramSignerId.getSubjectKeyIdentifier());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\jcajce\JcaX509CertSelectorConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */