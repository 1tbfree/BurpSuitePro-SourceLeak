package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;

public class EnvelopedDataParser {
  private ASN1SequenceParser _seq;
  
  private ASN1Integer _version;
  
  private ASN1Encodable _nextObject;
  
  private boolean _originatorInfoCalled;
  
  public EnvelopedDataParser(ASN1SequenceParser paramASN1SequenceParser) throws IOException {
    this._seq = paramASN1SequenceParser;
    this._version = ASN1Integer.getInstance(paramASN1SequenceParser.readObject());
  }
  
  public ASN1Integer getVersion() {
    return this._version;
  }
  
  public OriginatorInfo getOriginatorInfo() throws IOException {
    this._originatorInfoCalled = true;
    if (this._nextObject == null)
      this._nextObject = this._seq.readObject(); 
    if (this._nextObject instanceof ASN1TaggedObjectParser) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this._nextObject;
      if (aSN1TaggedObjectParser.hasContextTag(0)) {
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
        this._nextObject = null;
        return OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
      } 
    } 
    return null;
  }
  
  public ASN1SetParser getRecipientInfos() throws IOException {
    if (!this._originatorInfoCalled)
      getOriginatorInfo(); 
    if (this._nextObject == null)
      this._nextObject = this._seq.readObject(); 
    ASN1SetParser aSN1SetParser = (ASN1SetParser)this._nextObject;
    this._nextObject = null;
    return aSN1SetParser;
  }
  
  public EncryptedContentInfoParser getEncryptedContentInfo() throws IOException {
    if (this._nextObject == null)
      this._nextObject = this._seq.readObject(); 
    if (this._nextObject != null) {
      ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)this._nextObject;
      this._nextObject = null;
      return new EncryptedContentInfoParser(aSN1SequenceParser);
    } 
    return null;
  }
  
  public ASN1SetParser getUnprotectedAttrs() throws IOException {
    if (this._nextObject == null)
      this._nextObject = this._seq.readObject(); 
    if (this._nextObject != null) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this._nextObject;
      this._nextObject = null;
      return (ASN1SetParser)ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 1, false, 17);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\EnvelopedDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */