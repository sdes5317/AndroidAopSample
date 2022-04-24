package com.example.myapplication.OneFolder;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class InjectSample {
    @Around("@annotation(InjectSpan) && execution(* *(..))")
    public Object injectSpan(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Log.e("test","test success");
        return proceedingJoinPoint.proceed(); // Invoking InjectSpan annotation added method
    }
}
