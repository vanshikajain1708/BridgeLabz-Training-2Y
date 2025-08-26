import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for three numbers
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

            System.out.print("Enter the third number: ");
            int number3 = input.nextInt();

            // Check which number is the largest
            boolean isFirstLargest = (number1 > number2) && (number1 > number3);
            boolean isSecondLargest = (number2 > number1) && (number2 > number3);
            boolean isThirdLargest = (number3 > number1) && (number3 > number2);

            // Output
            System.out.println("Is the first number the largest? " + isFirstLargest);
            System.out.println("Is the second number the largest? " + isSecondLargest);
            System.out.println("Is the third number the largest? " + isThirdLargest);
        }
    }
}
