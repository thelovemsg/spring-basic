package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_before;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Mediator mediator = new ChatMediator();

        Colleague colleague1 = new ChatColleague1();
        Colleague colleague2 = new ChatColleague1();
        Colleague colleague3 = new ChatColleague1();

        Colleague colleague4 = new ChatColleague2();
        Colleague colleague5 = new ChatColleague2();
        Colleague colleague6 = new ChatColleague2();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague4.join(mediator);
        colleague5.join(mediator);
        colleague6.join(mediator);

        colleague1.sendData("AAA");
        colleague1.sendData("BBB");
        colleague1.sendData("CCC");
        colleague4.sendData("1AAA");
        colleague5.sendData("1BBB");
        colleague6.sendData("1CCC");
    }

}
