package Homework5;

public class Employeesalaryslip {
    String name;
    int salary;

    Employeesalaryslip(String n, int s) {
        name = n;
        salary = s;
    }

    int yearlySalary() {
        return salary * 12;
    }

    public static void main(String[] args) {
        Employeesalaryslip e = new Employeesalaryslip("Aisha", 30000);

        System.out.println("Employee: " + e.name);
        System.out.println("Monthly Salary: " + e.salary);
        System.out.println("Yearly Salary: " + e.yearlySalary());
    }
}
