package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERUTF8String;

public class CMCStatusInfoV2Builder {
  private final CMCStatus cMCStatus;
  
  private final ASN1Sequence bodyList;
  
  private ASN1UTF8String statusString;
  
  private OtherStatusInfo otherInfo;
  
  public CMCStatusInfoV2Builder(CMCStatus paramCMCStatus, BodyPartID paramBodyPartID) {
    this.cMCStatus = paramCMCStatus;
    this.bodyList = (ASN1Sequence)new DERSequence((ASN1Encodable)paramBodyPartID);
  }
  
  public CMCStatusInfoV2Builder(CMCStatus paramCMCStatus, BodyPartID[] paramArrayOfBodyPartID) {
    this.cMCStatus = paramCMCStatus;
    this.bodyList = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfBodyPartID);
  }
  
  public CMCStatusInfoV2Builder setStatusString(String paramString) {
    this.statusString = (ASN1UTF8String)new DERUTF8String(paramString);
    return this;
  }
  
  public CMCStatusInfoV2Builder setOtherInfo(CMCFailInfo paramCMCFailInfo) {
    this.otherInfo = new OtherStatusInfo(paramCMCFailInfo);
    return this;
  }
  
  public CMCStatusInfoV2Builder setOtherInfo(ExtendedFailInfo paramExtendedFailInfo) {
    this.otherInfo = new OtherStatusInfo(paramExtendedFailInfo);
    return this;
  }
  
  public CMCStatusInfoV2Builder setOtherInfo(PendInfo paramPendInfo) {
    this.otherInfo = new OtherStatusInfo(paramPendInfo);
    return this;
  }
  
  public CMCStatusInfoV2 build() {
    return new CMCStatusInfoV2(this.cMCStatus, this.bodyList, this.statusString, this.otherInfo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmc\CMCStatusInfoV2Builder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */