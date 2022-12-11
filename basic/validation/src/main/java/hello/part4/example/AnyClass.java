package hello.part4.example;

/**
 * 문제점
 * 1. 코드 중복이 발생활 확률이 높다. => 중복은 악의 근원!?!?!
 *
 */
public class AnyClass {
    void anyMethod(Rectangle rectangle, int multiple){
        rectangle.setRight(rectangle.getRight() * multiple) ;
        rectangle.setBottom(rectangle.getBottom() * multiple); ;
        // ***
    }
}
