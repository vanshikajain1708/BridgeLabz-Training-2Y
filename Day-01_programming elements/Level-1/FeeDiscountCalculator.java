import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for fee
            System.out.print("Enter the course fee (INR): ");
            double fee = input.nextDouble();

            // Take user input for discount percent
            System.out.print("Enter the discount percentage: ");
            double discountPercent = input.nextDouble();

            // Calculate discount amount
            double discount = (fee * discountPercent) / 100.0;

            // Calculate final fee after discount
            double finalFee = fee - discount;

            // Output
            System.out.println("The discount amount is INR " + discount +
                               " and final discounted fee is INR " + finalFee);
        } // Scanner automatically closed here
    }
}