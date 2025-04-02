import java.util.Scanner;

public class Q69_Employee {
    String Name;
    double Salary;

    Q69_Employee() {
        Name = "Unknown";
        Salary = 0.0;
    }

    Q69_Employee(String name, double salary) {
        Scanner Employee = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        Name = Employee.nextLine();
        System.out.print("Enter Employee Salary: ");
        Salary = Employee.nextDouble();
        Employee.close();
    }

    void DisplayInfo() {
        System.out.println("Employee Name Is: " + Name);
        System.out.println("Employee Salary Is: " + Salary);
    }

    public static void main(String[] args) {
        Q69_Employee Obj = new Q69_Employee(" ", 0.0);
        Obj.DisplayInfo();

    }
}
