package hello.object_study.part1;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {
  private Long amount;
  private List<Ticket> tickets = new ArrayList<>();

  public TicketOffice(Long amount, List<Ticket> tickets) {
    this.amount = amount;
    this.tickets = tickets;
  }

  public void sellTicketTo(Audience audience) {
    plusAmount(audience.buy(getTicket()));
  }

  private Ticket getTicket() {
    return tickets.remove(0);
  }

  private void plusAmount(Long amount){
    this.amount += amount;
  }

}
