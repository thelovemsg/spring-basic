package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._comparator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer number;
    public Student(String name, Integer number) {
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.getNumber() ;
    }
}
