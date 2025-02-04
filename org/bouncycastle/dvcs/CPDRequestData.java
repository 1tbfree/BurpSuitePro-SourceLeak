package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.dvcs.Data;

public class CPDRequestData extends DVCSRequestData {
  CPDRequestData(Data paramData) throws DVCSConstructionException {
    super(paramData);
    initMessage();
  }
  
  private void initMessage() throws DVCSConstructionException {
    if (this.data.getMessage() == null)
      throw new DVCSConstructionException("DVCSRequest.data.message should be specified for CPD service"); 
  }
  
  public byte[] getMessage() {
    return this.data.getMessage().getOctets();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\dvcs\CPDRequestData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */