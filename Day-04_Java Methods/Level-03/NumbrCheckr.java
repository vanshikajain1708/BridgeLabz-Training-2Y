
public class NumbrCheckr {

    // Method to find sum of proper divisors
    private static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor (for num > 1)
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return num == 1 ? 0 : sum; // special case for 1
    }

    // Method to check Perfect number
    public static boolean isPerfect(int num) {
        return sumOfDivisors(num) == num && num > 1;
    }

    // Method to check Abundant number
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num;
    }

    // Method to check Deficient number
    public static boolean isDeficient(int num) {
        return sumOfDivisors(num) < num;
    }

    // Helper method: factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check Strong number
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Main method for testing
    public static void main(String[] args) {
        int number = 28; // test number, change as needed

        System.out.println("Number: " + number);
        System.out.println("Is Perfect? " + isPerfect(number));
        System.out.println("Is Abundant? " + isAbundant(number));
        System.out.println("Is Deficient? " + isDeficient(number));
        System.out.println("Is Strong? " + isStrong(number));
    }
}
