import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Take input
            System.out.print("Enter a natural number: ");
            int number = sc.nextInt();

            // Check for natural number (positive integer)
            if (number <= 0) {
                System.out.println("Please enter a natural number greater than 0.");
            } else {
                // Loop from 1 to the entered number
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is even");
                    } else {
                        System.out.println(i + " is odd");
                    }
                }
            }
        }
    }
}
