package org.bouncycastle.cert.crmf;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.cert.CertIOException;

class CRMFUtil {
  static void derEncodeToStream(ASN1Object paramASN1Object, OutputStream paramOutputStream) {
    try {
      paramASN1Object.encodeTo(paramOutputStream, "DER");
      paramOutputStream.close();
    } catch (IOException iOException) {
      throw new CRMFRuntimeException("unable to DER encode object: " + iOException.getMessage(), iOException);
    } 
  }
  
  static void addExtension(ExtensionsGenerator paramExtensionsGenerator, ASN1ObjectIdentifier paramASN1ObjectIdentifier, boolean paramBoolean, ASN1Encodable paramASN1Encodable) throws CertIOException {
    try {
      paramExtensionsGenerator.addExtension(paramASN1ObjectIdentifier, paramBoolean, paramASN1Encodable);
    } catch (IOException iOException) {
      throw new CertIOException("cannot encode extension: " + iOException.getMessage(), iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\CRMFUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */