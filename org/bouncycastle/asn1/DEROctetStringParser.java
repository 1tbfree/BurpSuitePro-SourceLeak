package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

public class DEROctetStringParser implements ASN1OctetStringParser {
  private DefiniteLengthInputStream stream;
  
  DEROctetStringParser(DefiniteLengthInputStream paramDefiniteLengthInputStream) {
    this.stream = paramDefiniteLengthInputStream;
  }
  
  public InputStream getOctetStream() {
    return this.stream;
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return new DEROctetString(this.stream.toByteArray());
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      return getLoadedObject();
    } catch (IOException iOException) {
      throw new ASN1ParsingException("IOException converting stream to byte array: " + iOException.getMessage(), iOException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DEROctetStringParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */