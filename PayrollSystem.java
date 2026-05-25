import java.util.Scanner;
class Employee{
    int empId;
    String name;
    double basicSalary;
    double bonus;
    Employee(int empId, String name, double basicSalary, double bonus) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }
    double calculateTotalSalary() {
        return basicSalary + bonus;
    }
    void displayPayroll() {
        System.out.println("\n--- Payroll Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + calculateTotalSalary());
    }
}
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();
        Employee emp = new Employee(id, name, basic, bonus);
        emp.displayPayroll();
        sc.close();
    }
}
