package mypack;

import java.lang.Class;
import java.lang.reflect.*;

class Animal{}

public class Ex1 
{
	public static void main(String[] args) 
	{
		try 
		{
			Dog d1=new Dog();
			Class obj=d1.getClass();
			
			String name=obj.getName();
			System.out.println("Name: "+name);
			
			int modifier=obj.getModifiers();
			String mod=Modifier.toString(modifier);
			System.out.println("Modifier: "+mod);
			
			Class superClass=obj.getSuperclass();
			System.out.println("Superclass: "+superClass.getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
