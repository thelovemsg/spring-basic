package aoptest.aop;

import aoptest.aop.aoptest.*;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootTest
@Import({AspectV5.LogAspect.class, AspectV5.TxAspect.class})
public class AopTest {

    @Autowired
    private AopService aopService;

    @Autowired
    private AopRepository aopRepository;

    @Test
    void aopInfo() {
        log.info("isAopProxy, aopService={}", AopUtils.isAopProxy(aopService));
        log.info("isAopProxy, aopRepository={}", AopUtils.isAopProxy(aopRepository));
    }

    @Test
    void success() {
        aopService.AopServiceTest("test1");
    }

    @Test
    void  exception() {
        Assertions.assertThatThrownBy(() -> aopService.AopServiceTest("exception"))
                .isInstanceOf(IllegalStateException.class);
    }

}
