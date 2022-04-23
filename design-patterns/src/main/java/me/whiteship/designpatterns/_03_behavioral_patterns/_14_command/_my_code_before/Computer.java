package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_before;

public class Computer {

    private boolean isOn;

    public void on() {
        System.out.println("컴퓨터를 켭니다.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("컴퓨터를 끕니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
