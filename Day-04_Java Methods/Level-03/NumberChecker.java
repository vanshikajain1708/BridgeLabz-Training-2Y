import java.util.*;

public class NumberChecker {

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

    // Method to check if number is a Duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) {
                return true; // A duck number contains zero (not leading zero)
            }
        }
        return false;
    }

    // Method to check if number is Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Method to find largest and second largest digits
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 153; // You can test with other numbers

        System.out.println("Number: " + number);

        // Count digits
        System.out.println("Digit count: " + countDigits(number));

        // Digits array
        int[] digits = getDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        // Armstrong number check
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        // Largest and 2nd largest
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second Largest digit: " + largestTwo[1]);

        // Smallest and 2nd smallest
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second Smallest digit: " + smallestTwo[1]);
    }
}
