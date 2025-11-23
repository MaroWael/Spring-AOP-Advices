package com.learn.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PaymentAspect {
    @Before("execution(* com.learn.services.*.*(..))")
    public void beforePayment(JoinPoint joinPoint) throws Throwable {
        String user = (String) joinPoint.getArgs()[0];

        System.out.println("🟡 [BEFORE] Checking user permissions for: " + user);
    }

    @Around("execution(* com.learn.services.*.*(..))")
    public Object aroundPayment(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("🟠 [AROUND] Starting transaction...");
        Object result = joinPoint.proceed();
        System.out.println("🟠 [AROUND] Committing transaction...");
        return result;
    }

    @After("execution(* com.learn.services.*.*(..))")
    public void afterPayment(JoinPoint joinPoint) throws Throwable {
        System.out.println("🔵 [AFTER] Logging payment operation for method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution(* com.learn.services.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) throws Throwable {
        System.out.println("🟣 [AFTER RETURNING] Payment processed successfully with result: " + result);
    }

    @AfterThrowing(pointcut = "execution(* com.learn.services.*.*(..))", throwing = "error")
    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("🔴 [AFTER THROWING] An error occurred: " + error.getMessage());
    }
}
