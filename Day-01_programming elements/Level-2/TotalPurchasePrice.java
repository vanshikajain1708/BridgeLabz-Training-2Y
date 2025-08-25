import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for unit price
            System.out.print("Enter the unit price of the item (INR): ");
            double unitPrice = input.nextDouble();

            // Take user input for quantity
            System.out.print("Enter the quantity to be bought: ");
            int quantity = input.nextInt();

            // Calculate total price
            double totalPrice = unitPrice * quantity;

            // Output
            System.out.println("The total purchase price is INR " + totalPrice +
                               " if the quantity " + quantity +
                               " and unit price is INR " + unitPrice);
        }
    }
}
