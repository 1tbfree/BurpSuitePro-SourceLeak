package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.ConstructedOctetStream;
import org.bouncycastle.util.io.Streams;

public class BEROctetStringParser implements ASN1OctetStringParser {
  private ASN1StreamParser _parser;
  
  BEROctetStringParser(ASN1StreamParser paramASN1StreamParser) {
    this._parser = paramASN1StreamParser;
  }
  
  public InputStream getOctetStream() {
    return (InputStream)new ConstructedOctetStream(this._parser);
  }
  
  public ASN1Primitive getLoadedObject() throws IOException {
    return (ASN1Primitive)parse(this._parser);
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      return getLoadedObject();
    } catch (IOException iOException) {
      throw new ASN1ParsingException("IOException converting stream to byte array: " + iOException.getMessage(), iOException);
    } 
  }
  
  static BEROctetString parse(ASN1StreamParser paramASN1StreamParser) throws IOException {
    return new BEROctetString(Streams.readAll((InputStream)new ConstructedOctetStream(paramASN1StreamParser)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\BEROctetStringParser.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */