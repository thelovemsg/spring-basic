package me.whiteship.designpatterns._03_behavioral_patterns._14_command._my_code_after;

import java.util.Stack;

public class Switch {

    private Stack<Command> commands = new Stack<>();

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            Command command = commands.pop();
            command.undo();
        }
    }

}
