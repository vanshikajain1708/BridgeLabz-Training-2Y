import java.util.*;
public class ECommerceSorting {
    static class Product {
        String name;
        double price;
        double rating;
        double discount;
        Product(String n, double p, double r, double d) {
            name = n;
            price = p;
            rating = r;
            discount = d;
        }
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Phone", 50000, 4.5, 10),
                new Product("Laptop", 80000, 4.8, 15),
                new Product("Watch", 15000, 4.2, 5)
        );

        System.out.println("Sort by Price:");
        products.sort((a, b) -> Double.compare(a.price, b.price));
        products.forEach(p -> System.out.println(p.name + " " + p.price));

        System.out.println("\nSort by Rating:");
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        products.forEach(p -> System.out.println(p.name + " " + p.rating));

        System.out.println("\nSort by Discount:");
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        products.forEach(p -> System.out.println(p.name + " " + p.discount));
    }
}
