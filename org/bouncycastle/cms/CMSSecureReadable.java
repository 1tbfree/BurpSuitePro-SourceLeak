package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;

interface CMSSecureReadable {
  ASN1ObjectIdentifier getContentType();
  
  InputStream getInputStream() throws IOException, CMSException;
  
  ASN1Set getAuthAttrSet();
  
  void setAuthAttrSet(ASN1Set paramASN1Set);
  
  boolean hasAdditionalData();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\CMSSecureReadable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */