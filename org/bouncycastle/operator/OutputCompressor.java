package org.bouncycastle.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public interface OutputCompressor {
  AlgorithmIdentifier getAlgorithmIdentifier();
  
  OutputStream getOutputStream(OutputStream paramOutputStream);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\operator\OutputCompressor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */