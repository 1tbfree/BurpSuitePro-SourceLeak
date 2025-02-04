package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Tag;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1Type;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.DEROctetString;

abstract class ASN1UniversalType extends ASN1Type {
  final ASN1Tag tag;
  
  ASN1UniversalType(Class paramClass, int paramInt) {
    super(paramClass);
    this.tag = ASN1Tag.create(0, paramInt);
  }
  
  final ASN1Primitive checkedCast(ASN1Primitive paramASN1Primitive) {
    if (this.javaClass.isInstance(paramASN1Primitive))
      return paramASN1Primitive; 
    throw new IllegalStateException("unexpected object: " + paramASN1Primitive.getClass().getName());
  }
  
  ASN1Primitive fromImplicitPrimitive(DEROctetString paramDEROctetString) {
    throw new IllegalStateException("unexpected implicit primitive encoding");
  }
  
  ASN1Primitive fromImplicitConstructed(ASN1Sequence paramASN1Sequence) {
    throw new IllegalStateException("unexpected implicit constructed encoding");
  }
  
  final ASN1Primitive fromByteArray(byte[] paramArrayOfbyte) throws IOException {
    return checkedCast(ASN1Primitive.fromByteArray(paramArrayOfbyte));
  }
  
  final ASN1Primitive getContextInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return checkedCast(ASN1Util.checkContextTagClass(paramASN1TaggedObject).getBaseUniversal(paramBoolean, this));
  }
  
  final ASN1Tag getTag() {
    return this.tag;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1UniversalType.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */