import java.util.Scanner;

class cal
{
	public static void main(String srgs[])
	{
		int a,b;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter first value");
		a=s.nextInt();

		System.out.println("enter second value");
		b=s.nextInt();
		
		
		System.out.println("add two value:"+(a+b));

		System.out.println("sub two value:"+(a-b));

		System.out.println("multiply two value:"+(a*b));
		
		System.out.println("divide two values: "+(a/b));
		
		System.out.println("modules two values: "+(a%b));
		
	}
}