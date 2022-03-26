package hello.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements DecoComponent {

     private DecoComponent decoComponent;

    public MessageDecorator(DecoComponent decoComponent) {
        this.decoComponent = decoComponent;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");

        String result = decoComponent.operation();
        String decoratedResult = "******" + result + "******";

        log.info("Message Decorator 꾸미기 적용전 = {} , 적용 후 = {}", result, decoratedResult);
        return decoratedResult;
    }
}
