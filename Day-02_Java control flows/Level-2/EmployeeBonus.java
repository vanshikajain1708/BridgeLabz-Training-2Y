import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // try-with-resources so Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {
            
            // Input salary
            System.out.print("Enter your salary: ");
            double salary = sc.nextDouble();

            // Input years of service
            System.out.print("Enter your years of service: ");
            int yearsOfService = sc.nextInt();

            // Check eligibility and calculate bonus
            if (yearsOfService > 5) {
                double bonus = salary * 0.05;  // 5% bonus
                System.out.println("Congratulations! Your bonus is: " + bonus);
            } else {
                System.out.println("No bonus, years of service is less than or equal to 5.");
            }
        }
    }
}
