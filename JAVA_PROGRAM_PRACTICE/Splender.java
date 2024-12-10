class Bike
{
	void run()
	{
		System.out.println("runnig");
	}
}
class Splender extends Bike
{
	void run()
	{
		System.out.println("running safely with 60km..");
	}
	public static void main(String agrs[])
	{
		Splender s=new Splender();//upcasting.
		Bike b=new Splender();
		Bike b1=new Bike();
		s.run();
		b1.run();
		b.run();
	}
}
	
		