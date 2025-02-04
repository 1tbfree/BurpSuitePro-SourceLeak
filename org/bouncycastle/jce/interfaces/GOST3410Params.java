package org.bouncycastle.jce.interfaces;

import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public interface GOST3410Params {
  String getPublicKeyParamSetOID();
  
  String getDigestParamSetOID();
  
  String getEncryptionParamSetOID();
  
  GOST3410PublicKeyParameterSetSpec getPublicKeyParameters();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jce\interfaces\GOST3410Params.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */