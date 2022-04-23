package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_before;

public class FanSwitch {

    private Fan fan;

    public FanSwitch(Fan fan) {
        this.fan = fan;
    }

    public void press() {
        fan.off();
    }
}
