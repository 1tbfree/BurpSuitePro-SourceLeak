package org.bouncycastle.math.field;

import java.math.BigInteger;

class PrimeField implements FiniteField {
  protected final BigInteger characteristic;
  
  PrimeField(BigInteger paramBigInteger) {
    this.characteristic = paramBigInteger;
  }
  
  public BigInteger getCharacteristic() {
    return this.characteristic;
  }
  
  public int getDimension() {
    return 1;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof PrimeField))
      return false; 
    PrimeField primeField = (PrimeField)paramObject;
    return this.characteristic.equals(primeField.characteristic);
  }
  
  public int hashCode() {
    return this.characteristic.hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\field\PrimeField.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */