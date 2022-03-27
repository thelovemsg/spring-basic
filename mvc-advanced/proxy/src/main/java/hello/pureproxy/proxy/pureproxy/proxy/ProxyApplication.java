package hello.pureproxy.proxy.pureproxy.proxy;

import hello.pureproxy.proxy.pureproxy.proxy.config.v1_proxy.ConcreteProxyConfig;
import hello.pureproxy.proxy.pureproxy.proxy.config.v1_proxy.InterfaceProxyConfig;
import hello.pureproxy.proxy.pureproxy.proxy.config.v2_dynamicproxy.handler.DynamicProxyBasicConfig;
import hello.pureproxy.proxy.pureproxy.proxy.trace.logtrace.LogTrace;
import hello.pureproxy.proxy.pureproxy.proxy.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import({AppV1Config.class, AppV2Config.class})서울특별시 금천구 독산동 296-9
//@Import(InterfaceProxyConfig.class)
//@Import(ConcreteProxyConfig.class)
//@Import(AppV2Config.class)
@Import(DynamicProxyBasicConfig.class)
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}

	@Bean
	public LogTrace logTrace(){
		return new ThreadLocalLogTrace();
	}

}
