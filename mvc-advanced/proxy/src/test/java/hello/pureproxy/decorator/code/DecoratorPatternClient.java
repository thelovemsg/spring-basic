package hello.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorPatternClient {

    private DecoComponent decoComponent;

    public DecoratorPatternClient(DecoComponent decoComponent) {
        this.decoComponent = decoComponent;
    }

    public void execute() {
        String result = decoComponent.operation();
        log.info("result={}", result);
    }
}
