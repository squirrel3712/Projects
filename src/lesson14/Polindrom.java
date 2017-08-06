package lesson14;

import java.util.regex.Pattern;

public class Polindrom {
    public static void main(String[] args) {
        findPolindrom("I love Java 4554 and 77 and others");
    }

    public static void findPolindrom(String s) {
        Pattern pattern = Pattern.compile("\\D+");
        String[] array = pattern.split(s);
        StringBuilder builder;
        for (String str : array) {
            builder = new StringBuilder(str);
            if (builder.equals(builder.reverse())) {
                System.out.println(str);
            }
        }
    }
}
