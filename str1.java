import java.util.Scanner;

class str1
{
public static void main(String args[])
{
	String name;

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your full name ");
	name=sc.nextLine();

	for(int i=0;i<name.length();i++)
	{
	  if(i==0 && name.charAt(i)!=' ')
		{
		  System.out.println(name.charAt(i));
		}
	
		else if( name.charAt(i) ==' ')
			{
			System.out.println(name.charAt(i+1));
			}	
	}
}
}