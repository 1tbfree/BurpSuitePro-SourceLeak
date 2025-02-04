package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.crmf.CertRequest;
import org.bouncycastle.asn1.crmf.PKMACValue;
import org.bouncycastle.asn1.crmf.POPOSigningKey;
import org.bouncycastle.asn1.crmf.POPOSigningKeyInput;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentSigner;

public class ProofOfPossessionSigningKeyBuilder {
  private CertRequest certRequest;
  
  private SubjectPublicKeyInfo pubKeyInfo;
  
  private GeneralName name;
  
  private PKMACValue publicKeyMAC;
  
  public ProofOfPossessionSigningKeyBuilder(CertRequest paramCertRequest) {
    this.certRequest = paramCertRequest;
  }
  
  public ProofOfPossessionSigningKeyBuilder(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    this.pubKeyInfo = paramSubjectPublicKeyInfo;
  }
  
  public ProofOfPossessionSigningKeyBuilder setSender(GeneralName paramGeneralName) {
    this.name = paramGeneralName;
    return this;
  }
  
  public ProofOfPossessionSigningKeyBuilder setPublicKeyMac(PKMACBuilder paramPKMACBuilder, char[] paramArrayOfchar) throws CRMFException {
    this.publicKeyMAC = PKMACValueGenerator.generate(paramPKMACBuilder, paramArrayOfchar, this.pubKeyInfo);
    return this;
  }
  
  public POPOSigningKey build(ContentSigner paramContentSigner) {
    POPOSigningKeyInput pOPOSigningKeyInput;
    if (this.name != null && this.publicKeyMAC != null)
      throw new IllegalStateException("name and publicKeyMAC cannot both be set."); 
    if (this.certRequest != null) {
      pOPOSigningKeyInput = null;
      CRMFUtil.derEncodeToStream((ASN1Object)this.certRequest, paramContentSigner.getOutputStream());
    } else if (this.name != null) {
      pOPOSigningKeyInput = new POPOSigningKeyInput(this.name, this.pubKeyInfo);
      CRMFUtil.derEncodeToStream((ASN1Object)pOPOSigningKeyInput, paramContentSigner.getOutputStream());
    } else {
      pOPOSigningKeyInput = new POPOSigningKeyInput(this.publicKeyMAC, this.pubKeyInfo);
      CRMFUtil.derEncodeToStream((ASN1Object)pOPOSigningKeyInput, paramContentSigner.getOutputStream());
    } 
    return new POPOSigningKey(pOPOSigningKeyInput, paramContentSigner.getAlgorithmIdentifier(), (ASN1BitString)new DERBitString(paramContentSigner.getSignature()));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\ProofOfPossessionSigningKeyBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */