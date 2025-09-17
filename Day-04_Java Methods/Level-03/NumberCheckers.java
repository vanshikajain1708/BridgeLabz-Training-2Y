import java.util.*;

public class NumberCheckers {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of the number in an array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10]; // Digits 0-9
        for (int d : digits) {
            freq[d]++;
        }

        // Count how many unique digits are present
        int uniqueCount = 0;
        for (int f : freq) {
            if (f > 0) uniqueCount++;
        }

        // Store in 2D array [digit, frequency]
        int[][] result = new int[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[idx][0] = i;
                result[idx][1] = freq[i];
                idx++;
            }
        }
        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        int number = 221; // Test number, change as needed

        System.out.println("Number: " + number);

        // Count digits
        System.out.println("Digit count: " + countDigits(number));

        // Digits array
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits));

        // Sum of squares
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));

        // Harshad check
        System.out.println("Is Harshad Number? " + isHarshad(number));

        // Digit frequency
        System.out.println("Digit frequencies (digit : count):");
        int[][] freq = digitFrequency(digits);
        for (int[] row : freq) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}

