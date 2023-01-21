package tobyspring.vol2.part01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Hello hello() {
        return new Hello();
    }

    @Bean
    public Printer printer(){
        return null;
    }
}
