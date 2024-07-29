package employeemanagement;

class Testing {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        Employee emp1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee emp2 = new Employee("E002", "Bob", "Developer", 60000);
        Employee emp3 = new Employee("E003", "Charlie", "Analyst", 50000);

        // Add Employees
        system.addEmployee(emp1);
        system.addEmployee(emp2);
        system.addEmployee(emp3);

        // Traverse Employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Search Employee
        System.out.println("\nSearch Employee with ID E002:");
        Employee foundEmployee = system.searchEmployee("E002");
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete Employee
        System.out.println("\nDelete Employee with ID E003:");
        boolean isDeleted = system.deleteEmployee("E003");
        if (isDeleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traverse Employees After Deletion
        System.out.println("\nAll Employees After Deletion:");
        system.traverseEmployees();
    }
}
