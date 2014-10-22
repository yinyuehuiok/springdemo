package com.demo.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface LogAnnotation {

	//描述
	String desc();
	
	//类型
	OperateLogEnum type() default OperateLogEnum.OTHER;
	
	//操作帐号
	String passport();
}
