package org.bouncycastle.jcajce.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.internal.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.internal.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;

public class MessageDigestUtils {
  private static Map<ASN1ObjectIdentifier, String> digestOidMap = new HashMap<>();
  
  private static Map<String, AlgorithmIdentifier> digestAlgIdMap = new HashMap<>();
  
  public static AlgorithmIdentifier getDigestAlgID(String paramString) {
    if (digestAlgIdMap.containsKey(paramString))
      return digestAlgIdMap.get(paramString); 
    throw new IllegalArgumentException("unknown digest: " + paramString);
  }
  
  public static String getDigestName(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    String str = digestOidMap.get(paramASN1ObjectIdentifier);
    return (str != null) ? str : paramASN1ObjectIdentifier.getId();
  }
  
  static {
    digestOidMap.put(PKCSObjectIdentifiers.md2, "MD2");
    digestOidMap.put(PKCSObjectIdentifiers.md4, "MD4");
    digestOidMap.put(PKCSObjectIdentifiers.md5, "MD5");
    digestOidMap.put(OIWObjectIdentifiers.idSHA1, "SHA-1");
    digestOidMap.put(NISTObjectIdentifiers.id_sha224, "SHA-224");
    digestOidMap.put(NISTObjectIdentifiers.id_sha256, "SHA-256");
    digestOidMap.put(NISTObjectIdentifiers.id_sha384, "SHA-384");
    digestOidMap.put(NISTObjectIdentifiers.id_sha512, "SHA-512");
    digestOidMap.put(NISTObjectIdentifiers.id_sha512_224, "SHA-512(224)");
    digestOidMap.put(NISTObjectIdentifiers.id_sha512_256, "SHA-512(256)");
    digestOidMap.put(TeleTrusTObjectIdentifiers.ripemd128, "RIPEMD-128");
    digestOidMap.put(TeleTrusTObjectIdentifiers.ripemd160, "RIPEMD-160");
    digestOidMap.put(TeleTrusTObjectIdentifiers.ripemd256, "RIPEMD-128");
    digestOidMap.put(ISOIECObjectIdentifiers.ripemd128, "RIPEMD-128");
    digestOidMap.put(ISOIECObjectIdentifiers.ripemd160, "RIPEMD-160");
    digestOidMap.put(CryptoProObjectIdentifiers.gostR3411, "GOST3411");
    digestOidMap.put(GNUObjectIdentifiers.Tiger_192, "Tiger");
    digestOidMap.put(ISOIECObjectIdentifiers.whirlpool, "Whirlpool");
    digestOidMap.put(NISTObjectIdentifiers.id_sha3_224, "SHA3-224");
    digestOidMap.put(NISTObjectIdentifiers.id_sha3_256, "SHA3-256");
    digestOidMap.put(NISTObjectIdentifiers.id_sha3_384, "SHA3-384");
    digestOidMap.put(NISTObjectIdentifiers.id_sha3_512, "SHA3-512");
    digestOidMap.put(NISTObjectIdentifiers.id_shake128, "SHAKE128");
    digestOidMap.put(NISTObjectIdentifiers.id_shake256, "SHAKE256");
    digestOidMap.put(GMObjectIdentifiers.sm3, "SM3");
    digestOidMap.put(MiscObjectIdentifiers.blake3_256, "BLAKE3-256");
    digestAlgIdMap.put("SHA-1", new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, (ASN1Encodable)DERNull.INSTANCE));
    digestAlgIdMap.put("SHA-224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224));
    digestAlgIdMap.put("SHA224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224));
    digestAlgIdMap.put("SHA-256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256));
    digestAlgIdMap.put("SHA256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256));
    digestAlgIdMap.put("SHA-384", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384));
    digestAlgIdMap.put("SHA384", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384));
    digestAlgIdMap.put("SHA-512", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512));
    digestAlgIdMap.put("SHA512", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512));
    digestAlgIdMap.put("SHA3-224", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_224));
    digestAlgIdMap.put("SHA3-256", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256));
    digestAlgIdMap.put("SHA3-384", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_384));
    digestAlgIdMap.put("SHA3-512", new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_512));
    digestAlgIdMap.put("BLAKE3-256", new AlgorithmIdentifier(MiscObjectIdentifiers.blake3_256));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajc\\util\MessageDigestUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */