package hello.javainaction.part02.after;
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
