package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

public class DSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private DSAKeyGenerationParameters param;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.param = (DSAKeyGenerationParameters)paramKeyGenerationParameters;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("DSAKeyGen", ConstraintUtils.bitsOfSecurityFor(this.param.getParameters().getP()), this.param.getParameters(), CryptoServicePurpose.KEYGEN));
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    DSAParameters dSAParameters = this.param.getParameters();
    BigInteger bigInteger1 = generatePrivateKey(dSAParameters.getQ(), this.param.getRandom());
    BigInteger bigInteger2 = calculatePublicKey(dSAParameters.getP(), dSAParameters.getG(), bigInteger1);
    return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)new DSAPublicKeyParameters(bigInteger2, dSAParameters), (AsymmetricKeyParameter)new DSAPrivateKeyParameters(bigInteger1, dSAParameters));
  }
  
  private static BigInteger generatePrivateKey(BigInteger paramBigInteger, SecureRandom paramSecureRandom) {
    int i = paramBigInteger.bitLength() >>> 2;
    while (true) {
      BigInteger bigInteger = BigIntegers.createRandomInRange(ONE, paramBigInteger.subtract(ONE), paramSecureRandom);
      if (WNafUtil.getNafWeight(bigInteger) >= i)
        return bigInteger; 
    } 
  }
  
  private static BigInteger calculatePublicKey(BigInteger paramBigInteger1, BigInteger paramBigInteger2, BigInteger paramBigInteger3) {
    return paramBigInteger2.modPow(paramBigInteger3, paramBigInteger1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\DSAKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */