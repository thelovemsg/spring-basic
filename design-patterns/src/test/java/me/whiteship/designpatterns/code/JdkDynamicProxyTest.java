package me.whiteship.designpatterns.code;

import jdkdynamic.code.FirstInterface;
import jdkdynamic.code.FirstInterfaceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

@Slf4j
public class JdkDynamicProxyTest {

    @Test
    void dynamicA() {
        FirstInterface first = new FirstInterfaceImpl();

        TimeInvocationHandler handler = new TimeInvocationHandler(first);

        //어느 클래스 로더에서 할지, 어떤 interface를 기반으로 proxy를 만들 것인지, proxy가 사용할 로직을 넣어줌
        FirstInterface proxy = (FirstInterface) Proxy.newProxyInstance(FirstInterface.class.getClassLoader(), new Class[]{FirstInterface.class}, handler);

        proxy.invoke();
        log.info("firstClass={}", first.getClass());
        log.info("proxyClass={}", proxy.getClass());
    }


}
