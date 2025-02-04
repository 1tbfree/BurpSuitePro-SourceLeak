package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class CAKeyUpdAnnContent extends ASN1Object {
  private final CMPCertificate oldWithNew;
  
  private final CMPCertificate newWithOld;
  
  private final CMPCertificate newWithNew;
  
  private CAKeyUpdAnnContent(ASN1Sequence paramASN1Sequence) {
    this.oldWithNew = CMPCertificate.getInstance(paramASN1Sequence.getObjectAt(0));
    this.newWithOld = CMPCertificate.getInstance(paramASN1Sequence.getObjectAt(1));
    this.newWithNew = CMPCertificate.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public CAKeyUpdAnnContent(CMPCertificate paramCMPCertificate1, CMPCertificate paramCMPCertificate2, CMPCertificate paramCMPCertificate3) {
    this.oldWithNew = paramCMPCertificate1;
    this.newWithOld = paramCMPCertificate2;
    this.newWithNew = paramCMPCertificate3;
  }
  
  public static CAKeyUpdAnnContent getInstance(Object paramObject) {
    return (paramObject instanceof CAKeyUpdAnnContent) ? (CAKeyUpdAnnContent)paramObject : ((paramObject != null) ? new CAKeyUpdAnnContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CMPCertificate getOldWithNew() {
    return this.oldWithNew;
  }
  
  public CMPCertificate getNewWithOld() {
    return this.newWithOld;
  }
  
  public CMPCertificate getNewWithNew() {
    return this.newWithNew;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.oldWithNew);
    aSN1EncodableVector.add((ASN1Encodable)this.newWithOld);
    aSN1EncodableVector.add((ASN1Encodable)this.newWithNew);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CAKeyUpdAnnContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */