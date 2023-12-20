package ass1;

import java.io.*;

public class Ass1 
{
	public static void main (String[]a)	
	{
	InputStreamReader isr = new	InputStreamReader(System.in);
	BufferedReader input = new BufferedReader(isr);
	String name = "";
	int year = 0;
	float height=0.0f,weight=0.0f;
	
	try
	{
		System.out.println("What is your name?");
		name=input.readLine();
		
		System.out.println("Which year were you born in?");
		year=Integer.parseInt(input.readLine());
		
		System.out.println("How tall (in meters) are you?");
		height=Float.parseFloat(input.readLine());
		
		System.out.println("What is your weight(in kilograms)?");
		weight=Float.parseFloat(input.readLine());
		
	}
	catch(IOException e)
	{
		System.out.println("An exception has occurred!");
	}
	
	float bmi=weight/(height*height);
	System.out.println("Your name is "+name);
	System.out.println("This year you'll turn "+(2024-year));
	System.out.println("You are "+height+"m tall");
	System.out.println("You're weight is "+weight+"kg");
	System.out.println("Your body mass index is "+bmi);
	}
}
