package com.nimbusds.jose.proc;

import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.KeySourceException;
import java.security.Key;
import java.util.List;

public interface JWSKeySelector<C extends SecurityContext> {
  List<? extends Key> selectJWSKeys(JWSHeader paramJWSHeader, C paramC) throws KeySourceException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\proc\JWSKeySelector.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */