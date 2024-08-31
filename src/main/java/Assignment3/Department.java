package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void printData() {
        System.out.println("Department: " + name);
        System.out.println("\nBEGIN: contents of " + name + ":");
        for (Component child : children) {
            child.printData();
        }
        System.out.println("END: contents of " + name + "\n");
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void remove(Component component) {
        this.children.remove(component);
    }

    public double getSalary() {
        double totalSalary = 0;
        for (Component child : children) {
            totalSalary += child.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void printStructure() {
        System.out.println("<Department>");
        System.out.println("  <name>" + name + "</name>");
        for (Component child : children) {
            child.printStructure();
        }
        System.out.println("</Department>");
    }
}