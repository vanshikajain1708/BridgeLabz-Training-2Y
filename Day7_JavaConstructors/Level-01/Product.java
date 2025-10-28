public class Product {
    // Class variable (shared by all instances)
    private static int totalProducts = 0;

    // Instance variables
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method: display the details of this product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method: show the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    // Optional: getters and setters if needed
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
