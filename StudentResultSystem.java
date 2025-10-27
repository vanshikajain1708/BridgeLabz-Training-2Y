import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            int[] marks = new int[3];
            System.out.println("Enter marks of 3 subjects:");
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
            }
            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Student name cannot be null or empty!");
            }

            if (age < 18) {
                throw new InvalidAgeException("Student age must be at least 18!");
            }

            
            for (int m : marks) {
                if (m < 0 || m > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100!");
                }
            }

            
            double average = 0;
            try {
                average = (marks[0] + marks[1] + marks[2]) / 3.0;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero while calculating average!");
            }

            System.out.println("\nStudent Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Average Marks: " + average);
            System.out.println("\nAccessing 4th subject mark (intentional error): " + marks[3]);

        } 
        catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (InvalidMarksException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Attempted to access invalid array index!");
        } 
        catch (Exception e) {
            System.out.println("Unexpected Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("\nResult processing completed.");
            sc.close();
        }
    }
}