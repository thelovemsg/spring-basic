package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_after;

import java.time.LocalDateTime;

public class HumanResource {

    private PurifierRentalService purifierRentalService = new PurifierRentalService();

    private MeetingRoom meetingRoom = new MeetingRoom();

    public void getCallNumber(Customer customer, int callNumber) {
        purifierRentalService.getCallNumber(customer.getNumber(), callNumber);
    }

    public String getCallNumber(Integer number) {
        return "010-1111-2222";
    }

    public void getMeeting(Customer customer, LocalDateTime meetingTime) {
        meetingRoom.haveMeeting(customer.getNumber(), meetingTime);
    }
}
