package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._my_code;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {

    private String name;
    private LocalDateTime birthDay;

    public Student(String name) {
        this.name = name;
        this.birthDay = birthDay.now();
    }

}
