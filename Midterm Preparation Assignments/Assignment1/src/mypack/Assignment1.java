package mypack;

import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter either MAX or MIN:");
		String str=s.nextLine();
		
		int[] n= {4,9,-3,1,3};
		int i,max=n[0],min=n[0];
		
		if(str.equals("MAX"))
		{
			for(i=0;i<5;i++)
			{
				if(n[i]>n[0])
				{
					max=n[i];
				}
			}
			System.out.println("The max of the entered numbers is: "+max);
		}
		
		else if(str.equals("MIN"))
		{
			for(i=0;i<5;i++)
			{
				if(n[i]<n[0]);
				{
					min=n[i];
				}
			}
			System.out.println("The min of the entered numbers is: -"+min);
		}
		
		else
		{
			System.out.println("You entered something else!");
		}
		
		s.close();
	}
}