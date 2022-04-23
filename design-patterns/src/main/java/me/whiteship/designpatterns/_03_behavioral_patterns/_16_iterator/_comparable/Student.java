package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._comparable;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data
public class Student implements Comparator<Student> {

    private String name;
    private Integer number;
    private Integer tall;

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNumber() - o2.getNumber();
    }

    @Builder
    public Student(String name, Integer number, Integer tall) {
        this.name = name;
        this.number = number;
        this.tall = tall;
    }

}
