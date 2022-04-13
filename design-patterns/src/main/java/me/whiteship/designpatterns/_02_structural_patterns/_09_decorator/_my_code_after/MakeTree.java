package me.whiteship.designpatterns._02_structural_patterns._09_decorator._my_code_after;

public class MakeTree {

    public static void main(String[] args) {
        Tree tree = new RealTree();
        Tree starAddedTree = new Star(tree);
        Tree socksAddedTree = new Socks(starAddedTree);
        TreeDecoratorClient client = new TreeDecoratorClient(socksAddedTree);
        client.decorate();
    }

}
