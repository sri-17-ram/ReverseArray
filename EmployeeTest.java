class Employee {
    void calculateSalary() {
        System.out.println("Employee salary calculation");
    }
}
class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Full-time salary = ₹30000");
    }
}
class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Part-time salary = ₹16000");
    }
}
public class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(); 
        Employee e2 = new PartTimeEmployee();
        e1.calculateSalary(); 
        e2.calculateSalary(); 
    }
}
