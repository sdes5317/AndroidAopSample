package com.example.myapplication;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class InjectSpanAdvice {
    private static final String POINTCUT_METHOD =
            "@annotation(com.example.myapplication.InjectSpan)";

//    @Pointcut(POINTCUT_METHOD)
//    public void methodAnnotatedWithDebugTrace() {}

//    @Around(value = "methodAnnotatedWithDebugTrace()")
//    public Object injectSpan(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        //
//
//        return proceedingJoinPoint.proceed(); // Invoking InjectSpan annotation added method
//
//    }

    @Around("@annotation(com.example.myapplication.InjectSpan) && execution(* *(..))")
    public Object injectSpan(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed(); // Invoking InjectSpan annotation added method
    }

}
