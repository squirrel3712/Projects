package lesson14;

import java.util.regex.Pattern;

public class MinCharacters {
    public static void main(String[] args) {
        MinCharacters m = new MinCharacters();
        String s = "min of minimum";
        System.out.println(m.findLittleWord(s));
    }

    public static String deleteRepeat(String s, String word) {
        for (int j = 0; j < word.length(); j++) {
            if (!s.contains(word.substring(j, j + 1))) {
                s += word.substring(j, j + 1);
            }
        }
        return s;
    }

    public String findLittleWord(String s) {
        Pattern pattern = Pattern.compile("\\W+\\s*");
        String array[] = pattern.split(s);
        int tempArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            String buf = "";
            deleteRepeat(buf, word);
            tempArray[i] = buf.length();
        }
        return array[minOfArray(tempArray)];
    }

    public int minOfArray(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
                min = array[i];
            }
        }
        return index;
    }
}
