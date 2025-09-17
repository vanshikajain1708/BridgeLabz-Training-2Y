import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to calculate sum of n natural numbers using loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from user
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();

            // Call method
            int sum = sumOfNaturalNumbers(n);

            // Output
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }
    }
}

