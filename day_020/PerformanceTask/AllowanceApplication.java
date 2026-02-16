package com.mycompany.allowancecalculator;

import java.util.Scanner;

/**
 *
 * @author Cortes, Rafael Louise D. | CS201A
 */
public class AllowanceApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n****** WELCOME TO THE ALLOWANCE CALCULATOR! ******");
        System.out.print("Enter your daily allowance (PHP): ");
        double dailyAllowance = scanner.nextDouble();
        
        AllowanceSystem allowanceSystem = new AllowanceSystem(dailyAllowance);
        
        // Version 1
        allowanceSystem.computeUntilApril();
        
        // Version 2
        allowanceSystem.computeSixSemesters();
        
        scanner.close();
    }
}
