package net.jcip.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GuardedBy {
  String value();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\jcip\annotations\GuardedBy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */