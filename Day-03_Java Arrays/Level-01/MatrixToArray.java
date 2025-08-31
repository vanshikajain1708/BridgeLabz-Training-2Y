import java.util.Scanner;

public class MatrixToArray {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            // Input rows and columns
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int columns = sc.nextInt();

            // Create 2D array
            int[][] matrix = new int[rows][columns];

            // Input elements of 2D array
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element at [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Create 1D array to store all elements
            int[] array = new int[rows * columns];
            int index = 0;

            // Copy elements from 2D array to 1D array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[index] = matrix[i][j];
                    index++;
                }
            }

            // Display the 1D array
            System.out.print("\nElements in 1D array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

