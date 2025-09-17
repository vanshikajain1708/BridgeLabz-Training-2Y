import java.util.*;

public class NumberCheckr {

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

    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if number is a Palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if number is a Duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int i = 1; i < digits.length; i++) { 
            // start from index 1 to avoid leading zero
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 121; // test number, change as needed

        System.out.println("Number: " + number);

        // Count digits
        System.out.println("Digit count: " + countDigits(number));

        // Digits array
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Reverse array
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits: " + Arrays.toString(reversed));

        // Compare arrays
        System.out.println("Digits and Reversed equal? " + compareArrays(digits, reversed));

        // Palindrome check
        System.out.println("Is Palindrome? " + isPalindrome(number));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}

