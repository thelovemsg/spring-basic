package hello.object_study.part10.phone_improve_with_abtract;

import hello.object_study.part5.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private double taxRate;
    private List<Call> calls = new ArrayList<>();

    public Phone(double taxRate) {
        this.taxRate = taxRate;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;
        for (Call call : calls) {
            result.plus(calculateCallFee(call));
        }
        return result.plus(result.times(taxRate));
    }
    protected abstract Money calculateCallFee(Call call);
}
