/*    */ package javafx.beans.property;
/*    */ 
/*    */ import com.sun.javafx.binding.ExpressionHelper;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
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
/*    */ public abstract class ReadOnlyStringPropertyBase
/*    */   extends ReadOnlyStringProperty
/*    */ {
/*    */   ExpressionHelper<String> helper;
/*    */   
/*    */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 52 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 57 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*    */   }
/*    */ 
/*    */   
/*    */   public void addListener(ChangeListener<? super String> paramChangeListener) {
/* 62 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeListener(ChangeListener<? super String> paramChangeListener) {
/* 67 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void fireValueChangedEvent() {
/* 78 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ReadOnlyStringPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */