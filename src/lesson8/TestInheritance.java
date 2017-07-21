package lesson8;

public class TestInheritance {
    public static void main(String[] args) {
        Student s = new Student("Ann", "Chunosova");
        Aspirant a = new Aspirant("Oleg", "Ostrovski", "DB");
        Student s1 = new Aspirant("Ilia", "Petrov", "DB");
    }
}
