public class Testproduct {
    public static void main(String[] args) {
        // Create Product objects
        Product p1 = new Product("Laptop", 50000.0);
        Product p2 = new Product("Smartphone", 25000.0);

        // Display details of each product
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();

        // Display total products created
        Product.displayTotalProducts();
    }
}
