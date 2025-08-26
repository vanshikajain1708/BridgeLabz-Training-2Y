import java.util.Scanner;

public class RocketLaunchCountdownFor {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for countdown start
            System.out.print("Enter the starting number for countdown: ");
            int start = input.nextInt();

            System.out.println("Countdown for Rocket Launch:");

            // For-loop to count down from start to 1
            for (int counter = start; counter >= 1; counter--) {
                System.out.println(counter);
            }

            System.out.println("Launch!");
        }
    }
}
