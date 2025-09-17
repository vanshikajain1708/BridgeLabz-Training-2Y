import java.util.Scanner;

public class MatrixOperations {

    // Method to generate random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // random 0-9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication not possible. Columns of A must equal rows of B.");
        }

        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows for matrix A: ");
            int rowsA = sc.nextInt();
            System.out.print("Enter cols for matrix A: ");
            int colsA = sc.nextInt();

            System.out.print("Enter rows for matrix B: ");
            int rowsB = sc.nextInt();
            System.out.print("Enter cols for matrix B: ");
            int colsB = sc.nextInt();

            int[][] A = generateMatrix(rowsA, colsA);
            int[][] B = generateMatrix(rowsB, colsB);

            System.out.println("\nMatrix A:");
            displayMatrix(A);

            System.out.println("\nMatrix B:");
            displayMatrix(B);

            if (rowsA == rowsB && colsA == colsB) {
                System.out.println("\nA + B:");
                displayMatrix(addMatrices(A, B));

                System.out.println("\nA - B:");
                displayMatrix(subtractMatrices(A, B));
            } else {
                System.out.println("\nAddition and subtraction not possible (dimension mismatch).");
            }

            try {
                System.out.println("\nA × B:");
                displayMatrix(multiplyMatrices(A, B));
            } catch (IllegalArgumentException e) {
                System.out.println("\n" + e.getMessage());
            }
        }
    }
}
