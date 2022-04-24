package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_before;

public abstract class Colleague {

    private Mediator mediator;

    public boolean join(Mediator mediator){
        if(mediator == null)
            return false;
        this.mediator = mediator;
         return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if(data != null)
            mediator.mediate(data);
    }

    abstract public void handle(String data);
}
