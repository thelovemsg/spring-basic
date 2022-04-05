package me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._my_code;

public class Car {

    private String name;
    private String color;
    private Integer price;

    private Frame frame;

    private Airbag airbag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Airbag getAirbag() {
        return airbag;
    }

    public void setAirbag(Airbag airbag) {
        this.airbag = airbag;
    }
}
