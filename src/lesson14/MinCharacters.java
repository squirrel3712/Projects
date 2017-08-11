package lesson14;

import java.util.regex.Pattern;

public class MinCharacters {
    public static void main(String[] args) {
        MinCharacters m = new MinCharacters();
        String s = "min of minimum";
        System.out.println(m.findLittleWord(s));
    }

    public String findLittleWord(String s) {
        Pattern pattern = Pattern.compile("\\W+\\s*");
        String array[] = pattern.split(s);
        int tempArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            String buf = "";
            for (int j = 0; j < word.length(); j++) {
                if (!buf.contains(word.substring(j, j + 1))) {
                    buf += word.substring(j, j + 1);
                }
            }
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
