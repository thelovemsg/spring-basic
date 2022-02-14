package realbasic.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "realbasic.core.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes=Configuration.class)
) // @Component 등록이 된 class를 찾아서 자동으로 등록함. 수동 등록한 아이는 일단 제외
public class AutoAppConfig {
    
}
