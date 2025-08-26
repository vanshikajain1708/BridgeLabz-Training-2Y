import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for the number
            System.out.print("Enter a number to print its multiplication table: ");
            int number = input.nextInt();

            System.out.println("Multiplication table of " + number + " from 6 to 9:");

            // Loop from 6 to 9
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}
