package hello.part12.ex03;

import hello.part12.ex02.Lecture;

public class Professor {
    private String name;
    private Lecture lecture;

    public Professor(String name, Lecture lecture) {
        this.name = name;
        this.lecture = lecture;
    }

    public String compileStatistics() {
        return String.format("[%s] %s - Avg: %.lf", name, lecture.evaluate(), lecture.average());
    }

}
