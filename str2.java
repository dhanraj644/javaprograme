import java.util.Scanner;

class str2
{
	public static void main(String args[])
	{
	 String n1,n2;
	 Scanner sc=new Scanner (System.in);
	
	System.out.println("enter first name");
	n1=sc.nextLine();

	System.out.println("enter second name");
	n2=sc.nextLine();

	if(n1.equals(n2))
	{
	System.out.println("Wether both are equal");
	}
	else
	{
	System.out.println("wether not equal");	
	}
	}
}