package me.whiteship.designpatterns._02_structural_patterns._08_composite._my_code_before;

public class Grocery {

    private String name;

    private int price;

    private String type;

    public Grocery(String name, int price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return this.price;
    }

}
