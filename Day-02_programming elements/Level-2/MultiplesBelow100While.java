import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Input number
            System.out.print("Enter a positive integer less than 100: ");
            int number = sc.nextInt();

            // Validate input
            if (number <= 0 || number >= 100) {
                System.out.println("Please enter a positive integer less than 100.");
            } else {
                System.out.println("Multiples of " + number + " below 100 are:");

                int counter = 1; // start from 1

                // Loop while counter < 100
                while (counter < 100) {
                    if (counter % number == 0) {
                        System.out.println(counter);
                    }
                    counter++;
                }
            }
        }
    }
}