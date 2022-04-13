package me.whiteship.designpatterns._02_structural_patterns._09_decorator._my_code_after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Socks implements Tree {

    private Tree decoComponent;

    public Socks(Tree decoComponent) {
        this.decoComponent = decoComponent;
    }

    @Override
    public String marryChristmas() {
        String result = decoComponent.marryChristmas();
        String addedTree = "socks -- " + result + " -- socks";
        log.info("socks 꾸미기 전... {}", result);
        log.info("socks 꾸민 후... {}", addedTree);
        return addedTree;
    }
}
