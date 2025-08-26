import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Input ages
            System.out.print("Enter Amar's age: ");
            int ageAmar = sc.nextInt();
            System.out.print("Enter Akbar's age: ");
            int ageAkbar = sc.nextInt();
            System.out.print("Enter Anthony's age: ");
            int ageAnthony = sc.nextInt();

            // Input heights
            System.out.print("Enter Amar's height (in cm): ");
            int heightAmar = sc.nextInt();
            System.out.print("Enter Akbar's height (in cm): ");
            int heightAkbar = sc.nextInt();
            System.out.print("Enter Anthony's height (in cm): ");
            int heightAnthony = sc.nextInt();

            // Find youngest friend
            if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
                System.out.println("Youngest friend is Amar with age " + ageAmar);
            } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
                System.out.println("Youngest friend is Akbar with age " + ageAkbar);
            } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
                System.out.println("Youngest friend is Anthony with age " + ageAnthony);
            } else {
                System.out.println("Two or more friends have the same youngest age.");
            }

            // Find tallest friend
            if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
                System.out.println("Tallest friend is Amar with height " + heightAmar + " cm");
            } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
                System.out.println("Tallest friend is Akbar with height " + heightAkbar + " cm");
            } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
                System.out.println("Tallest friend is Anthony with height " + heightAnthony + " cm");
            } else {
                System.out.println("Two or more friends have the same tallest height.");
            }
        }
    }
}

