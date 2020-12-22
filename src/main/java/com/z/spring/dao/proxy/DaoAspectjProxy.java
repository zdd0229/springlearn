package com.z.spring.dao.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DaoAspectjProxy {

    @Before("pointCut()")
    public void Before(){
        System.out.println("Before...");
    }
    @AfterReturning("pointCut()")
    public void AfterReturning(){
        System.out.println("AfterReturning...");
    }
    @After("pointCut()")
    public void After(){
        System.out.println("After...");
    }
    @AfterThrowing("pointCut()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing...");
    }
    @Around("pointCut()")
    public void Around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Before Around...");
        point.proceed();
        System.out.println("After Around...");
    }

    /**
     * 公共切入点抽取
     */
    @Pointcut("execution(* com.z.spring.dao.TestSpringDao.*(..))")
    public void pointCut(){

    }

}
