package hello.part4;

import hello.part2.Money;

public class Reservation {
    private Customer customer;
    private Screening_Data screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening_Data screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Screening_Data getScreening() {
        return screening;
    }

    public void setScreening(Screening_Data screening) {
        this.screening = screening;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public int getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(int audienceCount) {
        this.audienceCount = audienceCount;
    }
}
