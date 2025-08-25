import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for a, b, and c
            System.out.print("Enter value for a: ");
            int a = input.nextInt();

            System.out.print("Enter value for b: ");
            int b = input.nextInt();

            System.out.print("Enter value for c: ");
            int c = input.nextInt();

            // Perform integer operations
            int op1 = a + b * c;   // Multiplication has higher precedence than addition
            int op2 = a * b + c;   // Multiplication first, then addition
            int op3 = c + a / b;   // Division first, then addition
            int op4 = a % b + c;   // Modulus first, then addition

            // Output results
            System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        }
    }
}
