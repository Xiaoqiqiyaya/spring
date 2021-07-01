package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.env.SystemEnvironmentPropertySource;

@Aspect //biaozhuqiemian
public class AnnotationPointcut {
    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("-----------------------qian--------------------------");
    }
    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("-----------------------hou----------------------------");
    }
    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public  void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature =  jp.getSignature();
        System.out.println("signature" + signature);
        Object proceed =  jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }

}
