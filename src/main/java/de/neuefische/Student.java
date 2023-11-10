package de.neuefische;

public class Student {

   private String firstname;

   private String lastname;

   private String matrikelnumber;

    public Student(String firstname, String lastname, String matrikelnumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.matrikelnumber = matrikelnumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", matrikelnumber='" + matrikelnumber + '\'' +
                '}';
    }
}
