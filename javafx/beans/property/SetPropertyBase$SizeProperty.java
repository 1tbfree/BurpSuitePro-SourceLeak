/*     */ package javafx.beans.property;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SizeProperty
/*     */   extends ReadOnlyIntegerPropertyBase
/*     */ {
/*     */   public int get() {
/*  98 */     return SetPropertyBase.this.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 103 */     return SetPropertyBase.this;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getName() {
/* 108 */     return "size";
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 113 */     super.fireValueChangedEvent();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\SetPropertyBase$SizeProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */