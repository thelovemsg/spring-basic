package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._my_code;

public class Necessity implements Visitable{

    private double price;

    public Necessity(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
