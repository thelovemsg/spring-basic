package me.whiteship.designpatterns._03_behavioral_patterns._19_observer._my_code;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
}
