package day3.LaboratoryExercise;

import java.util.Scanner;

public class IOCortes {
    public static void main(String[] args) {
        // SCANNER INSTANTIATION
        Scanner scanner = new Scanner(System.in);
        
        // VARIABLE DECLARATIONS
        String firstName;
        String lastName;
        long phoneNumber;
        String emailAddress;
        char sex;
        double monthlySalary;
        String municipalityCity;
        String barangay;
        String houseStreet;
        int houseNumber;
        
        // REGISTRATION FORM
        System.out.println("Welcome to a Registration Form!");
        System.out.println("DIRECTIONS: Please fill out all required fields accurately to complete your registration.");
        
        // 10 INPUTS
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();
        
        System.out.print("Enter your phone number (+63): ");
        phoneNumber = scanner.nextLong();
        scanner.nextLine(); // used to clear the input buffer
        
        System.out.print("Enter your email address: ");
        emailAddress = scanner.nextLine();
        
        System.out.print("Enter your sex (M/F): ");
        sex = scanner.next().toUpperCase().charAt(0); // used to read the char, and convert it to uppercase
        
        System.out.print("Enter your monthly salary (PHP): ");
        monthlySalary = scanner.nextDouble();
        scanner.nextLine(); // used to clear the input buffer
        
        System.out.print("Enter your municipality / city: ");
        municipalityCity = scanner.nextLine();
        
        System.out.print("Enter your barangay: ");
        barangay = scanner.nextLine();
        
        System.out.print("Enter your house street: ");
        houseStreet = scanner.nextLine();
        
        System.out.print("Enter your house number: ");
        houseNumber = scanner.nextInt();
        
        System.out.println("Thank you for filling up the registration form! Here are the following information you provided. \n");
        
        // 10 OUTPUTS
        System.out.println("PERSONAL INFORMATION");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Sex: " + sex);
        System.out.println("Monthly Salary: PHP" + monthlySalary);
        System.out.println("Municipality / City: " + municipalityCity);
        System.out.println("Barangay: " + barangay);
        System.out.println("House Street: " + houseStreet);
        System.out.println("House Number: " + houseNumber);
        
        scanner.close();
    }
}
