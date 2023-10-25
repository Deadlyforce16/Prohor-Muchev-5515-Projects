package mypack;

import java.util.Scanner;
import java.lang.Math;

public class Exercise2 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a value: ");
		double n=input.nextDouble();
		
		System.out.println("Sine: "+Math.sin(n));
		System.out.println("Cosine: "+Math.cos(n));
		System.out.println("Tangent: "+Math.tan(n));
		System.out.println("Contangent: "+1.0/Math.tan(n));
		System.out.println("Square: "+Math.pow(n, 2));
		System.out.println("Square root: "+Math.sqrt(n));
		System.out.println("Cube: "+Math.pow(n, 3));
		System.out.println("Area: "+Math.PI*n*n);
		System.out.println("PI: "+Math.PI);
		System.out.println("E: "+Math.E);
		
		input.close();
	}
}
