package org.bouncycastle.asn1.icao;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class LDSSecurityObject extends ASN1Object implements ICAOObjectIdentifiers {
  public static final int ub_DataGroups = 16;
  
  private ASN1Integer version = new ASN1Integer(0L);
  
  private AlgorithmIdentifier digestAlgorithmIdentifier;
  
  private DataGroupHash[] datagroupHash;
  
  private LDSVersionInfo versionInfo;
  
  public static LDSSecurityObject getInstance(Object paramObject) {
    return (paramObject instanceof LDSSecurityObject) ? (LDSSecurityObject)paramObject : ((paramObject != null) ? new LDSSecurityObject(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private LDSSecurityObject(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence == null || paramASN1Sequence.size() == 0)
      throw new IllegalArgumentException("null or empty sequence passed."); 
    Enumeration enumeration = paramASN1Sequence.getObjects();
    this.version = ASN1Integer.getInstance(enumeration.nextElement());
    this.digestAlgorithmIdentifier = AlgorithmIdentifier.getInstance(enumeration.nextElement());
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(enumeration.nextElement());
    if (this.version.hasValue(1))
      this.versionInfo = LDSVersionInfo.getInstance(enumeration.nextElement()); 
    checkDatagroupHashSeqSize(aSN1Sequence.size());
    this.datagroupHash = new DataGroupHash[aSN1Sequence.size()];
    for (byte b = 0; b < aSN1Sequence.size(); b++)
      this.datagroupHash[b] = DataGroupHash.getInstance(aSN1Sequence.getObjectAt(b)); 
  }
  
  public LDSSecurityObject(AlgorithmIdentifier paramAlgorithmIdentifier, DataGroupHash[] paramArrayOfDataGroupHash) {
    this.version = new ASN1Integer(0L);
    this.digestAlgorithmIdentifier = paramAlgorithmIdentifier;
    this.datagroupHash = copy(paramArrayOfDataGroupHash);
    checkDatagroupHashSeqSize(paramArrayOfDataGroupHash.length);
  }
  
  public LDSSecurityObject(AlgorithmIdentifier paramAlgorithmIdentifier, DataGroupHash[] paramArrayOfDataGroupHash, LDSVersionInfo paramLDSVersionInfo) {
    this.version = new ASN1Integer(1L);
    this.digestAlgorithmIdentifier = paramAlgorithmIdentifier;
    this.datagroupHash = copy(paramArrayOfDataGroupHash);
    this.versionInfo = paramLDSVersionInfo;
    checkDatagroupHashSeqSize(paramArrayOfDataGroupHash.length);
  }
  
  private void checkDatagroupHashSeqSize(int paramInt) {
    if (paramInt < 2 || paramInt > 16)
      throw new IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)"); 
  }
  
  public int getVersion() {
    return this.version.intValueExact();
  }
  
  public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
    return this.digestAlgorithmIdentifier;
  }
  
  public DataGroupHash[] getDatagroupHash() {
    return copy(this.datagroupHash);
  }
  
  public LDSVersionInfo getVersionInfo() {
    return this.versionInfo;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
    aSN1EncodableVector.add((ASN1Encodable)this.version);
    aSN1EncodableVector.add((ASN1Encodable)this.digestAlgorithmIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)new DERSequence((ASN1Encodable[])this.datagroupHash));
    if (this.versionInfo != null)
      aSN1EncodableVector.add((ASN1Encodable)this.versionInfo); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  private DataGroupHash[] copy(DataGroupHash[] paramArrayOfDataGroupHash) {
    DataGroupHash[] arrayOfDataGroupHash = new DataGroupHash[paramArrayOfDataGroupHash.length];
    System.arraycopy(paramArrayOfDataGroupHash, 0, arrayOfDataGroupHash, 0, arrayOfDataGroupHash.length);
    return arrayOfDataGroupHash;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\icao\LDSSecurityObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */