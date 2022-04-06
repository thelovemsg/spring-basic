package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        List<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        //엄밀히 말하면 prototype 패턴을 사용한 것은 아니다.
        List<Student> clone = new ArrayList<>(students);



        System.out.println(clone);
    }
}
