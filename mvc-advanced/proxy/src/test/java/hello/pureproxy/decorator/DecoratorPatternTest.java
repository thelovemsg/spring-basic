package hello.pureproxy.decorator;

import hello.pureproxy.decorator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecorator(){
        RealComponent realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator1(){
        DecoComponent decoComponent = new RealComponent();
        DecoComponent messageDecorator = new MessageDecorator(decoComponent);
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
        client.execute();
    }

    @Test
    void decorator2(){
        DecoComponent decoComponent = new RealComponent();
        DecoComponent messageDecorator = new MessageDecorator(decoComponent);
        DecoComponent timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.execute();
    }

}
