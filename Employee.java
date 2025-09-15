// Employee.java
public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    // Method to display employee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee("Franziska Waltraud", "HR Manager", 40000.0);
        Employee emp2 = new Employee("Hubertus Andrea", "Software Engineer", 60000.0);

        // Display initial employee details
        System.out.println("Employee Details:");
        emp1.display();
        emp2.display();

        // Raise salary
        System.out.println("\nAfter raising salary:");

        System.out.println("8% for 'Franziska Waltraud':");
        emp1.raiseSalary(8);  // 8% raise
        emp1.display();

        System.out.println("\n12% for 'Hubertus Andrea':");
        emp2.raiseSalary(12); // 12% raise
        emp2.display();
    }
}
