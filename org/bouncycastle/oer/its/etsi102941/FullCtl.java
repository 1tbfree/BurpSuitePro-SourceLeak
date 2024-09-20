package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi102941.basetypes.Version;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

public class FullCtl extends CtlFormat {
  public FullCtl(Version paramVersion, Time32 paramTime32, ASN1Boolean paramASN1Boolean, UINT8 paramUINT8, SequenceOfCtlCommand paramSequenceOfCtlCommand) {
    super(paramVersion, paramTime32, paramASN1Boolean, paramUINT8, paramSequenceOfCtlCommand);
  }
  
  protected FullCtl(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static FullCtl getInstance(Object paramObject) {
    return (paramObject instanceof FullCtl) ? (FullCtl)paramObject : ((paramObject != null) ? new FullCtl(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\FullCtl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */