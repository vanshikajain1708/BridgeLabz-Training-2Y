import java.util.Scanner;

public class CalendarProgram {

    // Method to check if a year is leap
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to calculate first day of the month using Gregorian algorithm
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Main Method with try-with-resources
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // ✅ automatically closes Scanner

            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            String[] months = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};

            System.out.println("\n   " + months[month - 1] + " " + year);
            System.out.println("Su Mo Tu We Th Fr Sa");

            int daysInMonth = getDaysInMonth(month, year);
            int firstDay = getFirstDay(month, year);

            // Print spaces before the first day
            for (int i = 0; i < firstDay; i++) {
                System.out.print("   ");
            }

            // Print all days of the month
            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%2d ", day);
                if ((day + firstDay) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
