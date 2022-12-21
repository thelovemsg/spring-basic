package hello.part14.composition.policy.impimentation;

import hello.part14.composition.policy._interface.AdditionalRatePolicy;
import hello.part14.composition.policy._interface.RatePolicy;
import hello.part5.Money;

public class RateDiscountablePolicy extends AdditionalRatePolicy {
    private Money discountAmount;

    public RateDiscountablePolicy(Money discountAmount, RatePolicy next) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
