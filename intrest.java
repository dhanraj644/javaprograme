import java.util.Scanner;

class intrest
{
	public static void main(String args[])
	{
		double a, b, t,ci,si;

		Scanner s=new Scanner(System.in);
		System.out.println("enter principal ammount");
		a=s.nextDouble();

		System.out.println("enter rate of intrest");
		b=s.nextDouble();

		System.out.println("enter no. of years");

		t=s.nextDouble();
      /* Calculating simple interest */
		si=(a*b*t)/100;
		System.out.println("simple intrest of ::"+si);

		/* Calculating simple interest */
		ci =si*Math.pow(1.0+b/t)-1;
		System.out.println("comp intrest of ::"+ci);

				
	}
}