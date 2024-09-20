package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfPsidSspRange;

public class SubjectPermissions extends ASN1Object implements ASN1Choice {
  public static final int explicit = 0;
  
  public static final int all = 1;
  
  private final ASN1Encodable subjectPermissions;
  
  private final int choice;
  
  SubjectPermissions(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.subjectPermissions = paramASN1Encodable;
    this.choice = paramInt;
  }
  
  public static SubjectPermissions explicit(SequenceOfPsidSspRange paramSequenceOfPsidSspRange) {
    return new SubjectPermissions(0, (ASN1Encodable)paramSequenceOfPsidSspRange);
  }
  
  public static SubjectPermissions all() {
    return new SubjectPermissions(1, (ASN1Encodable)DERNull.INSTANCE);
  }
  
  private SubjectPermissions(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.subjectPermissions = (ASN1Encodable)SequenceOfPsidSspRange.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.subjectPermissions = (ASN1Encodable)ASN1Null.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static SubjectPermissions getInstance(Object paramObject) {
    return (paramObject instanceof SubjectPermissions) ? (SubjectPermissions)paramObject : ((paramObject != null) ? new SubjectPermissions(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public ASN1Encodable getSubjectPermissions() {
    return this.subjectPermissions;
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.subjectPermissions);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SubjectPermissions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */