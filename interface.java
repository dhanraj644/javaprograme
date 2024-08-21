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
	public void print()
	{
	System.out.println("hello");
	}
	
	public void show()
	{
	System.out.println("welcome");
	}
}
class inter
{
	public static void main(String args[])
	{
		intefaceEx ob1=new intefaceEx();
		ob1.print();
		ob1.show();
	}
}