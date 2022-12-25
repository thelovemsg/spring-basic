package hello.javainaction.part02.after;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    public <T> List<T> filter(List<T> list, Predicate p){
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> test = List.of("test", "test2");
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        Filter filter = new Filter();
        List<String> filter1 = filter.filter(test, nonEmptyStringPredicate);

        System.out.println("filter1 = " + filter1);
    }
}
