public class UnitConvertor {

    // --- Length conversion constants ---
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    // --- Weight conversion constants ---
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;

    // --- Volume conversion constants ---
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    // --- Length conversion methods ---
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    // --- Temperature conversion methods ---
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // --- Weight conversion methods ---
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // --- Volume conversion methods ---
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    // --- Optional test method ---
    public static void main(String[] args) {
        // Length
        System.out.println("5 km = " + convertKmToMiles(5) + " miles");
        System.out.println("3 miles = " + convertMilesToKm(3) + " km");
        System.out.println("10 meters = " + convertMetersToFeet(10) + " feet");
        System.out.println("32 feet = " + convertFeetToMeters(32) + " meters");
        System.out.println("5 yards = " + convertYardsToFeet(5) + " feet");
        System.out.println("15 feet = " + convertFeetToYards(15) + " yards");
        System.out.println("2 meters = " + convertMetersToInches(2) + " inches");
        System.out.println("50 inches = " + convertInchesToMeters(50) + " meters");
        System.out.println("10 inches = " + convertInchesToCm(10) + " cm");

        // Temperature
        System.out.println("100°F = " + convertFahrenheitToCelsius(100) + "°C");
        System.out.println("0°C = " + convertCelsiusToFahrenheit(0) + "°F");

        // Weight
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
        System.out.println("70 kg = " + convertKilogramsToPounds(70) + " pounds");

        // Volume
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("5 liters = " + convertLitersToGallons(5) + " gallons");
    }
}

