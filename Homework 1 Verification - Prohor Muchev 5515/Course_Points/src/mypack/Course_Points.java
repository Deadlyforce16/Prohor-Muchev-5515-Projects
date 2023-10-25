package mypack;

import java.util.Scanner;

public class Course_Points 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=input.nextLine();
		int l=name.length();
		char firstChar=name.charAt(0), lastChar=name.charAt(l-1);
		int sumofChar=(int)firstChar+lastChar;
		
		double m=Math.random(), f=Math.random(), a=Math.random();
		int min=0, max=100, attmin=50, attmax=100; 
		double randomM=((m*(max-min))+min), randomF=((f*(max-min))+min), randomA=((a*(attmax-attmin))+attmin);
		double Midterm=randomM,Final=randomF,Attendance=randomA;
		double Total=(double)(0.4*Midterm)+(0.4*Final)+(0.2*Attendance);
		
		System.out.println("For the midterm you have "+Midterm+" points.");
		System.out.println("For the final you have "+Final+" points.");
		System.out.println("For the attendance you have "+Attendance+" points.");
		System.out.println("For your total course you have "+Math.round(Total)+" points.");
		
		System.out.println("The first character from your name is: "+firstChar);
		System.out.println("The last character from your name is: "+lastChar);
		System.out.println("The sum of the ASCII codes for these two characters is: "+sumofChar);
	}
}
