import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for countdown start
            System.out.print("Enter the starting number for countdown: ");
            int counter = input.nextInt();

            System.out.println("Countdown for Rocket Launch:");

            // While loop to count down to 1
            while (counter >= 1) {
                System.out.println(counter);
                counter--; // Decrement the counter
            }

            System.out.println("Launch!");
        }
    }
}
