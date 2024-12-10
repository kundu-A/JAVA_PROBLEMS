class Animal
{
	public void eat()
	{
		System.out.println("ANIMAL IS EATING.");
	}
	public void sleep()
	{
		System.out.println("ANIMAL IS SLEEPING");
	}
}
class Tiger extends Animal
{
	public void run()
	{
		System.out.println("TIGER IS RUNNING.");
	}
}
class Deer extends Animal
{
	public void run()
	{
		System.out.println("DEER IS RUNNING.");
	}
}
class Culb extends Tiger
{	
}
class HybridInheritance
{
	public static void main(String args[])
	{
		Culb c=new Culb();
		c.eat();
		c.sleep();
		c.run();
	}
}