package lesson6;

import java.util.Arrays;

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (min != array[i]) {
                array[pos] = array[i];
                array[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 2, 3, 6, 0, 10, 101, 100, 4};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
