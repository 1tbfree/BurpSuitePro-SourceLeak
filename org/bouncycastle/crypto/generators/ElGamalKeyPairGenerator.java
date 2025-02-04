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
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;

public class ElGamalKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
  private ElGamalKeyGenerationParameters param;
  
  public void init(KeyGenerationParameters paramKeyGenerationParameters) {
    this.param = (ElGamalKeyGenerationParameters)paramKeyGenerationParameters;
    CryptoServicesRegistrar.checkConstraints((CryptoServiceProperties)new DefaultServiceProperties("ElGamalKeyGen", ConstraintUtils.bitsOfSecurityFor(this.param.getParameters().getP()), this.param.getParameters(), CryptoServicePurpose.KEYGEN));
  }
  
  public AsymmetricCipherKeyPair generateKeyPair() {
    DHKeyGeneratorHelper dHKeyGeneratorHelper = DHKeyGeneratorHelper.INSTANCE;
    ElGamalParameters elGamalParameters = this.param.getParameters();
    DHParameters dHParameters = new DHParameters(elGamalParameters.getP(), elGamalParameters.getG(), null, elGamalParameters.getL());
    BigInteger bigInteger1 = dHKeyGeneratorHelper.calculatePrivate(dHParameters, this.param.getRandom());
    BigInteger bigInteger2 = dHKeyGeneratorHelper.calculatePublic(dHParameters, bigInteger1);
    return new AsymmetricCipherKeyPair((AsymmetricKeyParameter)new ElGamalPublicKeyParameters(bigInteger2, elGamalParameters), (AsymmetricKeyParameter)new ElGamalPrivateKeyParameters(bigInteger1, elGamalParameters));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\generators\ElGamalKeyPairGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */