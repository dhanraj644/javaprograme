
class Room
{
	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	
	void set(int a,String b, float c, boolean d)
	{
	  roomNo=a;
	  roomType=b;
	  roomArea=c;
	  acMachine=d;
	}
	
	void display()
	{
	 System.out.println(" Room no. is"+roomNo);
	 System.out.println(" Room type is:"+roomType);
	 System.out.println("Room area is:"+roomArea);
	 if(acMachine==true)
		{
	  System.out.println("AC room yes needed");
		}
          else
	  	 {
		  System.out.println("AC room no needed");
	         }		
}
}
 class cust
{
	public static void main(String args[])
	{
	Room obj=new Room();
	obj.set(20,"delux",2*2,true);
	obj.display();
	}
}