package hello.javainaction.part02.before;

import java.util.ArrayList;
import java.util.List;

import static hello.javainaction.part02.before.Color.GREEN;

public class Apples {
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    // filterApples에서 ApplePredicate을 받아 애플의 조건을 검사하도록 코드를 변경
    // 이렇게 동작 파라미텅화, 즉 메서드가 다양한 동작을 받아서 내부적으로 다양한 동작을 수행할 수 있다.
    public static List<Apple> filterApplesWithPredicate(List<Apple> inventory, ApplePredicate ap){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(ap.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ( (!flag && apple.getWeight() > weight) ||
                (flag && apple.getColor().equals(color))) {
                result.add(apple);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }
}
