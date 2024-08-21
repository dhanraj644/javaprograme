abstract class instrument
{
	 String name;
		
	abstract void pay();
}
abstract class Stringinstrument extends instrument
{
	 int NumberofString;	
}
class ElectricGuitar extends Stringinstrument 
{

	ElectricGuitar()
	{
	name="Guitar";
	NumberofString=6;	
	}
	
	void pay()
	{
	System.out.println("name :"+name);
	System.out.println("NumberofString :"+NumberofString);
	}
}
class gitar
{
	public static void main(String args[])
	{
	ElectricGuitar ob = new ElectricGuitar();
	ob.pay();
	}
}