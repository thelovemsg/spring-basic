package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._my_code;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ConcreteSubject implements Subject{

    private List<Observer> observerList;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer newObserver) {
        observerList.add(newObserver);
    }

    @Override
    public void remove(Observer deleteObserver) {
        int observerIdx = observerList.indexOf(deleteObserver);
        System.out.println("Observer index : " + (observerIdx+1) + " is deleted");
        observerList.remove(observerIdx);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double newAaplPrice) {
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice) {
        this.googPrice = newGoogPrice;
        notifyObserver();
    }


}
