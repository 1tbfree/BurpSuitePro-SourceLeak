package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public class IETFUtils {
  private static String unescape(String paramString) {
    if (paramString.length() == 0)
      return paramString; 
    if (paramString.indexOf('\\') < 0 && paramString.indexOf('"') < 0)
      return paramString.trim(); 
    boolean bool1 = false;
    boolean bool2 = false;
    StringBuffer stringBuffer = new StringBuffer(paramString.length());
    byte b1 = 0;
    if (paramString.charAt(0) == '\\' && paramString.charAt(1) == '#') {
      b1 = 2;
      stringBuffer.append("\\#");
    } 
    boolean bool3 = false;
    int i = 0;
    char c = Character.MIN_VALUE;
    for (byte b2 = b1; b2 != paramString.length(); b2++) {
      char c1 = paramString.charAt(b2);
      if (c1 != ' ')
        bool3 = true; 
      if (c1 == '"') {
        if (!bool1) {
          bool2 = !bool2 ? true : false;
        } else {
          stringBuffer.append(c1);
          bool1 = false;
        } 
      } else if (c1 == '\\' && !bool1 && !bool2) {
        bool1 = true;
        i = stringBuffer.length();
      } else if (c1 != ' ' || bool1 || bool3) {
        if (bool1 && isHexDigit(c1)) {
          if (c) {
            stringBuffer.append((char)(convertHex(c) * 16 + convertHex(c1)));
            bool1 = false;
            c = Character.MIN_VALUE;
          } else {
            c = c1;
          } 
        } else {
          stringBuffer.append(c1);
          bool1 = false;
        } 
      } 
    } 
    if (stringBuffer.length() > 0)
      while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i != stringBuffer.length() - 1)
        stringBuffer.setLength(stringBuffer.length() - 1);  
    return stringBuffer.toString();
  }
  
  private static boolean isHexDigit(char paramChar) {
    return (('0' <= paramChar && paramChar <= '9') || ('a' <= paramChar && paramChar <= 'f') || ('A' <= paramChar && paramChar <= 'F'));
  }
  
  private static int convertHex(char paramChar) {
    return ('0' <= paramChar && paramChar <= '9') ? (paramChar - 48) : (('a' <= paramChar && paramChar <= 'f') ? (paramChar - 97 + 10) : (paramChar - 65 + 10));
  }
  
  public static RDN[] rDNsFromString(String paramString, X500NameStyle paramX500NameStyle) {
    X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(paramString);
    X500NameBuilder x500NameBuilder = new X500NameBuilder(paramX500NameStyle);
    addRDNs(paramX500NameStyle, x500NameBuilder, x500NameTokenizer);
    return x500NameBuilder.build().getRDNs();
  }
  
  private static void addRDNs(X500NameStyle paramX500NameStyle, X500NameBuilder paramX500NameBuilder, X500NameTokenizer paramX500NameTokenizer) {
    String str;
    while ((str = paramX500NameTokenizer.nextToken()) != null) {
      if (str.indexOf('+') >= 0) {
        addMultiValuedRDN(paramX500NameStyle, paramX500NameBuilder, new X500NameTokenizer(str, '+'));
        continue;
      } 
      addRDN(paramX500NameStyle, paramX500NameBuilder, str);
    } 
  }
  
  private static void addMultiValuedRDN(X500NameStyle paramX500NameStyle, X500NameBuilder paramX500NameBuilder, X500NameTokenizer paramX500NameTokenizer) {
    String str = paramX500NameTokenizer.nextToken();
    if (str == null)
      throw new IllegalArgumentException("badly formatted directory string"); 
    if (!paramX500NameTokenizer.hasMoreTokens()) {
      addRDN(paramX500NameStyle, paramX500NameBuilder, str);
      return;
    } 
    Vector vector1 = new Vector();
    Vector vector2 = new Vector();
    while (true) {
      collectAttributeTypeAndValue(paramX500NameStyle, vector1, vector2, str);
      str = paramX500NameTokenizer.nextToken();
      if (str == null) {
        paramX500NameBuilder.addMultiValuedRDN(toOIDArray(vector1), toValueArray(vector2));
        return;
      } 
    } 
  }
  
  private static void addRDN(X500NameStyle paramX500NameStyle, X500NameBuilder paramX500NameBuilder, String paramString) {
    X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(paramString, '=');
    String str1 = nextToken(x500NameTokenizer, true);
    String str2 = nextToken(x500NameTokenizer, false);
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramX500NameStyle.attrNameToOID(str1.trim());
    String str3 = unescape(str2);
    paramX500NameBuilder.addRDN(aSN1ObjectIdentifier, str3);
  }
  
  private static void collectAttributeTypeAndValue(X500NameStyle paramX500NameStyle, Vector<ASN1ObjectIdentifier> paramVector1, Vector<String> paramVector2, String paramString) {
    X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(paramString, '=');
    String str1 = nextToken(x500NameTokenizer, true);
    String str2 = nextToken(x500NameTokenizer, false);
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramX500NameStyle.attrNameToOID(str1.trim());
    String str3 = unescape(str2);
    paramVector1.addElement(aSN1ObjectIdentifier);
    paramVector2.addElement(str3);
  }
  
  private static String nextToken(X500NameTokenizer paramX500NameTokenizer, boolean paramBoolean) {
    String str = paramX500NameTokenizer.nextToken();
    if (str == null || paramX500NameTokenizer.hasMoreTokens() != paramBoolean)
      throw new IllegalArgumentException("badly formatted directory string"); 
    return str;
  }
  
  private static String[] toValueArray(Vector<String> paramVector) {
    String[] arrayOfString = new String[paramVector.size()];
    for (byte b = 0; b != arrayOfString.length; b++)
      arrayOfString[b] = paramVector.elementAt(b); 
    return arrayOfString;
  }
  
  private static ASN1ObjectIdentifier[] toOIDArray(Vector<ASN1ObjectIdentifier> paramVector) {
    ASN1ObjectIdentifier[] arrayOfASN1ObjectIdentifier = new ASN1ObjectIdentifier[paramVector.size()];
    for (byte b = 0; b != arrayOfASN1ObjectIdentifier.length; b++)
      arrayOfASN1ObjectIdentifier[b] = paramVector.elementAt(b); 
    return arrayOfASN1ObjectIdentifier;
  }
  
  public static String[] findAttrNamesForOID(ASN1ObjectIdentifier paramASN1ObjectIdentifier, Hashtable paramHashtable) {
    byte b = 0;
    Enumeration enumeration = paramHashtable.elements();
    while (enumeration.hasMoreElements()) {
      if (paramASN1ObjectIdentifier.equals(enumeration.nextElement()))
        b++; 
    } 
    String[] arrayOfString = new String[b];
    b = 0;
    Enumeration<String> enumeration1 = paramHashtable.keys();
    while (enumeration1.hasMoreElements()) {
      String str = enumeration1.nextElement();
      if (paramASN1ObjectIdentifier.equals(paramHashtable.get(str)))
        arrayOfString[b++] = str; 
    } 
    return arrayOfString;
  }
  
  public static ASN1ObjectIdentifier decodeAttrName(String paramString, Hashtable paramHashtable) {
    if (paramString.regionMatches(true, 0, "OID.", 0, 4))
      return new ASN1ObjectIdentifier(paramString.substring(4)); 
    ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.tryFromID(paramString);
    if (aSN1ObjectIdentifier != null)
      return aSN1ObjectIdentifier; 
    aSN1ObjectIdentifier = (ASN1ObjectIdentifier)paramHashtable.get(Strings.toLowerCase(paramString));
    if (aSN1ObjectIdentifier != null)
      return aSN1ObjectIdentifier; 
    throw new IllegalArgumentException("Unknown object id - " + paramString + " - passed to distinguished name");
  }
  
  public static ASN1Encodable valueFromHexString(String paramString, int paramInt) throws IOException {
    byte[] arrayOfByte = new byte[(paramString.length() - paramInt) / 2];
    for (byte b = 0; b != arrayOfByte.length; b++) {
      char c1 = paramString.charAt(b * 2 + paramInt);
      char c2 = paramString.charAt(b * 2 + paramInt + 1);
      arrayOfByte[b] = (byte)(convertHex(c1) << 4 | convertHex(c2));
    } 
    return (ASN1Encodable)ASN1Primitive.fromByteArray(arrayOfByte);
  }
  
  public static void appendRDN(StringBuffer paramStringBuffer, RDN paramRDN, Hashtable paramHashtable) {
    if (paramRDN.isMultiValued()) {
      AttributeTypeAndValue[] arrayOfAttributeTypeAndValue = paramRDN.getTypesAndValues();
      boolean bool = true;
      for (byte b = 0; b != arrayOfAttributeTypeAndValue.length; b++) {
        if (bool) {
          bool = false;
        } else {
          paramStringBuffer.append('+');
        } 
        appendTypeAndValue(paramStringBuffer, arrayOfAttributeTypeAndValue[b], paramHashtable);
      } 
    } else if (paramRDN.getFirst() != null) {
      appendTypeAndValue(paramStringBuffer, paramRDN.getFirst(), paramHashtable);
    } 
  }
  
  public static void appendTypeAndValue(StringBuffer paramStringBuffer, AttributeTypeAndValue paramAttributeTypeAndValue, Hashtable paramHashtable) {
    String str = (String)paramHashtable.get(paramAttributeTypeAndValue.getType());
    if (str != null) {
      paramStringBuffer.append(str);
    } else {
      paramStringBuffer.append(paramAttributeTypeAndValue.getType().getId());
    } 
    paramStringBuffer.append('=');
    paramStringBuffer.append(valueToString(paramAttributeTypeAndValue.getValue()));
  }
  
  public static String valueToString(ASN1Encodable paramASN1Encodable) {
    StringBuffer stringBuffer = new StringBuffer();
    if (paramASN1Encodable instanceof ASN1String && !(paramASN1Encodable instanceof org.bouncycastle.asn1.ASN1UniversalString)) {
      String str = ((ASN1String)paramASN1Encodable).getString();
      if (str.length() > 0 && str.charAt(0) == '#')
        stringBuffer.append('\\'); 
      stringBuffer.append(str);
    } else {
      try {
        stringBuffer.append('#');
        stringBuffer.append(Hex.toHexString(paramASN1Encodable.toASN1Primitive().getEncoded("DER")));
      } catch (IOException iOException) {
        throw new IllegalArgumentException("Other value has no encoded form");
      } 
    } 
    int i = stringBuffer.length();
    int j = 0;
    if (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')
      j += true; 
    while (j != i) {
      switch (stringBuffer.charAt(j)) {
        case '"':
        case '+':
        case ',':
        case ';':
        case '<':
        case '=':
        case '>':
        case '\\':
          stringBuffer.insert(j, "\\");
          j += 2;
          i++;
          continue;
      } 
      j++;
    } 
    byte b = 0;
    if (stringBuffer.length() > 0)
      while (stringBuffer.length() > b && stringBuffer.charAt(b) == ' ') {
        stringBuffer.insert(b, "\\");
        b += 2;
      }  
    for (int k = stringBuffer.length() - 1; k >= b && stringBuffer.charAt(k) == ' '; k--)
      stringBuffer.insert(k, '\\'); 
    return stringBuffer.toString();
  }
  
  public static String canonicalize(String paramString) {
    if (paramString.length() > 0 && paramString.charAt(0) == '#') {
      ASN1Primitive aSN1Primitive = decodeObject(paramString);
      if (aSN1Primitive instanceof ASN1String)
        paramString = ((ASN1String)aSN1Primitive).getString(); 
    } 
    paramString = Strings.toLowerCase(paramString);
    int i = paramString.length();
    if (i < 2)
      return paramString; 
    byte b = 0;
    int j = i - 1;
    while (b < j && paramString.charAt(b) == '\\' && paramString.charAt(b + 1) == ' ')
      b += 2; 
    int k = j;
    int m = b + 1;
    while (k > m && paramString.charAt(k - 1) == '\\' && paramString.charAt(k) == ' ')
      k -= 2; 
    if (b > 0 || k < j)
      paramString = paramString.substring(b, k + 1); 
    return stripInternalSpaces(paramString);
  }
  
  public static String canonicalString(ASN1Encodable paramASN1Encodable) {
    return canonicalize(valueToString(paramASN1Encodable));
  }
  
  private static ASN1Primitive decodeObject(String paramString) {
    try {
      return ASN1Primitive.fromByteArray(Hex.decodeStrict(paramString, 1, paramString.length() - 1));
    } catch (IOException iOException) {
      throw new IllegalStateException("unknown encoding in name: " + iOException);
    } 
  }
  
  public static String stripInternalSpaces(String paramString) {
    if (paramString.indexOf("  ") < 0)
      return paramString; 
    StringBuffer stringBuffer = new StringBuffer();
    char c = paramString.charAt(0);
    stringBuffer.append(c);
    for (byte b = 1; b < paramString.length(); b++) {
      char c1 = paramString.charAt(b);
      if (c != ' ' || c1 != ' ') {
        stringBuffer.append(c1);
        c = c1;
      } 
    } 
    return stringBuffer.toString();
  }
  
  public static boolean rDNAreEqual(RDN paramRDN1, RDN paramRDN2) {
    if (paramRDN1.size() != paramRDN2.size())
      return false; 
    AttributeTypeAndValue[] arrayOfAttributeTypeAndValue1 = paramRDN1.getTypesAndValues();
    AttributeTypeAndValue[] arrayOfAttributeTypeAndValue2 = paramRDN2.getTypesAndValues();
    if (arrayOfAttributeTypeAndValue1.length != arrayOfAttributeTypeAndValue2.length)
      return false; 
    for (byte b = 0; b != arrayOfAttributeTypeAndValue1.length; b++) {
      if (!atvAreEqual(arrayOfAttributeTypeAndValue1[b], arrayOfAttributeTypeAndValue2[b]))
        return false; 
    } 
    return true;
  }
  
  private static boolean atvAreEqual(AttributeTypeAndValue paramAttributeTypeAndValue1, AttributeTypeAndValue paramAttributeTypeAndValue2) {
    if (paramAttributeTypeAndValue1 == paramAttributeTypeAndValue2)
      return true; 
    if (null == paramAttributeTypeAndValue1 || null == paramAttributeTypeAndValue2)
      return false; 
    ASN1ObjectIdentifier aSN1ObjectIdentifier1 = paramAttributeTypeAndValue1.getType();
    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = paramAttributeTypeAndValue2.getType();
    if (!aSN1ObjectIdentifier1.equals((ASN1Primitive)aSN1ObjectIdentifier2))
      return false; 
    String str1 = canonicalString(paramAttributeTypeAndValue1.getValue());
    String str2 = canonicalString(paramAttributeTypeAndValue2.getValue());
    return !!str1.equals(str2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x500\style\IETFUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */