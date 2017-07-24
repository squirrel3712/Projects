package lesson9_10;

public class TestInheritance {
    public static void main(String[] args) {
        Student [] student = new Student[3];
        student[0] = new Aspirant("Oleg", "Ostrovski", "DB");
        student[1] = new Student("Ann", "Chunosova");
        student[2] = new Aspirant("Ilia", "Petrov", "DB");
        for(Student s : student){
            s.getScholorship();
        }
    }
}
