package hello.jdkdynamic;

import hello.jdkdynamic.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicA(){
        AInterface target = new AImpl();
        ReflectionTestHandler handler = new ReflectionTestHandler(target);
//        TimeInvocationHandler handler = new TimeInvocationHandler(target);


        AInterface proxy = (AInterface) Proxy.newProxyInstance(AInterface.class.getClassLoader(), new Class[]{AInterface.class}, handler);

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());

        CInterface target1 = new CImpl();

        ReflectionTestHandler handler1 = new ReflectionTestHandler(target1);

        CInterface proxy1 = (CInterface) Proxy.newProxyInstance(CInterface.class.getClassLoader(), new Class[]{CInterface.class}, handler1);

        proxy1.test1();
        proxy1.test2();
        proxy1.test3();

    }

    @Test
    void dynamicB(){
        BInterface target = new BImpl();
        TimeInvocationHandler handler = new TimeInvocationHandler(target);

        BInterface proxy = (BInterface) Proxy.newProxyInstance(BInterface.class.getClassLoader(), new Class[]{BInterface.class}, handler);

        proxy.call();
        log.info("targetClass={}", target.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }

    @Test
    void dynamicC(){

    }

}
