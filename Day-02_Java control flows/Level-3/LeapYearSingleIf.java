import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input year
            System.out.print("Enter a year (>= 1582): ");
            int year = sc.nextInt();

            // Single if statement using logical AND (&&) and OR (||)
            if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                System.out.println(year + " is a Leap Year");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year");
            } else {
                System.out.println("Year must be 1582 or later (Gregorian calendar).");
            }
        }
    }
}
