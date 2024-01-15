package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging requests to controller methods.
 *
 * @author FoneZzz
 */
@Aspect
@Component
public class RequestAspect {
    @Before("execution(* com.example.demo.controller.*.*(..))")
    public void logBeforeControllerMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println("Calling method: " + methodName);
        if (args.length > 0) {
            System.out.println("Method arguments: " + argsToString(args));
        }
    }

    private String argsToString(Object[] args) {
        StringBuilder result = new StringBuilder("[");
        for (Object arg : args) {
            result.append(arg).append(", ");
        }
        if (args.length > 0) {
            result.setLength(result.length() - 2);
        }
        result.append("]");
        return result.toString();
    }
}
