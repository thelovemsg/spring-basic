package hello.javainaction.part02;

import hello.javainaction.part02.after.Letter;
import hello.javainaction.part02.before.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static hello.javainaction.part02.before.Color.*;
import static java.util.Comparator.*;

public class play {
    public static void main(String[] args) {
        ApplePredicate ap = new AppleRedAndHeavyPredicate();
        Apple test11 = new Apple(GREEN, 160);
        boolean test = ap.test(test11);

        List<Apple> inventory = new ArrayList<>();
        inventory.add(test11);

        List<Apple> apples = Apples.filterApplesWithPredicate(inventory, new AppleHeavyWeightPredicate());

        List<Apple> apples1 = Apples.filterApplesWithPredicate(inventory, new ApplePredicate() {
            public boolean test(Apple apple) {
                return RED.equals(apple.getColor());
            }
        });

        List<Apple> apples2 = Apples.filterApplesWithPredicate(inventory, (Apple apple) -> RED.equals(apple.getColor()));
        List<Apple> filter = Apples.filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        inventory.sort(comparingInt(Apple::getWeight));
        BiFunction<Color, Integer, Apple> cmf = Apple::new;
        Apple apply = cmf.apply(GREEN, 100);
        System.out.println("apply = " + apply);

        inventory.sort(comparing(Apple::getWeight)
                .reversed().thenComparing(Apple::getCountry));

        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> result = addHeader.andThen(Letter::checkSpelling)
                .andThen(Letter::addFooter);
        String apply1 = result.apply("hello, this is my test babe.");
        System.out.println("apply1 = " + apply1);
    }
}
