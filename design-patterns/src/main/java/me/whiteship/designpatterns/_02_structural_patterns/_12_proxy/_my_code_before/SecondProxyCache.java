package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecondProxyCache implements Subject{

    private Subject target;
    private String info;

    public SecondProxyCache(Subject target) {
        this.target = target;
    }

    @Override
    public String doSubject() {
        log.info("Second proxy called");
        if(info == null) {
            info = target.doSubject();
        }
        return info;
    }
}
