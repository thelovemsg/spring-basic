package aoptest.aop.aoptest;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    //aoptest.aop.aoptest와 하위 패키지 전부를 가리킴
    @Pointcut("execution(* aoptest.aop.aoptest..*(..))")
    public void executeAll(){} // Pointcut signature

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){}

    //allOrder && allService
    @Pointcut("executeAll() && allService()")
    public void orderAndService(){}

}
