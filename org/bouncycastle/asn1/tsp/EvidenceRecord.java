package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EvidenceRecord extends ASN1Object {
  private static final ASN1ObjectIdentifier OID = new ASN1ObjectIdentifier("1.3.6.1.5.5.11.0.2.1");
  
  private ASN1Integer version = new ASN1Integer(1L);
  
  private ASN1Sequence digestAlgorithms;
  
  private CryptoInfos cryptoInfos;
  
  private EncryptionInfo encryptionInfo;
  
  private ArchiveTimeStampSequence archiveTimeStampSequence;
  
  public static EvidenceRecord getInstance(Object paramObject) {
    return (paramObject instanceof EvidenceRecord) ? (EvidenceRecord)paramObject : ((paramObject != null) ? new EvidenceRecord(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static EvidenceRecord getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  private EvidenceRecord(EvidenceRecord paramEvidenceRecord, ArchiveTimeStampSequence paramArchiveTimeStampSequence, ArchiveTimeStamp paramArchiveTimeStamp) {
    this.version = paramEvidenceRecord.version;
    if (paramArchiveTimeStamp != null) {
      AlgorithmIdentifier algorithmIdentifier = paramArchiveTimeStamp.getDigestAlgorithmIdentifier();
      ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
      Enumeration enumeration = paramEvidenceRecord.digestAlgorithms.getObjects();
      boolean bool = false;
      while (enumeration.hasMoreElements()) {
        AlgorithmIdentifier algorithmIdentifier1 = AlgorithmIdentifier.getInstance(enumeration.nextElement());
        aSN1EncodableVector.add((ASN1Encodable)algorithmIdentifier1);
        if (algorithmIdentifier1.equals(algorithmIdentifier)) {
          bool = true;
          break;
        } 
      } 
      if (!bool) {
        aSN1EncodableVector.add((ASN1Encodable)algorithmIdentifier);
        this.digestAlgorithms = (ASN1Sequence)new DERSequence(aSN1EncodableVector);
      } else {
        this.digestAlgorithms = paramEvidenceRecord.digestAlgorithms;
      } 
    } else {
      this.digestAlgorithms = paramEvidenceRecord.digestAlgorithms;
    } 
    this.cryptoInfos = paramEvidenceRecord.cryptoInfos;
    this.encryptionInfo = paramEvidenceRecord.encryptionInfo;
    this.archiveTimeStampSequence = paramArchiveTimeStampSequence;
  }
  
  public EvidenceRecord(CryptoInfos paramCryptoInfos, EncryptionInfo paramEncryptionInfo, ArchiveTimeStamp paramArchiveTimeStamp) {
    this.digestAlgorithms = (ASN1Sequence)new DERSequence((ASN1Encodable)paramArchiveTimeStamp.getDigestAlgorithmIdentifier());
    this.cryptoInfos = paramCryptoInfos;
    this.encryptionInfo = paramEncryptionInfo;
    this.archiveTimeStampSequence = new ArchiveTimeStampSequence(new ArchiveTimeStampChain(paramArchiveTimeStamp));
  }
  
  public EvidenceRecord(AlgorithmIdentifier[] paramArrayOfAlgorithmIdentifier, CryptoInfos paramCryptoInfos, EncryptionInfo paramEncryptionInfo, ArchiveTimeStampSequence paramArchiveTimeStampSequence) {
    this.digestAlgorithms = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfAlgorithmIdentifier);
    this.cryptoInfos = paramCryptoInfos;
    this.encryptionInfo = paramEncryptionInfo;
    this.archiveTimeStampSequence = paramArchiveTimeStampSequence;
  }
  
  private EvidenceRecord(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() < 3 && paramASN1Sequence.size() > 5)
      throw new IllegalArgumentException("wrong sequence size in constructor: " + paramASN1Sequence.size()); 
    ASN1Integer aSN1Integer = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0));
    if (!aSN1Integer.hasValue(1))
      throw new IllegalArgumentException("incompatible version"); 
    this.version = aSN1Integer;
    this.digestAlgorithms = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(1));
    for (byte b = 2; b != paramASN1Sequence.size() - 1; b++) {
      ASN1Encodable aSN1Encodable = paramASN1Sequence.getObjectAt(b);
      if (aSN1Encodable instanceof ASN1TaggedObject) {
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject)aSN1Encodable;
        switch (aSN1TaggedObject.getTagNo()) {
          case 0:
            this.cryptoInfos = CryptoInfos.getInstance(aSN1TaggedObject, false);
            break;
          case 1:
            this.encryptionInfo = EncryptionInfo.getInstance(aSN1TaggedObject, false);
            break;
          default:
            throw new IllegalArgumentException("unknown tag in getInstance: " + aSN1TaggedObject.getTagNo());
        } 
      } else {
        throw new IllegalArgumentException("unknown object in getInstance: " + aSN1Encodable.getClass().getName());
      } 
    } 
    this.archiveTimeStampSequence = ArchiveTimeStampSequence.getInstance(paramASN1Sequence.getObjectAt(paramASN1Sequence.size() - 1));
  }
  
  public AlgorithmIdentifier[] getDigestAlgorithms() {
    AlgorithmIdentifier[] arrayOfAlgorithmIdentifier = new AlgorithmIdentifier[this.digestAlgorithms.size()];
    for (byte b = 0; b != arrayOfAlgorithmIdentifier.length; b++)
      arrayOfAlgorithmIdentifier[b] = AlgorithmIdentifier.getInstance(this.digestAlgorithms.getObjectAt(b)); 
    return arrayOfAlgorithmIdentifier;
  }
  
  public ArchiveTimeStampSequence getArchiveTimeStampSequence() {
    return this.archiveTimeStampSequence;
  }
  
  public EvidenceRecord addArchiveTimeStamp(ArchiveTimeStamp paramArchiveTimeStamp, boolean paramBoolean) {
    if (paramBoolean) {
      ArchiveTimeStampChain archiveTimeStampChain = new ArchiveTimeStampChain(paramArchiveTimeStamp);
      return new EvidenceRecord(this, this.archiveTimeStampSequence.append(archiveTimeStampChain), paramArchiveTimeStamp);
    } 
    ArchiveTimeStampChain[] arrayOfArchiveTimeStampChain = this.archiveTimeStampSequence.getArchiveTimeStampChains();
    AlgorithmIdentifier algorithmIdentifier = arrayOfArchiveTimeStampChain[arrayOfArchiveTimeStampChain.length - 1].getArchiveTimestamps()[0].getDigestAlgorithmIdentifier();
    if (!algorithmIdentifier.equals(paramArchiveTimeStamp.getDigestAlgorithmIdentifier()))
      throw new IllegalArgumentException("mismatch of digest algorithm in addArchiveTimeStamp"); 
    arrayOfArchiveTimeStampChain[arrayOfArchiveTimeStampChain.length - 1] = arrayOfArchiveTimeStampChain[arrayOfArchiveTimeStampChain.length - 1].append(paramArchiveTimeStamp);
    return new EvidenceRecord(this, new ArchiveTimeStampSequence(arrayOfArchiveTimeStampChain), null);
  }
  
  public String toString() {
    return "EvidenceRecord: Oid(" + OID + ")";
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    aSN1EncodableVector.add((ASN1Encodable)this.digestAlgorithms);
    if (null != this.cryptoInfos)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)this.cryptoInfos)); 
    if (null != this.encryptionInfo)
      aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 1, (ASN1Encodable)this.encryptionInfo)); 
    aSN1EncodableVector.add((ASN1Encodable)this.archiveTimeStampSequence);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\tsp\EvidenceRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */