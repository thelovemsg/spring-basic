package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_before;

public class ChatColleague2 extends Colleague {
    @Override
    public void handle(String data) {
        System.out.printf("data : %s in ChatColleague2\n", data);
    }
}
