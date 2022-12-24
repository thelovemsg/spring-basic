package hello.object_study.part1;

public class TicketSeller {
  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience){
    ticketOffice.sellTicketTo(audience);
  }
}
