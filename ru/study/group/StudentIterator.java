package ru.study.group;

import java.util.Iterator;
import java.util.List;

public class StudentIterator  implements Iterator<Student> {
    private int currentId;
    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > currentId;
    }

    @Override
    public Student next() {
        return students.get(currentId++);
    }
}
