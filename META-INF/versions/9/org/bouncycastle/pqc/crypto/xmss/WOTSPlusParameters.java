package META-INF.versions.9.org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.xmss.DigestUtil;
import org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid;
import org.bouncycastle.pqc.crypto.xmss.XMSSOid;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

final class WOTSPlusParameters {
  private final XMSSOid oid;
  
  private final int digestSize;
  
  private final int winternitzParameter;
  
  private final int len;
  
  private final int len1;
  
  private final int len2;
  
  private final ASN1ObjectIdentifier treeDigest;
  
  protected WOTSPlusParameters(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    if (paramASN1ObjectIdentifier == null)
      throw new NullPointerException("treeDigest == null"); 
    this.treeDigest = paramASN1ObjectIdentifier;
    Digest digest = DigestUtil.getDigest(paramASN1ObjectIdentifier);
    this.digestSize = XMSSUtil.getDigestSize(digest);
    this.winternitzParameter = 16;
    this.len1 = (int)Math.ceil((8 * this.digestSize) / XMSSUtil.log2(this.winternitzParameter));
    this.len2 = (int)Math.floor((XMSSUtil.log2(this.len1 * (this.winternitzParameter - 1)) / XMSSUtil.log2(this.winternitzParameter))) + 1;
    this.len = this.len1 + this.len2;
    this.oid = (XMSSOid)WOTSPlusOid.lookup(digest.getAlgorithmName(), this.digestSize, this.winternitzParameter, this.len);
    if (this.oid == null)
      throw new IllegalArgumentException("cannot find OID for digest algorithm: " + digest.getAlgorithmName()); 
  }
  
  protected XMSSOid getOid() {
    return this.oid;
  }
  
  protected int getTreeDigestSize() {
    return this.digestSize;
  }
  
  protected int getWinternitzParameter() {
    return this.winternitzParameter;
  }
  
  protected int getLen() {
    return this.len;
  }
  
  protected int getLen1() {
    return this.len1;
  }
  
  protected int getLen2() {
    return this.len2;
  }
  
  public ASN1ObjectIdentifier getTreeDigest() {
    return this.treeDigest;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\xmss\WOTSPlusParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */