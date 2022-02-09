package hello.proxy.pureproxy.proxy.app.v3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderControllerV3 {

    private final OrderServiceV3 orderServiceV3;

    public OrderControllerV3(OrderServiceV3 orderServiceV3) {
        this.orderServiceV3 = orderServiceV3;
    }

    @GetMapping("/v3/request")
    public String request(@RequestParam("itemId") String itemId) {
        orderServiceV3.orderItem(itemId);
        return "ok";
    }

    @GetMapping("/v3/no-log")
    public String noLog() {
        return "ok";
    }

}
