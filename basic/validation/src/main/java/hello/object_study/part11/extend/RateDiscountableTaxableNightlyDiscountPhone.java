package hello.object_study.part11.extend;

import hello.object_study.part5.Money;

import java.time.Duration;

public class RateDiscountableTaxableNightlyDiscountPhone extends RateDiscountableNightlyDiscountPhone{
    private double taxRate;

    public RateDiscountableTaxableNightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds,
                                                       Money discountAmount, double taxRate) {
        super(nightlyAmount, regularAmount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }

}
