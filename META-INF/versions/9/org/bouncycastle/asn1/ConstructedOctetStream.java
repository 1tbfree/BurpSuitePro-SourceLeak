package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1StreamParser;

class ConstructedOctetStream extends InputStream {
  private final ASN1StreamParser _parser;
  
  private boolean _first = true;
  
  private InputStream _currentStream;
  
  ConstructedOctetStream(ASN1StreamParser paramASN1StreamParser) {
    this._parser = paramASN1StreamParser;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    if (this._currentStream == null) {
      if (!this._first)
        return -1; 
      ASN1OctetStringParser aSN1OctetStringParser = getNextParser();
      if (aSN1OctetStringParser == null)
        return -1; 
      this._first = false;
      this._currentStream = aSN1OctetStringParser.getOctetStream();
    } 
    int i = 0;
    while (true) {
      int j = this._currentStream.read(paramArrayOfbyte, paramInt1 + i, paramInt2 - i);
      if (j >= 0) {
        i += j;
        if (i == paramInt2)
          return i; 
        continue;
      } 
      ASN1OctetStringParser aSN1OctetStringParser = getNextParser();
      if (aSN1OctetStringParser == null) {
        this._currentStream = null;
        return (i < 1) ? -1 : i;
      } 
      this._currentStream = aSN1OctetStringParser.getOctetStream();
    } 
  }
  
  public int read() throws IOException {
    if (this._currentStream == null) {
      if (!this._first)
        return -1; 
      ASN1OctetStringParser aSN1OctetStringParser = getNextParser();
      if (aSN1OctetStringParser == null)
        return -1; 
      this._first = false;
      this._currentStream = aSN1OctetStringParser.getOctetStream();
    } 
    while (true) {
      int i = this._currentStream.read();
      if (i >= 0)
        return i; 
      ASN1OctetStringParser aSN1OctetStringParser = getNextParser();
      if (aSN1OctetStringParser == null) {
        this._currentStream = null;
        return -1;
      } 
      this._currentStream = aSN1OctetStringParser.getOctetStream();
    } 
  }
  
  private ASN1OctetStringParser getNextParser() throws IOException {
    ASN1Encodable aSN1Encodable = this._parser.readObject();
    if (aSN1Encodable == null)
      return null; 
    if (aSN1Encodable instanceof ASN1OctetStringParser)
      return (ASN1OctetStringParser)aSN1Encodable; 
    throw new IOException("unknown object encountered: " + aSN1Encodable.getClass());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ConstructedOctetStream.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */