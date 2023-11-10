package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students = new ArrayList<>();


    public void addStudent(Student student){
        students.add(student);
    }

    public void printAllStudents(){
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
    }
}
