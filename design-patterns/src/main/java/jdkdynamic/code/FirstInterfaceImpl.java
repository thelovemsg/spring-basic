package jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FirstInterfaceImpl implements FirstInterface{

    @Override
    public String invoke() {
        log.info("First Interface invoke");
        return "first";
    }

}
