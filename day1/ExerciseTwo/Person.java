package day1.ExerciseTwo;

public class Person {
    /*Write a Java program to create a class known as Person with methods called getFirstName() and 
    getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and 
    overrides the getLastName() method to include the employee's job title. */

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
