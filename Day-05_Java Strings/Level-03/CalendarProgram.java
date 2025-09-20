import java.util.Scanner;

public class CalendarProgram {

    // Array for month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array for number of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in leap year
        }
        return daysInMonth[month];
    }

    // Method to calculate first day of month using Gregorian calendar algorithm
    public static int getStartDay(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;
    }

    // Method to print calendar
    public static void printCalendar(int year, int month) {
        // Print heading
        System.out.println("     " + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get starting day and number of days
        int startDay = getStartDay(year, month);
        int numberOfDays = getNumberOfDaysInMonth(year, month);

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // try-with-resources for Scanner
        try (Scanner sc = new Scanner(System.in)) {
            // Input month and year
            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            // Print the calendar
            printCalendar(year, month);
        }
    }
}
