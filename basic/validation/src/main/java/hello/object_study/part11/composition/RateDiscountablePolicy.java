package hello.object_study.part11.composition;

import hello.object_study.part5.Money;

public class RateDiscountablePolicy extends AdditionalRatePolicy{
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
