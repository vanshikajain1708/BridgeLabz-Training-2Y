import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();

            // Convert to Fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;

            // Output
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        }
    }
}
