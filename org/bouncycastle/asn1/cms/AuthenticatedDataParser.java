package org.bouncycastle.asn1.cms;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.ASN1Util;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class AuthenticatedDataParser {
  private ASN1SequenceParser seq;
  
  private ASN1Integer version;
  
  private ASN1Encodable nextObject;
  
  private boolean originatorInfoCalled;
  
  public AuthenticatedDataParser(ASN1SequenceParser paramASN1SequenceParser) throws IOException {
    this.seq = paramASN1SequenceParser;
    this.version = ASN1Integer.getInstance(paramASN1SequenceParser.readObject());
  }
  
  public ASN1Integer getVersion() {
    return this.version;
  }
  
  public OriginatorInfo getOriginatorInfo() throws IOException {
    this.originatorInfoCalled = true;
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject instanceof ASN1TaggedObjectParser) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this.nextObject;
      if (aSN1TaggedObjectParser.hasContextTag(0)) {
        ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)aSN1TaggedObjectParser.parseBaseUniversal(false, 16);
        this.nextObject = null;
        return OriginatorInfo.getInstance(aSN1SequenceParser.getLoadedObject());
      } 
    } 
    return null;
  }
  
  public ASN1SetParser getRecipientInfos() throws IOException {
    if (!this.originatorInfoCalled)
      getOriginatorInfo(); 
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    ASN1SetParser aSN1SetParser = (ASN1SetParser)this.nextObject;
    this.nextObject = null;
    return aSN1SetParser;
  }
  
  public AlgorithmIdentifier getMacAlgorithm() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject != null) {
      ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)this.nextObject;
      this.nextObject = null;
      return AlgorithmIdentifier.getInstance(aSN1SequenceParser.toASN1Primitive());
    } 
    return null;
  }
  
  public AlgorithmIdentifier getDigestAlgorithm() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject instanceof ASN1TaggedObjectParser) {
      AlgorithmIdentifier algorithmIdentifier = AlgorithmIdentifier.getInstance((ASN1TaggedObject)this.nextObject.toASN1Primitive(), false);
      this.nextObject = null;
      return algorithmIdentifier;
    } 
    return null;
  }
  
  public ContentInfoParser getEncapsulatedContentInfo() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject != null) {
      ASN1SequenceParser aSN1SequenceParser = (ASN1SequenceParser)this.nextObject;
      this.nextObject = null;
      return new ContentInfoParser(aSN1SequenceParser);
    } 
    return null;
  }
  
  public ASN1SetParser getAuthAttrs() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject instanceof ASN1TaggedObjectParser) {
      ASN1TaggedObjectParser aSN1TaggedObjectParser = (ASN1TaggedObjectParser)this.nextObject;
      this.nextObject = null;
      return (ASN1SetParser)ASN1Util.parseContextBaseUniversal(aSN1TaggedObjectParser, 2, false, 17);
    } 
    return null;
  }
  
  public ASN1OctetString getMac() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    ASN1Encodable aSN1Encodable = this.nextObject;
    this.nextObject = null;
    return ASN1OctetString.getInstance(aSN1Encodable.toASN1Primitive());
  }
  
  public ASN1SetParser getUnauthAttrs() throws IOException {
    if (this.nextObject == null)
      this.nextObject = this.seq.readObject(); 
    if (this.nextObject != null) {
      ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)this.nextObject;
      this.nextObject = null;
      return (ASN1SetParser)ASN1Util.parseContextBaseUniversal((ASN1TaggedObjectParser)aSN1TaggedObject, 3, false, 17);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cms\AuthenticatedDataParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */