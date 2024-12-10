interface Demo
{
	void food();
}
class Dog implements Demo
{
	public void food()
	{
		System.out.println("Dog eat's meat.");
	}
}
class Bird implements Demo
{
	public void food()
	{
		System.out.println("Bird eat's grass");
	}
}
class DemoInterface
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.food();
		Bird b=new Bird();
		b.food();
	}
}
