package hello.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TimeDecorator implements DecoComponent {

    private DecoComponent decoComponent;

    public TimeDecorator(DecoComponent decoComponent) {
        this.decoComponent = decoComponent;
    }

    @Override
    public String operation() {
        log.info("TimeDecorator 실행");
        long startTime = System.currentTimeMillis();
        String result = decoComponent.operation();
        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("TimeDecorator 종료 resultTime={}ms", resultTime);
        return result;
    }

}
