package ru.study.group;

import java.util.*;

public class StydentGroup implements Iterable<Student> {
    private List<Student> students;


    public StydentGroup() {

        students = new ArrayList<>();
    }

    public void addStydent(Student student){

        students.add(student);
    }

    public void sortByName(){
        Collections.sort(students);
    }

    public void sortByAge(){
        students.sort(new StudentComporatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);
    }


}
