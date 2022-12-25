package tobyspring.vol2.part01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotatedHelloConfig {
    @Bean
    public AnnotatedHello annotatedHello() {
        return new AnnotatedHello();
    }
}
