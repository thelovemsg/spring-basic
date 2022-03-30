package realBasic.core.discount;

import org.springframework.stereotype.Component;
import realBasic.core.MainDiscountPolicy;
import realBasic.core.member.Grade;
import realBasic.core.member.Member;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if( (member.getGrade() == Grade.VIP)){
            return price * discountPercent / 100;
        } else{
            return 0;
        }
    }
}
