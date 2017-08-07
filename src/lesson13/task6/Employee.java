package lesson13.task6;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class Employee {
    private String fullName;
    private int salary;
    public static Date salaryDate;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee("Ann Chunosova", 10000);
        employee[1] = new Employee("Oleg Ostrov", 12000);
        employee[2] = new Employee("Iliy Petrov", 6000);
        FullReport.generateFullReport(employee);
    }
}
