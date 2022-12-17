package hello.part11.extend;

import hello.part5.Money;

import java.time.Duration;

public class RateDiscountableRegularPhone extends RegularPhone{
    private Money discountAmount;

    public RateDiscountableRegularPhone(Money amount, Duration seconds, Money discountAmount) {
        super(amount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
