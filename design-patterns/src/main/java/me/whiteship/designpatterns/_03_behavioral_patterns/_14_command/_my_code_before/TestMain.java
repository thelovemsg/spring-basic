package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_before;

public class TestMain {

    public static void main(String[] args) {

        Fan fan = new Fan();
        FanSwitch fanSwitch = new FanSwitch(fan);
        fanSwitch.press();
        fanSwitch.press();
        fanSwitch.press();

        Computer computer = new Computer();
        ComputerSwitch computerSwitch = new ComputerSwitch(computer);
        computerSwitch.press();
        computerSwitch.press();
        computerSwitch.press();

    }

}
