package MyDataPackage;

import java.util.Scanner;

public class Employee extends Person {
    private String designation;
    private double salary;

    public void getEmp() {
        super.getPerson(); // Call the getPerson() method from the base class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Designation:");
        this.designation = scanner.nextLine();
        System.out.println("Enter Salary:");
        this.salary = scanner.nextDouble();
    }

    public void putEmp() {
        super.putPerson(); // Call the putPerson() method from the base class
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
