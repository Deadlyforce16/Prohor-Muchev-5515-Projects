package ass1;

import java.io.*;

public class Demo 
{
	public static void main(String[] args) 
	{
		Car car=new Car();
		car.setModel("S");
		car.setProducer("Tesla");
		car.setProductionYear(2023);
		car.setFuelCapacity(50);
		car.setCO2Emissions(20.5f);
		car.setEuroNCAP("Tesla Model S");
		
		System.out.println("Model: "+car.getModel());
		System.out.println("Procuer: "+car.getProducer());
		System.out.println("Production Year: "+car.getProductionYear());
		System.out.println("Fuel Capacity: "+car.getFuelCapacity());
		System.out.println("CO2 Emissions: "+car.getCO2Emissions());
		System.out.println("Euro NCAP: "+car.getEuroNCAP());
		
		System.out.println();
		
		try 
        {
            FileOutputStream fileOut=new FileOutputStream("Cars.txt");
            ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
            objectOut.writeObject(car);
            objectOut.close();
            fileOut.close();
            System.out.println("Object serialized and written to file Cars.txt.");
        } 
		catch(IOException e) 
        {
            e.printStackTrace();
        }
		
		Car deserializedCar=null;
        try 
        {
            FileInputStream fileIn=new FileInputStream("Cars.txt");
            ObjectInputStream objectIn=new ObjectInputStream(fileIn);
            deserializedCar=(Car) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Object deserialized from file Cars.txt.");
        } 
        catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        
        if(deserializedCar!=null)
        {
        	System.out.println("\nDeserialized Object:");
        	System.out.println("Model: "+deserializedCar.getModel());
    		System.out.println("Procuer: "+deserializedCar.getProducer());
    		System.out.println("Production Year: "+deserializedCar.getProductionYear());
    		System.out.println("Fuel Capacity: "+deserializedCar.getFuelCapacity());
    		System.out.println("CO2 Emissions: "+deserializedCar.getCO2Emissions());
    		System.out.println("Euro NCAP: "+deserializedCar.getEuroNCAP());
        }
	}
}
