package mypack;

import java.util.Scanner;

public class Exercise3 
{
	public static void main(String[] args) 
	{
		Scanner n=new Scanner(System.in);
		Scanner y=new Scanner(System.in);
		Scanner h=new Scanner(System.in);
		
		System.out.println("Enter your name, year of birth and height(meters): ");
		String name=n.nextLine();
		int year=y.nextInt();
		double height=h.nextDouble();
		
		System.out.println("Your name: "+name);
		System.out.println("Your year of birth: "+year);
		System.out.println("Your height: "+height+"m");
		
		n.close();
		y.close();
		h.close();
	}
}
