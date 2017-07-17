package lesson7;

import java.util.Random;

public class Matrix {
    double array[][];
    int row, column;

    Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        array = new double[this.row][this.column];
    }

    boolean equals(Matrix m) {
        return m.row == row && m.column == column;
    }

    public double[][] sumOfMatrix(Matrix m) {
        double array1[][] = new double[row][column];
        if (this.equals(m)) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    array1[i][j] = this.array[i][j] + m.array[i][j];
                }
            }
        } else {
            System.out.println("There is problem with size of matrix!");
        }
        return array1;
    }

    public void initialize(int buttomBound, int upperBound) {
        Random rand = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = rand.nextInt(upperBound) + buttomBound;
            }
        }
    }

    public double[][] multiplicationOfNumber(int number) {
        double array1[][] = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array1[i][j] = this.array[i][j] * number;
            }
        }
        return array1;
    }

    public static void printMatrix(double[][] array1) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m1 = new Matrix(5, 5);
        Matrix m2 = new Matrix(5, 5);
        m1.initialize(-10, 10);
        m2.initialize(0, 15);
        System.out.println("The first matrix:");
        printMatrix(m1.array);
        System.out.println("The second matrix: ");
        printMatrix(m2.array);
        System.out.println("Sum of matrix: ");
        printMatrix(m1.sumOfMatrix(m2));
        System.out.println("Multiplication:");
        printMatrix(m1.multiplicationOfNumber(-2));
        System.out.println("Multiplication:");
        printMatrix(m2.multiplicationOfNumber(2));
    }
}
