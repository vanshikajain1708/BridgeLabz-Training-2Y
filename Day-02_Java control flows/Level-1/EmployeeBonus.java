import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for salary
            System.out.print("Enter the employee's salary: ");
            double salary = input.nextDouble();

            // Take input for years of service
            System.out.print("Enter the employee's years of service: ");
            int yearsOfService = input.nextInt();

            double bonus = 0.0;

            // Calculate bonus if years of service is more than 5
            if (yearsOfService > 5) {
                bonus = 0.05 * salary;
            }

            // Output the bonus amount
            System.out.println("The bonus amount for the employee is: INR " + bonus);
        }
    }
}
