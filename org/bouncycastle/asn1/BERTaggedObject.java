package org.bouncycastle.asn1;

import java.io.IOException;

public class BERTaggedObject extends ASN1TaggedObject {
  public BERTaggedObject(int paramInt, ASN1Encodable paramASN1Encodable) {
    super(true, paramInt, paramASN1Encodable);
  }
  
  public BERTaggedObject(int paramInt1, int paramInt2, ASN1Encodable paramASN1Encodable) {
    super(true, paramInt1, paramInt2, paramASN1Encodable);
  }
  
  public BERTaggedObject(boolean paramBoolean, int paramInt, ASN1Encodable paramASN1Encodable) {
    super(paramBoolean, paramInt, paramASN1Encodable);
  }
  
  public BERTaggedObject(boolean paramBoolean, int paramInt1, int paramInt2, ASN1Encodable paramASN1Encodable) {
    super(paramBoolean, paramInt1, paramInt2, paramASN1Encodable);
  }
  
  BERTaggedObject(int paramInt1, int paramInt2, int paramInt3, ASN1Encodable paramASN1Encodable) {
    super(paramInt1, paramInt2, paramInt3, paramASN1Encodable);
  }
  
  boolean encodeConstructed() {
    return (isExplicit() || this.obj.toASN1Primitive().encodeConstructed());
  }
  
  int encodedLength(boolean paramBoolean) throws IOException {
    ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
    boolean bool = isExplicit();
    int i = aSN1Primitive.encodedLength(bool);
    if (bool)
      i += 3; 
    i += paramBoolean ? ASN1OutputStream.getLengthOfIdentifier(this.tagNo) : 0;
    return i;
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    ASN1Primitive aSN1Primitive = this.obj.toASN1Primitive();
    boolean bool = isExplicit();
    if (paramBoolean) {
      int i = this.tagClass;
      if (bool || aSN1Primitive.encodeConstructed())
        i |= 0x20; 
      paramASN1OutputStream.writeIdentifier(true, i, this.tagNo);
    } 
    if (bool) {
      paramASN1OutputStream.write(128);
      aSN1Primitive.encode(paramASN1OutputStream, true);
      paramASN1OutputStream.write(0);
      paramASN1OutputStream.write(0);
    } else {
      aSN1Primitive.encode(paramASN1OutputStream, false);
    } 
  }
  
  ASN1Sequence rebuildConstructed(ASN1Primitive paramASN1Primitive) {
    return new BERSequence(paramASN1Primitive);
  }
  
  ASN1TaggedObject replaceTag(int paramInt1, int paramInt2) {
    return new BERTaggedObject(this.explicitness, paramInt1, paramInt2, this.obj);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\BERTaggedObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */