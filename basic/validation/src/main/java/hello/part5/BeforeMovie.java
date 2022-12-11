package hello.part5;

import hello.part4.MovieType;

import java.time.Duration;
import java.util.List;

/**
 * 하는 것
 *  => 객체를 생성하거나 계산을 구하는 등의 스스로 하는 것
 *  => 다른 객체의 행동을 시작시키는 것
 *  => 다른 객체의 활동을 제어하고 조절하는 것
 *
 *  아는 것
 *  => 사적인 정보에 관해 아는 것
 *  => 관련된 객체에 관해 아는 것
 *  => 자신이 유도하거나 계산할 수 있는 것에 관해 아는 것
 *
 *
 */
public class BeforeMovie {

    private String title;
    private Duration runningTime;
    private Money fee;

    private List<DiscountCondition> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public Money calculateMovieFee(Screening screening) {
        if(isDiscountable(screening)){
            return fee.minus(calculateDiscountAmount());
        }
        return fee;
    }

    private Money calculateDiscountAmount() {
        switch (movieType){
            case AMOUNT_DISCOUNT:
                return calculateAmountDiscountAmount();
            case PERCENT_DISCOUNT:
                return calculatePercentDiscountAmount();
            case NONE_DISCOUNT:
                return calculateNoneDiscountAmount();
        }

        throw new IllegalArgumentException();

    }

    private Money calculateNoneDiscountAmount() {
        return Money.ZERO;
    }

    private Money calculatePercentDiscountAmount() {
        return fee.times(discountPercent);
    }

    private Money calculateAmountDiscountAmount() {
        return discountAmount;
    }



    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream().anyMatch(condition -> condition.isSatisfiedBy(screening));
    }
}
