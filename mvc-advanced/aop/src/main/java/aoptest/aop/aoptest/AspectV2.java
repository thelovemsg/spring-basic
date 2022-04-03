package aoptest.aop.aoptest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class AspectV2 {

    //aoptest.aop.aoptest와 하위 패키지 전부를 가리킴
    @Pointcut("execution(* aoptest.aop.aoptest..*(..))")
    private void executeAll(){} // Pointcut signature

    @Around("executeAll()")
    public Object loggingTest(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info("[log] {}", joinPoint.getSignature()); // joint point 시그니처
        return joinPoint.proceed();
    }

}
