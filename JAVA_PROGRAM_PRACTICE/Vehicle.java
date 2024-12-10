interface Engine
{
	void capacity();
	
}
interface Fuel
{
	void type();
}

class Car implements Engine,Fuel
{
	public void capacity()
	{
		System.out.println("CAR CAPACITY IS 800cc");
	}
	public void type()
	{
		System.out.println("CAR RUNS ON DIESEL");
	}
	
}
class Bike implements Engine,Fuel
{
	public void capacity()
	{
		System.out.println("BIKE CAPACITY IS 110cc");
	}
	public void type()
	{
		System.out.println("BIKE RUNS ON PETROL");
	}
	
}
class Vehicle
{
	public static void main(String args[])
	{
		Car ob=new Car();
		Bike obj=new Bike();
		ob.capacity();
		ob.type();
		obj.capacity();
		obj.type();
	}
}