package mypack;

import java.lang.Class;
import java.lang.reflect.*;

class Test
{
	private String s;
	
	public Test()
	{
		this.s="Programming languages";
	}
	
	public void method1()
	{
		System.out.println(s);
	}
	
	public void method2(int n)
	{
		System.out.println(n);
	}
	
	private void method3()
	{
		System.out.println("Private method is invoked");
	}
}

public class Ass1 
{
	public static void main(String[] args) 
	{
		try
		{
			Test test=new Test();
			Class cls=test.getClass();
			System.out.println("The name of the class is "+cls.getName());
			
			Constructor constructor=cls.getConstructor();
			System.out.println("The name of the constructor is "+constructor.getName());
			
			Method[] methods=cls.getMethods();
			for(int i=0;i<methods.length;i++)
			{
				System.out.println("Method name: "+methods[i]);
			}
			
			System.out.println("Printing the result of method 1:");
			System.out.print("The value of the string is ");
			Method methodCall1=cls.getDeclaredMethod("method1");
			methodCall1.invoke(test);
			
			System.out.println("Printing the result of method 2:");
			System.out.print("The number is ");
			Method methodCall2=cls.getDeclaredMethod("method2",int.class);
			methodCall2.invoke(test, 15);
			
			System.out.println("Printing the value of s");
			Field field=cls.getDeclaredField("s");
			field.setAccessible(true);
			System.out.println(field.get(test));
			
			System.out.println("Printing the changed value of s");
			System.out.print("The value of the string is ");
			field.set(test, "JAVA");
			methodCall1.invoke(test);
			
			System.out.println("Printing the result of method 3:");
			Method methodCall3=cls.getDeclaredMethod("method3");
			methodCall3.setAccessible(true);
			methodCall3.invoke(test);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
