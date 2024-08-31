package Assignment3;

public class Main {
    public static void main(String[] args) {
        // Create the departments
        Department itOrganization = new Department("IT Organization");
        Department projectDepartment = new Department("Project Department");
        Department projectTeam = new Department("Project Team");
        Department developmentDepartment = new Department("Development Department");
        Department developmentTeam = new Department("Development Team");

        // Create the employees
        Employee itLeader = new Employee("John", "Doe", 5000);

        Employee projectLeader = new Employee("Jane", "Doe", 4000);
        Employee projectDepartmentMember1 = new Employee("Richard", "Doe", 3000);
        Employee projectDepartmentMember2 = new Employee("Susan", "Doe", 3000);
        Employee projectMember1 = new Employee("Alice", "Doe", 3000);
        Employee projectMember2 = new Employee("Bob", "Doe", 3000);

        Employee developmentLeader = new Employee("Eve", "Doe", 4000);
        Employee developmentDepartmentMember1 = new Employee("Frank", "Doe", 3000);
        Employee developmentDepartmentMember2 = new Employee("Grace", "Doe", 3000);
        Employee developmentMember1 = new Employee("Charlie", "Doe", 3000);
        Employee developmentMember2 = new Employee("David", "Doe", 3000);

        // Add the employees to the departments
        itOrganization.add(itLeader);

        projectDepartment.add(projectLeader);
        projectDepartment.add(projectDepartmentMember1);
        projectDepartment.add(projectDepartmentMember2);
        projectDepartment.add(projectTeam);
        projectTeam.add(projectMember1);
        projectTeam.add(projectMember2);

        developmentDepartment.add(developmentLeader);
        developmentDepartment.add(developmentDepartmentMember1);
        developmentDepartment.add(developmentDepartmentMember2);
        developmentDepartment.add(developmentTeam);
        developmentTeam.add(developmentMember1);
        developmentTeam.add(developmentMember2);

        // Add the departments to the IT department
        itOrganization.add(projectDepartment);
        itOrganization.add(developmentDepartment);

        // Print the data
        itOrganization.printData();
        System.out.println("Total salary: " + itOrganization.getSalary() + " €\n");
        developmentDepartment.printStructure();
    }
}
