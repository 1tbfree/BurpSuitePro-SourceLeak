package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

public class X509StoreLDAPAttrCerts extends X509StoreSpi {
  private LDAPStoreHelper helper;
  
  public void engineInit(X509StoreParameters paramX509StoreParameters) {
    if (!(paramX509StoreParameters instanceof X509LDAPCertStoreParameters))
      throw new IllegalArgumentException("Initialization parameters must be an instance of " + X509LDAPCertStoreParameters.class.getName() + "."); 
    this.helper = new LDAPStoreHelper((X509LDAPCertStoreParameters)paramX509StoreParameters);
  }
  
  public Collection engineGetMatches(Selector paramSelector) throws StoreException {
    if (!(paramSelector instanceof X509AttributeCertStoreSelector))
      return Collections.EMPTY_SET; 
    X509AttributeCertStoreSelector x509AttributeCertStoreSelector = (X509AttributeCertStoreSelector)paramSelector;
    HashSet hashSet = new HashSet();
    hashSet.addAll(this.helper.getAACertificates(x509AttributeCertStoreSelector));
    hashSet.addAll(this.helper.getAttributeCertificateAttributes(x509AttributeCertStoreSelector));
    hashSet.addAll(this.helper.getAttributeDescriptorCertificates(x509AttributeCertStoreSelector));
    return hashSet;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\provider\X509StoreLDAPAttrCerts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */