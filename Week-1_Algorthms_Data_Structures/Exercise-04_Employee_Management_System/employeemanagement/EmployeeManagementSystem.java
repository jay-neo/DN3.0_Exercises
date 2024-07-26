package employeemanagement;

class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Add Employee
    public boolean addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            return true;
        }
        return false; // Array is full
    }

    // Search Employee by ID
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    // Traverse and Display All Employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee by ID
    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[count - 1]; // Replace with the last employee
                employees[count - 1] = null; // Remove last employee
                count--;
                return true;
            }
        }
        return false; // Employee not found
    }
}
