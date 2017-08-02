package lesson7;

import java.util.Formatter;

public class Person {
    String fullName;
    int age;

    Person() {
        fullName = null;
        age = -1;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    @Override
    public String toString() {
        return  String.format("Person{fullName = %1$s,\nage = %2$s}",fullName, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.move();
        p1.talk();
        Person p2 = new Person("Ann Chunosova", 19);
        p2.move();
        p2.talk();
        System.out.println(p2);
    }
}
