package org.bouncycastle.cert.crmf;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface PKMACValuesCalculator {
  void setup(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) throws CRMFException;
  
  byte[] calculateDigest(byte[] paramArrayOfbyte) throws CRMFException;
  
  byte[] calculateMac(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) throws CRMFException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\crmf\PKMACValuesCalculator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */