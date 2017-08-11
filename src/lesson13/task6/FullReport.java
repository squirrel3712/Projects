package lesson13.task6;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static String getValue(Locale locale, String key) throws UnsupportedEncodingException {
        String value;
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        value = rb.getString(key);
        value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
        return value;
    }

    public static String workWithSalaryDay() throws UnsupportedEncodingException {
        Calendar calendar = new GregorianCalendar(2017, 0, 28);
        Employee.salaryDate = calendar.getTime();
        String text = getValue(Locale.US, "key");
        SimpleDateFormat df = new SimpleDateFormat(text + " dd", Locale.US);
        String date = df.format(Employee.salaryDate);
        return date;
    }

    public static void generateFullReport(Employee[] employees) throws UnsupportedEncodingException {
        for (Employee e : employees) {
            System.out.printf("%-40s%10d%40s%n", e.getFullName(), e.getSalary(), workWithSalaryDay());
        }
    }
}
