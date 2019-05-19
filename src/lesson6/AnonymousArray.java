package lesson6;

import java.util.Arrays;

public class AnonymousArray {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Arrays.deepToString(new char[][]{
                {'a', 'b'},
                {'c', 'd'},
                {'e', 'f'},
                {'l', 'm'}
        }));
    }
}
