package MyDataPackage;

import java.util.Scanner;
public class Person
{
	Scanner sc = new Scanner(System.in);
	String firstname,middlename,lastname,address;
	long ph_no;
	public void getPerson()
	{
		System.out.println("Enter First name :- ");
		firstname=sc.nextLine();
		System.out.println("Enter Middle name :- ");
		middlename=sc.nextLine();
		System.out.println("Enter Last name :- ");
		lastname=sc.nextLine();
		System.out.println("Enter Address :- ");
		address=sc.nextLine();
		System.out.println("Enter Phone No. :- ");
		ph_no=sc.nextLong();
	}
	public void putPerson()
	{
		System.out.println("First name is :- " + firstname);
		System.out.println("Middle name is :- " + middlename);
		System.out.println("Last name is :- " + lastname);
		System.out.println("Address is :- " + address);
		System.out.println("Phone No. is :- " + ph_no);
	}
}