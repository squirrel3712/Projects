package lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LatinAlphabet {
    public static void main(String[] args) {
        LatinAlphabet l = new LatinAlphabet();
        String s = "I love Джава and OOP";
        System.out.println("Count of latin words: " + l.countOfWords(s));
    }

    public int countOfWords(String s) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s?");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
