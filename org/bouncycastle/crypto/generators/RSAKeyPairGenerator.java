package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private static final BigInteger ONE = BigInteger.valueOf(1L);
  
  private RSAKeyGenerationParameters param;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.param = (RSAKeyGenerationParameters)paramKeyGenerationParameters;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("RSAKeyGen", ConstraintUtils.bitsOfSecurityForFF(paramKeyGenerationParameters.getStrength()), null, CryptoServicePurpose.KEYGEN));
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
    boolean bool = false;
    int i = this.param.getStrength();
    int j = (i + 1) / 2;
    int k = i - j;
    int m = i / 2 - 100;
    if (m < i / 3)
      m = i / 3; 
    int n = i >> 2;
    BigInteger bigInteger1 = BigInteger.valueOf(2L).pow(i / 2);
    BigInteger bigInteger2 = ONE.shiftLeft(i - 1);
    BigInteger bigInteger3 = ONE.shiftLeft(m);
    while (!bool) {
      BigInteger bigInteger5;
      BigInteger bigInteger6;
      BigInteger bigInteger7;
      BigInteger bigInteger9;
      BigInteger bigInteger10;
      BigInteger bigInteger8 = this.param.getPublicExponent();
      BigInteger bigInteger4 = chooseRandomPrime(j, bigInteger8, bigInteger2);
      while (true) {
        bigInteger5 = chooseRandomPrime(k, bigInteger8, bigInteger2);
        BigInteger bigInteger16 = bigInteger5.subtract(bigInteger4).abs();
        if (bigInteger16.bitLength() < m || bigInteger16.compareTo(bigInteger3) <= 0)
          continue; 
        bigInteger6 = bigInteger4.multiply(bigInteger5);
        if (bigInteger6.bitLength() != i) {
          bigInteger4 = bigInteger4.max(bigInteger5);
          continue;
        } 
        if (WNafUtil.getNafWeight(bigInteger6) < n) {
          bigInteger4 = chooseRandomPrime(j, bigInteger8, bigInteger2);
          continue;
        } 
        if (bigInteger4.compareTo(bigInteger5) < 0) {
          BigInteger bigInteger = bigInteger4;
          bigInteger4 = bigInteger5;
          bigInteger5 = bigInteger;
        } 
        bigInteger9 = bigInteger4.subtract(ONE);
        bigInteger10 = bigInteger5.subtract(ONE);
        BigInteger bigInteger14 = bigInteger9.gcd(bigInteger10);
        BigInteger bigInteger15 = bigInteger9.divide(bigInteger14).multiply(bigInteger10);
        bigInteger7 = bigInteger8.modInverse(bigInteger15);
        break;
      } 
      if (bigInteger7.compareTo(bigInteger1) <= 0)
        continue; 
      bool = true;
      BigInteger bigInteger11 = bigInteger7.remainder(bigInteger9);
      BigInteger bigInteger12 = bigInteger7.remainder(bigInteger10);
      BigInteger bigInteger13 = BigIntegers.modOddInverse(bigInteger4, bigInteger5);
      asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter)new RSAKeyParameters(false, bigInteger6, bigInteger8, true), (AsymmetricKeyParameter)new RSAPrivateCrtKeyParameters(bigInteger6, bigInteger8, bigInteger7, bigInteger4, bigInteger5, bigInteger11, bigInteger12, bigInteger13, true));
    } 
    return asymmetricCipherKeyPair;
  }
  
  protected BigInteger chooseRandomPrime(int paramInt, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    byte b = 0;
    while (b != 5 * paramInt) {
      BigInteger bigInteger = BigIntegers.createRandomPrime(paramInt, 1, this.param.getRandom());
      if (bigInteger.mod(paramBigInteger1).equals(ONE) || bigInteger.multiply(bigInteger).compareTo(paramBigInteger2) < 0 || !isProbablePrime(bigInteger) || !paramBigInteger1.gcd(bigInteger.subtract(ONE)).equals(ONE)) {
        b++;
        continue;
      } 
      return bigInteger;
    } 
    throw new IllegalStateException("unable to generate prime number for RSA key");
  }
  
  protected boolean isProbablePrime(BigInteger paramBigInteger) {
    int i = getNumberOfIterations(paramBigInteger.bitLength(), this.param.getCertainty());
    return (!Primes.hasAnySmallFactors(paramBigInteger) && Primes.isMRProbablePrime(paramBigInteger, this.param.getRandom(), i));
  }
  
  private static int getNumberOfIterations(int paramInt1, int paramInt2) {
    return (paramInt1 >= 1536) ? ((paramInt2 <= 100) ? 3 : ((paramInt2 <= 128) ? 4 : (4 + (paramInt2 - 128 + 1) / 2))) : ((paramInt1 >= 1024) ? ((paramInt2 <= 100) ? 4 : ((paramInt2 <= 112) ? 5 : (5 + (paramInt2 - 112 + 1) / 2))) : ((paramInt1 >= 512) ? ((paramInt2 <= 80) ? 5 : ((paramInt2 <= 100) ? 7 : (7 + (paramInt2 - 100 + 1) / 2))) : ((paramInt2 <= 80) ? 40 : (40 + (paramInt2 - 80 + 1) / 2))));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\RSAKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */