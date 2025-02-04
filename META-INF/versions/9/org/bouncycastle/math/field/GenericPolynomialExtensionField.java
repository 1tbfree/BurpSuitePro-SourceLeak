package META-INF.versions.9.org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Integers;

class GenericPolynomialExtensionField implements PolynomialExtensionField {
  protected final FiniteField subfield;
  
  protected final Polynomial minimalPolynomial;
  
  GenericPolynomialExtensionField(FiniteField paramFiniteField, Polynomial paramPolynomial) {
    this.subfield = paramFiniteField;
    this.minimalPolynomial = paramPolynomial;
  }
  
  public BigInteger getCharacteristic() {
    return this.subfield.getCharacteristic();
  }
  
  public int getDimension() {
    return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
  }
  
  public FiniteField getSubfield() {
    return this.subfield;
  }
  
  public int getDegree() {
    return this.minimalPolynomial.getDegree();
  }
  
  public Polynomial getMinimalPolynomial() {
    return this.minimalPolynomial;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.math.field.GenericPolynomialExtensionField))
      return false; 
    org.bouncycastle.math.field.GenericPolynomialExtensionField genericPolynomialExtensionField = (org.bouncycastle.math.field.GenericPolynomialExtensionField)paramObject;
    return (this.subfield.equals(genericPolynomialExtensionField.subfield) && this.minimalPolynomial.equals(genericPolynomialExtensionField.minimalPolynomial));
  }
  
  public int hashCode() {
    return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\field\GenericPolynomialExtensionField.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */