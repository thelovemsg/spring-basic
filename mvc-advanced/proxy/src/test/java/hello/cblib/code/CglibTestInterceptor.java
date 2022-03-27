package hello.cblib.code;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class CglibTestInterceptor implements MethodInterceptor {

    private final Object target;

    public CglibTestInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        log.info("CglibTestInterceptor 실행");

        Object result = methodProxy.invoke(target, args); // call

        log.info("CglibTestInterceptor 종료 ");
        return result;
    }

}
