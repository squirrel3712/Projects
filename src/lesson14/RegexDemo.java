package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String s = "Java 5, Java 6, Java 7, java 8";
        Pattern p = Pattern.compile("Java\\s?\\d");
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
