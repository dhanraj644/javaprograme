abstract class person
{
	String name;
	String gender;

	person(String a,String b)
	{
		name=a;
		gender=b;
	}
	
	abstract void work();

	void display()
	{
	 System.out.println("name is :"+name);
	 System.out.println("gender is :"+gender);
	}
}
class Employee extends person
{
	int empid;

	 Employee(String a,String b, int c)
	 {
 	 super(a,b);
	 empid=c;	
		
	 }

	void work()
	{
		if(empid==0)
		{
		 System.out.println("Curenctly employee is not working");
		}
		else
		{
		 System.out.println("Working a employee");
		}
	}
}

class company
{
	public static void main(String args[])
	{
	 Employee ob1=new Employee("helo","male",0);
	
	 Employee ob2=new Employee("subham","male",5);
	
	ob1.display();
	ob1.work();

	ob2.display();
	ob2.work();
	}
}