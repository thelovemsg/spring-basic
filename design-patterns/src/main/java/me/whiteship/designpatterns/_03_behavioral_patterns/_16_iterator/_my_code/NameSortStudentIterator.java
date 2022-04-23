package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._my_code;

import me.whiteship.designpatterns._03_behavioral_patterns._16_iterator._01_before.Post;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NameSortStudentIterator implements Iterator<Student> {

    private Iterator<Student> internalIterator;

    public NameSortStudentIterator(List<Student> students) {
        Collections.sort(students, (p1, p2) -> p2.getName().compareTo(p1.getName()));
        this.internalIterator = students.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Student next() {
        return this.internalIterator.next();
    }

}
