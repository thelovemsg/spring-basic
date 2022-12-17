package hello.part11.extend;

import hello.part5.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;
        for (Call call : calls) {
            result.plus(calculateCallFee(call));
        }
        return afterCalculated(result);
    }

    /**
     * 유연성을 유지하면서도 중복 코드를 제거할 수 있는 방법으로 default 메소드를 작성
     * => 이를 hook method 라고 한다.
     */
    protected Money afterCalculated(Money fee) {
        return fee;
    }
    protected abstract Money calculateCallFee(Call call);

    public List<Call> getCalls() {
        return calls;
    }
}
