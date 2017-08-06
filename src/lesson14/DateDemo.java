package lesson14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void main(String[] args) {
        Calendar[] calendar = new GregorianCalendar[5];
        calendar[0] = new GregorianCalendar(2017, 2, 8);
        calendar[1] = new GregorianCalendar(2017, 4, 1);
        calendar[2] = new GregorianCalendar(2017, 4, 9);
        calendar[3] = new GregorianCalendar(2017, 7, 23);
        calendar[4] = new GregorianCalendar(2017, 11, 31);
        Date[] dates = new Date[calendar.length];
        for (int i = 0; i < calendar.length; i++) {
            dates[i] = calendar[i].getTime();
        }
        DateFormat df = new SimpleDateFormat("d MMMM YYYY");
        for (Date d : dates) {
            System.out.println(df.format(d));
        }
    }
}
