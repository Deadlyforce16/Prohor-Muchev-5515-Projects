package mypack;

//Prohor Muchev 5515

interface Dog
{
	public void bark();
	public void run();
	public void sit();
}

class Dalmatian implements Dog
{
	public void bark()
	{
		System.out.println("Dalmatian dog is barking.");
	}
	public void run()
	{
		System.out.println("Dalmation dog is running.");
	}
	public void sit()
	{
		System.out.println("A Dalmation dog is sitting.");
	}
}

class GermanShepherd implements Dog
{
	public void bark()
	{
		System.out.println("The GermanShepherd is barking.");
	}
	public void run()
	{
		System.out.println("The GermanShepherd is running.");
	}
	public void sit()
	{
		System.out.println("The GermanShepherd is sitting.");
	}
	public void guard()
	{
		System.out.println("The GermanShepherd is guarding.");
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Dalmatian d=new Dalmatian();
		GermanShepherd gs=new GermanShepherd();
		
		d.bark();
		d.run();
		d.sit();
		
		gs.bark();
		gs.run();
		gs.sit();
		gs.guard();
	}
}
