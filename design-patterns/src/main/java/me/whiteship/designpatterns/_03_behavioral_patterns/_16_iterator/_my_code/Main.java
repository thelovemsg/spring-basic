package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._my_code;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.addStudent("shane");
        classroom.addStudent("bengal tiger");
        classroom.addStudent("doctor kim");
        classroom.addStudent("chimera");

        List<Student> students = classroom.getStudents();
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }

        Iterator<Student> studentList = classroom.getNameSortStudentIterator();
        for (Student student : students) {
            System.out.println("student = " + student.getName());
        }

    }

}
