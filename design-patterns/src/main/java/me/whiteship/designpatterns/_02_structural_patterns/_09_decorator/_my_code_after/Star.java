package me.whiteship.designpatterns._02_structural_patterns._09_decorator._my_code_after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Star implements Tree {

    private Tree decoComponent;

    public Star(Tree decoComponent) {
        this.decoComponent = decoComponent;
    }

    @Override
    public String marryChristmas() {
        String result = decoComponent.marryChristmas();
        String addedTree = "star -- " + result + " -- star";
        log.info("star 꾸미기 전... {}", result);
        log.info("star 꾸민 후... {}", addedTree);
        return addedTree;
    }
}
