package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KeyTransRecipientInformation extends RecipientInformation {
  private KeyTransRecipientInfo info;
  
  KeyTransRecipientInformation(KeyTransRecipientInfo paramKeyTransRecipientInfo, AlgorithmIdentifier paramAlgorithmIdentifier, CMSSecureReadable paramCMSSecureReadable) {
    super(paramKeyTransRecipientInfo.getKeyEncryptionAlgorithm(), paramAlgorithmIdentifier, paramCMSSecureReadable);
    this.info = paramKeyTransRecipientInfo;
    RecipientIdentifier recipientIdentifier = paramKeyTransRecipientInfo.getRecipientIdentifier();
    if (recipientIdentifier.isTagged()) {
      ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(recipientIdentifier.getId());
      this.rid = new KeyTransRecipientId(aSN1OctetString.getOctets());
    } else {
      IssuerAndSerialNumber issuerAndSerialNumber = IssuerAndSerialNumber.getInstance(recipientIdentifier.getId());
      this.rid = new KeyTransRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue());
    } 
  }
  
  protected RecipientOperator getRecipientOperator(Recipient paramRecipient) throws CMSException {
    return ((KeyTransRecipient)paramRecipient).getRecipientOperator(this.keyEncAlg, this.messageAlgorithm, this.info.getEncryptedKey().getOctets());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cms\KeyTransRecipientInformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */