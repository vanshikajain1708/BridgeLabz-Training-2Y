import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 
             + 0.6215 * temperature 
             + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.print("Enter temperature in Fahrenheit: ");
            double temperature = sc.nextDouble();

            System.out.print("Enter wind speed in miles per hour: ");
            double windSpeed = sc.nextDouble();

            // Validation (formula is valid only for T <= 50 and V >= 3)
            if (temperature > 50 || windSpeed < 3) {
                System.out.println("Formula not valid for temperature > 50°F or wind speed < 3 mph.");
                return;
            }

            // Calculate wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Output
            System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);
        }
    }
}
