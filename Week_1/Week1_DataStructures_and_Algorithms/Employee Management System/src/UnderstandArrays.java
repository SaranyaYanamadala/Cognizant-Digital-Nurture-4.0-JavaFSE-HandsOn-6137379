public class UnderstandArrays {
    public static void main(String[] args) {
        EmployeeManagement emp = new EmployeeManagement(5);

        // Adding new employees
        emp.addEmployee(new Employee("EMP1023", "Alice", "Manager", 75000.0));
        emp.addEmployee(new Employee("EMP4871", "Bob", "Developer", 60000.0));
        emp.addEmployee(new Employee("EMP2509", "Charlie", "Designer", 55000.0));

        // Showing all employees
        emp.getAllEmployees();

        // Deleting an employee
        System.out.println("Deleting Employee EMP4871");
        emp.deleteEmployee("EMP4871");

        // Employees after removing EMP4871
        System.out.println("Employees Remaining after deletion.\n");
        emp.getAllEmployees();

    }
}
