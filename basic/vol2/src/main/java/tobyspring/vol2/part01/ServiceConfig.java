package tobyspring.vol2.part01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ServiceConfig {
    @Bean
    public DataSource dataSource() {
        //vol2 - 100page 참고
        return null;
    }
}
