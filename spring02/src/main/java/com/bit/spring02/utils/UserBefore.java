package com.bit.spring02.utils;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Aspect
@Component
public class UserBefore {

	@Before(value = "execution(* com.bit.spring02.service.MyModule.*(..))")
	public void beforeTargetMethod(JoinPoint point) {
		Class cls = point.getSignature().getDeclaringType();
		String name = point.getSignature().getName();
		Object[] args = point.getArgs();
		System.out.println("method before run...");
		System.out.println("class --> " + cls);
		System.out.println("name --> " + name);
		System.out.println(Arrays.toString(args));
	}
}
