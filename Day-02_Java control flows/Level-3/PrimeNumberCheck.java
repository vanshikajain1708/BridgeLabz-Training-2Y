import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        boolean isPrime = true; // Assume the number is prime initially
        
        if (number <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            // Loop from 2 to number-1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, not prime
                    break;
                }
            }
        }
        
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close();
    }
}