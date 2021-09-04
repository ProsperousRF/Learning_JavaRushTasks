package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class StudentsDataBase {
  public static List<Student> students = new ArrayList<>();

  public static void addInfoAboutStudent(Student student) {
    students.add(student);
    printInfoAboutStudent(student);
  }

  public static void printInfoAboutStudent(Student student) {
    System.out.println("Имя: " + student.name + " Возраст: " + student.getAge());
  }

  public static void removeStudent(int index) {
    try{
      students.remove(index);
    } catch (Exception e) {
      // Do nothing
    }

  }

  public static void findDimaOrSasha() {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName().equals("Dima")) {
        System.out.println("Студент Dima есть в базе.");
        break;
      }

      if (students.get(i).getName().equals("Sasha")) {
        System.out.println("Студент Sasha есть в базе.");
        break;
      }
    }
  }
}