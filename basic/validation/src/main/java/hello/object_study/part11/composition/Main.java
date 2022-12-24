package hello.object_study.part11.composition;

import hello.object_study.part5.Money;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //일반 요금제에 세금 정책을 조합할 경우
        Phone phone = new Phone(new TaxablePolicy(0.05, new RegularPolicy(Money.ZERO, Duration.ofSeconds(30))));

        //일반 요금제에 기본 요금 할인 정책을 조합한 결과에 세금 정책을 조합하고 싶다면??
        Phone phone1 = new Phone(new TaxablePolicy(0.05,
                new RateDiscountablePolicy(Money.wons(1000),
                    new RegularPolicy(Money.ZERO, Duration.ofSeconds(30)))));

        //세금 정책과 기본 요금 할인 정책이 적용되는 순서를 바꾸고 싶으면?
        Phone phone2 = new Phone(
                new RateDiscountablePolicy(Money.wons(1000),
                    new TaxablePolicy(0.05,
                        new RegularPolicy(Money.ZERO, Duration.ofSeconds(30)))));

        //동일한 정책을 심야 하인 요금제에도 적용하고 싶으면?
        new Phone(
                new RateDiscountablePolicy(Money.wons(1000),
                    new TaxablePolicy(0.05,
                        new NightlyDiscountPolicy(Money.ZERO, Money.ZERO, Duration.ofSeconds(30)))));

    }
}
