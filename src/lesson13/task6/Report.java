package lesson13.task6;

public class Report {
    public static void generateReport(Employee[] employee) {
        for (Employee e : employee) {
            System.out.printf("%-40s%10d%n", e.getFullName(), e.getSalary());
        }
    }
}
