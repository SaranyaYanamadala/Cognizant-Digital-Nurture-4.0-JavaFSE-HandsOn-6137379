public class EmployeeManagement {
    private Employee[] employees;
    int count = 0;

    public EmployeeManagement(int size) {
        employees = new Employee[size];
    }

    public void addEmployee(Employee employee) {
        if(count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public boolean searchEmployee(String empID) {
        for(int i = 0; i < count; i++) {
            if(employees[i].employeeID == empID) {
                return true;
            }
        }

        return false;
    }

    public void deleteEmployee(String empID) {
        for(int i = 0; i < count; i++) {
            if(employees[i].employeeID == empID) {
                for(int j = i; j < count - 1; j++) {
                    employees[j] = employees[j+1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Employee Deleted.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void getAllEmployees() {
        for(Employee employee : employees) {
            if(employee != null)
                System.out.println(employee.getEmployeeDetails());
        }
    }
}
