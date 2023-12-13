package ass1;

import java.io.Serializable;

public class Vehicle implements Serializable 
{
	String Model;
	String Producer;
	int ProductionYear;
	
	public Vehicle() {}
	
	public void setModel(String Model)
	{
		this.Model=Model;
	}
	
	public String getModel()
	{
		return Model;
	}
	
	public void setProducer(String Producer)
	{
		this.Producer=Producer;
	}
	
	public String getProducer()
	{
		return Producer;
	}
	
	public void setProductionYear(int ProductionYear)
	{
		this.ProductionYear=ProductionYear;
	}
	
	public int getProductionYear()
	{
		return ProductionYear;
	}
}
