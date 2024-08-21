import java.util.Scanner;

class threemax
{
	public static void main(String args[])
	{
		int a,b,c;

		Scanner sc= new Scanner(System.in);

		System.out.println("enter first value");
		a=sc.nextInt();

		System.out.println("enter second value");
		b=sc.nextInt();
		
		System.out.println("enter third value");
		c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("a is grater:"+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is grater:"+b);
		}
		else
		{
			System.out.println("c is grater:"+c);
		}
	}
}