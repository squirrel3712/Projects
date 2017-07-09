package lesson6;

import java.util.Arrays;

public class MinMax {
    public static int[][] findMinMax(int array[][]) {
        int[][] result = new int[5][2];
        int max, min;
        for (int i = 0; i < array.length; i++) {
            max = min = array[i][0];
            for (int j = 1; j < array[0].length; j++) {
                max = (max > array[i][j]) ? max : array[i][j];
                min = (min < array[i][j]) ? min : array[i][j];
            }
            result[i][0] = max;
            result[i][1] = min;
        }
        return result;
    }

    public static void printArray(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 1, 22, 23, 100},
                {25, 26, 207, 8, 29, 30, 31, 32},
                {33, 34, 305, 36, 37, 38, 39, -8}
        };
        printArray(array);
        System.out.println(Arrays.deepToString(findMinMax(array)));
    }
}
