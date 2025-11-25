import java.util.*;
public class P8 {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        System.out.println("F to C = " + toCelsius(f));
        double c = sc.nextDouble();
        System.out.println("C to F = " + toFahrenheit(c));
    }
}