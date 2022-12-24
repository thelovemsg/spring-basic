package hello.object_study.part1;

public class Theater {
  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience){
    ticketSeller.sellTo(audience);
  }
}

