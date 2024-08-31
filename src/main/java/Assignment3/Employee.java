package Assignment3;

public class Employee implements Component {
    private double salary;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void printData() {
        System.out.println("First name: " + firstName + "\nLast name: " + lastName);
        System.out.println("Salary: " + salary + " €");
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Cannot add to an employee.");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Cannot remove from an employee.");
    }
    @Override
    public void printStructure() {
        System.out.println("<Employee>");
        System.out.println("  <firstName>" + firstName + "</firstName>");
        System.out.println("  <lastName>" + lastName + "</lastName>");
        System.out.println("  <salary>" + salary + "</salary>");
        System.out.println("</Employee>");
    }
}