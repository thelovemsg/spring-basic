package realBasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import realBasic.core.member.MemberRepository;
import realBasic.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
        basePackages = "realBasic.core.member",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
