import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            
            int temp = number;
            int count = 0;
            
            // Count number of digits
            while (temp != 0) {
                temp /= 10;
                count++;
            }

            int[] digits = new int[count];
            temp = number;
            
            // Store digits in array
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10;
                temp /= 10;
            }

            // Display digits in reverse order (which is original number reversed)
            System.out.print("Reversed number digits: ");
            for (int i = 0; i < count; i++) {
                System.out.print(digits[i]);
            }
        }
    }
}
