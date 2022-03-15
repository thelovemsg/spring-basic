package filterinterceptorstudy.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test-logFilter")
    public String testLogFilter(String test){
        return "ok!";
    }
}
