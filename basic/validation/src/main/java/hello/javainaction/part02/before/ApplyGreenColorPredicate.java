package hello.javainaction.part02.before;

import static hello.javainaction.part02.before.Color.*;

public class ApplyGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
