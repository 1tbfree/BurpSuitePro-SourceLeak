package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class ClassUtil {
  public static Class loadClass(Class paramClass, final String className) {
    try {
      ClassLoader classLoader = paramClass.getClassLoader();
      return (classLoader != null) ? classLoader.loadClass(className) : AccessController.<Class<?>>doPrivileged(new PrivilegedAction<Class<?>>() {
            public Object run() {
              try {
                ClassLoader classLoader = ClassLoader.getSystemClassLoader();
                return classLoader.loadClass(className);
              } catch (Exception exception) {
                return null;
              } 
            }
          });
    } catch (ClassNotFoundException classNotFoundException) {
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\provider\symmetri\\util\ClassUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */