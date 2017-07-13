package lesson6;

import java.util.Arrays;

public class BubbleSorterChanged {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 7, 5, 0};
        System.out.println(Arrays.toString(sort(array)));
    }
}
