package jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SecondInterfaceImpl implements SecondInterface{

    @Override
    public String invoke() {
        log.info("Second Interface invoke");
        return "Second";
    }

}
