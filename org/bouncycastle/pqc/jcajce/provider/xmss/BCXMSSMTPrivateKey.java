package org.bouncycastle.pqc.jcajce.provider.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.crypto.util.PrivateKeyFactory;
import org.bouncycastle.pqc.crypto.util.PrivateKeyInfoFactory;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.jcajce.interfaces.XMSSMTPrivateKey;
import org.bouncycastle.util.Arrays;

public class BCXMSSMTPrivateKey implements PrivateKey, XMSSMTPrivateKey {
  private static final long serialVersionUID = 7682140473044521395L;
  
  private transient ASN1ObjectIdentifier treeDigest;
  
  private transient XMSSMTPrivateKeyParameters keyParams;
  
  private transient ASN1Set attributes;
  
  public BCXMSSMTPrivateKey(ASN1ObjectIdentifier paramASN1ObjectIdentifier, XMSSMTPrivateKeyParameters paramXMSSMTPrivateKeyParameters) {
    this.treeDigest = paramASN1ObjectIdentifier;
    this.keyParams = paramXMSSMTPrivateKeyParameters;
  }
  
  public BCXMSSMTPrivateKey(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    init(paramPrivateKeyInfo);
  }
  
  private void init(PrivateKeyInfo paramPrivateKeyInfo) throws IOException {
    this.attributes = paramPrivateKeyInfo.getAttributes();
    XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(paramPrivateKeyInfo.getPrivateKeyAlgorithm().getParameters());
    this.treeDigest = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
    this.keyParams = (XMSSMTPrivateKeyParameters)PrivateKeyFactory.createKey(paramPrivateKeyInfo);
  }
  
  public long getIndex() {
    if (getUsagesRemaining() == 0L)
      throw new IllegalStateException("key exhausted"); 
    return this.keyParams.getIndex();
  }
  
  public long getUsagesRemaining() {
    return this.keyParams.getUsagesRemaining();
  }
  
  public XMSSMTPrivateKey extractKeyShard(int paramInt) {
    return new BCXMSSMTPrivateKey(this.treeDigest, this.keyParams.extractKeyShard(paramInt));
  }
  
  public String getAlgorithm() {
    return "XMSSMT";
  }
  
  public String getFormat() {
    return "PKCS#8";
  }
  
  public byte[] getEncoded() {
    try {
      PrivateKeyInfo privateKeyInfo = PrivateKeyInfoFactory.createPrivateKeyInfo((AsymmetricKeyParameter)this.keyParams, this.attributes);
      return privateKeyInfo.getEncoded();
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  CipherParameters getKeyParams() {
    return (CipherParameters)this.keyParams;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof BCXMSSMTPrivateKey) {
      BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey)paramObject;
      return (this.treeDigest.equals((ASN1Primitive)bCXMSSMTPrivateKey.treeDigest) && Arrays.areEqual(this.keyParams.toByteArray(), bCXMSSMTPrivateKey.keyParams.toByteArray()));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.treeDigest.hashCode() + 37 * Arrays.hashCode(this.keyParams.toByteArray());
  }
  
  ASN1ObjectIdentifier getTreeDigestOID() {
    return this.treeDigest;
  }
  
  public int getHeight() {
    return this.keyParams.getParameters().getHeight();
  }
  
  public int getLayers() {
    return this.keyParams.getParameters().getLayers();
  }
  
  public String getTreeDigest() {
    return DigestUtil.getXMSSDigestName(this.treeDigest);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
    paramObjectInputStream.defaultReadObject();
    byte[] arrayOfByte = (byte[])paramObjectInputStream.readObject();
    init(PrivateKeyInfo.getInstance(arrayOfByte));
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream) throws IOException {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeObject(getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\jcajce\provider\xmss\BCXMSSMTPrivateKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */