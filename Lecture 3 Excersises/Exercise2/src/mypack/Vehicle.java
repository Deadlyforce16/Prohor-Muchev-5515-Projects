package mypack;

class Car
{
	private String type;
	private int no_seats;
	private String fuel;
	private String body_color;
	
	Car()
	{
		type="";
		no_seats=0;
		fuel="";
		body_color="";
	}
	
	Car(String type, int seats, String fuel, String body_color)
	{
		this.type=type;
		this.no_seats=seats;
		this.fuel=fuel;
		this.body_color=body_color;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public int getNoSeats()
	{
		return no_seats;
	}
	
	public void setNoSeats(int no_seats)
	{
		this.no_seats=no_seats;
	}
	
	public String getFuel()
	{
		return fuel;
	}
	
	public void setFuel(String fuel)
	{
		this.fuel=fuel;
	}
	
	public String getBodyColor()
	{
		return body_color;
	}
	
	public void setBodyColor(String body_color)
	{
		this.body_color=body_color;
	}
	
	public void spec()
    {
        System.out.println("*************");
        System.out.println("Car: "+type);
        System.out.println("Color: "+body_color);
        System.out.println("No. of Pass.: "+no_seats);
        System.out.println("Fuel: "+fuel);
        System.out.println("*************");
    }
}

public class Vehicle 
{
	public static void main(String[] args) 
    {
        Car car1 = new Car("Fiat 500", 3, "Gasoline", "White Pearl");
        Car car2 = new Car();
        
        System.out.println("Car 1:");
        car1.spec();
        
        System.out.println("Car 2:");
        car2.spec();
        
        car2.setType("Toyota Rav 4");
        car2.setNoSeats(5);
        car2.setFuel("Diesel");
        car2.setBodyColor("Pinky");
        
        System.out.println("Car 2:");
        car2.spec();
        
        if(car1.getNoSeats() > car2.getNoSeats())
            System.out.println(car1.getType()+" has more passenger seats.");
        else if(car1.getNoSeats() < car2.getNoSeats())
            System.out.println(car2.getType()+" has more passenger seats.");
        else
            System.out.println("Both cars have the same number of passenger seats.");
    }
}