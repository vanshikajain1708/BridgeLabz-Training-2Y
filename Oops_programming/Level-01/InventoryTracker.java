// Item class
class Item {
    // Attributes
    private final int itemCode;
    private final String itemName;
    private final double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

// Main class
public class InventoryTracker {
    public static void main(String[] args) {
        // Create item objects
        Item item1 = new Item(101, "Laptop", 55000.0);
        Item item2 = new Item(102, "Headphones", 2000.0);

        // Display details
        item1.displayItemDetails();
        System.out.println("Total cost for 2 units: " + item1.calculateTotalCost(2));
        System.out.println("---------------------------");

        item2.displayItemDetails();
        System.out.println("Total cost for 5 units: " + item2.calculateTotalCost(5));
    }
}

