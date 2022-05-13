package me.whiteship.object.first;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket(){
        return tickets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }

}
