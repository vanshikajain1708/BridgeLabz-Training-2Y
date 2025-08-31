import java.util.Arrays;
import java.util.Scanner; // import Arrays class

public class FactorsArray {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a number to find its factors: ");
            int number = sc.nextInt();

            int maxFactor = 10;
            int[] factors = new int[maxFactor];
            int index = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    
                    // Resize array if needed
                    if (index == maxFactor) {
                        maxFactor *= 2; 
                        factors = Arrays.copyOf(factors, maxFactor); // copy old elements to new array
                    }

                    factors[index] = i;
                    index++;
                }
            }

            System.out.print("\nFactors of " + number + " are: ");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }
        }
    }
}