import java.util.Scanner;

public class NumberChecker {

    // Method to check whether the number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check whether the number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // returns 1 if number1 > number2
    // returns 0 if equal
    // returns -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = new int[5];

            // Input numbers
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Check positive/negative and even/odd
            System.out.println("\n--- Number Analysis ---");
            for (int num : numbers) {
                if (isPositive(num)) {
                    if (isEven(num)) {
                        System.out.println(num + " is Positive and Even");
                    } else {
                        System.out.println(num + " is Positive and Odd");
                    }
                } else {
                    System.out.println(num + " is Negative");
                }
            }

            // Compare first and last element using rule switch
            System.out.println("\n--- First vs Last Element ---");
            int result = compare(numbers[0], numbers[numbers.length - 1]);

            String message = switch (result) {
                case 0 -> "First element " + numbers[0] +
                          " is equal to last element " + numbers[numbers.length - 1];
                case 1 -> "First element " + numbers[0] +
                          " is greater than last element " + numbers[numbers.length - 1];
                case -1 -> "First element " + numbers[0] +
                           " is less than last element " + numbers[numbers.length - 1];
                default -> "Unexpected comparison result!";
            };

            System.out.println(message);
        }
    }
}

