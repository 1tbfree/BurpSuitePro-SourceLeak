package META-INF.versions.9.org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Tag;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

public abstract class ASN1Util {
  static ASN1TaggedObject checkContextTag(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return checkTag(paramASN1TaggedObject, 128, paramInt);
  }
  
  static ASN1TaggedObjectParser checkContextTag(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) {
    return checkTag(paramASN1TaggedObjectParser, 128, paramInt);
  }
  
  static ASN1TaggedObject checkContextTagClass(ASN1TaggedObject paramASN1TaggedObject) {
    return checkTagClass(paramASN1TaggedObject, 128);
  }
  
  static ASN1TaggedObjectParser checkContextTagClass(ASN1TaggedObjectParser paramASN1TaggedObjectParser) {
    return checkTagClass(paramASN1TaggedObjectParser, 128);
  }
  
  static ASN1TaggedObject checkTag(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2) {
    if (!paramASN1TaggedObject.hasTag(paramInt1, paramInt2)) {
      String str1 = getTagText(paramInt1, paramInt2);
      String str2 = getTagText(paramASN1TaggedObject);
      throw new IllegalStateException("Expected " + str1 + " tag but found " + str2);
    } 
    return paramASN1TaggedObject;
  }
  
  static ASN1TaggedObjectParser checkTag(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2) {
    if (!paramASN1TaggedObjectParser.hasTag(paramInt1, paramInt2)) {
      String str1 = getTagText(paramInt1, paramInt2);
      String str2 = getTagText(paramASN1TaggedObjectParser);
      throw new IllegalStateException("Expected " + str1 + " tag but found " + str2);
    } 
    return paramASN1TaggedObjectParser;
  }
  
  static ASN1TaggedObject checkTagClass(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    if (!paramASN1TaggedObject.hasTagClass(paramInt)) {
      String str1 = getTagClassText(paramInt);
      String str2 = getTagClassText(paramASN1TaggedObject);
      throw new IllegalStateException("Expected " + str1 + " tag but found " + str2);
    } 
    return paramASN1TaggedObject;
  }
  
  static ASN1TaggedObjectParser checkTagClass(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) {
    if (!paramASN1TaggedObjectParser.hasTagClass(paramInt)) {
      String str1 = getTagClassText(paramInt);
      String str2 = getTagClassText(paramASN1TaggedObjectParser);
      throw new IllegalStateException("Expected " + str1 + " tag but found " + str2);
    } 
    return paramASN1TaggedObjectParser;
  }
  
  static String getTagClassText(ASN1Tag paramASN1Tag) {
    return getTagClassText(paramASN1Tag.getTagClass());
  }
  
  public static String getTagClassText(ASN1TaggedObject paramASN1TaggedObject) {
    return getTagClassText(paramASN1TaggedObject.getTagClass());
  }
  
  public static String getTagClassText(ASN1TaggedObjectParser paramASN1TaggedObjectParser) {
    return getTagClassText(paramASN1TaggedObjectParser.getTagClass());
  }
  
  public static String getTagClassText(int paramInt) {
    switch (paramInt) {
      case 64:
        return "APPLICATION";
      case 128:
        return "CONTEXT";
      case 192:
        return "PRIVATE";
    } 
    return "UNIVERSAL";
  }
  
  static String getTagText(ASN1Tag paramASN1Tag) {
    return getTagText(paramASN1Tag.getTagClass(), paramASN1Tag.getTagNumber());
  }
  
  public static String getTagText(ASN1TaggedObject paramASN1TaggedObject) {
    return getTagText(paramASN1TaggedObject.getTagClass(), paramASN1TaggedObject.getTagNo());
  }
  
  public static String getTagText(ASN1TaggedObjectParser paramASN1TaggedObjectParser) {
    return getTagText(paramASN1TaggedObjectParser.getTagClass(), paramASN1TaggedObjectParser.getTagNo());
  }
  
  public static String getTagText(int paramInt1, int paramInt2) {
    switch (paramInt1) {
      case 64:
        return "[APPLICATION " + paramInt2 + "]";
      case 128:
        return "[CONTEXT " + paramInt2 + "]";
      case 192:
        return "[PRIVATE " + paramInt2 + "]";
    } 
    return "[UNIVERSAL " + paramInt2 + "]";
  }
  
  public static ASN1Object getExplicitBaseObject(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2) {
    return checkTag(paramASN1TaggedObject, paramInt1, paramInt2).getExplicitBaseObject();
  }
  
  public static ASN1Object getExplicitContextBaseObject(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return getExplicitBaseObject(paramASN1TaggedObject, 128, paramInt);
  }
  
  public static ASN1Object tryGetExplicitBaseObject(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2) {
    return !paramASN1TaggedObject.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObject.getExplicitBaseObject();
  }
  
  public static ASN1Object tryGetExplicitContextBaseObject(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return tryGetExplicitBaseObject(paramASN1TaggedObject, 128, paramInt);
  }
  
  public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return checkTagClass(paramASN1TaggedObject, paramInt).getExplicitBaseTagged();
  }
  
  public static ASN1TaggedObject getExplicitBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2) {
    return checkTag(paramASN1TaggedObject, paramInt1, paramInt2).getExplicitBaseTagged();
  }
  
  public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject paramASN1TaggedObject) {
    return getExplicitBaseTagged(paramASN1TaggedObject, 128);
  }
  
  public static ASN1TaggedObject getExplicitContextBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return getExplicitBaseTagged(paramASN1TaggedObject, 128, paramInt);
  }
  
  public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return !paramASN1TaggedObject.hasTagClass(paramInt) ? null : paramASN1TaggedObject.getExplicitBaseTagged();
  }
  
  public static ASN1TaggedObject tryGetExplicitBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2) {
    return !paramASN1TaggedObject.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObject.getExplicitBaseTagged();
  }
  
  public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject paramASN1TaggedObject) {
    return tryGetExplicitBaseTagged(paramASN1TaggedObject, 128);
  }
  
  public static ASN1TaggedObject tryGetExplicitContextBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt) {
    return tryGetExplicitBaseTagged(paramASN1TaggedObject, 128, paramInt);
  }
  
  public static ASN1TaggedObject getImplicitBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return checkTag(paramASN1TaggedObject, paramInt1, paramInt2).getImplicitBaseTagged(paramInt3, paramInt4);
  }
  
  public static ASN1TaggedObject getImplicitContextBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, int paramInt3) {
    return getImplicitBaseTagged(paramASN1TaggedObject, 128, paramInt1, paramInt2, paramInt3);
  }
  
  public static ASN1TaggedObject tryGetImplicitBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return !paramASN1TaggedObject.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObject.getImplicitBaseTagged(paramInt3, paramInt4);
  }
  
  public static ASN1TaggedObject tryGetImplicitContextBaseTagged(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, int paramInt3) {
    return tryGetImplicitBaseTagged(paramASN1TaggedObject, 128, paramInt1, paramInt2, paramInt3);
  }
  
  public static ASN1Primitive getBaseUniversal(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    return checkTag(paramASN1TaggedObject, paramInt1, paramInt2).getBaseUniversal(paramBoolean, paramInt3);
  }
  
  public static ASN1Primitive getContextBaseUniversal(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, boolean paramBoolean, int paramInt2) {
    return getBaseUniversal(paramASN1TaggedObject, 128, paramInt1, paramBoolean, paramInt2);
  }
  
  public static ASN1Primitive tryGetBaseUniversal(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    return !paramASN1TaggedObject.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObject.getBaseUniversal(paramBoolean, paramInt3);
  }
  
  public static ASN1Primitive tryGetContextBaseUniversal(ASN1TaggedObject paramASN1TaggedObject, int paramInt1, boolean paramBoolean, int paramInt2) {
    return tryGetBaseUniversal(paramASN1TaggedObject, 128, paramInt1, paramBoolean, paramInt2);
  }
  
  public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) throws IOException {
    return checkTagClass(paramASN1TaggedObjectParser, paramInt).parseExplicitBaseTagged();
  }
  
  public static ASN1TaggedObjectParser parseExplicitBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2) throws IOException {
    return checkTag(paramASN1TaggedObjectParser, paramInt1, paramInt2).parseExplicitBaseTagged();
  }
  
  public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser) throws IOException {
    return parseExplicitBaseTagged(paramASN1TaggedObjectParser, 128);
  }
  
  public static ASN1TaggedObjectParser parseExplicitContextBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) throws IOException {
    return parseExplicitBaseTagged(paramASN1TaggedObjectParser, 128, paramInt);
  }
  
  public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) throws IOException {
    return !paramASN1TaggedObjectParser.hasTagClass(paramInt) ? null : paramASN1TaggedObjectParser.parseExplicitBaseTagged();
  }
  
  public static ASN1TaggedObjectParser tryParseExplicitBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2) throws IOException {
    return !paramASN1TaggedObjectParser.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObjectParser.parseExplicitBaseTagged();
  }
  
  public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser) throws IOException {
    return tryParseExplicitBaseTagged(paramASN1TaggedObjectParser, 128);
  }
  
  public static ASN1TaggedObjectParser tryParseExplicitContextBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) throws IOException {
    return tryParseExplicitBaseTagged(paramASN1TaggedObjectParser, 128, paramInt);
  }
  
  public static ASN1TaggedObjectParser parseImplicitBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws IOException {
    return checkTag(paramASN1TaggedObjectParser, paramInt1, paramInt2).parseImplicitBaseTagged(paramInt3, paramInt4);
  }
  
  public static ASN1TaggedObjectParser parseImplicitContextBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    return parseImplicitBaseTagged(paramASN1TaggedObjectParser, 128, paramInt1, paramInt2, paramInt3);
  }
  
  public static ASN1TaggedObjectParser tryParseImplicitBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2, int paramInt3, int paramInt4) throws IOException {
    return !paramASN1TaggedObjectParser.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObjectParser.parseImplicitBaseTagged(paramInt3, paramInt4);
  }
  
  public static ASN1TaggedObjectParser tryParseImplicitContextBaseTagged(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2, int paramInt3) throws IOException {
    return tryParseImplicitBaseTagged(paramASN1TaggedObjectParser, 128, paramInt1, paramInt2, paramInt3);
  }
  
  public static ASN1Encodable parseBaseUniversal(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) throws IOException {
    return checkTag(paramASN1TaggedObjectParser, paramInt1, paramInt2).parseBaseUniversal(paramBoolean, paramInt3);
  }
  
  public static ASN1Encodable parseContextBaseUniversal(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, boolean paramBoolean, int paramInt2) throws IOException {
    return parseBaseUniversal(paramASN1TaggedObjectParser, 128, paramInt1, paramBoolean, paramInt2);
  }
  
  public static ASN1Encodable tryParseBaseUniversal(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) throws IOException {
    return !paramASN1TaggedObjectParser.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObjectParser.parseBaseUniversal(paramBoolean, paramInt3);
  }
  
  public static ASN1Encodable tryParseContextBaseUniversal(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, boolean paramBoolean, int paramInt2) throws IOException {
    return tryParseBaseUniversal(paramASN1TaggedObjectParser, 128, paramInt1, paramBoolean, paramInt2);
  }
  
  public static ASN1Encodable parseExplicitBaseObject(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2) throws IOException {
    return checkTag(paramASN1TaggedObjectParser, paramInt1, paramInt2).parseExplicitBaseObject();
  }
  
  public static ASN1Encodable parseExplicitContextBaseObject(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) throws IOException {
    return parseExplicitBaseObject(paramASN1TaggedObjectParser, 128, paramInt);
  }
  
  public static ASN1Encodable tryParseExplicitBaseObject(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt1, int paramInt2) throws IOException {
    return !paramASN1TaggedObjectParser.hasTag(paramInt1, paramInt2) ? null : paramASN1TaggedObjectParser.parseExplicitBaseObject();
  }
  
  public static ASN1Encodable tryParseExplicitContextBaseObject(ASN1TaggedObjectParser paramASN1TaggedObjectParser, int paramInt) throws IOException {
    return tryParseExplicitBaseObject(paramASN1TaggedObjectParser, 128, paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\asn1\ASN1Util.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */