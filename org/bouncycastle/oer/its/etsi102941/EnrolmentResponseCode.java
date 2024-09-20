package org.bouncycastle.oer.its.etsi102941;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;

public class EnrolmentResponseCode extends ASN1Enumerated {
  public static final EnrolmentResponseCode ok = new EnrolmentResponseCode(0);
  
  public static final EnrolmentResponseCode cantparse = new EnrolmentResponseCode(1);
  
  public static final EnrolmentResponseCode badcontenttype = new EnrolmentResponseCode(2);
  
  public static final EnrolmentResponseCode imnottherecipient = new EnrolmentResponseCode(3);
  
  public static final EnrolmentResponseCode unknownencryptionalgorithm = new EnrolmentResponseCode(4);
  
  public static final EnrolmentResponseCode decryptionfailed = new EnrolmentResponseCode(5);
  
  public static final EnrolmentResponseCode unknownits = new EnrolmentResponseCode(6);
  
  public static final EnrolmentResponseCode invalidsignature = new EnrolmentResponseCode(7);
  
  public static final EnrolmentResponseCode invalidencryptionkey = new EnrolmentResponseCode(8);
  
  public static final EnrolmentResponseCode baditsstatus = new EnrolmentResponseCode(9);
  
  public static final EnrolmentResponseCode incompleterequest = new EnrolmentResponseCode(10);
  
  public static final EnrolmentResponseCode deniedpermissions = new EnrolmentResponseCode(11);
  
  public static final EnrolmentResponseCode invalidkeys = new EnrolmentResponseCode(12);
  
  public static final EnrolmentResponseCode deniedrequest = new EnrolmentResponseCode(13);
  
  public EnrolmentResponseCode(int paramInt) {
    super(paramInt);
    assertValues();
  }
  
  public EnrolmentResponseCode(BigInteger paramBigInteger) {
    super(paramBigInteger);
    assertValues();
  }
  
  public EnrolmentResponseCode(byte[] paramArrayOfbyte) {
    super(paramArrayOfbyte);
    assertValues();
  }
  
  private EnrolmentResponseCode(ASN1Enumerated paramASN1Enumerated) {
    this(paramASN1Enumerated.getValue());
  }
  
  public static EnrolmentResponseCode getInstance(Object paramObject) {
    return (paramObject instanceof EnrolmentResponseCode) ? (EnrolmentResponseCode)paramObject : ((paramObject != null) ? new EnrolmentResponseCode(ASN1Enumerated.getInstance(paramObject)) : null);
  }
  
  protected void assertValues() {
    if (getValue().intValue() < 0 || getValue().intValue() > 13)
      throw new IllegalArgumentException("invalid enumeration value " + getValue()); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\EnrolmentResponseCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */