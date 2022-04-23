package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class RealSubject implements Subject{
    @Override
    public String doSubject() {
        log.info("do subject from Subject in RealSubject");
        sleep(1000);
        return "do subject";
    }
    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
