package aoptest.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
public class PointCuts {

    //aoptest.aop.order패키지와 하위 패키지
    @Pointcut("execution(* aoptest.aop.order..*(..))")
    public void allOrder(){} // pointcut signature

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){}

    //allOrder && allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}


}
