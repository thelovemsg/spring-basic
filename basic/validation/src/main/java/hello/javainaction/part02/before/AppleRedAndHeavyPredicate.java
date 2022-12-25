package hello.javainaction.part02.before;

public class AppleRedAndHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return Color.RED.equals(apple.getColor()) && apple.getWeight() > 150;
    }

}
