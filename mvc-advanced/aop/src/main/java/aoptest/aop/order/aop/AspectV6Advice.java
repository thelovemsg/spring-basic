package aoptest.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Slf4j
@Aspect
public class AspectV6Advice {

    /*//aoptest.order.aop 패키지와 하위 패키지이면서 클래스 이름 패턴이 *Service
    @Around("aoptest.aop.order.aop.PointCuts.orderAndService()")
    public Object doTransaction(ProceedingJoinPoint joinPoint) throws Throwable{

        try {
            //@Before
            log.info("[트랜잭션 시작]", joinPoint.getSignature());
            Object result = joinPoint.proceed();
            //@AfterReturning
            log.info("[트랜잭션 커밋]", joinPoint.getSignature());
            return result;
        } catch (Exception e){
            //@AfterThrowing
            log.info("[트랜잭션 롤백] {}", joinPoint.getSignature());
            throw e;
        } finally {
            //@After
            log.info("[리소스 릴리즈 롤백] {}", joinPoint.getSignature());
        }

    }*/

    @Before("aoptest.aop.order.aop.PointCuts.orderAndService()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("[before] {}", joinPoint.getSignature());
    }

    @AfterReturning(value = "aoptest.aop.order.aop.PointCuts.orderAndService()", returning = "result")
    public void deReturn(JoinPoint joinPoint, Object result) {
        log.info("[return] {} return ={}", joinPoint.getSignature(), result);
    }

    @AfterReturning(value = "aoptest.aop.order.aop.PointCuts.allOrder()", returning = "result")
    public void deReturn2(JoinPoint joinPoint, Object result) {
        log.info("[return2] {} return ={}", joinPoint.getSignature(), result);
    }

    @AfterThrowing(value = "aoptest.aop.order.aop.PointCuts.orderAndService()", throwing = "ex")
    public void doThrowing(JoinPoint joinPoint, Exception ex) {
        log.info("[ex] {} message={}", ex);
    }

    @After(value = "aoptest.aop.order.aop.PointCuts.orderAndService()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("[after] {}", joinPoint.getSignature());
    }

}
