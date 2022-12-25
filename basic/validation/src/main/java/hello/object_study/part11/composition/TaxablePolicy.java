package hello.object_study.part11.composition;

import hello.object_study.part5.Money;

public class TaxablePolicy extends AdditionalRatePolicy{
    private double taxRatio;

    public TaxablePolicy(double taxRatio, RatePolicy next) {
        super(next);
        this.taxRatio = taxRatio;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.plus(fee.times(taxRatio));
    }
}
