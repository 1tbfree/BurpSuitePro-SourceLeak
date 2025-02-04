package org.bouncycastle.pqc.crypto.xmss;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

class DigestUtil {
  private static Map<String, ASN1ObjectIdentifier> nameToOid = new HashMap<>();
  
  private static Map<ASN1ObjectIdentifier, String> oidToName = new HashMap<>();
  
  static Digest getDigest(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256))
      return (Digest)new SHA256Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha512))
      return (Digest)new SHA512Digest(); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake128))
      return (Digest)new SHAKEDigest(128); 
    if (paramASN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_shake256))
      return (Digest)new SHAKEDigest(256); 
    throw new IllegalArgumentException("unrecognized digest OID: " + paramASN1ObjectIdentifier);
  }
  
  static String getDigestName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = oidToName.get(paramASN1ObjectIdentifier);
    if (str != null)
      return str; 
    throw new IllegalArgumentException("unrecognized digest oid: " + paramASN1ObjectIdentifier);
  }
  
  static ASN1ObjectIdentifier getDigestOID(String paramString) {
    ASN1ObjectIdentifier aSN1ObjectIdentifier = nameToOid.get(paramString);
    if (aSN1ObjectIdentifier != null)
      return aSN1ObjectIdentifier; 
    throw new IllegalArgumentException("unrecognized digest name: " + paramString);
  }
  
  static {
    nameToOid.put("SHA-256", NISTObjectIdentifiers.id_sha256);
    nameToOid.put("SHA-512", NISTObjectIdentifiers.id_sha512);
    nameToOid.put("SHAKE128", NISTObjectIdentifiers.id_shake128);
    nameToOid.put("SHAKE256", NISTObjectIdentifiers.id_shake256);
    oidToName.put(NISTObjectIdentifiers.id_sha256, "SHA-256");
    oidToName.put(NISTObjectIdentifiers.id_sha512, "SHA-512");
    oidToName.put(NISTObjectIdentifiers.id_shake128, "SHAKE128");
    oidToName.put(NISTObjectIdentifiers.id_shake256, "SHAKE256");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xmss\DigestUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */