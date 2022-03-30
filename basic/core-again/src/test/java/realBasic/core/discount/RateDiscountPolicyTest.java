package realBasic.core.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import realBasic.core.member.Grade;
import realBasic.core.member.Member;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10percent 할인이 적용됩니다.")
    void vip0(){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아닌 경우")
    void vipX(){
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
        int discount = discountPolicy.discount(member, 10000);
        Assertions.assertThat(discount).isEqualTo(0);
    }

}