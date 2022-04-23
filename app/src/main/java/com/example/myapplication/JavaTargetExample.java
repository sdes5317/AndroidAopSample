package com.example.myapplication;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class JavaTargetExample {
    @InjectSpan
    public void demonstrateJavaAOP() {
        Object aa = new Object(){};
    }
}
