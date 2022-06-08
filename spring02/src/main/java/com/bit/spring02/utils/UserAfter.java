package com.bit.spring02.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class UserAfter {

//	@After("execution(* com.bit.spring02.service.MyModule.*(..))")
	public void afterTargetMethod(JoinPoint point) {
		System.out.println("method after run...");
	}
	
//	@AfterReturning(pointcut = "execution(* com.bit.spring02.service.MyModule.*(..))" , returning = "result")
	public void afterReturningTargetMethod(JoinPoint point, Object result) {
		System.out.println("after run value:" + result);
	}

//	@AfterThrowing(pointcut = "execution(* com.bit.spring02.service.MyModule.*(..))", throwing = "exp")
	public void afterThrowingTargetMethod(JoinPoint point, Exception exp) throws Exception {
		System.out.println(exp.toString());
	}
}
