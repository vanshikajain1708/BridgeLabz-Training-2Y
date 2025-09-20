class Student {
    // Attributes
    String name;
    int rollNumber;
    int marks;

    // Constructor to initialize student details
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close Scanner
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // Create Student object
            Student student = new Student(name, rollNumber, marks);

            // Display student report
            System.out.println("\n--- Student Report ---");
            student.displayDetails();
        } // Scanner is automatically closed here
    }
}
