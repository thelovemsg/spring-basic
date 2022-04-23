package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

public class FanOnCommand implements Command{

    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo() {
        new FanOffCommand(this.fan).execute();
    }
}
