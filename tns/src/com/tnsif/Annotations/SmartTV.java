
package com.tnsif.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Program to Demonstrate User Define Annotation - SmartTV
//mentioning where it is applicable(TYPE->class)
@Target(ElementType.TYPE)
//At what time i should consider this annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {
	String os();
	int width();
	int height();
}
