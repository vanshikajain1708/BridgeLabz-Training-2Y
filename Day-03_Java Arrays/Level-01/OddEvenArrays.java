import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            // Input from user
            System.out.print("Enter a natural number: ");
            int number = sc.nextInt();

            // Validate input
            if (number <= 0) {
                System.out.println("Error: Please enter a natural number (greater than 0).");
                return; // exit program
            }

            // Arrays for odd and even numbers
            int[] odd = new int[number / 2 + 1];
            int[] even = new int[number / 2 + 1];

            int oddIndex = 0, evenIndex = 0;

            // Loop through 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex] = i;
                    evenIndex++;
                } else {
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }

            // Print odd numbers
            System.out.print("\nOdd numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }

            // Print even numbers
            System.out.print("\nEven numbers: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
        }
    }
}
