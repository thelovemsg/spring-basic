package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_after;

import java.time.LocalDateTime;

public class Customer {

    private Integer number;

    private HumanResource humanResource = new HumanResource();

    public void getConnectionWithBoss(int callNumber) {
        this.humanResource.getCallNumber(this, callNumber);
    }

    private void haveMeeting(LocalDateTime meetingTime){
        this.humanResource.getMeeting(this, meetingTime);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
