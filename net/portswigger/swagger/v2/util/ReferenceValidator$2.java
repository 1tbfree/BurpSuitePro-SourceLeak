package net.portswigger.swagger.v2.util;

import net.portswigger.swagger.v3.oas.models.Components;

enum ReferenceValidator$2 {
  public boolean validateComponent(Components paramComponents, String paramString) {
    return paramComponents.getResponses().containsKey(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ReferenceValidator$2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */