import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int number = input.nextInt();

            // Check if the number is a natural number
            if (number <= 0) {
                System.out.println("The number " + number + " is not a natural number.");
                return;
            }

            System.out.println("Odd and Even numbers from 1 to " + number + ":");

            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
    }
}
