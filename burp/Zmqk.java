package burp;

import java.awt.Component;
import java.util.List;
import javax.swing.JTable;

class Zmqk extends Zm23 {
  final List ZS;
  
  Zmqk(List paramList) {}
  
  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    Zt3i zt3i = (Zt3i)paramObject;
    Component component = super.getTableCellRendererComponent(paramJTable, zt3i.Zm(), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    component.setEnabled(Zgqj.ZY(zt3i, this.ZS));
    return component;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmqk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */