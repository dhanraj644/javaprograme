package MyDataPackage;
import java.util.Scanner;

public class Student extends Person
{
	Scanner sc = new Scanner(System.in);
	String institute,degree;
	public void getStud()
	{
		//getPerson();
		System.out.println("Enter Institute name :- ");
		institute=sc.nextLine();
		System.out.println("Enter Degree :- ");
		degree=sc.nextLine();
	}
	public void putStud()
	{
		//putPerson();
		System.out.println("Institute name is :- " + institute);
		System.out.println("Degree is :- " + degree);
	}
}