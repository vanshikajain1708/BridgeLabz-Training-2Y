import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Take input
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check for positive integer
            if (number <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                System.out.println("Factors of " + number + " are:");
                
                int i = 1; // counter variable
                while (i <= number) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                    i++; // increment counter
                }
            }
        }
    }
}