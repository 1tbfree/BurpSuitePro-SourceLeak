package burp;

import javafx.beans.property.SimpleIntegerProperty;

class Zscx extends SimpleIntegerProperty {
  Zscx(Zbkb paramZbkb, int paramInt) {
    super(paramInt);
  }
  
  public void set(int paramInt) {
    super.set(Zbkb.Zz(paramInt));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zscx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */