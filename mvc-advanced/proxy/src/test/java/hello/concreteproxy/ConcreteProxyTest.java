package hello.concreteproxy;

import hello.concreteproxy.code.ConcreteClient;
import hello.concreteproxy.code.ConcreteLogic;
import hello.concreteproxy.code.TimeProxy;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy(){
        ConcreteLogic logic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(logic);
        client.execute();
    }

    @Test
    void addProxy(){
        ConcreteLogic logic = new ConcreteLogic();
        TimeProxy timeProxy = new TimeProxy(logic);
        ConcreteClient client = new ConcreteClient(timeProxy);
        client.execute();
    }

}
