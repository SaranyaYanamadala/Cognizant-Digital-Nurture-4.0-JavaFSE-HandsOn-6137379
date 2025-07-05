package com.library.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    // Advice that runs before any method in com.library.service
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[LOG] Before Method: " + joinPoint.getSignature().getName());
    }

    // Advice that runs after successful completion of methods
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[LOG] After Method: " + joinPoint.getSignature().getName());
    }
}