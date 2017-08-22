package lesson17.task4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentDemo {
    public static void main(String[] args) {
        Map<String, Integer> marks1 = new HashMap<>();
        marks1.put("Math", 5);
        marks1.put("Geography", 4);
        marks1.put("Historic", 4);
        Map<String, Integer> marks2 = new HashMap<>();
        marks2.put("Math", 2);
        marks2.put("Geography", 2);
        marks2.put("Historic", 2);
        Student student1 = new Student("Oleg", "KIT 45", 3, marks1);
        Student student2 = new Student("Ann", "KIT 45", 3, marks2);
        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        System.out.println("Студенты до отчисления: ");
        Student.printStudent(students, 3);
        Student.passOrNot(students);
        System.out.println("Студенты, которые перешли на следующий курс:");
        Student.printStudent(students, 4);
    }
}
