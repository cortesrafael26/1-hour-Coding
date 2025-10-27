package day8;

/**
 * @author Cortes, Rafael Louise D. | CS101A
 */

import java.util.Scanner;

public class GeneralAverage_Cortes {
    public static void main(String[] args) {
        // Create a program that will display the overall AVERAGE GRADE
        Scanner scanner = new Scanner(System.in);

        // Variable Declarations
        String studentName;
        String subject;
        double totalPercent = 0;
        double generalAverage = 0;

        // Array Declarations and Initialization
        String[] periods = {"PRELIMS", "MIDTERMS", "PREFINALS", "FINALS"};
        double[] percentages = new double[periods.length];
        double[] grades = new double[periods.length];

        // Start of Program
        System.out.println("Welcome to the General Average Calculator!");
        System.out.print("Enter your full name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter the subject: ");
        subject = scanner.nextLine();

        // For Loop
        for (int i = 0; i < periods.length; i++) {
            System.out.println("\n" + periods[i]);

            // Percentages
            while (true) {
                System.out.print("Enter the percentage (%): ");
                percentages[i] = scanner.nextDouble();
                if (percentages[i] < 0 || percentages[i] > 100) { // Data validation
                    System.out.println("ERROR: Invalid input. Please try again.");
                } else {
                    percentages[i] /= 100; // Converts to decimal form
                    totalPercent += percentages[i];
                    break; // Exits if the input is valid
                }
            }

            // Grades
            while (true) {
                System.out.print("Enter your grade: ");
                grades[i] = scanner.nextDouble();
                if (grades[i] < 0 || grades[i] > 100) { // Data validation
                    System.out.println("ERROR: Invalid input. Please try again.");
                } else {
                    grades[i] *= percentages[i];
                    generalAverage += grades[i];
                    break; // Exits if the input is valid
                }
            }
        }

        if (totalPercent != 1.0) { // Checks if the total percentage is 100%
            System.out.println("\nERROR: The total percentage of grades does not add up to 100%.");
        } else {
            // Final Output
            System.out.printf("%n   STUDENT NAME:  %s", studentName);
            System.out.printf("%n        SUBJECT:  %s", subject);
            System.out.printf("%nGENERAL AVERAGE:  %.2f", generalAverage);
        }

        scanner.close();
    }
}
