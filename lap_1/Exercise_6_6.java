package lap_1;

import java.util.Scanner;

public class Exercise_6_6 {

    private static void displayMatrix(String label, double[][] matrix) {
        System.out.println(label);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        int numRows = matrix1.length;
        int numCols = matrix1[0].length;
        double[][] result = new double[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static void inputMatrixElements(Scanner scanner, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at row " + (i + 1) + " and column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Choose whether to enter new matrices or use constant matrices
        System.out.print("Do you want to enter new matrices (yes/no)? ");

        int numRows, numCols;
        System.out.print("Enter the number of rows: ");
        numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        numCols = scanner.nextInt();

        // Initialize the matrices
        double[][] matrix1 = new double[numRows][numCols];
        double[][] matrix2 = new double[numRows][numCols];

        // Input matrix elements
        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(scanner, matrix1);
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(scanner, matrix2);

        // Check if the matrices are of the same size
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices must have the same size for addition.");
        } else {
            double[][] result = addMatrices(matrix1, matrix2);
            displayMatrix("Matrix 1:", matrix1);
            displayMatrix("Matrix 2:", matrix2);
            displayMatrix("Sum of Matrices:", result);
        }
    }
}
