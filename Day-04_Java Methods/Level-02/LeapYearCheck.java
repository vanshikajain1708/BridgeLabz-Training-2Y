import java.util.Scanner;

public class LeapYearCheck {

    // Method to check if a year is leap year
    public static boolean isLeapYear(int year) {
        // Leap year if divisible by 4 and not by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from user
            System.out.print("Enter a year (>= 1582): ");
            int year = sc.nextInt();

            // Validate Gregorian calendar year
            if (year < 1582) {
                System.out.println("The program works only for years >= 1582 (Gregorian calendar).");
                return;
            }

            // Check and display result
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
    }
}

