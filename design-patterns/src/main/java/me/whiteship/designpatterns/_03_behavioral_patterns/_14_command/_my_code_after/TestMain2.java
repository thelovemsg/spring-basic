package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

public class TestMain2 {

    private Command command;

    public TestMain2(Command command) {
        this.command = command;
    }

    public void switching() {
        command.execute();
    }

    public static void main(String[] args) {

        TestMain2 testMain2 = new TestMain2(new FanOnCommand(new Fan()));

    }

}
