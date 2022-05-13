package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._my_code;

public class ConcreteObserver implements Observer{

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.observerID = ++observerIDTracker;
        System.out.println("\nNew Observer " + this.observerID);
        subject.add(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printThePrices();
    }

    public void printThePrices() {
        System.out.println("\n" + observerID + "\nIBM : " + ibmPrice
        + "\nAPPL : " + aaplPrice + "\nGOOD : " + googPrice);
    }

}
