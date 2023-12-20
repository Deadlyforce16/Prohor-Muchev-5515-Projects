package ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;  

class Address
{
	String street_name;
	String street_number;
	String city;
	int zip_code;
	
	public Address(String street_name,String street_number,String city,int zip_code)
	{
		this.street_name=street_name;
		this.street_number=street_number;
		this.city=city;
		this.zip_code=zip_code;
	}
	
	public void printAllAtributes()
	{
		System.out.println("Street name: "+street_name);
		System.out.println("Street number: "+street_number);
		System.out.println("City: "+city);
		System.out.println("Zip code: "+zip_code);
	}
}

public class Demo 
{
	public static void main(String[] args) 
	{
		List<Address> addresses=new ArrayList();
		
		Address add1=new Address("Simeon","17","Skopje",21154);
		Address add2=new Address("Lenin","11th","Strumica",22363);
		Address add3=new Address("Kliment","A4","Ohrid",14324);
		Address add4=new Address("Kiril","9th","Bitola",27782);
		Address add5=new Address("Metodij","B29th","Prilep",12345);
		
		addresses.add(add1);
		addresses.add(add2);
		addresses.add(add3);
		addresses.add(add4);
		addresses.add(add5);
		
		System.out.println("All Addresses:");
		System.out.println();
		for(Address a:addresses)
		{
			a.printAllAtributes();
			System.out.println();
		}
		
		List<Address> orderedAddresses=addresses.stream().sorted((a1,a2)->a1.city.compareTo(a2.city)).collect(Collectors.toList());
		System.out.println("Addresses ordered by city:");
		System.out.println();
		for(Address a:orderedAddresses)
		{
			a.printAllAtributes();
			System.out.println();
		}
		
		Address lowest_streetn=addresses.stream().min(Comparator.comparing(add->add.street_number)).orElse(null);
		System.out.print("The street with the lowest street number value is:");
		System.out.println(lowest_streetn!=null ? lowest_streetn.street_number : "No such street number.");
		
		Address highest_streetn=addresses.stream().max(Comparator.comparing(add->add.street_number)).orElse(null);
		System.out.print("The street with the highest street number value is:");
		System.out.println(highest_streetn!=null ? highest_streetn.street_number : "No such street number.");
		
		boolean atleastOneSkopje=addresses.stream().anyMatch(add->add.city=="Skopje");
		System.out.println("Is there atleas one address with the city Skopje? "+atleastOneSkopje);
	}
}
