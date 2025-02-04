package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.GeneralName;

public class EncKeyWithID extends ASN1Object {
  private final PrivateKeyInfo privKeyInfo;
  
  private final ASN1Encodable identifier;
  
  public static EncKeyWithID getInstance(Object paramObject) {
    return (paramObject instanceof EncKeyWithID) ? (EncKeyWithID)paramObject : ((paramObject != null) ? new EncKeyWithID(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private EncKeyWithID(ASN1Sequence paramASN1Sequence) {
    this.privKeyInfo = PrivateKeyInfo.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() > 1) {
      if (!(paramASN1Sequence.getObjectAt(1) instanceof ASN1UTF8String)) {
        this.identifier = (ASN1Encodable)GeneralName.getInstance(paramASN1Sequence.getObjectAt(1));
      } else {
        this.identifier = paramASN1Sequence.getObjectAt(1);
      } 
    } else {
      this.identifier = null;
    } 
  }
  
  public EncKeyWithID(PrivateKeyInfo paramPrivateKeyInfo) {
    this.privKeyInfo = paramPrivateKeyInfo;
    this.identifier = null;
  }
  
  public EncKeyWithID(PrivateKeyInfo paramPrivateKeyInfo, ASN1UTF8String paramASN1UTF8String) {
    this.privKeyInfo = paramPrivateKeyInfo;
    this.identifier = (ASN1Encodable)paramASN1UTF8String;
  }
  
  public EncKeyWithID(PrivateKeyInfo paramPrivateKeyInfo, GeneralName paramGeneralName) {
    this.privKeyInfo = paramPrivateKeyInfo;
    this.identifier = (ASN1Encodable)paramGeneralName;
  }
  
  public PrivateKeyInfo getPrivateKey() {
    return this.privKeyInfo;
  }
  
  public boolean hasIdentifier() {
    return (this.identifier != null);
  }
  
  public boolean isIdentifierUTF8String() {
    return this.identifier instanceof ASN1UTF8String;
  }
  
  public ASN1Encodable getIdentifier() {
    return this.identifier;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.privKeyInfo);
    if (this.identifier != null)
      aSN1EncodableVector.add(this.identifier); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\crmf\EncKeyWithID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */