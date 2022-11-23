package me.whiteship.designpatterns._02_structural_patterns._12_proxy._my_code_before;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThirdProxyCache implements Subject{

    private Subject target;
    private String info;

    public ThirdProxyCache(Subject target) {
        this.target = target;
    }

    @Override
    public String doSubject() {
        log.info("Third proxy called");
        if(info == null) {
            info = target.doSubject();
        }
        return info;
    }
}
