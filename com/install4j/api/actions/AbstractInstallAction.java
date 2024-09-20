/*    */ package com.install4j.api.actions;
/*    */ 
/*    */ import com.install4j.api.beans.AbstractBean;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractInstallAction
/*    */   extends AbstractBean
/*    */   implements InstallAction
/*    */ {
/*    */   public void rollback(InstallerContext context) {}
/*    */   
/*    */   public void init(Context context) {}
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 25 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\actions\AbstractInstallAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */