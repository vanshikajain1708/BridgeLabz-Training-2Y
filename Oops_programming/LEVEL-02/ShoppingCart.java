import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CartItem {
    private final String itemName;
    private final double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void addQuantity(int qty) {
        this.quantity += qty;
    }

    public void setQuantity(int qty) {
        this.quantity = qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " | Price: ₹" + price + " | Quantity: " + quantity + " | Total: ₹" + getTotalPrice());
    }
}

public class ShoppingCart {
    private final List<CartItem> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    // Add item to the cart
    public void addItem(String name, double price, int quantity) {
        for (CartItem item : cart) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                item.addQuantity(quantity);
                System.out.println("Updated quantity for " + name);
                return;
            }
        }
        cart.add(new CartItem(name, price, quantity));
        System.out.println("Added " + name + " to cart.");
    }

    // Remove item from the cart
    public void removeItem(String name) {
        Iterator<CartItem> iterator = cart.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getItemName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Removed " + name + " from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    // Display total cost
    public void displayTotalCost() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final ShoppingCart shoppingCart = new ShoppingCart();
            int choice;
            do {
                System.out.println("\n--- Shopping Cart Menu ---");
                System.out.println("1. Add Item");
                System.out.println("2. Remove Item");
                System.out.println("3. Display Total Cost");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Item Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Price: ₹");
                        double price = sc.nextDouble();
                        System.out.print("Enter Quantity: ");
                        int quantity = sc.nextInt();
                        shoppingCart.addItem(name, price, quantity);
                    }
                    case 2 -> {
                        System.out.print("Enter Item Name to Remove: ");
                        String name = sc.nextLine();
                        shoppingCart.removeItem(name);
                    }
                    case 3 -> shoppingCart.displayTotalCost();
                    case 4 -> System.out.println("Exiting shopping cart. Thank you!");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } while (choice != 4);
        }
    }
}

