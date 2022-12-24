package hello.object_study.part4;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * 캡슐화 - 변경 가능성이 높은 부분을 객체 내부로 숨기는 추상화 기법
 * => 상태와 행동을 하나의 객체 안에 모음 => 메시지를 전송해서 협력을 원하는 객체는 메시지만 통해서 
 * => 접근할 뿐 내부적으로 어떤 작업이 일어나는지는 몰라도 됀다! => 응집도 증가, 결합도 감소
 * 
 * 장점
 * 1. 한 곳에서 일어난 변경이 전체 시스템에 영향을 끼치지 않도록 파급효과를 적절하게 조절할 수 있다는 점.
 * 
 * 데이터 중심 설계의 문제점
 * 1. 캡슐화 위반
 * 2. 높은 결합도
 * 3. 낮은 응집도   (이 사항들을 반대로 하면 캡슐화시 지켜야 할 것이 됨)
 *
 *
 * 
 */
public class DiscountCondition_Data {
    private DiscountConditionType type;

    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public DiscountConditionType getType() {
        return type;
    }

    public boolean isDiscountable(DayOfWeek dayOfWeek, LocalTime time) {
        if ( type != DiscountConditionType.PERIOD){
            throw new IllegalStateException();
        }

        return this.dayOfWeek.equals(dayOfWeek) &&
                this.startTime.compareTo(time) <= 0 &&
                this.endTime.compareTo(time) >= 0;
    }

    public boolean isDiscountable(int sequence) {
        if (type != DiscountConditionType.SEQUENCE) {
            throw new IllegalArgumentException();
        }
        return this.sequence == sequence;
    }

    public void setType(DiscountConditionType type) {
        this.type = type;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
