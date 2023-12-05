package mypack;

//Prohor Muchev 5515

interface Flyer
{
	public void takeOff();
	public void land();
	public void fly();
}

class Airplane implements Flyer
{
	public void takeOff()
	{
		System.out.println("Airplane will take off from Skopje Airport.");
	}
	public void land()
	{
		System.out.println("Airplane has just landed at Ohrid Airport.");
	}
	public void fly()
	{
		System.out.println("Airplane flies approximately at 10000 meters above the sea-level.");
	}
}

class Bird implements Flyer
{
	public void takeOff()
	{
		System.out.println("Bird will take off from the next.");
	}
	public void land()
	{
		System.out.println("Bird has landed on the nest.");
	}
	public void fly()
	{
		System.out.println("Bird flies above the river.");
	}
	public void buildNest()
	{
		System.out.println("The Bird has built the nest.");
	}
	public void layEggs()
	{
		System.out.println("The Bird has layed eggs in the nest.");
	}
}

class Superman implements Flyer
{
	public void takeOff()
	{
		System.out.println("Superman takes off.");
	}
	public void land()
	{
		System.out.println("Superman has landed.");
	}
	public void fly()
	{
		System.out.println("Superman flies like an airplane.");
	}
	public void leapBuilding()
	{
		System.out.println("Superman leaps the building like a piece of cake.");
	}
	public void stopBullet()
	{
		System.out.println("Superman is bulletproof.");
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		Airplane a=new Airplane();
		Bird b=new Bird();
		Superman s=new Superman();
		
		a.takeOff();
		a.land();
		a.fly();
		
		b.takeOff();
		b.land();
		b.fly();
		b.buildNest();
		b.layEggs();
		
		s.takeOff();
		s.land();
		s.fly();
		s.leapBuilding();
		s.stopBullet();
	}
}
