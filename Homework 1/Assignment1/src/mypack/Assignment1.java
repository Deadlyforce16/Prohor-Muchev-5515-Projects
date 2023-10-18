package mypack;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		double r=Math.random();
		double min=0.0, max=100.0;
		double randomn=(double)(r*(max-min))+min;
		
		System.out.println("From 0...100, the computer picked "+randomn);
		
		int i=(int)randomn;
		char c=(char)i;
		
		System.out.println("The integer part of this number is "+i);
		System.out.println("The decimal part of this number is "+(randomn-i));
		System.out.println("Character with code: "+i+" is: "+c);
	}
}
