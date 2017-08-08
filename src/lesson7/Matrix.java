package lesson7;

public class Matrix<T extends Number> {
    T array[][];
    int row, column;

    Matrix(T[][] array) {
        this.array = array;
        row = array.length;
        column = array[0].length;
    }

    boolean equals(Matrix<?> m) {
        return m.row == row && m.column == column;
    }

    public Matrix<Double> sumOfMatrix(Matrix<? extends Number> m) {
        Double newArray[][] = new Double[row][column];
        if (this.equals(m)) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    newArray[i][j] = this.array[i][j].doubleValue() + m.array[i][j].doubleValue();
                }
            }
        } else {
            System.out.println("There is problem with size of matrix!");
        }
        return new Matrix<>(newArray);
    }

    public Matrix<Double> multiplicationOfNumber(T number) {
        Double newArray[][] = new Double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                newArray[i][j] = this.array[i][j].doubleValue() * number.doubleValue();
            }
        }
        return new Matrix<>(newArray);
    }

    public static void printMatrix(Matrix<? extends Number> m) {
        for (int i = 0; i < m.array.length; i++) {
            for (int j = 0; j < m.array[0].length; j++) {
                System.out.print(m.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer array1[][] = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Double array2[][] = new Double[][]{{9.9, 10.9, 11.0}, {0.0, 4.9, 36.9}, {6.0, 4.9, 1.0}};
        Matrix<Integer> m1 = new Matrix<>(array1);
        Matrix<Double> m2 = new Matrix<>(array2);
        System.out.println("The first matrix:");
        printMatrix(m1);
        System.out.println("The second matrix: ");
        printMatrix(m2);
        System.out.println("Sum of matrix: ");
        printMatrix(m1.sumOfMatrix(m2));
        System.out.println("Multiplication:");
        printMatrix(m1.multiplicationOfNumber(2));
        System.out.println("Multiplication:");
        printMatrix(m2.multiplicationOfNumber(2.0));
    }
}
