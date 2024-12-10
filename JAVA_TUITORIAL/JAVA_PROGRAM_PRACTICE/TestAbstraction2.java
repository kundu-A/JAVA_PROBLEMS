abstract class Bike
{
	Bike()
	{
		System.out.println("BIKE IS CREATED");
	}
	abstract void run();
	void ChangeGear()
	{
		System.out.println("GEAR CHANGE");
	}

}
class Honda extends Bike
{
	void run()
	{
		System.out.println("RUNNIG SAFELY");
	}
}
class TestAbstraction2
{
	public static void main(String args[])
	{
		Bike obj=new Honda();
		obj.run();
		obj.ChangeGear();
	}
}