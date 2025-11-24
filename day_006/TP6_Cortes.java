package day6;

/** 
 * @author Cortes, Rafael Louise D. | CS101A
 */

import java.util.Scanner;

public class TP6_Cortes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // PROGRAM #1: POSITIVE OR NEGATIVE
        System.out.println("PROGRAM #1: POSITIVE OR NEGATIVE");
        System.out.println("Instructions: Enter a number to find out if it is positive or negative.");
        System.out.print("Number: ");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.println("The number is POSITIVE.\n");
        } else if (num < 0) {
            System.out.println("The number is NEGATIVE.\n");
        } else { // when the user enters the number zero (0)
            System.out.println("The number is NEITHER positive or negative.\n"); 
        }
        
        // PROGRAM #2: DISPLAY THE MONTH
        System.out.println("PROGRAM #2: DISPLAY THE MONTH");
        System.out.println("Instructions: Enter a number between 1 and 12 to see the corresponding month.");
        System.out.print("Number: ");
        int monthNumber = scanner.nextInt();
        String monthName;
        
        switch (monthNumber) {
            case 1:
                monthName = "JANUARY";
                break;
            case 2:
                monthName = "FEBRUARY";
                break;
            case 3:
                monthName = "MARCH";
                break;
            case 4:
                monthName = "APRIL";
                break;
            case 5:
                monthName = "MAY";
                break;
            case 6:
                monthName = "JUNE";
                break;
            case 7:
                monthName = "JULY";
                break;
            case 8:
                monthName = "AUGUST";
                break;
            case 9:
                monthName = "SEPTEMBER";
                break;
            case 10:
                monthName = "OCTOBER";
                break;
            case 11:
                monthName = "NOVEMBER";
                break;
            case 12:
                monthName = "DECEMBER";
                break;
            default:
                monthName = "Invalid input! Please enter a number from 1 to 12.";
                break;
        }
        System.out.println("Month: " + monthName + "\n");
        
        // PROGRAM #3: PRODUCT AND AVERAGE
        System.out.println("PROGRAM #3: PRODUCT AND AVERAGE");
        System.out.println("Instructions: Enter five numbers to calculate their product and average.");
        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();
        System.out.print("Number 4: ");
        double num4 = scanner.nextDouble();
        System.out.print("Number 5: ");
        double num5 = scanner.nextDouble();
        
        double product = num1 * num2 * num3 * num4 * num5;
        double average = (num1 + num2 + num3 + num4 + num5) / 5;
        
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        
        scanner.close();
    }
}
