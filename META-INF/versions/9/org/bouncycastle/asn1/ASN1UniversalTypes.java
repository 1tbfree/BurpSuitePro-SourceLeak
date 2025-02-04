package META-INF.versions.9.org.bouncycastle.asn1;

import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1External;
import org.bouncycastle.asn1.ASN1GeneralString;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1GraphicString;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1NumericString;
import org.bouncycastle.asn1.ASN1ObjectDescriptor;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1T61String;
import org.bouncycastle.asn1.ASN1UTCTime;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.ASN1UniversalType;
import org.bouncycastle.asn1.ASN1VideotexString;
import org.bouncycastle.asn1.ASN1VisibleString;

final class ASN1UniversalTypes {
  static ASN1UniversalType get(int paramInt) {
    switch (paramInt) {
      case 1:
        return ASN1Boolean.TYPE;
      case 2:
        return ASN1Integer.TYPE;
      case 3:
        return ASN1BitString.TYPE;
      case 4:
        return ASN1OctetString.TYPE;
      case 5:
        return ASN1Null.TYPE;
      case 6:
        return ASN1ObjectIdentifier.TYPE;
      case 7:
        return ASN1ObjectDescriptor.TYPE;
      case 8:
        return ASN1External.TYPE;
      case 10:
        return ASN1Enumerated.TYPE;
      case 12:
        return ASN1UTF8String.TYPE;
      case 13:
        return ASN1RelativeOID.TYPE;
      case 16:
        return ASN1Sequence.TYPE;
      case 17:
        return ASN1Set.TYPE;
      case 18:
        return ASN1NumericString.TYPE;
      case 19:
        return ASN1PrintableString.TYPE;
      case 20:
        return ASN1T61String.TYPE;
      case 21:
        return ASN1VideotexString.TYPE;
      case 22:
        return ASN1IA5String.TYPE;
      case 23:
        return ASN1UTCTime.TYPE;
      case 24:
        return ASN1GeneralizedTime.TYPE;
      case 25:
        return ASN1GraphicString.TYPE;
      case 26:
        return ASN1VisibleString.TYPE;
      case 27:
        return ASN1GeneralString.TYPE;
      case 28:
        return ASN1UniversalString.TYPE;
      case 30:
        return ASN1BMPString.TYPE;
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1UniversalTypes.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */