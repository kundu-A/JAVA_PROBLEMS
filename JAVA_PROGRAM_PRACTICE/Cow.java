//DYNAMIC BINDING
class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
}
class Cow extends Animal
{
	void eat()
	{
		System.out.println("cow is eating");
	}
	public static void main(String args[])
	{
		Animal a=new Cow();
		a.eat();
	}
}