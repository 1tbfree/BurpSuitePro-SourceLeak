package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

public class CMCStatusInfoBuilder {
  private final CMCStatus cMCStatus;
  
  private final ASN1Sequence bodyList;
  
  private ASN1UTF8String statusString;
  
  private CMCStatusInfo.OtherInfo otherInfo;
  
  public CMCStatusInfoBuilder(CMCStatus paramCMCStatus, BodyPartID paramBodyPartID) {
    this.cMCStatus = paramCMCStatus;
    this.bodyList = (ASN1Sequence)new DERSequence((ASN1Encodable)paramBodyPartID);
  }
  
  public CMCStatusInfoBuilder(CMCStatus paramCMCStatus, BodyPartID[] paramArrayOfBodyPartID) {
    this.cMCStatus = paramCMCStatus;
    this.bodyList = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfBodyPartID);
  }
  
  public CMCStatusInfoBuilder setStatusString(String paramString) {
    this.statusString = (ASN1UTF8String)new DERUTF8String(paramString);
    return this;
  }
  
  public CMCStatusInfoBuilder setOtherInfo(CMCFailInfo paramCMCFailInfo) {
    this.otherInfo = new CMCStatusInfo.OtherInfo(paramCMCFailInfo);
    return this;
  }
  
  public CMCStatusInfoBuilder setOtherInfo(PendInfo paramPendInfo) {
    this.otherInfo = new CMCStatusInfo.OtherInfo(paramPendInfo);
    return this;
  }
  
  public CMCStatusInfo build() {
    return new CMCStatusInfo(this.cMCStatus, this.bodyList, this.statusString, this.otherInfo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmc\CMCStatusInfoBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */