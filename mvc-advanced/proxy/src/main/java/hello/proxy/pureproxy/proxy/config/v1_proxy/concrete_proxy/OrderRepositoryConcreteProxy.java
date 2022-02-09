package hello.proxy.pureproxy.proxy.config.v1_proxy.concrete_proxy;

import hello.proxy.pureproxy.proxy.app.v2.OrderRepositoryV2;
import hello.proxy.pureproxy.proxy.trace.TraceStatus;
import hello.proxy.pureproxy.proxy.trace.logtrace.LogTrace;

public class OrderRepositoryConcreteProxy extends OrderRepositoryV2 {

    private final OrderRepositoryV2 target;
    private final LogTrace logTrace;

    public OrderRepositoryConcreteProxy(OrderRepositoryV2 target, LogTrace logTrace) {
        this.target = target;
        this.logTrace = logTrace;
    }

    @Override
    public void save(String itemId) {
        TraceStatus status = null;
        try {
            status = logTrace.begin("OrderRepository.request()");
            //target 호출
            target.save(itemId);
            logTrace.end(status);
        } catch (Exception e){
            logTrace.exception(status, e);
            throw e;
        }

    }
}
