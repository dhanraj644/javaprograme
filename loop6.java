import java.util.Scanner;

class loop6
{
	public static void main(String args[])
	{
		int i,a=0,b=1,sum=0,n;
		Scanner sc= new Scanner(System.in);

		System.out.println("enter value n");
		n=sc.nextInt();

		for(i=0;i<=n;i++)
		{
			System.out.println(sum);
			sum=a+b;
			b=a;
			a=sum;
			
		}
	}	
		
}