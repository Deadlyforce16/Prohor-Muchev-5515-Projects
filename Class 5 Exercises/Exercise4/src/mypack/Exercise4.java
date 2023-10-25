package mypack;

import java.util.Scanner;

public class Exercise4 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n=input.nextInt();
		
		System.out.println("Decimal: "+n);
		System.out.println("Binary: "+Integer.toBinaryString(n));
		System.out.println("Octal: "+Integer.toOctalString(n));
		System.out.println("Hexadecimal: "+Integer.toHexString(n));
		
		input.close();
	}
}
