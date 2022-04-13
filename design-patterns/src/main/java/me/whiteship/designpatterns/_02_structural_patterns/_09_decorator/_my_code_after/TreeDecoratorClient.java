package me.whiteship.designpatterns._02_structural_patterns._09_decorator._my_code_after;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TreeDecoratorClient {

    private Tree tree;

    public TreeDecoratorClient(Tree tree) {
        this.tree = tree;
    }

    public String decorate(){
        log.info("TreeDecoratorMachine");
        return tree.marryChristmas();
    }

}
