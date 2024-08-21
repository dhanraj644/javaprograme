import java.util.Scanner;

class dollar{

		public static void main(String args[])

		{	
			double d=45.12,r;

			Scanner sc= new Scanner(System.in);

			System.out.println("enter ammount rupee");
			r=sc.nextDouble();
			
			double sum=r/d;

			System.out.println("rupee to dollar amount"+sum);
			
		}
}