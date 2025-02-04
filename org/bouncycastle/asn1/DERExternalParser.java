package org.bouncycastle.asn1;

import java.io.IOException;

public class DERExternalParser implements ASN1ExternalParser {
  private ASN1StreamParser _parser;
  
  public DERExternalParser(ASN1StreamParser paramASN1StreamParser) {
    this._parser = paramASN1StreamParser;
  }
  
  public ASN1Encodable readObject() throws IOException {
    return this._parser.readObject();
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return parse(this._parser);
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      return getLoadedObject();
    } catch (IOException iOException) {
      throw new ASN1ParsingException("unable to get DER object", iOException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new ASN1ParsingException("unable to get DER object", illegalArgumentException);
    } 
  }
  
  static DLExternal parse(ASN1StreamParser paramASN1StreamParser) throws IOException {
    try {
      return new DLExternal(new DLSequence(paramASN1StreamParser.readVector()));
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new ASN1Exception(illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DERExternalParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */