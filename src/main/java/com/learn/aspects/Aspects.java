package com.learn.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspects {
    @Before("@annotation(com.learn.annotations.Loggable)")
    public void logMethodCall(JoinPoint joinPoint) {
        System.out.println("Logging: " + joinPoint.getSignature().getName() + " with @Loggable is called.");
    }

    @AfterReturning("@annotation(com.learn.annotations.Loggable)")
    public void logMethodReturn(JoinPoint joinPoint) {
        System.out.println("Logging: " + joinPoint.getSignature().getName() + " with @Loggable has finished execution.");
    }
}
