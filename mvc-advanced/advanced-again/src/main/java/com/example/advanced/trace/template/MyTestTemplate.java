package com.example.advanced.trace.template;

public abstract class MyTestTemplate<T> {

    public T execute(String message){
        System.out.println("message = " + message);
        T result = call();
        System.out.println("result = " + result);
        return result;
    }

    protected abstract T call();

}
