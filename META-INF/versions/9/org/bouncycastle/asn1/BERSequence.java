package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERBitString;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSet;

public class BERSequence extends ASN1Sequence {
  public BERSequence() {}
  
  public BERSequence(ASN1Encodable paramASN1Encodable) {
    super(paramASN1Encodable);
  }
  
  public BERSequence(ASN1EncodableVector paramASN1EncodableVector) {
    super(paramASN1EncodableVector);
  }
  
  public BERSequence(ASN1Encodable[] paramArrayOfASN1Encodable) {
    super(paramArrayOfASN1Encodable);
  }
  
  int encodedLength(boolean paramBoolean) throws IOException {
    int i = paramBoolean ? 4 : 3;
    byte b = 0;
    int j = this.elements.length;
    while (b < j) {
      ASN1Primitive aSN1Primitive = this.elements[b].toASN1Primitive();
      i += aSN1Primitive.encodedLength(true);
      b++;
    } 
    return i;
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingIL(paramBoolean, 48, this.elements);
  }
  
  ASN1BitString toASN1BitString() {
    return (ASN1BitString)new BERBitString(getConstructedBitStrings());
  }
  
  ASN1External toASN1External() {
    return ((ASN1Sequence)toDLObject()).toASN1External();
  }
  
  ASN1OctetString toASN1OctetString() {
    return (ASN1OctetString)new BEROctetString(getConstructedOctetStrings());
  }
  
  ASN1Set toASN1Set() {
    return (ASN1Set)new BERSet(false, toArrayInternal());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\BERSequence.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */