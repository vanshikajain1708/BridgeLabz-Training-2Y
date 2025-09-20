// MobilePhone class
class MobilePhone {
    // Attributes
    private final String brand;
    private final String model;
    private final double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("---------------------------");
    }
}

// Main class
public class MobilePhoneDetails {
    public static void main(String[] args) {
        // Creating MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999.0);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 69999.0);
        MobilePhone phone3 = new MobilePhone("OnePlus", "11R", 39999.0);

        // Display details of each phone
        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}

