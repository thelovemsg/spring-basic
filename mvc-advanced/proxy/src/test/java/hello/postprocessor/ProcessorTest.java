package hello.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ProcessorTest {

    @Test
    void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext();

        //A는 빈으로 등록된다.
        BeanA beanA = context.getBean("beanA", BeanA.class);
    }

    @Slf4j
    @Configuration
    static class BasicConfig {
        @Bean(name = "beanA")
        public BeanA a(){
            return new BeanA();
        }

    }

    @Slf4j
    static class BeanA {
        public void beanAMethod(){
            log.info("bean A Method");
        }
    }

    @Slf4j
    static class BeanB {
        public void beanBMethod(){
            log.info("bean B Method");
        }
    }


}
