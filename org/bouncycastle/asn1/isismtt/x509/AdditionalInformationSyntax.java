package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.DirectoryString;

public class AdditionalInformationSyntax extends ASN1Object {
  private DirectoryString information;
  
  public static AdditionalInformationSyntax getInstance(Object paramObject) {
    return (paramObject instanceof AdditionalInformationSyntax) ? (AdditionalInformationSyntax)paramObject : ((paramObject != null) ? new AdditionalInformationSyntax(DirectoryString.getInstance(paramObject)) : null);
  }
  
  private AdditionalInformationSyntax(DirectoryString paramDirectoryString) {
    this.information = paramDirectoryString;
  }
  
  public AdditionalInformationSyntax(String paramString) {
    this(new DirectoryString(paramString));
  }
  
  public DirectoryString getInformation() {
    return this.information;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return this.information.toASN1Primitive();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\isismtt\x509\AdditionalInformationSyntax.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */