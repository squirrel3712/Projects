package lesson14;

import java.util.regex.Pattern;

public class Polindrom {
    public static void main(String[] args) {
        findPolindrom("I love Java 4554 and 77 and 12 others");
    }

    public static void findPolindrom(String s) {
        String st = s.trim();
        Pattern pattern = Pattern.compile("\\D+");
        String[] array = pattern.split(st);
        StringBuilder builder;
        for (String str : array) {
            builder = new StringBuilder(str);
            if (str.equals(builder.reverse().toString())) {
                if (!str.isEmpty()) {
                    System.out.println(str);
                }
            }
        }
    }
}
