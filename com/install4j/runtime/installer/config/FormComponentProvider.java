package com.install4j.runtime.installer.config;

import com.install4j.api.context.Context;
import com.install4j.api.formcomponents.FormComponent;

public interface FormComponentProvider {
  boolean isResetInitOnPrevious();
  
  FormComponent getFormComponent();
  
  String getId();
  
  String getDisplayedId();
  
  int getInsetTop();
  
  int getInsetBottom();
  
  int getInsetLeft();
  
  int getInsetRight();
  
  boolean isEnabled();
  
  Context wrapContext(Context paramContext);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\FormComponentProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */