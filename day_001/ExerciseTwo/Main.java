package day1.ExerciseTwo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Rafael", "Cortes");
        Employee employee = new Employee("Louise", "del Rosario", 2000354248, "Full Stack Developer");

        System.out.println("PERSON");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName() + "\n");

        System.out.println("EMPLOYEE");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Job Title: " + employee.getJobTitle());
    }
}
