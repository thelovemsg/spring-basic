package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
         List<Student> studentList = new ArrayList<>();

         studentList.add(Student.builder().name("shane").number(123).tall(190).build());
         studentList.add(Student.builder().name("bengalTiger").number(312).tall(180).build());
         studentList.add(Student.builder().name("chimera").number(231).tall(182).build());
         studentList.add(Student.builder().name("doctor Kim").number(456).tall(199).build());

        System.out.println(" 1. 이름 정렬 구현하기 ");
        Collections.sort(studentList, new SortByName());
        for (Student student : studentList) {
            System.out.println("student = " + student);
        }
        System.out.println();
        System.out.println(" 2. 키 정렬 구현하기 ");
        Collections.sort(studentList, new SortByTall());
        for (Student student : studentList) {
            System.out.println("student = " + student);
        }
        System.out.println();
        System.out.println(" 3. 키로 역순 정렬 구현하기 ");
        Collections.sort(studentList, new ReverseSortByTall());
        for (Student student : studentList) {
            System.out.println("student = " + student);
        }

    }

    static class SortByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    static class SortByTall implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getTall() - o2.getTall();
        }
    }

    static class ReverseSortByTall implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getTall()-o1.getTall();
        }
    }

    static class MultiSorting implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            int nameCompare = o1.getName().compareTo(o2.getName());
            int tallCompare = o1.getTall().compareTo(o2.getTall());
            return (nameCompare == 0) ? tallCompare : nameCompare;
        }
    }

    // ...

}
