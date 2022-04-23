package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_before;

public class ComputerSwitch {

    private Computer computer;

    public ComputerSwitch(Computer computer) {
        this.computer = computer;
    }

    public void press() {
        computer.off();
    }
}
