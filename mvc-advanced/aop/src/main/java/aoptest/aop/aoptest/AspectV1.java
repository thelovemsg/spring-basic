package aoptest.aop.aoptest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* aoptest.aop.aoptest..*(..))")
    public Object loggingTest(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info("[log] {}", joinPoint.getSignature()); // joint point 시그니처
        return joinPoint.proceed();
    }

}
