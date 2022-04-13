package me.whiteship.designpatterns._02_structural_patterns._09_decorator._my_code_after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealTree implements Tree {
    @Override
    public String marryChristmas() {
        log.info("Let's make Real Tree!");
        return "tree";
    }
}
