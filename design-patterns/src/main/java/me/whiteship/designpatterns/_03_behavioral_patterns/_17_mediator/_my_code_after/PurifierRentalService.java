package me.whiteship.designpatterns._03_behavioral_patterns._17_mediator._my_code_after;

public class PurifierRentalService {

    private HumanResource humanResource = new HumanResource();

    public void getCallNumber(Integer number, int callNumber) {
        String roomNumber = this.humanResource.getCallNumber(number);
        System.out.println("provide " + callNumber +" to customer number " + number );
    }

}
