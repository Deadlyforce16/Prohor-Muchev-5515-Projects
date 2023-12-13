package ass1;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable
{
	int FuelCapacity;
	float CO2Emissions;
	String EuroNCAP;
	
	public Car() {}
	
	public void setFuelCapacity(int FuelCapacity)
	{
		this.FuelCapacity=FuelCapacity;
	}
	
	public int getFuelCapacity()
	{
		return FuelCapacity;
	}
	
	public void setCO2Emissions(float CO2Emissions)
	{
		this.CO2Emissions=CO2Emissions;
	}
	
	public float getCO2Emissions()
	{
		return CO2Emissions;
	}
	
	public void setEuroNCAP(String EuroNCAP)
	{
		this.EuroNCAP=EuroNCAP;
	}
	
	public String getEuroNCAP()
	{
		return EuroNCAP;
	}
}
