package com.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.demo.model.MessageModel;

@Aspect
@Component
public class LogAop {

	@Pointcut(value = "execution(* com.demo.service.impl.*.*(..))")
	public void startLog(){}
	
	@AfterReturning(value = "startLog() && @annotation(la)")
	public void writeLog(JoinPoint jp,LogAnnotation la) throws Throwable{
		System.out.println("内容："+((MessageModel)jp.getArgs()[0]).getContent());
		System.out.println("性别："+((MessageModel)jp.getArgs()[0]).getSexy());
		System.out.println("用户名："+((MessageModel)jp.getArgs()[0]).getUsername());
		System.out.println("方法执行后开始写日志");
		System.out.println("日志描述："+la.desc());
		System.out.println("日志类型："+la.type().getDesc());
		System.out.println("日志记录完毕");
	}
	
	@Before(value = "execution(* com.demo.service.impl.*.*(..)) && @annotation(la)")
	public void startLog(JoinPoint jp,LogAnnotation la) throws Throwable{
		System.out.println("内容："+((MessageModel)jp.getArgs()[0]).getContent());
		System.out.println("性别："+((MessageModel)jp.getArgs()[0]).getSexy());
		System.out.println("用户名："+((MessageModel)jp.getArgs()[0]).getUsername());
		System.out.println("方法执行前开始写日志");
		System.out.println("日志描述："+la.desc());
		System.out.println("日志类型："+la.type().getDesc());
		System.out.println("日志记录完毕");
	}
	
	//同一方法中先执行环绕通知
	@Around(value = "startLog() && @annotation(la)")
	public boolean around(ProceedingJoinPoint jp,LogAnnotation la) throws Throwable{
		System.out.println("内容："+((MessageModel)jp.getArgs()[0]).getContent());
		System.out.println("性别："+((MessageModel)jp.getArgs()[0]).getSexy());
		System.out.println("用户名："+((MessageModel)jp.getArgs()[0]).getUsername());
		System.out.println("进入环绕日志");
	    //环绕通知的方法如果有返回值，则必须在环绕通知中返回，否则会出现空异常
		boolean result = (Boolean)jp.proceed();
		System.out.println("再次进入环绕日志");
		System.out.println("日志描述："+la.desc());
		System.out.println("日志类型："+la.type().getDesc());
		System.out.println("日志记录完毕");
		return result;
	}
	
}
