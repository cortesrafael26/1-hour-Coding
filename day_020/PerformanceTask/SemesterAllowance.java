package com.mycompany.allowancecalculator;

/**
 *
 * @author Cortes, Rafael Louise D. | CS201A
 */
public interface SemesterAllowance {
    int weeksPerSemester = 18;
    int daysPerWeek = 5;
    
    double computeSemesterAllowance(double dailyAllowance);
}
