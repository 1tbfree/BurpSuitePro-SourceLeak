package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.DomainParameters;
import org.bouncycastle.asn1.x9.ValidationParams;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jcajce.spec.DHExtendedPublicKeySpec;

public class BCDHPublicKey implements DHPublicKey {
  static final long serialVersionUID = -216691575254424324L;
  
  private BigInteger y;
  
  private transient DHPublicKeyParameters dhPublicKey;
  
  private transient DHParameterSpec dhSpec;
  
  private transient SubjectPublicKeyInfo info;
  
  BCDHPublicKey(DHPublicKeySpec paramDHPublicKeySpec) {
    this.y = paramDHPublicKeySpec.getY();
    if (paramDHPublicKeySpec instanceof DHExtendedPublicKeySpec) {
      this.dhSpec = ((DHExtendedPublicKeySpec)paramDHPublicKeySpec).getParams();
    } else {
      this.dhSpec = new DHParameterSpec(paramDHPublicKeySpec.getP(), paramDHPublicKeySpec.getG());
    } 
    if (this.dhSpec instanceof DHDomainParameterSpec) {
      DHDomainParameterSpec dHDomainParameterSpec = (DHDomainParameterSpec)this.dhSpec;
      this.dhPublicKey = new DHPublicKeyParameters(this.y, dHDomainParameterSpec.getDomainParameters());
    } else {
      this.dhPublicKey = new DHPublicKeyParameters(this.y, new DHParameters(paramDHPublicKeySpec.getP(), paramDHPublicKeySpec.getG()));
    } 
  }
  
  BCDHPublicKey(DHPublicKey paramDHPublicKey) {
    this.y = paramDHPublicKey.getY();
    this.dhSpec = paramDHPublicKey.getParams();
    if (this.dhSpec instanceof DHDomainParameterSpec) {
      DHDomainParameterSpec dHDomainParameterSpec = (DHDomainParameterSpec)this.dhSpec;
      this.dhPublicKey = new DHPublicKeyParameters(this.y, dHDomainParameterSpec.getDomainParameters());
    } else {
      this.dhPublicKey = new DHPublicKeyParameters(this.y, new DHParameters(this.dhSpec.getP(), this.dhSpec.getG()));
    } 
  }
  
  BCDHPublicKey(DHPublicKeyParameters paramDHPublicKeyParameters) {
    this.y = paramDHPublicKeyParameters.getY();
    this.dhSpec = (DHParameterSpec)new DHDomainParameterSpec(paramDHPublicKeyParameters.getParameters());
    this.dhPublicKey = paramDHPublicKeyParameters;
  }
  
  BCDHPublicKey(BigInteger paramBigInteger, DHParameterSpec paramDHParameterSpec) {
    this.y = paramBigInteger;
    this.dhSpec = paramDHParameterSpec;
    if (paramDHParameterSpec instanceof DHDomainParameterSpec) {
      this.dhPublicKey = new DHPublicKeyParameters(paramBigInteger, ((DHDomainParameterSpec)paramDHParameterSpec).getDomainParameters());
    } else {
      this.dhPublicKey = new DHPublicKeyParameters(paramBigInteger, new DHParameters(paramDHParameterSpec.getP(), paramDHParameterSpec.getG()));
    } 
  }
  
  public BCDHPublicKey(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) {
    ASN1Integer aSN1Integer;
    this.info = paramSubjectPublicKeyInfo;
    try {
      aSN1Integer = (ASN1Integer)paramSubjectPublicKeyInfo.parsePublicKey();
    } catch (IOException iOException) {
      throw new IllegalArgumentException("invalid info structure in DH public key");
    } 
    this.y = aSN1Integer.getValue();
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramSubjectPublicKeyInfo.getAlgorithm().getParameters());
    ASN1ObjectIdentifier aSN1ObjectIdentifier = paramSubjectPublicKeyInfo.getAlgorithm().getAlgorithm();
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)PKCSObjectIdentifiers.dhKeyAgreement) || isPKCSParam(aSN1Sequence)) {
      DHParameter dHParameter = DHParameter.getInstance(aSN1Sequence);
      if (dHParameter.getL() != null) {
        this.dhSpec = new DHParameterSpec(dHParameter.getP(), dHParameter.getG(), dHParameter.getL().intValue());
        this.dhPublicKey = new DHPublicKeyParameters(this.y, new DHParameters(this.dhSpec.getP(), this.dhSpec.getG(), null, this.dhSpec.getL()));
      } else {
        this.dhSpec = new DHParameterSpec(dHParameter.getP(), dHParameter.getG());
        this.dhPublicKey = new DHPublicKeyParameters(this.y, new DHParameters(this.dhSpec.getP(), this.dhSpec.getG()));
      } 
    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive)X9ObjectIdentifiers.dhpublicnumber)) {
      DomainParameters domainParameters = DomainParameters.getInstance(aSN1Sequence);
      ValidationParams validationParams = domainParameters.getValidationParams();
      if (validationParams != null) {
        this.dhPublicKey = new DHPublicKeyParameters(this.y, new DHParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), new DHValidationParameters(validationParams.getSeed(), validationParams.getPgenCounter().intValue())));
      } else {
        this.dhPublicKey = new DHPublicKeyParameters(this.y, new DHParameters(domainParameters.getP(), domainParameters.getG(), domainParameters.getQ(), domainParameters.getJ(), null));
      } 
      this.dhSpec = (DHParameterSpec)new DHDomainParameterSpec(this.dhPublicKey.getParameters());
    } else {
      throw new IllegalArgumentException("unknown algorithm type: " + aSN1ObjectIdentifier);
    } 
  }
  
  public String getAlgorithm() {
    return "DH";
  }
  
  public String getFormat() {
    return "X.509";
  }
  
  public byte[] getEncoded() {
    if (this.info != null)
      return KeyUtil.getEncodedSubjectPublicKeyInfo(this.info); 
    if (this.dhSpec instanceof DHDomainParameterSpec && ((DHDomainParameterSpec)this.dhSpec).getQ() != null) {
      DHParameters dHParameters = ((DHDomainParameterSpec)this.dhSpec).getDomainParameters();
      DHValidationParameters dHValidationParameters = dHParameters.getValidationParameters();
      ValidationParams validationParams = null;
      if (dHValidationParameters != null)
        validationParams = new ValidationParams(dHValidationParameters.getSeed(), dHValidationParameters.getCounter()); 
      return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.dhpublicnumber, (ASN1Encodable)(new DomainParameters(dHParameters.getP(), dHParameters.getG(), dHParameters.getQ(), dHParameters.getJ(), validationParams)).toASN1Primitive()), (ASN1Encodable)new ASN1Integer(this.y));
    } 
    return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.dhKeyAgreement, (ASN1Encodable)(new DHParameter(this.dhSpec.getP(), this.dhSpec.getG(), this.dhSpec.getL())).toASN1Primitive()), (ASN1Encodable)new ASN1Integer(this.y));
  }
  
  public String toString() {
    return DHUtil.publicKeyToString("DH", this.y, new DHParameters(this.dhSpec.getP(), this.dhSpec.getG()));
  }
  
  public DHParameterSpec getParams() {
    return this.dhSpec;
  }
  
  public BigInteger getY() {
    return this.y;
  }
  
  public DHPublicKeyParameters engineGetKeyParameters() {
    return this.dhPublicKey;
  }
  
  private boolean isPKCSParam(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() == 2)
      return true; 
    if (paramASN1Sequence.size() > 3)
      return false; 
    ASN1Integer aSN1Integer1 = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(2));
    ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0));
    return !(aSN1Integer1.getValue().compareTo(BigInteger.valueOf(aSN1Integer2.getValue().bitLength())) > 0);
  }
  
  public int hashCode() {
    return getY().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getL();
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof DHPublicKey))
      return false; 
    DHPublicKey dHPublicKey = (DHPublicKey)paramObject;
    return (getY().equals(dHPublicKey.getY()) && getParams().getG().equals(dHPublicKey.getParams().getG()) && getParams().getP().equals(dHPublicKey.getParams().getP()) && getParams().getL() == dHPublicKey.getParams().getL());
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    this.dhSpec = new DHParameterSpec((BigInteger)paramObjectInputStream.readObject(), (BigInteger)paramObjectInputStream.readObject(), paramObjectInputStream.readInt());
    this.info = null;
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(this.dhSpec.getP());
    paramObjectOutputStream.writeObject(this.dhSpec.getG());
    paramObjectOutputStream.writeInt(this.dhSpec.getL());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\asymmetric\dh\BCDHPublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */