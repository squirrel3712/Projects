package lesson13.task6;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
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
        return new String(value.getBytes("ISO-8859-1"), "UTF-8");
    }

    public static String workWithSalaryDay(Locale locale) throws UnsupportedEncodingException {
        Calendar calendar = new GregorianCalendar(2017, 0, 28);
        Employee.salaryDate = calendar.getTime();
        String text = getValue(locale, "key");
        DateFormat df = new SimpleDateFormat("" + text + " dd", locale);
        return df.format(Employee.salaryDate);
    }

    public static void generateFullReport(Employee[] employees) throws UnsupportedEncodingException {
        for (Employee e : employees) {
            System.out.printf("%-40s%10d%40s%n", e.getFullName(), e.getSalary(), workWithSalaryDay(Locale.US));
        }
    }
}
