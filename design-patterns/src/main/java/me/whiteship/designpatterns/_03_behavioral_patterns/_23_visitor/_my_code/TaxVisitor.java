package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._my_code;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{

    DecimalFormat df = new DecimalFormat("#.##");

    public TaxVisitor(){

    }

    @Override
    public double visit(Liquor liquorItem) {
        System.out.println("Liquor item : Price with Tax");
        return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("tobacco Item : Price with Tax");
        return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
    }

    @Override
    public double visit(Necessity necessityItem) {
        System.out.println("Necessity Item : Price with Tax");
        return Double.parseDouble(df.format((necessityItem.getPrice() * 0) + necessityItem.getPrice()));
    }
}
