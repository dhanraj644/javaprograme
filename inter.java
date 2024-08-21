interface printable
{
 void print();
}
interface showable
{
  void show();	
}

class intefaceEx implements printable,showable
{
	void print()
	{
	System.out.println("hello");
	}
	
	void show()
	{
	System.out.println("welcome");
	}
}
class inter
{
	public static void main(String args[])
	{
		interfaceEx ob1=new interfaceEx();
		ob1.print();
		ob1.show();
	}
}