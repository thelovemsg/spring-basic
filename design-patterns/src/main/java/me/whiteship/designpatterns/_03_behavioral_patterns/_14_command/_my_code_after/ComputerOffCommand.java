package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

public class ComputerOffCommand implements Command{

    private Computer computer;

    public ComputerOffCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }

    @Override
    public void undo() {
        new ComputerOnCommand(this.computer).execute();
    }
}
