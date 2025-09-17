public class EmployeeBonusCalculator {

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][5]; 
        // [EmpID, Old Salary, Years, New Salary, Bonus]

        for (int i = 0; i < data.length; i++) {
            int empId = i + 1;
            double oldSalary = data[i][0];
            int years = data[i][1];

            double bonus;
            if (years > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            // Save in 2D array
            result[i][0] = empId;
            result[i][1] = oldSalary;
            result[i][2] = years;
            result[i][3] = newSalary;
            result[i][4] = bonus;
        }
        return result;
    }

    // Method to calculate totals and display table
    public static void calculateTotals(double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        // Print header
        System.out.printf("%-8s %-12s %-8s %-12s %-12s%n",
                "EmpID", "Old Salary", "Years", "New Salary", "Bonus");
        System.out.println("------------------------------------------------------------");

        // Enhanced for loop
        for (double[] emp : result) {
            System.out.printf("%-8.0f %-12.2f %-8.0f %-12.2f %-12.2f%n",
                    emp[0], emp[1], emp[2], emp[3], emp[4]);

            totalOld += emp[1];
            totalNew += emp[3];
            totalBonus += emp[4];
        }

        // Print totals
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-8s %-12.2f %-8s %-12.2f %-12.2f%n",
                "Total", totalOld, "", totalNew, totalBonus);
    }

    // Main method
    public static void main(String[] args) {
        int employees = 10;
        int[][] data = new int[employees][2]; // [salary, years]

        // Generate random salaries and years
        for (int i = 0; i < employees; i++) {
            int salary = (int) (Math.random() * 90000 + 10000); // 5-digit salary
            int years = (int) (Math.random() * 15 + 1); // 1–15 years of service
            data[i][0] = salary;
            data[i][1] = years;
        }

        // Calculate and display results
        double[][] result = calculateBonus(data);
        calculateTotals(result);
    }
}
