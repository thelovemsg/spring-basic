package hello.part12.ex03;

import hello.part12.ex02.Grade;
import hello.part12.ex02.GradeLecture;
import hello.part12.ex02.Lecture;

import java.util.Arrays;

/**
 * 코드 안에서 선언된 참조 타입과 무관하게 실제로 메시지를 수신하는 객체의 타입에 따라 실행되는 메서드가 달라질 수
 * 있는 것은 업캐스팅과 동적 바인딩이라는 메커니즘이 작용하기 때문이다.
 * => 부모 클래스 타입으로 선언된 변수에 자식 클래스의 인스턴스를 할당하는 것이 가능하다. 이를 업캐스팅이라고 부른다.
 * => 선언된 변수의 타입이 아니라 처리할 적절한 메서드를 컴파일 시점이 아니라 실행 시점에 결정하기 때문에 가능하다. 이를 동적 바인딩이라고 한다.
 *
 */
public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("다익스트라", new Lecture(70, "알고리즘"
                , Arrays.asList(81, 95, 75, 50, 45)));
        String statistics = professor.compileStatistics();

        Professor professor1 = new Professor("다익스트라",
                new GradeLecture(70, "알고리즘",
                        Arrays.asList(81, 95, 75, 50, 45),
                        Arrays.asList(new Grade("A", 100, 95),
                                new Grade("B", 94, 80),
                                new Grade("C", 79, 70),
                                new Grade("D", 69, 50),
                                new Grade("F", 49, 0))
                ));

        String statistics1 = professor1.compileStatistics();
    }
}
