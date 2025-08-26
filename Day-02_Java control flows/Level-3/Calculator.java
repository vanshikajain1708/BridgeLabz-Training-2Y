import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            // Step 1: Input two numbers
            System.out.print("Enter first number: ");
            double first = sc.nextDouble();

            System.out.print("Enter second number: ");
            double second = sc.nextDouble();

            // Step 2: Input operator
            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.next();

            // Step 3: Rule switch expression
            double result = switch (op) {
                case "+" -> first + second;
                case "-" -> first - second;
                case "*" -> first * second;
                case "/" -> {
                    if (second != 0) {
                        yield first / second; // yield instead of return
                    } else {
                        System.out.println("Error: Division by zero not allowed.");
                        yield Double.NaN; // return special value
                    }
                }
                default -> {
                    System.out.println("Invalid Operator! Use +, -, *, or /.");
                    yield Double.NaN;
                }
            };

            // Step 4: Display result if valid
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        }
    }
}