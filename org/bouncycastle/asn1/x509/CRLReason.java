package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Integers;

public class CRLReason extends ASN1Object {
  public static final int UNSPECIFIED = 0;
  
  public static final int KEY_COMPROMISE = 1;
  
  public static final int CA_COMPROMISE = 2;
  
  public static final int AFFILIATION_CHANGED = 3;
  
  public static final int SUPERSEDED = 4;
  
  public static final int CESSATION_OF_OPERATION = 5;
  
  public static final int CERTIFICATE_HOLD = 6;
  
  public static final int REMOVE_FROM_CRL = 8;
  
  public static final int PRIVILEGE_WITHDRAWN = 9;
  
  public static final int AA_COMPROMISE = 10;
  
  public static final int unspecified = 0;
  
  public static final int keyCompromise = 1;
  
  public static final int cACompromise = 2;
  
  public static final int affiliationChanged = 3;
  
  public static final int superseded = 4;
  
  public static final int cessationOfOperation = 5;
  
  public static final int certificateHold = 6;
  
  public static final int removeFromCRL = 8;
  
  public static final int privilegeWithdrawn = 9;
  
  public static final int aACompromise = 10;
  
  private static final String[] reasonString = new String[] { 
      "unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", 
      "aACompromise" };
  
  private static final Hashtable table = new Hashtable<>();
  
  private ASN1Enumerated value;
  
  public static CRLReason getInstance(Object paramObject) {
    return (paramObject instanceof CRLReason) ? (CRLReason)paramObject : ((paramObject != null) ? lookup(ASN1Enumerated.getInstance(paramObject).intValueExact()) : null);
  }
  
  private CRLReason(int paramInt) {
    if (paramInt < 0)
      throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)"); 
    this.value = new ASN1Enumerated(paramInt);
  }
  
  public String toString() {
    String str;
    int i = getValue().intValue();
    if (i < 0 || i > 10) {
      str = "invalid";
    } else {
      str = reasonString[i];
    } 
    return "CRLReason: " + str;
  }
  
  public BigInteger getValue() {
    return this.value.getValue();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.value;
  }
  
  public static CRLReason lookup(int paramInt) {
    Integer integer = Integers.valueOf(paramInt);
    if (!table.containsKey(integer))
      table.put(integer, new CRLReason(paramInt)); 
    return (CRLReason)table.get(integer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\CRLReason.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */