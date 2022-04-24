package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_before;

public class ChatMediator implements Mediator {

    @Override
    public void mediate(String data) {

        for (Colleague colleague : colleagues) {
            //중재 가능 정보 보유
            colleague.handle(data);
        }

    }

}
