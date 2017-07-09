package lesson6;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        char array[][] = {
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'l', 'm'}
        };
        System.out.println(Arrays.deepToString(array));
    }
}
