package lesson7;

import java.util.Random;

public class Matrix<T extends Number> {
    T array[][];
    int row, column;

    Matrix(T [][] array) {;
        this.array = array;
        row = array.length;
        column = array[0].length;
    }

    boolean equals(Matrix<?> m) {
        return m.row == row && m.column == column;
    }

    public <T extends Number> void sumOfMatrix(Matrix<T> m) {
        if (this.equals(m)) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    //this.array[i][j] = this.array[i][j] + m.array[i][j];
                }
            }
        } else {
            System.out.println("There is problem with size of matrix!");
        }
    }

    public void initialize(int buttomBound, int upperBound) {
        Random rand = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //array[i][j] = rand.nextInt(upperBound) + buttomBound;
            }
        }
    }

    public <T extends  Number>void multiplicationOfNumber(T number) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                //this.array[i][j] = this.array[i][j] * number;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer array1 [][] = new Integer[5][5];
        Integer array2 [][] = new Integer[5][5];
        Matrix<Integer> m1 = new Matrix<>(array1);
        Matrix<Integer> m2 = new Matrix<>(array2);
        m1.initialize(-10, 10);
        m2.initialize(0, 15);
        System.out.println("The first matrix:");
        m1.printMatrix();
        System.out.println("The second matrix: ");
        m2.printMatrix();
        System.out.println("Sum of matrix: ");
        m1.sumOfMatrix(m2);
        m1.printMatrix();
        System.out.println("Multiplication:");
        m1.multiplicationOfNumber(-2);
        m1.printMatrix();
        System.out.println("Multiplication:");
        m2.multiplicationOfNumber(2);
        m2.printMatrix();
    }
}
