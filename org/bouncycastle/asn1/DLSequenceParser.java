package org.bouncycastle.asn1;

import java.io.IOException;

public class DLSequenceParser implements ASN1SequenceParser {
  private ASN1StreamParser _parser;
  
  DLSequenceParser(ASN1StreamParser paramASN1StreamParser) {
    this._parser = paramASN1StreamParser;
  }
  
  public ASN1Encodable readObject() throws IOException {
    return this._parser.readObject();
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return DLFactory.createSequence(this._parser.readVector());
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      return getLoadedObject();
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException.getMessage());
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\DLSequenceParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */