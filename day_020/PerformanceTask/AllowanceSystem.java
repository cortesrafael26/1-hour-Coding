package com.mycompany.allowancecalculator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Cortes, Rafael Louise D. | CS201A
 */
public class AllowanceSystem implements BasicAllowance, SemesterAllowance { // Multiple Interfaces
    private double dailyAllowance;
    
    public AllowanceSystem(double dailyAllowance) { // Constructor; Sets the amount of daily allowance.
        this.dailyAllowance = dailyAllowance;
    }
    
    @Override
    public double getDailyAllowance() {
        return dailyAllowance;
    }
    
    @Override
    public double computeSemesterAllowance(double dailyAllowance) { // Computes allowance for ONE (1) semester.
        return dailyAllowance * daysPerWeek * weeksPerSemester;
    }
    
    // VERSION 1: Allowance Until April 30
    public void computeUntilApril() {
        LocalDate today = LocalDate.now(); // Today
        LocalDate endOfApril = LocalDate.of(today.getYear(), 4, 30); // Last day of April
        long daysRemaining = ChronoUnit.DAYS.between(today, endOfApril) + 1;
        double totalAllowance = dailyAllowance * daysRemaining;
        
        // Print Details
        System.out.printf("%n****** ALLOWANCE TRACKER UNTIL END OF APRIL ******%n");
        System.out.printf("%nDaily Allowance: PHP%.2f%n", dailyAllowance);
        System.out.printf("Days Remaining: %d%n", daysRemaining);
        System.out.printf("Total Allowance: PHP%.2f%n", totalAllowance);
    }
    
    // VERSION 2: Allowance Tracker for Six (6) Semesters
    public void computeSixSemesters() {
        double currentAllowance = dailyAllowance;
        double overallTotal = 0.0;
        
        System.out.printf("%n****** ALLOWANCE TRACKER FOR SIX (6) SEMESTERS ******%n");
        
        for (int semester = 1; semester <= 6; semester++) {
            // Applies the 3% increase every two (2) semesters
            if (semester > 1 && (semester - 1) % 2 == 0) { // Determines whether two (2) semesters have already passed.
                currentAllowance *= 1.03;
            }
            
            double semesterTotal = computeSemesterAllowance(currentAllowance);
            overallTotal += semesterTotal;
            
            // Print Details
            System.out.printf("%nSEMESTER #%d%n", semester);
            System.out.printf("Daily Allowance: PHP%.2f%n", currentAllowance);
            System.out.printf("Semester Total: PHP%.2f%n", semesterTotal);
            
        }
        
        System.out.printf("%nOverall Total: PHP%.2f%n", overallTotal);
    }
}
