package hello.springmvc.bacsic;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;

@RestController
public class LogTestController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    private String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        logger.trace("trace log={}", name);
        logger.info("info log={}", name);
        logger.debug("debug log={}", name);
        logger.warn("debug log={}", name);
        logger.error("error log={}", name);

        return "ok";
    }

}
