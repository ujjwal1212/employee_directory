package com.learn.employeedirectory.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.learn.employeedirectory.*.*.*(..))")
	public void beforeMethod() {
		System.out.println("Executing @Before advice");
	}
}
