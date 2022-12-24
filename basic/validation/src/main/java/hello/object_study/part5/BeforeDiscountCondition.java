package hello.object_study.part5;

import hello.object_study.part4.DiscountConditionType;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * DiscountCondition은 하나 이상의 변경 이유를 가지기 떄문에 응집도가 낮다.
 *
 * isSatisfiedBy => isSatisfiedBySequence, isSatisfiedByPeriod는 서로 다른 이유료 변경이 될 가능성이 농후!
 *
 * 코드를 통해 변경 이유를 파악할 수 있는 방법
 * 1. 인스턴스 변수가 초기화되는 시점을 살펴보는 것.
 *   => 클래스의 속성이 서로 다른 시점에 초기화되거나 일부만 초기화된다는 것은 응집도가 낮다는 증거!
 *   => 따라서 함께 초기화되는 속성을 기준으로 코드를 분리해야 한다.
 *
 * 2.메서드들이 인스턴스 변수를 사용하는 방식을 살펴보는 것.
 *   => 모든 메서드가 객체의 모든 속성을 사용한다면 클래스의 응집도는 높다고 할 수 있다.
 *      반면, 메서스들이 사용하는 속성에 따라 그룹이 나뉜다면 크랠스의 응집도가 낮다고 볼 수 있다.
 *     isSatisfiedByPeriod와 isSatisfiedBySequence는 서로 사용하는 속성이 다름.
 *    고로, 응집도를 높이기 위해서는 속성 그룹과 해당 그룹에 접근하는 메서드 그룹을 기준으로 코드를 분리해야 한다.
 */
public class BeforeDiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;
    public boolean isSatisfiedBy(Screening screening) {
        if (type == DiscountConditionType.PERIOD) {
            return isSatisfiedByPeriod(screening);
        }
        return isSatisfiedBySequence(screening);
    }

    private boolean isSatisfiedBySequence(Screening screening) {
        return sequence == screening.getSequence();
    }

    private boolean isSatisfiedByPeriod(Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                endTime.compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
    }
}
