package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

public class FanOffCommand implements Command{

    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo() {
        new FanOnCommand(this.fan).execute();
    }
}
