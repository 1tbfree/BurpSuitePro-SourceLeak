package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public abstract class ASN1T61String extends ASN1Primitive implements ASN1String {
  static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1T61String.class, 20) {
      ASN1Primitive fromImplicitPrimitive(DEROctetString param1DEROctetString) {
        return ASN1T61String.createPrimitive(param1DEROctetString.getOctets());
      }
    };
  
  final byte[] contents;
  
  public static ASN1T61String getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof ASN1T61String)
      return (ASN1T61String)paramObject; 
    if (paramObject instanceof ASN1Encodable) {
      ASN1Primitive aSN1Primitive = ((ASN1Encodable)paramObject).toASN1Primitive();
      if (aSN1Primitive instanceof ASN1T61String)
        return (ASN1T61String)aSN1Primitive; 
    } 
    if (paramObject instanceof byte[])
      try {
        return (ASN1T61String)TYPE.fromByteArray((byte[])paramObject);
      } catch (Exception exception) {
        throw new IllegalArgumentException("encoding error in getInstance: " + exception.toString());
      }  
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static ASN1T61String getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return (ASN1T61String)TYPE.getContextInstance(paramASN1TaggedObject, paramBoolean);
  }
  
  ASN1T61String(String paramString) {
    this.contents = Strings.toByteArray(paramString);
  }
  
  ASN1T61String(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.contents = paramBoolean ? Arrays.clone(paramArrayOfbyte) : paramArrayOfbyte;
  }
  
  public final String getString() {
    return Strings.fromByteArray(this.contents);
  }
  
  public String toString() {
    return getString();
  }
  
  final boolean encodeConstructed() {
    return false;
  }
  
  final int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, this.contents.length);
  }
  
  final void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 20, this.contents);
  }
  
  public final byte[] getOctets() {
    return Arrays.clone(this.contents);
  }
  
  final boolean asn1Equals(ASN1Primitive paramASN1Primitive) {
    if (!(paramASN1Primitive instanceof ASN1T61String))
      return false; 
    ASN1T61String aSN1T61String = (ASN1T61String)paramASN1Primitive;
    return Arrays.areEqual(this.contents, aSN1T61String.contents);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(this.contents);
  }
  
  static ASN1T61String createPrimitive(byte[] paramArrayOfbyte) {
    return new DERT61String(paramArrayOfbyte, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\ASN1T61String.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */