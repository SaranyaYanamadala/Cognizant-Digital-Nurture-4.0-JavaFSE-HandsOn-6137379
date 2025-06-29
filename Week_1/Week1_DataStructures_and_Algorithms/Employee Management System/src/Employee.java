public class Employee {
    String employeeID;
    String name;
    String position;
    double salary;

    public Employee(String employeeID, String name, String position, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeDetails() {
        return "Employee ID : " + ((this != null)? this.employeeID : "NULL") + 
                "\n Employee Name : " + ((this != null)? this.name : "NULL") + 
                "\n Employee Position : " + ((this != null)? this.position : "NULL") +
                "\n Employee Salary : " + ((this != null)? this.salary : "NULL") + "\n";
    }
}