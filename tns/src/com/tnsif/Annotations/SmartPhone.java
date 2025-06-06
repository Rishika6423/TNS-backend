
package com.tnsif.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//Program to Demonstrate User Define Annotation - SmartTV
@Target(ElementType.TYPE)//giving instruction to jvm that on which type(method,class,variable)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
	String os() default "Android";
	int version() default 1;
}

