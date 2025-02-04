package org.bouncycastle.asn1;

import java.io.IOException;

public class DEROctetString extends ASN1OctetString {
  public DEROctetString(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
  }
  
  public DEROctetString(ASN1Encodable paramASN1Encodable) throws IOException {
    super(paramASN1Encodable.toASN1Primitive().getEncoded("DER"));
  }
  
  boolean encodeConstructed() {
    return false;
  }
  
  int encodedLength(boolean paramBoolean) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, this.string.length);
  }
  
  void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 4, this.string);
  }
  
  ASN1Primitive toDERObject() {
    return this;
  }
  
  ASN1Primitive toDLObject() {
    return this;
  }
  
  static void encode(ASN1OutputStream paramASN1OutputStream, boolean paramBoolean, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    paramASN1OutputStream.writeEncodingDL(paramBoolean, 4, paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  static int encodedLength(boolean paramBoolean, int paramInt) {
    return ASN1OutputStream.getLengthOfEncodingDL(paramBoolean, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DEROctetString.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */