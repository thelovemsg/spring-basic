package hello.object_study.part11.extend;

import hello.object_study.part5.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableRegularPhone extends RateDiscountableRegularPhone{
    private double taxRate;
    public RateDiscountableAndTaxableRegularPhone(Money amount, Duration seconds, Money discountAmount, double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
