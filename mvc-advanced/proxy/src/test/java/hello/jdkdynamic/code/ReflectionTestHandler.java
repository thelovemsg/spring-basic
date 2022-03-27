package hello.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@Slf4j
public class ReflectionTestHandler implements InvocationHandler {

    private final Object target;

    public ReflectionTestHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("ReflectionTestHandler's invoke method start");

        Object result = method.invoke(target, args);

        log.info("ReflectionTestHandler's invoke method end");
        return result;
    }
}


