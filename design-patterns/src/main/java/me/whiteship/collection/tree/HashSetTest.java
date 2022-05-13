package me.whiteship.collection.tree;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> setTest = new HashSet<>();
        Set<String> addAllSet = new HashSet<>();

        //1. HashSet에 값 추가 - 존재여부 판단
        System.out.println("1. HashSet에 값 추가 - 존재여부 판단");
        setTest.add("test1");
        boolean isExist = setTest.contains("test1");
        System.out.println("isExist = " + isExist);
        System.out.println();


        //2. 제거 및 확인
        System.out.println("2. 제거 및 확인");
        setTest.remove("test1");
        boolean isEmpty = setTest.isEmpty();
        System.out.println("isEmpty = " + isEmpty);
        System.out.println();

        //3. set에 set더해 보리기
        setTest.add("test1");
        setTest.add("test2");
        setTest.add("test3");

        addAllSet.add("111");
        addAllSet.add("222");
        addAllSet.add("333");

        setTest.addAll(addAllSet);
        setTest.forEach(System.out::println);
        System.out.println();

        // 순회하기
        setTest.stream().iterator().forEachRemaining(s -> {
            System.out.println("순회중...");
            System.out.println(s.toString());
        });
    }
}
