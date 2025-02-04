package org.bouncycastle.asn1;

public class DLExternal extends ASN1External {
  public DLExternal(ASN1EncodableVector paramASN1EncodableVector) {
    this(DLFactory.createSequence(paramASN1EncodableVector));
  }
  
  public DLExternal(DLSequence paramDLSequence) {
    super(paramDLSequence);
  }
  
  public DLExternal(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Integer paramASN1Integer, ASN1Primitive paramASN1Primitive, DERTaggedObject paramDERTaggedObject) {
    super(paramASN1ObjectIdentifier, paramASN1Integer, paramASN1Primitive, paramDERTaggedObject);
  }
  
  public DLExternal(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Integer paramASN1Integer, ASN1Primitive paramASN1Primitive1, int paramInt, ASN1Primitive paramASN1Primitive2) {
    super(paramASN1ObjectIdentifier, paramASN1Integer, paramASN1Primitive1, paramInt, paramASN1Primitive2);
  }
  
  ASN1Sequence buildSequence() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    if (this.directReference != null)
      aSN1EncodableVector.add(this.directReference); 
    if (this.indirectReference != null)
      aSN1EncodableVector.add(this.indirectReference); 
    if (this.dataValueDescriptor != null)
      aSN1EncodableVector.add(this.dataValueDescriptor.toDLObject()); 
    aSN1EncodableVector.add(new DLTaggedObject((0 == this.encoding), this.encoding, this.externalContent));
    return new DLSequence(aSN1EncodableVector);
  }
  
  ASN1Primitive toDLObject() {
    return this;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DLExternal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */