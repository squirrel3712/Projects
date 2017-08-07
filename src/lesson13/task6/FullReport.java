package lesson13.task6;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;;

public class FullReport {
    public static String changeLocale(Locale locale) throws UnsupportedEncodingException {
        String value = "";
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        for (String key : rb.keySet()) {
            value = rb.getString(key);
            value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
        }
        return value;
    }

    public static void generateFullReport(Employee[] employees) throws UnsupportedEncodingException {
        Locale locale[] = new Locale[2];
        locale[0] = Locale.US;
        locale[1] = new Locale("ru", "RU");

        Calendar calendar[] = new Calendar[12];
        for (int i = 0; i < calendar.length; i++) {
            calendar[i] = new GregorianCalendar(2017, i, 28);
        }
        Employee.salaryDate = calendar[0].getTime();

        DateFormat df = new SimpleDateFormat(changeLocale(locale[1]) + " dd");
        String date = df.format(Employee.salaryDate);
        for (Employee e : employees) {
            System.out.printf("%-40s%10d%40s%n", e.getFullName(), e.getSalary(), date);
        }
    }
}
