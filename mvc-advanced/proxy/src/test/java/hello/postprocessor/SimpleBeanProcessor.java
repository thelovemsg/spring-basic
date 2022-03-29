package hello.postprocessor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
class SimpleBeanProcessorImpl {

    @Bean
    public void initBean(){
        log.info("Init bean for : SimpleBeanProcessorImpl");
    }

    @Bean
    public void destroy(){
        log.info("destroy bean for : SimpleBeanProcessorImpl");
    }
}
