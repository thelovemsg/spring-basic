package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._my_code;

public class VisitorTest {

    public static void main(String[] args) {

        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity milk = new Necessity(3.47);
        Liquor vodka = new Liquor(11.99);
        Tobacco cigars = new Tobacco(19.99);

        System.out.println(milk.accept(taxVisitor) + "\n");
        System.out.println(vodka.accept(taxVisitor) + "\n");
        System.out.println(cigars.accept(taxVisitor) + "\n");

        System.out.println("TAX HOLIDAY PRICES");
        System.out.println(milk.accept(taxHolidayVisitor) + "\n");
        System.out.println(vodka.accept(taxHolidayVisitor) + "\n");
        System.out.println(cigars.accept(taxHolidayVisitor) + "\n");

    }
}
