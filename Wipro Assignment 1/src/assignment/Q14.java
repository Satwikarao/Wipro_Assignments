package assignment;

public class Q14 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Ravi", "Software Engineer", "IT");
        Employee emp2 = new Employee(102, "Sneha", "HR Executive", "HR");

        emp1.display();
        emp2.display();
    }
}

class Employee {
    private int empId;
    private String name;
    private String designation;
    private String department;

    public Employee(int empId, String name, String designation, String department) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name       : " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department : " + department);
        System.out.println("-------------------------------");
    }
}
