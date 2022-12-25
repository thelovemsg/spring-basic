package hello.object_study.part4;

import hello.object_study.part2.Money;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

/**
 * 데이터 중심의 영화 예매 시스템의 문제점 - 캡슐화 위반
 *  오직 메서드를 통해서만 객체의 내부 상태에 접근할 수 있다.
 *
 *  ?!1?!?! 어디가?
 *  getFee 메소드와 setFee 메소드는 내부에 Money 타입의 fee라는 이름의 인스턴수 변수가 존재한다는 사실을 퍼블릭 인터페이스에
 *  노골적으로 드러냄
 *  => 이런 현상이 생긴 이유는 객체가 수행할 책임이 아닌 내부에 저장할 데이터에 초점을 맞췄기 때문이다.
 *  => 설계를 시작하는 처음부터 데이터에 관해 결정하도록 강요하기 때문에 너무 이른 시기에 구현에 초점을 맞추게 한다.
 *
 *  책임 주소 설계
 *  1. 데이터보다 행동을 먼저 결정하라
 *  => "객체가 수행해야 하는 책임이 무엇인지 결정"한 후에 "이 책임을 수행하는데 필요한 데이터는 무엇인가"를 결정한다.
 */
public class Movie_Data {
    private String title;
    private Duration runningTime;
    private Money fee;
    private List<DiscountCondition_Data> discountConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    public MovieType getMovieType() {
        return movieType;
    }

    public boolean isDiscountable(LocalDateTime whenScreened, int sequence) {
        for (DiscountCondition_Data condition : discountConditions) {
            if(condition.getType() == DiscountConditionType.PERIOD){
                if(condition.isDiscountable(whenScreened.getDayOfWeek(), whenScreened.toLocalTime()))
                    return true;
            }else {
                if(condition.isDiscountable(sequence))
                    return true;
            }
        }
        return false;
    }

    public Money calculateAmountDiscountFee() {
        if (movieType != MovieType.AMOUNT_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return fee.minus(discountAmount);
    }

    public Money calculatePercentDiscountedFee() {
        if (movieType != MovieType.PERCENT_DISCOUNT) {
            throw new IllegalArgumentException();
        }
        return fee.minus(fee.times(discountPercent));
    }

    public Money calculateNoneDiscountedFee() {
        if (movieType != MovieType.NONE_DISCOUNT)
            throw new IllegalArgumentException();
        return fee;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition_Data> getDiscountConditions() {
        return Collections.unmodifiableList(discountConditions);
    }

    public void setDiscountConditions(List<DiscountCondition_Data> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }
}
