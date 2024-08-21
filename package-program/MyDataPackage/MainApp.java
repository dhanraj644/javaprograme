import MyDataPackage.Student;
import MyDataPackage.Employee;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter Student Details:");
        student.getStud();
        System.out.println("\nStudent Information:");
        student.putStud();

        Employee employee = new Employee();
        System.out.println("\nEnter Employee Details:");
        employee.getEmp();
        System.out.println("\nEmployee Information:");
        employee.putEmp();
    }
}