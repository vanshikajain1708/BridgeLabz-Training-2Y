import java.util.Random;

public class MatrixOperation {

    // a. Create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // Random values 0–9
        return matrix;
    }

    // b. Transpose of matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // c. Determinant of 2x2 matrix
    public static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    // d. Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        int a = m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        int b = m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        int c = m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        return a - b + c;
    }

    // e. Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular");
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] =  m[0][0] / (double)det;
        return inv;
    }

    // f. Inverse of 3x3 matrix (manual cofactor + adjugate method)
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix is singular");

        double[][] inv = new double[3][3];

        // Cofactors
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        inv[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        inv[0][2] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        inv[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        inv[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        inv[2][0] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        inv[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        // Transpose of cofactor matrix (adjugate), then divide by determinant
        double[][] result = new double[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                result[i][j] = inv[j][i] / (double)det;

        return result;
    }

    // g. Display matrix
    public static void display(int[][] matrix) {
        for(int[] row : matrix) {
            for(int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void display(double[][] matrix) {
        for(double[] row : matrix) {
            for(double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }

    // === Main method ===
    public static void main(String[] args) {
        int size = 3; // Change to 2 for 2x2 matrix
        int[][] matrix = createRandomMatrix(size, size);

        System.out.println("Original Matrix:");
        display(matrix);

        int[][] transposed = transpose(matrix);
        System.out.println("\nTranspose:");
        display(transposed);

        if(size == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant: " + det);
            try {
                double[][] inverse = inverse2x2(matrix);
                System.out.println("\nInverse:");
                display(inverse);
            } catch(Exception e) {
                System.out.println("Inverse Error: " + e.getMessage());
            }
        }

        if(size == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant: " + det);
            try {
                double[][] inverse = inverse3x3(matrix);
                System.out.println("\nInverse:");
                display(inverse);
            } catch(Exception e) {
                System.out.println("Inverse Error: " + e.getMessage());
            }
        }
    }
}
