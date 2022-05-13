package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._my_code;

public interface Visitor {

    public double visit(Liquor liquorItem);
    public double visit(Tobacco tobaccoItem);
    public double visit(Necessity necessityItem);

}
