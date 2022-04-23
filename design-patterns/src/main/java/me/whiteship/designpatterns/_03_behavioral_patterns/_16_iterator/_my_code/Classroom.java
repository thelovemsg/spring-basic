package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._my_code;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
public class Classroom {
    List<Student> students = new ArrayList<>();

    public void addStudent(String name){
        this.students.add(new Student(name));
    }

    public Iterator<Student> getNameSortStudentIterator (){
        return new NameSortStudentIterator(this.students);
    }
}
