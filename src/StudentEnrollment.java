import java.util.Scanner;

public class StudentEnrollment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();

        // Input and validate number of units
        int numberOfUnits = getValidUnits(scanner);

        // Compute enrollment fee
        int feePerUnit = 1000;
        int totalFee = numberOfUnits * feePerUnit;

        // Output student information and total fee
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Program: " + course);
        System.out.println("Total Enrollment Fee: " + totalFee + " Pesos");

        // Payment process
        System.out.print("Enter payment amount: ");
        int payment = scanner.nextInt();

        if (payment == totalFee) {
            System.out.println("Payment Status: Fully Paid");
        } else if (payment < totalFee) {
            System.out.println("Payment Status: Partial Payment");
            System.out.println("Amount Paid: " + payment + " Pesos");
        } else {
            System.out.println("Payment Status: Overpaid");
            System.out.println("Amount Paid: " + payment + " Pesos");
        }

        scanner.close();
    }

    // Method to validate the number of units
    public static int getValidUnits(Scanner scanner) {
        int units;
        while (true) {
            System.out.print("Enter number of units (Maximum 10): ");
            units = scanner.nextInt();
            if (units > 0 && units <= 10) {
                break;
            } else {
                System.out.println("Invalid number of units. Please enter a value between 1 and 10.");
            }
        }
        return units;
    }
}