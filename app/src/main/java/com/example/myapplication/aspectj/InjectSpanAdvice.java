package com.example.myapplication.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class InjectSpanAdvice {
    private static final String POINTCUT_METHOD =
            "@annotation(com.example.myapplication.OneFolder.InjectSpan)";

//    @Pointcut(POINTCUT_METHOD)
//    public void methodAnnotatedWithDebugTrace() {}

//    @Around(value = "methodAnnotatedWithDebugTrace()")
//    public Object injectSpan(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        //
//
//        return proceedingJoinPoint.proceed(); // Invoking InjectSpan annotation added method
//
//    }

    @Around("@annotation(InjectSpan) && execution(* *(..))")
    public Object injectSpan(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed(); // Invoking InjectSpan annotation added method
    }

}
