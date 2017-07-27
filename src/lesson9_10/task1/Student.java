package lesson9_10.task1;

public class Student {
    private String firstName, lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

     public int getScholorship(){
        final int s = 1100;
        System.out.println("Scholorship in student = " + s);
        return s;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firatName) {
        this.firstName = firatName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
