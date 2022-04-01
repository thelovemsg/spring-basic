package hello.pureproxy.proxy.pureproxy.proxy.config.v6_aop;

import hello.pureproxy.proxy.pureproxy.proxy.config.AppV1Config;
import hello.pureproxy.proxy.pureproxy.proxy.config.AppV2Config;
import hello.pureproxy.proxy.pureproxy.proxy.config.v6_aop.aspect.LogTraceAspect;
import hello.pureproxy.proxy.pureproxy.proxy.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AppV1Config.class, AppV2Config.class})
public class AopConfig {

    @Bean
    public LogTraceAspect logTraceAspect(LogTrace logTrace) {
        return new LogTraceAspect(logTrace);
    }

}
