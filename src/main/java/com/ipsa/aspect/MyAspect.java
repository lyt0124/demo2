package com.ipsa.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyAspect {
    @Around("execution(* com.ipsa.service.impl.*ServiceImpl.*(..))")
    public Object around(ProceedingJoinPoint point){
        try{
            log.info("环绕前");
            Object proceed = point.proceed();
            log.info("环绕后");
            return proceed;
        }catch (Throwable t){
            log.info("环绕异常");
            t.printStackTrace();
        }
        return null;
    }
}
