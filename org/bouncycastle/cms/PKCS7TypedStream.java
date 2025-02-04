package org.bouncycastle.cms;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public class PKCS7TypedStream extends CMSTypedStream {
  private final ASN1Encodable content;
  
  public PKCS7TypedStream(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) throws IOException {
    super(paramASN1ObjectIdentifier);
    this.content = paramASN1Encodable;
  }
  
  public ASN1Encodable getContent() {
    return this.content;
  }
  
  public InputStream getContentStream() {
    try {
      return getContentStream(this.content);
    } catch (IOException iOException) {
      throw new CMSRuntimeException("unable to convert content to stream: " + iOException.getMessage(), iOException);
    } 
  }
  
  public void drain() throws IOException {
    this.content.toASN1Primitive();
  }
  
  private InputStream getContentStream(ASN1Encodable paramASN1Encodable) throws IOException {
    byte[] arrayOfByte = paramASN1Encodable.toASN1Primitive().getEncoded("DER");
    int i = 0;
    if ((arrayOfByte[i++] & 0x1F) == 31)
      while ((arrayOfByte[i++] & 0x80) != 0); 
    byte b = arrayOfByte[i++];
    if ((b & 0x80) != 0)
      i += b & Byte.MAX_VALUE; 
    return new ByteArrayInputStream(arrayOfByte, i, arrayOfByte.length - i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\PKCS7TypedStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */