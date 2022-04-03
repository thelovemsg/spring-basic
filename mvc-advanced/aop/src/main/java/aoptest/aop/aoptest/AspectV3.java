package aoptest.aop.aoptest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class AspectV3 {

    //aoptest.aop.aoptest와 하위 패키지 전부를 가리킴
    @Pointcut("execution(* aoptest.aop.aoptest..*(..))")
    private void executeAll(){} // Pointcut signature

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){}

    @Around("executeAll()")
    public Object loggingTest(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info("[log] {}", joinPoint.getSignature()); // joint point 시그니처
        return joinPoint.proceed();
    }

    //aoptest.aop.aoptest패키지와 하위 패키지면서 클래스 이름 패턴이 *Service인 경우
    @Around("executeAll() && allService()")
    public Object doTransaction(ProceedingJoinPoint joinPoint) throws Throwable {

        try {
            log.info("[transaction start] {}", joinPoint.getSignature());
            Object result = joinPoint.proceed();
            log.info("[transaction commit] {}", joinPoint.getSignature());
            return result;
        } catch (Exception e){
            log.info("[transaction rollback] {}", joinPoint.getSignature());
            throw e;
        } finally {
            log.info("[resource release] {}", joinPoint.getSignature());
        }
    }

}
