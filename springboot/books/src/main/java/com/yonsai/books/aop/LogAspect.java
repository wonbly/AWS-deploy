package com.yonsai.books.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    // 1. Before: 메서드 실행 전 무조건 출력
    @Before("execution(* com.yonsai.books.controller..*(..))")
    public void beforeLog() {
        System.out.println("메서드실행전");
    }

    // 2. Around: 메서드의 앞뒤를 감싸서 매개변수와 반환값 출력
    @Around("execution(* com.yonsai.books.controller..*(..))")
    public Object aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis(); // 실행 전 시간 기록

        String methodName = joinPoint.getSignature().getName();
        System.out.println("=========================================");
        System.out.println(">>> [실행 메서드]: " + methodName);
        System.out.println(">>> [매개변수]: " + Arrays.toString(joinPoint.getArgs()));

        Object result = joinPoint.proceed(); // 실제 메서드 실행

        long end = System.currentTimeMillis(); // 실행 후 시간 기록

        System.out.println("<<< [반환값]: " + result);
        System.out.println("<<< [실행 시간]: " + (end - start) + "ms"); // 소요 시간 계산
        System.out.println("=========================================");

        return result;
    }
}