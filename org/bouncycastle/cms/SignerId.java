package org.bouncycastle.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.selector.X509CertificateHolderSelector;
import org.bouncycastle.util.Selector;

public class SignerId implements Selector {
  private X509CertificateHolderSelector baseSelector;
  
  private SignerId(X509CertificateHolderSelector paramX509CertificateHolderSelector) {
    this.baseSelector = paramX509CertificateHolderSelector;
  }
  
  public SignerId(byte[] paramArrayOfbyte) {
    this(null, null, paramArrayOfbyte);
  }
  
  public SignerId(X500Name paramX500Name, BigInteger paramBigInteger) {
    this(paramX500Name, paramBigInteger, null);
  }
  
  public SignerId(X500Name paramX500Name, BigInteger paramBigInteger, byte[] paramArrayOfbyte) {
    this(new X509CertificateHolderSelector(paramX500Name, paramBigInteger, paramArrayOfbyte));
  }
  
  public X500Name getIssuer() {
    return this.baseSelector.getIssuer();
  }
  
  public BigInteger getSerialNumber() {
    return this.baseSelector.getSerialNumber();
  }
  
  public byte[] getSubjectKeyIdentifier() {
    return this.baseSelector.getSubjectKeyIdentifier();
  }
  
  public int hashCode() {
    return this.baseSelector.hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof SignerId))
      return false; 
    SignerId signerId = (SignerId)paramObject;
    return this.baseSelector.equals(signerId.baseSelector);
  }
  
  public boolean match(Object paramObject) {
    return (paramObject instanceof SignerInformation) ? ((SignerInformation)paramObject).getSID().equals(this) : this.baseSelector.match(paramObject);
  }
  
  public Object clone() {
    return new SignerId(this.baseSelector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\SignerId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */