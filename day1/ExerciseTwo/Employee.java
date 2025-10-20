package day1.ExerciseTwo;

public class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + getJobTitle();
    }
}
