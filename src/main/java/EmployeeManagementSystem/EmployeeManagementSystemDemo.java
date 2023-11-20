package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

// Employee record
record Employee(int id, String name, double salary) {}

// EmployeeManagementSystem class
class EmployeeManagementSystem {

    public List<Employee> filterEmployeesBySalary(List<Employee> employees, double minSalary) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.salary() >= minSalary) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }

    public void displayEmployeeDetails(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.id()
                    + ", Name: " + employee.name()
                    + ", Salary: " + employee.salary());
        }
    }
}

public class EmployeeManagementSystemDemo {

    public static void main(String[] args) {
        // Instantiate EmployeeManagementSystem
        EmployeeManagementSystem empSystem = new EmployeeManagementSystem();

        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 50000.0));
        employees.add(new Employee(2, "Alice Smith", 60000.0));
        employees.add(new Employee(3, "Bob Johnson", 45000.0));

        // Filter employees by minimum salary
        double minSalary = 50000.0;
        List<Employee> filteredEmployees = empSystem.filterEmployeesBySalary(employees, minSalary);

        // Calculate total salary of all employees
        double totalSalary = empSystem.calculateTotalSalary(employees);

        // Display details of each employee
        System.out.println("Employees with a salary greater than or equal to " + minSalary + ":");
        empSystem.displayEmployeeDetails(filteredEmployees);

        System.out.println("Total salary of all employees: " + totalSalary);
    }
}

