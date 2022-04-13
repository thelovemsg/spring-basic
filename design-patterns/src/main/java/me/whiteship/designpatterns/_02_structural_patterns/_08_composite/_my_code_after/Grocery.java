package me.whiteship.designpatterns._02_structural_patterns._08_composite._my_code_after;

public class Grocery implements Component{

    private String name;

    private int price;

    private String type;

    public Grocery(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
