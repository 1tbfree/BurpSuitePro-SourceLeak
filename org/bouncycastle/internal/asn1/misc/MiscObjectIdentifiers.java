package org.bouncycastle.internal.asn1.misc;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface MiscObjectIdentifiers {
  public static final ASN1ObjectIdentifier netscape = new ASN1ObjectIdentifier("2.16.840.1.113730.1");
  
  public static final ASN1ObjectIdentifier netscapeCertType = netscape.branch("1");
  
  public static final ASN1ObjectIdentifier netscapeBaseURL = netscape.branch("2");
  
  public static final ASN1ObjectIdentifier netscapeRevocationURL = netscape.branch("3");
  
  public static final ASN1ObjectIdentifier netscapeCARevocationURL = netscape.branch("4");
  
  public static final ASN1ObjectIdentifier netscapeRenewalURL = netscape.branch("7");
  
  public static final ASN1ObjectIdentifier netscapeCApolicyURL = netscape.branch("8");
  
  public static final ASN1ObjectIdentifier netscapeSSLServerName = netscape.branch("12");
  
  public static final ASN1ObjectIdentifier netscapeCertComment = netscape.branch("13");
  
  public static final ASN1ObjectIdentifier verisign = new ASN1ObjectIdentifier("2.16.840.1.113733.1");
  
  public static final ASN1ObjectIdentifier verisignCzagExtension = verisign.branch("6.3");
  
  public static final ASN1ObjectIdentifier verisignPrivate_6_9 = verisign.branch("6.9");
  
  public static final ASN1ObjectIdentifier verisignOnSiteJurisdictionHash = verisign.branch("6.11");
  
  public static final ASN1ObjectIdentifier verisignBitString_6_13 = verisign.branch("6.13");
  
  public static final ASN1ObjectIdentifier verisignDnbDunsNumber = verisign.branch("6.15");
  
  public static final ASN1ObjectIdentifier verisignIssStrongCrypto = verisign.branch("8.1");
  
  public static final ASN1ObjectIdentifier novell = new ASN1ObjectIdentifier("2.16.840.1.113719");
  
  public static final ASN1ObjectIdentifier novellSecurityAttribs = novell.branch("1.9.4.1");
  
  public static final ASN1ObjectIdentifier entrust = new ASN1ObjectIdentifier("1.2.840.113533.7");
  
  public static final ASN1ObjectIdentifier entrustVersionExtension = entrust.branch("65.0");
  
  public static final ASN1ObjectIdentifier cast5CBC = entrust.branch("66.10");
  
  public static final ASN1ObjectIdentifier hMAC_SHA1 = new ASN1ObjectIdentifier("1.3.6.1.5.5.8.1.2");
  
  public static final ASN1ObjectIdentifier as_sys_sec_alg_ideaCBC = new ASN1ObjectIdentifier("1.3.6.1.4.1.188.7.1.1.2");
  
  public static final ASN1ObjectIdentifier cryptlib = new ASN1ObjectIdentifier("1.3.6.1.4.1.3029");
  
  public static final ASN1ObjectIdentifier cryptlib_algorithm = cryptlib.branch("1");
  
  public static final ASN1ObjectIdentifier cryptlib_algorithm_blowfish_ECB = cryptlib_algorithm.branch("1.1");
  
  public static final ASN1ObjectIdentifier cryptlib_algorithm_blowfish_CBC = cryptlib_algorithm.branch("1.2");
  
  public static final ASN1ObjectIdentifier cryptlib_algorithm_blowfish_CFB = cryptlib_algorithm.branch("1.3");
  
  public static final ASN1ObjectIdentifier cryptlib_algorithm_blowfish_OFB = cryptlib_algorithm.branch("1.4");
  
  public static final ASN1ObjectIdentifier blake2 = new ASN1ObjectIdentifier("1.3.6.1.4.1.1722.12.2");
  
  public static final ASN1ObjectIdentifier id_blake2b160 = blake2.branch("1.5");
  
  public static final ASN1ObjectIdentifier id_blake2b256 = blake2.branch("1.8");
  
  public static final ASN1ObjectIdentifier id_blake2b384 = blake2.branch("1.12");
  
  public static final ASN1ObjectIdentifier id_blake2b512 = blake2.branch("1.16");
  
  public static final ASN1ObjectIdentifier id_blake2s128 = blake2.branch("2.4");
  
  public static final ASN1ObjectIdentifier id_blake2s160 = blake2.branch("2.5");
  
  public static final ASN1ObjectIdentifier id_blake2s224 = blake2.branch("2.7");
  
  public static final ASN1ObjectIdentifier id_blake2s256 = blake2.branch("2.8");
  
  public static final ASN1ObjectIdentifier blake3 = blake2.branch("3");
  
  public static final ASN1ObjectIdentifier blake3_256 = blake3.branch("8");
  
  public static final ASN1ObjectIdentifier id_scrypt = new ASN1ObjectIdentifier("1.3.6.1.4.1.11591.4.11");
  
  public static final ASN1ObjectIdentifier id_alg_composite = new ASN1ObjectIdentifier("1.3.6.1.4.1.18227.2.1");
  
  public static final ASN1ObjectIdentifier id_composite_key = new ASN1ObjectIdentifier("2.16.840.1.114027.80.4.1");
  
  public static final ASN1ObjectIdentifier id_oracle_pkcs12_trusted_key_usage = new ASN1ObjectIdentifier("2.16.840.1.113894.746875.1.1");
  
  public static final ASN1ObjectIdentifier id_composite_signatures = new ASN1ObjectIdentifier("2.16.840.1.114027.80.8.1");
  
  public static final ASN1ObjectIdentifier id_MLDSA44_RSA2048_PSS_SHA256 = id_composite_signatures.branch("1");
  
  public static final ASN1ObjectIdentifier id_MLDSA44_RSA2048_PKCS15_SHA256 = id_composite_signatures.branch("2");
  
  public static final ASN1ObjectIdentifier id_MLDSA44_Ed25519_SHA512 = id_composite_signatures.branch("3");
  
  public static final ASN1ObjectIdentifier id_MLDSA44_ECDSA_P256_SHA256 = id_composite_signatures.branch("4");
  
  public static final ASN1ObjectIdentifier id_MLDSA44_ECDSA_brainpoolP256r1_SHA256 = id_composite_signatures.branch("5");
  
  public static final ASN1ObjectIdentifier id_MLDSA65_RSA3072_PSS_SHA512 = id_composite_signatures.branch("6");
  
  public static final ASN1ObjectIdentifier id_MLDSA65_RSA3072_PKCS15_SHA512 = id_composite_signatures.branch("7");
  
  public static final ASN1ObjectIdentifier id_MLDSA65_ECDSA_P256_SHA512 = id_composite_signatures.branch("8");
  
  public static final ASN1ObjectIdentifier id_MLDSA65_ECDSA_brainpoolP256r1_SHA512 = id_composite_signatures.branch("9");
  
  public static final ASN1ObjectIdentifier id_MLDSA65_Ed25519_SHA512 = id_composite_signatures.branch("10");
  
  public static final ASN1ObjectIdentifier id_MLDSA87_ECDSA_P384_SHA512 = id_composite_signatures.branch("11");
  
  public static final ASN1ObjectIdentifier id_MLDSA87_ECDSA_brainpoolP384r1_SHA512 = id_composite_signatures.branch("12");
  
  public static final ASN1ObjectIdentifier id_MLDSA87_Ed448_SHA512 = id_composite_signatures.branch("13");
  
  public static final ASN1ObjectIdentifier id_Falcon512_ECDSA_P256_SHA256 = id_composite_signatures.branch("14");
  
  public static final ASN1ObjectIdentifier id_Falcon512_ECDSA_brainpoolP256r1_SHA256 = id_composite_signatures.branch("15");
  
  public static final ASN1ObjectIdentifier id_Falcon512_Ed25519_SHA512 = id_composite_signatures.branch("16");
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\internal\asn1\misc\MiscObjectIdentifiers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */