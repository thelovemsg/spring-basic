package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

public class TestMain {

    public static void main(String[] args) {
        //switching 기능을 수행하는 리모콘에 어떤 작업을 할지 command를 넘겨줌.
        Switch aSwitch = new Switch();
        aSwitch.press(new ComputerOnCommand(new Computer()));
        aSwitch.press(new FanOnCommand(new Fan()));
        aSwitch.undo();
        aSwitch.undo();
    }

}
