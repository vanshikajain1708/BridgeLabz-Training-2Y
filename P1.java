import java.util.*;
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        while (true) {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            String feedback = sc.next();
            if (feedback.equals("correct")) {
                System.out.println("Yay! The computer guessed it.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}