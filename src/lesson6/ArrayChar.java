package lesson6;

public class ArrayChar {
    public static void main(String[] args) {
        String array[][] = new String[3][6];
        char c = 'a';
        int count = 1, i, j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                array[i][j] = c + "" + count + " ";
                count++;
            }
            count = 1;
            c++;
        }
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
