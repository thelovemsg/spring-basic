package me.whiteship.designpatterns._03_behavioral_patterns._20_state._practice;

public interface ATMState {

    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);

}
