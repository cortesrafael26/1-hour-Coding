package day10;

/**
 *
 * @author Cortes, Rafael Louise D. | CS101A
 */

import java.util.Scanner;

public class PT7_Cortes {
    public static void main(String[] args) {
        // Create a program that will generate a multiplication table

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Cortes' Multiplication Table Generator!");

        while (true) {                                                                          // Repetition
            System.out.print("Enter the starting number: ");
            int startingNumber = scanner.nextInt();                                             // Primitive Data Types, Variables, Input
            System.out.print("Enter the ending number: ");
            int endingNumber = scanner.nextInt();                                               // Primitive Data Types, Variables, Input


            if (startingNumber < endingNumber) {                                                // Selection
                int size = endingNumber - startingNumber + 1;                                   // Primitive Data Types, Variables
                int[][] arr = new int[size][size];                                              // Array

                System.out.println();
                for (int i = startingNumber; i <= endingNumber; i++) {                          // Repetition
                    for (int j = startingNumber; j <= endingNumber; j++) {                      // Repetition
                        arr[i - startingNumber][j - startingNumber] = i * j;                    // Operators, Expressions
                        System.out.print(arr[i - startingNumber][j - startingNumber] + "\t");   // Operators, Expressions, Output
                    }
                    System.out.println();
                }
                break;                                                                          // Branching

            } else {
                System.out.println("ERROR: The starting number must be less than the ending number. Please try again.\n");
            }
        }
    }
}