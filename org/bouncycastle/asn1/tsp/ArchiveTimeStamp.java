package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.Attributes;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class ArchiveTimeStamp extends ASN1Object {
  private final AlgorithmIdentifier digestAlgorithm;
  
  private final Attributes attributes;
  
  private final ASN1Sequence reducedHashTree;
  
  private final ContentInfo timeStamp;
  
  public static ArchiveTimeStamp getInstance(Object paramObject) {
    return (paramObject instanceof ArchiveTimeStamp) ? (ArchiveTimeStamp)paramObject : ((paramObject != null) ? new ArchiveTimeStamp(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ArchiveTimeStamp(AlgorithmIdentifier paramAlgorithmIdentifier, PartialHashtree[] paramArrayOfPartialHashtree, ContentInfo paramContentInfo) {
    this(paramAlgorithmIdentifier, null, paramArrayOfPartialHashtree, paramContentInfo);
  }
  
  public ArchiveTimeStamp(ContentInfo paramContentInfo) {
    this(null, null, null, paramContentInfo);
  }
  
  public ArchiveTimeStamp(AlgorithmIdentifier paramAlgorithmIdentifier, Attributes paramAttributes, PartialHashtree[] paramArrayOfPartialHashtree, ContentInfo paramContentInfo) {
    this.digestAlgorithm = paramAlgorithmIdentifier;
    this.attributes = paramAttributes;
    if (paramArrayOfPartialHashtree != null) {
      this.reducedHashTree = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfPartialHashtree);
    } else {
      this.reducedHashTree = null;
    } 
    this.timeStamp = paramContentInfo;
  }
  
  private ArchiveTimeStamp(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() < 1 || paramASN1Sequence.size() > 4)
      throw new IllegalArgumentException("wrong sequence size in constructor: " + paramASN1Sequence.size()); 
    AlgorithmIdentifier algorithmIdentifier = null;
    Attributes attributes = null;
    ASN1Sequence aSN1Sequence = null;
    for (byte b = 0; b < paramASN1Sequence.size() - 1; b++) {
      ASN1Encodable aSN1Encodable = paramASN1Sequence.getObjectAt(b);
      if (aSN1Encodable instanceof ASN1TaggedObject) {
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
        switch (aSN1TaggedObject.getTagNo()) {
          case 0:
            algorithmIdentifier = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
            break;
          case 1:
            attributes = Attributes.getInstance(aSN1TaggedObject, false);
            break;
          case 2:
            aSN1Sequence = ASN1Sequence.getInstance(aSN1TaggedObject, false);
            break;
          default:
            throw new IllegalArgumentException("invalid tag no in constructor: " + aSN1TaggedObject.getTagNo());
        } 
      } 
    } 
    this.digestAlgorithm = algorithmIdentifier;
    this.attributes = attributes;
    this.reducedHashTree = aSN1Sequence;
    this.timeStamp = ContentInfo.getInstance(paramASN1Sequence.getObjectAt(paramASN1Sequence.size() - 1));
  }
  
  public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
    return (this.digestAlgorithm != null) ? this.digestAlgorithm : getTimeStampInfo().getMessageImprint().getHashAlgorithm();
  }
  
  public byte[] getTimeStampDigestValue() {
    return getTimeStampInfo().getMessageImprint().getHashedMessage();
  }
  
  private TSTInfo getTimeStampInfo() {
    if (this.timeStamp.getContentType().equals((ASN1Primitive)CMSObjectIdentifiers.signedData)) {
      SignedData signedData = SignedData.getInstance(this.timeStamp.getContent());
      if (signedData.getEncapContentInfo().getContentType().equals((ASN1Primitive)PKCSObjectIdentifiers.id_ct_TSTInfo))
        return TSTInfo.getInstance(ASN1OctetString.getInstance(signedData.getEncapContentInfo().getContent()).getOctets()); 
      throw new IllegalStateException("cannot parse time stamp");
    } 
    throw new IllegalStateException("cannot identify algorithm identifier for digest");
  }
  
  public AlgorithmIdentifier getDigestAlgorithm() {
    return this.digestAlgorithm;
  }
  
  public PartialHashtree getHashTreeLeaf() {
    return (this.reducedHashTree == null) ? null : PartialHashtree.getInstance(this.reducedHashTree.getObjectAt(0));
  }
  
  public PartialHashtree[] getReducedHashTree() {
    if (this.reducedHashTree == null)
      return null; 
    PartialHashtree[] arrayOfPartialHashtree = new PartialHashtree[this.reducedHashTree.size()];
    for (byte b = 0; b != arrayOfPartialHashtree.length; b++)
      arrayOfPartialHashtree[b] = PartialHashtree.getInstance(this.reducedHashTree.getObjectAt(b)); 
    return arrayOfPartialHashtree;
  }
  
  public ContentInfo getTimeStamp() {
    return this.timeStamp;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    if (this.digestAlgorithm != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)this.digestAlgorithm)); 
    if (this.attributes != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 1, (ASN1Encodable)this.attributes)); 
    if (this.reducedHashTree != null)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 2, (ASN1Encodable)this.reducedHashTree)); 
    aSN1EncodableVector.add((ASN1Encodable)this.timeStamp);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\tsp\ArchiveTimeStamp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */