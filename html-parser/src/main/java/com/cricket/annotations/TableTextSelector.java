package com.cricket.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
public @interface TableTextSelector{
	public String selector() default "";
	
	public String scope() default "global";
	
	public String regex() default "";
	
	public String heading() default "";
	
	public int adjustment() default 0;
}
