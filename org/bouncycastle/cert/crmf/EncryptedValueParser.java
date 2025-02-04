package org.bouncycastle.cert.crmf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.crmf.EncryptedValue;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.InputDecryptor;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.io.Streams;

public class EncryptedValueParser {
  private EncryptedValue value;
  
  private EncryptedValuePadder padder;
  
  public EncryptedValueParser(EncryptedValue paramEncryptedValue) {
    this.value = paramEncryptedValue;
  }
  
  public EncryptedValueParser(EncryptedValue paramEncryptedValue, EncryptedValuePadder paramEncryptedValuePadder) {
    this.value = paramEncryptedValue;
    this.padder = paramEncryptedValuePadder;
  }
  
  public AlgorithmIdentifier getIntendedAlg() {
    return this.value.getIntendedAlg();
  }
  
  private byte[] decryptValue(ValueDecryptorGenerator paramValueDecryptorGenerator) throws CRMFException {
    if (this.value.getValueHint() != null)
      throw new UnsupportedOperationException(); 
    InputDecryptor inputDecryptor = paramValueDecryptorGenerator.getValueDecryptor(this.value.getKeyAlg(), this.value.getSymmAlg(), this.value.getEncSymmKey().getBytes());
    InputStream inputStream = inputDecryptor.getInputStream(new ByteArrayInputStream(this.value.getEncValue().getBytes()));
    try {
      return unpadData(Streams.readAll(inputStream));
    } catch (IOException iOException) {
      throw new CRMFException("Cannot parse decrypted data: " + iOException.getMessage(), iOException);
    } 
  }
  
  public X509CertificateHolder readCertificateHolder(ValueDecryptorGenerator paramValueDecryptorGenerator) throws CRMFException {
    return new X509CertificateHolder(Certificate.getInstance(decryptValue(paramValueDecryptorGenerator)));
  }
  
  public PrivateKeyInfo readPrivateKeyInfo(ValueDecryptorGenerator paramValueDecryptorGenerator) throws CRMFException {
    return PrivateKeyInfo.getInstance(decryptValue(paramValueDecryptorGenerator));
  }
  
  public char[] readPassphrase(ValueDecryptorGenerator paramValueDecryptorGenerator) throws CRMFException {
    return Strings.fromUTF8ByteArray(decryptValue(paramValueDecryptorGenerator)).toCharArray();
  }
  
  private byte[] unpadData(byte[] paramArrayOfbyte) {
    return (this.padder != null) ? this.padder.getUnpaddedData(paramArrayOfbyte) : paramArrayOfbyte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\EncryptedValueParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */