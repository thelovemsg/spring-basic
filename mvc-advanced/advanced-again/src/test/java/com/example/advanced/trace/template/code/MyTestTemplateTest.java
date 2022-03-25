package com.example.advanced.trace.template.code;

import com.example.advanced.trace.template.MyTestTemplate;
import org.junit.jupiter.api.Test;

public class MyTestTemplateTest {

    @Test
    public void testMyTemplate(){
        MyTestTemplate test = new MyTestTemplate() {
            @Override
            protected String call() {
                return "hello1";
            }
        };
        test.execute("testing 1111 중입니다.");

        MyTestTemplate test1 = new MyTestTemplate() {
            @Override
            protected String call() {
                return "hello2";
            }
        };
        test1.execute("testing 2222 중입니다.");
    }
}
