package lesson16.task5;

import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class DeleteRepeat {
    public static String delRepeat(String str) {
        Pattern pattern = Pattern.compile("\\D+\\s*");
        String array[] = pattern.split(str);
        Set<String> set = new TreeSet<>();
        for (String s : array) {
            set.add(s);
        }
        return set.toString();
    }

    public static void main(String[] args) {
        System.out.println(delRepeat("1ghg 78  78 90 1 ko 0 90hk"));
    }
}
