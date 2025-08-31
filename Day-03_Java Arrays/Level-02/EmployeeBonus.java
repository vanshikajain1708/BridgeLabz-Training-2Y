import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        
        final int NUM_EMPLOYEES = 10;

        double[] salary = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];

        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;

        try (Scanner sc = new Scanner(System.in)) {
            
            // Input salary and years of service with validation
            for (int i = 0; i < NUM_EMPLOYEES; i++) {
                System.out.println("Employee " + (i + 1) + ":");
                
                System.out.print("Enter salary: ");
                double sal = sc.nextDouble();
                if (sal <= 0) {
                    System.out.println("Invalid salary. Enter again.");
                    i--; // decrement to repeat this employee
                    continue;
                }

                System.out.print("Enter years of service: ");
                double years = sc.nextDouble();
                if (years < 0) {
                    System.out.println("Invalid years of service. Enter again.");
                    i--; // decrement to repeat this employee
                    continue;
                }

                salary[i] = sal;
                yearsOfService[i] = years;
            }

            // Calculate bonus and new salary
            for (int i = 0; i < NUM_EMPLOYEES; i++) {
                if (yearsOfService[i] > 5) {
                    bonus[i] = salary[i] * 0.05; // 5%
                } else {
                    bonus[i] = salary[i] * 0.02; // 2%
                }

                newSalary[i] = salary[i] + bonus[i];

                // Update totals
                totalOldSalary += salary[i];
                totalBonus += bonus[i];
                totalNewSalary += newSalary[i];
            }

            // Print results
            System.out.println("\nEmployee-wise bonus and new salary:");
            for (int i = 0; i < NUM_EMPLOYEES; i++) {
                System.out.println("Employee " + (i + 1) + 
                                   " | Old Salary: " + salary[i] + 
                                   " | Bonus: " + bonus[i] + 
                                   " | New Salary: " + newSalary[i]);
            }

            System.out.println("\nTotal Old Salary: " + totalOldSalary);
            System.out.println("Total Bonus Payout: " + totalBonus);
            System.out.println("Total New Salary: " + totalNewSalary);
        }
    }
}
 