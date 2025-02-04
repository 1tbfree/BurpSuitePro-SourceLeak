/*     */ package javafx.beans.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.adapter.JavaBeanPropertyBuilderHelper;
/*     */ import com.sun.javafx.property.adapter.PropertyDescriptor;
/*     */ import java.lang.reflect.Method;
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
/*     */ public final class JavaBeanBooleanPropertyBuilder
/*     */ {
/*  62 */   private final JavaBeanPropertyBuilderHelper<Boolean> helper = new JavaBeanPropertyBuilderHelper();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static JavaBeanBooleanPropertyBuilder create() {
/*  72 */     return new JavaBeanBooleanPropertyBuilder();
/*     */   }
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
/*     */   public JavaBeanBooleanProperty build() throws NoSuchMethodException {
/*  85 */     PropertyDescriptor<Boolean> propertyDescriptor = this.helper.getDescriptor();
/*  86 */     if (!boolean.class.equals(propertyDescriptor.getType()) && !Boolean.class.equals(propertyDescriptor.getType())) {
/*  87 */       throw new IllegalArgumentException("Not a boolean property");
/*     */     }
/*  89 */     return new JavaBeanBooleanProperty(propertyDescriptor, this.helper.getBean());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder name(String paramString) {
/*  99 */     this.helper.name(paramString);
/* 100 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder bean(Object paramObject) {
/* 110 */     this.helper.bean(paramObject);
/* 111 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder beanClass(Class<?> paramClass) {
/* 123 */     this.helper.beanClass(paramClass);
/* 124 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder getter(String paramString) {
/* 135 */     this.helper.getterName(paramString);
/* 136 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder setter(String paramString) {
/* 147 */     this.helper.setterName(paramString);
/* 148 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder getter(Method paramMethod) {
/* 159 */     this.helper.getter(paramMethod);
/* 160 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaBeanBooleanPropertyBuilder setter(Method paramMethod) {
/* 171 */     this.helper.setter(paramMethod);
/* 172 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\JavaBeanBooleanPropertyBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */