import java.util.Scanner;

class marks{
		
		public static void main(String args[])
			{
			 int m1,m2,m3,total;
				
			Scanner sc=new Scanner(System.in);

			System.out.println("enter marks subject 1:");
			m1=sc.nextInt();
			System.out.println("enter marks subject 2:");	
			m2=sc.nextInt();
			System.out.println("enter marks subhect 3:");
			m3=sc.nextInt();
				
			total=m1+m2+m3;
			
			System.out.println("total of marks :"+total);

				float pr=total*100/300;
				System.out.println("percentage is:"+pr);


				if(pr>80)
				{
					System.out.println("first distinction");
				}
				else if(pr>60)
				{
					System.out.println("first class");
				}
				else if(pr>50)
				{
					System.out.println("second class");
				}
				else if(pr>40)
				{
					System.out.println("pass class");
				}
				else{
					System.out.println("fail");
					}
			}
}