package hello.part14.composition.policy.impimentation;

import hello.part14.composition.policy._interface.AdditionalRatePolicy;
import hello.part14.composition.policy._interface.RatePolicy;
import hello.part5.Money;

public class TaxablePolicy extends AdditionalRatePolicy {
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
