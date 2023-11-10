package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     *
     *
     *     Schritt 1: Lege eine Java-Klasse "Student" an, die folgende
     *     Eigenschaften haben soll: Vorname, Nachname, Matrikelnummer.
     *     Schritt 2: Erstelle eine Java List für Elemente des Typs "Student"
     *     und füge mehrere Studenten hinzu.
     *
        Schritt 3: Lege eine Klasse "School" an, zu der man Students über eine Methode
        hinzufügen kann ('addStudent').
        Schritt 4: Implementiere eine Methode, um alle Students der Schule auszugeben
        (als Text, auf die Console).
        Schritt 5: Füge eine Methode hinzu, um einen Student anhand der id zu finden.
        DerDie gefundene Stundent soll returned werden.
        Schritt 6: Erstelle eine Methode, um eine*n Student aus der Schule zu entfernen.

     */

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Tim", "Wiese", "25a");
        Student student2 =new Student("Maria", "Musterfrau", "4711");
        students.add(new Student("Maria", "Musterfrau", "4711"));
        students.add(student1);
        System.out.println(students);

        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.printAllStudents();
    }
}