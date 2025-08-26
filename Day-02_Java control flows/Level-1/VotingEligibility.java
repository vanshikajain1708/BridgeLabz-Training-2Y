import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for age
            System.out.print("Enter the person's age: ");
            int age = input.nextInt();

            // Check voting eligibility
            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }
        }
    }
}
