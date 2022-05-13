package me.whiteship.designpatterns._03_behavioral_patterns._20_state._practice;

public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We don't have money and you didn't enter a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We don't have money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have money");
    }

}
