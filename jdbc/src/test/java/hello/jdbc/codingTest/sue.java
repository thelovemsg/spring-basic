package hello.jdbc.codingTest;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class sue {

    @Test
    public void sue(){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] reports = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 3;
        List<String> list = Arrays.stream(reports).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) +1);
        }

        System.out.println("count = " + count);

        int[] s1 = Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
        Arrays.stream(s1).forEach(System.out::println);
    }

}
