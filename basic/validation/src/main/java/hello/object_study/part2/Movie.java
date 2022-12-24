package hello.object_study.part2;

import java.time.Duration;

/**
 * 하는 것
 *  => 객체를 생성하거나 계산을 구행하는 등의 스스로 하는 것
 *  => 다른 객체의 행동을 시작시키는 것
 *  => 다른 객체의 활동을 제어하고 조절하는 것
 *
 *  아는 것
 *  => 사적인 정보에 관해 아는 것
 *  => 관련된 객체에 관해 아는 것
 *  => 자신이 유도하거나 계산할 수 있는 것에 관해 아는 것
 */
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {
        if (discountPolicy == null)
            return fee;
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
