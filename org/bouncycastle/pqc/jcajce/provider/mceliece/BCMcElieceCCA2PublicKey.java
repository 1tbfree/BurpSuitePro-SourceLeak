package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.util.PublicKeyFactory;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

public class BCMcElieceCCA2PublicKey implements CipherParameters, PublicKey {
  private static final long serialVersionUID = 1L;
  
  private transient McElieceCCA2PublicKeyParameters params;
  
  public BCMcElieceCCA2PublicKey(McElieceCCA2PublicKeyParameters paramMcElieceCCA2PublicKeyParameters) {
    this.params = paramMcElieceCCA2PublicKeyParameters;
  }
  
  private void init(SubjectPublicKeyInfo paramSubjectPublicKeyInfo) throws IOException {
    this.params = (McElieceCCA2PublicKeyParameters)PublicKeyFactory.createKey(paramSubjectPublicKeyInfo);
  }
  
  public String getAlgorithm() {
    return "McEliece-CCA2";
  }
  
  public int getN() {
    return this.params.getN();
  }
  
  public int getK() {
    return this.params.getK();
  }
  
  public int getT() {
    return this.params.getT();
  }
  
  public GF2Matrix getG() {
    return this.params.getG();
  }
  
  public String toString() {
    null = "McEliecePublicKey:\n";
    null = null + " length of the code         : " + this.params.getN() + "\n";
    null = null + " error correction capability: " + this.params.getT() + "\n";
    return null + " generator matrix           : " + this.params.getG().toString();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == null || !(paramObject instanceof BCMcElieceCCA2PublicKey))
      return false; 
    BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey)paramObject;
    return (this.params.getN() == bCMcElieceCCA2PublicKey.getN() && this.params.getT() == bCMcElieceCCA2PublicKey.getT() && this.params.getG().equals(bCMcElieceCCA2PublicKey.getG()));
  }
  
  public int hashCode() {
    return 37 * (this.params.getN() + 37 * this.params.getT()) + this.params.getG().hashCode();
  }
  
  public byte[] getEncoded() {
    McElieceCCA2PublicKey mcElieceCCA2PublicKey = new McElieceCCA2PublicKey(this.params.getN(), this.params.getT(), this.params.getG(), MessageDigestUtils.getDigestAlgID(this.params.getDigest()));
    AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2);
    try {
      SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo(algorithmIdentifier, (ASN1Encodable)mcElieceCCA2PublicKey);
      return subjectPublicKeyInfo.getEncoded();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public String getFormat() {
    return "X.509";
  }
  
  AsymmetricKeyParameter getKeyParams() {
    return (AsymmetricKeyParameter)this.params;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    init(SubjectPublicKeyInfo.getInstance(arrayOfByte));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\mceliece\BCMcElieceCCA2PublicKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */