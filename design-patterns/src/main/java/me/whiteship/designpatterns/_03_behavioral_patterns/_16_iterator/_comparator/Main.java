package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("shane",159));
        students.add(new Student("bangal", 555));
        students.add(new Student("chimera",444));
        students.add(new Student("docter kim",972));
        System.out.println("1. 넣은 순서대로 순회");
        for (Student student : students) {
            System.out.println("student.getName = " + student.getName());
            System.out.println("student.getNumber = " + student.getNumber());
        }

        System.out.println("2. 오름차순으로 정렬");
        Collections.sort(students , (o1, o2) -> o1.getNumber() - o2.getNumber());
        for (Student student : students) {
            System.out.println("student.getName = " + student.getName());
            System.out.println("student.getNumber = " + student.getNumber());
        }

        System.out.println("2. 역순으로 순회 - Comparator 객체 사용");
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getNumber() - o1.getNumber();
            }
        };
        //Comparator<Student> comparator1 = (o1, o2) -> o2.getNumber() - o1.getNumber();

        Collections.sort(students, comparator);
        for (Student student : students) {
            System.out.println("student.getName = " + student.getName());
            System.out.println("student.getNumber = " + student.getNumber());
        }

        System.out.println("3. 오름차순 재정렬");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println("student.getName = " + student.getName());
            System.out.println("student.getNumber = " + student.getNumber());
        }

    }
}
