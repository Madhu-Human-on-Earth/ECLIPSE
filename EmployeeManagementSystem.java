import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private String name;
    private String designation;
    private double salary;

    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add new employee");
            System.out.println("2. Retrieve employee details");
            System.out.println("3. Update employee information");
            System.out.println("4. Remove employee");
            System.out.println("5. Display all employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    if (employeeMap.containsKey(id)) {
                        System.out.println("Employee ID already exists. Please try again.");
                        System.out.println();
                        break;
                    }

                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter employee designation: ");
                    String designation = scanner.nextLine();
                    System.out.print("Enter employee salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character

                    Employee newEmployee = new Employee(name, designation, salary);
                    employeeMap.put(id, newEmployee);

                    System.out.println("Employee added successfully.");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter employee ID: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    if (employeeMap.containsKey(searchId)) {
                        Employee employee = employeeMap.get(searchId);
                        System.out.println("Employee details:");
                        System.out.println("Name: " + employee.getName());
                        System.out.println("Designation: " + employee.getDesignation());
                        System.out.println("Salary: " + employee.getSalary());
                    } else {
                        System.out.println("Employee not found.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    if (employeeMap.containsKey(updateId)) {
                        Employee employee = employeeMap.get(updateId);

                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new designation: ");
                        String newDesignation = scanner.nextLine();
                        System.out.print("Enter new salary: ");
                        double newSalary = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline character

                        employee = new Employee(newName, newDesignation, newSalary);
                        employeeMap.put(updateId, employee);

                        System.out.println("Employee information updated successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter employee ID: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    if (employeeMap.containsKey(removeId)) {
                        employeeMap.remove(removeId);
                        System.out.println("Employee removed successfully.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("List of all employees:");
                    for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                        int empId = entry.getKey();
                        Employee emp = entry.getValue();
                        System.out.println("Employee ID: " + empId);
                        System.out.println("Name: " + emp.getName());
                        System.out.println("Designation: " + emp.getDesignation());
                        System.out.println("Salary: " + emp.getSalary());
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
                    break;
            }
        }
    }
}
