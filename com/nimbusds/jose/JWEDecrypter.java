package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;

public interface JWEDecrypter extends JWEProvider {
  byte[] decrypt(JWEHeader paramJWEHeader, Base64URL paramBase64URL1, Base64URL paramBase64URL2, Base64URL paramBase64URL3, Base64URL paramBase64URL4) throws JOSEException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\JWEDecrypter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */