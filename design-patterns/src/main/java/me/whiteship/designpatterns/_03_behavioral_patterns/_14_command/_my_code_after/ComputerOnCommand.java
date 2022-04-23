package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

public class ComputerOnCommand implements Command{

    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }

    @Override
    public void undo() {
        new ComputerOffCommand(this.computer).execute();
    }

}
