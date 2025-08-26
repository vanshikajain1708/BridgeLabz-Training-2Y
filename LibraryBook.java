import java.util.Scanner;

public class LibraryBook {

    // Method to display book information
    static void displayBookInfo(String title, String author, String id, boolean isAvailable) {
        System.out.println("===== BOOK INFO =====");
        System.out.println("Title: " + title.toUpperCase());
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + id.toUpperCase());
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Author Name Length: " + author.length());
        compareAuthorNames(author, "Shakespeare");
    }

    // Method to compare two author names
    static void compareAuthorNames(String a1, String a2) {
        if (a1.equals(a2)) {
            System.out.println("Comparing with '" + a2 + "' → Same author");
        } else {
            System.out.println("Comparing with '" + a2 + "' → Different authors");
        }
    }

    // Method to calculate average rating
    static double calculateAverageRating(int[] ratings) {
        if (ratings.length == 0) return 0;
        double sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return sum / ratings.length;
    }

    // Method to calculate total ratings
    static int calculateTotalRatings(int[] ratings) {
        return ratings.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input book info
        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Book ID: ");
        String bookId = sc.nextLine();

        System.out.print("Is book available? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Input ratings
        System.out.print("Enter number of ratings: ");
        int numRatings = sc.nextInt();

        if (numRatings == 0) {
            System.out.println("No ratings available!");
            return; // Stop program
        }

        int[] bookRatings = new int[numRatings];
        for (int i = 0; i < numRatings; i++) {
            System.out.print("Enter rating " + (i + 1) + ": ");
            bookRatings[i] = sc.nextInt();
        }

        // Display book info
        displayBookInfo(bookTitle, authorName, bookId, isAvailable);

        // Display ratings
        System.out.println("===== RATINGS =====");
        for (int i = 0; i < bookRatings.length; i++) {
            System.out.println("Rating " + (i + 1) + " → " + bookRatings[i]);
            if (bookRatings[i] == 1) {
                System.out.println("One user gave a poor rating!");
            }
        }

        // Calculate and display total & average
        int total = calculateTotalRatings(bookRatings);
        double average = calculateAverageRating(bookRatings);
        System.out.println("Total Ratings: " + total);
        System.out.println("Average Rating: " + average);

        // Determine book status
        if (average >= 4) {
            System.out.println("Book Status: Highly Rated Book!");
        } else {
            System.out.println("Book Status: Average Book");
        }

        sc.close();
    }
}