import java.util.Scanner;

public class NumberCheck {

    // Method to check number: returns 1 (positive), -1 (negative), 0 (zero)
    public static int checkNumber(int num) {
        return Integer.compare(num, 0);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input number
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Call method
            int result = checkNumber(num);

            // Modern rule switch (Java 14+)
            switch (result) {
                case 1 -> System.out.println("The number is Positive.");
                case -1 -> System.out.println("The number is Negative.");
                case 0 -> System.out.println("The number is Zero.");
                default -> System.out.println("Unexpected result.");
            }
        }
    }
}
