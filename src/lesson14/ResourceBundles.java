package lesson14;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundles {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(Locale.getDefault());
        Locale locale[] = new Locale[3];
        locale[0] = Locale.ROOT;
        locale[1] = Locale.US;
        locale[2] = new Locale("ru", "RU");
        printInfo(locale);
    }

    private static void printInfo(Locale[] locales) throws UnsupportedEncodingException {
        for (Locale l : locales) {
            ResourceBundle rb = ResourceBundle.getBundle("text", l);
            for (String key : rb.keySet()) {
                String value = rb.getString(key);
                value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
                System.out.println(value);
            }
            System.out.println();
        }
    }
}
