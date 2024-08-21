abstract class Vehicle
{
	abstract void engine();
}
class car extends Vehicle
{
	void engine()
	{
		System.out.println("car engine");
	}
}
class callcar
{
	public static void main(String args[])
	{
	 car ob=new car();
		ob.engine();
	}
}