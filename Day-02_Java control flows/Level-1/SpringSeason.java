public class SpringSeason {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide month and day as command-line arguments.");
            return;
        }

        // Parse command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls in Spring Season
        boolean isSpring = false;

        if ((month == 3 && day >= 20 && day <= 31) || 
            (month == 4 && day >= 1 && day <= 30) || 
            (month == 5 && day >= 1 && day <= 31) || 
            (month == 6 && day >= 1 && day <= 20)) {
            isSpring = true;
        }

        // Output
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}