package com.example.advanced.app.v1;

import com.example.advanced.trace.TraceStatus;
import com.example.advanced.trace.hellotrace.HelloTraceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerV1 {

    private final OrderServiceV1 orderService;
    private final HelloTraceV1 traceV1;

    @GetMapping("/v1/request")
    public String request(String itemId){
        TraceStatus status = null;
        try {
            status = traceV1.begin("OrderController.request()");
            orderService.orderItem(itemId);
            traceV1.end(status);
            return "ok";
        } catch (Exception e){
            traceV1.exception(status, e);
            throw e;
        }
    }

}
